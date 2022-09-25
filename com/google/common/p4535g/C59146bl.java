package com.google.common.p4535g;

import com.google.common.p4522b.C58461fx;
import com.google.common.p4522b.C58692ol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.g.bl */
/* compiled from: PG */
public final class C59146bl {

    /* renamed from: a */
    public final C59145bk f157195a;

    /* renamed from: b */
    public final Map f157196b;

    /* renamed from: c */
    public final List f157197c;

    public C59146bl() {
        C59145bk bkVar = C59145bk.f157188a;
        throw null;
    }

    /* renamed from: a */
    public final C59133az mo56531a(C59136bb bbVar, C59136bb bbVar2, List list) {
        boolean z;
        List arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(bbVar);
        arrayList.add(bbVar2);
        hashMap.put(bbVar2, 1);
        while (true) {
            C59136bb bbVar3 = null;
            if (arrayList.size() < 2) {
                return null;
            }
            C59136bb bbVar4 = (C59136bb) arrayList.get(arrayList.size() - 2);
            C59136bb bbVar5 = (C59136bb) arrayList.get(arrayList.size() - 1);
            C58692ol<C59136bb> olVar = (C58692ol) this.f157196b.get(bbVar5);
            if (olVar != null) {
                z = false;
                for (C59136bb bbVar6 : olVar) {
                    if (!bbVar6.mo56506q(bbVar4)) {
                        if (!z || C59148bn.m91713b(bbVar4, bbVar3, bbVar6, bbVar5)) {
                            bbVar3 = bbVar6;
                        }
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                list.add(new C59110ac(bbVar4, bbVar5));
                mo56533c(bbVar4, bbVar5);
                hashMap.remove(bbVar5);
                arrayList.remove(arrayList.size() - 1);
            } else if (hashMap.get(bbVar3) == null) {
                hashMap.put(bbVar3, Integer.valueOf(arrayList.size()));
                arrayList.add(bbVar3);
            } else {
                if (((Integer) hashMap.get(bbVar3)).intValue() != 1 || !((C59136bb) arrayList.get(0)).mo56506q((C59136bb) arrayList.get(arrayList.size() - 1))) {
                    arrayList = arrayList.subList(((Integer) hashMap.get(bbVar3)).intValue(), arrayList.size());
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
                C59133az azVar = new C59133az(arrayList);
                C59145bk bkVar = this.f157195a;
                boolean z2 = bkVar.f157191d;
                return (!bkVar.f157189b || azVar.f157144e.f157135b.mo56625a() < 3.141592653589793d || C59210dv.m91843a(azVar.mo56482j()) >= (-C59222p.m91895a(azVar.f157143d))) ? azVar : mo56531a((C59136bb) arrayList.get(1), (C59136bb) arrayList.get(0), list);
            }
        }
    }

    /* renamed from: b */
    public final C59142bh mo56532b() {
        C59142bh bhVar = new C59142bh();
        for (Map.Entry entry : this.f157196b.entrySet()) {
            bhVar.mo56515b(C59142bh.m91686c((C59136bb) entry.getKey()));
            for (C59136bb c : ((C58692ol) entry.getValue()).mo54974l()) {
                bhVar.mo56515b(C59142bh.m91686c(c));
            }
        }
        return bhVar;
    }

    /* renamed from: c */
    public final void mo56533c(C59136bb bbVar, C59136bb bbVar2) {
        C58692ol olVar = (C58692ol) this.f157196b.get(bbVar);
        olVar.remove(bbVar2);
        if (olVar.isEmpty()) {
            this.f157196b.remove(bbVar);
        }
        if (this.f157195a.f157189b) {
            C58692ol olVar2 = (C58692ol) this.f157196b.get(bbVar2);
            olVar2.remove(bbVar);
            if (olVar2.isEmpty()) {
                this.f157196b.remove(bbVar2);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo56534d(C59136bb bbVar, C59136bb bbVar2) {
        if (bbVar.mo56506q(bbVar2)) {
            return false;
        }
        if (!this.f157195a.f157190c || !mo56535e(bbVar2, bbVar)) {
            if (this.f157196b.get(bbVar) == null) {
                this.f157196b.put(bbVar, new C58461fx());
                this.f157197c.add(bbVar);
            }
            ((C58692ol) this.f157196b.get(bbVar)).add(bbVar2);
            if (!this.f157195a.f157189b) {
                return true;
            }
            if (this.f157196b.get(bbVar2) == null) {
                this.f157196b.put(bbVar2, new C58461fx());
                this.f157197c.add(bbVar2);
            }
            ((C58692ol) this.f157196b.get(bbVar2)).add(bbVar);
            return true;
        }
        mo56533c(bbVar2, bbVar);
        return false;
    }

    /* renamed from: e */
    public final boolean mo56535e(C59136bb bbVar, C59136bb bbVar2) {
        C58692ol olVar = (C58692ol) this.f157196b.get(bbVar);
        return olVar != null && olVar.mo54932lv(bbVar2) > 0;
    }

    public C59146bl(C59145bk bkVar) {
        this.f157196b = new HashMap();
        this.f157197c = new ArrayList();
        this.f157195a = bkVar;
    }
}
