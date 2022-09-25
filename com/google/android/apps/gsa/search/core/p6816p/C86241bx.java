package com.google.android.apps.gsa.search.core.p6816p;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.p6792b.C85874e;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7053c.C89878a;
import com.google.android.apps.gsa.shared.logger.p7053c.C89881d;
import com.google.android.apps.gsa.shared.logger.p7053c.C89882e;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7194x.C91167a;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.libraries.gsa.util.C23341f;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60932t;
import com.google.common.util.concurrent.SettableFuture;
import com.google.knowledge.p4682d.C61995f;
import com.google.p395al.p417d.p418a.C8525ae;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.p395al.p417d.p418a.C8588o;
import com.google.p4017at.p4060h.p4068b.p4069a.C54204u;
import com.google.p4449cd.p4456g.p4457a.C57978d;
import com.google.p4449cd.p4456g.p4458b.C57995n;
import com.google.p4500cm.p4514b.C58169c;
import com.google.p4500cm.p4514b.C58170d;
import com.google.p4500cm.p4518d.p4519a.C58178a;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.search.core.p.bx */
/* compiled from: PG */
public class C86241bx implements C86246cb {

    /* renamed from: a */
    private static final C59071e f233074a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.bx");

    /* renamed from: b */
    private static final byte[] f233075b = new byte[0];

    /* renamed from: c */
    private static final C91167a f233076c = new C91167a(new C21375e());

    /* renamed from: d */
    private static final Object f233077d = new Object();

    /* renamed from: A */
    private final C86197ag f233078A;

    /* renamed from: B */
    private final C86197ag f233079B;

    /* renamed from: C */
    private final C86197ag f233080C;

    /* renamed from: D */
    private final C86197ag f233081D;

    /* renamed from: E */
    private final C86197ag f233082E;

    /* renamed from: F */
    private final C86197ag f233083F;

    /* renamed from: G */
    private final C86197ag f233084G;

    /* renamed from: H */
    private final C86197ag f233085H;

    /* renamed from: I */
    private final C86197ag f233086I;

    /* renamed from: J */
    private final C86197ag f233087J;

    /* renamed from: K */
    private final C86197ag f233088K;

    /* renamed from: L */
    private final C86197ag f233089L;

    /* renamed from: M */
    private final C86197ag f233090M;

    /* renamed from: N */
    private final C86197ag f233091N;

    /* renamed from: O */
    private final C86197ag f233092O;

    /* renamed from: P */
    private final C86197ag f233093P;

    /* renamed from: Q */
    private final C86197ag f233094Q;

    /* renamed from: R */
    private final C86197ag f233095R;

    /* renamed from: S */
    private final C86197ag f233096S;

    /* renamed from: T */
    private final C86197ag f233097T;

    /* renamed from: e */
    private final C86231bn f233098e;

    /* renamed from: f */
    private final C89859i f233099f;

    /* renamed from: g */
    protected final C86196af f233100g;

    /* renamed from: h */
    public final C86197ag f233101h;

    /* renamed from: i */
    public final C86197ag f233102i;

    /* renamed from: j */
    protected C86198ah f233103j;

    /* renamed from: k */
    private final boolean f233104k;

    /* renamed from: l */
    private final C68214a f233105l;

    /* renamed from: m */
    private final long f233106m = f233076c.f254534a.incrementAndGet();

    /* renamed from: n */
    private final AtomicInteger f233107n = new AtomicInteger();

    /* renamed from: o */
    private final C57995n f233108o = new C57995n(Double.valueOf(C59203do.f157270a));

    /* renamed from: p */
    private final AtomicInteger f233109p = new AtomicInteger();

    /* renamed from: q */
    private final C60932t f233110q = new C60932t((byte[]) null);

    /* renamed from: r */
    private final SettableFuture f233111r = new SettableFuture();

    /* renamed from: s */
    private final SettableFuture f233112s = new SettableFuture();

    /* renamed from: t */
    private final SettableFuture f233113t = new SettableFuture();

    /* renamed from: u */
    private final Query f233114u;

    /* renamed from: v */
    private final C57978d f233115v = new C57978d();

    /* renamed from: w */
    private final C57995n f233116w = new C57995n(f233075b);

    /* renamed from: x */
    private volatile long f233117x;

    /* renamed from: y */
    private final SettableFuture f233118y = new SettableFuture();

    /* renamed from: z */
    private volatile C89059o f233119z;

    public C86241bx(long j, long j2, String str, C89859i iVar, C89059o oVar, C68214a aVar) {
        C86196af afVar = new C86196af();
        this.f233100g = afVar;
        this.f233078A = afVar.mo79830a("original query", false);
        this.f233079B = afVar.mo79830a("updated query", false);
        this.f233080C = afVar.mo79830a("recognition completed query", false);
        this.f233101h = afVar.mo79830a("web page", false);
        this.f233081D = afVar.mo79830a("SRP metadata", false);
        this.f233082E = afVar.mo79830a("event ID", true);
        this.f233102i = afVar.mo79830a("action", false);
        this.f233083F = C86196af.m138654b();
        this.f233084G = afVar.mo79830a("suggestions", false);
        this.f233085H = afVar.mo79830a("clockwork", false);
        this.f233086I = afVar.mo79830a("structured result", false);
        this.f233087J = afVar.mo79830a("streaming cards", true);
        this.f233088K = afVar.mo79830a("scroll padding", false);
        this.f233089L = afVar.mo79830a("corpora order", false);
        this.f233090M = afVar.mo79830a("psychic joining filter", true);
        this.f233091N = afVar.mo79830a("urls for prefetch", false);
        this.f233092O = afVar.mo79830a("query biasing info", false);
        this.f233093P = afVar.mo79830a("zero_typing_suggest", false);
        this.f233094Q = afVar.mo79830a("cache ttl", false);
        this.f233095R = afVar.mo79830a("SearchResponseData", false);
        this.f233096S = afVar.mo79830a("location_prompt_request", false);
        this.f233097T = afVar.mo79830a("SrpSubresources", false);
        this.f233104k = false;
        this.f233114u = Query.f252741b;
        this.f233098e = new C86231bn(j, 0, j2, str);
        this.f233099f = iVar;
        this.f233119z = oVar;
        this.f233105l = aVar;
        this.f233103j = new C86198ah(afVar);
    }

    /* renamed from: a */
    private final double m138804a(int i) {
        double d = (double) i;
        double a = this.f233110q.mo57428a();
        Double.isNaN(d);
        return 1.0d - Math.exp(d * a);
    }

    /* renamed from: A */
    public final C60870cx mo79865A() {
        return this.f233078A.f232931a;
    }

    /* renamed from: B */
    public final C60870cx mo79866B() {
        return this.f233091N.f232931a;
    }

    /* renamed from: C */
    public final C60870cx mo79867C() {
        return this.f233092O.f232931a;
    }

    /* renamed from: D */
    public final C60870cx mo79868D() {
        return this.f233080C.f232931a;
    }

    /* renamed from: E */
    public final C60870cx mo79869E() {
        return this.f233088K.f232931a;
    }

    /* renamed from: F */
    public final C60870cx mo79870F() {
        return this.f233094Q.f232931a;
    }

    /* renamed from: G */
    public final C60870cx mo79871G() {
        return this.f233081D.f232931a;
    }

    /* renamed from: H */
    public final C60870cx mo79872H() {
        return this.f233097T.f232931a;
    }

    /* renamed from: I */
    public final C60870cx mo79873I() {
        return this.f233086I.f232931a;
    }

    /* renamed from: J */
    public final C60870cx mo79874J() {
        return this.f233084G.f232931a;
    }

    /* renamed from: K */
    public final C60870cx mo79875K() {
        return this.f233079B.f232931a;
    }

    /* renamed from: L */
    public final C60870cx mo79876L() {
        return this.f233101h.f232931a;
    }

    /* renamed from: M */
    public final C60870cx mo79877M() {
        return this.f233093P.f232931a;
    }

    /* renamed from: N */
    public final C57995n mo79878N() {
        return this.f233108o;
    }

    /* renamed from: O */
    public final void mo79879O() {
        this.f233119z = null;
    }

    /* renamed from: P */
    public final boolean mo79880P() {
        return this.f233112s.value instanceof C60873d.C60875b;
    }

    /* renamed from: Q */
    public final boolean mo79881Q() {
        return this.f233112s.isDone();
    }

    /* renamed from: R */
    public final boolean mo79882R() {
        return C90877ak.m148479m(this.f233112s, Throwable.class);
    }

    /* renamed from: S */
    public final boolean mo79883S() {
        return this.f233098e.f233057f;
    }

    /* renamed from: T */
    public final boolean mo79884T() {
        return this.f233104k;
    }

    /* renamed from: U */
    public final boolean mo79885U() {
        return !C90877ak.m148478l(this.f233112s) && C90918bo.m148517d(this.f233078A.f232931a) && C90918bo.m148517d(this.f233087J.f232931a);
    }

    /* renamed from: V */
    public final boolean mo79886V() {
        return (!C90877ak.m148478l(this.f233112s) && C90918bo.m148517d(this.f233078A.f232931a) && C90918bo.m148517d(this.f233101h.f232931a)) || mo79885U();
    }

    /* renamed from: W */
    public final String mo27493W() {
        return "SearchResultImpl";
    }

    /* renamed from: X */
    public final void mo79907X(byte[] bArr) {
        if (this.f233087J.mo79832b(this.f233115v)) {
            this.f233116w.mo20440jJ(this.f233115v);
            this.f233086I.mo79833c();
        }
        this.f233116w.mo54592c(bArr);
    }

    /* renamed from: Y */
    public final void mo79908Y() {
        this.f233088K.mo79832b(true);
    }

    /* renamed from: Z */
    public final void mo79909Z(C54204u uVar) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        if ((uVar.f142254a & 16) != 0) {
            mo79911ab((int) uVar.f142258f);
        }
        if (uVar.f142257d.size() != 0) {
            this.f233089L.mo79832b(new C62963cj(uVar.f142257d, C54204u.f142251e));
        }
        C58178a aVar = (C58178a) C58179b.f155534j.createBuilder();
        if ((uVar.f142254a & 2) != 0) {
            str = uVar.f142255b;
            aVar.copyOnWrite();
            C58179b bVar = (C58179b) aVar.instance;
            str.getClass();
            bVar.f155536a |= 2;
            bVar.f155538c = str;
        } else {
            str = null;
        }
        if ((uVar.f142254a & 8) != 0) {
            boolean z = uVar.f142256c;
            aVar.copyOnWrite();
            C58179b bVar2 = (C58179b) aVar.instance;
            bVar2.f155536a |= 2048;
            bVar2.f155544i = z;
        }
        mo79928as(new C86247cc(BuildConfig.FLAVOR, str, (C58179b) aVar.build(), false));
        if ((uVar.f142254a & 64) != 0 && !uVar.f142259g) {
            mo79912ac(ActionData.f235991b);
        }
    }

    /* renamed from: aa */
    public final void mo79910aa(int i) {
        this.f233107n.addAndGet(i);
        if (this.f233109p.get() != 0) {
            this.f233108o.mo54592c(Double.valueOf(m138804a(this.f233107n.get())));
        }
    }

    /* renamed from: ab */
    public final void mo79911ab(int i) {
        double d;
        this.f233109p.set(i);
        C60932t tVar = this.f233110q;
        if (i == 0) {
            d = C59203do.f157270a;
        } else {
            double log = Math.log(0.1d);
            double d2 = (double) i;
            Double.isNaN(d2);
            d = log / d2;
        }
        tVar.mo57429b(d);
        this.f233108o.mo54592c(Double.valueOf(m138804a(this.f233107n.get())));
    }

    /* renamed from: ac */
    public final void mo79912ac(ActionData actionData) {
        this.f233083F.mo79831a();
        if (actionData.equals(ActionData.f235991b)) {
            this.f233102i.mo79833c();
        } else {
            this.f233102i.mo79832b(actionData);
        }
    }

    /* renamed from: ad */
    public final void mo79913ad(C58170d dVar) {
        this.f233085H.mo79832b(dVar);
    }

    /* renamed from: ae */
    public final void mo79914ae() {
        mo79936h();
        if (this.f233112s.mo57356n(C118826c.f331422a)) {
            C58485gu guVar = this.f233103j.f232935b;
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                ((C86197ag) guVar.get(i)).mo79833c();
            }
            this.f233108o.mo54589f(true);
            this.f233115v.mo20388jK();
            this.f233116w.mo54589f(true);
        }
    }

    /* renamed from: af */
    public final void mo79915af(C89059o oVar) {
        this.f233119z = oVar;
    }

    /* renamed from: ag */
    public final void mo79916ag(List list) {
        this.f233089L.mo79832b(list);
    }

    /* renamed from: ah */
    public final void mo79917ah(String str) {
        if (C90877ak.m148480n(this.f233082E.f232931a)) {
            String str2 = (String) C90918bo.m148516c(this.f233082E.f232931a, (Object) null);
            if (!TextUtils.equals(str2, str)) {
                if (TextUtils.isEmpty(str2)) {
                    C59104x c = f233074a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SearchResultImpl");
                    ((C59052c) ((C59052c) c).mo56372aa(7808)).mo56386p("Received multiple event IDs: Old ID is empty");
                } else if (TextUtils.isEmpty(str)) {
                    C59104x c2 = f233074a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "SearchResultImpl");
                    ((C59052c) ((C59052c) c2).mo56372aa(7807)).mo56386p("Received multiple event IDs: New ID is empty");
                } else {
                    C59104x c3 = f233074a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "SearchResultImpl");
                    ((C59052c) ((C59052c) c3).mo56372aa(7806)).mo56386p("Received multiple event IDs: Both are non-empty");
                }
                C89886e b = ((C89911f) this.f233105l.mo27525b()).mo83756b(new C90452a(29, C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
                b.f246282c = 23105796;
                if (C90918bo.m148517d(this.f233078A.f232931a)) {
                    b.mo83725d(((Query) C90918bo.m148515b(this.f233078A.f232931a)).f252749G);
                }
                b.mo83721a();
                return;
            }
            return;
        }
        this.f233082E.mo79832b(str);
    }

    /* renamed from: ai */
    public final void mo79918ai(long j) {
        C58838bb.m90884s(!this.f233118y.isDone(), "firstByteElapsedTimeNanos has been already set");
        this.f233118y.mo57356n(Long.valueOf(j));
    }

    /* renamed from: aj */
    public final void mo79919aj(C8588o oVar) {
        this.f233096S.mo79832b(oVar);
    }

    /* renamed from: ak */
    public final void mo79920ak() {
        this.f233096S.mo79833c();
    }

    /* renamed from: al */
    public final void mo79921al(ActionData actionData) {
        if (actionData.equals(ActionData.f235991b)) {
            this.f233083F.mo79831a();
        } else {
            this.f233083F.mo79832b(actionData);
        }
    }

    /* renamed from: am */
    public final void mo79922am(String str) {
        if (this.f233104k) {
            Query L = this.f233114u.mo84249L(str);
            if (C90918bo.m148517d(this.f233078A.f232931a)) {
                String str2 = ((Query) C90918bo.m148515b(this.f233078A.f232931a)).f252770i;
                String d = C23341f.m43777d(str);
                if (!str2.equals(d)) {
                    C59104x d2 = f233074a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "SearchResultImpl");
                    ((C59052c) ((C59052c) d2).mo56372aa(7809)).mo56354G("Prefetched query strings don't match: \"%s\", \"%s\"", str2, d);
                    int i = C90755l.f253831a;
                }
            }
            this.f233078A.mo79832b(L);
        }
    }

    /* renamed from: an */
    public final void mo79923an(Query query) {
        if (query.f252749G != this.f233098e.f233052a) {
            C59104x d = f233074a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SearchResultImpl");
            ((C59052c) ((C59052c) d).mo56372aa(7810)).mo56386p("Setting a query that does not have a matching request ID!");
            int i = C90755l.f253831a;
        }
        this.f233078A.mo79832b(query);
    }

    /* renamed from: ao */
    public final void mo79924ao(String[] strArr) {
        this.f233091N.mo79832b(strArr);
    }

    /* renamed from: ap */
    public final void mo79925ap(boolean z) {
        this.f233090M.mo79832b(Boolean.valueOf(z));
    }

    /* renamed from: aq */
    public final void mo79926aq(C61995f fVar) {
        this.f233092O.mo79832b(fVar);
    }

    /* renamed from: ar */
    public final void mo79927ar(Query query) {
        this.f233080C.mo79832b(query);
    }

    /* renamed from: as */
    public final void mo79928as(C86247cc ccVar) {
        if (this.f233081D.mo79832b(ccVar)) {
            Query query = (Query) C90918bo.m148516c(this.f233078A.f232931a, Query.f252741b);
            String str = ccVar.f233134c;
            boolean z = false;
            if (str != null && !str.equals(query.f252770i)) {
                boolean dP = query.mo84435dP();
                C90498f i = query.mo84480i();
                i.mo84546E(str);
                i.mo84572d(0, 524288);
                i.mo84551J(query.f252760R);
                query = i.mo84568a();
                if (dP != query.mo84435dP()) {
                    ((C89911f) this.f233105l.mo27525b()).mo83755a((Throwable) null, 68001765, 29).mo83721a();
                }
                z = true;
            }
            if (z) {
                this.f233079B.mo79832b(query);
            }
            String str2 = ccVar.f233133b;
            if (!C58837ba.m90859h(str2)) {
                mo79917ah(str2);
            }
        }
    }

    /* renamed from: at */
    public final void mo79929at(C8525ae aeVar) {
        this.f233086I.mo79832b(aeVar);
        C58976aa aaVar = C58975e.f156826a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 535;
        String b = C39191a.m68623b(((Query) C90918bo.m148516c(this.f233078A.f232931a, Query.f252741b)).f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        this.f233099f.mo83702b(C89849ae.RENDER_START);
        this.f233087J.mo79833c();
    }

    /* renamed from: au */
    public final void mo79930au(C85874e eVar) {
        this.f233084G.mo79832b(eVar);
    }

    /* renamed from: av */
    public final void mo79931av(long j) {
        this.f233117x = j;
    }

    /* renamed from: aw */
    public final void mo79932aw(C87504b bVar) {
        this.f233101h.mo79832b(bVar);
    }

    /* renamed from: ax */
    public final void mo79933ax() {
        this.f233101h.mo79833c();
    }

    /* renamed from: ay */
    public final void mo79934ay(C8575bc bcVar) {
        this.f233093P.mo79832b(bcVar);
    }

    /* renamed from: az */
    public final void mo79935az(C58179b bVar) {
        if (!C90918bo.m148517d(this.f233081D.f232931a)) {
            C59104x d = f233074a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SearchResultImpl");
            ((C59052c) ((C59052c) d).mo56372aa(7812)).mo56386p("Update metadata (MDP) before setting metadata (EOC)!");
            int i = C90755l.f253831a;
            return;
        }
        C86247cc ccVar = (C86247cc) C90918bo.m148515b(this.f233081D.f232931a);
        if (bVar == null) {
            ((C59052c) ((C59052c) C86247cc.f233132a.mo56225c()).mo56372aa(7814)).mo56386p("updateSearchMetadata: update without a metadata object!");
        } else {
            C58178a aVar = (C58178a) ccVar.f233135d.toBuilder();
            try {
                aVar.mergeFrom(bVar.toByteArray(), C62921ba.m95368a());
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C86247cc.f233132a.mo56226d()).mo56382g(e)).mo56372aa(7813)).mo56386p("Re-encoding protobuf should not cause exception");
                int i2 = C90755l.f253831a;
            }
            ccVar.f233135d = (C58179b) aVar.build();
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: e */
    public C60870cx mo79887e() {
        return this.f233082E.f232931a;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchResult");
        fVar.mo85288o("Suggestions query", this.f233114u);
        fVar.mo85288o("Original query", (C90964a) C90918bo.m148516c(this.f233078A.f232931a, (Object) null));
        fVar.mo85288o("Updated query", (C90964a) C90918bo.m148516c(this.f233079B.f232931a, (Object) null));
        fVar.mo85288o("Action data", (C90964a) C90918bo.m148516c(this.f233102i.f232931a, (Object) null));
        fVar.mo85288o("Web page", (C90964a) C90918bo.m148516c(this.f233101h.f232931a, (Object) null));
        fVar.mo85279c("State").mo85276a(C90752i.m148229c(C90877ak.m148476j(this.f233112s)));
        fVar.mo85288o("SRP metadata", (C90964a) C90918bo.m148516c(this.f233081D.f232931a, (Object) null));
        fVar.mo85279c("Event ID").mo85276a(C90752i.m148229c((CharSequence) C90918bo.m148516c(this.f233082E.f232931a, (Object) null)));
        fVar.mo85288o("Request metadata", this.f233098e);
        C85874e eVar = (C85874e) C90918bo.m148516c(this.f233084G.f232931a, (Object) null);
        fVar.mo85279c("Suggestions").mo85276a(C90752i.m148229c(eVar == null ? "null" : eVar.f232186a));
        if (C90918bo.m148517d(this.f233085H.f232931a)) {
            C91005e c = fVar.mo85279c("Clockwork result status");
            int a = C58169c.m88928a(((C58170d) C90918bo.m148515b(this.f233085H.f232931a)).f155516a);
            if (a == 0) {
                a = 1;
            }
            c.mo85276a(C90752i.m148230d(Integer.valueOf(a - 1)));
        }
        fVar.mo85279c("Structured results returned").mo85276a(C90752i.m148228b(Boolean.valueOf(C90918bo.m148517d(this.f233086I.f232931a))));
        fVar.mo85279c("QueryBiasingContext returned").mo85276a(C90752i.m148228b(Boolean.valueOf(C90918bo.m148517d(this.f233092O.f232931a))));
        fVar.mo85279c("Bytes received").mo85276a(C90752i.m148230d(Integer.valueOf(this.f233107n.get())));
        fVar.mo85279c("SearchResponseData").mo85276a(C90752i.m148228b(Boolean.valueOf(C90918bo.m148517d(this.f233095R.f232931a))));
        fVar.mo85279c("URLs for prefetch").mo85276a(C90752i.m148228b(Boolean.valueOf(C90918bo.m148517d(this.f233091N.f232931a))));
    }

    /* renamed from: h */
    public void mo79936h() {
        this.f233113t.mo57356n(C118826c.f331422a);
    }

    /* renamed from: j */
    public final void mo79839j() {
        mo79936h();
        if (this.f233112s.cancel(false)) {
            C58485gu guVar = this.f233103j.f232935b;
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                ((C86197ag) guVar.get(i)).mo79831a();
            }
            this.f233108o.mo54589f(true);
            this.f233115v.mo20388jK();
            this.f233116w.mo54589f(true);
        }
    }

    /* renamed from: k */
    public final void mo79840k(C90456c cVar) {
        Exception c = cVar.mo79845c();
        mo79936h();
        synchronized (f233077d) {
            if (this.f233112s.mo57357o(c)) {
                this.f233111r.mo57356n(cVar);
                this.f233103j.mo79834a(c);
                this.f233108o.mo54589f(true);
                this.f233115v.mo20388jK();
                this.f233116w.mo54589f(true);
                long j = ((Query) C90918bo.m148516c(this.f233078A.f232931a, Query.f252741b)).f252749G;
                C89886e b = ((C89911f) this.f233105l.mo27525b()).mo83756b(cVar);
                b.mo83725d(j);
                b.mo83721a();
            }
        }
    }

    /* renamed from: l */
    public final long mo79888l() {
        return this.f233106m;
    }

    /* renamed from: m */
    public final long mo79889m() {
        return this.f233117x;
    }

    /* renamed from: n */
    public final C86231bn mo79890n() {
        return this.f233098e;
    }

    /* renamed from: o */
    public final C90456c mo79891o() {
        C90456c cVar;
        synchronized (f233077d) {
            cVar = (C90456c) C90877ak.m148475i(this.f233111r, (Object) null);
        }
        return cVar;
    }

    /* renamed from: p */
    public final C89882e mo79892p() {
        C89881d d = C89882e.m146357d();
        ((C89878a) d).f246244a = this.f233119z;
        d.mo83714b(this.f233104k);
        return d.mo83713a();
    }

    /* renamed from: q */
    public final C60870cx mo79893q() {
        return this.f233102i.f232931a;
    }

    /* renamed from: r */
    public final C60870cx mo79894r() {
        C60870cx h = C60846c.m92879h(C90877ak.m148468b(C58485gu.m89847o(this.f233102i.f232931a, this.f233083F.f232931a)), CancellationException.class, new C86239bv(this), C60826bg.f164896a);
        return C60846c.m92879h(this.f233102i.f232931a, Throwable.class, new C86240bw(h), C60826bg.f164896a);
    }

    /* renamed from: s */
    public final C60870cx mo79895s() {
        return this.f233087J.f232931a;
    }

    /* renamed from: t */
    public final C60870cx mo79896t() {
        return this.f233085H.f232931a;
    }

    public final String toString() {
        return String.format("SearchResult[mState=%s, mSuggestionsQuery=%s, mOriginalQuery=%s, mUpdatedQuery=%s, mActionData=%s, mSrpMetadata=%s, mEventId=%s]", new Object[]{C90877ak.m148476j(this.f233112s), this.f233114u, C90918bo.m148516c(this.f233078A.f232931a, (Object) null), C90918bo.m148516c(this.f233079B.f232931a, (Object) null), C90918bo.m148516c(this.f233102i.f232931a, (Object) null), C90918bo.m148516c(this.f233081D.f232931a, (Object) null), C90918bo.m148516c(this.f233082E.f232931a, (Object) null)});
    }

    /* renamed from: u */
    public final C60870cx mo79897u() {
        return this.f233089L.f232931a;
    }

    /* renamed from: v */
    public final C60870cx mo79898v() {
        return this.f233112s;
    }

    /* renamed from: w */
    public final C60870cx mo79899w() {
        return this.f233113t;
    }

    /* renamed from: x */
    public final C60870cx mo79900x() {
        return this.f233118y;
    }

    /* renamed from: y */
    public final C60870cx mo79901y() {
        return this.f233090M.f232931a;
    }

    /* renamed from: z */
    public final C60870cx mo79902z() {
        return this.f233096S.f232931a;
    }

    public C86241bx(Query query, Query query2, long j, String str, C89859i iVar, C89059o oVar, C68214a aVar) {
        Query query3 = query;
        Query query4 = query2;
        C86196af afVar = new C86196af();
        this.f233100g = afVar;
        boolean z = false;
        C86197ag a = afVar.mo79830a("original query", false);
        this.f233078A = a;
        this.f233079B = afVar.mo79830a("updated query", false);
        this.f233080C = afVar.mo79830a("recognition completed query", false);
        this.f233101h = afVar.mo79830a("web page", false);
        this.f233081D = afVar.mo79830a("SRP metadata", false);
        this.f233082E = afVar.mo79830a("event ID", true);
        this.f233102i = afVar.mo79830a("action", false);
        this.f233083F = C86196af.m138654b();
        this.f233084G = afVar.mo79830a("suggestions", false);
        this.f233085H = afVar.mo79830a("clockwork", false);
        this.f233086I = afVar.mo79830a("structured result", false);
        this.f233087J = afVar.mo79830a("streaming cards", true);
        this.f233088K = afVar.mo79830a("scroll padding", false);
        this.f233089L = afVar.mo79830a("corpora order", false);
        this.f233090M = afVar.mo79830a("psychic joining filter", true);
        this.f233091N = afVar.mo79830a("urls for prefetch", false);
        this.f233092O = afVar.mo79830a("query biasing info", false);
        this.f233093P = afVar.mo79830a("zero_typing_suggest", false);
        this.f233094Q = afVar.mo79830a("cache ttl", false);
        this.f233095R = afVar.mo79830a("SearchResponseData", false);
        this.f233096S = afVar.mo79830a("location_prompt_request", false);
        this.f233097T = afVar.mo79830a("SrpSubresources", false);
        C58838bb.m90868c((query3 != null) != (query4 != null));
        this.f233104k = query3 == null ? true : z;
        if (query3 != null) {
            a.mo79832b(query3);
            this.f233114u = Query.f252741b;
            this.f233098e = new C86231bn(query3.f252749G, 0, j, str);
        } else {
            query2.getClass();
            this.f233114u = query4;
            this.f233098e = new C86231bn(C90719ac.f253778a.f253779b.nextLong(), query4.f252749G, j, str);
        }
        this.f233099f = iVar;
        this.f233119z = oVar;
        this.f233105l = aVar;
        this.f233103j = new C86198ah(afVar);
    }
}
