package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128046o;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.ToDoubleFunction;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C127969f implements ToDoubleFunction {

    /* renamed from: a */
    public static final /* synthetic */ C127969f f352222a = new C127969f();

    private /* synthetic */ C127969f() {
    }

    public final double applyAsDouble(Object obj) {
        C58490gz gzVar = new C58490gz(4);
        Map.EL.forEach(((C128046o) obj).mo108316a(), new C127965b(gzVar));
        C58495hd f = gzVar.mo55427f(false);
        C58800sl lA = C127970g.f352224b.entrySet().iterator();
        double d = Double.MAX_VALUE;
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            Double d2 = (Double) f.get((C128045n) entry.getKey());
            if (d2 != null) {
                double doubleValue = d2.doubleValue() * ((Double) entry.getValue()).doubleValue();
                if (doubleValue < d) {
                    d = doubleValue;
                }
                C58976aa aaVar = C58975e.f156826a;
            }
        }
        if (d != Double.MAX_VALUE) {
            double d3 = d - 4.0d;
            C58976aa aaVar2 = C58975e.f156826a;
            double d4 = C59203do.f157270a;
            if (d3 < C59203do.f157270a) {
                d4 = (1.0d - d3) / 2.0d;
            } else if (d3 < 10.0d) {
                double sqrt = (double) ((float) Math.sqrt((d3 / 4.0d) / 10.0d));
                Double.isNaN(sqrt);
                return 0.5d - sqrt;
            }
            return d4;
        }
        C59104x d5 = C127970g.f352223a.mo56226d();
        d5.mo56378ag(C58975e.f156826a, "CompletelyStationarySG");
        ((C59052c) ((C59052c) d5).mo56372aa(37745)).mo56386p("Insufficient data for determining stationary state");
        throw new IllegalStateException("Not enough data");
    }
}
