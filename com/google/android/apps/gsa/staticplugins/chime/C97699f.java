package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60544tv;
import com.google.common.p4552o.C60545tw;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56969e;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56970f;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.f */
/* compiled from: PG */
public final /* synthetic */ class C97699f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C56969e f272809a;

    public /* synthetic */ C97699f(C56969e eVar) {
        this.f272809a = eVar;
    }

    public final Object apply(Object obj) {
        C56969e eVar = this.f272809a;
        for (C60544tv tvVar : ((C60545tw) obj).f164032a) {
            if (tvVar.f164024b == 2) {
                long epochMilli = Instant.ofEpochMilli(tvVar.f164026d).truncatedTo(ChronoUnit.HOURS).toEpochMilli();
                eVar.copyOnWrite();
                C56970f fVar = (C56970f) eVar.instance;
                C56970f fVar2 = C56970f.f152060o;
                fVar.f152062a |= 2048;
                fVar.f152073l = epochMilli;
                return C118826c.f331422a;
            }
        }
        return C118826c.f331422a;
    }
}
