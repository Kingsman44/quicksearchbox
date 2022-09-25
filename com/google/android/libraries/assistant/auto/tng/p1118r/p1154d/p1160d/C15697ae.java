package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1158c.C15689a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C66893dj;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.ae */
/* compiled from: PG */
public final /* synthetic */ class C15697ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15706an f46837a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f46838b;

    public /* synthetic */ C15697ae(C15706an anVar, C60870cx cxVar) {
        this.f46837a = anVar;
        this.f46838b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        C15706an anVar = this.f46837a;
        C60870cx cxVar = this.f46838b;
        C58833ax axVar = (C58833ax) obj;
        axVar.mo56113h();
        if (axVar.mo56113h()) {
            C67087ko koVar = (C67087ko) axVar.mo56107c();
            C62940bt r2 = C62942bv.checkIsLite(C66893dj.f181859d);
            koVar.mo58887l(r2);
            Object l = koVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj2 = r2.f169969b;
            } else {
                obj2 = r2.mo58889c(l);
            }
            C67150mx mxVar = ((C66893dj) obj2).f181862b;
            if (mxVar == null) {
                mxVar = C67150mx.f182524d;
            }
            C67152mz a = C67152mz.m97427a(mxVar.f182527b);
            if (a == null) {
                a = C67152mz.NO_ERROR;
            }
            if (a == C67152mz.NO_ERROR) {
                ((C59052c) ((C59052c) C15706an.f46852a.mo56224b()).mo56372aa(46301)).mo56386p("#startSodaService");
                return C47633f.m84733g(cxVar).mo51516i(C15693aa.f46831a, anVar.f46859h).mo51516i(new C15694ab(anVar, cxVar), anVar.f46859h);
            }
        }
        C15689a aVar = new C15689a("Error initializing Soda");
        anVar.f46863l.mo20122b(aVar);
        throw aVar;
    }
}
