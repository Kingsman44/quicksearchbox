package com.google.android.apps.gsa.sidekick.main.p7218m;

import com.google.android.apps.gsa.k.c;
import com.google.android.apps.p489g.C9294l;
import com.google.android.apps.p489g.C9295m;
import com.google.android.apps.p489g.C9296n;
import com.google.android.apps.p489g.C9297o;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7722hn;
import com.google.p375ai.p378b.C7799kj;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.sidekick.main.m.d */
/* compiled from: PG */
final class C91465d implements c {

    /* renamed from: a */
    final /* synthetic */ C7799kj f255117a;

    /* renamed from: b */
    final /* synthetic */ CardRenderingContext f255118b;

    /* renamed from: c */
    final /* synthetic */ C60220t f255119c;

    /* renamed from: d */
    final /* synthetic */ C7722hn f255120d;

    /* renamed from: e */
    final /* synthetic */ long f255121e;

    /* renamed from: f */
    final /* synthetic */ byte[] f255122f;

    /* renamed from: g */
    final /* synthetic */ C91467f f255123g;

    public C91465d(C91467f fVar, C7799kj kjVar, CardRenderingContext cardRenderingContext, C60220t tVar, C7722hn hnVar, long j, byte[] bArr) {
        this.f255123g = fVar;
        this.f255117a = kjVar;
        this.f255118b = cardRenderingContext;
        this.f255119c = tVar;
        this.f255120d = hnVar;
        this.f255121e = j;
        this.f255122f = bArr;
    }

    /* renamed from: b */
    private final C9296n m149598b(C9296n nVar) {
        C9295m mVar = (C9295m) nVar.toBuilder();
        C60220t tVar = this.f255119c;
        if (tVar != null) {
            mVar.copyOnWrite();
            C9296n nVar2 = (C9296n) mVar.instance;
            nVar2.f32272f = tVar;
            nVar2.f32267a |= 16;
        }
        C7722hn hnVar = this.f255120d;
        mVar.copyOnWrite();
        C9296n nVar3 = (C9296n) mVar.instance;
        nVar3.f32270d = hnVar;
        nVar3.f32267a |= 4;
        C7799kj kjVar = this.f255117a;
        mVar.copyOnWrite();
        C9296n nVar4 = (C9296n) mVar.instance;
        kjVar.getClass();
        nVar4.f32269c = kjVar;
        nVar4.f32267a |= 2;
        long j = this.f255121e;
        mVar.copyOnWrite();
        C9296n nVar5 = (C9296n) mVar.instance;
        nVar5.f32267a |= 1;
        nVar5.f32268b = j;
        C63088z A = C63088z.m96139A(this.f255122f);
        mVar.copyOnWrite();
        C9296n nVar6 = (C9296n) mVar.instance;
        nVar6.f32267a |= 8;
        nVar6.f32271e = A;
        return (C9296n) mVar.build();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85814a(Object obj) {
        C9294l lVar = (C9294l) ((C9297o) obj).toBuilder();
        synchronized (this.f255123g.f255127b) {
            int size = ((C9297o) lVar.instance).f32278c.size();
            int i = 0;
            if (size != this.f255123g.f255131f.size()) {
                C59104x d = C91467f.f255126a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
                ((C59052c) ((C59052c) d).mo56372aa(11743)).mo56393w("In-memory cache differs from disk: %d vs %d", size, this.f255123g.f255131f.size());
                lVar.copyOnWrite();
                ((C9297o) lVar.instance).f32278c = C9297o.emptyProtobufList();
                this.f255123g.f255131f.clear();
                size = 0;
            }
            if (this.f255123g.f255131f.containsKey(this.f255117a)) {
                while (true) {
                    if (i >= ((C9297o) lVar.instance).f32278c.size()) {
                        C59104x c = C91467f.f255126a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
                        ((C59052c) ((C59052c) c).mo56372aa(11742)).mo56386p("Failed to find interest in cache");
                        break;
                    }
                    C9296n a = lVar.mo17481a(i);
                    C7799kj kjVar = this.f255117a;
                    C7799kj kjVar2 = a.f32269c;
                    if (kjVar2 == null) {
                        kjVar2 = C7799kj.f27263h;
                    }
                    if (kjVar.equals(kjVar2)) {
                        lVar.mo17483c(i, m149598b(a));
                        break;
                    }
                    i++;
                }
            } else if (size >= 10) {
                int i2 = -1;
                long j = Long.MAX_VALUE;
                while (i < ((C9297o) lVar.instance).f32278c.size()) {
                    long j2 = lVar.mo17481a(i).f32268b;
                    long j3 = j2 < j ? j2 : j;
                    if (j2 < j) {
                        i2 = i;
                    }
                    i++;
                    j = j3;
                }
                C7799kj kjVar3 = lVar.mo17481a(i2).f32269c;
                if (kjVar3 == null) {
                    kjVar3 = C7799kj.f27263h;
                }
                if (this.f255123g.f255131f.remove(kjVar3) == null) {
                    C59104x c2 = C91467f.f255126a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
                    ((C59052c) ((C59052c) c2).mo56372aa(11741)).mo56386p("Failed to remove entry from in-memory cache");
                }
                lVar.mo17483c(i2, m149598b(C9296n.f32265g));
            } else {
                lVar.mo17482b(m149598b(C9296n.f32265g));
            }
            this.f255123g.f255131f.put(this.f255117a, new C91466e(m149598b(C9296n.f32265g), this.f255118b));
        }
        long b = this.f255123g.f255130e.mo26870b();
        lVar.copyOnWrite();
        C9297o oVar = (C9297o) lVar.instance;
        oVar.f32276a |= 1;
        oVar.f32277b = b;
        return (C9297o) lVar.build();
    }
}
