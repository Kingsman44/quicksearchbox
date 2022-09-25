package org.p5633c.p5634a.p5639e;

import java.util.ArrayList;
import java.util.List;

/* renamed from: org.c.a.e.ah */
/* compiled from: PG */
public final class C72242ah {

    /* renamed from: a */
    public List f192227a;

    /* renamed from: b */
    private boolean f192228b;

    /* renamed from: c */
    private boolean f192229c;

    /* renamed from: d */
    private C72237ac[] f192230d;

    public C72242ah() {
        List list = this.f192227a;
        if (list == null) {
            this.f192227a = new ArrayList();
        } else {
            list.clear();
        }
        this.f192228b = false;
        this.f192229c = false;
        this.f192230d = new C72237ac[10];
    }

    /* renamed from: b */
    public static Object[] m106552b(List list) {
        int size = list.size();
        if (size == 0) {
            C72238ad adVar = C72238ad.f192218a;
            return new Object[]{adVar, adVar};
        } else if (size != 1) {
            C72235aa aaVar = new C72235aa(list);
            return new Object[]{aaVar, aaVar};
        } else {
            return new Object[]{list.get(0), list.get(1)};
        }
    }

    /* renamed from: a */
    public final C72269z mo63591a() {
        C72269z f = m106553f(this.f192227a, this.f192228b, this.f192229c);
        this.f192230d = (C72237ac[]) this.f192230d.clone();
        return f;
    }

    /* renamed from: c */
    public final void mo63592c(C72244aj ajVar, C72243ai aiVar) {
        this.f192227a.add(ajVar);
        this.f192227a.add(aiVar);
        boolean z = true;
        this.f192228b = (ajVar == null) | this.f192228b;
        boolean z2 = this.f192229c;
        if (aiVar != null) {
            z = false;
        }
        this.f192229c = z2 | z;
    }

    /* renamed from: d */
    public final void mo63593d(String str) {
        Object obj;
        Object obj2;
        C72241ag agVar = new C72241ag(str);
        if (this.f192227a.size() > 0) {
            List list = this.f192227a;
            obj = list.get(list.size() - 2);
            List list2 = this.f192227a;
            obj2 = list2.get(list2.size() - 1);
        } else {
            obj = null;
            obj2 = null;
        }
        if (obj == null || obj2 == null || obj != obj2 || !(obj instanceof C72237ac)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        C72237ac acVar = new C72237ac((C72237ac) obj, (C72239ae) agVar);
        List list3 = this.f192227a;
        list3.set(list3.size() - 2, acVar);
        List list4 = this.f192227a;
        list4.set(list4.size() - 1, acVar);
        this.f192230d[acVar.f192215a] = acVar;
    }

    /* renamed from: e */
    public final void mo63594e(int i) {
        C72237ac acVar = new C72237ac(i, this.f192230d);
        mo63592c(acVar, acVar);
        this.f192230d[i] = acVar;
    }

    /* renamed from: f */
    private static C72269z m106553f(List list, boolean z, boolean z2) {
        if (!z || !z2) {
            int size = list.size();
            if (size >= 2 && (list.get(0) instanceof C72240af)) {
                C72240af afVar = (C72240af) list.get(0);
                if (afVar.f192221b == null && afVar.f192220a == null) {
                    C72269z f = m106553f(list.subList(2, size), z, z2);
                    C72244aj ajVar = f.f192347a;
                    C72243ai aiVar = f.f192348b;
                    afVar.f192220a = ajVar;
                    afVar.f192221b = aiVar;
                    return new C72269z(afVar, afVar);
                }
            }
            Object[] b = m106552b(list);
            if (z) {
                return new C72269z((C72244aj) null, (C72243ai) b[1]);
            }
            if (z2) {
                return new C72269z((C72244aj) b[0], (C72243ai) null);
            }
            return new C72269z((C72244aj) b[0], (C72243ai) b[1]);
        }
        throw new IllegalStateException("Builder has created neither a printer nor a parser");
    }
}
