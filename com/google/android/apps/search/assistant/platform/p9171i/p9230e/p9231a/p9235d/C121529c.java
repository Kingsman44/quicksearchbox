package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121493a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121501i;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.d.c */
/* compiled from: PG */
public final class C121529c {

    /* renamed from: a */
    private static final C59071e f337249a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.e.a.d.c");

    /* renamed from: b */
    private final Map f337250b;

    /* renamed from: c */
    private final int f337251c;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        if (r7.equals("A") != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C121529c(java.lang.String r11) {
        /*
            r10 = this;
            r10.<init>()
            boolean r0 = com.google.common.base.C58837ba.m90859h(r11)
            r1 = 2
            if (r0 == 0) goto L_0x0013
            r10.f337251c = r1
            java.util.Map r11 = java.util.Collections.emptyMap()
            r10.f337250b = r11
            return
        L_0x0013:
            java.lang.String r0 = "all"
            boolean r0 = r11.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x012c
            java.lang.String r0 = "*:*:*"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x012c
        L_0x0026:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.common.base.m r3 = new com.google.common.base.m
            r4 = 124(0x7c, float:1.74E-43)
            r3.<init>(r4)
            com.google.common.base.cf r3 = com.google.common.base.C58869cf.m90936b(r3)
            com.google.common.base.u r4 = com.google.common.base.C58911u.f156751b
            com.google.common.base.cf r3 = r3.mo56152f(r4)
            com.google.common.base.cf r3 = r3.mo56151a()
            com.google.common.base.m r4 = new com.google.common.base.m
            r5 = 58
            r4.<init>(r5)
            com.google.common.base.cf r4 = com.google.common.base.C58869cf.m90936b(r4)
            com.google.common.base.u r5 = com.google.common.base.C58911u.f156751b
            com.google.common.base.cf r4 = r4.mo56152f(r5)
            com.google.common.base.cf r4 = r4.mo56151a()
            java.lang.Iterable r11 = r3.mo56153g(r11)
            java.util.Iterator r11 = r11.iterator()
        L_0x005d:
            boolean r3 = r11.hasNext()
            r5 = 3
            if (r3 == 0) goto L_0x0127
            java.lang.Object r3 = r11.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r6 = r4.mo56155i(r3)
            int r7 = r6.size()
            if (r7 == r5) goto L_0x0083
            com.google.common.f.e r5 = f337249a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "Ignoring mailformed rule: '%s'"
            r7 = 35886(0x8c2e, float:5.0287E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56389s(r6, r3)
            goto L_0x005d
        L_0x0083:
            r3 = 0
            java.lang.Object r7 = r6.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = 65
            if (r8 == r9) goto L_0x00bd
            r3 = 69
            if (r8 == r3) goto L_0x00b3
            r3 = 81
            if (r8 == r3) goto L_0x00a9
            r3 = 83
            if (r8 == r3) goto L_0x009f
            goto L_0x00c6
        L_0x009f:
            java.lang.String r3 = "S"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 1
            goto L_0x00c7
        L_0x00a9:
            java.lang.String r3 = "Q"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 3
            goto L_0x00c7
        L_0x00b3:
            java.lang.String r3 = "E"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x00c6
            r3 = 2
            goto L_0x00c7
        L_0x00bd:
            java.lang.String r8 = "A"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r3 = -1
        L_0x00c7:
            r8 = 0
            if (r3 == 0) goto L_0x00db
            if (r3 == r2) goto L_0x00d8
            if (r3 == r1) goto L_0x00d5
            if (r3 == r5) goto L_0x00d2
            r3 = r8
            goto L_0x00dd
        L_0x00d2:
            com.google.android.apps.search.assistant.platform.i.e.a.b.h r3 = com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h.QUANTITY
            goto L_0x00dd
        L_0x00d5:
            com.google.android.apps.search.assistant.platform.i.e.a.b.h r3 = com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h.EVENT
            goto L_0x00dd
        L_0x00d8:
            com.google.android.apps.search.assistant.platform.i.e.a.b.h r3 = com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h.SPAN
            goto L_0x00dd
        L_0x00db:
            com.google.android.apps.search.assistant.platform.i.e.a.b.h r3 = com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h.ASYNC_SPAN
        L_0x00dd:
            java.lang.String r5 = "*"
            if (r3 != 0) goto L_0x00f7
            boolean r9 = r7.equals(r5)
            if (r9 != 0) goto L_0x00f7
            com.google.common.f.e r3 = f337249a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r5 = "Ignoring rule with unknown type pattern: '%s'"
            r6 = 35885(0x8c2d, float:5.0286E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56389s(r5, r7)
            goto L_0x005d
        L_0x00f7:
            java.lang.Object r7 = r6.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = r7.equals(r5)
            if (r2 != r9) goto L_0x0104
            r7 = r8
        L_0x0104:
            java.lang.Object r6 = r6.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = r6.equals(r5)
            if (r2 != r5) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            r8 = r6
        L_0x0112:
            com.google.android.apps.search.assistant.platform.i.e.a.d.a r5 = com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d.C121527a.f337247a
            java.lang.Object r3 = p3186j$.util.Map.EL.computeIfAbsent(r0, r3, r5)
            java.util.Map r3 = (java.util.Map) r3
            com.google.android.apps.search.assistant.platform.i.e.a.d.b r5 = com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d.C121528b.f337248a
            java.lang.Object r3 = p3186j$.util.Map.EL.computeIfAbsent(r3, r7, r5)
            java.util.Set r3 = (java.util.Set) r3
            r3.add(r8)
            goto L_0x005d
        L_0x0127:
            r10.f337250b = r0
            r10.f337251c = r5
            return
        L_0x012c:
            r10.f337251c = r2
            java.util.Map r11 = java.util.Collections.emptyMap()
            r10.f337250b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d.C121529c.<init>(java.lang.String):void");
    }

    /* renamed from: b */
    private static boolean m200828b(Map map, C121501i iVar) {
        if (map == null) {
            return false;
        }
        C121493a aVar = (C121493a) iVar;
        return m200829c((Set) map.get((Object) null), aVar.f337166b) || m200829c((Set) map.get(aVar.f337165a), aVar.f337166b);
    }

    /* renamed from: c */
    private static boolean m200829c(Set set, String str) {
        if (set != null) {
            return set.contains((Object) null) || set.contains(str);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo105226a(C121500h hVar, C121501i iVar) {
        int i = this.f337251c - 1;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return m200828b((Map) this.f337250b.get((Object) null), iVar) || m200828b((Map) this.f337250b.get(hVar), iVar);
        }
        return false;
    }
}
