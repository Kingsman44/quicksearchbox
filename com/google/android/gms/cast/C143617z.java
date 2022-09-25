package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143594t;
import com.google.android.gms.cast.internal.C143600z;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.z */
/* compiled from: PG */
public final /* synthetic */ class C143617z implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143354al f389390a;

    /* renamed from: b */
    public final /* synthetic */ String f389391b;

    /* renamed from: c */
    public final /* synthetic */ String f389392c;

    public /* synthetic */ C143617z(C143354al alVar, String str, String str2) {
        this.f389390a = alVar;
        this.f389391b = str;
        this.f389392c = str2;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143354al alVar = this.f389390a;
        String str = this.f389391b;
        String str2 = this.f389392c;
        alVar.mo118491k();
        C143600z zVar = (C143600z) ((C143594t) obj).mo119451G();
        Parcel gA = zVar.mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23497f(gA, (Parcelable) null);
        zVar.mo17263hf(14, gA);
        alVar.mo118493m((C146010af) obj2);
    }
}
