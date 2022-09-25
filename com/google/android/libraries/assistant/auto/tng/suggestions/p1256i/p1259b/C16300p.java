package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1259b;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15763a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15767c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15778e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1238b.C16210a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.C16282a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1257a.C16283a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1265a.p1266a.C16391a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.b.p */
/* compiled from: PG */
public final class C16300p implements C16282a {

    /* renamed from: a */
    public static final C59071e f47967a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.i.b.p");

    /* renamed from: b */
    public final Executor f47968b;

    /* renamed from: c */
    public final C16002a f47969c;

    /* renamed from: d */
    public final C69464a f47970d;

    /* renamed from: e */
    public final C16210a f47971e;

    /* renamed from: f */
    public final C69464a f47972f;

    /* renamed from: g */
    public final C15973f f47973g;

    /* renamed from: h */
    public final C15767c f47974h;

    /* renamed from: i */
    public final C15778e f47975i;

    /* renamed from: j */
    public final C16283a f47976j;

    /* renamed from: k */
    public final C47770dh f47977k;

    /* renamed from: l */
    public final Context f47978l;

    /* renamed from: m */
    public final C69464a f47979m;

    /* renamed from: n */
    public final C69464a f47980n;

    /* renamed from: o */
    public final C16391a f47981o;

    public C16300p(Executor executor, C16002a aVar, C69464a aVar2, C16210a aVar3, C69464a aVar4, C16391a aVar5, C15973f fVar, C15767c cVar, C15778e eVar, C16283a aVar6, C47770dh dhVar, Context context, C69464a aVar7, C69464a aVar8) {
        this.f47968b = executor;
        this.f47969c = aVar;
        this.f47970d = aVar2;
        this.f47971e = aVar3;
        this.f47972f = aVar4;
        this.f47981o = aVar5;
        this.f47973g = fVar;
        this.f47974h = cVar;
        this.f47975i = eVar;
        this.f47976j = aVar6;
        this.f47977k = dhVar;
        this.f47978l = context;
        this.f47979m = aVar7;
        this.f47980n = aVar8;
    }

    /* renamed from: c */
    public static String m33314c(C16090ap apVar, C15938h hVar) {
        String name = apVar.name();
        String name2 = hVar.mo22605a().name();
        return name + "_" + name2;
    }

    /* renamed from: a */
    public final C60870cx mo22874a(C15938h hVar) {
        C59104x b = f47967a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SuggestionProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(46676)).mo56389s("Running %s Suggestions generation.", hVar.mo22605a());
        C58833ax b2 = hVar.mo22606b();
        if (b2.mo56113h()) {
            return mo22875b((C16090ap) b2.mo56107c(), hVar);
        }
        C60870cx e = this.f47969c.mo22648e();
        C16297m mVar = new C16297m(this, hVar);
        return C60922j.m93045h(e, C47810es.m84966f(mVar), this.f47968b);
    }

    /* renamed from: b */
    public final C60870cx mo22875b(C16090ap apVar, C15938h hVar) {
        C16090ap apVar2 = C16090ap.HOME_SCREEN;
        int ordinal = apVar.ordinal();
        if ((ordinal == 1 || ordinal == 6) && hVar.mo22605a().equals(C15937g.PERIODIC_SUGGESTION_GENERATION)) {
            C58976aa aaVar = C58975e.f156826a;
            apVar.name();
            return C60866ct.f164955a;
        }
        C60870cx a = this.f47975i.mo22541a();
        C16290f fVar = new C16290f(this, hVar, apVar);
        return C60922j.m93045h(a, C47810es.m84966f(fVar), this.f47968b);
    }

    /* renamed from: d */
    public final void mo22876d(C16091aq aqVar) {
        C15973f fVar = this.f47973g;
        ((C15763a) C58833ax.m90833j((C15763a) fVar.f47363d.get(aqVar.mo22733g())).mo56108d(new C16292h(this, aqVar))).mo21857a(aqVar.mo22735i());
        C58976aa aaVar = C58975e.f156826a;
        aqVar.mo22733g();
    }
}
