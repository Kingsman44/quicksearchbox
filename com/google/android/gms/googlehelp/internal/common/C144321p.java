package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21597i;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.googlehelp.internal.common.p */
/* compiled from: PG */
public final /* synthetic */ class C144321p implements C144310e {

    /* renamed from: a */
    public final /* synthetic */ C144323r f390869a;

    /* renamed from: b */
    public final /* synthetic */ SupportRequestHelp f390870b;

    /* renamed from: c */
    public final /* synthetic */ C144305ak f390871c;

    /* renamed from: d */
    public final /* synthetic */ C21597i f390872d;

    /* renamed from: e */
    public final /* synthetic */ C144302ah f390873e;

    public /* synthetic */ C144321p(C144323r rVar, SupportRequestHelp supportRequestHelp, C144302ah ahVar, C144305ak akVar, C21597i iVar) {
        this.f390869a = rVar;
        this.f390870b = supportRequestHelp;
        this.f390873e = ahVar;
        this.f390871c = akVar;
        this.f390872d = iVar;
    }

    /* renamed from: a */
    public final void mo119850a(GoogleHelp googleHelp) {
        C144323r rVar = this.f390869a;
        SupportRequestHelp supportRequestHelp = this.f390870b;
        C144302ah ahVar = this.f390873e;
        C144305ak akVar = this.f390871c;
        C21597i iVar = this.f390872d;
        supportRequestHelp.f390789a = googleHelp;
        try {
            Parcel gA = ahVar.mo17260gA();
            C8850c.m23497f(gA, supportRequestHelp);
            C8850c.m23499h(gA, akVar);
            ahVar.mo17263hf(16, gA);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Click-to-call (C2C) support request failed!", e);
            iVar.f59974a.mo87496a();
            rVar.mo119110m(C144296ab.f390830a);
        }
    }
}
