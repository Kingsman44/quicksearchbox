package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import android.net.Uri;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.a */
/* compiled from: PG */
final class C84569a extends C84577d {

    /* renamed from: a */
    private final Uri f230152a;

    public C84569a(Uri uri) {
        this.f230152a = uri;
    }

    /* renamed from: a */
    public final Uri mo78323a() {
        return this.f230152a;
    }

    /* renamed from: b */
    public final C84573ad mo78324b() {
        return C84573ad.EARCON;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C84574ae) {
            C84574ae aeVar = (C84574ae) obj;
            if (C84573ad.EARCON != aeVar.mo78324b() || !this.f230152a.equals(aeVar.mo78323a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f230152a.hashCode();
    }

    public final String toString() {
        String obj = this.f230152a.toString();
        return "Utterance{earcon=" + obj + "}";
    }
}
