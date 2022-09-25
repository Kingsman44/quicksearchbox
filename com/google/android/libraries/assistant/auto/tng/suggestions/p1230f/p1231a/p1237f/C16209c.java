package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1237f;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16064a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.C16189a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16364bk;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.f.c */
/* compiled from: PG */
public final class C16209c implements C16189a {

    /* renamed from: a */
    public static final /* synthetic */ int f47773a = 0;

    /* renamed from: b */
    private static final C59071e f47774b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.f.a.f.c");

    /* renamed from: c */
    private static final C58528ij f47775c = C58528ij.m90011K("en-US", "en-GB");

    /* renamed from: d */
    private final C21370a f47776d;

    /* renamed from: e */
    private C16364bk f47777e = C16364bk.f48168g;

    public C16209c(C21370a aVar) {
        this.f47776d = aVar;
    }

    /* renamed from: b */
    private final C16170n m33244b(List list, C16327aa aaVar) {
        Optional findFirst = Collection.EL.stream(list).filter(new C16208b(aaVar)).findFirst();
        String str = null;
        if (findFirst.isEmpty()) {
            return null;
        }
        C16170n nVar = (C16170n) findFirst.get();
        if ((this.f47777e.f48170a & 8) != 0 && nVar.mo22747b().f48083h.size() == 2) {
            long j = this.f47777e.f48174e;
            if (f47775c.contains(nVar.mo22753g())) {
                C58976aa aaVar2 = C58975e.f156826a;
                double d = (double) j;
                Double.isNaN(d);
                str = String.format((String) nVar.mo22747b().f48083h.get(1), new Object[]{String.valueOf(Math.round(d * 0.621371d))});
            } else {
                str = String.format((String) nVar.mo22747b().f48083h.get(0), new Object[]{String.valueOf(j)});
            }
        }
        C16064a aVar = new C16064a();
        aVar.mo22677c(nVar.mo22752f());
        aVar.f47529b = str;
        aVar.mo22676b(nVar.mo22750e());
        aVar.mo22678d(nVar.mo22753g());
        aVar.mo22680f(nVar.mo22746a());
        aVar.f47530c = Long.valueOf(this.f47776d.mo26870b());
        aVar.mo22679e(nVar.mo22747b());
        return aVar.mo22675a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo22848a(java.util.List r6, com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.base.ax r7 = r7.mo22554j()
            boolean r1 = r7.mo56113h()
            java.lang.String r2 = "SuggestionGenerator"
            if (r1 != 0) goto L_0x0027
            com.google.common.f.e r6 = f47774b
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r2)
            java.lang.String r7 = "vehicle signal is absent"
            r1 = 46641(0xb631, float:6.5358E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r1)).mo56386p(r7)
            return r0
        L_0x0027:
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.libraries.assistant.auto.tng.suggestions.k.bk r7 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16364bk) r7
            r5.f47777e = r7
            boolean r1 = r7.f48172c
            r3 = 0
            if (r1 == 0) goto L_0x006a
            int r7 = r7.f48173d
            int r7 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16363bj.m33344a(r7)
            r1 = 2
            if (r7 != 0) goto L_0x003e
            r7 = 2
        L_0x003e:
            int r7 = r7 + -1
            r4 = 1
            if (r7 == r4) goto L_0x0063
            if (r7 == r1) goto L_0x005c
            r1 = 3
            if (r7 == r1) goto L_0x0063
            com.google.common.f.e r7 = f47774b
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r1, r2)
            java.lang.String r1 = "unknown fuel type"
            r2 = 46636(0xb62c, float:6.5351E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r2)).mo56386p(r1)
            goto L_0x006a
        L_0x005c:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.aa r7 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa.EV_STATION
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n r7 = r5.m33244b(r6, r7)
            goto L_0x006b
        L_0x0063:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.aa r7 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa.GAS_STATION
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n r7 = r5.m33244b(r6, r7)
            goto L_0x006b
        L_0x006a:
            r7 = r3
        L_0x006b:
            if (r7 == 0) goto L_0x0070
            r0.add(r7)
        L_0x0070:
            com.google.android.libraries.assistant.auto.tng.suggestions.k.bk r7 = r5.f47777e
            boolean r7 = r7.f48175f
            if (r7 != 0) goto L_0x0077
            goto L_0x00d0
        L_0x0077:
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r6)
            com.google.android.libraries.assistant.auto.tng.suggestions.f.a.f.a r7 = com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1237f.C16207a.f47771a
            j$.util.stream.Stream r6 = r6.filter(r7)
            j$.util.Optional r6 = r6.findFirst()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x008c
            goto L_0x00d0
        L_0x008c:
            java.lang.Object r6 = r6.get()
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n r6 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n) r6
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.a r7 = new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.a
            r7.<init>()
            java.lang.String r1 = r6.mo22752f()
            r7.mo22677c(r1)
            java.lang.String r1 = r6.mo22749d()
            r7.f47529b = r1
            java.lang.String r1 = r6.mo22750e()
            r7.mo22676b(r1)
            java.lang.String r1 = r6.mo22753g()
            r7.mo22678d(r1)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m r1 = r6.mo22746a()
            r7.mo22680f(r1)
            com.google.android.libraries.f.a r1 = r5.f47776d
            long r1 = r1.mo26870b()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.f47530c = r1
            com.google.android.libraries.assistant.auto.tng.suggestions.k.ag r6 = r6.mo22747b()
            r7.mo22679e(r6)
            com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n r3 = r7.mo22675a()
        L_0x00d0:
            if (r3 == 0) goto L_0x00d5
            r0.add(r3)
        L_0x00d5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1237f.C16209c.mo22848a(java.util.List, com.google.android.libraries.assistant.auto.tng.suggestions.a.b.d):java.util.List");
    }
}
