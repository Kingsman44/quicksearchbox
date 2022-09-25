package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.p1198a;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.C13257a;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.f.a.j */
/* compiled from: PG */
public final class C15896j extends C68247h {

    /* renamed from: a */
    private final C68283d f47194a;

    /* renamed from: c */
    private final C68283d f47195c;

    /* renamed from: d */
    private final C68283d f47196d;

    /* renamed from: e */
    private final C68283d f47197e;

    public C15896j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C15896j.class), aVar);
        this.f47194a = C68236af.m98549d(dVar);
        this.f47195c = C68236af.m98549d(dVar2);
        this.f47196d = C68236af.m98549d(dVar3);
        this.f47197e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar;
        List list = (List) obj;
        C13257a aVar = (C13257a) list.get(0);
        C60887da daVar = (C60887da) list.get(1);
        C15973f fVar = (C15973f) list.get(2);
        int intValue = ((Integer) list.get(3)).intValue();
        if (fVar.f47367h.isEmpty()) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(fVar.f47367h);
        }
        if (!axVar.mo56113h()) {
            return C60922j.m93044g(aVar.mo20997b(intValue), C47810es.m84963c(new C15891e(fVar)), daVar);
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i((List) axVar.mo56107c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f47194a.mo60297gq(), this.f47195c.mo60297gq(), this.f47196d.mo60297gq(), this.f47197e.mo60297gq());
    }
}
