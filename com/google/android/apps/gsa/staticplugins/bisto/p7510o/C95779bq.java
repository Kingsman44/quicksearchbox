package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.p10712d.C142362cn;
import com.google.android.p10712d.C142383dh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bq */
/* compiled from: PG */
public final /* synthetic */ class C95779bq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95786bx f268197a;

    /* renamed from: b */
    public final /* synthetic */ C142383dh f268198b;

    public /* synthetic */ C95779bq(C95786bx bxVar, C142383dh dhVar) {
        this.f268197a = bxVar;
        this.f268198b = dhVar;
    }

    public final void run() {
        C95786bx bxVar = this.f268197a;
        C142383dh dhVar = this.f268198b;
        bxVar.f268212f.mo83523b();
        int a = C142362cn.m231067a(dhVar.f386358c);
        boolean z = false;
        if (a != 0 && a == 2) {
            z = true;
        }
        bxVar.f268210d = z;
        C58976aa aaVar = C58975e.f156826a;
        int i = dhVar.f386357b;
        int i2 = dhVar.f386365j;
        bxVar.f268209c.mo89827a();
        if (bxVar.f268210d && !bxVar.f268209c.mo89828b(dhVar)) {
            C59104x c = C95786bx.f268207a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SbcDecoderVoiceHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15380)).mo56386p("Decoder cannot be initialized.");
        }
    }
}
