package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59541dk;
import com.google.common.p4552o.p4553a.C59542dl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bs */
/* compiled from: PG */
public final class C113071bs implements C113050ay {

    /* renamed from: a */
    public static final C59071e f313286a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.p.bs");

    /* renamed from: b */
    public static final C121537f f313287b = C121537f.m200840b("Tapas/TapasUserProfileBuilder", C121511c.f337208a);

    /* renamed from: c */
    public static final C65753ak f313288c = C65753ak.TAPAS_USER_PROFILE;

    /* renamed from: d */
    public final C86124t f313289d;

    /* renamed from: e */
    public final C22871g f313290e;

    /* renamed from: f */
    public final C21370a f313291f;

    /* renamed from: g */
    public final C111248k f313292g;

    /* renamed from: h */
    public final C113425ff f313293h;

    /* renamed from: i */
    public final C86054o f313294i;

    /* renamed from: j */
    public final u f313295j;

    /* renamed from: k */
    public final C112037ao f313296k;

    /* renamed from: l */
    public Integer f313297l = null;

    /* renamed from: m */
    public Integer f313298m = null;

    /* renamed from: n */
    private final C42876ab f313299n;

    /* renamed from: o */
    private C60870cx f313300o = C60856cj.m92900i(Optional.empty());

    /* renamed from: p */
    private final ArrayList f313301p = new ArrayList();

    /* renamed from: q */
    private SettableFuture f313302q = new SettableFuture();

    public C113071bs(C86124t tVar, C42876ab abVar, C22871g gVar, C21370a aVar, C111248k kVar, C113425ff ffVar, C86054o oVar, u uVar, C112037ao aoVar) {
        this.f313289d = tVar;
        this.f313299n = abVar;
        this.f313290e = gVar;
        this.f313291f = aVar;
        this.f313292g = kVar;
        this.f313293h = ffVar;
        this.f313294i = oVar;
        this.f313295j = uVar;
        this.f313296k = aoVar;
        if (tVar.mo79746e(C90063do.f249600gb)) {
            new C90873ag(abVar.mo46042d(), gVar, "initialize profile size", new C113065bm(this, kVar)).mo85223a(C113066bn.f313280a);
        }
    }

    /* renamed from: a */
    public final synchronized C59542dl mo99824a() {
        C59541dk dkVar;
        dkVar = (C59541dk) C59542dl.f157997d.createBuilder();
        Integer num = this.f313297l;
        if (num != null) {
            int intValue = num.intValue();
            dkVar.copyOnWrite();
            C59542dl dlVar = (C59542dl) dkVar.instance;
            dlVar.f157999a |= 1;
            dlVar.f158000b = intValue;
        }
        Integer num2 = this.f313298m;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            dkVar.copyOnWrite();
            C59542dl dlVar2 = (C59542dl) dkVar.instance;
            dlVar2.f157999a |= 2;
            dlVar2.f158001c = intValue2;
        }
        return (C59542dl) dkVar.build();
    }

    /* renamed from: b */
    public final synchronized void mo99825b(C113415ez ezVar, boolean z) {
        if (C113090ck.m187089b(this.f313289d, this.f313293h)) {
            if (!mo99830g()) {
                C59104x d = f313286a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TapasUserProfileBuilder");
                ((C59052c) ((C59052c) d).mo56372aa(27931)).mo56386p("Trying to add a suggestion to an empty log");
                return;
            }
            this.f313301p.add(this.f313290e.mo28201a("addSuggestions", new C113054bb(this, ezVar, z)));
        }
    }

    /* renamed from: c */
    public final synchronized void mo99826c() {
        this.f313302q.cancel(false);
        this.f313302q = new SettableFuture();
    }

    /* renamed from: d */
    public final void mo99827d() {
        new C90873ag(this.f313299n.mo46039a(C113051az.f313248a, C60826bg.f164896a), this.f313290e, "purge TapasUserProfile", new C113062bj(this)).mo85223a(C113063bk.f313274a);
    }

    /* renamed from: e */
    public final synchronized void mo99828e(long j) {
        this.f313302q.mo57356n(Long.valueOf(j));
    }

    /* renamed from: f */
    public final synchronized void mo99829f() {
        if (this.f313289d.mo79746e(C90063do.f249600gb)) {
            C60870cx b = this.f313293h.mo100136b();
            C60870cx e = C90877ak.m148471e(this.f313302q, this.f313289d.mo79743a(C90063do.f249589gQ), TimeUnit.MILLISECONDS, this.f313290e);
            C60870cx e2 = C60856cj.m92896e(this.f313301p);
            C60870cx cxVar = this.f313300o;
            this.f313300o = C60856cj.m92900i(Optional.empty());
            this.f313301p.clear();
            new C90873ag(this.f313290e.mo28209i(C60856cj.m92895d(e2, cxVar, b, e).mo57334a(new C113055bc(this, b, cxVar, e2), C60826bg.f164896a), "write user profile", new C113056bd(this, e)), this.f313290e, "writeUserProfile result", new C113057be(this)).mo85223a(new C113058bf(this));
        }
    }

    /* renamed from: g */
    public final synchronized boolean mo99830g() {
        if (!this.f313300o.isDone()) {
            return true;
        }
        return ((Optional) C90877ak.m148475i(this.f313300o, Optional.empty())).isPresent();
    }

    /* renamed from: h */
    public final synchronized void mo99831h(int i, String str) {
        if (C113090ck.m187089b(this.f313289d, this.f313293h)) {
            this.f313301p.clear();
            this.f313300o = this.f313290e.mo28201a("addEvent", new C113064bl(this, str, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C58485gu mo99838i(List list) {
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).filter(new C113059bg(this, this.f313291f.mo26870b())).collect(C58370cn.f155946a);
        long a = this.f313289d.mo79743a(C90063do.f249622gx);
        return ((long) guVar.size()) > a ? (C58485gu) Collection.EL.stream(guVar).skip(((long) guVar.size()) - a).collect(C58370cn.f155946a) : guVar;
    }

    /* renamed from: j */
    public final void mo99839j(Optional optional) {
        C90875ai.m148465b(C113068bp.f313283a, this.f313299n.mo46039a(new C113067bo(this, optional), C60826bg.f164896a), this.f313290e, "Writing TapasUserProfile to PDS").mo85223a(C113069bq.f313284a);
    }
}
