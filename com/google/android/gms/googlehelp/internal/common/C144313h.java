package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.googlehelp.C144280a;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.googlehelp.internal.common.h */
/* compiled from: PG */
final class C144313h implements C144310e {

    /* renamed from: a */
    final /* synthetic */ C144295aa f390847a;

    /* renamed from: b */
    final /* synthetic */ C144280a f390848b;

    /* renamed from: c */
    final /* synthetic */ C144189a f390849c;

    /* renamed from: d */
    final /* synthetic */ C144324s f390850d;

    /* renamed from: e */
    final /* synthetic */ C144302ah f390851e;

    public C144313h(C144324s sVar, C144302ah ahVar, C144295aa aaVar, C144280a aVar, C144189a aVar2) {
        this.f390850d = sVar;
        this.f390851e = ahVar;
        this.f390847a = aaVar;
        this.f390848b = aVar;
        this.f390849c = aVar2;
    }

    /* renamed from: a */
    public final void mo119850a(GoogleHelp googleHelp) {
        try {
            C144302ah ahVar = this.f390851e;
            C144324s sVar = this.f390850d;
            C144295aa aaVar = this.f390847a;
            C144325t tVar = new C144325t(sVar.f390877a, sVar.f390878d, aaVar, this.f390848b, this.f390849c);
            Parcel gA = ahVar.mo17260gA();
            C8850c.m23497f(gA, googleHelp);
            C8850c.m23497f(gA, (Parcelable) null);
            C8850c.m23499h(gA, tVar);
            ahVar.mo17262he(2, gA);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            this.f390850d.mo119110m(C144296ab.f390830a);
        }
    }
}
