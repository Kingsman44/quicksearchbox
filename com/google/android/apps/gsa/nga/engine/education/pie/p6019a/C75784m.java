package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ag.c;
import com.google.android.apps.gsa.nga.engine.education.pie.C75860c;
import com.google.android.apps.gsa.nga.engine.education.pie.C75908i;
import com.google.android.apps.gsa.nga.engine.education.pie.p6023e.C75867a;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75876ad;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75877ae;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75883d;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75884e;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75900u;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75901v;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80186ag;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80187ah;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80243cj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80268w;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80269x;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.m */
/* compiled from: PG */
public final class C75784m extends C75770ag {

    /* renamed from: a */
    static final Duration f210323a = Duration.ofMinutes(5);

    /* renamed from: h */
    private static final C58974d f210324h = C58974d.m91136j();

    /* renamed from: b */
    public final C81515c f210325b;

    /* renamed from: c */
    public final C75860c f210326c;

    /* renamed from: i */
    private final C75877ae f210327i;

    /* renamed from: j */
    private final C75901v f210328j;

    /* renamed from: k */
    private final C75884e f210329k;

    /* renamed from: l */
    private final C76092h f210330l;

    /* renamed from: m */
    private final C75908i f210331m;

    /* renamed from: n */
    private final C80187ah f210332n;

    /* renamed from: o */
    private final C91142g f210333o;

    /* renamed from: p */
    private final C75867a f210334p;

    /* renamed from: q */
    private final c f210335q;

    /* renamed from: r */
    private Optional f210336r = Optional.empty();

    public C75784m(Bundle bundle, C75877ae aeVar, C75901v vVar, C75884e eVar, C76092h hVar, C75908i iVar, C81515c cVar, C91142g gVar, C75867a aVar, C75860c cVar2, c cVar3) {
        super(bundle, C80267v.MULTI_STEP_TRY_SAYING);
        Optional optional;
        this.f210327i = aeVar;
        this.f210328j = vVar;
        this.f210329k = eVar;
        this.f210330l = hVar;
        this.f210331m = iVar;
        this.f210325b = cVar;
        this.f210333o = gVar;
        try {
            byte[] byteArray = bundle.getByteArray("TRIGGER_CONTEXT");
            if (byteArray != null) {
                optional = Optional.ofNullable((C80187ah) C62942bv.parseFrom((C62942bv) C80187ah.f220007e, byteArray, C62921ba.m95368a()));
                this.f210332n = (C80187ah) optional.orElse(C80187ah.f220007e);
                this.f210334p = aVar;
                this.f210326c = cVar2;
                this.f210335q = cVar3;
            }
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f210324h.mo56225c()).mo56382g(e)).mo56372aa(3347)).mo56386p("Error while parsing Mutli-step data");
        }
        optional = Optional.empty();
        this.f210332n = (C80187ah) optional.orElse(C80187ah.f220007e);
        this.f210334p = aVar;
        this.f210326c = cVar2;
        this.f210335q = cVar3;
    }

    /* renamed from: g */
    public static void m122148g(Bundle bundle, C80187ah ahVar, Optional optional, Optional optional2) {
        C80186ag agVar = (C80186ag) ahVar.toBuilder();
        if (optional.isPresent() || optional2.isPresent()) {
            String str = (String) optional.orElse(BuildConfig.FLAVOR);
            agVar.copyOnWrite();
            C80187ah ahVar2 = (C80187ah) agVar.instance;
            str.getClass();
            ahVar2.f220009a |= 2;
            ahVar2.f220011c = str;
            String str2 = (String) optional2.orElse(BuildConfig.FLAVOR);
            agVar.copyOnWrite();
            C80187ah ahVar3 = (C80187ah) agVar.instance;
            str2.getClass();
            ahVar3.f220009a |= 4;
            ahVar3.f220012d = str2;
        }
        bundle.putByteArray("TRIGGER_CONTEXT", ((C80187ah) agVar.build()).toByteArray());
    }

    /* renamed from: b */
    public final C80244ck mo71873b() {
        return (C80244ck) this.f210336r.orElse(C80244ck.f220137i);
    }

    /* renamed from: c */
    public final C58485gu mo71874c() {
        Optional optional;
        if (this.f210333o.mo85405j(C90037cp.f248511bm)) {
            optional = Optional.empty();
        } else if (((long) this.f210332n.f220010b) >= this.f210333o.mo85399d(C90037cp.f248553cb)) {
            C80243cj cjVar = (C80243cj) C80244ck.f220137i.createBuilder();
            C80246cm cmVar = C80246cm.MULTISTEP_EDUCATION_END;
            cjVar.copyOnWrite();
            C80244ck ckVar = (C80244ck) cjVar.instance;
            ckVar.f220140b = cmVar.f220162n;
            ckVar.f220139a |= 1;
            C80187ah ahVar = this.f210332n;
            cjVar.copyOnWrite();
            C80244ck ckVar2 = (C80244ck) cjVar.instance;
            ahVar.getClass();
            ckVar2.f220145g = ahVar;
            ckVar2.f220139a |= 32;
            optional = Optional.m71637of((C80244ck) cjVar.build());
        } else {
            Locale e = this.f210330l.mo72021b().mo72039e();
            List k = this.f210331m.mo71862k(e);
            if (k.isEmpty()) {
                optional = Optional.empty();
            } else {
                ArrayList arrayList = new ArrayList(k);
                Collections.shuffle(arrayList);
                C80268w wVar = (C80268w) C80269x.f220270b.createBuilder();
                Collection.EL.stream(arrayList).limit(3).forEach(new C75782k(this, wVar, e));
                Optional d = this.f210335q.d();
                C80243cj cjVar2 = (C80243cj) C80244ck.f220137i.createBuilder();
                C80246cm cmVar2 = C80246cm.MULTISTEP_EDUCATION;
                cjVar2.copyOnWrite();
                C80244ck ckVar3 = (C80244ck) cjVar2.instance;
                ckVar3.f220140b = cmVar2.f220162n;
                ckVar3.f220139a |= 1;
                C80269x xVar = (C80269x) wVar.build();
                cjVar2.copyOnWrite();
                C80244ck ckVar4 = (C80244ck) cjVar2.instance;
                xVar.getClass();
                ckVar4.f220144f = xVar;
                ckVar4.f220139a |= 16;
                C80187ah ahVar2 = this.f210332n;
                cjVar2.copyOnWrite();
                C80244ck ckVar5 = (C80244ck) cjVar2.instance;
                ahVar2.getClass();
                ckVar5.f220145g = ahVar2;
                ckVar5.f220139a |= 32;
                if (d.isPresent()) {
                    String str = (String) d.get();
                    cjVar2.copyOnWrite();
                    C80244ck ckVar6 = (C80244ck) cjVar2.instance;
                    str.getClass();
                    ckVar6.f220139a |= 64;
                    ckVar6.f220146h = str;
                }
                optional = Optional.m71637of((C80244ck) cjVar2.build());
            }
        }
        this.f210336r = optional;
        C75877ae aeVar = this.f210327i;
        Duration duration = f210323a;
        C75876ad a = aeVar.mo71941a(this, duration, true);
        C75876ad a2 = this.f210327i.mo71941a(this, duration, false);
        C75901v vVar = this.f210328j;
        C75781j.f210318a.getClass();
        C75050a aVar = (C75050a) vVar.f210611a.mo17428b();
        aVar.getClass();
        C75158f fVar = (C75158f) vVar.f210612b.mo17428b();
        fVar.getClass();
        C75900u uVar = new C75900u(this, aVar, fVar);
        C75884e eVar = this.f210329k;
        Duration ofMillis = Duration.ofMillis(this.f210333o.mo85399d(C90037cp.f248509bk));
        ofMillis.getClass();
        C22871g gVar = (C22871g) eVar.f210542a.mo17428b();
        gVar.getClass();
        return C58485gu.m89849q(a, a2, uVar, new C75883d(this, ofMillis, gVar));
    }

    /* renamed from: d */
    public final int mo71888d() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo71875f() {
        this.f210334p.mo71931c(mo71873b(), this.f210333o.mo85405j(C90037cp.f248511bm));
        this.f210326c.mo71918a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo71876h() {
        this.f210334p.mo71935g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo71887u() {
        if (this.f210333o.mo85405j(C90037cp.f248510bl) && !this.f210333o.mo85405j(C90037cp.f248511bm)) {
            this.f210336r.ifPresent(new C75783l(this));
        }
        this.f210334p.mo71932d(this.f210332n);
    }
}
