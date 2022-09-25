package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.ab */
/* compiled from: PG */
final class C72442ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener f192786a;

    public C72442ab(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener) {
        this.f192786a = versionSafeCallbacks$UrlRequestStatusListener;
    }

    public final void run() {
        this.f192786a.f192770a.onStatus(-1);
    }
}
