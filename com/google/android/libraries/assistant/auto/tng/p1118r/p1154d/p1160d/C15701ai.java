package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67083kk;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67148mv;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.ai */
/* compiled from: PG */
public final /* synthetic */ class C15701ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15704al f46845a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f46846b;

    public /* synthetic */ C15701ai(C15704al alVar, C67087ko koVar) {
        this.f46845a = alVar;
        this.f46846b = koVar;
    }

    public final void run() {
        Object obj;
        C15704al alVar = this.f46845a;
        C67087ko koVar = this.f46846b;
        alVar.f46850b.mo54591h(koVar);
        if ((koVar.f182368a & C89885b.HTTP_VALUE) != 0) {
            if (alVar.f46851c.f46862k.mo56113h()) {
                alVar.f46851c.f46859h.execute(C47810es.m84977q(new C15699ag(alVar, koVar)));
            } else {
                ((C59052c) ((C59052c) alVar.f46849a.mo56226d()).mo56372aa(46285)).mo56386p("Found batch metric event but no sodaMetricsLogger found!");
            }
        }
        C67083kk kkVar = koVar.f182370c;
        if (kkVar == null) {
            kkVar = C67083kk.f182351g;
        }
        if (kkVar.f182354b != 1) {
            C62940bt r2 = C62942bv.checkIsLite(C67148mv.f182519e);
            koVar.mo58887l(r2);
            if (koVar.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt r22 = C62942bv.checkIsLite(C67148mv.f182519e);
                koVar.mo58887l(r22);
                Object l = koVar.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                if ((((C67148mv) obj).f182521a & 2) != 0) {
                    alVar.mo22513d();
                    return;
                }
                return;
            }
            return;
        }
        alVar.f46851c.mo22518c();
    }
}
