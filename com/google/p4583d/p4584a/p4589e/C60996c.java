package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4588d.C60988o;
import com.google.p4583d.p4584a.p4590f.C61011a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.d.a.e.c */
/* compiled from: PG */
public final class C60996c {

    /* renamed from: a */
    final Map f165131a = new HashMap();

    /* renamed from: b */
    final C61008o f165132b = new C61008o();

    public C60996c() {
        mo57520b(new C60994a());
        mo57520b(new C60997d());
        mo57520b(new C60998e());
        mo57520b(new C61001h());
        mo57520b(new C61006m());
        mo57520b(new C61007n());
        mo57520b(new C61009p());
    }

    /* renamed from: a */
    public final C60987n mo57519a(C61012g gVar, C60987n nVar) {
        C60995b bVar;
        C61013h.m93270l(gVar);
        if (!(nVar instanceof C60988o)) {
            return nVar;
        }
        C60988o oVar = (C60988o) nVar;
        ArrayList arrayList = oVar.f165123b;
        String str = oVar.f165122a;
        if (this.f165131a.containsKey(str)) {
            bVar = (C60995b) this.f165131a.get(str);
        } else {
            bVar = this.f165132b;
        }
        return bVar.mo57517a(str, gVar, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo57520b(C60995b bVar) {
        for (C61011a aVar : bVar.f165130a) {
            this.f165131a.put(Integer.valueOf(aVar.f165213ap).toString(), bVar);
        }
    }
}
