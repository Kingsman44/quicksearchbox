package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.ch */
/* compiled from: PG */
public final class C46764ch extends RuntimeException {
    public C46764ch() {
        super("Infinite fetch cycle detected. This occurs when a fetch does not produce a cache hit on the next load from local storage.");
    }
}
