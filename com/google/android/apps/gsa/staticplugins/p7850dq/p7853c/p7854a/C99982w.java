package com.google.android.apps.gsa.staticplugins.p7850dq.p7853c.p7854a;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85337f;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85350s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.android.libraries.p11016ak.C147620aa;
import com.google.android.libraries.p11016ak.C147724f;
import com.google.android.libraries.p11016ak.C147744z;
import com.google.android.libraries.p11016ak.p11022d.C147703a;
import com.google.android.libraries.p11016ak.p11022d.C147711i;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.dq.c.a.w */
/* compiled from: PG */
public final class C99982w extends C86734a implements C85350s {

    /* renamed from: a */
    private final String f279649a;

    /* renamed from: b */
    private final C86124t f279650b;

    /* renamed from: c */
    private final C147620aa f279651c;

    /* renamed from: f */
    private final C85337f f279652f;

    /* renamed from: g */
    private final Map f279653g = new HashMap();

    public C99982w(String str, C147620aa aaVar, C85337f fVar, C86124t tVar) {
        super(C118575h.WORKER_SPEAKR, "speakr");
        this.f279649a = str;
        this.f279651c = aaVar;
        this.f279652f = fVar;
        this.f279650b = tVar;
    }

    /* renamed from: p */
    private final synchronized C99960a m165639p(String str) {
        return (C99960a) Map.EL.computeIfAbsent(this.f279653g, str, C99961b.f279624a);
    }

    /* renamed from: u */
    private final synchronized C60870cx m165640u(C147620aa aaVar, C52582xb xbVar) {
        return this.f279652f.mo78880a(aaVar, xbVar);
    }

    /* renamed from: v */
    private static C60870cx m165641v(C60870cx cxVar) {
        return C60846c.m92879h(C60846c.m92879h(cxVar, RuntimeException.class, C99968i.f279632a, C60826bg.f164896a), C147711i.class, C99969j.f279633a, C60826bg.f164896a);
    }

    /* renamed from: w */
    private final C60870cx m165642w(String str, C58817ah ahVar) {
        C99960a p = m165639p(str);
        if (!p.f279620a.mo56113h()) {
            return m165644y(str);
        }
        C60870cx g = C60922j.m93044g(p.mo91686b(), ahVar, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return m165641v(g);
    }

    /* renamed from: x */
    private final C60870cx m165643x(String str, C60931s sVar) {
        C99960a p = m165639p(str);
        if (!p.f279620a.mo56113h()) {
            return m165644y(str);
        }
        C60870cx h = C60922j.m93045h(p.mo91686b(), sVar, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return m165641v(h);
    }

    /* renamed from: y */
    private static C60870cx m165644y(String str) {
        return C60856cj.m92899h(new C147703a("No Readaloud object was set for session: ".concat(String.valueOf(str))));
    }

    /* renamed from: z */
    private final String m165645z(C85343l lVar) {
        return String.format("%s.%s", new Object[]{lVar.f231132d, this.f279649a});
    }

    /* renamed from: a */
    public final C60870cx mo78866a(String str) {
        return m165642w(str, C99975p.f279642a);
    }

    /* renamed from: b */
    public final C60870cx mo78867b(String str, int i, int i2) {
        return m165643x(str, new C99964e(i, i2));
    }

    /* renamed from: c */
    public final C60870cx mo78868c() {
        return C60856cj.m92900i("android.2.0.0");
    }

    /* renamed from: d */
    public final C60870cx mo78869d(String str) {
        return m165642w(str, C99970k.f279634a);
    }

    /* renamed from: e */
    public final C60870cx mo78870e(String str) {
        return m165642w(str, C99979t.f279646a);
    }

    /* renamed from: f */
    public final C60870cx mo78871f(String str, int i) {
        return m165643x(str, new C99980u(i));
    }

    /* renamed from: g */
    public final C60870cx mo78872g(String str, int i) {
        return m165643x(str, new C99971l(i));
    }

    /* renamed from: h */
    public final C60870cx mo78873h(String str) {
        C99960a p = m165639p(str);
        if (!p.f279620a.mo56113h()) {
            return m165644y(str);
        }
        C60870cx g = C60922j.m93044g(p.mo91686b(), C99963d.f279626a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return m165641v(g);
    }

    /* renamed from: i */
    public final C60870cx mo78874i(String str) {
        return m165642w(str, C99977r.f279644a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0053, code lost:
        if (((com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l) r8.build()).equals(r1.build()) != false) goto L_0x010d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78875j(java.lang.String r6, com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l r7, com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85341j r8, com.google.assistant.p3897e.p3921j.C52582xb r9) {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.dq.c.a.a r0 = r5.m165639p(r6)
            int r8 = r8.f231126b
            int r8 = com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85340i.m136803a(r8)
            if (r8 != 0) goto L_0x000d
            goto L_0x0057
        L_0x000d:
            r1 = 3
            if (r8 != r1) goto L_0x0057
            com.google.common.base.ax r8 = r0.f279620a
            boolean r8 = r8.mo56113h()
            if (r8 == 0) goto L_0x0057
            com.google.android.apps.gsa.search.core.al.dd.l r8 = r0.f279622c
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.android.apps.gsa.search.core.al.dd.k r8 = (com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85342k) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.gsa.search.core.al.dd.l r1 = (com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l) r1
            int r2 = r1.f231129a
            r2 = r2 & -3
            r1.f231129a = r2
            r2 = 0
            r1.f231131c = r2
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.apps.gsa.search.core.al.dd.l r8 = (com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l) r8
            com.google.protobuf.bn r1 = r7.toBuilder()
            com.google.android.apps.gsa.search.core.al.dd.k r1 = (com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85342k) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.search.core.al.dd.l r3 = (com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l) r3
            int r4 = r3.f231129a
            r4 = r4 & -3
            r3.f231129a = r4
            r3.f231131c = r2
            com.google.protobuf.bv r1 = r1.build()
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0057
            goto L_0x010d
        L_0x0057:
            com.google.android.libraries.ak.aa r8 = r5.f279651c
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.android.libraries.ak.z r8 = (com.google.android.libraries.p11016ak.C147744z) r8
            java.lang.String r1 = r5.m165645z(r7)
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.android.libraries.ak.aa r2 = (com.google.android.libraries.p11016ak.C147620aa) r2
            r1.getClass()
            r2.f398442g = r1
            int r1 = r7.f231135g
            int r1 = com.google.android.libraries.p11016ak.C147724f.m240801b(r1)
            if (r1 != 0) goto L_0x0078
            r1 = 2
        L_0x0078:
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.android.libraries.ak.aa r2 = (com.google.android.libraries.p11016ak.C147620aa) r2
            int r1 = com.google.android.libraries.p11016ak.C147724f.m240800a(r1)
            r2.f398445j = r1
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.ak.aa r8 = (com.google.android.libraries.p11016ak.C147620aa) r8
            com.google.android.libraries.ak.y r1 = com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85331i.m136800b(r7)
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.android.libraries.ak.x r1 = (com.google.android.libraries.p11016ak.C147742x) r1
            com.google.android.apps.gsa.search.core.i.t r2 = r5.f279650b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90125fw.f250914ad
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x00c5
            java.lang.String r2 = r7.f231133e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00a8
            goto L_0x00c5
        L_0x00a8:
            d.b.a.a.bq r2 = p5285d.p5290b.p5291a.p5292a.C68181bq.f184490b
            com.google.protobuf.bn r2 = r2.createBuilder()
            d.b.a.a.bp r2 = (p5285d.p5290b.p5291a.p5292a.C68180bp) r2
            java.lang.String r3 = r7.f231133e
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            d.b.a.a.bq r4 = (p5285d.p5290b.p5291a.p5292a.C68181bq) r4
            r3.getClass()
            r4.f184492a = r3
            com.google.protobuf.bv r2 = r2.build()
            d.b.a.a.bq r2 = (p5285d.p5290b.p5291a.p5292a.C68181bq) r2
            goto L_0x00c7
        L_0x00c5:
            d.b.a.a.bq r2 = p5285d.p5290b.p5291a.p5292a.C68181bq.f184490b
        L_0x00c7:
            d.b.a.a.bq r3 = p5285d.p5290b.p5291a.p5292a.C68181bq.f184490b
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00db
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.ak.y r3 = (com.google.android.libraries.p11016ak.C147743y) r3
            r2.getClass()
            r3.f398679b = r2
        L_0x00db:
            com.google.android.apps.gsa.search.core.al.dd.f r2 = r5.f279652f
            com.google.common.util.concurrent.cx r8 = r2.mo78880a(r8, r9)
            r0.mo91688d()
            r0.f279622c = r7
            com.google.android.apps.gsa.staticplugins.dq.c.a.g r7 = new com.google.android.apps.gsa.staticplugins.dq.c.a.g
            r7.<init>(r1)
            com.google.common.util.concurrent.bg r9 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93045h(r8, r7, r9)
            com.google.android.apps.gsa.shared.s.a.a r8 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r7)
            r0.f279620a = r8
            com.google.common.util.concurrent.SettableFuture r8 = r0.f279621b
            r8.mo57358p(r7)
            com.google.android.apps.gsa.staticplugins.dq.c.a.v r8 = new com.google.android.apps.gsa.staticplugins.dq.c.a.v
            r8.<init>(r0)
            com.google.common.util.concurrent.bg r9 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r7, r8, r9)
            java.util.Map r7 = r5.f279653g
            r7.put(r6, r0)
        L_0x010d:
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60866ct.f164955a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7850dq.p7853c.p7854a.C99982w.mo78875j(java.lang.String, com.google.android.apps.gsa.search.core.al.dd.l, com.google.android.apps.gsa.search.core.al.dd.j, com.google.assistant.e.j.xb):com.google.common.util.concurrent.cx");
    }

    /* renamed from: k */
    public final C60870cx mo78876k(String str) {
        m165639p(str).mo91688d();
        return C60866ct.f164955a;
    }

    /* renamed from: l */
    public final C60870cx mo78877l(C85343l lVar, C52582xb xbVar) {
        C147744z zVar = (C147744z) this.f279651c.toBuilder();
        String z = m165645z(lVar);
        zVar.copyOnWrite();
        z.getClass();
        ((C147620aa) zVar.instance).f398442g = z;
        int b = C147724f.m240801b(lVar.f231135g);
        if (b == 0) {
            b = 2;
        }
        zVar.copyOnWrite();
        ((C147620aa) zVar.instance).f398445j = C147724f.m240800a(b);
        C60870cx h = C60922j.m93045h(m165640u((C147620aa) zVar.build(), xbVar), new C99974o(lVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: m */
    public final C60870cx mo78878m(String str, C119103al alVar) {
        boolean h;
        SettableFuture settableFuture = new SettableFuture();
        C99960a p = m165639p(str);
        Object obj = new Object();
        C99973n nVar = new C99973n(p, alVar, obj, settableFuture);
        synchronized (p) {
            h = p.f279620a.mo56113h();
            p.f279623d.put(obj, nVar);
        }
        if (h) {
            nVar.run();
        }
        return settableFuture;
    }

    /* renamed from: n */
    public final C60870cx mo78879n(C52582xb xbVar) {
        C147744z zVar = (C147744z) this.f279651c.toBuilder();
        zVar.copyOnWrite();
        ((C147620aa) zVar.instance).f398445j = C147724f.m240800a(3);
        C60870cx h = C60922j.m93045h(m165640u((C147620aa) zVar.build(), xbVar), C99967h.f279631a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return m165641v(h);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return this.f279650b.mo79746e(C90125fw.f250909Z);
    }
}
