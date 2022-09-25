package com.google.android.gms.auth.p10737a.p10738a;

import android.os.Parcel;
import com.google.android.gms.auth.p10737a.p10738a.p10739a.C142841a;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C142861p implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f387661a;

    public /* synthetic */ C142861p(String str) {
        this.f387661a = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f387661a;
        C142862q qVar = new C142862q((C146010af) obj2);
        C142849d dVar = (C142849d) ((C142841a) obj).mo119451G();
        Parcel gA = dVar.mo17260gA();
        C8850c.m23499h(gA, qVar);
        gA.writeString(str);
        dVar.mo17262he(14, gA);
    }
}
