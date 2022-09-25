package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.wearable.C146413h;

/* renamed from: com.google.android.gms.wearable.internal.ae */
/* compiled from: PG */
public final /* synthetic */ class C146420ae implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C146413h f395644a;

    /* renamed from: b */
    public final /* synthetic */ C143784ce f395645b;

    /* renamed from: c */
    public final /* synthetic */ IntentFilter[] f395646c;

    public /* synthetic */ C146420ae(C146413h hVar, C143784ce ceVar, IntentFilter[] intentFilterArr) {
        this.f395644a = hVar;
        this.f395645b = ceVar;
        this.f395646c = intentFilterArr;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C146413h hVar = this.f395644a;
        C143784ce ceVar = this.f395645b;
        IntentFilter[] intentFilterArr = this.f395646c;
        C146499dc dcVar = (C146499dc) obj;
        C146486cq cqVar = new C146486cq((C146010af) obj2);
        C146456bn bnVar = dcVar.f395682b;
        C146503dg dgVar = new C146503dg(intentFilterArr);
        dgVar.f395697a = ceVar;
        bnVar.mo123255a(dcVar, cqVar, hVar, dgVar);
    }
}
