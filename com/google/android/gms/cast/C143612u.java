package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.cast.internal.C143594t;
import com.google.android.gms.cast.internal.C143600z;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.u */
/* compiled from: PG */
public final /* synthetic */ class C143612u implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143354al f389380a;

    /* renamed from: b */
    public final /* synthetic */ String f389381b;

    /* renamed from: c */
    public final /* synthetic */ LaunchOptions f389382c;

    public /* synthetic */ C143612u(C143354al alVar, String str, LaunchOptions launchOptions) {
        this.f389380a = alVar;
        this.f389381b = str;
        this.f389382c = launchOptions;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143354al alVar = this.f389380a;
        String str = this.f389381b;
        LaunchOptions launchOptions = this.f389382c;
        alVar.mo118491k();
        C143600z zVar = (C143600z) ((C143594t) obj).mo119451G();
        Parcel gA = zVar.mo17260gA();
        gA.writeString(str);
        C8850c.m23497f(gA, launchOptions);
        zVar.mo17263hf(13, gA);
        alVar.mo118493m((C146010af) obj2);
    }
}
