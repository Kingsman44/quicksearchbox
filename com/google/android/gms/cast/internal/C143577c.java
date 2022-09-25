package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.internal.c */
/* compiled from: PG */
public final /* synthetic */ class C143577c implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String[] f389309a;

    public /* synthetic */ C143577c(String[] strArr) {
        this.f389309a = strArr;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String[] strArr = this.f389309a;
        C143582h hVar = new C143582h((C146010af) obj2);
        C143564ac acVar = (C143564ac) ((C143585k) obj).mo119451G();
        Parcel gA = acVar.mo17260gA();
        C8850c.m23499h(gA, hVar);
        gA.writeStringArray(strArr);
        acVar.mo17263hf(6, gA);
    }
}
