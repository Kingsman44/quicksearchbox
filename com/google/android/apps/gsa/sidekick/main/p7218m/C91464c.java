package com.google.android.apps.gsa.sidekick.main.p7218m;

import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.p489g.C9296n;
import com.google.android.apps.p489g.C9297o;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.p375ai.p378b.C7799kj;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.main.m.c */
/* compiled from: PG */
final class C91464c extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C91467f f255116a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91464c(C91467f fVar) {
        super("InterestLoaderInit", 2, 0);
        this.f255116a = fVar;
    }

    public final void run() {
        C91467f fVar = this.f255116a;
        synchronized (fVar.f255127b) {
            fVar.f255131f.clear();
            for (C9296n nVar : ((C9297o) fVar.f255129d.a()).f32278c) {
                CardRenderingContext cardRenderingContext = (CardRenderingContext) C90772bp.m148302j(nVar.f32271e.mo59174N(), CardRenderingContext.CREATOR);
                if (cardRenderingContext != null) {
                    Map map = fVar.f255131f;
                    C7799kj kjVar = nVar.f32269c;
                    if (kjVar == null) {
                        kjVar = C7799kj.f27263h;
                    }
                    map.put(kjVar, new C91466e(nVar, cardRenderingContext));
                }
            }
        }
    }
}
