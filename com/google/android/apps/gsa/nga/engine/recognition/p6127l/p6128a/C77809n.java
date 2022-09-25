package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77822b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5218j.p5219a.C66722az;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.n */
/* compiled from: PG */
public final class C77809n implements C77822b {

    /* renamed from: b */
    private static final C59071e f214340b = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.recognition.l.a.n");

    /* renamed from: a */
    public C58528ij f214341a = C58733pz.f156496a;

    /* renamed from: c */
    private final C91142g f214342c;

    public C77809n(C91142g gVar) {
        this.f214342c = gVar;
    }

    /* renamed from: a */
    public final C58485gu mo72829a(List list) {
        if (!this.f214342c.mo85405j(C90126fx.f250955H)) {
            return C58485gu.m89845m();
        }
        ((C59052c) ((C59052c) f214340b.mo56224b()).mo56372aa(4415)).mo56386p("matchHypotheses");
        Iterator it = list.iterator();
        C58480gp e = C58485gu.m89837e();
        int i = 0;
        while (it.hasNext()) {
            if (mo72831c((String) it.next()).anyMatch(new C77746a(this))) {
                e.mo55395g(Integer.valueOf(i));
            }
            i++;
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public final void mo72830b(C66722az azVar) {
        if (this.f214342c.mo85405j(C90126fx.f250955H)) {
            ((C59052c) ((C59052c) f214340b.mo56224b()).mo56372aa(4419)).mo56386p("initialize");
            this.f214341a = (C58528ij) Stream.CC.concat(Collection.EL.stream(azVar.f181496b).filter(C77802g.f214333a).map(C77804i.f214335a).map(C77805j.f214336a).flatMap(C77806k.f214337a).map(C77807l.f214338a), Collection.EL.stream(azVar.f181496b).filter(C77808m.f214339a).map(C77773b.f214247a).map(C77798c.f214329a).flatMap(C77806k.f214337a).map(C77799d.f214330a)).flatMap(new C77803h(this)).collect(C58370cn.f155947b);
        }
    }

    /* renamed from: c */
    public final Stream mo72831c(String str) {
        return DesugarArrays.stream((T[]) str.split(" ")).filter(new C77800e((int) this.f214342c.mo85399d(C90126fx.f250956I))).map(C77801f.f214332a);
    }
}
