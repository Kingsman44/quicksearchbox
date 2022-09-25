package com.facebook.litho.p329g.p330a;

import com.facebook.litho.C6128bi;
import com.facebook.litho.C6268fk;
import com.facebook.litho.C6381hf;
import com.facebook.litho.C6404n;
import com.facebook.litho.C6407q;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p329g.C6324c;
import com.facebook.litho.p329g.C6326e;
import com.facebook.litho.p329g.C6335n;
import com.facebook.litho.p329g.C6336o;
import com.facebook.litho.widget.C6544i;
import com.facebook.litho.widget.C6546k;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.litho.g.a.j */
/* compiled from: PG */
public final class C6295j extends C6335n {
    @C6117a(mo12871a = 10)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: m */
    C6407q f18575m;

    private C6295j() {
        super("SingleComponentSection");
    }

    /* renamed from: s */
    public static C6294i m16874s(C6336o oVar) {
        C6294i iVar = new C6294i();
        C6295j jVar = new C6295j();
        C6268fk fkVar = oVar.f19013f;
        iVar.f18572a = jVar;
        iVar.f18573b.clear();
        return iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13290f((C6335n) obj);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C6335n mo13297c(boolean z) {
        C6295j jVar = (C6295j) super.mo13297c(z);
        C6407q qVar = jVar.f18575m;
        jVar.f18575m = qVar != null ? qVar.mo13318j() : null;
        return jVar;
    }

    /* renamed from: f */
    public final boolean mo13290f(C6335n nVar) {
        if (this == nVar) {
            return true;
        }
        if (nVar == null || getClass() != nVar.getClass()) {
            return false;
        }
        C6295j jVar = (C6295j) nVar;
        C6407q qVar = this.f18575m;
        return qVar == null ? jVar.f18575m == null : qVar.mo13057a(jVar.f18575m);
    }

    /* renamed from: k */
    public final boolean mo13291k() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo13292n(C6336o oVar, C6326e eVar, C6335n nVar, C6335n nVar2) {
        Object obj;
        boolean z;
        C6336o oVar2 = oVar;
        C6326e eVar2 = eVar;
        C6295j jVar = (C6295j) nVar;
        C6295j jVar2 = (C6295j) nVar2;
        C6128bi biVar = new C6128bi(jVar == null ? null : jVar.f18575m, jVar2 == null ? null : jVar2.f18575m);
        C6128bi biVar2 = new C6128bi((Object) null, (Object) null);
        C6128bi biVar3 = new C6128bi((Object) null, (Object) null);
        C6128bi biVar4 = new C6128bi((Object) null, (Object) null);
        C6128bi biVar5 = new C6128bi((Object) null, (Object) null);
        C6128bi biVar6 = new C6128bi((Object) null, (Object) null);
        C6128bi biVar7 = new C6128bi((Object) null, (Object) null);
        Object obj2 = biVar6.f18143a;
        Object obj3 = biVar6.f18144b;
        C6407q qVar = (C6407q) biVar.f18143a;
        C6407q qVar2 = (C6407q) biVar.f18144b;
        if (qVar != null || qVar2 != null) {
            if (qVar == null || qVar2 != null) {
                Object obj4 = biVar2.f18144b;
                boolean booleanValue = obj4 != null ? ((Boolean) obj4).booleanValue() : false;
                Object obj5 = biVar3.f18144b;
                int intValue = obj5 != null ? ((Integer) obj5).intValue() : 1;
                Object obj6 = biVar4.f18144b;
                boolean booleanValue2 = obj6 != null ? ((Boolean) obj6).booleanValue() : false;
                if (qVar != null) {
                    Object obj7 = biVar2.f18143a;
                    boolean booleanValue3 = obj7 != null ? ((Boolean) obj7).booleanValue() : false;
                    Object obj8 = biVar3.f18143a;
                    int intValue2 = obj8 != null ? ((Integer) obj8).intValue() : 1;
                    Object obj9 = biVar4.f18143a;
                    boolean booleanValue4 = obj9 != null ? ((Boolean) obj9).booleanValue() : false;
                    Map map = (Map) biVar5.f18143a;
                    Map map2 = (Map) biVar5.f18144b;
                    if (map == map2) {
                        obj = obj3;
                    } else {
                        if (map == null || map2 == null) {
                            obj = obj3;
                        } else {
                            obj = obj3;
                            if (map.size() == map2.size()) {
                                Iterator it = map.entrySet().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Map.Entry entry = (Map.Entry) it.next();
                                    if (!C6404n.m17223b(entry.getValue(), map2.get(entry.getKey()))) {
                                        break;
                                    }
                                }
                            }
                        }
                        z = false;
                        if (booleanValue3 == booleanValue || intValue2 != intValue || booleanValue4 != booleanValue2 || !z || !qVar.mo13057a(qVar2)) {
                            C6544i iVar = new C6544i();
                            C6296k.m16880a(iVar, (Map) biVar5.f18144b, biVar7);
                            iVar.f19488b = qVar2;
                            iVar.mo13495c(booleanValue);
                            iVar.mo13496d(intValue);
                            iVar.mo13494b(booleanValue2);
                            eVar.mo13341i(0, new C6546k(iVar), C6381hf.m17120b(oVar2.f19016i), obj2, obj);
                            return;
                        }
                        return;
                    }
                    z = true;
                    if (booleanValue3 == booleanValue) {
                    }
                    C6544i iVar2 = new C6544i();
                    C6296k.m16880a(iVar2, (Map) biVar5.f18144b, biVar7);
                    iVar2.f19488b = qVar2;
                    iVar2.mo13495c(booleanValue);
                    iVar2.mo13496d(intValue);
                    iVar2.mo13494b(booleanValue2);
                    eVar.mo13341i(0, new C6546k(iVar2), C6381hf.m17120b(oVar2.f19016i), obj2, obj);
                    return;
                }
                C6544i iVar3 = new C6544i();
                C6296k.m16880a(iVar3, (Map) biVar5.f18144b, biVar7);
                iVar3.f19488b = qVar2;
                iVar3.mo13495c(booleanValue);
                iVar3.mo13496d(intValue);
                iVar3.mo13494b(booleanValue2);
                eVar.mo13339g(0, new C6546k(iVar3), C6381hf.m17120b(oVar2.f19016i), obj3);
                return;
            }
            eVar2.mo13338f(C6324c.m16968e(0, obj2));
        }
    }
}
