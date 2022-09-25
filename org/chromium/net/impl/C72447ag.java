package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.ag */
/* compiled from: PG */
final class C72447ag implements Runnable {

    /* renamed from: a */
    final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener f192793a;

    /* renamed from: b */
    final /* synthetic */ int f192794b;

    public C72447ag(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        this.f192793a = versionSafeCallbacks$UrlRequestStatusListener;
        this.f192794b = i;
    }

    public final void run() {
        int i;
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = this.f192793a;
        switch (this.f192794b) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 9;
                break;
            case 11:
                i = 10;
                break;
            case 12:
                i = 11;
                break;
            case 13:
                i = 12;
                break;
            case 14:
                i = 13;
                break;
            case 15:
                i = 14;
                break;
            default:
                throw new IllegalArgumentException("No request status found.");
        }
        versionSafeCallbacks$UrlRequestStatusListener.f192770a.onStatus(i);
    }
}
