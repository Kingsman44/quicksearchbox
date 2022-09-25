package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public final class ResourceStatus {
    final String identifier;
    final StatusInResponse status;

    public ResourceStatus(String str, StatusInResponse statusInResponse) {
        this.identifier = str;
        this.status = statusInResponse;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public StatusInResponse getStatus() {
        return this.status;
    }

    public String toString() {
        String str = this.identifier;
        String valueOf = String.valueOf(this.status);
        return "ResourceStatus{identifier=" + str + ",status=" + valueOf + "}";
    }
}
