package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3745ab.C48305dd;
import com.google.assistant.p3994s.p3995a.C53376lp;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.je */
/* compiled from: PG */
public final /* synthetic */ class C109314je implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C109317jh f304499a;

    public /* synthetic */ C109314je(C109317jh jhVar) {
        this.f304499a = jhVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C109317jh jhVar = this.f304499a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C58833ax c = jhVar.mo97760c((C53422nh) axVar.mo56107c());
            if (c.mo56113h()) {
                if (jhVar.f304503c.mo79746e(C90069du.f249740r)) {
                    C53430np npVar = ((C53376lp) c.mo56107c()).f140066b;
                    if (npVar == null) {
                        npVar = C53430np.f140222e;
                    }
                    C48305dd b = jhVar.mo97759b(npVar);
                    C53430np npVar2 = ((C53376lp) c.mo56107c()).f140066b;
                    if (npVar2 == null) {
                        npVar2 = C53430np.f140222e;
                    }
                    return (C58485gu) Collection.EL.stream(npVar2.f140225b).map(new C109311jb(b)).collect(C58370cn.f155946a);
                }
                C53430np npVar3 = ((C53376lp) c.mo56107c()).f140066b;
                if (npVar3 == null) {
                    npVar3 = C53430np.f140222e;
                }
                return (C58485gu) Collection.EL.stream(npVar3.f140225b).map(C109312jc.f304496a).filter(new C109301ix(new C109316jg())).collect(C58370cn.f155946a);
            }
        }
        return C58485gu.m89845m();
    }
}
