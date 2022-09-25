package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12833c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12861e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12862f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p837d.C12758a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p839f.C12761a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p839f.C12771e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12845l;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12855v;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12856w;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c.C12858y;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p857b.p858a.p859a.C12886h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.b */
/* compiled from: PG */
public final class C12695b implements C12833c {

    /* renamed from: a */
    public static final C59071e f39758a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.b");

    /* renamed from: b */
    private final C12699f f39759b;

    /* renamed from: c */
    private final C12856w f39760c;

    /* renamed from: d */
    private final C12709p f39761d;

    /* renamed from: e */
    private final Map f39762e;

    /* renamed from: f */
    private final Map f39763f;

    /* renamed from: g */
    private final C69464a f39764g;

    /* renamed from: h */
    private final Executor f39765h;

    public C12695b(C12699f fVar, C12856w wVar, C12709p pVar, Map map, Map map2, C69464a aVar, Executor executor) {
        this.f39759b = fVar;
        this.f39760c = wVar;
        this.f39761d = pVar;
        this.f39762e = map;
        this.f39763f = map2;
        this.f39764g = aVar;
        this.f39765h = executor;
    }

    /* renamed from: a */
    public final C12862f mo20734a(C12861e eVar) {
        Map map;
        C58833ax axVar;
        C59071e eVar2 = f39758a;
        C59104x b = eVar2.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConversationDeltaRendrr");
        ((C59052c) ((C59052c) b).mo56372aa(44400)).mo56386p("#handleConversationDelta");
        C12709p pVar = this.f39761d;
        Map map2 = this.f39762e;
        eVar.mo20757a();
        C12991i c = eVar.mo20759c();
        C12989g a = C12989g.m29225a(c.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        a.name();
        if (!map2.containsKey(a)) {
            C59104x c2 = eVar2.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ConversationDeltaRendrr");
            ((C59052c) ((C59052c) c2).mo56372aa(44405)).mo56389s("No performers found for EntrySurface: %s", a.name());
            map = C58729pv.f156485a;
        } else {
            C12771e eVar3 = (C12771e) ((C69464a) map2.get(a)).mo17428b();
            C12761a aVar = new C12761a();
            aVar.mo20776c(eVar.mo20757a());
            aVar.mo20777d(pVar);
            aVar.mo20775b(c);
            Optional d = eVar.mo20760d();
            if (d != null) {
                aVar.f39914a = d;
                map = eVar3.mo20778a(aVar.mo20774a());
            } else {
                throw new NullPointerException("Null unifiedAssistantRequestConfig");
            }
        }
        C12758a aVar2 = new C12758a(map);
        C12856w wVar = this.f39760c;
        C12989g a2 = C12989g.m29225a(eVar.mo20759c().f40385d);
        if (a2 == null) {
            a2 = C12989g.UNKNOWN;
        }
        a2.name();
        if (!this.f39763f.containsKey(a2)) {
            C59104x d2 = eVar2.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ConversationDeltaRendrr");
            ((C59052c) ((C59052c) d2).mo56372aa(44403)).mo56389s("No ConversationParamsStore found for EntrySurface: %s", a2.name());
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k((C12886h) ((C69464a) this.f39763f.get(a2)).mo17428b());
        }
        Executor executor = (Executor) wVar.f40111a.mo17428b();
        executor.getClass();
        C12845l lVar = (C12845l) wVar.f40112b.mo17428b();
        lVar.getClass();
        C12858y yVar = (C12858y) wVar.f40113c.mo17428b();
        yVar.getClass();
        C15481g gVar = (C15481g) wVar.f40114d.mo17428b();
        gVar.getClass();
        C12855v vVar = new C12855v(aVar2, axVar, executor, lVar, yVar, gVar);
        C12709p pVar2 = this.f39761d;
        C47558bi a3 = C47831fm.m85006a("ConversationDeltaRenderer.handle");
        try {
            C46459k.m82829b(eVar.mo20758b().mo20469b().mo20440jJ(vVar), "ConversationDelta streaming failed", new Object[0]);
            C60870cx cxVar = vVar.f40104e;
            a3.mo51417a(cxVar);
            C12694a aVar3 = new C12694a(pVar2);
            C60856cj.m92911t(cxVar, C47810es.m84974n(aVar3), this.f39765h);
            a3.close();
            C12715v vVar2 = (C12715v) this.f39764g.mo17428b();
            C12989g a4 = C12989g.m29225a(eVar.mo20759c().f40385d);
            if (a4 == null) {
                a4 = C12989g.UNKNOWN;
            }
            C12714u uVar = new C12714u(vVar2, a4);
            eVar.mo20758b().mo20469b().mo20440jJ(uVar);
            C60870cx cxVar2 = uVar.f39801a;
            C12699f fVar = this.f39759b;
            C12709p pVar3 = this.f39761d;
            pVar3.getClass();
            cxVar2.getClass();
            Executor executor2 = (Executor) fVar.f39773a.mo17428b();
            executor2.getClass();
            return new C12698e(vVar, pVar3, cxVar2, executor2);
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
