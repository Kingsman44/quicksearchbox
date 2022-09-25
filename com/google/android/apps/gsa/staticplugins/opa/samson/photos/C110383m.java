package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.m */
/* compiled from: PG */
public final class C110383m extends C110312a {

    /* renamed from: a */
    private final C58833ax f307649a;

    /* renamed from: b */
    private final String f307650b;

    public C110383m(C58833ax axVar, String str) {
        this.f307649a = axVar;
        if (str != null) {
            this.f307650b = str;
            return;
        }
        throw new NullPointerException("Null photoContainerId");
    }

    /* renamed from: b */
    public final C58833ax mo98566b() {
        return this.f307649a;
    }

    /* renamed from: c */
    public final String mo98567c() {
        return this.f307650b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C110312a) {
            C110312a aVar = (C110312a) obj;
            return this.f307649a.equals(aVar.mo98566b()) && this.f307650b.equals(aVar.mo98567c());
        }
    }

    public final int hashCode() {
        return ((this.f307649a.hashCode() ^ 1000003) * 1000003) ^ this.f307650b.hashCode();
    }

    public final String toString() {
        String obj = this.f307649a.toString();
        String str = this.f307650b;
        return "AlbumKey{albumId=" + obj + ", photoContainerId=" + str + "}";
    }
}
