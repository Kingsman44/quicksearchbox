package com.google.android.apps.gsa.staticplugins.chime.p7660e;

import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e;
import com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136748z;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7973qv;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4345d.C57041t;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56966b;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56968d;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57000j;
import com.google.p4283bv.p4354e.p4356b.C57052a;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.e.j */
/* compiled from: PG */
public final class C97692j implements C97687e {

    /* renamed from: a */
    public static final /* synthetic */ int f272787a = 0;

    /* renamed from: b */
    private static final C58528ij f272788b = C58528ij.m90013M(C7681g.DISMISS_NOTIFICATION, C7681g.CLICK_NOTIFICATION, C7681g.CLICK_NOTIFICATION_ACTION, C7681g.NOTIFICATION_UNSUBSCRIBE);

    /* renamed from: c */
    private final C68214a f272789c;

    /* renamed from: d */
    private final C68214a f272790d;

    /* renamed from: e */
    private final C90021c f272791e;

    /* renamed from: f */
    private final C22871g f272792f;

    /* renamed from: g */
    private final C91863e f272793g;

    /* renamed from: h */
    private final C86106b f272794h;

    /* renamed from: i */
    private final C136748z f272795i;

    /* renamed from: j */
    private final C21370a f272796j;

    /* renamed from: k */
    private final C86034c f272797k;

    /* renamed from: l */
    private final C39141kp f272798l;

    public C97692j(C68214a aVar, C68214a aVar2, C90021c cVar, C22871g gVar, C91863e eVar, C86106b bVar, C136748z zVar, C21370a aVar3, C86034c cVar2, C39141kp kpVar) {
        this.f272789c = aVar;
        this.f272790d = aVar2;
        this.f272791e = cVar;
        this.f272792f = gVar;
        this.f272793g = eVar;
        this.f272794h = bVar;
        this.f272795i = zVar;
        this.f272796j = aVar3;
        this.f272797k = cVar2;
        this.f272798l = kpVar;
    }

    /* renamed from: c */
    public static boolean m161938c(C7708h hVar, C56966b bVar) {
        if ((bVar.f152032a & 1) != 0) {
            C7681g a = C7681g.m22802a(hVar.f26897b);
            if (a == null) {
                a = C7681g.INVALID;
            }
            C7681g a2 = C7681g.m22802a(bVar.f152033b);
            if (a2 == null) {
                a2 = C7681g.INVALID;
            }
            if (a.equals(a2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo90791a(C56968d dVar, C56975k kVar) {
        C8178yk ykVar;
        C57052a aVar;
        if ((kVar.f152092a & 512) != 0) {
            ykVar = kVar.f152096e;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
        } else {
            ykVar = dVar.f152048k;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
        }
        if (C91863e.m150524e(ykVar)) {
            int i = kVar.f152093b;
            if (i == 9 || i == 6 || (i == 3 && this.f272791e.mo79746e(C90081ef.f249837f))) {
                C91863e eVar = this.f272793g;
                String b = this.f272794h.mo79727b();
                C57000j jVar = dVar.f152041d;
                if (jVar == null) {
                    jVar = C57000j.f152155i;
                }
                if ((jVar.f152157a & 128) != 0) {
                    C57057b bVar = jVar.f152164h;
                    if (bVar == null) {
                        bVar = C57057b.f152311e;
                    }
                    aVar = (C57052a) bVar.toBuilder();
                } else {
                    aVar = (C57052a) C57057b.f152311e.createBuilder();
                }
                C7669fo foVar = jVar.f152158b;
                if (foVar == null) {
                    foVar = C7669fo.f26633e;
                }
                aVar.copyOnWrite();
                C57057b bVar2 = (C57057b) aVar.instance;
                foVar.getClass();
                bVar2.f152314b = foVar;
                bVar2.f152313a |= 1;
                if (this.f272791e.mo79746e(C90010bp.f246944aM)) {
                    C57041t tVar = jVar.f152160d;
                    if (tVar == null) {
                        tVar = C57041t.f152278e;
                    }
                    C7973qv qvVar = tVar.f152282c;
                    if (qvVar == null) {
                        qvVar = C7973qv.f28001c;
                    }
                    aVar.copyOnWrite();
                    C57057b bVar3 = (C57057b) aVar.instance;
                    qvVar.getClass();
                    bVar3.f152315c = qvVar;
                    bVar3.f152313a |= 2;
                }
                eVar.mo86386c(ykVar, b, (C57057b) aVar.build(), true);
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02bf  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo90792b(java.util.List r31, com.google.p375ai.p378b.C7708h r32) {
        /*
            r30 = this;
            r1 = r30
            r0 = r32
            java.lang.String r2 = ""
            boolean r3 = r31.isEmpty()
            if (r3 == 0) goto L_0x000f
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        L_0x000f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r6 = r31.iterator()
        L_0x0020:
            boolean r7 = r6.hasNext()
            r9 = 2
            r10 = 0
            r11 = 1
            r12 = 0
            if (r7 == 0) goto L_0x013a
            java.lang.Object r7 = r6.next()
            com.google.android.libraries.notifications.data.r r7 = (com.google.android.libraries.notifications.data.C29827r) r7
            com.google.bv.d.b.a.d r13 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162005b(r7)
            int r14 = r13.f152038a
            r14 = r14 & 4
            if (r14 == 0) goto L_0x0062
            com.google.protobuf.cq r14 = r13.f152056s
            j$.util.stream.Stream r14 = p3186j$.util.Collection.EL.stream(r14)
            com.google.android.apps.gsa.staticplugins.chime.e.i r15 = new com.google.android.apps.gsa.staticplugins.chime.e.i
            r15.<init>(r0)
            boolean r14 = r14.noneMatch(r15)
            if (r14 == 0) goto L_0x004e
            r4.mo55395g(r7)
        L_0x004e:
            com.google.protobuf.cq r13 = r13.f152056s
            j$.util.stream.Stream r13 = p3186j$.util.Collection.EL.stream(r13)
            com.google.android.apps.gsa.staticplugins.chime.e.h r14 = new com.google.android.apps.gsa.staticplugins.chime.e.h
            r14.<init>(r0)
            boolean r13 = r13.noneMatch(r14)
            if (r13 == 0) goto L_0x0062
            r5.mo55395g(r7)
        L_0x0062:
            com.google.common.b.ij r13 = f272788b
            int r14 = r0.f26897b
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r14 != 0) goto L_0x006e
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x006e:
            boolean r13 = r13.contains(r14)
            if (r13 == 0) goto L_0x0020
            com.google.bf.b.a.a.v r13 = r7.mo35052a()
            com.google.bf.b.a.a.s r13 = r13.f146669j
            if (r13 != 0) goto L_0x007e
            com.google.bf.b.a.a.s r13 = com.google.p4160bf.p4164b.p4165a.p4166a.C55583s.f146644f
        L_0x007e:
            boolean r13 = r13.f146650e
            int r14 = r0.f26897b
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r14 != 0) goto L_0x008a
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x008a:
            com.google.ai.b.g r15 = com.google.p375ai.p378b.C7681g.CLICK_NOTIFICATION
            if (r13 == 0) goto L_0x0090
            if (r14 == r15) goto L_0x0020
        L_0x0090:
            com.google.android.apps.search.googleapp.notifications.a.b.z r13 = r1.f272795i
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r14 = r1.f272797k
            com.google.common.util.concurrent.cx r18 = r14.mo79697b()
            java.lang.String r14 = r7.mo35063j()
            com.google.common.base.ax r15 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162004a(r7)
            boolean r16 = r15.mo56113h()
            if (r16 == 0) goto L_0x00cf
            java.lang.Object r15 = r15.mo56107c()
            com.google.bv.d.b.a.d r15 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r15
            com.google.protobuf.cq r15 = r15.f152055r
            j$.util.stream.Stream r15 = p3186j$.util.Collection.EL.stream(r15)
            com.google.android.apps.gsa.staticplugins.chime.e.g r8 = new com.google.android.apps.gsa.staticplugins.chime.e.g
            r8.<init>(r0)
            j$.util.stream.Stream r8 = r15.filter(r8)
            j$.util.Optional r8 = r8.findFirst()
            java.lang.Object r8 = r8.orElse(r12)
            com.google.bv.d.b.a.v r8 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56986v) r8
            if (r8 == 0) goto L_0x00cf
            int r7 = r8.f152125c
            long r7 = (long) r7
            j$.time.Duration r7 = p3186j$.time.Duration.ofSeconds(r7)
            goto L_0x0106
        L_0x00cf:
            int r8 = r0.f26897b
            com.google.ai.b.g r8 = com.google.p375ai.p378b.C7681g.m22802a(r8)
            if (r8 != 0) goto L_0x00d9
            com.google.ai.b.g r8 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x00d9:
            com.google.android.libraries.search.logging.d.kp r15 = r1.f272798l
            int r7 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162009f(r7)
            java.lang.String r8 = r8.name()
            com.google.common.base.cr r15 = r15.f102839aW
            java.lang.Object r15 = r15.mo6453a()
            com.google.android.libraries.au.d r15 = (com.google.android.libraries.p1635au.C19567d) r15
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r7 = com.google.p4283bv.p4345d.p4346a.p4347a.C56952b.m88241a(r7)
            r9[r10] = r7
            r9[r11] = r8
            r7 = 1
            r15.mo24822a(r7, r9)
            com.google.android.apps.gsa.shared.m.c r7 = r1.f272791e
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249850s
            long r7 = r7.mo79743a(r8)
            j$.time.Duration r7 = p3186j$.time.Duration.ofSeconds(r7)
        L_0x0106:
            com.google.android.libraries.f.a r8 = r1.f272796j
            long r8 = r8.mo26870b()
            j$.time.Duration r7 = r7.plusMillis(r8)
            long r20 = r7.getSeconds()
            java.lang.String r7 = "threadId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r7)
            kotlinx.coroutines.aw r7 = r13.f372245b
            com.google.android.apps.search.googleapp.notifications.a.b.aa r8 = new com.google.android.apps.search.googleapp.notifications.a.b.aa
            r22 = 0
            r16 = r8
            r17 = r13
            r19 = r14
            r16.<init>(r17, r18, r19, r20, r22)
            r9 = 3
            kotlinx.coroutines.be r7 = kotlinx.coroutines.C71803m.m105042c(r7, r12, r12, r8, r9)
            com.google.common.util.concurrent.cx r7 = kotlinx.coroutines.p5578d.C71663i.m104688a(r7)
            com.google.common.util.concurrent.cx r7 = com.google.android.apps.gsa.p8883x.C118826c.m197213c(r7)
            r3.add(r7)
            goto L_0x0020
        L_0x013a:
            dagger.a r6 = r1.f272789c
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.chime.e.o r6 = (com.google.android.apps.gsa.staticplugins.chime.p7660e.C97697o) r6
            com.google.common.b.gu r4 = r4.mo55394f()
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x0152
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            r28 = r2
            goto L_0x0257
        L_0x0152:
            com.google.android.libraries.f.a r7 = r6.f272805b
            long r7 = r7.mo26870b()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.google.common.b.sm r4 = r4.listIterator(r10)
        L_0x0161:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x0247
            java.lang.Object r14 = r4.next()
            com.google.android.libraries.notifications.data.r r14 = (com.google.android.libraries.notifications.data.C29827r) r14
            com.google.bv.d.b.a.d r14 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162005b(r14)
            com.google.bv.d.b.b.j r14 = r14.f152041d
            if (r14 != 0) goto L_0x0177
            com.google.bv.d.b.b.j r14 = com.google.p4283bv.p4345d.p4350b.p4352b.C57000j.f152155i
        L_0x0177:
            com.google.bv.d.t r15 = r14.f152160d
            if (r15 != 0) goto L_0x017d
            com.google.bv.d.t r15 = com.google.p4283bv.p4345d.C57041t.f152278e
        L_0x017d:
            int r9 = r0.f26897b
            com.google.ai.b.g r9 = com.google.p375ai.p378b.C7681g.m22802a(r9)
            if (r9 != 0) goto L_0x0187
            com.google.ai.b.g r9 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x0187:
            com.google.protobuf.bn r17 = r15.toBuilder()
            r10 = r17
            com.google.bv.d.s r10 = (com.google.p4283bv.p4345d.C57040s) r10
            com.google.bv.d.r r15 = r15.f152283d
            if (r15 != 0) goto L_0x0195
            com.google.bv.d.r r15 = com.google.p4283bv.p4345d.C57039r.f152274c
        L_0x0195:
            com.google.protobuf.bn r15 = r15.toBuilder()
            com.google.bv.d.q r15 = (com.google.p4283bv.p4345d.C57038q) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r12 = r15.instance
            com.google.bv.d.r r12 = (com.google.p4283bv.p4345d.C57039r) r12
            int r9 = r9.f26835cv
            r12.f152277b = r9
            int r9 = r12.f152276a
            r9 = r9 | r11
            r12.f152276a = r9
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.bv.d.t r9 = (com.google.p4283bv.p4345d.C57041t) r9
            com.google.protobuf.bv r12 = r15.build()
            com.google.bv.d.r r12 = (com.google.p4283bv.p4345d.C57039r) r12
            r12.getClass()
            r9.f152283d = r12
            int r12 = r9.f152280a
            r12 = r12 | 8
            r9.f152280a = r12
            com.google.protobuf.bv r9 = r10.build()
            com.google.bv.d.t r9 = (com.google.p4283bv.p4345d.C57041t) r9
            com.google.bv.d.d r10 = r14.f152162f
            if (r10 != 0) goto L_0x01cf
            com.google.bv.d.d r10 = com.google.p4283bv.p4345d.C57025d.f152240e
        L_0x01cf:
            j$.time.Duration r12 = p3186j$.time.Duration.ofMillis(r7)
            long r11 = r12.getSeconds()
            com.google.bv.d.d r10 = com.google.android.apps.gsa.staticplugins.chime.p7660e.C97693k.m161941a(r10, r11)
            com.google.bv.d.p r11 = r14.f152163g
            if (r11 != 0) goto L_0x01e1
            com.google.bv.d.p r11 = com.google.p4283bv.p4345d.C57037p.f152271a
        L_0x01e1:
            com.google.android.apps.search.googleapp.notifications.a.h r12 = r6.f272806c
            com.google.bv.d.n r14 = r14.f152161e
            if (r14 != 0) goto L_0x01e9
            com.google.bv.d.n r14 = com.google.p4283bv.p4345d.C57035n.f152269a
        L_0x01e9:
            com.google.common.l.i r15 = com.google.common.p4541l.C59326i.f157517e
            com.google.android.apps.gsa.search.core.google.p r0 = r6.f272808e
            r28 = r2
            java.util.Collection r2 = r0.mo79714b()
            r29 = r4
            r4 = 1
            com.google.cl.b.a.a.b r0 = r0.mo79713a(r4, r2)
            byte[] r0 = r0.toByteArray()
            byte[] r0 = com.google.android.apps.gsa.search.core.google.C86074p.m138407d(r0)
            int r4 = r0.length
            java.lang.String r26 = r15.mo56837l(r0, r4)
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r0 = r6.f272807d
            com.google.common.util.concurrent.cx r21 = r0.mo79697b()
            java.lang.String r0 = "userActionMetadata"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            java.lang.String r0 = "notificationMetadata"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r0)
            java.lang.String r0 = "logMetadata"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            java.lang.String r0 = "roundTrippedNotificationData"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            kotlinx.coroutines.aw r0 = r12.f372276b
            com.google.android.apps.search.googleapp.notifications.a.i r4 = new com.google.android.apps.search.googleapp.notifications.a.i
            r27 = 0
            r19 = r4
            r20 = r12
            r22 = r9
            r23 = r14
            r24 = r10
            r25 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.C71803m.m105043d(r0, r10, r10, r4, r9)
            r0 = r32
            r12 = r10
            r2 = r28
            r4 = r29
            r9 = 2
            r10 = 0
            r11 = 1
            goto L_0x0161
        L_0x0247:
            r28 = r2
            com.google.android.libraries.gsa.k.g r0 = r6.f272804a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92896e(r13)
            java.lang.String r6 = "ChimeNotifiUamLogger#logActions"
            com.google.android.apps.gsa.staticplugins.chime.e.n r7 = com.google.android.apps.gsa.staticplugins.chime.p7660e.C97696n.f272803a
            com.google.common.util.concurrent.cx r0 = r0.mo28209i(r4, r6, r7)
        L_0x0257:
            r3.add(r0)
            dagger.a r0 = r1.f272790d
            java.lang.Object r0 = r0.mo27525b()
            r4 = r0
            com.google.android.apps.gsa.staticplugins.chime.e.m r4 = (com.google.android.apps.gsa.staticplugins.chime.p7660e.C97695m) r4
            com.google.common.b.gu r0 = r5.mo55394f()
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x0271
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            goto L_0x03db
        L_0x0271:
            com.google.android.libraries.f.a r5 = r4.f272802c
            long r5 = r5.mo26870b()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            com.google.common.b.sm r9 = r0.listIterator(r8)
        L_0x0281:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x03cd
            java.lang.Object r0 = r9.next()
            r8 = r0
            com.google.android.libraries.notifications.data.r r8 = (com.google.android.libraries.notifications.data.C29827r) r8
            com.google.bv.d.b.a.d r0 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162005b(r8)     // Catch:{ IllegalArgumentException -> 0x02a1 }
            int r10 = r0.f152038a     // Catch:{ IllegalArgumentException -> 0x02a1 }
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x02af
            com.google.bv.d.b.b.r r0 = r0.f152052o     // Catch:{ IllegalArgumentException -> 0x02a1 }
            if (r0 != 0) goto L_0x029e
            com.google.bv.d.b.b.r r0 = com.google.p4283bv.p4345d.p4350b.p4352b.C57008r.f152181b     // Catch:{ IllegalArgumentException -> 0x02a1 }
        L_0x029e:
            java.lang.String r0 = r0.f152183a     // Catch:{ IllegalArgumentException -> 0x02a1 }
            goto L_0x02b1
        L_0x02a1:
            r0 = move-exception
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.chime.C97735q.f272898a
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r11 = "Failed to parse proto."
            r12 = 18961(0x4a11, float:2.657E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56382g(r0)).mo56372aa(r12)).mo56386p(r11)
        L_0x02af:
            r0 = r28
        L_0x02b1:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x02bf
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
        L_0x02b9:
            r2 = 0
            r8 = 0
            r10 = 2
            r13 = 1
            goto L_0x03c8
        L_0x02bf:
            com.google.bv.d.b.a.d r10 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162005b(r8)
            com.google.bv.d.b.b.j r10 = r10.f152041d
            if (r10 != 0) goto L_0x02c9
            com.google.bv.d.b.b.j r10 = com.google.p4283bv.p4345d.p4350b.p4352b.C57000j.f152155i
        L_0x02c9:
            com.google.bv.d.d r10 = r10.f152162f
            if (r10 != 0) goto L_0x02cf
            com.google.bv.d.d r10 = com.google.p4283bv.p4345d.C57025d.f152240e
        L_0x02cf:
            j$.time.Duration r11 = p3186j$.time.Duration.ofMillis(r5)
            long r11 = r11.getSeconds()
            com.google.bv.d.d r10 = com.google.android.apps.gsa.staticplugins.chime.p7660e.C97693k.m161941a(r10, r11)
            int r11 = r10.f152242a
            r12 = r11 & 4
            if (r12 == 0) goto L_0x02ec
            com.google.common.o.l.t r10 = r10.f152244c
            if (r10 != 0) goto L_0x02e7
            com.google.common.o.l.t r10 = com.google.common.p4552o.p4566l.C60220t.f162931e
        L_0x02e7:
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x02fd
        L_0x02ec:
            r11 = r11 & 1
            if (r11 == 0) goto L_0x02fb
            com.google.common.o.l.t r10 = r10.f152243b
            if (r10 != 0) goto L_0x02f6
            com.google.common.o.l.t r10 = com.google.common.p4552o.p4566l.C60220t.f162931e
        L_0x02f6:
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x02fd
        L_0x02fb:
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
        L_0x02fd:
            boolean r11 = r10.mo56113h()
            if (r11 != 0) goto L_0x031a
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.chime.p7660e.C97695m.f272800a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = "ChimeNotifCCLogger"
            r0.mo56378ag(r8, r10)
            java.lang.String r8 = "Could not find event Id to log notification display action"
            r10 = 18982(0x4a26, float:2.66E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r10)).mo56386p(r8)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            goto L_0x02b9
        L_0x031a:
            com.google.common.o.uf r11 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.common.o.tz r11 = (com.google.common.p4552o.C60548tz) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.common.o.uf r12 = (com.google.common.p4552o.C60555uf) r12
            int r13 = r12.f164093a
            r14 = 2
            r13 = r13 | r14
            r12.f164093a = r13
            r13 = 105847(0x19d77, float:1.48323E-40)
            r12.f164258m = r13
            com.google.protos.ai.e.b r12 = com.google.protos.p4816ai.p4835e.C63277b.f171014e
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.protos.ai.e.a r12 = (com.google.protos.p4816ai.p4835e.C63276a) r12
            java.lang.Object r10 = r10.mo56107c()
            com.google.common.o.l.t r10 = (com.google.common.p4552o.p4566l.C60220t) r10
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.protos.ai.e.b r13 = (com.google.protos.p4816ai.p4835e.C63277b) r13
            r10.getClass()
            r13.f171017b = r10
            int r10 = r13.f171016a
            r2 = 1
            r10 = r10 | r2
            r13.f171016a = r10
            com.google.android.apps.gsa.staticplugins.chime.e.a r2 = new com.google.android.apps.gsa.staticplugins.chime.e.a
            r2.<init>()
            com.google.bv.d.b.a.d r8 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162005b(r8)
            com.google.bv.d.b.b.j r8 = r8.f152041d
            if (r8 != 0) goto L_0x0363
            com.google.bv.d.b.b.j r8 = com.google.p4283bv.p4345d.p4350b.p4352b.C57000j.f152155i
        L_0x0363:
            com.google.ai.b.fo r8 = r8.f152158b
            if (r8 != 0) goto L_0x0369
            com.google.ai.b.fo r8 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x0369:
            java.lang.Object r2 = r2.mo56070hd(r8)
            com.google.protos.ai.c.d r2 = (com.google.protos.p4816ai.p4819c.C63208d) r2
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            com.google.protos.ai.e.b r8 = (com.google.protos.p4816ai.p4835e.C63277b) r8
            r2.getClass()
            r8.f171018c = r2
            int r2 = r8.f171016a
            r10 = 2
            r2 = r2 | r10
            r8.f171016a = r2
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.protos.ai.e.b r2 = (com.google.protos.p4816ai.p4835e.C63277b) r2
            int r8 = r2.f171016a
            r8 = r8 | 4
            r2.f171016a = r8
            r8 = 0
            r2.f171019d = r8
            com.google.protobuf.bv r2 = r12.build()
            com.google.protos.ai.e.b r2 = (com.google.protos.p4816ai.p4835e.C63277b) r2
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.common.o.uf r12 = (com.google.common.p4552o.C60555uf) r12
            r2.getClass()
            r12.f164207cH = r2
            int r2 = r12.f164255j
            r13 = 1073741824(0x40000000, float:2.0)
            r2 = r2 | r13
            r12.f164255j = r2
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            r0.getClass()
            int r12 = r2.f164256k
            r13 = 1
            r12 = r12 | r13
            r2.f164256k = r12
            r2.f164209cJ = r0
            com.google.protobuf.bv r0 = r11.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            r2 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r2, r2, r2)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
        L_0x03c8:
            r7.add(r0)
            goto L_0x0281
        L_0x03cd:
            com.google.android.libraries.gsa.k.g r0 = r4.f272801b
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92896e(r7)
            java.lang.String r4 = "ChimeNotifCCLogger#logActions"
            com.google.android.apps.gsa.staticplugins.chime.e.l r5 = com.google.android.apps.gsa.staticplugins.chime.p7660e.C97694l.f272799a
            com.google.common.util.concurrent.cx r0 = r0.mo28209i(r2, r4, r5)
        L_0x03db:
            r3.add(r0)
            com.google.android.libraries.gsa.k.g r0 = r1.f272792f
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92896e(r3)
            java.lang.String r3 = "ChimeNotificationLogger#logActions"
            com.google.android.apps.gsa.staticplugins.chime.e.f r4 = com.google.android.apps.gsa.staticplugins.chime.p7660e.C97688f.f272783a
            com.google.common.util.concurrent.cx r0 = r0.mo28209i(r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.chime.p7660e.C97692j.mo90792b(java.util.List, com.google.ai.b.h):com.google.common.util.concurrent.cx");
    }
}
