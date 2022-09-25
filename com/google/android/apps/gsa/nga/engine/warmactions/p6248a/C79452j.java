package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.media.session.MediaSession;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.j */
/* compiled from: PG */
final class C79452j extends C79440bi {

    /* renamed from: a */
    private final String f218128a;

    /* renamed from: b */
    private final MediaSession.Token f218129b;

    public C79452j(String str, MediaSession.Token token) {
        this.f218128a = str;
        this.f218129b = token;
    }

    /* renamed from: a */
    public final MediaSession.Token mo74060a() {
        return this.f218129b;
    }

    /* renamed from: b */
    public final String mo74061b() {
        return this.f218128a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79440bi) {
            C79440bi biVar = (C79440bi) obj;
            return this.f218128a.equals(biVar.mo74061b()) && this.f218129b.equals(biVar.mo74060a());
        }
    }

    public final int hashCode() {
        return ((this.f218128a.hashCode() ^ 1000003) * 1000003) ^ this.f218129b.hashCode();
    }

    public final String toString() {
        String str = this.f218128a;
        String obj = this.f218129b.toString();
        return "MediaSessionKey{packageName=" + str + ", mediaSessionToken=" + obj + "}";
    }
}
