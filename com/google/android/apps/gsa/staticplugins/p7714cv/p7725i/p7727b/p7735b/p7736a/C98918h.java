package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85386a;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.p6876h.C87105a;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.p7066m.C89996bb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.h */
/* compiled from: PG */
public final class C98918h implements C84352a {

    /* renamed from: a */
    public static final C59071e f276444a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.h");

    /* renamed from: b */
    private final C85392b f276445b;

    /* renamed from: c */
    private final Context f276446c;

    /* renamed from: d */
    private final SharedPreferences f276447d;

    /* renamed from: e */
    private final C22871g f276448e;

    /* renamed from: f */
    private final C68214a f276449f;

    /* renamed from: g */
    private final C86124t f276450g;

    /* renamed from: h */
    private boolean f276451h;

    /* renamed from: i */
    private C60870cx f276452i = C118826c.f331423b;

    public C98918h(C85392b bVar, Context context, SharedPreferences sharedPreferences, C68214a aVar, C22871g gVar, C86124t tVar) {
        this.f276445b = bVar;
        this.f276446c = context;
        this.f276447d = sharedPreferences;
        this.f276448e = gVar;
        this.f276449f = aVar;
        this.f276450g = tVar;
    }

    /* renamed from: h */
    private final synchronized void m163907h() {
        if (!this.f276452i.isDone()) {
            this.f276452i.cancel(true);
        }
    }

    /* renamed from: i */
    private final synchronized void m163908i() {
        this.f276448e.mo28211k(this.f276452i, "Tts done future", new C98916f(this));
    }

    /* renamed from: j */
    private final synchronized void m163909j() {
        if (!this.f276451h) {
            this.f276451h = true;
        }
    }

    /* renamed from: k */
    private final synchronized void m163910k() {
        m163907h();
        mo77890d();
        mo91339f();
    }

    /* renamed from: l */
    private final synchronized C60870cx m163911l(Query query, int i, C90606n nVar, TtsRequest ttsRequest, C85386a aVar) {
        synchronized (this) {
            Query query2 = query;
            if (C87105a.m140757a(this.f276446c, query, this.f276447d)) {
                m163907h();
                aVar.mo77892a();
                C60870cx cxVar = C118826c.f331423b;
                return cxVar;
            }
            if (this.f276451h) {
                m163910k();
            }
            C58495hd r = this.f276450g.mo79752r(C89996bb.f246773c);
            long parseLong = r.get("tts_playback") != null ? Long.parseLong((String) r.get("tts_playback")) : 0;
            if (parseLong > 0) {
                C60870cx c = this.f276448e.mo28203c("CarTtsPlaybackHelperImpl#startTtsPlayback", parseLong, new C98915e(this, query, i, nVar, ttsRequest, aVar));
                return c;
            }
            C60870cx g = mo91340g(query, i, nVar, ttsRequest, aVar);
            return g;
        }
    }

    /* renamed from: a */
    public final C60870cx mo77887a(Query query, TtsRequest ttsRequest, C85386a aVar) {
        return m163911l(query, 2, (C90606n) null, ttsRequest, aVar);
    }

    /* renamed from: b */
    public final C60870cx mo77888b(Query query, TtsRequest ttsRequest, C85386a aVar) {
        return m163911l(query, 4, (C90606n) null, ttsRequest, aVar);
    }

    /* renamed from: c */
    public final C60870cx mo77889c(Query query, C90606n nVar, C85386a aVar) {
        return m163911l(query, 3, nVar, (TtsRequest) null, aVar);
    }

    /* renamed from: d */
    public final void mo77890d() {
        this.f276445b.mo78914c();
    }

    /* renamed from: e */
    public final synchronized boolean mo77891e() {
        return this.f276451h;
    }

    /* renamed from: f */
    public final synchronized void mo91339f() {
        if (this.f276451h) {
            this.f276451h = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.util.concurrent.C60870cx mo91340g(com.google.android.apps.gsa.shared.search.Query r14, int r15, com.google.android.apps.gsa.shared.speech.C90606n r16, com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r17, com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85386a r18) {
        /*
            r13 = this;
            r1 = r13
            r0 = r17
            monitor-enter(r13)
            r13.m163909j()     // Catch:{ all -> 0x008f }
            com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.g r12 = new com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.g     // Catch:{ all -> 0x008f }
            r2 = r18
            r12.<init>(r2)     // Catch:{ all -> 0x008f }
            com.google.android.apps.gsa.search.core.al.dl.b r2 = r1.f276445b     // Catch:{ all -> 0x008f }
            if (r16 != 0) goto L_0x005a
            if (r0 != 0) goto L_0x0015
            goto L_0x005a
        L_0x0015:
            java.lang.String r3 = r0.f236285i     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0026
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x008f }
            if (r3 != 0) goto L_0x0026
            java.lang.String r3 = r0.f236285i     // Catch:{ all -> 0x008f }
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ all -> 0x008f }
            goto L_0x005c
        L_0x0026:
            com.google.speech.k.a.ah r3 = r0.f236280d     // Catch:{ all -> 0x008f }
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90833j(r3)     // Catch:{ all -> 0x008f }
            boolean r4 = r4.mo56113h()     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x0057
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r3)     // Catch:{ all -> 0x008f }
            java.lang.Object r3 = r3.mo56107c()     // Catch:{ all -> 0x008f }
            com.google.speech.k.a.ah r3 = (com.google.speech.p5224k.p5225a.C67190ah) r3     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r3.f182632k     // Catch:{ all -> 0x008f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x008f }
            if (r3 != 0) goto L_0x0057
            com.google.speech.k.a.ah r3 = r0.f236280d     // Catch:{ all -> 0x008f }
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r3)     // Catch:{ all -> 0x008f }
            java.lang.Object r3 = r3.mo56107c()     // Catch:{ all -> 0x008f }
            com.google.speech.k.a.ah r3 = (com.google.speech.p5224k.p5225a.C67190ah) r3     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r3.f182632k     // Catch:{ all -> 0x008f }
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ all -> 0x008f }
            goto L_0x005c
        L_0x0057:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x008f }
            goto L_0x005c
        L_0x005a:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x008f }
        L_0x005c:
            boolean r4 = r3.mo56113h()     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x006a
            java.lang.Object r3 = r3.mo56107c()     // Catch:{ all -> 0x008f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x008f }
        L_0x0068:
            r4 = r3
            goto L_0x0077
        L_0x006a:
            dagger.a r3 = r1.f276449f     // Catch:{ all -> 0x008f }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x008f }
            com.google.android.apps.gsa.assistant.shared.bm r3 = (com.google.android.apps.gsa.assistant.shared.bm) r3     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r3.b()     // Catch:{ all -> 0x008f }
            goto L_0x0068
        L_0x0077:
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r15
            r5 = r14
            r6 = r16
            r7 = r17
            r11 = r12
            r2.mo78915d(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x008f }
            com.google.common.util.concurrent.SettableFuture r0 = r12.f276442a     // Catch:{ all -> 0x008f }
            r1.f276452i = r0     // Catch:{ all -> 0x008f }
            r13.m163908i()     // Catch:{ all -> 0x008f }
            com.google.common.util.concurrent.cx r0 = r1.f276452i     // Catch:{ all -> 0x008f }
            monitor-exit(r13)
            return r0
        L_0x008f:
            r0 = move-exception
            monitor-exit(r13)
            goto L_0x0093
        L_0x0092:
            throw r0
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a.C98918h.mo91340g(com.google.android.apps.gsa.shared.search.Query, int, com.google.android.apps.gsa.shared.speech.n, com.google.android.apps.gsa.search.shared.actions.util.TtsRequest, com.google.android.apps.gsa.search.core.al.dl.a):com.google.common.util.concurrent.cx");
    }
}
