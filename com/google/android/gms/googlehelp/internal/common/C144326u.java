package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.googlehelp.C144280a;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.googlehelp.internal.common.u */
/* compiled from: PG */
final class C144326u implements C144310e {

    /* renamed from: a */
    final /* synthetic */ C144295aa f390884a;

    /* renamed from: b */
    final /* synthetic */ C144280a f390885b;

    /* renamed from: c */
    final /* synthetic */ C144189a f390886c;

    /* renamed from: d */
    final /* synthetic */ C144327v f390887d;

    /* renamed from: e */
    final /* synthetic */ C144302ah f390888e;

    public C144326u(C144327v vVar, C144302ah ahVar, C144295aa aaVar, C144280a aVar, C144189a aVar2) {
        this.f390887d = vVar;
        this.f390888e = ahVar;
        this.f390884a = aaVar;
        this.f390885b = aVar;
        this.f390886c = aVar2;
    }

    /* renamed from: a */
    public final void mo119850a(GoogleHelp googleHelp) {
        C144327v vVar = this.f390887d;
        InProductHelp inProductHelp = vVar.f390889a;
        inProductHelp.f390777a = googleHelp;
        try {
            C144302ah ahVar = this.f390888e;
            C144328w wVar = new C144328w(vVar.f390890d, this.f390884a, this.f390885b, this.f390886c);
            Parcel gA = ahVar.mo17260gA();
            C8850c.m23497f(gA, inProductHelp);
            C8850c.m23497f(gA, (Parcelable) null);
            C8850c.m23499h(gA, wVar);
            ahVar.mo17262he(17, gA);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            this.f390887d.mo119110m(C144296ab.f390830a);
        }
    }
}
