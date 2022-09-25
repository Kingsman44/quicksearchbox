package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.cast.internal.C143594t;
import com.google.android.gms.cast.internal.C143600z;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.cast.w */
/* compiled from: PG */
public final /* synthetic */ class C143614w implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143354al f389386a;

    /* renamed from: b */
    public final /* synthetic */ String f389387b;

    public /* synthetic */ C143614w(C143354al alVar, String str) {
        this.f389386a = alVar;
        this.f389387b = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143354al alVar = this.f389386a;
        String str = this.f389387b;
        alVar.mo118491k();
        C143600z zVar = (C143600z) ((C143594t) obj).mo119451G();
        Parcel gA = zVar.mo17260gA();
        gA.writeString(str);
        zVar.mo17263hf(5, gA);
        synchronized (alVar.f388787i) {
            if (alVar.f388784f != null) {
                ((C146010af) obj2).f394698a.mo122507u(C143354al.m232604j(2001));
                return;
            }
            alVar.f388784f = (C146010af) obj2;
        }
    }
}
