package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.ao */
/* compiled from: PG */
final class C84433ao implements C84431am {

    /* renamed from: a */
    public C58528ij f229753a = C58733pz.f156496a;

    /* renamed from: b */
    public final Context f229754b;

    /* renamed from: c */
    private final Map f229755c = new HashMap();

    /* renamed from: d */
    private final DataSetObservable f229756d = new DataSetObservable();

    /* renamed from: e */
    private final SharedPreferences f229757e;

    /* renamed from: f */
    private final C86124t f229758f;

    public C84433ao(Context context, SharedPreferences sharedPreferences, C86124t tVar) {
        this.f229754b = context;
        this.f229757e = sharedPreferences;
        this.f229758f = tVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: com.google.android.apps.gsa.search.core.ae.a.al} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m134768h() {
        /*
            r6 = this;
            java.util.Map r0 = r6.f229755c
            java.lang.String r1 = "com.google.android.gms/apps"
            boolean r0 = r0.containsKey(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0016
            java.util.Map r0 = r6.f229755c
            java.lang.String r3 = "com.google.android.googlequicksearchbox/applications_uri"
            java.lang.Object r0 = r0.remove(r3)
            com.google.android.apps.gsa.search.core.ae.a.al r0 = (com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84430al) r0
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 == 0) goto L_0x001b
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x001b:
            java.util.Map r0 = r6.f229755c
            java.lang.String r3 = "com.google.android.gms/contacts_contact_id"
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0030
            java.util.Map r0 = r6.f229755c
            java.lang.String r2 = "com.google.android.googlequicksearchbox/contacts_contact_id"
            java.lang.Object r0 = r0.remove(r2)
            r2 = r0
            com.google.android.apps.gsa.search.core.ae.a.al r2 = (com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84430al) r2
        L_0x0030:
            if (r2 == 0) goto L_0x0034
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0034:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r2 = r6.f229755c
            java.lang.String r3 = "com.google.android.googlequicksearchbox/sms"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0094
            java.util.Map r2 = r6.f229755c
            java.lang.String r4 = "com.google.android.gms/sms"
            boolean r2 = r2.containsKey(r4)
            java.lang.String r5 = "com.google.android.gms/internal.3p:Message"
            if (r2 != 0) goto L_0x0057
            java.util.Map r2 = r6.f229755c
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0094
        L_0x0057:
            java.util.Map r2 = r6.f229755c
            java.lang.Object r2 = r2.remove(r3)
            com.google.android.apps.gsa.search.core.ae.a.al r2 = (com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84430al) r2
            if (r2 == 0) goto L_0x0064
            r0.add(r2)
        L_0x0064:
            java.util.Map r2 = r6.f229755c
            boolean r2 = r2.containsKey(r4)
            if (r2 == 0) goto L_0x0094
            java.util.Map r2 = r6.f229755c
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0094
            com.google.android.apps.gsa.search.core.i.t r2 = r6.f229758f
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250246x
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0087
            java.util.Map r2 = r6.f229755c
            java.lang.Object r2 = r2.remove(r4)
            com.google.android.apps.gsa.search.core.ae.a.al r2 = (com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84430al) r2
            goto L_0x008f
        L_0x0087:
            java.util.Map r2 = r6.f229755c
            java.lang.Object r2 = r2.remove(r5)
            com.google.android.apps.gsa.search.core.ae.a.al r2 = (com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84430al) r2
        L_0x008f:
            if (r2 == 0) goto L_0x0094
            r0.add(r2)
        L_0x0094:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009c
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x009c:
            java.util.Map r0 = r6.f229755c
            java.lang.String r2 = "com.google.android.googlequicksearchbox/gmail"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x00c7
            java.util.Map r0 = r6.f229755c
            java.lang.String r3 = "com.google.android.gm"
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x00c7
            java.util.Map r0 = r6.f229755c
            r0.remove(r2)
            android.content.SharedPreferences r0 = r6.f229757e
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "enable_corpus_com.google.android.googlequicksearchbox/gmail"
            r3 = 0
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)
            r0.commit()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x00c7:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f229758f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C89995ba.f246756d
            boolean r0 = r0.mo79746e(r2)
            if (r0 != 0) goto L_0x00f6
            java.util.Map r0 = r6.f229755c
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00f6
            java.util.Map r0 = r6.f229755c
            java.lang.String r2 = "com.google.android.gms/internal.3p:MobileApplication"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x00f6
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f229758f
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C89995ba.f246757e
            boolean r0 = r0.mo79746e(r3)
            r3 = 1
            if (r3 == r0) goto L_0x00ef
            r1 = r2
        L_0x00ef:
            java.util.Map r0 = r6.f229755c
            r0.remove(r1)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x00f6:
            java.util.Map r0 = r6.f229755c
            java.util.Collection r0 = r0.values()
            com.google.common.b.ij r1 = r6.f229753a
            boolean r1 = com.google.common.p4522b.C58557jl.m90140u(r0, r1)
            if (r1 != 0) goto L_0x0111
            com.google.common.b.ij r0 = com.google.common.p4522b.C58528ij.m90006F(r0)
            r6.f229753a = r0
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.database.DataSetObservable r0 = r6.f229756d
            r0.notifyChanged()
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84433ao.m134768h():void");
    }

    /* renamed from: a */
    public final synchronized Collection mo78016a() {
        return this.f229753a;
    }

    /* renamed from: b */
    public final synchronized void mo78011b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C84430al alVar = (C84430al) it.next();
            this.f229755c.put(alVar.f229733a, alVar);
            C58976aa aaVar = C58975e.f156826a;
        }
        m134768h();
    }

    /* renamed from: c */
    public final synchronized void mo78012c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f229755c.clear();
        m134768h();
    }

    /* renamed from: e */
    public final synchronized void mo78013e(String str) {
        Iterator it = this.f229755c.values().iterator();
        while (it.hasNext()) {
            if (((C84430al) it.next()).f229734b.equals(str)) {
                it.remove();
                C58976aa aaVar = C58975e.f156826a;
            }
        }
        m134768h();
    }

    /* renamed from: f */
    public final void mo78017f(DataSetObserver dataSetObserver) {
        C58976aa aaVar = C58975e.f156826a;
        this.f229756d.registerObserver(dataSetObserver);
    }

    /* renamed from: g */
    public final void mo78018g(DataSetObserver dataSetObserver) {
        C58976aa aaVar = C58975e.f156826a;
        this.f229756d.unregisterObserver(dataSetObserver);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("IcingSources");
        C58800sl lA = this.f229753a.iterator();
        while (lA.hasNext()) {
            fVar.mo85286m((C90991b) lA.next());
        }
    }
}
