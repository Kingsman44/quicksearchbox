package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1259b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16106be;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16359bf;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.b.a */
/* compiled from: PG */
public final /* synthetic */ class C16285a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16300p f47935a;

    /* renamed from: b */
    public final /* synthetic */ C15938h f47936b;

    /* renamed from: c */
    public final /* synthetic */ C16090ap f47937c;

    public /* synthetic */ C16285a(C16300p pVar, C15938h hVar, C16090ap apVar) {
        this.f47935a = pVar;
        this.f47936b = hVar;
        this.f47937c = apVar;
    }

    public final C60870cx apply(Object obj) {
        C16300p pVar = this.f47935a;
        C15938h hVar = this.f47936b;
        C16090ap apVar = this.f47937c;
        C15777d dVar = (C15777d) obj;
        C58833ax i = dVar.mo22553i();
        if (hVar.mo22607c() || (pVar.f47973g.mo22641p(apVar) && (!i.mo56113h() || ((C16106be) i.mo56107c()).mo22760d()))) {
            C16002a aVar = pVar.f47969c;
            C16359bf bfVar = dVar.mo22547e().f48165e;
            if (bfVar == null) {
                bfVar = C16359bf.f48152f;
            }
            C60870cx m = aVar.mo22656m(bfVar.f48156c);
            C16298n nVar = new C16298n(dVar);
            return C60922j.m93044g(m, C47810es.m84963c(nVar), pVar.f47968b);
        }
        throw new IllegalStateException("Visibility changed during context generation.");
    }
}
