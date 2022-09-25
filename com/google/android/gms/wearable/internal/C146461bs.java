package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96201ex;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.wearable.internal.bs */
/* compiled from: PG */
public final /* synthetic */ class C146461bs implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143784ce f395663a;

    /* renamed from: b */
    public final /* synthetic */ IntentFilter[] f395664b;

    /* renamed from: c */
    public final /* synthetic */ C96201ex f395665c;

    public /* synthetic */ C146461bs(C96201ex exVar, C143784ce ceVar, IntentFilter[] intentFilterArr) {
        this.f395665c = exVar;
        this.f395663a = ceVar;
        this.f395664b = intentFilterArr;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C96201ex exVar = this.f395665c;
        C143784ce ceVar = this.f395663a;
        IntentFilter[] intentFilterArr = this.f395664b;
        C146499dc dcVar = (C146499dc) obj;
        C146486cq cqVar = new C146486cq((C146010af) obj2);
        C146456bn bnVar = dcVar.f395683c;
        C146503dg dgVar = new C146503dg(intentFilterArr);
        dgVar.f395698b = ceVar;
        bnVar.mo123255a(dcVar, cqVar, exVar, dgVar);
    }
}
