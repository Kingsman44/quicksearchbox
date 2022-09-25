package com.google.android.gms.p10815k.p10816a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.k.a.h */
/* compiled from: PG */
public final /* synthetic */ class C144383h implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C144376ar f390960a;

    /* renamed from: b */
    public final /* synthetic */ C144371am f390961b;

    public /* synthetic */ C144383h(C144376ar arVar, C144371am amVar) {
        this.f390960a = arVar;
        this.f390961b = amVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C144376ar arVar = this.f390960a;
        C144371am amVar = this.f390961b;
        C144391p pVar = new C144391p((C146010af) obj2);
        C144369ak akVar = (C144369ak) ((C144374ap) obj).mo119451G();
        String packageName = arVar.f389931w.getPackageName();
        Parcel gA = akVar.mo17260gA();
        C8850c.m23499h(gA, pVar);
        gA.writeString(packageName);
        C8850c.m23499h(gA, amVar);
        akVar.mo17262he(1, gA);
    }
}
