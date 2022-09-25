package com.google.android.gms.p10815k.p10816a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.p10815k.C144420t;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.k.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C144359aa implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C144420t f390939a;

    public /* synthetic */ C144359aa(C144420t tVar) {
        this.f390939a = tVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C144420t tVar = this.f390939a;
        C144364af afVar = new C144364af((C146010af) obj2);
        C144369ak akVar = (C144369ak) ((C144374ap) obj).mo119451G();
        byte[] byteArray = tVar.toByteArray();
        Parcel gA = akVar.mo17260gA();
        C8850c.m23499h(gA, afVar);
        gA.writeByteArray(byteArray);
        akVar.mo17262he(10, gA);
    }
}
