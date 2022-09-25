package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.C75866e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.engine.education.pie.C75913n;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75786o;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75788q;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80240cg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80243cj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80256k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80257l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.ba */
/* compiled from: PG */
public final class C75827ba implements C75864b, C75909j, C75786o {

    /* renamed from: b */
    private static final C58974d f210433b = C58974d.m91136j();

    /* renamed from: c */
    private static final C58495hd f210434c;

    /* renamed from: a */
    public Optional f210435a = Optional.empty();

    /* renamed from: d */
    private final C68214a f210436d;

    /* renamed from: e */
    private final C75910k f210437e;

    /* renamed from: f */
    private final C75911l f210438f;

    /* renamed from: g */
    private int f210439g = 0;

    static {
        C80265t tVar = C80265t.SWIPE_INVOCATION_DISMISSED;
        C80243cj cjVar = (C80243cj) C80244ck.f220137i.createBuilder();
        C80246cm cmVar = C80246cm.FAILURE;
        cjVar.copyOnWrite();
        C80244ck ckVar = (C80244ck) cjVar.instance;
        ckVar.f220140b = cmVar.f220162n;
        ckVar.f220139a |= 1;
        C80265t tVar2 = C80265t.LIGHTWEIGHT_SWIPE_INVOCATION_DISMISSED;
        C80243cj cjVar2 = (C80243cj) C80244ck.f220137i.createBuilder();
        C80246cm cmVar2 = C80246cm.LIGHTWEIGHT_SWIPE_FAILURE;
        cjVar2.copyOnWrite();
        C80244ck ckVar2 = (C80244ck) cjVar2.instance;
        ckVar2.f220140b = cmVar2.f220162n;
        ckVar2.f220139a |= 1;
        C80265t tVar3 = C80265t.LIGHTWEIGHT_LONG_PRESS_HOME_INVOCATION_DISMISSED;
        C80243cj cjVar3 = (C80243cj) C80244ck.f220137i.createBuilder();
        C80246cm cmVar3 = C80246cm.LIGHTWEIGHT_GENERIC_FAILURE;
        cjVar3.copyOnWrite();
        C80244ck ckVar3 = (C80244ck) cjVar3.instance;
        ckVar3.f220140b = cmVar3.f220162n;
        ckVar3.f220139a |= 1;
        f210434c = C58495hd.m89902p(tVar, (C80244ck) cjVar.build(), tVar2, (C80244ck) cjVar2.build(), tVar3, (C80244ck) cjVar3.build());
    }

    public C75827ba(C68214a aVar, C75910k kVar, C75911l lVar) {
        this.f210436d = aVar;
        this.f210437e = kVar;
        this.f210438f = lVar;
    }

    /* renamed from: g */
    private final void m122222g(C80244ck ckVar) {
        C80256k kVar = (C80256k) C80257l.f220192c.createBuilder();
        kVar.copyOnWrite();
        C80257l lVar = (C80257l) kVar.instance;
        ckVar.getClass();
        lVar.f220195b = ckVar;
        lVar.f220194a = 1;
        ((C75866e) this.f210436d.mo27525b()).mo71903a((C80257l) kVar.build());
    }

    /* renamed from: h */
    private final void m122223h(int i) {
        try {
            ((C75866e) this.f210436d.mo27525b()).mo71904b((Bundle) this.f210435a.get(), C75913n.m122414f(i).mo71870a());
        } catch (C81381o e) {
            m122222g(C80244ck.f220137i);
            this.f210438f.mo71913b(e, true);
        }
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        int b;
        if (axVar.f220049a != 2) {
            return;
        }
        if (!this.f210435a.isEmpty()) {
            int i = 1;
            if (axVar.f220049a == 2 && (b = C80240cg.m128101b(((Integer) axVar.f220050b).intValue())) != 0) {
                i = b;
            }
            m122223h(i);
            return;
        }
        ((C58970a) ((C58970a) f210433b.mo56225c()).mo56372aa(3390)).mo56386p("Last flow bundle not set, cannot retry");
        m122222g(C80244ck.f220137i);
    }

    /* renamed from: d */
    public final void mo71889d(C75788q qVar, int i, C80265t tVar) {
        if (qVar.mo71888d() != 3) {
            this.f210439g = 0;
            return;
        }
        C58495hd hdVar = f210434c;
        if (!hdVar.containsKey(tVar)) {
            m122222g(C80244ck.f220137i);
            this.f210439g = 0;
            return;
        }
        int i2 = this.f210439g;
        if (i2 >= 2) {
            this.f210439g = 0;
            C80244ck ckVar = (C80244ck) hdVar.get(tVar);
            ckVar.getClass();
            m122222g(ckVar);
            return;
        }
        this.f210439g = i2 + 1;
        m122223h(7);
    }

    /* renamed from: e */
    public final void mo71890e(C75788q qVar, int i, C75891l lVar) {
    }

    /* renamed from: f */
    public final void mo71891f(C75788q qVar) {
        this.f210439g = 0;
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210437e.mo71909a(this);
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210437e.mo71911c(this);
    }
}
