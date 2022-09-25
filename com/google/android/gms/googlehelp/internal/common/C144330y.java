package com.google.android.gms.googlehelp.internal.common;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.googlehelp.internal.common.y */
/* compiled from: PG */
final class C144330y extends C144295aa {

    /* renamed from: a */
    final /* synthetic */ Bundle f390896a;

    /* renamed from: d */
    final /* synthetic */ long f390897d;

    /* renamed from: e */
    final /* synthetic */ GoogleHelp f390898e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144330y(C143851w wVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(wVar);
        this.f390896a = bundle;
        this.f390897d = j;
        this.f390898e = googleHelp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo119854j(C144302ah ahVar) {
        try {
            Bundle bundle = this.f390896a;
            long j = this.f390897d;
            GoogleHelp googleHelp = this.f390898e;
            C144329x xVar = new C144329x(this);
            Parcel gA = ahVar.mo17260gA();
            C8850c.m23497f(gA, bundle);
            gA.writeLong(j);
            C8850c.m23497f(gA, googleHelp);
            C8850c.m23499h(gA, xVar);
            ahVar.mo17263hf(8, gA);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async help psd failed!", e);
            mo119110m(C144296ab.f390830a);
        }
    }
}
