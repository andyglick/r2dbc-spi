/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.r2dbc.spi;

/**
 * Specification of properties to be used when starting a transaction
 *
 * @see Connection#beginTransaction(TransactionDefinition)
 * @since 0.9
 */
public interface TransactionDefinition {

    /**
     * Configures the isolation level for the transaction to start.
     *
     * @return the {@link IsolationLevel} to use. Can be {@literal null} to indicate that the current isolation level should be used.
     */
    @Nullable
    IsolationLevel getIsolationLevel();

    /**
     * Returns whether the transaction should be a read-only one or read-write by returning {@code true} respective {@code false}.
     *
     * @return {@code true} to specify a read-only transaction; {@code false} for a read-write transaction. Can be {@literal null} to indicate that the current transaction mutability should be used.
     */
    Boolean isReadOnly();

}
