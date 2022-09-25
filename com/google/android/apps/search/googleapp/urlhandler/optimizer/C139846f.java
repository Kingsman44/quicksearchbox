package com.google.android.apps.search.googleapp.urlhandler.optimizer;

import com.google.android.apps.search.googleapp.customtabs.p10151c.C133678ac;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135475u;
import com.google.android.apps.search.googleapp.urlhandler.optimizer.p10532a.C139835f;
import com.google.android.apps.search.googleapp.urlhandler.optimizer.p10532a.C139839j;
import com.google.android.apps.search.googleapp.urlhandler.optimizer.p10532a.C139841l;
import com.google.android.apps.search.googleapp.urlhandler.p10531c.C139792b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.optimizer.f */
/* compiled from: PG */
public final class C139846f {

    /* renamed from: a */
    public static final C59071e f380117a = C59071e.m91332i("com.google.android.apps.search.googleapp.urlhandler.optimizer.f");

    /* renamed from: b */
    public final C139835f f380118b;

    /* renamed from: c */
    public final C139839j f380119c;

    /* renamed from: d */
    public final C139841l f380120d;

    /* renamed from: e */
    public final C60888db f380121e;

    /* renamed from: f */
    public final boolean f380122f;

    /* renamed from: g */
    private final C139792b f380123g;

    /* renamed from: h */
    private final C133678ac f380124h;

    /* renamed from: i */
    private final C135475u f380125i;

    public C139846f(C139792b bVar, C133678ac acVar, C135475u uVar, C139835f fVar, C139839j jVar, C139841l lVar, C60888db dbVar, boolean z) {
        this.f380123g = bVar;
        this.f380124h = acVar;
        this.f380125i = uVar;
        this.f380118b = fVar;
        this.f380119c = jVar;
        this.f380120d = lVar;
        this.f380121e = dbVar;
        this.f380122f = z;
    }

    /* renamed from: b */
    public static void m227380b(C60870cx cxVar, String str, Object... objArr) {
        C139845e eVar = new C139845e(str, objArr);
        C60856cj.m92911t(cxVar, C47810es.m84974n(eVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo115305a() {
        C60870cx a = this.f380123g.mo115249a();
        C60870cx b = this.f380124h.f364126e.mo50395b();
        C60870cx a2 = this.f380125i.mo112358a();
        return C47636i.m84746e(a, b, a2).mo51518a(new C139843c(this, a, b, a2), this.f380121e);
    }

    /* renamed from: c */
    public final void mo115306c() {
        C60870cx a = mo115305a();
        C139842b bVar = C139842b.f380109a;
        m227380b(C60922j.m93045h(a, C47810es.m84966f(bVar), this.f380121e), "Failed to perform heavy prewarming", new Object[0]);
    }

    /* renamed from: d */
    public final void mo115307d() {
        C60870cx a = mo115305a();
        C139844d dVar = C139844d.f380114a;
        m227380b(C60922j.m93045h(a, C47810es.m84966f(dVar), this.f380121e), "Failed to perform light prewarming", new Object[0]);
    }
}
