package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1880l.C22875c;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62963cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.af */
/* compiled from: PG */
public final /* synthetic */ class C116375af implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C116381al f322707a;

    public /* synthetic */ C116375af(C116381al alVar) {
        this.f322707a = alVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C116381al alVar = this.f322707a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C57578av avVar = (C57578av) axVar.mo56107c();
        C57566aj ajVar = avVar.f153824a;
        if (ajVar != null) {
            C62963cj<C57665z> cjVar = new C62963cj(ajVar.f153795c, C57566aj.f153790d);
            if (cjVar.isEmpty()) {
                return C58833ax.m90834k(C116371ab.m193010a(avVar));
            }
            C22876d dVar = alVar.f322720h;
            if ((dVar.f62946a & 16) != 0) {
                C22875c a = C22875c.m42745a(dVar.f62951f);
                if (a == null) {
                    a = C22875c.IMAGE;
                }
                int i = a.f62943e;
                for (C57665z e : cjVar) {
                    if (C116381al.m193027e(e) == i) {
                        return C58833ax.m90834k(C116371ab.m193010a(avVar));
                    }
                }
            }
        }
        return C58836b.f156633a;
    }
}
