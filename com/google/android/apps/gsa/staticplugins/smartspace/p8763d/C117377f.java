package com.google.android.apps.gsa.staticplugins.smartspace.p8763d;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83763f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.d.f */
/* compiled from: PG */
final class C117377f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f325846a;

    /* renamed from: b */
    final /* synthetic */ long f325847b;

    /* renamed from: c */
    final /* synthetic */ long f325848c;

    /* renamed from: d */
    final /* synthetic */ long f325849d;

    /* renamed from: e */
    final /* synthetic */ C117378g f325850e;

    public C117377f(C117378g gVar, long j, long j2, long j3, long j4) {
        this.f325850e = gVar;
        this.f325846a = j;
        this.f325847b = j2;
        this.f325848c = j3;
        this.f325849d = j4;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) this.f325850e.f325853c.mo56226d()).mo56372aa(33104)).mo56386p("Failed to get current displayed calendar, and skipped the display latency logging.");
        this.f325850e.mo103286f(this.f325846a, this.f325849d);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C83763f fVar = (C83763f) obj;
        if (fVar.f228308b != this.f325846a) {
            long a = this.f325847b - this.f325850e.mo103281a();
            long j = fVar.f228309c;
            if (a < j) {
                a = j;
            }
            C117378g gVar = this.f325850e;
            gVar.f325852b.mo109914al(this.f325848c - a, gVar.f325851a.mo77175m(), false);
            this.f325850e.mo103286f(this.f325846a, this.f325849d);
        }
    }
}
