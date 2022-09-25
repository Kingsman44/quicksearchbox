package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.wearable.internal.C146457bo;
import com.google.android.gms.wearable.internal.C146460br;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.nf */
/* compiled from: PG */
public final /* synthetic */ class C96426nf implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C96428nh f269750a;

    /* renamed from: b */
    public final /* synthetic */ String f269751b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f269752c;

    public /* synthetic */ C96426nf(C96428nh nhVar, String str, byte[] bArr) {
        this.f269750a = nhVar;
        this.f269751b = str;
        this.f269752c = bArr;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C96428nh nhVar = this.f269750a;
        String str = this.f269751b;
        byte[] bArr = this.f269752c;
        C143851w wVar = nhVar.f269755b.f389929D;
        C146457bo boVar = new C146457bo(wVar, str, bArr);
        wVar.mo119159d(boVar);
        C146006ab c = C143918bg.m233957c(boVar, C146460br.f395662a);
        C146014aj ajVar = (C146014aj) c;
        ajVar.mo122495n(C146013ai.f394700a, new C96413mt(cVar));
        ajVar.mo122494m(C146013ai.f394700a, new C96414mu(cVar));
        return c;
    }
}
