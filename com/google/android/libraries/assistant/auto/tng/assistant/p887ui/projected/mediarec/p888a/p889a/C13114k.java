package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p888a.p889a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13045g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p888a.C13103a;
import com.google.android.libraries.assistant.auto.tng.common.p926m.p927a.C13293a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.C16408a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C63033ey;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a.k */
/* compiled from: PG */
public final class C13114k implements C13103a {

    /* renamed from: a */
    public static final C59071e f40652a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a.k");

    /* renamed from: b */
    public final C69464a f40653b;

    /* renamed from: c */
    public final C69464a f40654c;

    /* renamed from: d */
    public final C69464a f40655d;

    /* renamed from: e */
    public final C69464a f40656e;

    /* renamed from: f */
    public final C21370a f40657f;

    /* renamed from: g */
    public final C16408a f40658g;

    /* renamed from: h */
    public final C46407v f40659h;

    /* renamed from: i */
    public final Executor f40660i;

    /* renamed from: j */
    public final Executor f40661j;

    /* renamed from: k */
    public final C16269a f40662k;

    /* renamed from: l */
    public String f40663l = BuildConfig.FLAVOR;

    /* renamed from: m */
    private final C69464a f40664m;

    /* renamed from: n */
    private final C60888db f40665n;

    /* renamed from: o */
    private final C13293a f40666o;

    /* renamed from: p */
    private int f40667p = 1;

    public C13114k(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C21370a aVar6, C13293a aVar7, C16408a aVar8, C16269a aVar9, C46407v vVar, Executor executor, Executor executor2, C60888db dbVar) {
        this.f40653b = aVar;
        this.f40654c = aVar2;
        this.f40655d = aVar3;
        this.f40656e = aVar4;
        this.f40664m = aVar5;
        this.f40657f = aVar6;
        this.f40666o = aVar7;
        this.f40658g = aVar8;
        this.f40659h = vVar;
        this.f40660i = executor;
        this.f40661j = executor2;
        this.f40665n = dbVar;
        this.f40662k = aVar9;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        if (this.f40666o.mo21011a()) {
            return new C46463o(new C60817ay(C47633f.m84733g(this.f40659h.mo50345e(mo20908g())).mo51515h(new C13108e(this), C60826bg.f164896a)));
        }
        C13045g gVar = (C13045g) C13048j.f40502e.createBuilder();
        gVar.copyOnWrite();
        C13048j jVar = (C13048j) gVar.instance;
        jVar.f40506c = 2;
        jVar.f40504a |= 1;
        return new C46463o(new C60817ay(C60856cj.m92900i(C46688af.m83205b((C13048j) gVar.build(), this.f40657f.mo26870b()))));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return mo20909h();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return "proactiveContentDataService#fetchProactiveContent";
    }

    /* renamed from: d */
    public final C60870cx mo20905d(int i) {
        return C47633f.m84733g(this.f40659h.mo50345e(mo20908g())).mo51516i(new C13113j(this, i), this.f40661j);
    }

    /* renamed from: e */
    public final C60870cx mo20906e(Duration duration) {
        C58976aa aaVar = C58975e.f156826a;
        C13107d dVar = new C13107d(this);
        return C60856cj.m92902k(C47810es.m84965e(dVar), duration.getSeconds(), TimeUnit.SECONDS, this.f40665n);
    }

    /* renamed from: f */
    public final void mo20907f(String str, int i) {
        this.f40663l = str;
        this.f40667p = i;
    }

    /* renamed from: g */
    public final C63033ey mo20908g() {
        if (C58837ba.m90859h(this.f40663l) || !((C65603f) this.f40664m.mo17428b()).f178307a.contains(this.f40663l)) {
            return C63033ey.f170139b;
        }
        return C63033ey.m95859a(this.f40663l);
    }

    /* renamed from: h */
    public final C60870cx mo20909h() {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f40667p == 10) {
            cxVar = this.f40658g.mo22916b("coolwalk_media_card_display_id");
        } else {
            cxVar = C60856cj.m92900i(false);
        }
        return C47633f.m84733g(C47633f.m84733g(cxVar).mo51516i(new C13104a(this), this.f40661j)).mo51514f(Throwable.class, C13105b.f40642a, this.f40660i).mo51516i(new C13106c(this), this.f40661j);
    }
}
