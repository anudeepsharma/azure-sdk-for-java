/**
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.implementation.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Attributes model.
 */
public class Attributes {
    /**
     * Determines whether the object is enabled.
     */
    private Boolean enabled;

    /**
     * Not before date in UTC.
     */
    @JsonProperty(value = "nbf")
    private Long notBefore;

    /**
     * Expiry date in UTC.
     */
    @JsonProperty(value = "exp")
    private Long expires;

    /**
     * Creation time in UTC.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long created;

    /**
     * Last updated time in UTC.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long updated;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the Attributes object itself.
     */
    public Attributes withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the notBefore value.
     *
     * @return the notBefore value
     */
    public Long notBefore() {
        return this.notBefore;
    }

    /**
     * Set the notBefore value.
     *
     * @param notBefore the notBefore value to set
     * @return the Attributes object itself.
     */
    public Attributes withNotBefore(Long notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * Get the expires value.
     *
     * @return the expires value
     */
    public Long expires() {
        return this.expires;
    }

    /**
     * Set the expires value.
     *
     * @param expires the expires value to set
     * @return the Attributes object itself.
     */
    public Attributes withExpires(Long expires) {
        this.expires = expires;
        return this;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public Long created() {
        return this.created;
    }

    /**
     * Get the updated value.
     *
     * @return the updated value
     */
    public Long updated() {
        return this.updated;
    }

}
