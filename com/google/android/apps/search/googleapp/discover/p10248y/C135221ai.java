package com.google.android.apps.search.googleapp.discover.p10248y;

import android.content.Context;
import com.google.android.apps.search.googleapp.discover.p10249z.C135358o;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.android.gms.common.C143875g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.ai */
/* compiled from: PG */
public final class C135221ai {

    /* renamed from: a */
    public final C60950i f368329a;

    /* renamed from: b */
    public final C143875g f368330b;

    /* renamed from: c */
    public final Context f368331c;

    /* renamed from: d */
    public final int f368332d;

    /* renamed from: e */
    public final Instant f368333e;

    /* renamed from: f */
    private final C135358o f368334f;

    /* renamed from: g */
    private final C134755f f368335g;

    public C135221ai(C60950i iVar, C135358o oVar, C143875g gVar, Context context, int i, Instant instant, C134755f fVar) {
        this.f368329a = iVar;
        this.f368334f = oVar;
        this.f368330b = gVar;
        this.f368331c = context;
        this.f368332d = i;
        this.f368333e = instant;
        this.f368335g = fVar;
    }

    /* renamed from: a */
    public final C135214ab mo112178a(C135270u uVar, C135268s sVar) {
        C58480gp gpVar = new C58480gp(4);
        int i = this.f368332d;
        if (i != -1) {
            gpVar.mo55395g(new C135261l(i));
        }
        if (sVar != null) {
            gpVar.mo55395g(sVar);
        }
        C58485gu f = gpVar.mo55394f();
        C69664n.m101060f(f, "slicesBuilder.build()");
        return C135269t.m219406b(uVar, f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.google.android.apps.search.googleapp.discover.s.ay} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.apps.search.googleapp.discover.s.ay} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: com.google.android.apps.search.googleapp.discover.streamui.i.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: com.google.android.apps.search.googleapp.discover.streamui.i.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.google.android.apps.search.googleapp.discover.s.ay} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.google.android.apps.search.googleapp.discover.s.ay} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0148, code lost:
        if (r2 == null) goto L_0x014a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.googleapp.discover.p10248y.C135220ah mo112179b(com.google.android.apps.search.googleapp.discover.p10249z.C135319az r14, com.google.android.apps.search.googleapp.discover.p10248y.C135270u r15) {
        /*
            r13 = this;
            java.util.List r0 = r14.f368670a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x000d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0032
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L_0x001e
            p5462h.p5463a.C69540x.m100952j()
        L_0x001e:
            com.google.android.apps.search.googleapp.discover.z.ag r3 = (com.google.android.apps.search.googleapp.discover.p10249z.C135300ag) r3
            java.lang.String r5 = r3.f368579a
            int r7 = r14.f368673d
            int r7 = r7 + r2
            com.google.android.apps.search.googleapp.discover.z.ab r2 = r14.f368672c
            java.lang.String r2 = r2.f368545d
            java.util.List r2 = com.google.android.apps.search.googleapp.discover.p10248y.C135217ae.m219321a(r5, r3, r7, r2)
            p5462h.p5463a.C69540x.m100811r(r6, r2)
            r2 = r4
            goto L_0x000d
        L_0x0032:
            int r0 = r14.f368674e
            r2 = 4
            r3 = 0
            if (r0 != 0) goto L_0x0062
            com.google.android.apps.search.googleapp.discover.z.ab r0 = r14.f368672c
            j$.util.Optional r0 = r0.f368548g
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0062
            com.google.android.apps.search.googleapp.discover.z.ab r0 = r14.f368672c
            com.google.android.apps.search.googleapp.discover.streamui.h.f r4 = r13.f368335g
            com.google.android.apps.search.googleapp.discover.z.p r0 = com.google.android.apps.search.googleapp.discover.p10249z.C135357n.m219503a(r0, r4)
            com.google.android.apps.search.googleapp.discover.z.o r4 = r13.f368334f
            boolean r4 = r4.mo112289c(r0)
            if (r4 != 0) goto L_0x005b
            java.util.List r4 = r14.f368670a
            int r4 = r4.size()
            r5 = 5
            if (r4 >= r5) goto L_0x006c
        L_0x005b:
            com.google.android.apps.search.googleapp.discover.y.q r4 = new com.google.android.apps.search.googleapp.discover.y.q
            r5 = 3
            r4.<init>(r1, r1, r0, r5)
            goto L_0x006d
        L_0x0062:
            int r0 = r14.f368674e
            if (r0 == 0) goto L_0x006c
            com.google.android.apps.search.googleapp.discover.y.q r4 = new com.google.android.apps.search.googleapp.discover.y.q
            r4.<init>(r1, r0, r3, r2)
            goto L_0x006d
        L_0x006c:
            r4 = r3
        L_0x006d:
            if (r4 == 0) goto L_0x0072
            r6.add(r4)
        L_0x0072:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0085
            com.google.android.apps.search.googleapp.discover.y.af r14 = new com.google.android.apps.search.googleapp.discover.y.af
            com.google.android.apps.search.googleapp.discover.y.p r0 = com.google.android.apps.search.googleapp.discover.p10248y.C135265p.f368494a
            com.google.android.apps.search.googleapp.discover.y.ab r15 = r13.mo112178a(r15, r0)
            r14.<init>(r15)
            goto L_0x019c
        L_0x0085:
            com.google.android.apps.search.googleapp.discover.y.ag r15 = new com.google.android.apps.search.googleapp.discover.y.ag
            com.google.android.apps.search.googleapp.discover.z.ab r0 = r14.f368672c
            java.lang.String r1 = r0.f368545d
            j$.time.Instant r4 = r0.f368544c
            com.google.common.o.l.r r5 = r0.f368546e
            int r7 = r14.f368673d
            r8 = 1
            if (r7 != 0) goto L_0x00a1
            int r2 = r13.f368332d
            r7 = -1
            if (r2 == r7) goto L_0x009f
            com.google.android.apps.search.googleapp.discover.y.l r7 = new com.google.android.apps.search.googleapp.discover.y.l
            r7.<init>(r2)
            goto L_0x00a7
        L_0x009f:
            r7 = r3
            goto L_0x00a7
        L_0x00a1:
            com.google.android.apps.search.googleapp.discover.y.q r9 = new com.google.android.apps.search.googleapp.discover.y.q
            r9.<init>(r8, r7, r3, r2)
            r7 = r9
        L_0x00a7:
            com.google.android.apps.search.googleapp.discover.streamui.h.f r2 = r13.f368335g
            j$.util.Optional r0 = r0.f368548g
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x00b8
            com.google.android.apps.search.googleapp.discover.z.ab r0 = r14.f368672c
            com.google.android.apps.search.googleapp.discover.z.p r0 = com.google.android.apps.search.googleapp.discover.p10249z.C135357n.m219503a(r0, r2)
            goto L_0x00b9
        L_0x00b8:
            r0 = r3
        L_0x00b9:
            com.google.android.apps.search.googleapp.discover.y.w r9 = new com.google.android.apps.search.googleapp.discover.y.w
            int r2 = r14.f368673d
            int r10 = r14.f368674e
            r9.<init>(r0, r2, r10)
            java.util.Map r0 = r14.f368671b
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00d1:
            boolean r10 = r0.hasNext()
            r11 = 16
            if (r10 == 0) goto L_0x00e8
            java.lang.Object r10 = r0.next()
            r12 = r10
            com.google.android.apps.search.googleapp.discover.s.ay r12 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r12
            int r12 = r12.f366456b
            if (r12 != r11) goto L_0x00d1
            r2.add(r10)
            goto L_0x00d1
        L_0x00e8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r10 = 10
            int r10 = p5462h.p5463a.C69540x.m100804k(r2, r10)
            r0.<init>(r10)
            java.util.Iterator r2 = r2.iterator()
        L_0x00f7:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0112
            java.lang.Object r10 = r2.next()
            com.google.android.apps.search.googleapp.discover.s.ay r10 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r10
            int r12 = r10.f366456b
            if (r12 != r11) goto L_0x010c
            java.lang.Object r10 = r10.f366457c
            com.google.bv.e.b.b.b.ab r10 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57118ab) r10
            goto L_0x010e
        L_0x010c:
            com.google.bv.e.b.b.b.ab r10 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57118ab.f152469b
        L_0x010e:
            r0.add(r10)
            goto L_0x00f7
        L_0x0112:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r0)
            java.lang.String r2 = "copyOf(getElementsRenderData(subtree))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            java.util.Map r2 = r14.f368671b
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0125:
            boolean r10 = r2.hasNext()
            r11 = 21
            if (r10 == 0) goto L_0x0139
            java.lang.Object r10 = r2.next()
            r12 = r10
            com.google.android.apps.search.googleapp.discover.s.ay r12 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r12
            int r12 = r12.f366456b
            if (r12 != r11) goto L_0x0125
            r3 = r10
        L_0x0139:
            com.google.android.apps.search.googleapp.discover.s.ay r3 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r3
            if (r3 == 0) goto L_0x014a
            int r2 = r3.f366456b
            if (r2 != r11) goto L_0x0146
            java.lang.Object r2 = r3.f366457c
            com.google.android.apps.search.googleapp.discover.s.bm r2 = (com.google.android.apps.search.googleapp.discover.p10214s.C134575bm) r2
            goto L_0x0148
        L_0x0146:
            com.google.android.apps.search.googleapp.discover.s.bm r2 = com.google.android.apps.search.googleapp.discover.p10214s.C134575bm.f366507c
        L_0x0148:
            if (r2 != 0) goto L_0x014c
        L_0x014a:
            com.google.android.apps.search.googleapp.discover.s.bm r2 = com.google.android.apps.search.googleapp.discover.p10214s.C134575bm.f366507c
        L_0x014c:
            java.lang.String r3 = "streamSubTree.requiredCo…tent.getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            int r3 = r2.f366509a
            if (r3 != r8) goto L_0x0165
            com.google.android.apps.search.googleapp.discover.streamui.i.g r3 = new com.google.android.apps.search.googleapp.discover.streamui.i.g
            java.lang.Object r2 = r2.f366510b
            com.google.bv.e.b.b.d.t r2 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57214t) r2
            java.lang.String r8 = "toolbarContent.fullCoverageHeader"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r8)
            r3.<init>(r2)
            r10 = r3
            goto L_0x0168
        L_0x0165:
            com.google.android.apps.search.googleapp.discover.streamui.i.h r2 = com.google.android.apps.search.googleapp.discover.streamui.p10233i.C134775h.f366970a
            r10 = r2
        L_0x0168:
            com.google.android.apps.search.googleapp.discover.z.ab r14 = r14.f368672c
            com.google.bv.e.b r14 = r14.f368547f
            java.lang.String r2 = "sessionId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            java.lang.String r2 = "sessionCreateTime"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r2)
            java.lang.String r2 = "rootResponseEventId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r2)
            java.lang.String r2 = "elementsRenderData"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)
            java.lang.String r2 = "feedId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r2)
            com.google.android.apps.search.googleapp.discover.y.ac r12 = new com.google.android.apps.search.googleapp.discover.y.ac
            com.google.android.apps.search.googleapp.discover.y.y r2 = new com.google.android.apps.search.googleapp.discover.y.y
            r2.<init>(r1)
            r11 = 0
            r1 = r12
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r9
            r8 = r0
            r9 = r10
            r10 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.<init>(r12)
            r14 = r15
        L_0x019c:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10248y.C135221ai.mo112179b(com.google.android.apps.search.googleapp.discover.z.az, com.google.android.apps.search.googleapp.discover.y.u):com.google.android.apps.search.googleapp.discover.y.ah");
    }
}
