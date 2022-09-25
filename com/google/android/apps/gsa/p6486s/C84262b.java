package com.google.android.apps.gsa.p6486s;

import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: com.google.android.apps.gsa.s.b */
/* compiled from: PG */
public final class C84262b extends C84268h {

    /* renamed from: a */
    private final String f229310a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f229311b;

    /* renamed from: c */
    private final int f229312c;

    public C84262b(String str, MediaSessionCompat.Token token, int i) {
        this.f229310a = str;
        this.f229311b = token;
        this.f229312c = i;
    }

    /* renamed from: a */
    public final int mo77748a() {
        return this.f229312c;
    }

    /* renamed from: b */
    public final MediaSessionCompat.Token mo77749b() {
        return this.f229311b;
    }

    /* renamed from: c */
    public final String mo77750c() {
        return this.f229310a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84268h) {
            C84268h hVar = (C84268h) obj;
            return this.f229310a.equals(hVar.mo77750c()) && this.f229311b.equals(hVar.mo77749b()) && this.f229312c == hVar.mo77748a();
        }
    }

    public final int hashCode() {
        return ((((this.f229310a.hashCode() ^ 1000003) * 1000003) ^ this.f229311b.hashCode()) * 1000003) ^ this.f229312c;
    }

    public final String toString() {
        String str = this.f229310a;
        String obj = this.f229311b.toString();
        int i = this.f229312c;
        return "MediaSessionInfo{mediaSessionType=" + str + ", mediaSessionToken=" + obj + ", currentMediaItemIndex=" + i + "}";
    }
}
