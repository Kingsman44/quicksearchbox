package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9026d.p9027a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9026d.C119717a;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.android.libraries.search.assistant.p2703l.C34798l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.c.d.a.g */
/* compiled from: PG */
public final class C119724g implements C119717a {

    /* renamed from: a */
    public static final C59071e f333543a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.b.a.b.c.d.a.g");

    /* renamed from: b */
    public final C34798l f333544b;

    /* renamed from: c */
    public final Executor f333545c;

    /* renamed from: d */
    public final C32534ai f333546d;

    /* renamed from: e */
    public C34793g f333547e;

    /* renamed from: f */
    public final C33447g f333548f;

    /* renamed from: g */
    private final Executor f333549g;

    /* renamed from: h */
    private final AtomicBoolean f333550h = new AtomicBoolean(false);

    public C119724g(C33447g gVar, C34798l lVar, Executor executor) {
        this.f333548f = gVar;
        this.f333544b = lVar;
        this.f333545c = executor;
        this.f333549g = new C60904dr(executor);
        this.f333546d = new C32534ai(executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r3 != 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if ((r0.f133266a & 128) != 0) goto L_0x00a9;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m198638d(com.google.speech.p5208h.C66611ci r5) {
        /*
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66629d.f181275b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r5.mo58887l(r0)
            com.google.protobuf.bf r1 = r5.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L_0x0016
            goto L_0x0051
        L_0x0016:
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66629d.f181275b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r5.mo58887l(r0)
            com.google.protobuf.bf r3 = r5.f169962ag
            com.google.protobuf.bs r4 = r0.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x002c
            java.lang.Object r0 = r0.f169969b
            goto L_0x0030
        L_0x002c:
            java.lang.Object r0 = r0.mo58889c(r3)
        L_0x0030:
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            int r3 = r0.f133266a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x004a
            com.google.assistant.e.e.a.i r3 = r0.f133270e
            if (r3 != 0) goto L_0x003e
            com.google.assistant.e.e.a.i r3 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e
        L_0x003e:
            int r3 = r3.f133263d
            int r3 = com.google.assistant.p3897e.p3910e.p3911a.C51193h.m86083a(r3)
            if (r3 != 0) goto L_0x0047
            goto L_0x004a
        L_0x0047:
            if (r3 != r1) goto L_0x004a
            goto L_0x0051
        L_0x004a:
            int r0 = r0.f133266a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0051
            goto L_0x00a9
        L_0x0051:
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67186ad.f182611f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r5.mo58887l(r0)
            com.google.protobuf.bf r3 = r5.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            if (r0 != 0) goto L_0x00a9
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3910e.p3911a.C51197l.f133283f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r5.mo58887l(r0)
            com.google.protobuf.bf r3 = r5.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            if (r0 != 0) goto L_0x00a9
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67238p.f182737f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r5.mo58887l(r0)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r5 = r5.mo58854l(r3)
            if (r5 != 0) goto L_0x008d
            java.lang.Object r5 = r0.f169969b
            goto L_0x0091
        L_0x008d:
            java.lang.Object r5 = r0.mo58889c(r5)
        L_0x0091:
            com.google.speech.k.a.p r5 = (com.google.speech.p5224k.p5225a.C67238p) r5
            int r0 = r5.f182740b
            if (r0 != r2) goto L_0x00a7
            java.lang.Object r5 = r5.f182741c
            com.google.speech.recognizer.a.ag r5 = (com.google.speech.recognizer.p5233a.C67438ag) r5
            int r5 = r5.f183259b
            int r5 = com.google.speech.recognizer.p5233a.C67437af.m97466a(r5)
            if (r5 != 0) goto L_0x00a4
            goto L_0x00a7
        L_0x00a4:
            if (r5 != r1) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r5 = 0
            return r5
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9026d.p9027a.C119724g.m198638d(com.google.speech.h.ci):boolean");
    }

    /* renamed from: a */
    public final C60870cx mo104485a(C51809dy dyVar) {
        C119720c cVar = new C119720c(this, dyVar);
        return C60856cj.m92904m(C47810es.m84978r(cVar), this.f333549g);
    }

    /* renamed from: b */
    public final void mo104486b(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        this.f333550h.set(true);
        this.f333546d.mo38135c(th);
    }

    /* renamed from: c */
    public final void mo104487c(C66611ci ciVar) {
        if (!this.f333550h.get() && m198638d(ciVar)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f333546d.mo38137d(ciVar);
        }
    }
}
