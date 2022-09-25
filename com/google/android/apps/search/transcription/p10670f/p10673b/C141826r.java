package com.google.android.apps.search.transcription.p10670f.p10673b;

import com.google.android.apps.search.transcription.C141741b;
import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.android.apps.search.transcription.p10670f.C141803av;
import com.google.android.apps.search.transcription.p10670f.C141804aw;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.transcription.f.b.r */
/* compiled from: PG */
public final class C141826r {

    /* renamed from: a */
    public static final C59071e f384886a = C59071e.m91332i("com.google.android.apps.search.transcription.f.b.r");

    /* renamed from: b */
    public final C37215b f384887b;

    /* renamed from: c */
    public final C60887da f384888c;

    /* renamed from: d */
    public final C141804aw f384889d;

    /* renamed from: e */
    public final C141741b f384890e;

    /* renamed from: f */
    public final long f384891f;

    /* renamed from: g */
    public C60870cx f384892g;

    /* renamed from: h */
    public C141803av f384893h;

    /* renamed from: i */
    private final C46778cv f384894i;

    /* renamed from: j */
    private C141832x f384895j = C141832x.m230155k().mo116762a();

    public C141826r(C46778cv cvVar, C60887da daVar, C37215b bVar, C141804aw awVar, C141741b bVar2) {
        this.f384894i = cvVar;
        this.f384888c = daVar;
        this.f384887b = bVar;
        this.f384889d = awVar;
        this.f384890e = bVar2;
        this.f384891f = bVar2.f384722b;
    }

    /* renamed from: b */
    public static String m230134b(long j) {
        return "Transcription:transcriptionState:" + j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        return false;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m230135h() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.search.transcription.f.b.x r0 = r2.f384895j     // Catch:{ all -> 0x0021 }
            com.google.android.apps.search.transcription.b.b r0 = r0.mo116774c()     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r0 == 0) goto L_0x000c
            monitor-exit(r2)
            return r1
        L_0x000c:
            com.google.android.apps.search.transcription.f.b.x r0 = r2.f384895j     // Catch:{ all -> 0x0021 }
            com.google.android.apps.search.transcription.f.o r0 = r0.mo116775d()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            com.google.android.apps.search.transcription.f.b.x r0 = r2.f384895j     // Catch:{ all -> 0x0021 }
            android.net.Uri r0 = r0.mo116773b()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x001f:
            monitor-exit(r2)
            return r1
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.transcription.p10670f.p10673b.C141826r.m230135h():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C141832x mo116788a() {
        return this.f384895j;
    }

    /* renamed from: c */
    public final synchronized void mo116789c(C141760s sVar) {
        if (!m230135h()) {
            mo116792f(new C141815g(sVar));
            this.f384887b.mo19974a(C37206a.f98780c.mo40808f("requestId", Long.toString(this.f384891f)).mo40780d(sVar.f384731a.mo116703a(), sVar.f384731a.mo116704c()));
        }
    }

    /* renamed from: d */
    public final void mo116790d(String str, C60870cx cxVar) {
        C141825q qVar = new C141825q(this, str);
        C60856cj.m92911t(cxVar, C47810es.m84974n(qVar), this.f384888c);
    }

    /* renamed from: e */
    public final void mo116791e() {
        this.f384887b.mo19974a(C37206a.f98780c.mo40808f("requestId", Long.toString(this.f384890e.f384722b)).mo40781e(C62722b.OK));
    }

    /* renamed from: f */
    public final synchronized void mo116792f(Function function) {
        C141832x xVar = (C141832x) function.apply(this.f384895j);
        if (!xVar.equals(this.f384895j)) {
            this.f384895j = xVar;
            this.f384894i.mo50787a(C60866ct.f164955a, m230134b(this.f384891f));
            ((C59052c) ((C59052c) f384886a.mo56224b()).mo56372aa(41927)).mo56353F("updated TranscriptionState: %s for request-id %d", xVar, this.f384891f);
        }
    }

    /* renamed from: g */
    public final synchronized boolean mo116793g(Function function) {
        mo116792f(function);
        return m230135h();
    }
}
