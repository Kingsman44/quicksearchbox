package com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.a.b.b */
/* compiled from: PG */
public final class C11425b {

    /* renamed from: c */
    private static final C59071e f37185c = C59071e.m91331h();

    /* renamed from: a */
    public final C39141kp f37186a;

    /* renamed from: b */
    public boolean f37187b;

    /* renamed from: d */
    private final C87673aa f37188d;

    /* renamed from: e */
    private final C89994f f37189e;

    /* renamed from: f */
    private final C11424a f37190f = new C11424a(this);

    /* renamed from: g */
    private boolean f37191g;

    /* renamed from: h */
    private final C11430g f37192h;

    public C11425b(Context context, C39141kp kpVar, C11430g gVar, C87673aa aaVar, C89994f fVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(kpVar, "clientStreamz");
        C69664n.m101061g(aaVar, "searchServiceClient");
        C69664n.m101061g(fVar, "speechSettings");
        this.f37186a = kpVar;
        this.f37192h = gVar;
        this.f37188d = aaVar;
        this.f37189e = fVar;
    }

    /* renamed from: a */
    public final synchronized void mo19957a() {
        if (!this.f37187b) {
            mo19960d();
            mo19959c();
            this.f37186a.mo41686a(true != this.f37191g ? "HOTWORD_SETTING_OFF" : "HOTWORD_SETTING_ON");
            C11430g gVar = this.f37192h;
            C11424a aVar = this.f37190f;
            C69664n.m101061g(aVar, "listener");
            gVar.f37200a.f232790a.mo79724c(aVar);
            this.f37187b = true;
        }
    }

    /* renamed from: b */
    public final synchronized void mo19958b() {
        if (this.f37187b) {
            this.f37187b = false;
            C11430g gVar = this.f37192h;
            C11424a aVar = this.f37190f;
            C69664n.m101061g(aVar, "listener");
            gVar.f37200a.f232790a.mo79725d(aVar);
        }
    }

    /* renamed from: c */
    public final synchronized void mo19959c() {
        this.f37188d.mo81943o(this.f37191g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e A[DONT_GENERATE] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo19960d() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.apps.gsa.shared.m.b.f r0 = r5.f37189e     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.mo83820i()     // Catch:{ all -> 0x0050 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0029
            com.google.android.apps.gsa.shared.m.b.f r0 = r5.f37189e     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = r0.mo83882ab()     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.mo83824m(r3)     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0027
            com.google.android.apps.gsa.shared.m.b.f r0 = r5.f37189e     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.mo83817f()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0027
            com.google.android.apps.gsa.shared.m.b.f r0 = r5.f37189e     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.mo83822k()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0029
        L_0x0027:
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            boolean r3 = r5.f37191g     // Catch:{ all -> 0x0050 }
            if (r0 == r3) goto L_0x004e
            r5.f37191g = r0     // Catch:{ all -> 0x0050 }
            com.google.common.f.e r1 = f37185c     // Catch:{ all -> 0x0050 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0050 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0050 }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0050 }
            r4 = 43316(0xa934, float:6.0699E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x0050 }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = "evaluateHotwordParams(): Hotword enabled: %b"
            r1.mo56389s(r3, r0)     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)
            return r2
        L_0x004e:
            monitor-exit(r5)
            return r1
        L_0x0050:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b.C11425b.mo19960d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo19961e() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f37187b     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.f37191g     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x000c:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b.C11425b.mo19961e():boolean");
    }
}
