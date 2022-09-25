package com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9885a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9236j.p9237a.p9238a.p9239a.C121540a;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130353c;
import com.google.android.libraries.search.assistant.invocation.assistdata.p2595a.C33517a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34831e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.a.j */
/* compiled from: PG */
public final class C130346j implements C130353c {

    /* renamed from: a */
    public static final C59071e f357244a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.a.c.a.j");

    /* renamed from: b */
    public final Executor f357245b;

    /* renamed from: c */
    public final C121540a f357246c;

    /* renamed from: d */
    private Optional f357247d = Optional.empty();

    /* renamed from: e */
    private Optional f357248e = Optional.empty();

    /* renamed from: f */
    private Optional f357249f = Optional.empty();

    /* renamed from: g */
    private final C33517a f357250g;

    public C130346j(C33517a aVar, C121540a aVar2, Executor executor) {
        this.f357250g = aVar;
        this.f357246c = aVar2;
        this.f357245b = executor;
    }

    /* renamed from: d */
    private final synchronized C60870cx m212789d(C34053bp bpVar) {
        if (this.f357249f.isPresent()) {
            return (C60870cx) this.f357249f.get();
        }
        C60870cx a = this.f357250g.mo38956a(bpVar).mo38973a();
        C130341e eVar = C130341e.f357240a;
        Class<Exception> cls = Exception.class;
        C60870cx g = C60846c.m92878g(a, cls, C47810es.m84963c(eVar), this.f357245b);
        C130338b bVar = new C130338b(this, bpVar);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(bVar), this.f357245b);
        C130339c cVar = C130339c.f357237a;
        return C60846c.m92878g(h, C34831e.class, C47810es.m84963c(cVar), this.f357245b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != false) goto L_0x0029;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m212790e(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            j$.util.Optional r0 = r2.f357247d     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.isPresent()     // Catch:{ all -> 0x0059 }
            r1 = 1
            if (r0 == 0) goto L_0x001a
            j$.util.Optional r0 = r2.f357247d     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0059 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r0     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            j$.util.Optional r0 = r2.f357248e     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.isPresent()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0027
            if (r1 == 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            if (r1 == 0) goto L_0x0038
        L_0x0029:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r3)     // Catch:{ all -> 0x0059 }
            r2.f357247d = r0     // Catch:{ all -> 0x0059 }
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0059 }
            r2.f357249f = r0     // Catch:{ all -> 0x0059 }
            r2.mo106971a()     // Catch:{ all -> 0x0059 }
        L_0x0038:
            com.google.common.util.concurrent.cx r0 = r2.m212789d(r3)     // Catch:{ all -> 0x0059 }
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x0059 }
            r2.f357249f = r1     // Catch:{ all -> 0x0059 }
            com.google.android.apps.search.assistant.verticals.a.c.a.d r1 = new com.google.android.apps.search.assistant.verticals.a.c.a.d     // Catch:{ all -> 0x0059 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0059 }
            java.util.concurrent.Executor r3 = r2.f357245b     // Catch:{ all -> 0x0059 }
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r1)     // Catch:{ all -> 0x0059 }
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60922j.m93045h(r0, r1, r3)     // Catch:{ all -> 0x0059 }
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)     // Catch:{ all -> 0x0059 }
            r2.f357248e = r3     // Catch:{ all -> 0x0059 }
            monitor-exit(r2)
            return
        L_0x0059:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9885a.C130346j.m212790e(com.google.android.libraries.search.assistant.invocation.o.a.bp):void");
    }

    /* renamed from: a */
    public final synchronized void mo106971a() {
        ((C59052c) ((C59052c) f357244a.mo56224b()).mo56372aa(39419)).mo56386p("Invalidate app control data");
        this.f357248e.ifPresent(C130343g.f357242a);
        this.f357248e = Optional.empty();
    }

    /* renamed from: b */
    public final synchronized void mo106972b(String str) {
        ((C59052c) ((C59052c) f357244a.mo56224b()).mo56372aa(39420)).mo56386p("Set foreground activity id");
        this.f357249f = Optional.m71637of(C60856cj.m92900i(new C130347k(3, str, BuildConfig.FLAVOR, BuildConfig.FLAVOR)));
    }

    /* renamed from: c */
    public final synchronized C60870cx mo106973c(C34053bp bpVar) {
        C59071e eVar = f357244a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39417)).mo56386p("Fetch app control context");
        m212790e(bpVar);
        if (!this.f357248e.isPresent()) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(39418)).mo56386p("Cache should not be empty.");
            return C60856cj.m92900i(C130348b.m212798a().mo109666a());
        }
        return (C60870cx) this.f357248e.get();
    }
}
