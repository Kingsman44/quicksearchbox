package com.google.apps.tiktok.dataservice.local;

/* renamed from: com.google.apps.tiktok.dataservice.local.g */
/* compiled from: PG */
public final class C46853g extends RuntimeException {
    public C46853g(Throwable th) {
        super("A LocalSubscriptionCallbacks didn't handle an error. It must either catch the error and pass it as part of onLoaded(), or register an error handler in onLoadError().", th);
    }
}
