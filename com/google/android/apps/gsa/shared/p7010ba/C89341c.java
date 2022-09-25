package com.google.android.apps.gsa.shared.p7010ba;

import com.google.android.apps.gsa.shared.p7010ba.p7011a.C89338a;
import com.google.android.apps.gsa.shared.p7010ba.p7011a.C89339b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.shared.ba.c */
/* compiled from: PG */
public final class C89341c {

    /* renamed from: a */
    public static final Duration f242216a = Duration.ofDays(1);

    /* renamed from: b */
    static final Duration f242217b = Duration.ofMinutes(10);

    /* renamed from: c */
    public final C42876ab f242218c;

    public C89341c(C42876ab abVar) {
        this.f242218c = abVar;
    }

    /* renamed from: b */
    public static C89339b m145292b(Instant instant, Duration duration, int i) {
        C89338a aVar = (C89338a) C89339b.f242204g.createBuilder();
        C63042fg c = C62950b.m95472c(instant);
        aVar.copyOnWrite();
        C89339b bVar = (C89339b) aVar.instance;
        c.getClass();
        bVar.f242208c = c;
        bVar.f242206a |= 2;
        C62910ar a = C62950b.m95470a(duration);
        aVar.copyOnWrite();
        C89339b bVar2 = (C89339b) aVar.instance;
        a.getClass();
        bVar2.f242209d = a;
        bVar2.f242206a |= 4;
        C62910ar arVar = C62948a.f169987b;
        aVar.copyOnWrite();
        C89339b bVar3 = (C89339b) aVar.instance;
        arVar.getClass();
        bVar3.f242210e = arVar;
        bVar3.f242206a |= 8;
        C62910ar a2 = C62950b.m95470a(duration);
        aVar.copyOnWrite();
        C89339b bVar4 = (C89339b) aVar.instance;
        a2.getClass();
        bVar4.f242207b = a2;
        bVar4.f242206a |= 1;
        aVar.copyOnWrite();
        C89339b bVar5 = (C89339b) aVar.instance;
        bVar5.f242206a |= 16;
        bVar5.f242211f = i;
        return (C89339b) aVar.build();
    }

    /* renamed from: c */
    public static C89339b m145293c(Instant instant, Duration duration, Duration duration2, int i, C89339b bVar) {
        C89338a aVar = (C89338a) C89339b.f242204g.createBuilder();
        C63042fg c = C62950b.m95472c(instant);
        aVar.copyOnWrite();
        C89339b bVar2 = (C89339b) aVar.instance;
        c.getClass();
        bVar2.f242208c = c;
        bVar2.f242206a |= 2;
        C62910ar a = C62950b.m95470a(duration);
        aVar.copyOnWrite();
        C89339b bVar3 = (C89339b) aVar.instance;
        a.getClass();
        bVar3.f242209d = a;
        bVar3.f242206a |= 4;
        C62910ar arVar = bVar.f242210e;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        C62910ar a2 = C62950b.m95470a(C62950b.m95473d(arVar).plus(duration2));
        aVar.copyOnWrite();
        C89339b bVar4 = (C89339b) aVar.instance;
        a2.getClass();
        bVar4.f242210e = a2;
        bVar4.f242206a |= 8;
        C62910ar arVar2 = bVar.f242207b;
        if (arVar2 == null) {
            arVar2 = C62910ar.f169858c;
        }
        aVar.copyOnWrite();
        C89339b bVar5 = (C89339b) aVar.instance;
        arVar2.getClass();
        bVar5.f242207b = arVar2;
        bVar5.f242206a |= 1;
        aVar.copyOnWrite();
        C89339b bVar6 = (C89339b) aVar.instance;
        bVar6.f242206a |= 16;
        bVar6.f242211f = i;
        return (C89339b) aVar.build();
    }

    /* renamed from: d */
    public static boolean m145294d(C89339b bVar, Duration duration) {
        C63042fg fgVar = bVar.f242208c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        if (C62950b.m95474e(fgVar).equals(Instant.EPOCH)) {
            return true;
        }
        C62910ar arVar = bVar.f242207b;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        if (duration.minus(C62950b.m95473d(arVar)).compareTo(f242216a) > 0 || duration.compareTo(f242217b) < 0) {
            return true;
        }
        C62910ar arVar2 = bVar.f242210e;
        if (arVar2 == null) {
            arVar2 = C62910ar.f169858c;
        }
        return duration.compareTo(C62950b.m95473d(arVar2)) < 0;
    }

    /* renamed from: e */
    public static void m145295e(C89339b bVar, Duration duration) {
        C63042fg fgVar = bVar.f242208c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C62950b.m95474e(fgVar).toEpochMilli();
        C62910ar arVar = bVar.f242209d;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        C62950b.m95473d(arVar).toMillis();
        C62910ar arVar2 = bVar.f242207b;
        if (arVar2 == null) {
            arVar2 = C62910ar.f169858c;
        }
        C62950b.m95473d(arVar2).toMillis();
        duration.toMillis();
        C62910ar arVar3 = bVar.f242210e;
        if (arVar3 == null) {
            arVar3 = C62910ar.f169858c;
        }
        C62950b.m95473d(arVar3).toMillis();
        int i = bVar.f242211f;
    }

    /* renamed from: a */
    public final C89339b mo83283a() {
        return (C89339b) C60856cj.m92910s(this.f242218c.mo46042d());
    }
}
