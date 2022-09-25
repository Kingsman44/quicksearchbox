package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d;

import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137915aa;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.d.e */
/* compiled from: PG */
public final class C137979e {

    /* renamed from: a */
    public final C71422aw f375392a;

    /* renamed from: b */
    private final Set f375393b;

    /* renamed from: c */
    private final C137915aa f375394c;

    /* renamed from: d */
    private final List f375395d;

    public C137979e(Set set, C71422aw awVar, C137915aa aaVar) {
        C69664n.m101061g(set, "preSuppressionTwiddlersSet");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f375393b = set;
        this.f375392a = awVar;
        this.f375394c = aaVar;
        this.f375395d = C69540x.m100837S(set, new C137976b());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.google.android.apps.search.googleapp.search.suggest.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.util.Iterator} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.android.apps.search.googleapp.search.suggest.p, code=java.lang.Object, for r11v0, types: [com.google.android.apps.search.googleapp.search.suggest.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114068a(com.google.android.apps.search.googleapp.search.suggest.C138133o r9, java.util.List r10, java.lang.Object r11, p5462h.p5466c.C69577g r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137977c
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.googleapp.search.suggest.a.d.c r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137977c) r0
            int r1 = r0.f375386g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375386g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.d.c r0 = new com.google.android.apps.search.googleapp.search.suggest.a.d.c
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f375384e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375386g
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r9 = r0.f375383d
            java.lang.Object r10 = r0.f375382c
            java.lang.Object r11 = r0.f375381b
            java.lang.Object r2 = r0.f375380a
            p5462h.C69714l.m101134b(r12)
            r7 = r11
            r11 = r10
            r10 = r7
            goto L_0x0077
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            p5462h.C69714l.m101134b(r12)
            java.util.List r12 = r8.f375395d
            java.util.Iterator r12 = r12.iterator()
            r2 = r8
            r7 = r10
            r10 = r9
            r9 = r12
        L_0x0047:
            r12 = r11
            r11 = r7
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x009a
            java.lang.Object r4 = r9.next()
            com.google.android.apps.search.googleapp.search.suggest.a.d.a r4 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137975a) r4
            r5 = r10
            com.google.android.apps.search.googleapp.search.suggest.o r5 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r5
            r6 = r12
            com.google.android.apps.search.googleapp.search.suggest.p r6 = (com.google.android.apps.search.googleapp.search.suggest.C138134p) r6
            com.google.common.util.concurrent.cx r11 = r4.mo114066b(r5, r11, r6)
            java.lang.String r4 = "twiddler\n          .twid…ions, responseParameters)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            r0.f375380a = r2
            r0.f375381b = r10
            r0.f375382c = r12
            r0.f375383d = r9
            r0.f375386g = r3
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r0)
            if (r11 == r1) goto L_0x0099
            r7 = r12
            r12 = r11
            r11 = r7
        L_0x0077:
            java.lang.String r4 = "twiddler\n          .twid…eters)\n          .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r4)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            r4 = r2
            com.google.android.apps.search.googleapp.search.suggest.a.d.e r4 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137979e) r4
            com.google.android.apps.search.googleapp.search.suggest.a.aa r4 = r4.f375394c
            r5 = r10
            com.google.android.apps.search.googleapp.search.suggest.o r5 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r5
            java.util.Comparator r4 = r4.mo114044a(r5)
            java.lang.String r5 = "suggestComparators.getSu…estionComparator(request)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.util.List r12 = p5462h.p5463a.C69540x.m100837S(r12, r4)
            java.util.List r12 = p5462h.p5463a.C69540x.m100842X(r12)
            r7 = r12
            goto L_0x0047
        L_0x0099:
            return r1
        L_0x009a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137979e.mo114068a(com.google.android.apps.search.googleapp.search.suggest.o, java.util.List, com.google.android.apps.search.googleapp.search.suggest.p, h.c.g):java.lang.Object");
    }
}
