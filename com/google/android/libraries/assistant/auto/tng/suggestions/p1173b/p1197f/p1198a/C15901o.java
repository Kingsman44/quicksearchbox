package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.p1198a;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.C13257a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.f.a.o */
/* compiled from: PG */
public final class C15901o extends C68247h {

    /* renamed from: a */
    private final C68283d f47220a;

    /* renamed from: c */
    private final C68283d f47221c;

    /* renamed from: d */
    private final C68283d f47222d;

    /* renamed from: e */
    private final C68283d f47223e;

    public C15901o(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C15901o.class), aVar);
        this.f47220a = C68236af.m98549d(dVar);
        this.f47221c = C68236af.m98549d(dVar2);
        this.f47222d = C68236af.m98549d(dVar3);
        this.f47223e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C13257a aVar = (C13257a) list.get(0);
        C60887da daVar = (C60887da) list.get(1);
        C15973f fVar = (C15973f) list.get(2);
        int intValue = ((Integer) list.get(3)).intValue();
        C58833ax c = fVar.mo22628c();
        if (!c.mo56113h()) {
            return C60922j.m93044g(aVar.mo21000e(intValue), C47810es.m84963c(new C15888b(fVar)), daVar);
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i((List) c.mo56107c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f47220a.mo60297gq(), this.f47221c.mo60297gq(), this.f47222d.mo60297gq(), this.f47223e.mo60297gq());
    }
}
