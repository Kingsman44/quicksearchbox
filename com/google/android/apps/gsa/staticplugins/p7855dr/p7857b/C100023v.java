package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6519al.p6676cv.C85225a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6890a.C87297a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87332o;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6898h.C87346a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.core.p6884y.p6917i.C87388b;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.core.webview.C87268n;
import com.google.android.apps.gsa.search.core.webview.C87269o;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.p7074a.C90179d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.p7074a.C90180e;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100028a;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100031d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62963cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.v */
/* compiled from: PG */
public final class C100023v extends C23056g implements C100028a {

    /* renamed from: a */
    public static final C59071e f279726a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dr.b.v");

    /* renamed from: b */
    public final C100031d f279727b;

    /* renamed from: c */
    public final C87348a f279728c;

    /* renamed from: d */
    public final C22871g f279729d;

    /* renamed from: e */
    public final C100007f f279730e;

    /* renamed from: f */
    public final C87269o f279731f;

    /* renamed from: g */
    public final C86124t f279732g;

    /* renamed from: h */
    public final C87332o f279733h;

    /* renamed from: i */
    public final C58833ax f279734i;

    /* renamed from: j */
    public final SharedPreferences f279735j;

    /* renamed from: k */
    public final C85225a f279736k;

    /* renamed from: l */
    public final C21370a f279737l;

    /* renamed from: m */
    public final C42876ab f279738m;

    /* renamed from: n */
    public final C58833ax f279739n;

    /* renamed from: o */
    public C99997ae f279740o;

    /* renamed from: p */
    private final C87388b f279741p;

    /* renamed from: q */
    private final C87297a f279742q;

    /* renamed from: r */
    private final C87346a f279743r;

    /* renamed from: s */
    private final C86792g f279744s;

    /* renamed from: t */
    private final C100022u f279745t = new C100022u(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100023v(C23052c cVar, C100031d dVar, C87388b bVar, C87297a aVar, C87348a aVar2, C87346a aVar3, C58833ax axVar, C22871g gVar, C87269o oVar, C86792g gVar2, C87332o oVar2, C86124t tVar, SharedPreferences sharedPreferences, C85225a aVar4, C21370a aVar5, C42876ab abVar, C58833ax axVar2) {
        super(cVar);
        C23052c cVar2 = cVar;
        C87348a aVar6 = aVar2;
        this.f279727b = dVar;
        this.f279741p = bVar;
        this.f279742q = aVar;
        this.f279728c = aVar6;
        this.f279743r = aVar3;
        this.f279729d = gVar;
        this.f279731f = oVar;
        this.f279744s = gVar2;
        this.f279732g = tVar;
        this.f279735j = sharedPreferences;
        this.f279736k = aVar4;
        this.f279737l = aVar5;
        this.f279738m = abVar;
        this.f279734i = axVar;
        this.f279733h = oVar2;
        this.f279739n = axVar2;
        this.f279730e = new C100007f(new C99992a(C90179d.WEB_VIEW, (C23251a) dVar.mo91709j(), new C100012k(this)), new C99992a(C90179d.ACTIONS, (C23251a) dVar.mo91706g(), new C100013l(this)), new C99992a(C90179d.MESSAGES, (C23251a) dVar.mo91707h(), new C100014m(this)));
        cVar.mo28433w(C87348a.class, aVar6);
        cVar.mo28430t(C87346a.class);
        cVar.mo28433w(C87297a.class, aVar);
    }

    /* renamed from: j */
    private final boolean m165725j(C90179d dVar) {
        return new C62963cj(((C90180e) this.f279727b.mo91712m().f63720e).f251951a, C90180e.f251948b).contains(dVar);
    }

    /* renamed from: e */
    public final void mo91716e() {
        throw null;
    }

    /* renamed from: f */
    public final void mo91717f() {
        this.f279730e.mo91713a(C90179d.ACTIONS, this.f279742q.mo80944c());
    }

    /* renamed from: h */
    public final void mo91718h() {
        this.f279730e.mo91713a(C90179d.MESSAGES, this.f279743r.mo80997e());
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C90180e eVar = (C90180e) C23245b.m43557b(protoParcelable, C90180e.f251949c.getParserForType(), C62921ba.m95368a(), true);
        if (eVar != null) {
            this.f279727b.mo91712m().mo28730f(eVar, false);
        }
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        if (m165725j(C90179d.WEB_VIEW)) {
            ((C23251a) this.f279727b.mo91711l()).mo28730f(C58836b.f156633a, false);
            C100022u uVar = this.f279745t;
            long c = this.f279744s.mo80445c();
            C58838bb.m90883r(uVar.f279724a == null);
            C87268n a = uVar.f279725b.f279731f.mo80916a(Long.toString(c));
            a.mo80915h(uVar);
            uVar.mo91715b(a);
            uVar.mo91714a(a);
            uVar.f279724a = Long.valueOf(c);
            this.f279741p.mo81046a(this.f63405W, C88244um.SCROLL_MAIN_CONTENT, new C100016o(this));
        }
        if (m165725j(C90179d.NATIVE_VIEWS)) {
            this.f279741p.mo81046a(this.f63405W, C88244um.UPDATE_CURRENT_NETWORK_TYPE, new C100010i(this));
            this.f279741p.mo81046a(this.f63405W, C88244um.UPDATE_TIMESTAMP_UI, new C100010i(this));
        }
        if (m165725j(C90179d.MESSAGES)) {
            mo91718h();
            this.f279741p.mo81046a(this.f63405W, C88244um.HIDE_MESSAGE_UI, new C100018q(this));
            this.f279741p.mo81046a(this.f63405W, C88244um.SHOW_MESSAGE_UI, new C100019r(this));
        }
        if (m165725j(C90179d.ACTIONS)) {
            mo91717f();
            this.f279741p.mo81046a(this.f63405W, C88244um.UPDATE_VOICE_ACTION_UI, new C100015n(this));
            if (m165725j(C90179d.FULL_ACTIONS)) {
                ((C23251a) this.f279727b.mo91710k()).mo28730f(true, false);
            }
        }
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        ((C23251a) this.f279727b.mo91709j()).mo28730f(false, false);
        ((C23251a) this.f279727b.mo91711l()).mo28730f(C58836b.f156633a, false);
    }

    /* renamed from: i */
    public static final void m165724i(int i, C23129y yVar, C23186f fVar) {
        if (i == 1) {
            if (!fVar.mo28631l()) {
                fVar.mo28623d(yVar, ProtoParcelable.f63423a);
            }
        } else if (fVar.mo28631l()) {
            fVar.mo28627h();
        }
    }
}
