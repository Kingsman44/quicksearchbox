package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.wearable.C146408c;

/* renamed from: com.google.android.gms.wearable.internal.q */
/* compiled from: PG */
public final /* synthetic */ class C146517q implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C146408c f395714a;

    /* renamed from: b */
    public final /* synthetic */ C143784ce f395715b;

    /* renamed from: c */
    public final /* synthetic */ IntentFilter[] f395716c;

    public /* synthetic */ C146517q(C146408c cVar, C143784ce ceVar, IntentFilter[] intentFilterArr) {
        this.f395714a = cVar;
        this.f395715b = ceVar;
        this.f395716c = intentFilterArr;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C146408c cVar = this.f395714a;
        C143784ce ceVar = this.f395715b;
        IntentFilter[] intentFilterArr = this.f395716c;
        C146499dc dcVar = (C146499dc) obj;
        C146486cq cqVar = new C146486cq((C146010af) obj2);
        C146456bn bnVar = dcVar.f395684d;
        C146503dg dgVar = new C146503dg(intentFilterArr);
        dgVar.f395699c = ceVar;
        bnVar.mo123255a(dcVar, cqVar, cVar, dgVar);
    }
}
