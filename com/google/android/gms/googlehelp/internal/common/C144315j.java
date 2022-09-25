package com.google.android.gms.googlehelp.internal.common;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.googlehelp.internal.common.j */
/* compiled from: PG */
final class C144315j extends C144295aa {

    /* renamed from: a */
    final /* synthetic */ Bundle f390853a;

    /* renamed from: d */
    final /* synthetic */ long f390854d;

    /* renamed from: e */
    final /* synthetic */ GoogleHelp f390855e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144315j(C143851w wVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(wVar);
        this.f390853a = bundle;
        this.f390854d = j;
        this.f390855e = googleHelp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo119854j(C144302ah ahVar) {
        try {
            Bundle bundle = this.f390853a;
            long j = this.f390854d;
            GoogleHelp googleHelp = this.f390855e;
            C144314i iVar = new C144314i(this);
            Parcel gA = ahVar.mo17260gA();
            C8850c.m23497f(gA, bundle);
            gA.writeLong(j);
            C8850c.m23497f(gA, googleHelp);
            C8850c.m23499h(gA, iVar);
            ahVar.mo17263hf(9, gA);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            mo119110m(C144296ab.f390830a);
        }
    }
}
