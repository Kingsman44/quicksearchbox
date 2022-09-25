package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c;

import com.google.android.apps.auto.p450a.p451a.C8892bj;
import com.google.android.apps.auto.p450a.p451a.C8893bk;
import com.google.android.apps.auto.p450a.p452b.C8936b;
import com.google.common.p4552o.p4553a.C59452ac;
import com.google.common.p4552o.p4553a.C59453ad;
import com.google.common.p4552o.p4553a.C59470au;
import com.google.common.p4552o.p4553a.C59471av;
import com.google.common.p4552o.p4553a.C59472aw;
import com.google.common.p4552o.p4553a.C59473ax;
import com.google.common.p4552o.p4556c.C59675b;
import com.google.common.p4552o.p4556c.C59677d;
import com.google.common.p4552o.p4556c.C59679f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Random;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.j */
/* compiled from: PG */
public final class C11634j {
    /* renamed from: a */
    public static long m27335a(long j) {
        return j + ((long) new Random().nextInt(5)) + 1;
    }

    /* renamed from: b */
    public static C59473ax m27336b(C8893bk bkVar) {
        C59470au auVar = (C59470au) C59473ax.f157780o.createBuilder();
        int i = bkVar.f30860a;
        auVar.copyOnWrite();
        C59473ax axVar = (C59473ax) auVar.instance;
        axVar.f157782a |= 1;
        axVar.f157783b = i;
        int i2 = bkVar.f30861b;
        auVar.copyOnWrite();
        C59473ax axVar2 = (C59473ax) auVar.instance;
        axVar2.f157782a |= 2;
        axVar2.f157784c = i2;
        String str = bkVar.f30862c;
        auVar.copyOnWrite();
        C59473ax axVar3 = (C59473ax) auVar.instance;
        str.getClass();
        axVar3.f157782a |= 4;
        axVar3.f157785d = str;
        String str2 = bkVar.f30863d;
        auVar.copyOnWrite();
        C59473ax axVar4 = (C59473ax) auVar.instance;
        str2.getClass();
        axVar4.f157782a |= 8;
        axVar4.f157786e = str2;
        long a = m27335a(bkVar.f30865f);
        auVar.copyOnWrite();
        C59473ax axVar5 = (C59473ax) auVar.instance;
        axVar5.f157782a |= 16;
        axVar5.f157788g = a;
        long a2 = m27335a(bkVar.f30866g);
        auVar.copyOnWrite();
        C59473ax axVar6 = (C59473ax) auVar.instance;
        axVar6.f157782a |= 32;
        axVar6.f157789h = a2;
        int a3 = C59679f.m92480a(bkVar.f30867h);
        if (a3 == 0) {
            a3 = 1;
        }
        auVar.copyOnWrite();
        C59473ax axVar7 = (C59473ax) auVar.instance;
        axVar7.f157782a |= 64;
        axVar7.f157790i = a3 - 1;
        int a4 = C59677d.m92479a(bkVar.f30869j);
        if (a4 == 0) {
            a4 = 1;
        }
        auVar.copyOnWrite();
        C59473ax axVar8 = (C59473ax) auVar.instance;
        axVar8.f157782a |= 256;
        axVar8.f157792k = a4 - 1;
        boolean z = bkVar.f30870k;
        auVar.copyOnWrite();
        C59473ax axVar9 = (C59473ax) auVar.instance;
        axVar9.f157782a |= 2048;
        axVar9.f157795n = z;
        for (C8892bj bjVar : bkVar.f30864e) {
            C59471av avVar = (C59471av) C59472aw.f157775d.createBuilder();
            int a5 = C59675b.m92478a(bjVar.f30855a);
            if (a5 == 0) {
                a5 = 1;
            }
            avVar.copyOnWrite();
            C59472aw awVar = (C59472aw) avVar.instance;
            awVar.f157777a |= 1;
            awVar.f157778b = a5 - 1;
            long a6 = m27335a(bjVar.f30856b);
            avVar.copyOnWrite();
            C59472aw awVar2 = (C59472aw) avVar.instance;
            awVar2.f157777a |= 2;
            awVar2.f157779c = a6;
            C59472aw awVar3 = (C59472aw) avVar.build();
            auVar.copyOnWrite();
            C59473ax axVar10 = (C59473ax) auVar.instance;
            awVar3.getClass();
            axVar10.mo56967a();
            axVar10.f157787f.add(awVar3);
        }
        C8936b bVar = bkVar.f30868i;
        if (bVar == null) {
            bVar = C8936b.f30979c;
        }
        List list = (List) Collection.EL.stream(bVar.f30981a).map(C11632h.f37586a).collect(Collectors.toCollection(C11630f.f37584a));
        C8936b bVar2 = bkVar.f30868i;
        if (bVar2 == null) {
            bVar2 = C8936b.f30979c;
        }
        List list2 = (List) Collection.EL.stream(bVar2.f30982b).map(C11633i.f37587a).collect(Collectors.toCollection(C11630f.f37584a));
        C59452ac acVar = (C59452ac) C59453ad.f157711c.createBuilder();
        acVar.copyOnWrite();
        C59453ad adVar = (C59453ad) acVar.instance;
        C62971cq cqVar = adVar.f157713a;
        if (!cqVar.mo58948c()) {
            adVar.f157713a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) adVar.f157713a);
        acVar.copyOnWrite();
        C59453ad adVar2 = (C59453ad) acVar.instance;
        C62971cq cqVar2 = adVar2.f157714b;
        if (!cqVar2.mo58948c()) {
            adVar2.f157714b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) list2, (List) adVar2.f157714b);
        C59453ad adVar3 = (C59453ad) acVar.build();
        auVar.copyOnWrite();
        C59473ax axVar11 = (C59473ax) auVar.instance;
        adVar3.getClass();
        axVar11.f157791j = adVar3;
        axVar11.f157782a |= 128;
        return (C59473ax) auVar.build();
    }
}
