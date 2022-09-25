package com.google.android.apps.gsa.sidekick.main.p7218m;

import com.google.android.apps.gsa.k.c;
import com.google.android.apps.p489g.C9294l;
import com.google.android.apps.p489g.C9296n;
import com.google.android.apps.p489g.C9297o;
import com.google.p375ai.p378b.C7722hn;
import com.google.p375ai.p378b.C7799kj;

/* renamed from: com.google.android.apps.gsa.sidekick.main.m.b */
/* compiled from: PG */
public final /* synthetic */ class C91463b implements c {

    /* renamed from: a */
    public final /* synthetic */ C91467f f255115a;

    public /* synthetic */ C91463b(C91467f fVar) {
        this.f255115a = fVar;
    }

    /* renamed from: a */
    public final Object mo85812a(Object obj) {
        C91467f fVar = this.f255115a;
        C9297o oVar = (C9297o) obj;
        C9294l lVar = (C9294l) oVar.toBuilder();
        lVar.copyOnWrite();
        ((C9297o) lVar.instance).f32278c = C9297o.emptyProtobufList();
        synchronized (fVar.f255127b) {
            for (C9296n nVar : oVar.f32278c) {
                C7722hn hnVar = nVar.f32270d;
                if (hnVar == null) {
                    hnVar = C7722hn.f26993i;
                }
                if (fVar.mo85817c(hnVar)) {
                    lVar.mo17482b(nVar);
                } else {
                    C7799kj kjVar = nVar.f32269c;
                    if (kjVar == null) {
                        kjVar = C7799kj.f27263h;
                    }
                    fVar.f255131f.remove(kjVar);
                }
            }
        }
        return (C9297o) lVar.build();
    }
}
