package androidx.media3.exoplayer;

import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2601a;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.ar */
/* compiled from: PG */
public final /* synthetic */ class C2773ar implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2848br f7676a;

    /* renamed from: b */
    public final /* synthetic */ C2855by f7677b;

    public /* synthetic */ C2773ar(C2848br brVar, C2855by byVar) {
        this.f7676a = brVar;
        this.f7677b = byVar;
    }

    public final void run() {
        long j;
        boolean z;
        long j2;
        C2848br brVar = this.f7676a;
        C2855by byVar = this.f7677b;
        int i = brVar.f8001n - byVar.f8031c;
        brVar.f8001n = i;
        boolean z2 = true;
        if (byVar.f8032d) {
            brVar.f8002o = byVar.f8033e;
            brVar.f8003p = true;
        }
        if (byVar.f8034f) {
            brVar.f8004q = byVar.f8035g;
        }
        if (i == 0) {
            C2651bm bmVar = byVar.f8030b.f8164b;
            if (!brVar.f7954C.f8164b.mo6304o() && bmVar.mo6304o()) {
                brVar.f7955D = -1;
                brVar.f7956E = 0;
            }
            if (!bmVar.mo6304o()) {
                List asList = Arrays.asList(((C2892cu) bmVar).f8195b);
                C2601a.m6832d(asList.size() == brVar.f7993e.size());
                for (int i2 = 0; i2 < asList.size(); i2++) {
                    ((C2847bq) brVar.f7993e.get(i2)).f7949a = (C2651bm) asList.get(i2);
                }
            }
            if (brVar.f8003p) {
                if (byVar.f8030b.f8165c.equals(brVar.f7954C.f8165c) && byVar.f8030b.f8167e == brVar.f7954C.f8181s) {
                    z2 = false;
                }
                if (z2) {
                    if (bmVar.mo6304o() || byVar.f8030b.f8165c.mo6102a()) {
                        j2 = byVar.f8030b.f8167e;
                    } else {
                        C2888cq cqVar = byVar.f8030b;
                        j2 = brVar.mo6601az(bmVar, cqVar.f8165c, cqVar.f8167e);
                    }
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            brVar.f8003p = false;
            brVar.mo6598aO(byVar.f8030b, 1, brVar.f8004q, false, z, brVar.f8002o, j, -1);
        }
    }
}
