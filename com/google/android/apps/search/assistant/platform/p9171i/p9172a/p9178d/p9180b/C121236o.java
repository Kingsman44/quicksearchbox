package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9179a.C121214b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.b.o */
/* compiled from: PG */
final class C121236o {

    /* renamed from: a */
    final C121214b f336765a;

    /* renamed from: b */
    final C48714bv f336766b;

    /* renamed from: c */
    C121220ae f336767c = C121220ae.f336741f;

    /* renamed from: d */
    Optional f336768d = Optional.empty();

    /* renamed from: e */
    Instant f336769e;

    /* renamed from: f */
    final /* synthetic */ C121237p f336770f;

    public C121236o(C121237p pVar, C48714bv bvVar, C121214b bVar) {
        this.f336770f = pVar;
        this.f336766b = bvVar;
        this.f336765a = bVar;
        this.f336769e = pVar.f336774d.mo57444a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C121220ae mo105087a() {
        return this.f336767c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C48714bv mo105088b() {
        return this.f336766b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized Optional mo105089c() {
        return this.f336768d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo105090d() {
        if (this.f336768d.isPresent()) {
            ((C59052c) ((C59052c) C121237p.f336771a.mo56226d()).mo56372aa(35753)).mo56387q("Cancelling Fetch for Signal: %s", this.f336766b.f126042j);
            ((C60870cx) this.f336768d.get()).cancel(true);
            this.f336768d = Optional.empty();
        }
        this.f336769e = Instant.EPOCH;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo105091e(C121220ae aeVar) {
        this.f336767c = aeVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized boolean mo105092f() {
        return this.f336768d.isPresent();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return true;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo105093g(p3186j$.time.Instant r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.apps.search.assistant.platform.i.a.d.ae r0 = r5.f336767c     // Catch:{ all -> 0x0026 }
            long r0 = r0.f336746d     // Catch:{ all -> 0x0026 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            j$.time.Instant r0 = p3186j$.time.Instant.ofEpochMilli(r0)     // Catch:{ all -> 0x0026 }
            com.google.android.apps.search.assistant.platform.i.a.d.a.b r1 = r5.f336765a     // Catch:{ all -> 0x0026 }
            j$.time.Duration r1 = r1.mo105081a()     // Catch:{ all -> 0x0026 }
            j$.time.Instant r0 = r0.plus(r1)     // Catch:{ all -> 0x0026 }
            boolean r6 = r6.isAfter(r0)     // Catch:{ all -> 0x0026 }
            if (r6 == 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x0023:
            monitor-exit(r5)
            r6 = 1
            return r6
        L_0x0026:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b.C121236o.mo105093g(j$.time.Instant):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return true;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo105094h(p3186j$.time.Instant r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.apps.search.assistant.platform.i.a.d.ae r0 = r5.f336767c     // Catch:{ all -> 0x0026 }
            long r0 = r0.f336746d     // Catch:{ all -> 0x0026 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            j$.time.Instant r0 = p3186j$.time.Instant.ofEpochMilli(r0)     // Catch:{ all -> 0x0026 }
            com.google.android.apps.search.assistant.platform.i.a.d.a.b r1 = r5.f336765a     // Catch:{ all -> 0x0026 }
            j$.time.Duration r1 = r1.mo105082b()     // Catch:{ all -> 0x0026 }
            j$.time.Instant r0 = r0.plus(r1)     // Catch:{ all -> 0x0026 }
            boolean r6 = r6.isAfter(r0)     // Catch:{ all -> 0x0026 }
            if (r6 == 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x0023:
            monitor-exit(r5)
            r6 = 1
            return r6
        L_0x0026:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b.C121236o.mo105094h(j$.time.Instant):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        return false;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo105095i(p3186j$.time.Instant r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mo105092f()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0018
            j$.time.Instant r0 = r2.f336769e     // Catch:{ all -> 0x001b }
            j$.time.Duration r1 = com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b.C121237p.f336772b     // Catch:{ all -> 0x001b }
            j$.time.Instant r0 = r0.plus(r1)     // Catch:{ all -> 0x001b }
            boolean r3 = r3.isAfter(r0)     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)
            r3 = 1
            return r3
        L_0x0018:
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x001b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b.C121236o.mo105095i(j$.time.Instant):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return false;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo105096j(p3186j$.time.Instant r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.mo105094h(r1)     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0018
            boolean r1 = r0.mo105092f()     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x0018
            com.google.android.apps.search.assistant.platform.i.a.d.a.b r1 = r0.f336765a     // Catch:{ all -> 0x001b }
            boolean r1 = r1.mo105083c()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0018
            monitor-exit(r0)
            r1 = 1
            return r1
        L_0x0018:
            monitor-exit(r0)
            r1 = 0
            return r1
        L_0x001b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b.C121236o.mo105096j(j$.time.Instant):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final synchronized void mo105097k(Instant instant) {
        this.f336769e = instant;
        C59071e eVar = C121237p.f336771a;
        int i = this.f336766b.f126042j;
        C60870cx d = this.f336765a.mo105084d();
        C121235n nVar = new C121235n(this);
        this.f336768d = Optional.m71637of(C60922j.m93044g(d, C47810es.m84963c(nVar), this.f336770f.f336773c));
    }
}
