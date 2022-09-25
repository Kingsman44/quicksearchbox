package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9346a.p9347a.C124213b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124272a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124294b;
import com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124352d;
import com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124354f;
import com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124356h;
import com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124357i;
import com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124358j;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3741aa.C48175j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.u */
/* compiled from: PG */
public final class C124315u implements C124294b {

    /* renamed from: a */
    public static final C59071e f343164a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.u");

    /* renamed from: b */
    public final C69464a f343165b;

    /* renamed from: c */
    public final Executor f343166c;

    /* renamed from: d */
    public final Executor f343167d;

    /* renamed from: e */
    public final Executor f343168e;

    /* renamed from: f */
    public final C69464a f343169f;

    /* renamed from: g */
    public final ConcurrentHashMap f343170g = new ConcurrentHashMap();

    /* renamed from: h */
    public final ConcurrentHashMap f343171h = new ConcurrentHashMap();

    /* renamed from: i */
    public final AtomicBoolean f343172i = new AtomicBoolean(false);

    /* renamed from: j */
    public C124272a f343173j;

    /* renamed from: k */
    public C124294b f343174k;

    /* renamed from: l */
    final C124314t f343175l = new C124314t(this);

    /* renamed from: m */
    public final C124213b f343176m;

    /* renamed from: n */
    private final C124358j f343177n;

    /* renamed from: o */
    private final C47632e f343178o = new C47632e();

    /* renamed from: p */
    private C60870cx f343179p;

    public C124315u(C124358j jVar, C124213b bVar, C69464a aVar, Executor executor, Executor executor2, C69464a aVar2) {
        this.f343177n = jVar;
        this.f343176m = bVar;
        this.f343165b = aVar;
        this.f343166c = executor;
        this.f343167d = new C60904dr(executor);
        this.f343168e = executor2;
        this.f343169f = aVar2;
        ((C59052c) ((C59052c) f343164a.mo56224b()).mo56372aa(36158)).mo56389s("Usonia native is enabled: %b", aVar2.mo17428b());
    }

    /* renamed from: a */
    public final C60870cx mo106360a(C124204t tVar) {
        AtomicReference atomicReference = new AtomicReference();
        C60870cx b = this.f343178o.mo51512b(new C124303i(this, atomicReference, tVar), this.f343166c);
        C124304j jVar = new C124304j(atomicReference);
        return C60922j.m93045h(b, C47810es.m84966f(jVar), this.f343166c);
    }

    /* renamed from: b */
    public final C60870cx mo106361b() {
        return this.f343178o.mo51512b(new C124301g(this), this.f343166c);
    }

    /* renamed from: c */
    public final C60870cx mo106362c() {
        ((C59052c) ((C59052c) f343164a.mo56224b()).mo56372aa(36155)).mo56386p("Starting Usonia child process");
        return this.f343178o.mo51512b(new C124308n(this), this.f343166c);
    }

    /* renamed from: d */
    public final C60870cx mo106363d() {
        ((C59052c) ((C59052c) f343164a.mo56224b()).mo56372aa(36156)).mo56386p("Stopping Usonia child process");
        return this.f343178o.mo51512b(new C124302h(this), this.f343166c);
    }

    /* renamed from: e */
    public final C60870cx mo106364e(C48175j jVar) {
        return this.f343178o.mo51512b(new C124309o(this, jVar), this.f343166c);
    }

    /* renamed from: f */
    public final void mo106365f(C124272a aVar) {
        C124299e eVar = new C124299e(this, aVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(eVar), this.f343167d), "Usonia callbacks is already set", new Object[0]);
    }

    /* renamed from: g */
    public final C60870cx mo106372g() {
        C60870cx cxVar = this.f343179p;
        if (cxVar != null) {
            return cxVar;
        }
        C124358j jVar = this.f343177n;
        C124354f fVar = jVar.f343261a;
        C124352d dVar = new C124352d(fVar);
        C47633f h = C47633f.m84733g(C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(dVar), fVar.f343256d))).mo51516i(new C124356h(jVar), jVar.f343264d).mo51515h(new C124357i(jVar), jVar.f343264d);
        this.f343179p = h;
        return h;
    }
}
