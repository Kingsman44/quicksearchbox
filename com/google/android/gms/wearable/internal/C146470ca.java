package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wearable.internal.ca */
/* compiled from: PG */
public final /* synthetic */ class C146470ca implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f395672a;

    public /* synthetic */ C146470ca(String str) {
        this.f395672a = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f395672a;
        C146472cc ccVar = new C146472cc((C146010af) obj2);
        C146452bj bjVar = (C146452bj) ((C146499dc) obj).mo119451G();
        Parcel gA = bjVar.mo17260gA();
        C8850c.m23499h(gA, ccVar);
        gA.writeString(str);
        bjVar.mo17262he(67, gA);
    }
}
