package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public final class EntitiesObserverConfig {
    final Integer observerPriority;
    final boolean suppressNotificationIfEntityValueUnchanged;

    public EntitiesObserverConfig(boolean z, Integer num) {
        this.suppressNotificationIfEntityValueUnchanged = z;
        this.observerPriority = num;
    }

    public Integer getObserverPriority() {
        return this.observerPriority;
    }

    public boolean getSuppressNotificationIfEntityValueUnchanged() {
        return this.suppressNotificationIfEntityValueUnchanged;
    }

    public String toString() {
        boolean z = this.suppressNotificationIfEntityValueUnchanged;
        Integer num = this.observerPriority;
        return "EntitiesObserverConfig{suppressNotificationIfEntityValueUnchanged=" + z + ",observerPriority=" + num + "}";
    }
}
