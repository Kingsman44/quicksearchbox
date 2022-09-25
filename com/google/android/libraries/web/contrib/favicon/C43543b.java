package com.google.android.libraries.web.contrib.favicon;

import android.graphics.Bitmap;

/* renamed from: com.google.android.libraries.web.contrib.favicon.b */
/* compiled from: PG */
public final class C43543b extends C43545d {

    /* renamed from: a */
    private final Bitmap f113703a;

    public C43543b(Bitmap bitmap) {
        this.f113703a = bitmap;
    }

    /* renamed from: a */
    public final int mo46599a() {
        return 3;
    }

    /* renamed from: b */
    public final Bitmap mo46603b() {
        return this.f113703a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C43550i) {
            C43550i iVar = (C43550i) obj;
            if (iVar.mo46599a() != 3 || !this.f113703a.equals(iVar.mo46603b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f113703a.hashCode();
    }

    public final String toString() {
        String obj = this.f113703a.toString();
        return "FaviconState{faviconReceived=" + obj + "}";
    }
}
