package com.google.android.gms.p10815k.p10816a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.k.a.u */
/* compiled from: PG */
public final /* synthetic */ class C144396u implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C144376ar f390974a;

    /* renamed from: b */
    public final /* synthetic */ C144373ao f390975b;

    public /* synthetic */ C144396u(C144376ar arVar, C144373ao aoVar) {
        this.f390974a = arVar;
        this.f390975b = aoVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C144376ar arVar = this.f390974a;
        C144373ao aoVar = this.f390975b;
        C144364af afVar = new C144364af((C146010af) obj2);
        C144369ak akVar = (C144369ak) ((C144374ap) obj).mo119451G();
        String packageName = arVar.f389931w.getPackageName();
        Parcel gA = akVar.mo17260gA();
        C8850c.m23499h(gA, afVar);
        gA.writeString(packageName);
        C8850c.m23499h(gA, aoVar);
        akVar.mo17262he(7, gA);
    }
}
