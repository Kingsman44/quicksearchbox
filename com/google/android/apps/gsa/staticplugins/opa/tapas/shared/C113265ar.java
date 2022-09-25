package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ar */
/* compiled from: PG */
final class C113265ar extends C113293br {

    /* renamed from: a */
    private MediaSessionCompat.Token f313637a;

    /* renamed from: b */
    private MediaDescriptionCompat f313638b;

    /* renamed from: c */
    private boolean f313639c;

    /* renamed from: d */
    private byte f313640d;

    /* renamed from: a */
    public final C113294bs mo99966a() {
        MediaSessionCompat.Token token;
        MediaDescriptionCompat mediaDescriptionCompat;
        if (this.f313640d == 1 && (token = this.f313637a) != null && (mediaDescriptionCompat = this.f313638b) != null) {
            return new C113266as(token, mediaDescriptionCompat, this.f313639c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f313637a == null) {
            sb.append(" sessionToken");
        }
        if (this.f313638b == null) {
            sb.append(" mediaDescription");
        }
        if (this.f313640d == 0) {
            sb.append(" shouldSyncWithActiveSession");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo99967b(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat != null) {
            this.f313638b = mediaDescriptionCompat;
            return;
        }
        throw new NullPointerException("Null mediaDescription");
    }

    /* renamed from: c */
    public final void mo99968c(MediaSessionCompat.Token token) {
        if (token != null) {
            this.f313637a = token;
            return;
        }
        throw new NullPointerException("Null sessionToken");
    }

    /* renamed from: d */
    public final void mo99969d(boolean z) {
        this.f313639c = z;
        this.f313640d = 1;
    }
}
