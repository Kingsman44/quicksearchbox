package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122468w;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122109a;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122119d;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9261a.C122113d;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9261a.C122114e;
import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.libraries.search.assistant.appactions.p2502b.C32487a;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32493f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.p */
/* compiled from: PG */
public final class C120632p implements C122108a {

    /* renamed from: a */
    public static final C59071e f335540a = C59071e.m91331h();

    /* renamed from: b */
    public final C119935d f335541b;

    /* renamed from: c */
    private final C71422aw f335542c;

    /* renamed from: d */
    private final Executor f335543d;

    /* renamed from: e */
    private final C71604be f335544e;

    /* renamed from: f */
    private final C122114e f335545f;

    public C120632p(C119935d dVar, C120626j jVar, C120635s sVar, C71422aw awVar, Executor executor) {
        C69664n.m101061g(dVar, "contextProvider");
        C69664n.m101061g(jVar, "onDeviceContextConversationParamsFetcher");
        C69664n.m101061g(sVar, "onDeviceContextGenericContextFetcher");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f335541b = dVar;
        this.f335542c = awVar;
        this.f335543d = executor;
        this.f335544e = C71803m.m105042c(awVar, (C69585o) null, C71424ay.LAZY, new C120629m(this, (C69577g) null), 1);
        C58490gz gzVar = new C58490gz(4);
        C122113d.m201649c(new C122109a("media"), new C120625i(jVar, "media"), gzVar);
        C122113d.m201649c(new C122109a("alarm"), new C120625i(jVar, "alarm"), gzVar);
        C122113d.m201649c(new C122109a("timer"), new C120625i(jVar, "timer"), gzVar);
        C122119d dVar2 = C122468w.f339527c;
        Integer num = C32487a.f87058a;
        C69664n.m101060f(num, "GENERIC_CONTEXT_ID");
        int intValue = num.intValue();
        C62940bt btVar = C32493f.f87068e;
        C69664n.m101060f(btVar, "shortcutsContextResponseExt");
        C69664n.m101061g(btVar, "genericExtension");
        C122113d.m201648b(dVar2, new C120630n(new C120634r(sVar, intValue, btVar)), gzVar);
        this.f335545f = C122113d.m201647a(gzVar);
    }

    /* renamed from: a */
    public final C60870cx mo22397a(C122099h hVar) {
        C69664n.m101061g(hVar, "request");
        C60870cx a = this.f335545f.mo105537a(hVar);
        C120627k kVar = new C120627k(hVar);
        return C60846c.m92878g(a, IllegalArgumentException.class, C47810es.m84963c(kVar), this.f335543d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104860b(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120628l
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.platform.f.f.d.a.l r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120628l) r0
            int r1 = r0.f335533c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335533c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.f.d.a.l r0 = new com.google.android.apps.search.assistant.platform.f.f.d.a.l
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f335531a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335533c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x003d
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            kotlinx.coroutines.be r5 = r4.f335544e
            r0.f335533c = r3
            java.lang.Object r5 = r5.mo62825a(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.google.android.apps.search.assistant.platform.b.b.f r5 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f) r5
            com.google.assistant.e.j.ex r5 = r5.mo104571a()
            java.lang.String r0 = "initialRequestContextAsy…wait().conversationParams"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120632p.mo104860b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104861c(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120631o
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.platform.f.f.d.a.o r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120631o) r0
            int r1 = r0.f335539c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335539c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.f.d.a.o r0 = new com.google.android.apps.search.assistant.platform.f.f.d.a.o
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f335537a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335539c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x003d
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            kotlinx.coroutines.be r5 = r4.f335544e
            r0.f335539c = r3
            java.lang.Object r5 = r5.mo62825a(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.google.android.apps.search.assistant.platform.b.b.f r5 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f) r5
            j$.util.Optional r5 = r5.mo104573c()
            java.lang.String r0 = "initialRequestContextAsync.await().userAgent"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120632p.mo104861c(h.c.g):java.lang.Object");
    }
}
