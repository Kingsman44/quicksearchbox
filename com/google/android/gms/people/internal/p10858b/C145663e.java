package com.google.android.gms.people.internal.p10858b;

import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.internal.C143900ap;
import com.google.android.gms.people.internal.C145679p;

/* renamed from: com.google.android.gms.people.internal.b.e */
/* compiled from: PG */
public final class C145663e extends C145665g {

    /* renamed from: a */
    final /* synthetic */ String f393907a;

    /* renamed from: d */
    final /* synthetic */ int f393908d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145663e(C143851w wVar, String str, int i) {
        super(wVar);
        this.f393907a = str;
        this.f393908d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C143900ap r = ((C145679p) bVar).mo121727r(this, this.f393907a, this.f393908d);
        synchronized (this.f389638j) {
            this.f389644p = r;
        }
    }
}
