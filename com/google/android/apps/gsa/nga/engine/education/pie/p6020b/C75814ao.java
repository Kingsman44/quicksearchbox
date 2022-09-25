package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.education.pie.C75871f;
import com.google.android.apps.gsa.nga.engine.education.pie.C75906g;
import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75786o;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75788q;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80240cg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80251f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81379m;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82409ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82410ed;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82411ee;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82412ef;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.ags;
import com.google.common.p4552o.agt;
import com.google.common.p4552o.p4553a.C59478bb;
import com.google.common.p4552o.p4553a.C59479bc;
import com.google.common.p4552o.p4553a.C59480bd;
import com.google.common.p4552o.p4553a.C59481be;
import com.google.common.p4552o.p4553a.C59482bf;
import com.google.common.p4552o.p4553a.C59483bg;
import com.google.common.p4552o.p4553a.C59484bh;
import com.google.common.p4552o.p4553a.C59487bk;
import com.google.common.p4552o.p4553a.C59488bl;
import com.google.common.p4552o.p4553a.C59489bm;
import com.google.common.p4552o.p4553a.C59490bn;
import com.google.common.p4552o.p4553a.C59491bo;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.ao */
/* compiled from: PG */
public final class C75814ao implements C75786o, C75911l {

    /* renamed from: a */
    private static final C58974d f210397a = C58974d.m91136j();

    /* renamed from: b */
    private static final Duration f210398b = Duration.ofSeconds(30);

    /* renamed from: c */
    private final C75906g f210399c;

    /* renamed from: d */
    private final C79863k f210400d;

    /* renamed from: e */
    private final C91142g f210401e;

    /* renamed from: f */
    private final C21370a f210402f;

    /* renamed from: g */
    private final C83305i f210403g;

    /* renamed from: h */
    private final C81379m f210404h;

    /* renamed from: i */
    private final C75871f f210405i;

    /* renamed from: j */
    private final ArrayList f210406j = new ArrayList();

    /* renamed from: k */
    private String f210407k = BuildConfig.FLAVOR;

    /* renamed from: l */
    private Instant f210408l = Instant.EPOCH;

    /* renamed from: m */
    private boolean f210409m = false;

    /* renamed from: n */
    private final AtomicReference f210410n = new AtomicReference(C59488bl.f157829c);

    public C75814ao(C75906g gVar, C79863k kVar, C91142g gVar2, C21370a aVar, C83305i iVar, C81379m mVar, C75871f fVar) {
        this.f210399c = gVar;
        this.f210400d = kVar;
        this.f210401e = gVar2;
        this.f210402f = aVar;
        this.f210403g = iVar;
        this.f210404h = mVar;
        this.f210405i = fVar;
    }

    /* renamed from: c */
    private final synchronized C59482bf m122194c(C75788q qVar) {
        C59482bf bfVar;
        bfVar = (C59482bf) C59491bo.f157839m.createBuilder();
        bfVar.copyOnWrite();
        C59491bo boVar = (C59491bo) bfVar.instance;
        boVar.f157846f = ((C80201av) this.f210399c.mo71922a().mo76657c()).f220046m;
        boVar.f157841a |= 4;
        C80267v j = qVar.mo71878j();
        bfVar.copyOnWrite();
        C59491bo boVar2 = (C59491bo) bfVar.instance;
        boVar2.f157844d = j.f220269g;
        boVar2.f157841a |= 1;
        C80248co a = qVar.mo71877i().mo71893a();
        bfVar.copyOnWrite();
        C59491bo boVar3 = (C59491bo) bfVar.instance;
        boVar3.f157845e = a.f220171g;
        boVar3.f157841a |= 2;
        String k = qVar.mo71879k();
        bfVar.copyOnWrite();
        C59491bo boVar4 = (C59491bo) bfVar.instance;
        k.getClass();
        boVar4.f157841a |= 128;
        boVar4.f157849i = k;
        int e = qVar.mo71877i().mo71897e();
        bfVar.copyOnWrite();
        C59491bo boVar5 = (C59491bo) bfVar.instance;
        int i = e - 1;
        if (e != 0) {
            boVar5.f157847g = i;
            boVar5.f157841a |= 32;
            C59489bm bmVar = (C59489bm) C59490bn.f157833e.createBuilder();
            if (this.f210401e.mo85405j(C90126fx.f251393hv)) {
                Optional c = qVar.mo71877i().mo71895c();
                Objects.requireNonNull(bmVar);
                c.ifPresent(new C75812am(bmVar));
                Optional b = qVar.mo71877i().mo71894b();
                Objects.requireNonNull(bmVar);
                b.ifPresent(new C75813an(bmVar));
            }
            String d = qVar.mo71877i().mo71896d();
            bmVar.copyOnWrite();
            C59490bn bnVar = (C59490bn) bmVar.instance;
            d.getClass();
            bnVar.f157835a |= 4;
            bnVar.f157838d = d;
            C59490bn bnVar2 = (C59490bn) bmVar.build();
            bfVar.copyOnWrite();
            C59491bo boVar6 = (C59491bo) bfVar.instance;
            bnVar2.getClass();
            boVar6.f157848h = bnVar2;
            boVar6.f157841a |= 64;
            ArrayList arrayList = this.f210406j;
            bfVar.copyOnWrite();
            C59491bo boVar7 = (C59491bo) bfVar.instance;
            C62971cq cqVar = boVar7.f157850j;
            if (!cqVar.mo58948c()) {
                boVar7.f157850j = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) boVar7.f157850j);
            C59488bl blVar = (C59488bl) this.f210410n.get();
            bfVar.copyOnWrite();
            C59491bo boVar8 = (C59491bo) bfVar.instance;
            blVar.getClass();
            boVar8.f157851k = blVar;
            boVar8.f157841a |= 256;
        } else {
            throw null;
        }
        return bfVar;
    }

    /* renamed from: h */
    private final void m122196h(C89849ae aeVar, C59478bb bbVar, boolean z) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59479bc bcVar = (C59479bc) bbVar.build();
        bcVar.getClass();
        cbVar.f160071aI = bcVar;
        cbVar.f160123d |= 2;
        fVar.f246203c = (C59687cb) ajVar.build();
        m122195g(fVar, z);
    }

    /* renamed from: a */
    public final synchronized agt mo71912a() {
        ags ags;
        ags = (ags) agt.f158667c.createBuilder();
        if (!this.f210407k.isEmpty()) {
            Instant ofEpochMilli = Instant.ofEpochMilli(this.f210402f.mo26870b());
            if (this.f210409m || this.f210408l.plus(f210398b).isAfter(ofEpochMilli)) {
                String str = this.f210407k;
                ags.copyOnWrite();
                agt agt = (agt) ags.instance;
                str.getClass();
                agt.f158669a |= 1;
                agt.f158670b = str;
            }
        }
        return (agt) ags.build();
    }

    /* renamed from: b */
    public final void mo71913b(C81381o oVar, boolean z) {
        ((C58970a) ((C58970a) ((C58970a) f210397a.mo56224b()).mo56382g(oVar)).mo56372aa(3377)).mo56389s("Trigger failure, user action: %s", Boolean.valueOf(z));
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.PIE_FLOW_START;
        m122195g(fVar, z);
        C89849ae aeVar = C89849ae.PIE_FLOW_DONE;
        C59478bb bbVar = (C59478bb) C59479bc.f157808c.createBuilder();
        C59480bd bdVar = (C59480bd) C59481be.f157812f.createBuilder();
        C80267v b = oVar.mo75047b();
        bdVar.copyOnWrite();
        C59481be beVar = (C59481be) bdVar.instance;
        beVar.f157815b = b.f220269g;
        beVar.f157814a |= 1;
        bdVar.copyOnWrite();
        C59481be beVar2 = (C59481be) bdVar.instance;
        beVar2.f157816c = ((C80201av) this.f210399c.mo71922a().mo76657c()).f220046m;
        beVar2.f157814a |= 4;
        C80265t a = oVar.mo75046a();
        bdVar.copyOnWrite();
        C59481be beVar3 = (C59481be) bdVar.instance;
        beVar3.f157817d = a.f220260Y;
        beVar3.f157814a |= 8;
        int c = oVar.mo75048c();
        bdVar.copyOnWrite();
        C59481be beVar4 = (C59481be) bdVar.instance;
        int i = c - 1;
        if (c != 0) {
            beVar4.f157818e = i;
            beVar4.f157814a |= 16;
            bbVar.copyOnWrite();
            C59479bc bcVar = (C59479bc) bbVar.instance;
            C59481be beVar5 = (C59481be) bdVar.build();
            beVar5.getClass();
            bcVar.f157811b = beVar5;
            bcVar.f157810a = 2;
            m122196h(aeVar, bbVar, z);
            C83305i iVar = this.f210403g;
            String name = oVar.mo75046a().name();
            if (name != null) {
                String name2 = oVar.mo75047b().name();
                if (name2 != null) {
                    int c2 = oVar.mo75048c();
                    String a2 = C80240cg.m128100a(c2);
                    if (c2 != 0) {
                        iVar.mo75579d(new C82412ef("NGA_PIE_TRIGGER_FAILURE", name, a2, name2));
                        C83305i iVar2 = this.f210403g;
                        String name3 = ((C80201av) this.f210399c.mo71922a().mo76657c()).name();
                        if (name3 != null) {
                            iVar2.mo75579d(new C82411ee("NGA_PIE_TRIGGER_FAILURE_ELIGIBILITY", name3));
                            return;
                        }
                        throw new NullPointerException("Null eligibility");
                    }
                    throw null;
                }
                throw new NullPointerException("Null flowId");
            }
            throw new NullPointerException("Null failureCause");
        }
        throw null;
    }

    /* renamed from: d */
    public final synchronized void mo71889d(C75788q qVar, int i, C80265t tVar) {
        qVar.mo71878j().name();
        tVar.name();
        this.f210408l = Instant.ofEpochMilli(this.f210402f.mo26870b());
        this.f210409m = false;
        C89849ae aeVar = C89849ae.PIE_FLOW_DONE;
        C59478bb bbVar = (C59478bb) C59479bc.f157808c.createBuilder();
        C59482bf c = m122194c(qVar);
        C59483bg bgVar = (C59483bg) C59484bh.f157819d.createBuilder();
        bgVar.copyOnWrite();
        C59484bh bhVar = (C59484bh) bgVar.instance;
        bhVar.f157821a |= 2;
        bhVar.f157823c = i;
        bgVar.copyOnWrite();
        C59484bh bhVar2 = (C59484bh) bgVar.instance;
        bhVar2.f157822b = tVar.f220260Y;
        bhVar2.f157821a |= 1;
        c.copyOnWrite();
        C59491bo boVar = (C59491bo) c.instance;
        C59484bh bhVar3 = (C59484bh) bgVar.build();
        C59491bo boVar2 = C59491bo.f157839m;
        bhVar3.getClass();
        boVar.f157843c = bhVar3;
        boVar.f157842b = 4;
        bbVar.copyOnWrite();
        C59479bc bcVar = (C59479bc) bbVar.instance;
        C59491bo boVar3 = (C59491bo) c.build();
        boVar3.getClass();
        bcVar.f157811b = boVar3;
        bcVar.f157810a = 1;
        m122196h(aeVar, bbVar, true);
        C83305i iVar = this.f210403g;
        String name = tVar.name();
        if (name != null) {
            String name2 = qVar.mo71878j().name();
            if (name2 != null) {
                int e = qVar.mo71877i().mo71897e();
                String a = C80240cg.m128100a(e);
                if (e != 0) {
                    iVar.mo75579d(new C82409ec("NGA_PIE_FLOW_FAILURE", name, a, name2, i));
                } else {
                    throw null;
                }
            } else {
                throw new NullPointerException("Null flowId");
            }
        } else {
            throw new NullPointerException("Null failureCause");
        }
    }

    /* renamed from: e */
    public final synchronized void mo71890e(C75788q qVar, int i, C75891l lVar) {
        qVar.mo71878j().name();
        if (i == 0) {
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.PIE_FLOW_START;
            m122195g(fVar, true);
            this.f210406j.clear();
            this.f210409m = true;
            this.f210407k = qVar.mo71879k();
            AtomicReference atomicReference = this.f210410n;
            C59487bk bkVar = (C59487bk) C59488bl.f157829c.createBuilder();
            C58528ij<C80251f> a = this.f210405i.mo71920a();
            bkVar.copyOnWrite();
            C59488bl blVar = (C59488bl) bkVar.instance;
            C62961ch chVar = blVar.f157831a;
            if (!chVar.mo58948c()) {
                blVar.f157831a = C62942bv.mutableCopy(chVar);
            }
            for (C80251f fVar2 : a) {
                blVar.f157831a.mo58916g(fVar2.f220182g);
            }
            C58485gu<C80251f> b = this.f210404h.mo75019b();
            bkVar.copyOnWrite();
            C59488bl blVar2 = (C59488bl) bkVar.instance;
            C62961ch chVar2 = blVar2.f157832b;
            if (!chVar2.mo58948c()) {
                blVar2.f157832b = C62942bv.mutableCopy(chVar2);
            }
            for (C80251f fVar3 : b) {
                blVar2.f157832b.mo58916g(fVar3.f220182g);
            }
            atomicReference.set((C59488bl) bkVar.build());
        }
        this.f210406j.add(lVar.mo71944g());
    }

    /* renamed from: f */
    public final synchronized void mo71891f(C75788q qVar) {
        qVar.mo71878j().name();
        this.f210408l = Instant.ofEpochMilli(this.f210402f.mo26870b());
        this.f210409m = false;
        C89849ae aeVar = C89849ae.PIE_FLOW_DONE;
        C59478bb bbVar = (C59478bb) C59479bc.f157808c.createBuilder();
        C59482bf c = m122194c(qVar);
        c.copyOnWrite();
        C59491bo boVar = (C59491bo) c.instance;
        C59491bo boVar2 = C59491bo.f157839m;
        boVar.f157842b = 3;
        boVar.f157843c = true;
        bbVar.copyOnWrite();
        C59479bc bcVar = (C59479bc) bbVar.instance;
        C59491bo boVar3 = (C59491bo) c.build();
        boVar3.getClass();
        bcVar.f157811b = boVar3;
        bcVar.f157810a = 1;
        m122196h(aeVar, bbVar, true);
        C83305i iVar = this.f210403g;
        String name = qVar.mo71878j().name();
        if (name != null) {
            int e = qVar.mo71877i().mo71897e();
            String a = C80240cg.m128100a(e);
            if (e != 0) {
                iVar.mo75579d(new C82410ed("NGA_PIE_FLOW_SUCCESS", a, name));
            } else {
                throw null;
            }
        } else {
            throw new NullPointerException("Null flowId");
        }
    }

    /* renamed from: g */
    private final void m122195g(C89856f fVar, boolean z) {
        if (!z) {
            if (!this.f210401e.mo85405j(C90126fx.f251383hl)) {
                ((C58970a) ((C58970a) f210397a.mo56226d()).mo56372aa(3379)).mo56386p("Not logging Pie event due to background action logging being disabled");
                return;
            }
        } else if (!this.f210401e.mo85405j(C90126fx.f251354hI)) {
            ((C58970a) ((C58970a) f210397a.mo56226d()).mo56372aa(3378)).mo56386p("Not logging Pie event due to user action logging being disabled");
            return;
        }
        this.f210400d.mo74236a(fVar.mo83699a());
    }
}
