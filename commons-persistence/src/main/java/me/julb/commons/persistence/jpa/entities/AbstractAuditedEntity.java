/**
 * MIT License
 *
 * Copyright (c) 2017-2022 Julb
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package me.julb.commons.persistence.jpa.entities;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import me.julb.commons.validation.constraints.DateTimeISO8601;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Description of an base entity.
 * <br>
 * @author Julb.
 */
@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class AbstractAuditedEntity {

    // @formatter:off
    /**
     * The createdAt attribute.
     * -- GETTER --
     * Getter for {@link #createdAt} property.
     * @return the value.
     * -- SETTER --
     * Setter for {@link #createdAt} property.
     * @param createdAt the value to set.
     */
    // @formatter:on
    @NotNull
    @DateTimeISO8601
    private String createdAt;

    // @formatter:off
    /**
     * The lastUpdatedAt attribute.
     * -- GETTER --
     * Getter for {@link #lastUpdatedAt} property.
     * @return the value.
     * -- SETTER --
     * Setter for {@link #lastUpdatedAt} property.
     * @param lastUpdatedAt the value to set.
     */
    // @formatter:on
    @NotNull
    @DateTimeISO8601
    private String lastUpdatedAt;
}
