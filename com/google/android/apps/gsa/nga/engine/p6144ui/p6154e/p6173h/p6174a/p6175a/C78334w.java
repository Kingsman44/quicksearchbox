package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.OptionalInt;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.w */
/* compiled from: PG */
public final /* synthetic */ class C78334w implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78335x f215655a;

    /* renamed from: b */
    public final /* synthetic */ Long f215656b;

    public /* synthetic */ C78334w(C78335x xVar, Long l) {
        this.f215655a = xVar;
        this.f215656b = l;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int i;
        C78335x xVar = this.f215655a;
        C58485gu guVar = (C58485gu) obj;
        long longValue = this.f215656b.longValue();
        if (!xVar.f215663g.mo85405j(C90126fx.f251420iV)) {
            return guVar;
        }
        OptionalInt findFirst = IntStream.CC.range(0, guVar.size()).filter(new C78333v(guVar)).findFirst();
        if (!findFirst.isPresent()) {
            findFirst.isPresent();
            return guVar;
        }
        Duration ofMillis = Duration.ofMillis(longValue);
        Instant a = xVar.f215666j.mo57444a();
        if (ofMillis.isZero()) {
            C80905at.m128763g(xVar.f215667k.mo74927p(a.toEpochMilli()), C78332u.f215653a);
            i = 0;
        } else {
            long epochMilli = a.toEpochMilli() - ofMillis.toMillis();
            long millis = Duration.ofHours(xVar.f215663g.mo85399d(C90126fx.f251593lj)).toMillis();
            long millis2 = Duration.ofHours(xVar.f215663g.mo85399d(C90126fx.f251594lk)).toMillis();
            i = 20;
            if (millis2 != 0) {
                long max = Math.max(0, (epochMilli - millis) + millis2) / millis2;
                if (max <= 20) {
                    i = (int) max;
                }
            }
        }
        if (i == 0) {
            return guVar;
        }
        C58480gp e = C58485gu.m89837e();
        for (int i2 = 0; i2 < guVar.size(); i2++) {
            if (i2 != findFirst.getAsInt()) {
                e.mo55395g((C80581o) guVar.get(i2));
                if (i2 == findFirst.getAsInt() + i) {
                    e.mo55395g((C80581o) guVar.get(findFirst.getAsInt()));
                }
            }
        }
        return e.mo55394f();
    }
}
