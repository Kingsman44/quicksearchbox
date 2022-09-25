package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.gsa.shared.bisto.p7029b.C89640k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bw */
/* compiled from: PG */
public final /* synthetic */ class C95785bw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95786bx f268205a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f268206b;

    public /* synthetic */ C95785bw(C95786bx bxVar, C58833ax axVar) {
        this.f268205a = bxVar;
        this.f268206b = axVar;
    }

    public final void run() {
        C95786bx bxVar = this.f268205a;
        C58833ax axVar = this.f268206b;
        if (!bxVar.f268210d || bxVar.f268209c.f268440c.get()) {
            synchronized (bxVar) {
                if (bxVar.f268211e != null) {
                    if (bxVar.f268211e.size() != 0) {
                        byte[] byteArray = bxVar.f268211e.toByteArray();
                        bxVar.f268211e.reset();
                        bxVar.f268212f.mo83526e(byteArray);
                        if (bxVar.f268210d) {
                            byteArray = bxVar.f268209c.mo89829c(byteArray);
                        }
                        bxVar.f268213g.mo89668a();
                        ((C95802ch) axVar.mo56107c()).mo89728a(byteArray);
                        bxVar.f268212f.mo83525d(C89640k.f242719a, byteArray);
                        return;
                    }
                }
                C59104x c = C95786bx.f268207a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SbcDecoderVoiceHandler");
                ((C59052c) ((C59052c) c).mo56372aa(15376)).mo56386p("Why isn't there any work to do?");
                return;
            }
        }
        C59104x c2 = C95786bx.f268207a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "SbcDecoderVoiceHandler");
        ((C59052c) ((C59052c) c2).mo56372aa(15377)).mo56386p("Ignore compressed voice data because decoder not initialized.");
    }
}
