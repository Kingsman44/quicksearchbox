package androidx.camera.core.p069a;

import androidx.camera.core.C1477bw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.a.dc */
/* compiled from: PG */
public final class C1370dc {

    /* renamed from: a */
    public final String f3863a;

    /* renamed from: b */
    public final Map f3864b = new LinkedHashMap();

    public C1370dc(String str) {
        this.f3863a = str;
    }

    /* renamed from: j */
    private final C1369db m3736j(String str, C1357cq cqVar, C1373df dfVar) {
        C1369db dbVar = (C1369db) this.f3864b.get(str);
        if (dbVar != null) {
            return dbVar;
        }
        C1369db dbVar2 = new C1369db(cqVar, dfVar);
        this.f3864b.put(str, dbVar2);
        return dbVar2;
    }

    /* renamed from: a */
    public final C1356cp mo4264a() {
        C1356cp cpVar = new C1356cp();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3864b.entrySet()) {
            C1369db dbVar = (C1369db) entry.getValue();
            if (dbVar.f3861c) {
                cpVar.mo4240b(dbVar.f3859a);
                arrayList.add((String) entry.getKey());
            }
        }
        C1477bw.m3978a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f3863a);
        return cpVar;
    }

    /* renamed from: b */
    public final Collection mo4265b() {
        return Collections.unmodifiableCollection(mo4267d(C1365cy.f3854a));
    }

    /* renamed from: c */
    public final Collection mo4266c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3864b.entrySet()) {
            if (((C1369db) entry.getValue()).f3861c) {
                arrayList.add(((C1369db) entry.getValue()).f3860b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* renamed from: d */
    public final Collection mo4267d(C1368da daVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3864b.entrySet()) {
            if (daVar == null || daVar.mo4260a((C1369db) entry.getValue())) {
                arrayList.add(((C1369db) entry.getValue()).f3859a);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final void mo4268e(String str, C1357cq cqVar, C1373df dfVar) {
        m3736j(str, cqVar, dfVar).f3862d = true;
    }

    /* renamed from: f */
    public final void mo4269f(String str, C1357cq cqVar, C1373df dfVar) {
        m3736j(str, cqVar, dfVar).f3861c = true;
    }

    /* renamed from: g */
    public final void mo4270g(String str) {
        if (this.f3864b.containsKey(str)) {
            C1369db dbVar = (C1369db) this.f3864b.get(str);
            dbVar.f3862d = false;
            if (!dbVar.f3861c) {
                this.f3864b.remove(str);
            }
        }
    }

    /* renamed from: h */
    public final void mo4271h(String str, C1357cq cqVar, C1373df dfVar) {
        if (this.f3864b.containsKey(str)) {
            C1369db dbVar = new C1369db(cqVar, dfVar);
            C1369db dbVar2 = (C1369db) this.f3864b.get(str);
            dbVar.f3861c = dbVar2.f3861c;
            dbVar.f3862d = dbVar2.f3862d;
            this.f3864b.put(str, dbVar);
        }
    }

    /* renamed from: i */
    public final boolean mo4272i(String str) {
        if (!this.f3864b.containsKey(str)) {
            return false;
        }
        return ((C1369db) this.f3864b.get(str)).f3861c;
    }
}
