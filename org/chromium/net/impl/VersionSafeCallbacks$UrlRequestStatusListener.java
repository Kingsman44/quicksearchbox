package org.chromium.net.impl;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
public final class VersionSafeCallbacks$UrlRequestStatusListener extends UrlRequest.StatusListener {

    /* renamed from: a */
    public final UrlRequest.StatusListener f192770a;

    public VersionSafeCallbacks$UrlRequestStatusListener(UrlRequest.StatusListener statusListener) {
        this.f192770a = statusListener;
    }

    public final void onStatus(int i) {
        this.f192770a.onStatus(i);
    }
}
