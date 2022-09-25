package com.google.android.apps.gsa.staticplugins.p7614bx.p7620c;

import android.accounts.Account;
import android.accounts.AccountsException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.h.m.a;
import com.google.android.apps.gsa.p6467p.C84042f;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6512ai.C84510a;
import com.google.android.apps.gsa.search.core.p6512ai.C84511b;
import com.google.android.apps.gsa.search.core.p6512ai.C84512c;
import com.google.android.apps.gsa.search.core.p6519al.p6620bu.C85022a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.search.core.p6884y.C87379h;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87360a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87361b;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88156rf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.C90254a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.C90261c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.C90263e;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C89983av;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.sidekick.shared.util.C91962am;
import com.google.android.apps.gsa.sidekick.shared.util.C91974ay;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97419a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97423d;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97424e;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.p7622a.C97420a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60494rz;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7891nu;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.c.n */
/* compiled from: PG */
public final class C97411n extends C23056g implements C97419a, C87360a, C87361b {

    /* renamed from: a */
    public static final C59071e f272003a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bx.c.n");

    /* renamed from: b */
    static final long f272004b = Duration.ofMillis(500).toMillis();

    /* renamed from: c */
    public final C97424e f272005c;

    /* renamed from: d */
    public final C86054o f272006d;

    /* renamed from: e */
    public final C84510a f272007e;

    /* renamed from: f */
    public final C22871g f272008f;

    /* renamed from: g */
    public final C87290c f272009g;

    /* renamed from: h */
    private final C86124t f272010h;

    /* renamed from: i */
    private final C90464f f272011i;

    /* renamed from: j */
    private final C97415r f272012j;

    /* renamed from: k */
    private final C90323a f272013k;

    /* renamed from: l */
    private final C87379h f272014l;

    /* renamed from: m */
    private final C68214a f272015m;

    /* renamed from: n */
    private final C84042f f272016n;

    /* renamed from: o */
    private final C87571n f272017o;

    /* renamed from: p */
    private final Context f272018p;

    /* renamed from: q */
    private final C22871g f272019q;

    /* renamed from: r */
    private final C90324b f272020r = new C97406i(this);

    /* renamed from: s */
    private final C84486a f272021s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97411n(C23052c cVar, C97424e eVar, Context context, C86124t tVar, C90464f fVar, C97415r rVar, C86054o oVar, C84510a aVar, C90323a aVar2, C22871g gVar, C87379h hVar, C68214a aVar3, C84042f fVar2, C87571n nVar, C87290c cVar2, C84486a aVar4, C22871g gVar2) {
        super(cVar);
        this.f272005c = eVar;
        this.f272010h = tVar;
        this.f272012j = rVar;
        this.f272011i = fVar;
        this.f272006d = oVar;
        this.f272013k = aVar2;
        this.f272007e = aVar;
        this.f272008f = gVar;
        this.f272014l = hVar;
        this.f272015m = aVar3;
        this.f272016n = fVar2;
        this.f272017o = nVar;
        this.f272018p = context;
        this.f272009g = cVar2;
        this.f272021s = aVar4;
        this.f272019q = gVar2;
        if (tVar.mo79746e(C89972ak.f246584y)) {
            C23052c cVar3 = cVar;
            cVar.mo28430t(C90263e.class);
        }
    }

    /* renamed from: a */
    public final void mo81029a() {
        mo90692e();
        mo90708v();
        mo90709w();
    }

    /* renamed from: b */
    public final void mo81030b() {
        mo90693f();
    }

    /* renamed from: e */
    public final void mo90692e() {
        ((C23251a) this.f272005c.mo90681g()).mo28730f(true, false);
    }

    /* renamed from: f */
    public final void mo90693f() {
        ((C23251a) this.f272005c.mo90681g()).mo28730f(false, false);
    }

    /* renamed from: h */
    public final void mo90694h(String str) {
        try {
            this.f272006d.mo79686t(str);
            mo90707u(str);
        } catch (AccountsException unused) {
            this.f272006d.mo79675i(new C97410m(this, str));
            this.f272006d.mo79680n();
        }
    }

    /* renamed from: i */
    public final void mo90695i() {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.creator.home.HomeActivity");
        this.f272014l.mo65089a(intent);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C90261c cVar = C90261c.f252127c;
        try {
            cVar = (C90261c) C62942bv.parseFrom((C62942bv) C90261c.f252127c, protoParcelable.mo28513b(), C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f272003a.mo56225c()).mo56382g(e)).mo56372aa(21015)).mo56386p("Failure parsing ProtoParcelable in onCreate");
        }
        if ((cVar.f252129a & 1) != 0) {
            ((C23251a) this.f272005c.mo90680f()).mo28730f(cVar.f252130b, false);
        }
        if (this.f272010h.mo79746e(C89972ak.f246584y)) {
            ((C23186f) this.f272005c.mo90676b()).mo28623d(C90254a.f252112b, protoParcelable);
        }
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        mo90708v();
        mo90709w();
        this.f272013k.mo84004a(this.f272020r);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f272013k.mo84005b(this.f272020r);
    }

    /* renamed from: j */
    public final void mo90696j() {
        this.f272016n.mo77506a(this.f272014l, this.f63405W, new C97408k(this), 3, this.f272019q);
    }

    /* renamed from: k */
    public final void mo90697k() {
        this.f272011i.mo84209b(new C90461c(), 0);
    }

    /* renamed from: l */
    public final void mo90698l() {
        Uri parse = Uri.parse("https://www.google.com/safesearch");
        if (this.f272006d.mo79668a() == null) {
            C84510a aVar = this.f272007e;
            C84511b bVar = (C84511b) C84512c.f230001h.createBuilder();
            C60494rz rzVar = C60494rz.MENU;
            bVar.copyOnWrite();
            C84512c cVar = (C84512c) bVar.instance;
            cVar.f230004b = rzVar.f163762v;
            cVar.f230003a = 1 | cVar.f230003a;
            aVar.mo78216a(parse, (C84512c) bVar.build());
            return;
        }
        ((C23251a) this.f272005c.mo90686l()).mo28730f(true, false);
        C86054o oVar = this.f272006d;
        oVar.mo79677k(oVar.mo79668a(), parse, (String) null, new C97401d(this));
    }

    /* renamed from: m */
    public final void mo90699m() {
        this.f272006d.mo79679m();
        mo90709w();
        ((C23251a) this.f272005c.mo90690p()).mo28730f(BuildConfig.FLAVOR, false);
    }

    /* renamed from: n */
    public final void mo90700n() {
        this.f272014l.mo65089a(a.a(C59743a.RECENTLY_ACCESSED_FROM_ACCOUNT_DRAWER));
    }

    /* renamed from: o */
    public final void mo90701o() {
        Intent a = C91962am.m150919a("com.google.android.googlequicksearchbox.MY_REMINDERS");
        a.putExtra("com.google.android.apps.gsa.sidekick.main.reminders.EXTRA_OPT_IN_SOURCE", 17);
        this.f272014l.mo65089a(a);
    }

    /* renamed from: p */
    public final void mo90702p() {
        C97420a.m161246a(this.f272014l, (String) ((C23251a) this.f272005c.mo90690p()).f63720e, "hamburger");
    }

    /* renamed from: q */
    public final void mo90703q() {
        this.f272018p.sendBroadcast(C89257aa.m145198u());
    }

    /* renamed from: r */
    public final void mo90704r() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity");
        this.f272014l.mo65089a(intent);
    }

    /* renamed from: s */
    public final void mo90705s() {
        C87571n nVar = this.f272017o;
        Context context = this.f272018p;
        C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
        hwVar.copyOnWrite();
        C53287ih ihVar = (C53287ih) hwVar.instance;
        ihVar.f139698d = 1;
        ihVar.f139695a = 1 | ihVar.f139695a;
        hwVar.copyOnWrite();
        C53287ih ihVar2 = (C53287ih) hwVar.instance;
        ihVar2.f139702h = 16;
        ihVar2.f139695a |= 64;
        hwVar.copyOnWrite();
        C53287ih ihVar3 = (C53287ih) hwVar.instance;
        ihVar3.f139703i = 36;
        ihVar3.f139695a |= 128;
        this.f272014l.mo65089a(nVar.mo81694a(context, (C53287ih) hwVar.build()));
    }

    /* renamed from: t */
    public final void mo90706t() {
        this.f272014l.mo81040h(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 520).putExtra("extra.accountName", (String) ((C23251a) this.f272005c.mo90690p()).f63720e), 0);
    }

    /* renamed from: u */
    public final void mo90707u(String str) {
        Object obj;
        mo90709w();
        ((C23251a) this.f272005c.mo90690p()).mo28729e(str);
        ClientEventData a = C91974ay.m150930a(C7891nu.ACCOUNT_SWITCHER_DRAWER);
        C85022a aVar = (C85022a) this.f272015m.mo27525b();
        C62940bt btVar = C88156rf.f238317a;
        C87741bw bwVar = a.f236955a;
        C62940bt r1 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r1);
        Object l = bwVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        aVar.mo78659e((C88158rh) obj, 2);
    }

    /* renamed from: v */
    public final void mo90708v() {
        Account a = this.f272006d.mo79668a();
        if (a != null) {
            ((C23251a) this.f272005c.mo90690p()).mo28730f(a.name, false);
        } else {
            ((C23251a) this.f272005c.mo90690p()).mo28730f(BuildConfig.FLAVOR, false);
        }
    }

    /* renamed from: w */
    public final void mo90709w() {
        C97423d dVar;
        C60870cx cxVar;
        C97423d dVar2;
        ((C23251a) this.f272005c.mo90684j()).mo28730f(this.f272012j.f272045f.mo79668a() != null ? C97423d.ENABLED : C97423d.GONE, false);
        C23251a aVar = (C23251a) this.f272005c.mo90683i();
        if (!((C85651bb) this.f272012j.f272042c.mo27525b()).mo79141N()) {
            C58976aa aaVar = C58975e.f156826a;
            dVar = C97423d.GONE;
        } else {
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            dVar = (Locale.ENGLISH.getLanguage().equals(language) || C97415r.f272040a.contains(language) || C97415r.f272041b.contains(locale.toString())) ? C97423d.ENABLED : C97423d.GONE;
        }
        aVar.mo28730f(dVar, false);
        C97415r rVar = this.f272012j;
        if (rVar.f272045f.mo79668a() == null || !rVar.f272044e.mo79746e(C90110fh.f250673bc)) {
            cxVar = C60856cj.m92900i(C97423d.GONE);
        } else {
            cxVar = C60922j.m93044g(((C84486a) rVar.f272047h.mo27525b()).mo78196b(), C97413p.f272038a, C60826bg.f164896a);
        }
        new C90873ag(cxVar, this.f272008f, "Check Recents status", new C97402e(this)).mo85223a(C97403f.f271993a);
        C23251a aVar2 = (C23251a) this.f272005c.mo90688n();
        C97415r rVar2 = this.f272012j;
        aVar2.mo28730f((rVar2.f272045f.mo79668a() == null || !rVar2.f272044e.mo79746e(C90110fh.f250689bs)) ? C97423d.GONE : C97423d.ENABLED, false);
        ((C23251a) this.f272005c.mo90685k()).mo28730f(this.f272012j.f272043d.mo83223p() ? C97423d.ENABLED : C97423d.GONE, false);
        C23251a aVar3 = (C23251a) this.f272005c.mo90677c();
        C97415r rVar3 = this.f272012j;
        aVar3.mo28730f((!rVar3.f272044e.mo79746e(C89983av.f246642a) || rVar3.f272045f.mo79668a() == null) ? C97423d.GONE : C97423d.ENABLED, false);
        ((C23251a) this.f272005c.mo90689o()).mo28730f(this.f272012j.f272045f.mo79668a() != null ? C97423d.ENABLED : C97423d.GONE, false);
        C23251a aVar4 = (C23251a) this.f272005c.mo90679e();
        C97415r rVar4 = this.f272012j;
        if (!rVar4.f272044e.mo79746e(C90110fh.f250603aA) || !rVar4.mo90710a()) {
            dVar2 = C97423d.GONE;
        } else {
            dVar2 = C97423d.ENABLED;
        }
        aVar4.mo28730f(dVar2, false);
        ((C23251a) this.f272005c.mo90687m()).mo28730f(Boolean.valueOf(this.f272012j.mo90710a()), false);
        if (this.f272021s.mo78199f()) {
            C97415r rVar5 = this.f272012j;
            new C90873ag(rVar5.f272046g.mo28209i(rVar5.f272048i.mo77502a(), "Get Incognito availability", C97414q.f272039a), this.f272008f, "Check Incognito availability", new C97404g(this)).mo85223a(C97405h.f271995a);
        }
    }
}
