package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.bt */
/* compiled from: PG */
final class C72487bt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener f192862a;

    /* renamed from: b */
    final /* synthetic */ int f192863b;

    public C72487bt(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        this.f192862a = versionSafeCallbacks$UrlRequestStatusListener;
        this.f192863b = i;
    }

    public final void run() {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = this.f192862a;
        versionSafeCallbacks$UrlRequestStatusListener.f192770a.onStatus(this.f192863b);
    }
}
