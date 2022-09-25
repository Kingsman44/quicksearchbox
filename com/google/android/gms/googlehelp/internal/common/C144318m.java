package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21598j;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.googlehelp.internal.common.m */
/* compiled from: PG */
public final /* synthetic */ class C144318m implements C144310e {

    /* renamed from: a */
    public final /* synthetic */ C144320o f390861a;

    /* renamed from: b */
    public final /* synthetic */ SupportRequestHelp f390862b;

    /* renamed from: c */
    public final /* synthetic */ C144305ak f390863c;

    /* renamed from: d */
    public final /* synthetic */ C21598j f390864d;

    /* renamed from: e */
    public final /* synthetic */ C144302ah f390865e;

    public /* synthetic */ C144318m(C144320o oVar, SupportRequestHelp supportRequestHelp, C144302ah ahVar, C144305ak akVar, C21598j jVar) {
        this.f390861a = oVar;
        this.f390862b = supportRequestHelp;
        this.f390865e = ahVar;
        this.f390863c = akVar;
        this.f390864d = jVar;
    }

    /* renamed from: a */
    public final void mo119850a(GoogleHelp googleHelp) {
        C144320o oVar = this.f390861a;
        SupportRequestHelp supportRequestHelp = this.f390862b;
        C144302ah ahVar = this.f390865e;
        C144305ak akVar = this.f390863c;
        C21598j jVar = this.f390864d;
        supportRequestHelp.f390789a = googleHelp;
        try {
            Parcel gA = ahVar.mo17260gA();
            C8850c.m23497f(gA, supportRequestHelp);
            C8850c.m23499h(gA, akVar);
            ahVar.mo17263hf(15, gA);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Chat support request failed!", e);
            jVar.f59975a.mo87497a();
            oVar.mo119110m(C144296ab.f390830a);
        }
    }
}
