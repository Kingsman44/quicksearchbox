package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11675af;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.C16884b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16161e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15763a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.p1205b.C15923e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d.C16267t;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16347au;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16348av;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16349aw;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16352az;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16354ba;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.C16408a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.suggestion.C53471a;
import com.google.assistant.suggestion.RegisterDisplayParams;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.ag */
/* compiled from: PG */
public final class C16416ag implements C16408a {

    /* renamed from: a */
    public static final C59071e f48286a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.m.a.ag");

    /* renamed from: b */
    public final C68214a f48287b;

    /* renamed from: c */
    public final C15973f f48288c;

    /* renamed from: d */
    public final C68214a f48289d;

    /* renamed from: e */
    public final C58833ax f48290e;

    /* renamed from: f */
    public final C68214a f48291f;

    /* renamed from: g */
    public final C16269a f48292g;

    /* renamed from: h */
    public final C68214a f48293h;

    /* renamed from: i */
    public final C68214a f48294i;

    /* renamed from: j */
    public final C15923e f48295j;

    /* renamed from: k */
    public final C68214a f48296k;

    /* renamed from: l */
    public final C46578l f48297l;

    /* renamed from: m */
    public final Executor f48298m;

    /* renamed from: n */
    public final Executor f48299n;

    /* renamed from: o */
    public final AtomicBoolean f48300o = new AtomicBoolean(false);

    /* renamed from: p */
    public final C69464a f48301p;

    /* renamed from: q */
    public final C69464a f48302q;

    /* renamed from: r */
    public final C69464a f48303r;

    /* renamed from: s */
    private final C21370a f48304s;

    /* renamed from: t */
    private final C68214a f48305t;

    /* renamed from: u */
    private final Executor f48306u;

    /* renamed from: v */
    private final C69464a f48307v;

    /* renamed from: w */
    private final C58833ax f48308w;

    public C16416ag(C21370a aVar, C68214a aVar2, C15973f fVar, C68214a aVar3, C68214a aVar4, C68214a aVar5, C16269a aVar6, C68214a aVar7, C68214a aVar8, C15923e eVar, C68214a aVar9, C58833ax axVar, C69464a aVar10, C46578l lVar, Executor executor, Executor executor2, C69464a aVar11, C69464a aVar12, C69464a aVar13, C58833ax axVar2) {
        Executor executor3 = executor2;
        this.f48304s = aVar;
        this.f48287b = aVar2;
        this.f48288c = fVar;
        this.f48289d = aVar3;
        this.f48290e = axVar;
        this.f48296k = aVar9;
        this.f48293h = aVar7;
        this.f48294i = aVar8;
        this.f48295j = eVar;
        this.f48297l = lVar;
        this.f48291f = aVar4;
        this.f48305t = aVar5;
        this.f48292g = aVar6;
        this.f48298m = executor;
        this.f48299n = executor3;
        this.f48306u = new C60904dr(executor3);
        this.f48301p = aVar11;
        this.f48302q = aVar12;
        this.f48307v = aVar10;
        this.f48303r = aVar13;
        this.f48308w = axVar2;
    }

    /* renamed from: h */
    private final C60870cx m33387h(int i, int i2) {
        return C47633f.m84733g(((C16884b) this.f48307v.mo17428b()).mo23069d()).mo51516i(new C16414ae(this, i), this.f48298m).mo51515h(new C16415af(i2, i), this.f48299n);
    }

    /* renamed from: a */
    public final C60870cx mo22915a(String str, C16347au auVar) {
        Object obj;
        Map unmodifiableMap = Collections.unmodifiableMap(auVar.f48124a);
        if (unmodifiableMap.containsKey(7)) {
            return m33387h(8, ((Integer) Map.EL.getOrDefault(unmodifiableMap, 7, 0)).intValue());
        }
        if (unmodifiableMap.containsKey(8)) {
            return m33387h(9, ((Integer) Map.EL.getOrDefault(unmodifiableMap, 8, 0)).intValue());
        }
        if (unmodifiableMap.containsKey(9)) {
            return (C60870cx) this.f48308w.mo56106b(new C16435s(this, ((Integer) Map.EL.getOrDefault(unmodifiableMap, 9, 0)).intValue())).mo56109e(C60856cj.m92900i(C16349aw.f48126d));
        }
        C58976aa aaVar = C58975e.f156826a;
        if (TextUtils.isEmpty(str)) {
            return C60856cj.m92900i(C16349aw.f48126d);
        }
        C58833ax f = this.f48288c.mo22631f(str);
        if (!f.mo56113h()) {
            C59104x c = f48286a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SuggestionService");
            ((C59052c) ((C59052c) c).mo56372aa(46717)).mo56389s("Failure to find DisplayType for the displayId %s", str);
            return C60856cj.m92900i(C16349aw.f48126d);
        } else if (f.mo56107c() == C16090ap.COOLWALK_MEDIA_CARD) {
            C58833ax d = this.f48288c.mo22629d(str);
            if (d.mo56113h()) {
                C62940bt r0 = C62942bv.checkIsLite(C11675af.f37664d);
                auVar.mo58887l(r0);
                if (auVar.f169962ag.mo58857o(r0.f169971d)) {
                    C16267t tVar = (C16267t) this.f48305t.mo27525b();
                    C16091aq aqVar = (C16091aq) d.mo56107c();
                    C62940bt r1 = C62942bv.checkIsLite(C11675af.f37664d);
                    auVar.mo58887l(r1);
                    Object l = auVar.f169962ag.mo58854l(r1.f169971d);
                    if (l == null) {
                        obj = r1.f169969b;
                    } else {
                        obj = r1.mo58889c(l);
                    }
                    return C47633f.m84733g(tVar.mo22866a(aqVar, (C11675af) obj)).mo51515h(new C16433q(auVar), this.f48299n);
                }
            }
            return C60856cj.m92900i(C16349aw.f48126d);
        } else {
            C16090ap apVar = (C16090ap) f.mo56107c();
            C16348av avVar = (C16348av) C16349aw.f48126d.createBuilder();
            return C47633f.m84733g(mo22921g()).mo51516i(new C16421e(this, apVar, str), this.f48298m).mo51516i(new C16422f(this, avVar, unmodifiableMap, str), this.f48298m).mo51516i(new C16423g(this, avVar, unmodifiableMap, apVar), this.f48298m).mo51515h(new C16424h(avVar), this.f48298m);
        }
    }

    /* renamed from: b */
    public final C60870cx mo22916b(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (TextUtils.isEmpty(str)) {
            C59104x d = f48286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SuggestionService");
            ((C59052c) ((C59052c) d).mo56372aa(46719)).mo56386p("Illegal display id");
            return C60856cj.m92900i(false);
        } else if (this.f48288c.f47361b.containsKey(str)) {
            return C60856cj.m92900i(true);
        } else {
            C60870cx f = ((C16002a) this.f48287b.mo27525b()).mo22649f(str);
            C16410aa aaVar2 = C16410aa.f48275a;
            return C60922j.m93044g(f, C47810es.m84963c(aaVar2), this.f48298m);
        }
    }

    /* renamed from: c */
    public final C60870cx mo22917c(List list, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).map(new C16437u(this)).collect(C58370cn.f155946a);
        return C47638k.m84752c(guVar).mo51521b(new C16412ac(this, guVar, z), this.f48298m);
    }

    /* renamed from: d */
    public final C60870cx mo22918d(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (TextUtils.isEmpty(str)) {
            C59104x d = f48286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SuggestionService");
            ((C59052c) ((C59052c) d).mo56372aa(46731)).mo56386p("Illegal display id");
            return C60856cj.m92900i(false);
        }
        C60870cx c = ((C16002a) this.f48287b.mo27525b()).mo22646c(str);
        C16436t tVar = new C16436t(this, str);
        return C60922j.m93044g(c, C47810es.m84963c(tVar), this.f48298m);
    }

    /* renamed from: e */
    public final C60870cx mo22919e(String str) {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        C58833ax j = C58833ax.m90833j(this.f48288c.mo22626a(str));
        if (j.mo56113h()) {
            cxVar = C60856cj.m92900i(j);
        } else {
            cxVar = ((C16002a) this.f48287b.mo27525b()).mo22654k(str);
        }
        C16409a aVar = new C16409a(this);
        return C60922j.m93045h(cxVar, C47810es.m84966f(aVar), this.f48298m);
    }

    /* renamed from: f */
    public final C60870cx mo22920f(String str, RegisterDisplayParams registerDisplayParams, C15763a aVar, int i) {
        C58976aa aaVar = C58975e.f156826a;
        boolean z = true;
        if (TextUtils.isEmpty(str) || aVar == null) {
            C59104x d = f48286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SuggestionService");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(46728);
            if (aVar != null) {
                z = false;
            }
            cVar.mo56359L("Illegal arguments displayId: %s, registerDisplayParams: %s, notifyChangeCallBack is empty: %s", str, registerDisplayParams, Boolean.valueOf(z));
            return C60856cj.m92900i(false);
        }
        int i2 = registerDisplayParams.f140337c;
        String a = C53471a.m86819a(i2);
        if (i2 != 0) {
            C16090ap a2 = C16090ap.m32978a(a);
            C16161e eVar = new C16161e();
            eVar.f47659a = str;
            eVar.mo22718c(a2);
            eVar.mo22723h(registerDisplayParams.f140335a);
            eVar.mo22722g(registerDisplayParams.f140336b);
            eVar.mo22720e(this.f48304s.mo26870b());
            C16352az azVar = (C16352az) C16354ba.f48140c.createBuilder();
            azVar.copyOnWrite();
            C16354ba baVar = (C16354ba) azVar.instance;
            baVar.f48143b = i - 1;
            baVar.f48142a |= 1;
            eVar.mo22717b((C16354ba) azVar.build());
            eVar.mo22721f(0.0f);
            eVar.mo22724i(0.0f);
            eVar.mo22719d(0);
            C16091aq a3 = eVar.mo22716a();
            return C47633f.m84733g(mo22921g()).mo51516i(new C16430n(this, a3), this.f48298m).mo51516i(new C16431o(this, a2), this.f48298m).mo51515h(new C16432p(this, a2, a3, aVar), this.f48298m);
        }
        throw null;
    }

    /* renamed from: g */
    public final C60870cx mo22921g() {
        C16438v vVar = new C16438v(this);
        return C60856cj.m92905n(C47810es.m84965e(vVar), this.f48306u);
    }
}
