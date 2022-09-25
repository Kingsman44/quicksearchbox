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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.x */
/* compiled from: PG */
public final /* synthetic */ class C127987x implements ToDoubleFunction {

    /* renamed from: a */
    public static final /* synthetic */ C127987x f352245a = new C127987x();

    private /* synthetic */ C127987x() {
    }

    public final double applyAsDouble(Object obj) {
        C128046o oVar = (C128046o) obj;
        C58485gu g = C127960aj.m209086g(oVar, C128045n.GRAVITY, C128045n.ACCELEROMETER);
        if (g.isEmpty()) {
            C59104x d = C127989z.f352247a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "InHandGeneralUseSG");
            ((C59052c) ((C59052c) d).mo56372aa(37756)).mo56386p("Insufficient data for detecting in-hands-general-use");
            throw new IllegalStateException("Not enough data");
        } else if (C127960aj.m209085f(oVar) > 0.5d) {
            return C59203do.f157270a;
        } else {
            OptionalDouble h = C127960aj.m209087h(oVar, C128045n.PROXIMITY);
            float[] b = ((C128044m) g.get(0)).mo108321b();
            float f = b[0];
            float f2 = b[1];
            float f3 = b[2];
            double d2 = (double) f2;
            double d3 = (double) f3;
            return (f2 <= -2.0f || Math.abs(f) >= 2.0f || f3 <= 0.0f || Math.hypot(d2, d3) <= 9.0d || !C127960aj.m209088i(h, C127988y.f352246a, true)) ? C59203do.f157270a : C127960aj.m209084e(((C127960aj.m209083d((double) Math.abs(f), C59203do.f157270a, 0.75d) + C127960aj.m209083d(d2, 6.0d, 2.0d)) + C127960aj.m209083d(d3, 9.0d, 2.0d)) / 3.0d);
        }
    }
}
