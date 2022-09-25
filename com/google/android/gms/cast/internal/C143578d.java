package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.internal.d */
/* compiled from: PG */
public final /* synthetic */ class C143578d implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String[] f389310a;

    public /* synthetic */ C143578d(String[] strArr) {
        this.f389310a = strArr;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String[] strArr = this.f389310a;
        C143581g gVar = new C143581g((C146010af) obj2);
        C143564ac acVar = (C143564ac) ((C143585k) obj).mo119451G();
        Parcel gA = acVar.mo17260gA();
        C8850c.m23499h(gA, gVar);
        gA.writeStringArray(strArr);
        acVar.mo17263hf(5, gA);
    }
}
