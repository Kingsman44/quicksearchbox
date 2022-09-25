package com.google.android.apps.gsa.shared.p7010ba;

import com.google.android.apps.gsa.shared.p7010ba.p7011a.C89339b;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.shared.ba.a */
/* compiled from: PG */
public final /* synthetic */ class C89337a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Duration f242202a;

    /* renamed from: b */
    public final /* synthetic */ Instant f242203b;

    public /* synthetic */ C89337a(Duration duration, Instant instant) {
        this.f242202a = duration;
        this.f242203b = instant;
    }

    public final Object apply(Object obj) {
        Duration duration = this.f242202a;
        Instant instant = this.f242203b;
        C89339b bVar = (C89339b) obj;
        if (C89341c.m145294d(bVar, duration)) {
            return C89341c.m145292b(instant, duration, bVar.f242211f);
        }
        C62910ar arVar = bVar.f242209d;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        Duration minus = duration.minus(C62950b.m95473d(arVar));
        C89339b c = C89341c.m145293c(instant, duration, minus, bVar.f242211f, bVar);
        C89341c.m145295e(c, minus);
        return c;
    }
}
