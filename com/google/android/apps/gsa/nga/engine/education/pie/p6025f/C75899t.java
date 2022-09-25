package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.m.b;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.education.C75688am;
import com.google.android.apps.gsa.nga.engine.education.pie.C75907h;
import com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75855v;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6166a.C78238b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80243cj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80587u;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80721cw;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59485bi;
import com.google.common.p4552o.p4553a.C59486bj;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.t */
/* compiled from: PG */
public abstract class C75899t extends C75891l implements C75907h, C75155d {

    /* renamed from: a */
    private static final C58974d f210600a = C58974d.m91136j();

    /* renamed from: b */
    public boolean f210601b = false;

    /* renamed from: c */
    private final C75688am f210602c;

    /* renamed from: d */
    private final C75050a f210603d;

    /* renamed from: e */
    private final C75158f f210604e;

    /* renamed from: f */
    private final C76092h f210605f;

    /* renamed from: g */
    private final C91142g f210606g;

    /* renamed from: h */
    private int f210607h = 1;

    /* renamed from: i */
    private final C75855v f210608i;

    protected C75899t(C75892m mVar, C75688am amVar, C75855v vVar, C75050a aVar, C75158f fVar, C76092h hVar, C91142g gVar) {
        super(mVar);
        this.f210602c = amVar;
        this.f210608i = vVar;
        this.f210603d = aVar;
        this.f210604e = fVar;
        this.f210605f = hVar;
        this.f210606g = gVar;
    }

    /* renamed from: a */
    public final synchronized void mo71137a(C75077bo boVar, C75077bo boVar2) {
        C80265t tVar;
        if (boVar2.mo71469o()) {
            C83016y yVar = C83016y.UNKNOWN;
            bl blVar = bl.a;
            int i = this.f210607h;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                ((C58970a) ((C58970a) f210600a.mo56226d()).mo56372aa(3418)).mo56386p("Leaving execution state without ExecutionInput");
            } else if (i2 == 1) {
                mo71951k();
            } else if (i2 == 2) {
                mo71950j(C80265t.EXECUTION_MISMATCH);
            }
        }
        C83016y yVar2 = C83016y.UNKNOWN;
        bl blVar2 = bl.a;
        if (boVar.mo71458b().ordinal() == 2) {
            C83016y d = boVar.mo71460d();
            d.name();
            int ordinal = d.ordinal();
            if (ordinal == 32) {
                tVar = C80265t.LISTENING_CANCELLATION;
            } else if (ordinal == 42) {
                tVar = C80265t.LISTENING_IMPLICIT_DISMISSAL;
            } else if (ordinal == 52 || ordinal == 86 || ordinal == 89) {
                tVar = C80265t.LISTENING_TIMEOUT;
            } else {
                tVar = C80265t.STATE_CHANGE_IDLE;
            }
            mo71950j(tVar);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final synchronized void mo71955c(C76401e eVar) {
        double a = b.a(mo71952l(), eVar.mo72187e().mo71163q(), this.f210605f.mo72021b().mo72039e());
        boolean m = mo71953m(eVar);
        if (a != 1.0d) {
            if (!m) {
                this.f210607h = 3;
                return;
            }
        }
        this.f210607h = 2;
    }

    /* renamed from: d */
    public final C80244ck mo71937d() {
        C80243cj cjVar = (C80243cj) C80244ck.f220137i.createBuilder();
        if (this.f210601b) {
            C80246cm cmVar = C80246cm.LIGHTWEIGHT_INVOCATION;
            cjVar.copyOnWrite();
            C80244ck ckVar = (C80244ck) cjVar.instance;
            ckVar.f220140b = cmVar.f220162n;
            ckVar.f220139a |= 1;
            cjVar.copyOnWrite();
            C80244ck ckVar2 = (C80244ck) cjVar.instance;
            ckVar2.f220142d = 4;
            ckVar2.f220139a = 4 | ckVar2.f220139a;
            String l = mo71952l();
            cjVar.copyOnWrite();
            C80244ck ckVar3 = (C80244ck) cjVar.instance;
            l.getClass();
            ckVar3.f220139a |= 2;
            ckVar3.f220141c = l;
        } else if (!this.f210606g.mo85405j(C90126fx.f251636mZ)) {
            C80246cm cmVar2 = C80246cm.LIGHTWEIGHT_TRY_SAYING;
            cjVar.copyOnWrite();
            C80244ck ckVar4 = (C80244ck) cjVar.instance;
            ckVar4.f220140b = cmVar2.f220162n;
            ckVar4.f220139a |= 1;
            String l2 = mo71952l();
            cjVar.copyOnWrite();
            C80244ck ckVar5 = (C80244ck) cjVar.instance;
            l2.getClass();
            ckVar5.f220139a |= 2;
            ckVar5.f220141c = l2;
        }
        return (C80244ck) cjVar.build();
    }

    /* renamed from: e */
    public final void mo71938e() {
        super.mo71938e();
        this.f210608i.f210485a.mo75093d(this);
        this.f210604e.mo71507c(this);
    }

    /* renamed from: f */
    public final int mo71939f() {
        C83016y yVar = C83016y.UNKNOWN;
        bl blVar = bl.a;
        int ordinal = this.f210603d.mo71417a().mo71458b().ordinal();
        int i = 2;
        if (!(ordinal == 2 || ordinal == 3)) {
            i = 1;
            if (this.f210606g.mo85405j(C90126fx.f251636mZ)) {
                C75688am amVar = this.f210602c;
                Locale e = this.f210605f.mo72021b().mo72039e();
                String l = mo71952l();
                C80721cw cwVar = C80721cw.MOLECULE;
                C80587u uVar = C80587u.CLICK_WHOLE_PLATE;
                Optional empty = Optional.empty();
                Optional empty2 = Optional.empty();
                e eVar = e.a;
                C58976aa aaVar = C58975e.f156826a;
                ((C78238b) amVar.f210112o.mo27525b()).mo73160b(cwVar, uVar, empty, ((C81515c) amVar.f210111n.mo27525b()).mo75121a(e).getString(R.string.nga_assist_query_suggestion_try_saying, new Object[0]), ((C81515c) amVar.f210111n.mo27525b()).mo75121a(e).getString(R.string.nga_assist_display_query_quotation, new Object[]{l}), l, empty2, eVar);
            }
            this.f210608i.f210485a.mo75092c(this);
            this.f210604e.mo71506b(this);
        }
        return i;
    }

    /* renamed from: g */
    public final C59486bj mo71944g() {
        C59485bi biVar = (C59485bi) C59486bj.f157824d.createBuilder();
        if (this.f210606g.mo85405j(C90126fx.f251348hC)) {
            String l = mo71952l();
            biVar.copyOnWrite();
            C59486bj bjVar = (C59486bj) biVar.instance;
            l.getClass();
            bjVar.f157826a |= 1;
            bjVar.f157827b = l;
        }
        if (this.f210601b) {
            biVar.copyOnWrite();
            C59486bj bjVar2 = (C59486bj) biVar.instance;
            bjVar2.f157828c = 4;
            bjVar2.f157826a |= 2;
        }
        return (C59486bj) biVar.build();
    }

    /* renamed from: l */
    public abstract String mo71952l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo71953m(C76401e eVar);
}
