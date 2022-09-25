package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ag.af;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.r.a;
import com.google.android.apps.gsa.nga.engine.am.s.q;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.am.t.n;
import com.google.android.apps.gsa.nga.engine.dictation.formatter.C75367b;
import com.google.android.apps.gsa.nga.engine.p5913am.p5937r.C74951b;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74966o;
import com.google.android.apps.gsa.nga.engine.p6029g.C76087c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76574ar;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80307bb;
import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4883as.p4884a.C63775d;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.az */
/* compiled from: PG */
public final class C77027az implements C76591c {

    /* renamed from: a */
    public static final C58974d f212594a = C58974d.m91136j();

    /* renamed from: n */
    private static final C82831ca f212595n = C82831ca.SEND_MESSAGE;

    /* renamed from: b */
    public final C81515c f212596b;

    /* renamed from: c */
    public final C77089dg f212597c;

    /* renamed from: d */
    public final q f212598d;

    /* renamed from: e */
    public final a f212599e;

    /* renamed from: f */
    public final C22871g f212600f;

    /* renamed from: g */
    public final C91142g f212601g;

    /* renamed from: h */
    public final com.google.android.apps.gsa.nga.engine.dictation.formatter.a f212602h;

    /* renamed from: i */
    public final C75367b f212603i;

    /* renamed from: j */
    public final C74951b f212604j;

    /* renamed from: k */
    public final C83216f f212605k;

    /* renamed from: l */
    public final C77009ah f212606l;

    /* renamed from: m */
    public final C77139t f212607m;

    /* renamed from: o */
    private final C76087c f212608o;

    /* renamed from: p */
    private final n f212609p;

    /* renamed from: q */
    private final af f212610q;

    public C77027az(C81515c cVar, C77089dg dgVar, q qVar, a aVar, com.google.android.apps.gsa.nga.engine.dictation.formatter.a aVar2, C75367b bVar, C22871g gVar, C91142g gVar2, C76087c cVar2, n nVar, af afVar, C83251g gVar3, C77139t tVar, C77009ah ahVar, C74951b bVar2) {
        this.f212596b = cVar;
        this.f212597c = dgVar;
        this.f212598d = qVar;
        this.f212599e = aVar;
        this.f212602h = aVar2;
        this.f212603i = bVar;
        this.f212600f = gVar;
        this.f212601g = gVar2;
        this.f212608o = cVar2;
        this.f212609p = nVar;
        this.f212610q = afVar;
        this.f212604j = bVar2;
        this.f212605k = gVar3.mo76652a(f212595n);
        this.f212606l = ahVar;
        this.f212607m = tVar;
    }

    /* renamed from: c */
    private final C80401n m123698c(Optional optional, Locale locale) {
        String str;
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(60736);
        af afVar = this.f212610q;
        Objects.requireNonNull(afVar);
        Optional flatMap = optional.flatMap(new C77026ay(afVar));
        if (flatMap.isPresent()) {
            C81515c cVar = this.f212596b;
            str = cVar.mo75121a(locale).getString(R.string.nga_comms_reply_in_unsupported_app, new Object[]{flatMap.get()});
        } else {
            str = this.f212596b.mo75121a(locale).getString(R.string.nga_comms_reply_in_unsupported_app_generic, new Object[0]);
        }
        C81442m.m129557s(lVar, t.r(str));
        return (C80401n) lVar.build();
    }

    /* renamed from: d */
    private static Optional m123699d(C76590bg bgVar) {
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "content");
        if (g.isPresent()) {
            return g;
        }
        return Collection.EL.stream(bgVar.mo72262d("object", "ElectronicMessage", "content")).findFirst();
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        C76541a aVar = (C76541a) h;
        aVar.f211766c = 13031;
        h.mo72244c(C58485gu.m89847o("Reply_to_message", "Send_digital_object"));
        h.mo72277g("Reply_to_message", C90126fx.f251435ik);
        h.mo72277g("Send_digital_object", C90126fx.f251450iz);
        C76087c cVar = this.f212608o;
        Objects.requireNonNull(cVar);
        C77016ao aoVar = new C77016ao(cVar);
        Optional of = Optional.m71637of(f212595n);
        aVar.f211764a = aoVar;
        h.mo72246e(of);
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        Optional optional;
        C76590bg bgVar2 = bgVar;
        C74965n nVar2 = nVar;
        Optional o = nVar.mo71340o();
        if (((Boolean) o.map(C77011aj.f212559a).orElse(false)).booleanValue()) {
            this.f212605k.mo76648a(nVar.mo71336k(), C82835ce.APPLICATION_SUPPORTED_SERVER_ONLY, C83044e.f226656a);
            return C81442m.f222851a;
        }
        C58485gu a = bgVar2.mo72259a("provider");
        Optional g = bgVar2.mo72265g(C76574ar.f211813a, "provider");
        if (C77003ab.m123683c(a, g)) {
            if (a.isEmpty()) {
                optional = g.flatMap(C77012ak.f212560a);
            } else {
                optional = Optional.m71637of(((C63775d) a.get(0)).f172523d);
            }
            return C60856cj.m92900i(m123698c(optional, nVar.mo71342q()));
        }
        C58485gu a2 = C77003ab.m123681a(bgVar2, "recipient");
        if (a2.size() > 1) {
            getClass().getSimpleName();
            this.f212605k.mo76648a(nVar.mo71336k(), C82835ce.MULTIPLE_RECIPIENTS, C83044e.f226656a);
            return C81442m.f222851a;
        }
        Optional filter = Collection.EL.stream(a2).findFirst().filter(C77013al.f212561a);
        if (filter.isPresent() && "me".equals(C80884a.m128736a(((df) filter.get()).b()))) {
            this.f212605k.mo76648a(nVar.mo71336k(), C82835ce.RECIPIENT_WITH_AMBIGUOUS_MEANING_NAME, C83044e.f226656a);
            return C81442m.f222851a;
        } else if (!filter.isPresent() && ((Boolean) o.map(C77014am.f212562a).orElse(false)).booleanValue()) {
            return C60856cj.m92900i(m123698c(o, nVar.mo71342q()));
        } else {
            if (!m123699d(bgVar).filter(C77015an.f212563a).isPresent()) {
                this.f212605k.mo76648a(nVar.mo71336k(), C82835ce.EMPTY_PAYLOAD, C83044e.f226656a);
                return C81442m.f222851a;
            }
            C74966o h = nVar.mo71333h();
            com.google.android.apps.gsa.nga.engine.am.t.a a3 = this.f212609p.a();
            if (!a3.a) {
                C80399l lVar = (C80399l) this.f212609p.b(a3, nVar.mo71342q()).toBuilder();
                lVar.copyOnWrite();
                ((C80401n) lVar.instance).f220663f = true;
                return C60856cj.m92900i((C80401n) lVar.build());
            }
            this.f212597c.mo72421i(nVar2);
            C80399l lVar2 = (C80399l) C80401n.f220656k.createBuilder();
            lVar2.mo74319k(60736);
            C80303ay ayVar = (C80303ay) C80307bb.f220382e.createBuilder();
            return this.f212600f.mo28209i(this.f212600f.mo28210j(h.mo71350a(), "[NGA] SendMessageFulfiller.getAssistContent", new C77024aw(this, nVar, a, g, filter, (String) m123699d(bgVar).map(new C77023av(this, nVar2)).orElse(BuildConfig.FLAVOR), lVar2, ayVar)), "[NGA] SendMessageFulfiller.buildResponse", new C77025ax(lVar2, ayVar));
        }
    }
}
