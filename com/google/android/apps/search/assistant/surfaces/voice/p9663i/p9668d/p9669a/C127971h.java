package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128044m;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128046o;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import p3186j$.util.function.ToDoubleFunction;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.h */
/* compiled from: PG */
public final /* synthetic */ class C127971h implements ToDoubleFunction {

    /* renamed from: a */
    public static final /* synthetic */ C127971h f352226a = new C127971h();

    private /* synthetic */ C127971h() {
    }

    public final double applyAsDouble(Object obj) {
        C59071e eVar = C127972i.f352227a;
        C58485gu g = C127960aj.m209086g((C128046o) obj, C128045n.ACCELEROMETER);
        if (!g.isEmpty()) {
            float f = ((C128044m) g.get(0)).mo108321b()[2];
            double d = 1.0d;
            if (f >= -9.80665f) {
                double d2 = (double) f;
                double d3 = C127972i.f352228b;
                if (d2 < d3) {
                    double d4 = -0.5d / (d3 + 9.806650161743164d);
                    Double.isNaN(d2);
                    d = (d2 * d4) + (d4 * 9.806650161743164d) + 1.0d;
                } else if (f < 0.0f) {
                    Double.isNaN(d2);
                    return (0.5d / d3) * d2;
                } else {
                    d = C59203do.f157270a;
                }
            }
            return d;
        }
        C59104x d5 = C127972i.f352227a.mo56226d();
        d5.mo56378ag(C58975e.f156826a, "FaceDownSG");
        ((C59052c) ((C59052c) d5).mo56372aa(37748)).mo56386p("No data collected for determining whether the device is face-down");
        throw new IllegalStateException("Not enough data");
    }
}
