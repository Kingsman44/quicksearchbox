package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.ak */
/* compiled from: PG */
public final class C122990ak implements C122985af {

    /* renamed from: a */
    public static final C59071e f340528a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.ak");

    /* renamed from: b */
    private final C47632e f340529b = new C47632e();

    /* renamed from: c */
    private List f340530c = new ArrayList();

    /* renamed from: a */
    public final synchronized void mo105812a(C123057e eVar) {
        List list = this.f340530c;
        if (list == null) {
            ((C59052c) ((C59052c) f340528a.mo56225c()).mo56372aa(35122)).mo56386p("Close registered after closeAll. Will run inline.");
            C123047cn.m202382b(eVar.mo105810a(), C122986ag.f340524a, C60826bg.f164896a);
            return;
        }
        list.add(eVar);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this) {
            List list = this.f340530c;
            if (list != null && !list.isEmpty()) {
                C123047cn.m202382b(mo105813b(), C122989aj.f340527a, C60826bg.f164896a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r2 < 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r3 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123057e) r0.get(r2);
        r4 = r6.f340529b;
        p3186j$.util.Objects.requireNonNull(r3);
        r1 = com.google.common.util.concurrent.C60922j.m93045h(r1, com.google.apps.tiktok.tracing.C47810es.m84966f(new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122988ai(r4.mo51512b(new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122987ah(r3), com.google.common.util.concurrent.C60826bg.f164896a))), com.google.common.util.concurrent.C60826bg.f164896a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r1 = com.google.common.util.concurrent.C60866ct.f164955a;
        r2 = r0.size();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo105813b() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r0 = r6.f340530c     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0012
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "Double call to closeAll"
            r0.<init>(r1)     // Catch:{ all -> 0x0047 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)     // Catch:{ all -> 0x0047 }
            monitor-exit(r6)     // Catch:{ all -> 0x0047 }
            return r0
        L_0x0012:
            r1 = 0
            r6.f340530c = r1     // Catch:{ all -> 0x0047 }
            monitor-exit(r6)     // Catch:{ all -> 0x0047 }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            int r2 = r0.size()
        L_0x001c:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0046
            java.lang.Object r3 = r0.get(r2)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.e r3 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123057e) r3
            com.google.apps.tiktok.tracing.contrib.b.e r4 = r6.f340529b
            p3186j$.util.Objects.requireNonNull(r3)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.ah r5 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.ah
            r5.<init>(r3)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r3 = r4.mo51512b(r5, r3)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.ai r4 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.ai
            r4.<init>(r3)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.s r4 = com.google.apps.tiktok.tracing.C47810es.m84966f(r4)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r1, r4, r3)
            goto L_0x001c
        L_0x0046:
            return r1
        L_0x0047:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x004a:
            throw r0
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122990ak.mo105813b():com.google.common.util.concurrent.cx");
    }
}
