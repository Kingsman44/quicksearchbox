package com.google.android.gms.p10815k.p10816a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.k.a.b */
/* compiled from: PG */
public final /* synthetic */ class C144377b implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f390953a;

    /* renamed from: b */
    public final /* synthetic */ String f390954b;

    public /* synthetic */ C144377b(String str, String str2) {
        this.f390953a = str;
        this.f390954b = str2;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f390953a;
        String str2 = this.f390954b;
        C144391p pVar = new C144391p((C146010af) obj2);
        C144369ak akVar = (C144369ak) ((C144374ap) obj).mo119451G();
        Parcel gA = akVar.mo17260gA();
        C8850c.m23499h(gA, pVar);
        gA.writeString(str);
        gA.writeString(str2);
        akVar.mo17262he(4, gA);
    }
}
