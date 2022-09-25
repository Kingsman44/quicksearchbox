package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.as */
/* compiled from: PG */
final class C113266as extends C113294bs {

    /* renamed from: a */
    private final MediaSessionCompat.Token f313641a;

    /* renamed from: b */
    private final MediaDescriptionCompat f313642b;

    /* renamed from: c */
    private final boolean f313643c;

    public C113266as(MediaSessionCompat.Token token, MediaDescriptionCompat mediaDescriptionCompat, boolean z) {
        this.f313641a = token;
        this.f313642b = mediaDescriptionCompat;
        this.f313643c = z;
    }

    /* renamed from: a */
    public final MediaDescriptionCompat mo99970a() {
        return this.f313642b;
    }

    /* renamed from: b */
    public final MediaSessionCompat.Token mo99971b() {
        return this.f313641a;
    }

    /* renamed from: c */
    public final boolean mo99972c() {
        return this.f313643c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113294bs) {
            C113294bs bsVar = (C113294bs) obj;
            return this.f313641a.equals(bsVar.mo99971b()) && this.f313642b.equals(bsVar.mo99970a()) && this.f313643c == bsVar.mo99972c();
        }
    }

    public final int hashCode() {
        return ((((this.f313641a.hashCode() ^ 1000003) * 1000003) ^ this.f313642b.hashCode()) * 1000003) ^ (true != this.f313643c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f313641a.toString();
        String obj2 = this.f313642b.toString();
        boolean z = this.f313643c;
        return "MediaSuggestionParams{sessionToken=" + obj + ", mediaDescription=" + obj2 + ", shouldSyncWithActiveSession=" + z + "}";
    }
}
