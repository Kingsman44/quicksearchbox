package com.google.android.gms.auth.p10737a.p10738a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.a.a.t */
/* compiled from: PG */
public final /* synthetic */ class C142865t implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f387666a;

    public /* synthetic */ C142865t(String str) {
        this.f387666a = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f387666a;
        C142858m mVar = (C142858m) ((C142848c) obj).mo119451G();
        C142843ab abVar = new C142843ab((C146010af) obj2);
        Parcel gA = mVar.mo17260gA();
        C8850c.m23499h(gA, abVar);
        gA.writeString(str);
        mVar.mo17262he(3, gA);
    }
}
