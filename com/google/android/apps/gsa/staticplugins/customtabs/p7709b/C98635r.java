package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.r */
/* compiled from: PG */
public final class C98635r {

    /* renamed from: a */
    public final Bundle f275487a;

    public C98635r(Bundle bundle) {
        this.f275487a = bundle;
    }

    /* renamed from: e */
    private static final boolean m163392e(Uri uri, Uri uri2) {
        if (uri == null && uri2 == null) {
            return true;
        }
        return uri != null && uri.equals(uri2);
    }

    /* renamed from: a */
    public final Uri mo91236a() {
        return (Uri) this.f275487a.getParcelable("bitmapUri");
    }

    /* renamed from: b */
    public final Uri mo91237b() {
        Uri uri = (Uri) this.f275487a.getParcelable("urlInfo");
        return uri == null ? Uri.parse(this.f275487a.getString("urlInfo")) : uri;
    }

    /* renamed from: c */
    public final String mo91238c() {
        return this.f275487a.getString("titleInfo");
    }

    /* renamed from: d */
    public final boolean mo91239d() {
        return (this.f275487a.getParcelable("bitmapUri") == null && this.f275487a.getParcelable("bitmapInfo") == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C98635r)) {
            return false;
        }
        C98635r rVar = (C98635r) obj;
        if (!m163392e(mo91236a(), rVar.mo91236a())) {
            return false;
        }
        return m163392e(mo91237b(), rVar.mo91237b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo91238c(), mo91237b(), Boolean.valueOf(mo91239d())});
    }

    public final String toString() {
        return String.format("Title (%s), Uri (%s), Screenshot (%b)", new Object[]{mo91238c(), mo91237b(), Boolean.valueOf(mo91239d())});
    }
}
