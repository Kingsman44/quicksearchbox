package com.google.android.libraries.mdi.download.p2236d.p2241e;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.android.libraries.storage.p3304a.p3312f.C42793q;
import com.google.common.base.C58869cf;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.p4552o.p4566l.C60154bs;
import com.google.common.p4552o.p4566l.C60155bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.mdi.download.d.e.at */
/* compiled from: PG */
public final /* synthetic */ class C29031at implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C29034aw f78806a;

    /* renamed from: b */
    public final /* synthetic */ Map f78807b;

    /* renamed from: c */
    public final /* synthetic */ Map f78808c;

    /* renamed from: d */
    public final /* synthetic */ AtomicLong f78809d;

    /* renamed from: e */
    public final /* synthetic */ int f78810e;

    public /* synthetic */ C29031at(C29034aw awVar, Map map, Map map2, AtomicLong atomicLong, int i) {
        this.f78806a = awVar;
        this.f78807b = map;
        this.f78808c = map2;
        this.f78809d = atomicLong;
        this.f78810e = i;
    }

    public final Object call() {
        C29034aw awVar = this.f78806a;
        Map map = this.f78807b;
        Map map2 = this.f78808c;
        AtomicLong atomicLong = this.f78809d;
        int i = this.f78810e;
        C60154bs bsVar = (C60154bs) C60155bt.f162730j.createBuilder();
        for (String str : map.keySet()) {
            C29033av avVar = (C29033av) map.get(str);
            List i2 = C58869cf.m90938d("|").mo56155i(str);
            C60125aq aqVar = (C60125aq) C60126ar.f162612j.createBuilder();
            String str2 = (String) i2.get(0);
            aqVar.copyOnWrite();
            C60126ar arVar = (C60126ar) aqVar.instance;
            str2.getClass();
            arVar.f162614a |= 1;
            arVar.f162615b = str2;
            String str3 = (String) i2.get(1);
            aqVar.copyOnWrite();
            C60126ar arVar2 = (C60126ar) aqVar.instance;
            str3.getClass();
            arVar2.f162614a |= 4;
            arVar2.f162617d = str3;
            int i3 = avVar.f78817e;
            aqVar.copyOnWrite();
            C60126ar arVar3 = (C60126ar) aqVar.instance;
            arVar3.f162614a |= 8;
            arVar3.f162618e = i3;
            int i4 = avVar.f78818f;
            aqVar.copyOnWrite();
            C60126ar arVar4 = (C60126ar) aqVar.instance;
            arVar4.f162614a |= 16;
            arVar4.f162619f = i4;
            C29334dr drVar = (C29334dr) map2.get(str);
            if (drVar == null) {
                aqVar.copyOnWrite();
                C60126ar arVar5 = (C60126ar) aqVar.instance;
                arVar5.f162614a |= 2;
                arVar5.f162616c = -1;
            } else {
                int i5 = drVar.f79503e;
                aqVar.copyOnWrite();
                C60126ar arVar6 = (C60126ar) aqVar.instance;
                arVar6.f162614a |= 2;
                arVar6.f162616c = i5;
                long j = drVar.f79516r;
                aqVar.copyOnWrite();
                C60126ar arVar7 = (C60126ar) aqVar.instance;
                arVar7.f162614a |= 64;
                arVar7.f162621h = j;
                String str4 = drVar.f79517s;
                aqVar.copyOnWrite();
                C60126ar arVar8 = (C60126ar) aqVar.instance;
                str4.getClass();
                arVar8.f162614a |= 128;
                arVar8.f162622i = str4;
            }
            C60126ar arVar9 = (C60126ar) aqVar.build();
            bsVar.copyOnWrite();
            C60155bt btVar = (C60155bt) bsVar.instance;
            arVar9.getClass();
            C62971cq cqVar = btVar.f162733b;
            if (!cqVar.mo58948c()) {
                btVar.f162733b = C62942bv.mutableCopy(cqVar);
            }
            btVar.f162733b.add(arVar9);
            long j2 = avVar.f78813a;
            bsVar.copyOnWrite();
            C60155bt btVar2 = (C60155bt) bsVar.instance;
            C62964ck ckVar = btVar2.f162734c;
            if (!ckVar.mo58948c()) {
                btVar2.f162734c = C62942bv.mutableCopy(ckVar);
            }
            btVar2.f162734c.mo58929f(j2);
            long j3 = avVar.f78814b;
            bsVar.copyOnWrite();
            C60155bt btVar3 = (C60155bt) bsVar.instance;
            C62964ck ckVar2 = btVar3.f162735d;
            if (!ckVar2.mo58948c()) {
                btVar3.f162735d = C62942bv.mutableCopy(ckVar2);
            }
            btVar3.f162735d.mo58929f(j3);
            long j4 = avVar.f78815c;
            bsVar.copyOnWrite();
            C60155bt btVar4 = (C60155bt) bsVar.instance;
            C62964ck ckVar3 = btVar4.f162736e;
            if (!ckVar3.mo58948c()) {
                btVar4.f162736e = C62942bv.mutableCopy(ckVar3);
            }
            btVar4.f162736e.mo58929f(j4);
            long j5 = avVar.f78816d;
            bsVar.copyOnWrite();
            C60155bt btVar5 = (C60155bt) bsVar.instance;
            C62964ck ckVar4 = btVar5.f162737f;
            if (!ckVar4.mo58948c()) {
                btVar5.f162737f = C62942bv.mutableCopy(ckVar4);
            }
            btVar5.f162737f.mo58929f(j5);
        }
        long j6 = atomicLong.get();
        bsVar.copyOnWrite();
        C60155bt btVar6 = (C60155bt) bsVar.instance;
        btVar6.f162732a |= 1;
        btVar6.f162738g = j6;
        long j7 = 0;
        try {
            Uri a = C29090d.m53980a(awVar.f78823e, awVar.f78825g);
            if (awVar.f78821c.mo45894h(a)) {
                j7 = ((Long) awVar.f78821c.mo45889c(a, new C42793q())).longValue();
            }
        } catch (IOException e) {
            C29045l.m53938j(e, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", "StorageLogger");
            awVar.f78824f.mo34497a(e, "Failed to call Mobstore to compute MDD Directory bytes used!", new Object[0]);
        }
        bsVar.copyOnWrite();
        C60155bt btVar7 = (C60155bt) bsVar.instance;
        btVar7.f162732a |= 2;
        btVar7.f162739h = j7;
        bsVar.copyOnWrite();
        C60155bt btVar8 = (C60155bt) bsVar.instance;
        btVar8.f162732a |= 4;
        btVar8.f162740i = i;
        return (C60155bt) bsVar.build();
    }
}
