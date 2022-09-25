package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128044m;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128046o;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import p3186j$.util.OptionalDouble;
import p3186j$.util.function.ToDoubleFunction;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.r */
/* compiled from: PG */
public final /* synthetic */ class C127981r implements ToDoubleFunction {

    /* renamed from: a */
    public static final /* synthetic */ C127981r f352237a = new C127981r();

    private /* synthetic */ C127981r() {
    }

    public final double applyAsDouble(Object obj) {
        C128046o oVar = (C128046o) obj;
        C58485gu g = C127960aj.m209086g(oVar, C128045n.GRAVITY, C128045n.ACCELEROMETER);
        if (g.isEmpty()) {
            C59104x d = C127982s.f352238a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "InHandAtEarSG");
            ((C59052c) ((C59052c) d).mo56372aa(37752)).mo56386p("Insufficient data for detecting in-hands-at-ear");
            throw new IllegalStateException("Not enough data");
        } else if (C127960aj.m209085f(oVar) > 0.5d) {
            return C59203do.f157270a;
        } else {
            float[] b = ((C128044m) g.get(0)).mo108321b();
            float f = b[0];
            float f2 = b[1];
            float f3 = b[2];
            if (Math.abs(f) <= 3.0f || f2 <= 2.0f || Math.abs(f3) >= 6.0f) {
                return C59203do.f157270a;
            }
            double a = C127960aj.m209082a((double) Math.abs(f), (double) f3, 7.0d, -1.0d, 3.0d);
            OptionalDouble h = C127960aj.m209087h(oVar, C128045n.PROXIMITY);
            OptionalDouble h2 = C127960aj.m209087h(oVar, C128045n.LIGHT);
            if (C127960aj.m209088i(h, C127979p.f352235a, false) || C127960aj.m209088i(h2, C127980q.f352236a, false)) {
                a *= 0.7d;
            }
            return C127960aj.m209084e(a);
        }
    }
}
