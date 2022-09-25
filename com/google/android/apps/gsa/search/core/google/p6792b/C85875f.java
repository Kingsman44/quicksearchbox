package com.google.android.apps.gsa.search.core.google.p6792b;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.core.google.b.f */
/* compiled from: PG */
public class C85875f {

    /* renamed from: b */
    private static final C59071e f232189b = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.b.f");

    /* renamed from: a */
    protected final C86124t f232190a;

    /* renamed from: c */
    private final C86054o f232191c;

    protected C85875f(C86124t tVar, C86054o oVar) {
        this.f232190a = tVar;
        this.f232191c = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e8 A[EDGE_INSN: B:41:0x00e8->B:37:0x00e8 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo79507b(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r11, com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k r12, com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a r13) {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting from history."
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r2 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r2)
            com.google.android.apps.gsa.search.core.i.t r2 = r10.f232190a
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250847n
            java.lang.String r2 = r2.mo79758x(r3)
            android.net.Uri$Builder r1 = r1.authority(r2)
            boolean r2 = r11.mo44265s()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            com.google.at.h.d.a.aq r11 = r11.f108906A
            int r2 = r11.f142330a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0031
            com.google.at.h.d.a.ae r11 = r11.f142334f
            if (r11 != 0) goto L_0x002e
            com.google.at.h.d.a.ae r11 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x002e:
            java.lang.String r11 = r11.f142304o
            goto L_0x0032
        L_0x0031:
            r11 = r3
        L_0x0032:
            r1.encodedPath(r11)
            r11 = 0
            r2 = 0
        L_0x0037:
            r4 = 2
            if (r2 >= r4) goto L_0x00e8
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.google.android.apps.gsa.search.core.google.gaia.o r6 = r10.f232191c
            if (r6 != 0) goto L_0x0045
        L_0x0043:
            r6 = r3
            goto L_0x0056
        L_0x0045:
            com.google.android.apps.gsa.search.core.i.t r7 = r10.f232190a
            com.google.android.apps.gsa.shared.m.h r8 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250801aN
            java.lang.String r7 = r7.mo79758x(r8)
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r6 = r6.mo79657D(r7, r8)
            if (r6 != 0) goto L_0x0056
            goto L_0x0043
        L_0x0056:
            if (r6 == 0) goto L_0x006d
            com.google.android.apps.gsa.search.core.i.t r7 = r10.f232190a
            com.google.android.apps.gsa.shared.m.h r8 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250799aL
            java.lang.String r7 = r7.mo79758x(r8)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r7.concat(r6)
            java.lang.String r8 = "Authorization"
            r5.put(r8, r7)
        L_0x006d:
            if (r6 == 0) goto L_0x00e8
            com.google.android.apps.gsa.shared.aa.aq r7 = com.google.android.apps.gsa.shared.p6968aa.C89020ar.m144758c()     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            android.net.Uri r8 = r1.build()     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            java.lang.String r8 = r8.toString()     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            r7.mo82994f(r8)     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            r7.mo82991c(r5)     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            r7.f241244j = r11     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            r7.f241245k = r4     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            com.google.android.apps.gsa.shared.aa.ar r4 = r7.mo82989a()     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            java.lang.String r5 = "SuggestionFetcher"
            r7 = 148(0x94, float:2.07E-43)
            r8 = 24
            com.google.android.apps.gsa.shared.bb.b r5 = r13.mo78025a(r5, r7, r8)     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            com.google.android.apps.gsa.shared.aa.v r7 = com.google.android.apps.gsa.shared.p6968aa.C89066v.f241382a     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            com.google.android.apps.gsa.shared.aa.ap r8 = new com.google.android.apps.gsa.shared.aa.ap     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            com.google.android.apps.gsa.shared.aa.x r9 = com.google.android.apps.gsa.shared.p6968aa.C89009ag.f241207b     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            r8.<init>(r4, r9)     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            com.google.common.util.concurrent.cx r4 = r12.mo80852a(r5, r7, r8)     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            java.lang.Object r4 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r4)     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            com.google.android.apps.gsa.shared.aa.m r4 = (com.google.android.apps.gsa.shared.p6968aa.C89057m) r4     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            r4.mo83036f()     // Catch:{ ak -> 0x00cb, d -> 0x00be, InterruptedException -> 0x00bc, MalformedURLException -> 0x00ad, ExecutionException -> 0x00ab }
            r11 = 1
            return r11
        L_0x00ab:
            r12 = move-exception
            goto L_0x00ae
        L_0x00ad:
            r12 = move-exception
        L_0x00ae:
            com.google.common.f.e r13 = f232189b
            com.google.common.f.x r13 = r13.mo56226d()
            r1 = 8020(0x1f54, float:1.1238E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r12)).mo56372aa(r1)).mo56386p(r0)
            int r12 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            return r11
        L_0x00bc:
            r12 = move-exception
            goto L_0x00bf
        L_0x00be:
            r12 = move-exception
        L_0x00bf:
            com.google.common.f.e r13 = f232189b
            com.google.common.f.x r13 = r13.mo56226d()
            r1 = 8019(0x1f53, float:1.1237E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r12)).mo56372aa(r1)).mo56386p(r0)
            return r11
        L_0x00cb:
            r4 = move-exception
            int r5 = r4.f241213a
            r7 = 401(0x191, float:5.62E-43)
            if (r5 != r7) goto L_0x00dd
            com.google.android.apps.gsa.search.core.google.gaia.o r4 = r10.f232191c
            if (r4 == 0) goto L_0x00d9
            r4.mo79665L(r6)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00dd:
            com.google.common.f.e r12 = f232189b
            com.google.common.f.x r12 = r12.mo56226d()
            r13 = 8018(0x1f52, float:1.1236E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56382g(r4)).mo56372aa(r13)).mo56386p(r0)
        L_0x00e8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6792b.C85875f.mo79507b(com.google.android.libraries.searchbox.shared.suggestion.Suggestion, com.google.android.apps.gsa.search.core.v.a.k, com.google.android.apps.gsa.search.core.af.a.a):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: jL */
    public final String mo79508jL() {
        C86054o oVar = this.f232191c;
        if (oVar == null) {
            return null;
        }
        return oVar.mo79659F();
    }
}
