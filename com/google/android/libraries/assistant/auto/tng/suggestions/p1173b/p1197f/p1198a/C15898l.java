package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.p1198a;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.C13248a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.f.a.l */
/* compiled from: PG */
public final class C15898l extends C68247h {

    /* renamed from: a */
    private final C68283d f47202a;

    /* renamed from: c */
    private final C68283d f47203c;

    /* renamed from: d */
    private final C69464a f47204d;

    /* renamed from: e */
    private final C69464a f47205e;

    /* renamed from: f */
    private final C69464a f47206f;

    /* renamed from: g */
    private final C68283d f47207g;

    public C15898l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C68283d dVar3) {
        super(aVar2, new C68277d(C15898l.class), aVar);
        this.f47202a = C68236af.m98549d(dVar);
        this.f47203c = C68236af.m98549d(dVar2);
        this.f47204d = aVar3;
        this.f47205e = aVar4;
        this.f47206f = aVar5;
        this.f47207g = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar;
        List list = (List) obj;
        C13248a aVar = (C13248a) list.get(0);
        C60887da daVar = (C60887da) list.get(1);
        C69464a aVar2 = this.f47204d;
        C69464a aVar3 = this.f47205e;
        C69464a aVar4 = this.f47206f;
        C15973f fVar = (C15973f) list.get(2);
        if (C15894h.m32682a(aVar2, aVar4, 1)) {
            if (fVar.f47372m.isEmpty()) {
                axVar = C58836b.f156633a;
            } else {
                axVar = C58833ax.m90834k(fVar.f47372m);
            }
            if (axVar.mo56113h()) {
                C58976aa aaVar = C58975e.f156826a;
                return C60856cj.m92900i((List) axVar.mo56107c());
            }
        }
        return C60922j.m93044g(aVar.mo20995a(4, ((Long) aVar3.mo17428b()).longValue()), C47810es.m84963c(new C15893g(aVar2, aVar4, fVar)), daVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f47202a.mo60297gq(), this.f47203c.mo60297gq(), this.f47207g.mo60297gq());
    }
}
