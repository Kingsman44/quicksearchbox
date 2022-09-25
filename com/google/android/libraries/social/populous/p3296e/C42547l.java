package com.google.android.libraries.social.populous.p3296e;

import com.google.android.libraries.social.populous.C42184aq;
import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.core.C42279be;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42436o;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42438q;
import com.google.android.libraries.social.populous.p3296e.p3301e.C42514c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60934v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69296d;

/* renamed from: com.google.android.libraries.social.populous.e.l */
/* compiled from: PG */
public final class C42547l implements C42511e {

    /* renamed from: a */
    public final C58485gu f111596a;

    /* renamed from: b */
    private final C42591z f111597b;

    /* renamed from: c */
    private final Executor f111598c;

    /* renamed from: d */
    private final ExecutorService f111599d;

    /* renamed from: e */
    private final ScheduledExecutorService f111600e = null;

    /* renamed from: f */
    private final C42514c f111601f;

    /* renamed from: g */
    private final C58495hd f111602g;

    public C42547l(List list, C42591z zVar, C60887da daVar, ScheduledExecutorService scheduledExecutorService, C42514c cVar, C58495hd hdVar) {
        this.f111597b = zVar;
        this.f111599d = daVar;
        this.f111601f = cVar;
        this.f111596a = C58485gu.m89842j(list);
        this.f111602g = hdVar;
        this.f111598c = new C60904dr(daVar);
    }

    /* renamed from: a */
    public final void mo45523a(C42549n nVar) {
        C42549n nVar2 = nVar;
        if (nVar2 != null) {
            if (C69296d.m100510c()) {
                C42438q qVar = new C42438q();
                SessionContext sessionContext = nVar2.f111607d;
                C58485gu guVar = sessionContext.f110814h;
                C58485gu guVar2 = sessionContext.f110815i;
                int size = guVar.size() + this.f111596a.size() + guVar2.size();
                int size2 = guVar.size();
                int i = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    C69296d.f185416a.mo6453a().mo60964i();
                    mo45553f((String) guVar.get(i2), i, size, nVar, qVar);
                    i++;
                }
                C58485gu guVar3 = this.f111596a;
                int size3 = guVar3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C42554s sVar = (C42554s) guVar3.get(i3);
                    C42279be a = qVar.mo45497a(new C42543h(this, nVar2, i, size));
                    C60870cx a2 = sVar.mo45370a(nVar2);
                    nVar2.f111617n.mo45494c(a2);
                    C42546k kVar = r0;
                    C42546k kVar2 = new C42546k(this, nVar, a, a2, sVar);
                    C60856cj.m92911t(a2, kVar, this.f111599d);
                    i++;
                }
                int size4 = guVar2.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    C69296d.f185416a.mo6453a().mo60963h();
                    mo45553f((String) guVar2.get(i4), i, size, nVar, qVar);
                    i++;
                }
                return;
            }
            C42438q qVar2 = new C42438q();
            for (int i5 = 0; i5 < this.f111596a.size(); i5++) {
                C42554s sVar2 = (C42554s) this.f111596a.get(i5);
                C42279be a3 = qVar2.mo45497a(new C42527g(this, nVar2, i5));
                C60870cx a4 = sVar2.mo45370a(nVar2);
                nVar2.f111617n.mo45494c(a4);
                C60856cj.m92911t(a4, new C42545j(this, nVar, a3, sVar2, a4), this.f111599d);
            }
        }
    }

    /* renamed from: b */
    public final void mo45524b(C42266as asVar) {
        C58485gu guVar = this.f111596a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C42554s) guVar.get(i)).mo45372c(asVar);
        }
    }

    /* renamed from: c */
    public final C60870cx mo45525c() {
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = this.f111596a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C42554s) guVar.get(i)).mo45371b());
        }
        return C60856cj.m92892a(arrayList).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019f, code lost:
        if (com.google.common.base.C58890d.m90990e(r7, r4.f147326c) != false) goto L_0x01a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0251 A[Catch:{ CancellationException -> 0x05c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0318 A[Catch:{ CancellationException -> 0x05c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x01cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x01fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d3 A[Catch:{ CancellationException -> 0x05c5 }, LOOP:2: B:16:0x0070->B:92:0x01d3, LOOP_END] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.social.populous.p3296e.C42551p mo45551d(com.google.android.libraries.social.populous.p3296e.C42551p r26, com.google.android.libraries.social.populous.p3296e.C42549n r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            com.google.android.libraries.social.populous.e.o r3 = r26.mo45557a()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r4 = r1.f111629b     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.String r5 = r2.f111605b     // Catch:{ CancellationException -> 0x05c5 }
            boolean r5 = r5.isEmpty()     // Catch:{ CancellationException -> 0x05c5 }
            if (r5 == 0) goto L_0x001f
            com.google.android.libraries.social.populous.core.ClientConfigInternal r5 = r2.f111609f     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.SessionContextRuleSet r5 = r5.f110704F     // Catch:{ CancellationException -> 0x05c5 }
            int r5 = r5.f110818b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.ac r5 = com.google.android.libraries.social.populous.p3296e.p3298b.C42415al.m74698a(r5)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0029
        L_0x001f:
            com.google.android.libraries.social.populous.core.ClientConfigInternal r5 = r2.f111609f     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.SessionContextRuleSet r5 = r5.f110704F     // Catch:{ CancellationException -> 0x05c5 }
            int r5 = r5.f110819c     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.ac r5 = com.google.android.libraries.social.populous.p3296e.p3298b.C42415al.m74698a(r5)     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0029:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x05c5 }
            r6.<init>(r4)     // Catch:{ CancellationException -> 0x05c5 }
            r5.mo45414a(r6, r2)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.ClientConfigInternal r4 = r2.f111609f     // Catch:{ CancellationException -> 0x05c5 }
            boolean r4 = r4.f110701C     // Catch:{ CancellationException -> 0x05c5 }
            r9 = 1
            if (r4 == 0) goto L_0x01ef
            com.google.android.libraries.social.populous.core.SessionContext r4 = r2.f111607d     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r4 = r4.f110810d     // Catch:{ CancellationException -> 0x05c5 }
            boolean r4 = r4.isEmpty()     // Catch:{ CancellationException -> 0x05c5 }
            if (r4 != 0) goto L_0x01ef
            com.google.android.libraries.social.populous.core.SessionContext r4 = r2.f111607d     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r4 = r4.f110810d     // Catch:{ CancellationException -> 0x05c5 }
            java.util.Iterator r10 = r6.iterator()     // Catch:{ CancellationException -> 0x05c5 }
        L_0x004a:
            boolean r11 = r10.hasNext()     // Catch:{ CancellationException -> 0x05c5 }
            if (r11 == 0) goto L_0x01ef
            java.lang.Object r11 = r10.next()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.ab r11 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab) r11     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.ClientConfigInternal r12 = r2.f111609f     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.ij r12 = r12.f110725k     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r12 = r11.mo45404f(r12)     // Catch:{ CancellationException -> 0x05c5 }
            int r13 = r12.size()     // Catch:{ CancellationException -> 0x05c5 }
            r14 = 0
        L_0x0063:
            if (r14 >= r13) goto L_0x004a
            java.lang.Object r15 = r12.get(r14)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.r r15 = (com.google.p4181bi.C55856r) r15     // Catch:{ CancellationException -> 0x05c5 }
            int r8 = r4.size()     // Catch:{ CancellationException -> 0x05c5 }
            r5 = 0
        L_0x0070:
            if (r5 >= r8) goto L_0x01de
            java.lang.Object r17 = r4.get(r5)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.ContactMethodField r17 = (com.google.android.libraries.social.populous.core.ContactMethodField) r17     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.bh r18 = com.google.android.libraries.social.populous.core.C42282bh.EMAIL     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.bh r18 = r17.mo45020lo()     // Catch:{ CancellationException -> 0x05c5 }
            int r7 = r18.ordinal()     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 == 0) goto L_0x01a3
            if (r7 == r9) goto L_0x015a
            r9 = 2
            if (r7 == r9) goto L_0x009d
            r9 = 3
            if (r7 == r9) goto L_0x009d
            r9 = 4
            if (r7 == r9) goto L_0x009d
            r9 = 5
            if (r7 == r9) goto L_0x009d
        L_0x0092:
            r20 = r4
            r21 = r8
            r19 = r10
            r23 = r12
        L_0x009a:
            r4 = 0
            goto L_0x01c9
        L_0x009d:
            int r7 = r15.f147383b     // Catch:{ CancellationException -> 0x05c5 }
            r9 = 4
            if (r7 != r9) goto L_0x0092
            com.google.android.libraries.social.populous.core.InAppNotificationTarget r7 = r17.mo45117k()     // Catch:{ CancellationException -> 0x05c5 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x05c5 }
            r9.<init>()     // Catch:{ CancellationException -> 0x05c5 }
            r20 = r4
            java.lang.CharSequence r4 = r7.mo44982g()     // Catch:{ CancellationException -> 0x05c5 }
            r9.add(r4)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r4 = r7.mo45016f()     // Catch:{ CancellationException -> 0x05c5 }
            int r7 = r4.size()     // Catch:{ CancellationException -> 0x05c5 }
            r21 = r8
            r8 = 0
        L_0x00bf:
            if (r8 >= r7) goto L_0x00ee
            java.lang.Object r17 = r4.get(r8)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.ContactMethodField r17 = (com.google.android.libraries.social.populous.core.ContactMethodField) r17     // Catch:{ CancellationException -> 0x05c5 }
            r22 = r4
            java.lang.CharSequence r4 = r17.mo44982g()     // Catch:{ CancellationException -> 0x05c5 }
            r9.add(r4)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.bh r4 = r17.mo45020lo()     // Catch:{ CancellationException -> 0x05c5 }
            r23 = r7
            com.google.android.libraries.social.populous.core.bh r7 = com.google.android.libraries.social.populous.core.C42282bh.PHONE     // Catch:{ CancellationException -> 0x05c5 }
            if (r4 != r7) goto L_0x00e7
            com.google.android.libraries.social.populous.core.Phone r4 = r17.mo45118l()     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.CharSequence r4 = r4.mo45043f()     // Catch:{ CancellationException -> 0x05c5 }
            if (r4 == 0) goto L_0x00e7
            r9.add(r4)     // Catch:{ CancellationException -> 0x05c5 }
        L_0x00e7:
            int r8 = r8 + 1
            r4 = r22
            r7 = r23
            goto L_0x00bf
        L_0x00ee:
            int r4 = r15.f147383b     // Catch:{ CancellationException -> 0x05c5 }
            r7 = 4
            if (r4 != r7) goto L_0x00f8
            java.lang.Object r4 = r15.f147384c     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.ag r4 = (com.google.p4181bi.C55797ag) r4     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x00fa
        L_0x00f8:
            com.google.bi.ag r4 = com.google.p4181bi.C55797ag.f147232e     // Catch:{ CancellationException -> 0x05c5 }
        L_0x00fa:
            int r7 = r9.size()     // Catch:{ CancellationException -> 0x05c5 }
            r19 = r10
            r8 = 0
            r10 = 0
        L_0x0102:
            if (r10 >= r7) goto L_0x0155
            java.lang.Object r17 = r9.get(r10)     // Catch:{ CancellationException -> 0x05c5 }
            r22 = r7
            r7 = r17
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ CancellationException -> 0x05c5 }
            r17 = r9
            int r9 = r4.f147234a     // Catch:{ CancellationException -> 0x05c5 }
            r18 = 1
            r9 = r9 & 1
            if (r9 == 0) goto L_0x0122
            java.lang.String r9 = r4.f147237d     // Catch:{ CancellationException -> 0x05c5 }
            boolean r9 = com.google.common.base.C58890d.m90990e(r7, r9)     // Catch:{ CancellationException -> 0x05c5 }
            if (r9 == 0) goto L_0x0122
            r9 = 1
            goto L_0x0123
        L_0x0122:
            r9 = 0
        L_0x0123:
            r8 = r8 | r9
            int r9 = r4.f147235b     // Catch:{ CancellationException -> 0x05c5 }
            r23 = r12
            r12 = 2
            if (r9 != r12) goto L_0x0137
            java.lang.Object r9 = r4.f147236c     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ CancellationException -> 0x05c5 }
            boolean r9 = com.google.common.base.C58890d.m90990e(r7, r9)     // Catch:{ CancellationException -> 0x05c5 }
            if (r9 == 0) goto L_0x0137
            r9 = 1
            goto L_0x0138
        L_0x0137:
            r9 = 0
        L_0x0138:
            r8 = r8 | r9
            int r9 = r4.f147235b     // Catch:{ CancellationException -> 0x05c5 }
            r12 = 3
            if (r9 != r12) goto L_0x014a
            java.lang.Object r9 = r4.f147236c     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ CancellationException -> 0x05c5 }
            boolean r7 = com.google.common.base.C58890d.m90990e(r7, r9)     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 == 0) goto L_0x014a
            r7 = 1
            goto L_0x014b
        L_0x014a:
            r7 = 0
        L_0x014b:
            r8 = r8 | r7
            int r10 = r10 + 1
            r9 = r17
            r7 = r22
            r12 = r23
            goto L_0x0102
        L_0x0155:
            r23 = r12
            r4 = r8
            goto L_0x01c9
        L_0x015a:
            r20 = r4
            r21 = r8
            r19 = r10
            r23 = r12
            int r4 = r15.f147383b     // Catch:{ CancellationException -> 0x05c5 }
            r7 = 3
            if (r4 != r7) goto L_0x009a
            com.google.android.libraries.social.populous.core.Phone r4 = r17.mo45118l()     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.CharSequence r4 = r4.mo44982g()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.Phone r7 = r17.mo45118l()     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.CharSequence r7 = r7.mo45043f()     // Catch:{ CancellationException -> 0x05c5 }
            int r8 = r15.f147383b     // Catch:{ CancellationException -> 0x05c5 }
            r9 = 3
            if (r8 != r9) goto L_0x0181
            java.lang.Object r8 = r15.f147384c     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.ba r8 = (com.google.p4181bi.C55828ba) r8     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0183
        L_0x0181:
            com.google.bi.ba r8 = com.google.p4181bi.C55828ba.f147322d     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0183:
            java.lang.String r8 = r8.f147325b     // Catch:{ CancellationException -> 0x05c5 }
            boolean r4 = com.google.common.base.C58890d.m90990e(r4, r8)     // Catch:{ CancellationException -> 0x05c5 }
            if (r4 != 0) goto L_0x01a1
            if (r7 == 0) goto L_0x009a
            int r4 = r15.f147383b     // Catch:{ CancellationException -> 0x05c5 }
            r8 = 3
            if (r4 != r8) goto L_0x0197
            java.lang.Object r4 = r15.f147384c     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.ba r4 = (com.google.p4181bi.C55828ba) r4     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0199
        L_0x0197:
            com.google.bi.ba r4 = com.google.p4181bi.C55828ba.f147322d     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0199:
            java.lang.String r4 = r4.f147326c     // Catch:{ CancellationException -> 0x05c5 }
            boolean r4 = com.google.common.base.C58890d.m90990e(r7, r4)     // Catch:{ CancellationException -> 0x05c5 }
            if (r4 == 0) goto L_0x009a
        L_0x01a1:
            r4 = 1
            goto L_0x01c9
        L_0x01a3:
            r20 = r4
            r21 = r8
            r19 = r10
            r23 = r12
            int r4 = r15.f147383b     // Catch:{ CancellationException -> 0x05c5 }
            r7 = 2
            if (r4 != r7) goto L_0x009a
            com.google.android.libraries.social.populous.core.Email r4 = r17.mo45116j()     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.CharSequence r4 = r4.mo44982g()     // Catch:{ CancellationException -> 0x05c5 }
            int r8 = r15.f147383b     // Catch:{ CancellationException -> 0x05c5 }
            if (r8 != r7) goto L_0x01c1
            java.lang.Object r7 = r15.f147384c     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.z r7 = (com.google.p4181bi.C55864z) r7     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x01c3
        L_0x01c1:
            com.google.bi.z r7 = com.google.p4181bi.C55864z.f147406f     // Catch:{ CancellationException -> 0x05c5 }
        L_0x01c3:
            java.lang.String r7 = r7.f147409b     // Catch:{ CancellationException -> 0x05c5 }
            boolean r4 = com.google.common.base.C58890d.m90990e(r4, r7)     // Catch:{ CancellationException -> 0x05c5 }
        L_0x01c9:
            int r5 = r5 + 1
            if (r4 == 0) goto L_0x01d3
            com.google.android.libraries.social.populous.e.b.ae r4 = com.google.android.libraries.social.populous.p3296e.p3298b.C42408ae.f111231a     // Catch:{ CancellationException -> 0x05c5 }
            r11.mo45408i(r15, r4)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x01e4
        L_0x01d3:
            r10 = r19
            r4 = r20
            r8 = r21
            r12 = r23
            r9 = 1
            goto L_0x0070
        L_0x01de:
            r20 = r4
            r19 = r10
            r23 = r12
        L_0x01e4:
            int r14 = r14 + 1
            r10 = r19
            r4 = r20
            r12 = r23
            r9 = 1
            goto L_0x0063
        L_0x01ef:
            int r4 = r6.size()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89838f(r4)     // Catch:{ CancellationException -> 0x05c5 }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ CancellationException -> 0x05c5 }
        L_0x01fb:
            boolean r6 = r5.hasNext()     // Catch:{ CancellationException -> 0x05c5 }
            if (r6 == 0) goto L_0x0255
            java.lang.Object r6 = r5.next()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.ab r6 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab) r6     // Catch:{ CancellationException -> 0x05c5 }
            if (r6 != 0) goto L_0x020b
        L_0x0209:
            r7 = 0
            goto L_0x024f
        L_0x020b:
            int r7 = r6.mo45412n()     // Catch:{ CancellationException -> 0x05c5 }
            r8 = 2
            if (r7 != r8) goto L_0x0214
        L_0x0212:
            r7 = 1
            goto L_0x024f
        L_0x0214:
            com.google.android.libraries.social.populous.core.ClientConfigInternal r7 = r2.f111609f     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.ij r7 = r7.f110725k     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r7 = r6.mo45404f(r7)     // Catch:{ CancellationException -> 0x05c5 }
            boolean r8 = r7.isEmpty()     // Catch:{ CancellationException -> 0x05c5 }
            if (r8 == 0) goto L_0x0229
            boolean r8 = r6.mo45409k()     // Catch:{ CancellationException -> 0x05c5 }
            if (r8 == 0) goto L_0x0229
            goto L_0x0212
        L_0x0229:
            int r8 = r7.size()     // Catch:{ CancellationException -> 0x05c5 }
            r9 = 0
        L_0x022e:
            if (r9 >= r8) goto L_0x0209
            java.lang.Object r10 = r7.get(r9)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.r r10 = (com.google.p4181bi.C55856r) r10     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.base.ax r10 = r6.mo45401c(r10)     // Catch:{ CancellationException -> 0x05c5 }
            boolean r11 = r10.mo56113h()     // Catch:{ CancellationException -> 0x05c5 }
            if (r11 == 0) goto L_0x0212
            java.lang.Object r10 = r10.mo56107c()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.ci r10 = (com.google.android.libraries.social.populous.core.C42310ci) r10     // Catch:{ CancellationException -> 0x05c5 }
            boolean r10 = r10.mo45272f()     // Catch:{ CancellationException -> 0x05c5 }
            int r9 = r9 + 1
            if (r10 != 0) goto L_0x022e
            goto L_0x0212
        L_0x024f:
            if (r7 == 0) goto L_0x01fb
            r4.mo55395g(r6)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x01fb
        L_0x0255:
            com.google.common.b.gu r4 = r4.mo55394f()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89842j(r4)     // Catch:{ CancellationException -> 0x05c5 }
            r3.f111623b = r4     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.w r4 = r2.f111610g     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.String r5 = r2.f111605b     // Catch:{ CancellationException -> 0x05c5 }
            boolean r5 = com.google.common.base.C58837ba.m90859h(r5)     // Catch:{ CancellationException -> 0x05c5 }
            r6 = 1
            r5 = r5 ^ r6
            com.google.android.libraries.social.populous.e.b.f r4 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42427f) r4     // Catch:{ CancellationException -> 0x05c5 }
            int r4 = r4.f111291a     // Catch:{ CancellationException -> 0x05c5 }
            r6 = 12
            if (r5 == 0) goto L_0x0421
            com.google.android.libraries.social.populous.logging.z r8 = r0.f111597b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.base.ci r8 = r8.mo45632b()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.e.c r15 = r0.f111601f     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r9 = r3.f111623b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.n r14 = r2.f111617n     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.String r10 = r2.f111605b     // Catch:{ CancellationException -> 0x05c5 }
            boolean r11 = r10.isEmpty()     // Catch:{ CancellationException -> 0x05c5 }
            if (r11 == 0) goto L_0x028b
            r22 = r3
            r23 = r5
            goto L_0x0418
        L_0x028b:
            boolean r11 = r15.f111489b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r13 = com.google.android.libraries.social.populous.p3296e.p3301e.C42518g.m74966c(r10, r11)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.by.c.a.a.b r17 = com.google.p4420by.p4425c.p4426a.p4427a.C57873c.m88542d(r10)     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.String[] r11 = com.google.android.libraries.social.populous.p3296e.p3301e.C42516e.f111498a     // Catch:{ CancellationException -> 0x05c5 }
            com.google.by.c.a.a.b r10 = com.google.p4420by.p4425c.p4426a.p4427a.C57873c.m88542d(r10)     // Catch:{ CancellationException -> 0x05c5 }
            if (r10 != 0) goto L_0x02a8
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ CancellationException -> 0x05c5 }
        L_0x02a1:
            r22 = r3
            r23 = r5
        L_0x02a5:
            r1 = r10
            goto L_0x030e
        L_0x02a8:
            java.lang.String r11 = r10.f154597c     // Catch:{ CancellationException -> 0x05c5 }
            int r11 = r11.length()     // Catch:{ CancellationException -> 0x05c5 }
            r12 = 2
            if (r11 > r12) goto L_0x02b6
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89846n(r10)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x02a1
        L_0x02b6:
            com.google.common.b.gp r11 = com.google.common.p4522b.C58485gu.m89838f(r6)     // Catch:{ CancellationException -> 0x05c5 }
            r11.mo55395g(r10)     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.String[] r12 = com.google.android.libraries.social.populous.p3296e.p3301e.C42516e.f111498a     // Catch:{ CancellationException -> 0x05c5 }
            r6 = 0
        L_0x02c0:
            r7 = 11
            if (r6 >= r7) goto L_0x0305
            r7 = r12[r6]     // Catch:{ CancellationException -> 0x05c5 }
            r21 = r12
            java.lang.String r12 = r10.f154597c     // Catch:{ CancellationException -> 0x05c5 }
            boolean r12 = r12.startsWith(r7)     // Catch:{ CancellationException -> 0x05c5 }
            if (r12 == 0) goto L_0x02f6
            java.lang.String r12 = r10.f154597c     // Catch:{ CancellationException -> 0x05c5 }
            boolean r12 = r12.equals(r7)     // Catch:{ CancellationException -> 0x05c5 }
            if (r12 != 0) goto L_0x02f6
            int r7 = r7.length()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.by.c.a.a.b r12 = new com.google.by.c.a.a.b     // Catch:{ CancellationException -> 0x05c5 }
            r22 = r3
            java.lang.String r3 = r10.f154597c     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.String r3 = r3.substring(r7)     // Catch:{ CancellationException -> 0x05c5 }
            r23 = r5
            int r5 = r10.f154598d     // Catch:{ CancellationException -> 0x05c5 }
            int r5 = r5 + r7
            int r7 = r10.f154600f     // Catch:{ CancellationException -> 0x05c5 }
            java.util.BitSet r1 = r10.f154599e     // Catch:{ CancellationException -> 0x05c5 }
            r12.<init>(r3, r5, r7, r1)     // Catch:{ CancellationException -> 0x05c5 }
            r11.mo55395g(r12)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x02fa
        L_0x02f6:
            r22 = r3
            r23 = r5
        L_0x02fa:
            int r6 = r6 + 1
            r1 = r26
            r12 = r21
            r3 = r22
            r5 = r23
            goto L_0x02c0
        L_0x0305:
            r22 = r3
            r23 = r5
            com.google.common.b.gu r10 = r11.mo55394f()     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x02a5
        L_0x030e:
            java.util.Iterator r3 = r9.iterator()     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0312:
            boolean r5 = r3.hasNext()     // Catch:{ CancellationException -> 0x05c5 }
            if (r5 == 0) goto L_0x0418
            java.lang.Object r5 = r3.next()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.ab r5 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab) r5     // Catch:{ CancellationException -> 0x05c5 }
            boolean r6 = r14.mo45493b()     // Catch:{ CancellationException -> 0x05c5 }
            if (r6 != 0) goto L_0x0412
            com.google.common.base.ax r6 = r5.f111226a     // Catch:{ CancellationException -> 0x05c5 }
            boolean r7 = r6.mo56113h()     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 == 0) goto L_0x0312
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.i r6 = (com.google.p4181bi.C55847i) r6     // Catch:{ CancellationException -> 0x05c5 }
            int r7 = r6.f147360a     // Catch:{ CancellationException -> 0x05c5 }
            int r9 = com.google.p4181bi.C55846h.m87793a(r7)     // Catch:{ CancellationException -> 0x05c5 }
            int r10 = r9 + -1
            if (r9 == 0) goto L_0x0410
            if (r10 == 0) goto L_0x03f1
            r9 = 1
            if (r10 == r9) goto L_0x037f
            r9 = 2
            if (r10 == r9) goto L_0x0345
            goto L_0x0312
        L_0x0345:
            r9 = 3
            if (r7 != r9) goto L_0x034d
            java.lang.Object r6 = r6.f147361b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.o r6 = (com.google.p4181bi.C55853o) r6     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x034f
        L_0x034d:
            com.google.bi.o r6 = com.google.p4181bi.C55853o.f147374d     // Catch:{ CancellationException -> 0x05c5 }
        L_0x034f:
            com.google.android.libraries.social.populous.core.ClientConfigInternal r7 = r15.f111490c     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.ij r7 = r7.f110725k     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.ao r9 = com.google.android.libraries.social.populous.core.C42262ao.CONTACT_LABEL     // Catch:{ CancellationException -> 0x05c5 }
            boolean r7 = r7.contains(r9)     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 == 0) goto L_0x0312
            com.google.bi.t r7 = r6.f147376a     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 != 0) goto L_0x0361
            com.google.bi.t r7 = com.google.p4181bi.C55858t.f147392f     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0361:
            com.google.bi.at r7 = r7.f147396c     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 != 0) goto L_0x0367
            com.google.bi.at r7 = com.google.p4181bi.C55810at.f147265f     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0367:
            com.google.common.b.ij r7 = r15.mo45527a(r7, r13)     // Catch:{ CancellationException -> 0x05c5 }
            boolean r9 = r7.isEmpty()     // Catch:{ CancellationException -> 0x05c5 }
            if (r9 != 0) goto L_0x0312
            com.google.android.libraries.social.populous.core.ce r9 = r5.mo45413o(r6)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.cd r10 = r9.mo45285i()     // Catch:{ CancellationException -> 0x05c5 }
            r10.f110937d = r7     // Catch:{ CancellationException -> 0x05c5 }
            r5.mo45406h(r6, r9)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0312
        L_0x037f:
            r9 = 2
            if (r7 != r9) goto L_0x0387
            java.lang.Object r6 = r6.f147361b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.ad r6 = (com.google.p4181bi.C55794ad) r6     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0389
        L_0x0387:
            com.google.bi.ad r6 = com.google.p4181bi.C55794ad.f147223g     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0389:
            com.google.android.libraries.social.populous.core.ClientConfigInternal r7 = r15.f111490c     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.ij r7 = r7.f110725k     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.ao r9 = com.google.android.libraries.social.populous.core.C42262ao.GROUP     // Catch:{ CancellationException -> 0x05c5 }
            boolean r7 = r7.contains(r9)     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 == 0) goto L_0x0312
            com.google.bi.t r7 = r6.f147226b     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 != 0) goto L_0x039b
            com.google.bi.t r7 = com.google.p4181bi.C55858t.f147392f     // Catch:{ CancellationException -> 0x05c5 }
        L_0x039b:
            com.google.bi.at r7 = r7.f147396c     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 != 0) goto L_0x03a1
            com.google.bi.at r7 = com.google.p4181bi.C55810at.f147265f     // Catch:{ CancellationException -> 0x05c5 }
        L_0x03a1:
            com.google.common.b.ij r7 = r15.mo45527a(r7, r13)     // Catch:{ CancellationException -> 0x05c5 }
            boolean r9 = r7.isEmpty()     // Catch:{ CancellationException -> 0x05c5 }
            if (r9 != 0) goto L_0x03b8
            com.google.android.libraries.social.populous.core.ce r9 = r5.mo45413o(r6)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.cd r10 = r9.mo45285i()     // Catch:{ CancellationException -> 0x05c5 }
            r10.f110937d = r7     // Catch:{ CancellationException -> 0x05c5 }
            r5.mo45406h(r6, r9)     // Catch:{ CancellationException -> 0x05c5 }
        L_0x03b8:
            com.google.bi.t r7 = r6.f147226b     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 != 0) goto L_0x03be
            com.google.bi.t r7 = com.google.p4181bi.C55858t.f147392f     // Catch:{ CancellationException -> 0x05c5 }
        L_0x03be:
            com.google.bi.at r7 = r7.f147396c     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 != 0) goto L_0x03c4
            com.google.bi.at r7 = com.google.p4181bi.C55810at.f147265f     // Catch:{ CancellationException -> 0x05c5 }
        L_0x03c4:
            java.lang.String r7 = r7.f147268b     // Catch:{ CancellationException -> 0x05c5 }
            boolean r7 = r7.isEmpty()     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 == 0) goto L_0x0312
            com.google.protobuf.cq r6 = r6.f147227c     // Catch:{ CancellationException -> 0x05c5 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ CancellationException -> 0x05c5 }
        L_0x03d2:
            boolean r7 = r6.hasNext()     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 == 0) goto L_0x0312
            java.lang.Object r7 = r6.next()     // Catch:{ CancellationException -> 0x05c5 }
            r11 = r7
            com.google.bi.ay r11 = (com.google.p4181bi.C55815ay) r11     // Catch:{ CancellationException -> 0x05c5 }
            r9 = r15
            r10 = r5
            r12 = r13
            r21 = r13
            r13 = r17
            r24 = r14
            r14 = r1
            r9.mo45528b(r10, r11, r12, r13, r14)     // Catch:{ CancellationException -> 0x05c5 }
            r13 = r21
            r14 = r24
            goto L_0x03d2
        L_0x03f1:
            r21 = r13
            r24 = r14
            r9 = 1
            if (r7 != r9) goto L_0x03fd
            java.lang.Object r6 = r6.f147361b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.ay r6 = (com.google.p4181bi.C55815ay) r6     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x03ff
        L_0x03fd:
            com.google.bi.ay r6 = com.google.p4181bi.C55815ay.f147275f     // Catch:{ CancellationException -> 0x05c5 }
        L_0x03ff:
            r11 = r6
            r9 = r15
            r10 = r5
            r12 = r21
            r13 = r17
            r14 = r1
            r9.mo45528b(r10, r11, r12, r13, r14)     // Catch:{ CancellationException -> 0x05c5 }
            r13 = r21
            r14 = r24
            goto L_0x0312
        L_0x0410:
            r1 = 0
            throw r1     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0412:
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException     // Catch:{ CancellationException -> 0x05c5 }
            r1.<init>()     // Catch:{ CancellationException -> 0x05c5 }
            throw r1     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0418:
            com.google.android.libraries.social.populous.logging.z r1 = r0.f111597b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.logging.k r3 = r2.f111612i     // Catch:{ CancellationException -> 0x05c5 }
            r5 = 3
            r1.mo45638h(r5, r8, r3)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0425
        L_0x0421:
            r22 = r3
            r23 = r5
        L_0x0425:
            r1 = 2
            if (r4 != r1) goto L_0x0555
            r1 = r26
            int r3 = r1.f111633f     // Catch:{ CancellationException -> 0x05c5 }
            int r4 = r3 + -1
            if (r3 == 0) goto L_0x0553
            if (r4 == 0) goto L_0x0438
            r5 = 12
            if (r4 == r5) goto L_0x0438
            r4 = 0
            goto L_0x0439
        L_0x0438:
            r4 = 1
        L_0x0439:
            if (r23 == 0) goto L_0x0440
            r5 = 2
            if (r3 == r5) goto L_0x0440
            r3 = 1
            goto L_0x0441
        L_0x0440:
            r3 = 0
        L_0x0441:
            com.google.android.libraries.social.populous.logging.z r5 = r0.f111597b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.base.ci r5 = r5.mo45632b()     // Catch:{ CancellationException -> 0x05c5 }
            r6 = r22
            com.google.common.b.gu r7 = r6.f111623b     // Catch:{ CancellationException -> 0x05c5 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x05c5 }
            r8.<init>()     // Catch:{ CancellationException -> 0x05c5 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0454:
            boolean r9 = r7.hasNext()     // Catch:{ CancellationException -> 0x05c5 }
            if (r9 == 0) goto L_0x0538
            java.lang.Object r9 = r7.next()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.ab r9 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab) r9     // Catch:{ CancellationException -> 0x05c5 }
            int r10 = r9.mo45412n()     // Catch:{ CancellationException -> 0x05c5 }
            int r10 = r10 + -1
            r11 = 1
            if (r10 == r11) goto L_0x052d
            com.google.common.base.ax r10 = r9.f111226a     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.Object r10 = r10.mo56107c()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.i r10 = (com.google.p4181bi.C55847i) r10     // Catch:{ CancellationException -> 0x05c5 }
            int r10 = r10.f147360a     // Catch:{ CancellationException -> 0x05c5 }
            int r10 = com.google.p4181bi.C55846h.m87793a(r10)     // Catch:{ CancellationException -> 0x05c5 }
            int r11 = r10 + -1
            if (r10 == 0) goto L_0x052b
            if (r11 == 0) goto L_0x0485
            r10 = 1
            if (r11 == r10) goto L_0x0481
            goto L_0x0454
        L_0x0481:
            r8.add(r9)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0454
        L_0x0485:
            com.google.common.base.ax r10 = r9.f111226a     // Catch:{ CancellationException -> 0x05c5 }
            java.lang.Object r10 = r10.mo56107c()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.i r10 = (com.google.p4181bi.C55847i) r10     // Catch:{ CancellationException -> 0x05c5 }
            int r11 = r10.f147360a     // Catch:{ CancellationException -> 0x05c5 }
            r12 = 1
            if (r11 != r12) goto L_0x0497
            java.lang.Object r10 = r10.f147361b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.ay r10 = (com.google.p4181bi.C55815ay) r10     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0499
        L_0x0497:
            com.google.bi.ay r10 = com.google.p4181bi.C55815ay.f147275f     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0499:
            com.google.common.b.gp r11 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.protobuf.cq r12 = r10.f147279c     // Catch:{ CancellationException -> 0x05c5 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ CancellationException -> 0x05c5 }
        L_0x04a3:
            boolean r13 = r12.hasNext()     // Catch:{ CancellationException -> 0x05c5 }
            if (r13 == 0) goto L_0x0521
            java.lang.Object r13 = r12.next()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.r r13 = (com.google.p4181bi.C55856r) r13     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.base.ax r14 = r9.mo45402d(r13)     // Catch:{ CancellationException -> 0x05c5 }
            if (r3 == 0) goto L_0x04cd
            boolean r15 = r14.mo56113h()     // Catch:{ CancellationException -> 0x05c5 }
            if (r15 == 0) goto L_0x04a3
            java.lang.Object r14 = r14.mo56107c()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.cl r14 = (com.google.android.libraries.social.populous.core.C42313cl) r14     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.core.ci r14 = r14.mo45275a()     // Catch:{ CancellationException -> 0x05c5 }
            if (r14 == 0) goto L_0x04a3
            boolean r14 = r14.mo45269d()     // Catch:{ CancellationException -> 0x05c5 }
            if (r14 == 0) goto L_0x04a3
        L_0x04cd:
            com.google.bi.ay r14 = com.google.p4181bi.C55815ay.f147275f     // Catch:{ CancellationException -> 0x05c5 }
            com.google.protobuf.bn r14 = r14.createBuilder(r10)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.ax r14 = (com.google.p4181bi.C55814ax) r14     // Catch:{ CancellationException -> 0x05c5 }
            r14.copyOnWrite()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.protobuf.bv r15 = r14.instance     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.ay r15 = (com.google.p4181bi.C55815ay) r15     // Catch:{ CancellationException -> 0x05c5 }
            com.google.protobuf.cq r1 = com.google.p4181bi.C55815ay.emptyProtobufList()     // Catch:{ CancellationException -> 0x05c5 }
            r15.f147279c = r1     // Catch:{ CancellationException -> 0x05c5 }
            r14.mo54279b(r13)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.protobuf.bv r1 = r14.build()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.ay r1 = (com.google.p4181bi.C55815ay) r1     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.aa r13 = new com.google.android.libraries.social.populous.e.b.aa     // Catch:{ CancellationException -> 0x05c5 }
            r13.<init>(r9)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.i r14 = com.google.p4181bi.C55847i.f147358c     // Catch:{ CancellationException -> 0x05c5 }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.g r14 = (com.google.p4181bi.C55845g) r14     // Catch:{ CancellationException -> 0x05c5 }
            r14.copyOnWrite()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.protobuf.bv r15 = r14.instance     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.i r15 = (com.google.p4181bi.C55847i) r15     // Catch:{ CancellationException -> 0x05c5 }
            r1.getClass()     // Catch:{ CancellationException -> 0x05c5 }
            r15.f147361b = r1     // Catch:{ CancellationException -> 0x05c5 }
            r16 = r3
            r3 = 1
            r15.f147360a = r3     // Catch:{ CancellationException -> 0x05c5 }
            com.google.protobuf.bv r3 = r14.build()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.i r3 = (com.google.p4181bi.C55847i) r3     // Catch:{ CancellationException -> 0x05c5 }
            r13.mo45397d(r3)     // Catch:{ CancellationException -> 0x05c5 }
            r13.mo45396c(r10, r1)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.ab r1 = r13.mo45394a()     // Catch:{ CancellationException -> 0x05c5 }
            r11.mo55395g(r1)     // Catch:{ CancellationException -> 0x05c5 }
            r1 = r26
            r3 = r16
            goto L_0x04a3
        L_0x0521:
            r16 = r3
            com.google.common.b.gu r1 = r11.mo55394f()     // Catch:{ CancellationException -> 0x05c5 }
            r8.addAll(r1)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0532
        L_0x052b:
            r1 = 0
            throw r1     // Catch:{ CancellationException -> 0x05c5 }
        L_0x052d:
            r16 = r3
            r8.add(r9)     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0532:
            r1 = r26
            r3 = r16
            goto L_0x0454
        L_0x0538:
            if (r4 == 0) goto L_0x053f
            com.google.android.libraries.social.populous.e.q r1 = com.google.android.libraries.social.populous.p3296e.C42552q.f111634a     // Catch:{ CancellationException -> 0x05c5 }
            java.util.Collections.sort(r8, r1)     // Catch:{ CancellationException -> 0x05c5 }
        L_0x053f:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r8)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r1)     // Catch:{ CancellationException -> 0x05c5 }
            r6.f111623b = r1     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.logging.z r1 = r0.f111597b     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.logging.k r3 = r2.f111612i     // Catch:{ CancellationException -> 0x05c5 }
            r4 = 57
            r1.mo45638h(r4, r5, r3)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x0557
        L_0x0553:
            r1 = 0
            throw r1     // Catch:{ CancellationException -> 0x05c5 }
        L_0x0555:
            r6 = r22
        L_0x0557:
            com.google.android.libraries.social.populous.core.ClientConfigInternal r1 = r2.f111609f     // Catch:{ CancellationException -> 0x05c5 }
            boolean r1 = r1.f110726l     // Catch:{ CancellationException -> 0x05c5 }
            if (r1 == 0) goto L_0x05c0
            com.google.common.b.gu r1 = r6.f111623b     // Catch:{ CancellationException -> 0x05c5 }
            int r1 = r1.size()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89838f(r1)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r3 = r6.f111623b     // Catch:{ CancellationException -> 0x05c5 }
            r4 = 0
            com.google.common.b.sm r3 = r3.listIterator(r4)     // Catch:{ CancellationException -> 0x05c5 }
        L_0x056e:
            boolean r5 = r3.hasNext()     // Catch:{ CancellationException -> 0x05c5 }
            if (r5 == 0) goto L_0x05b6
            java.lang.Object r5 = r3.next()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.android.libraries.social.populous.e.b.ab r5 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab) r5     // Catch:{ CancellationException -> 0x05c5 }
            boolean r7 = r5.mo45410l()     // Catch:{ CancellationException -> 0x05c5 }
            if (r7 == 0) goto L_0x05b1
            com.google.android.libraries.social.populous.core.ClientConfigInternal r7 = r2.f111609f     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.ij r7 = r7.f110725k     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r7 = r5.mo45404f(r7)     // Catch:{ CancellationException -> 0x05c5 }
            int r8 = r7.size()     // Catch:{ CancellationException -> 0x05c5 }
            r9 = 0
        L_0x058d:
            if (r9 >= r8) goto L_0x056e
            java.lang.Object r10 = r7.get(r9)     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.r r10 = (com.google.p4181bi.C55856r) r10     // Catch:{ CancellationException -> 0x05c5 }
            com.google.protobuf.cq r10 = r10.f147386e     // Catch:{ CancellationException -> 0x05c5 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ CancellationException -> 0x05c5 }
        L_0x059b:
            boolean r11 = r10.hasNext()     // Catch:{ CancellationException -> 0x05c5 }
            int r12 = r9 + 1
            if (r11 == 0) goto L_0x05af
            java.lang.Object r11 = r10.next()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.bi.bg r11 = (com.google.p4181bi.C55834bg) r11     // Catch:{ CancellationException -> 0x05c5 }
            int r11 = r11.f147336a     // Catch:{ CancellationException -> 0x05c5 }
            r13 = 1
            if (r11 != r13) goto L_0x059b
            goto L_0x05b2
        L_0x05af:
            r9 = r12
            goto L_0x058d
        L_0x05b1:
            r13 = 1
        L_0x05b2:
            r1.mo55395g(r5)     // Catch:{ CancellationException -> 0x05c5 }
            goto L_0x056e
        L_0x05b6:
            com.google.common.b.gu r1 = r1.mo55394f()     // Catch:{ CancellationException -> 0x05c5 }
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r1)     // Catch:{ CancellationException -> 0x05c5 }
            r6.f111623b = r1     // Catch:{ CancellationException -> 0x05c5 }
        L_0x05c0:
            com.google.android.libraries.social.populous.e.p r1 = r6.mo45556a()     // Catch:{ CancellationException -> 0x05c5 }
            return r1
        L_0x05c5:
            com.google.android.libraries.social.populous.e.o r1 = r26.mo45557a()
            r2 = 13
            r1.f111626e = r2
            com.google.android.libraries.social.populous.e.p r1 = r1.mo45556a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.C42547l.mo45551d(com.google.android.libraries.social.populous.e.p, com.google.android.libraries.social.populous.e.n):com.google.android.libraries.social.populous.e.p");
    }

    /* renamed from: e */
    public final void mo45552e(C42551p pVar, C42549n nVar, boolean z) {
        this.f111598c.execute(new C42544i(nVar, pVar, z));
    }

    /* renamed from: f */
    public final void mo45553f(String str, int i, int i2, C42549n nVar, C42438q qVar) {
        C42279be a = qVar.mo45497a(new C42519f(this, nVar, i, i2));
        if (((C42184aq) this.f111602g.get(str)) == null) {
            C42550o oVar = new C42550o();
            oVar.f111626e = 21;
            oVar.f111627f = 14;
            ((C42436o) a).f111346a.mo45489b(oVar.mo45556a());
            return;
        }
        C42550o oVar2 = new C42550o();
        oVar2.f111626e = 22;
        oVar2.f111627f = 14;
        ((C42436o) a).f111346a.mo45489b(oVar2.mo45556a());
    }
}
