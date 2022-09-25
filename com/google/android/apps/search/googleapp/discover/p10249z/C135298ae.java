package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133969d;
import com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10169a.C133947g;
import com.google.android.apps.search.googleapp.discover.p10173aa.C134073q;
import com.google.android.apps.search.googleapp.discover.p10181d.C134225n;
import com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134526f;
import com.google.android.apps.search.googleapp.discover.p10237t.C134935k;
import com.google.android.apps.search.googleapp.discover.p10238u.C135108ga;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import java.util.Set;
import p5462h.p5463a.C69531o;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.ae */
/* compiled from: PG */
public final class C135298ae {

    /* renamed from: a */
    public static final C59071e f368566a = C59071e.m91331h();

    /* renamed from: b */
    public final C69585o f368567b;

    /* renamed from: c */
    public final C133947g f368568c;

    /* renamed from: d */
    public final C134935k f368569d;

    /* renamed from: e */
    public final C135294aa f368570e;

    /* renamed from: f */
    public final C134225n f368571f;

    /* renamed from: g */
    public final C135108ga f368572g;

    /* renamed from: h */
    public final C135200t f368573h;

    /* renamed from: i */
    public final C133969d f368574i;

    /* renamed from: j */
    public final C134526f f368575j;

    /* renamed from: k */
    public final boolean f368576k;

    /* renamed from: l */
    public final Set f368577l = C69531o.m100939p(new C57259bn[]{C57259bn.SCHEDULED_REFRESH, C57259bn.WATCHDOG_REFRESH, C57259bn.APP_CLOSE_REFRESH});

    /* renamed from: m */
    private final C134073q f368578m;

    public C135298ae(C69585o oVar, C133947g gVar, C134935k kVar, C134073q qVar, C135294aa aaVar, C134225n nVar, C135108ga gaVar, C135200t tVar, C133969d dVar, C134526f fVar, boolean z) {
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(nVar, "feedRequestAppFlowLogger");
        this.f368567b = oVar;
        this.f368568c = gVar;
        this.f368569d = kVar;
        this.f368578m = qVar;
        this.f368570e = aaVar;
        this.f368571f = nVar;
        this.f368572g = gaVar;
        this.f368573h = tVar;
        this.f368574i = dVar;
        this.f368575j = fVar;
        this.f368576k = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.apps.search.googleapp.discover.t.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: com.google.android.apps.search.googleapp.discover.t.a} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112248a(com.google.android.apps.search.googleapp.discover.p10237t.C134925a r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.discover.p10249z.C135297ad
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.discover.z.ad r0 = (com.google.android.apps.search.googleapp.discover.p10249z.C135297ad) r0
            int r1 = r0.f368565d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368565d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.z.ad r0 = new com.google.android.apps.search.googleapp.discover.z.ad
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f368563b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368565d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r7 = r0.f368562a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0050
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.googleapp.discover.aa.q r8 = r6.f368578m
            com.google.android.apps.search.googleapp.discover.s.i r2 = r7.f367366d
            r0.f368562a = r7
            r0.f368565d = r3
            h.c.o r3 = r8.f365221d
            com.google.android.apps.search.googleapp.discover.aa.p r4 = new com.google.android.apps.search.googleapp.discover.aa.p
            r5 = 0
            r4.<init>(r2, r8, r5)
            java.lang.Object r8 = kotlinx.coroutines.C71803m.m105040a(r3, r4, r0)
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r8 == r0) goto L_0x004e
            h.q r8 = p5462h.C69788q.f186170a
        L_0x004e:
            if (r8 == r1) goto L_0x0061
        L_0x0050:
            com.google.android.apps.search.googleapp.discover.t.a r7 = (com.google.android.apps.search.googleapp.discover.p10237t.C134925a) r7
            com.google.android.apps.search.googleapp.discover.s.i r7 = r7.f367366d
            com.google.android.apps.search.googleapp.discover.s.i r8 = com.google.android.apps.search.googleapp.discover.p10214s.C134591i.INELIGIBLE
            if (r7 == r8) goto L_0x005b
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x005b:
            com.google.android.apps.search.googleapp.discover.z.a.g r7 = new com.google.android.apps.search.googleapp.discover.z.a.g
            r7.<init>()
            throw r7
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135298ae.mo112248a(com.google.android.apps.search.googleapp.discover.t.a, h.c.g):java.lang.Object");
    }
}
