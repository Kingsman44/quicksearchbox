package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.io.Closeable;
import kotlinx.coroutines.p5574b.C71547cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.aa */
/* compiled from: PG */
public final class C126373aa implements Closeable {

    /* renamed from: a */
    public final C71547cx f348071a;

    /* renamed from: b */
    private final C37402bg f348072b;

    /* renamed from: c */
    private final C37400be f348073c;

    public C126373aa(C37402bg bgVar, C37400be beVar, C71547cx cxVar) {
        C69664n.m101061g(bgVar, "session");
        C69664n.m101061g(cxVar, "stream");
        this.f348072b = bgVar;
        this.f348073c = beVar;
        this.f348071a = cxVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107572a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126410z
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.e.a.z r0 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126410z) r0
            int r1 = r0.f348164c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f348164c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.e.a.z r0 = new com.google.android.apps.search.assistant.surfaces.e.a.z
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f348162a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f348164c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0057
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.search.c.be r5 = r4.f348073c
            com.google.common.base.ax r5 = r5.mo40932d()
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x0079
            com.google.android.libraries.search.c.be r5 = r4.f348073c
            com.google.common.base.ax r5 = r5.mo40932d()
            java.lang.Object r5 = r5.mo56107c()
            java.lang.String r2 = "result.firstByteReadResult.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            com.google.common.util.concurrent.cx r5 = (com.google.common.util.concurrent.C60870cx) r5
            r0.f348164c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 == r1) goto L_0x0078
        L_0x0057:
            com.google.android.libraries.search.c.bb r5 = (com.google.android.libraries.search.p2904c.C37397bb) r5
            int r0 = r5.f99322a
            r0 = r0 & r3
            if (r0 == 0) goto L_0x006e
            long r0 = r5.f99323b
            j$.time.Duration r5 = p3186j$.time.Duration.ofMillis(r0)
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            java.lang.String r0 = "{\n          Optional.of(…Ms)\n          )\n        }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            goto L_0x0082
        L_0x006e:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            java.lang.String r0 = "{\n          Optional.empty()\n        }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            goto L_0x0082
        L_0x0078:
            return r1
        L_0x0079:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            java.lang.String r0 = "{\n        Optional.empty()\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
        L_0x0082:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126373aa.mo107572a(h.c.g):java.lang.Object");
    }

    public final void close() {
        C59052c cVar = (C59052c) C126376ad.f348081a.mo56224b();
        cVar.mo56379ah(new C59094n(38890));
        cVar.mo56386p("Session#close");
        this.f348072b.mo20354a();
    }
}
