package com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137907b;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137975a;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.a.k */
/* compiled from: PG */
public final class C138145k implements C137975a {

    /* renamed from: a */
    private final C137907b f375859a;

    /* renamed from: b */
    private final C71422aw f375860b;

    public C138145k(C137907b bVar, C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f375859a = bVar;
        this.f375860b = awVar;
    }

    /* renamed from: a */
    public final int mo114065a() {
        return 100;
    }

    /* renamed from: b */
    public final C60870cx mo114066b(C138133o oVar, List list, C138134p pVar) {
        C69664n.m101061g(oVar, "request");
        C69664n.m101061g(list, "suggestions");
        C69664n.m101061g(pVar, "responseParameters");
        return C71663i.m104688a(C71803m.m105042c(this.f375860b, (C69585o) null, (C71424ay) null, new C138143i(this, oVar, list, (C69577g) null), 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.util.List} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114165c(com.google.android.apps.search.googleapp.search.suggest.C138133o r9, java.util.List r10, p5462h.p5466c.C69577g r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a.C138144j
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.googleapp.search.suggest.plugins.a.j r0 = (com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a.C138144j) r0
            int r1 = r0.f375858e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375858e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.plugins.a.j r0 = new com.google.android.apps.search.googleapp.search.suggest.plugins.a.j
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f375856c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375858e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            int r9 = r0.f375855b
            java.lang.Object r10 = r0.f375854a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0090
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            p5462h.C69714l.m101134b(r11)
            java.util.Iterator r11 = r10.iterator()
            r2 = 0
        L_0x003b:
            boolean r4 = r11.hasNext()
            r5 = -1
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r11.next()
            com.google.android.apps.search.googleapp.search.suggest.av r4 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r4
            int r6 = r4.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r6 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r6)
            if (r6 != 0) goto L_0x0052
            com.google.android.apps.search.googleapp.search.suggest.au r6 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0052:
            com.google.android.apps.search.googleapp.search.suggest.au r7 = com.google.android.apps.search.googleapp.search.suggest.C138029au.IN_CONTEXT_CONTROL
            if (r6 != r7) goto L_0x0067
            com.google.protobuf.cj r6 = new com.google.protobuf.cj
            com.google.protobuf.ch r4 = r4.f375542e
            com.google.protobuf.ci r7 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r6.<init>(r4, r7)
            com.google.protos.ba.a.b r4 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_SPYW_IN_CONTEXT_CONTROL
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L_0x006b
        L_0x0067:
            int r2 = r2 + 1
            goto L_0x003b
        L_0x006a:
            r2 = -1
        L_0x006b:
            if (r2 == r5) goto L_0x009c
            int r9 = r9.f375830g
            com.google.android.apps.search.googleapp.t.e.d r9 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r9)
            if (r9 != 0) goto L_0x0077
            com.google.android.apps.search.googleapp.t.e.d r9 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x0077:
            boolean r9 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e.m227143a(r9)
            if (r9 != 0) goto L_0x0099
            com.google.android.apps.search.googleapp.search.suggest.a.a.b r9 = r8.f375859a
            com.google.common.util.concurrent.cx r9 = r9.mo114041a()
            r0.f375854a = r10
            r0.f375855b = r2
            r0.f375858e = r3
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r11 == r1) goto L_0x0098
            r9 = r2
        L_0x0090:
            com.google.android.apps.search.googleapp.search.suggest.a.a.i r11 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137914i) r11
            boolean r11 = r11.f375237b
            if (r11 == 0) goto L_0x009c
            r2 = r9
            goto L_0x0099
        L_0x0098:
            return r1
        L_0x0099:
            r10.remove(r2)
        L_0x009c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a.C138145k.mo114165c(com.google.android.apps.search.googleapp.search.suggest.o, java.util.List, h.c.g):java.lang.Object");
    }
}
