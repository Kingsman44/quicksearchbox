package com.google.android.apps.gsa.sidekick.main.p7197a.p7198a;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60544tv;
import com.google.common.p4552o.C60545tw;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C91239a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C91239a f254658a = new C91239a();

    private /* synthetic */ C91239a() {
    }

    public final Object apply(Object obj) {
        for (C60544tv tvVar : ((C60545tw) obj).f164032a) {
            if (tvVar.f164024b == 2) {
                return Instant.ofEpochMilli(tvVar.f164026d).truncatedTo(ChronoUnit.HOURS);
            }
        }
        return Instant.EPOCH;
    }
}
