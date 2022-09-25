package com.google.android.gms.p10815k.p10816a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.k.a.i */
/* compiled from: PG */
public final /* synthetic */ class C144384i implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C144376ar f390962a;

    public /* synthetic */ C144384i(C144376ar arVar) {
        this.f390962a = arVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C144376ar arVar = this.f390962a;
        C144390o oVar = new C144390o((C146010af) obj2);
        C144369ak akVar = (C144369ak) ((C144374ap) obj).mo119451G();
        String packageName = arVar.f389931w.getPackageName();
        Parcel gA = akVar.mo17260gA();
        C8850c.m23499h(gA, oVar);
        gA.writeString(packageName);
        akVar.mo17262he(2, gA);
    }
}
