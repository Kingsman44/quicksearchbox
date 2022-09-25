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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.v */
/* compiled from: PG */
public final /* synthetic */ class C127985v implements ToDoubleFunction {

    /* renamed from: a */
    public static final /* synthetic */ C127985v f352242a = new C127985v();

    private /* synthetic */ C127985v() {
    }

    public final double applyAsDouble(Object obj) {
        C128046o oVar = (C128046o) obj;
        C58485gu g = C127960aj.m209086g(oVar, C128045n.GRAVITY, C128045n.ACCELEROMETER);
        if (g.isEmpty()) {
            C59104x d = C127986w.f352243a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "InHandDanglingSG");
            ((C59052c) ((C59052c) d).mo56372aa(37754)).mo56386p("Insufficient data for detecting in-hands-dangling");
            throw new IllegalStateException("Not enough data");
        } else if (C127960aj.m209085f(oVar) > 0.5d) {
            return C59203do.f157270a;
        } else {
            float[] b = ((C128044m) g.get(0)).mo108321b();
            float f = b[0];
            float f2 = b[1];
            float f3 = b[2];
            double d2 = (double) f2;
            double hypot = Math.hypot((double) f, d2);
            double d3 = (double) f3;
            double hypot2 = Math.hypot(d2, d3);
            if (hypot <= 9.0d || hypot2 >= 9.4d) {
                return C59203do.f157270a;
            }
            Double.isNaN(d2);
            Double.isNaN(d3);
            if (Math.hypot(-7.0d + d2, 1.0d + d3) < 2.5d) {
                return C59203do.f157270a;
            }
            double d4 = C127960aj.m209083d(hypot, 9.5d, 1.0d);
            double d5 = d2;
            double d6 = d3;
            double max = (d4 + Math.max(C127960aj.m209082a(d5, d6, 0.1d, 1.5d, 2.0d), C127960aj.m209082a(d5, d6, -9.5d, C59203do.f157270a, 2.0d) * 0.6d)) / 2.0d;
            OptionalDouble h = C127960aj.m209087h(oVar, C128045n.PROXIMITY);
            OptionalDouble h2 = C127960aj.m209087h(oVar, C128045n.LIGHT);
            if (C127960aj.m209088i(h, C127983t.f352240a, false) || C127960aj.m209088i(h2, C127984u.f352241a, false)) {
                max *= 0.7d;
            }
            return C127960aj.m209084e(max);
        }
    }
}
