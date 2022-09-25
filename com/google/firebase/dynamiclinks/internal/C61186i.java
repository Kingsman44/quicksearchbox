package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.internal.C143919bh;
import com.google.firebase.C61204g;
import com.google.firebase.dynamiclinks.C61175a;
import com.google.firebase.dynamiclinks.C61177c;
import com.google.firebase.p4611d.C61174a;

/* renamed from: com.google.firebase.dynamiclinks.internal.i */
/* compiled from: PG */
public final class C61186i extends C61177c {

    /* renamed from: a */
    public final C143847s f165535a;

    /* renamed from: b */
    public final C61204g f165536b;

    public C61186i(C61204g gVar, C61174a aVar) {
        gVar.mo57770f();
        this.f165535a = new C61180c(gVar.f165555c);
        C143919bh.m233958a(gVar);
        this.f165536b = gVar;
        if (aVar.mo57687a() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    /* renamed from: d */
    public static void m93559d(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (TextUtils.isEmpty(bundle.getString("domainUriPrefix")) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    /* renamed from: a */
    public final C61175a mo57737a() {
        return new C61175a(this);
    }
}
