package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a;

import com.google.android.apps.gsa.nga.engine.am.c.bb;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74885bc;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74886bd;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.C76650p;
import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.b.a.k */
/* compiled from: PG */
public final class C76635k implements C76650p {

    /* renamed from: a */
    public static final C58974d f211894a = C58974d.m91136j();

    /* renamed from: b */
    private final C74965n f211895b;

    public C76635k(C74965n nVar) {
        this.f211895b = nVar;
    }

    /* renamed from: b */
    public static C52230ka m123259b(MessageLite messageLite) {
        C22719w wVar = new C22719w();
        wVar.mo27878e(messageLite);
        C52230ka kaVar = ((C52232kc) wVar.mo27874a().f136712a.get(0)).f137066c;
        return kaVar == null ? C52230ka.f137057d : kaVar;
    }

    /* renamed from: c */
    private final C60870cx m123260c() {
        try {
            C74886bd c = this.f211895b.mo71328c();
            if (c.mo71263b()) {
                return C60846c.m92878g(c.mo71262a(), Throwable.class, C76629e.f211888a, C60826bg.f164896a);
            }
            bb f = C74885bc.m121075f();
            if (c.mo71264c()) {
                C51446i iVar = (C51446i) C51473j.f134090i.createBuilder();
                C51419h hVar = C51419h.FIRING;
                iVar.copyOnWrite();
                C51473j jVar = (C51473j) iVar.instance;
                jVar.f134097f = hVar.f133932g;
                jVar.f134092a |= 16;
                f.b().mo55395g((C51473j) iVar.build());
            }
            if (c.mo71265d()) {
                C51588ng ngVar = (C51588ng) C51592nk.f134462k.createBuilder();
                C51591nj njVar = C51591nj.FIRING;
                ngVar.copyOnWrite();
                C51592nk nkVar = (C51592nk) ngVar.instance;
                nkVar.f134468e = njVar.f134461e;
                nkVar.f134464a |= 2;
                f.c().mo55395g((C51592nk) ngVar.build());
            }
            return C60856cj.m92900i(f.a());
        } catch (RuntimeException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo72286a(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case 3045982: goto L_0x0035;
                case 92895825: goto L_0x002b;
                case 103772132: goto L_0x0021;
                case 110364485: goto L_0x0017;
                case 1651731981: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "stopwatch"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 2
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "timer"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 3
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "media"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 0
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "alarm"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "call"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 4
            goto L_0x0040
        L_0x003f:
            r0 = -1
        L_0x0040:
            if (r0 == 0) goto L_0x00a5
            if (r0 == r5) goto L_0x0098
            if (r0 == r4) goto L_0x008b
            if (r0 == r3) goto L_0x007e
            if (r0 == r2) goto L_0x006b
            com.google.common.f.a.d r0 = f211894a
            com.google.common.f.x r0 = r0.mo56225c()
            r2 = 3617(0xe21, float:5.068E-42)
            java.lang.String r3 = "Unsupported param requested: %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56389s(r3, r7)
            java.lang.Exception r0 = new java.lang.Exception
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r1] = r7
            java.lang.String r7 = java.lang.String.format(r2, r3, r4)
            r0.<init>(r7)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            return r7
        L_0x006b:
            com.google.android.apps.gsa.nga.engine.am.u.n r7 = r6.f211895b
            com.google.android.apps.gsa.nga.engine.am.u.e r7 = r7.mo71329d()
            com.google.common.util.concurrent.cx r7 = r7.mo71324a()
            com.google.android.apps.gsa.nga.engine.o.d.b.a.j r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a.C76634j.f211893a
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r0, r1)
            return r7
        L_0x007e:
            com.google.common.util.concurrent.cx r7 = r6.m123260c()
            com.google.android.apps.gsa.nga.engine.o.d.b.a.i r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a.C76633i.f211892a
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r0, r1)
            return r7
        L_0x008b:
            com.google.common.util.concurrent.cx r7 = r6.m123260c()
            com.google.android.apps.gsa.nga.engine.o.d.b.a.h r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a.C76632h.f211891a
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r0, r1)
            return r7
        L_0x0098:
            com.google.common.util.concurrent.cx r7 = r6.m123260c()
            com.google.android.apps.gsa.nga.engine.o.d.b.a.g r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a.C76631g.f211890a
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r0, r1)
            return r7
        L_0x00a5:
            com.google.android.apps.gsa.nga.engine.am.u.n r7 = r6.f211895b
            com.google.android.apps.gsa.nga.engine.am.u.h r7 = r7.mo71330e()
            com.google.common.util.concurrent.cx r7 = r7.mo71325a()
            com.google.android.apps.gsa.nga.engine.o.d.b.a.d r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a.C76628d.f211887a
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r0, r1)
            com.google.android.apps.gsa.nga.engine.o.d.b.a.f r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a.C76630f.f211889a
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a.C76635k.mo72286a(java.lang.String):com.google.common.util.concurrent.cx");
    }
}
