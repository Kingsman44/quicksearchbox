package com.google.android.apps.gsa.staticplugins.accl.performers.p7350k;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55994b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protos.p4985f.p4986a.C64655ai;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.k.a */
/* compiled from: PG */
public final /* synthetic */ class C93202a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93205d f259918a;

    /* renamed from: b */
    public final /* synthetic */ String f259919b;

    public /* synthetic */ C93202a(C93205d dVar, String str) {
        this.f259918a = dVar;
        this.f259919b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93205d dVar = this.f259918a;
        String str = this.f259919b;
        long j = -1;
        for (C65768az azVar : ((C65033ar) obj).f176113a) {
            try {
                C63070h hVar = azVar.f178799e;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                C55994b bVar = ((C64655ai) C62942bv.parseFrom((C62942bv) C64655ai.f175254d, hVar.f170218b, C62921ba.m95368a())).f175257b;
                if (bVar == null) {
                    bVar = C55994b.f149106h;
                }
                if (bVar.f149110c == C55421x.GENERIC_SEND_MESSAGE.f146230cP) {
                    C65139d dVar2 = azVar.f178796b;
                    if (dVar2 == null) {
                        dVar2 = C65139d.f176307e;
                    }
                    if (dVar2.f176310b > j) {
                        C65139d dVar3 = azVar.f178796b;
                        if (dVar3 == null) {
                            dVar3 = C65139d.f176307e;
                        }
                        j = dVar3.f176310b;
                    }
                }
            } catch (C62974ct unused) {
            }
        }
        if (j == -1) {
            return C60856cj.m92900i(0L);
        }
        return dVar.f259924b.b(str, C65753ak.ACTION_HISTORY, BuildConfig.FLAVOR, j, true);
    }
}
