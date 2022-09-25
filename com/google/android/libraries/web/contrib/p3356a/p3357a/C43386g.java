package com.google.android.libraries.web.contrib.p3356a.p3357a;

import com.google.android.libraries.web.profile.C44070e;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44040c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4548e.p4549a.C59425c;
import com.google.common.util.concurrent.C60870cx;
import java.util.EnumSet;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.a.a.g */
/* compiled from: PG */
public final class C43386g {

    /* renamed from: b */
    private static final C59071e f113357b = C59071e.m91331h();

    /* renamed from: a */
    public final C69626l f113358a;

    /* renamed from: c */
    private final C71422aw f113359c;

    /* renamed from: d */
    private final C69626l f113360d;

    /* renamed from: e */
    private final C69626l f113361e;

    public C43386g(C69626l lVar, C44070e eVar, C44040c cVar, C71422aw awVar) {
        C69664n.m101061g(eVar, "profileManagerFactory");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f113358a = lVar;
        this.f113359c = awVar;
        this.f113360d = new C59425c(new C43385f(eVar, this, (C69577g) null));
        this.f113361e = new C59425c(new C43384e(cVar, this, (C69577g) null));
    }

    /* renamed from: a */
    public final C60870cx mo46483a(EnumSet enumSet) {
        C69664n.m101061g(enumSet, "dataTypes");
        return C71663i.m104692e(this.f113359c, C71424ay.UNDISPATCHED, new C43383d(this, enumSet, (C69577g) null), 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.util.EnumSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.util.EnumSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.util.EnumSet} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r9 == r1) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r9 != r1) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (((com.google.android.libraries.web.profile.p3431a.p3434b.C44041d) r9).mo46991c(r0) == r1) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        return r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46484b(java.util.EnumSet r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.web.contrib.p3356a.p3357a.C43382c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.web.contrib.a.a.c r0 = (com.google.android.libraries.web.contrib.p3356a.p3357a.C43382c) r0
            int r1 = r0.f113345e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f113345e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.contrib.a.a.c r0 = new com.google.android.libraries.web.contrib.a.a.c
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f113343c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f113345e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r6) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            p5462h.C69714l.m101134b(r9)     // Catch:{ Exception -> 0x003d }
            goto L_0x00b5
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            p5462h.C69714l.m101134b(r9)     // Catch:{ Exception -> 0x003d }
            goto L_0x008c
        L_0x003d:
            r8 = move-exception
            goto L_0x0097
        L_0x003f:
            java.lang.Object r8 = r0.f113342b
            java.lang.Object r2 = r0.f113341a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0071
        L_0x0047:
            java.lang.Object r8 = r0.f113342b
            java.lang.Object r2 = r0.f113341a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0061
        L_0x004f:
            p5462h.C69714l.m101134b(r9)
            h.f.a.l r9 = r7.f113360d
            r0.f113341a = r7
            r0.f113342b = r8
            r0.f113345e = r6
            java.lang.Object r9 = r9.mo5761a(r0)
            if (r9 == r1) goto L_0x00b8
            r2 = r7
        L_0x0061:
            com.google.android.libraries.web.profile.f r9 = (com.google.android.libraries.web.profile.C44071f) r9
            com.google.android.libraries.web.shared.c.a r6 = com.google.android.libraries.web.shared.p3443c.C44082a.f114755a
            r0.f113341a = r2
            r0.f113342b = r8
            r0.f113345e = r5
            java.lang.Object r9 = r9.mo47032e(r6, r8, r0)
            if (r9 == r1) goto L_0x00b8
        L_0x0071:
            com.google.android.libraries.web.profile.d r9 = com.google.android.libraries.web.profile.C44069d.COOKIES_AND_SITE_DATA
            java.util.EnumSet r8 = (java.util.EnumSet) r8
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x00b5
            com.google.android.libraries.web.contrib.a.a.g r2 = (com.google.android.libraries.web.contrib.p3356a.p3357a.C43386g) r2     // Catch:{ Exception -> 0x003d }
            h.f.a.l r8 = r2.f113361e     // Catch:{ Exception -> 0x003d }
            r9 = 0
            r0.f113341a = r9     // Catch:{ Exception -> 0x003d }
            r0.f113342b = r9     // Catch:{ Exception -> 0x003d }
            r0.f113345e = r4     // Catch:{ Exception -> 0x003d }
            java.lang.Object r9 = r8.mo5761a(r0)     // Catch:{ Exception -> 0x003d }
            if (r9 == r1) goto L_0x0096
        L_0x008c:
            com.google.android.libraries.web.profile.a.b.d r9 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44041d) r9     // Catch:{ Exception -> 0x003d }
            r0.f113345e = r3     // Catch:{ Exception -> 0x003d }
            java.lang.Object r8 = r9.mo46991c(r0)     // Catch:{ Exception -> 0x003d }
            if (r8 != r1) goto L_0x00b5
        L_0x0096:
            return r1
        L_0x0097:
            com.google.common.f.e r9 = f113357b
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.x r8 = r9.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 54077(0xd33d, float:7.5778E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Failed to refresh Google cookies."
            r8.mo56386p(r9)
        L_0x00b5:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.p3356a.p3357a.C43386g.mo46484b(java.util.EnumSet, h.c.g):java.lang.Object");
    }
}
