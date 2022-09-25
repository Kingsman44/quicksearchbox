package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.media.session.MediaSession;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.i */
/* compiled from: PG */
final class C79451i extends C79439bh {

    /* renamed from: a */
    private String f218126a;

    /* renamed from: b */
    private MediaSession.Token f218127b;

    /* renamed from: a */
    public final C79440bi mo74056a() {
        MediaSession.Token token;
        String str = this.f218126a;
        if (str != null && (token = this.f218127b) != null) {
            return new C79452j(str, token);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f218126a == null) {
            sb.append(" packageName");
        }
        if (this.f218127b == null) {
            sb.append(" mediaSessionToken");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74057b(MediaSession.Token token) {
        if (token != null) {
            this.f218127b = token;
            return;
        }
        throw new NullPointerException("Null mediaSessionToken");
    }

    /* renamed from: c */
    public final void mo74058c(String str) {
        if (str != null) {
            this.f218126a = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }
}
