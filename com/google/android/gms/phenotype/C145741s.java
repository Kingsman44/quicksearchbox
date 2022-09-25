package com.google.android.gms.phenotype;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.phenotype.p10859a.C145703c;
import com.google.android.gms.phenotype.p10859a.C145715o;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.phenotype.s */
/* compiled from: PG */
public final /* synthetic */ class C145741s implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f394069a;

    public /* synthetic */ C145741s(String str) {
        this.f394069a = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f394069a;
        C145747y yVar = new C145747y((C146010af) obj2);
        C145703c cVar = (C145703c) ((C145715o) obj).mo119451G();
        Parcel gA = cVar.mo17260gA();
        C8850c.m23499h(gA, yVar);
        gA.writeString(str);
        gA.writeString((String) null);
        cVar.mo17262he(6, gA);
    }
}
