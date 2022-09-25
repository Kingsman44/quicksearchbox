package com.google.android.apps.gsa.staticplugins.p7391an.p7394c;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6519al.p6534ag.C84675a;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6893d.C87300a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6899i.C87347a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6910b.C87366a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6911p.C87369b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90249d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.C90254a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90256b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90258d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90259e;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.p7391an.p7395d.C93968a;
import com.google.android.apps.gsa.staticplugins.p7391an.p7395d.p7396a.C93969a;
import com.google.android.apps.gsa.staticplugins.p7391an.p7399f.C94016a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1868g.p1869a.C22816b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5451f.p5452a.p5453a.p5454a.C69381ac;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.c.f */
/* compiled from: PG */
public final class C93962f extends C23056g implements C93968a {

    /* renamed from: a */
    public static final C59071e f262408a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.an.c.f");

    /* renamed from: b */
    public final C93969a f262409b;

    /* renamed from: c */
    private final C22871g f262410c;

    /* renamed from: d */
    private final C84675a f262411d;

    /* renamed from: e */
    private final C85089a f262412e;

    /* renamed from: f */
    private final C58833ax f262413f;

    /* renamed from: g */
    private final C86124t f262414g;

    /* renamed from: h */
    private final C21370a f262415h;

    /* renamed from: i */
    private final SharedPreferences f262416i;

    /* renamed from: j */
    private final C94016a f262417j;

    /* renamed from: k */
    private final C87348a f262418k;

    /* renamed from: l */
    private final C91142g f262419l;

    /* renamed from: m */
    private final C58833ax f262420m;

    /* renamed from: n */
    private final C58833ax f262421n;

    /* renamed from: o */
    private C60870cx f262422o = null;

    public C93962f(C23052c cVar, C93969a aVar, C22871g gVar, C84675a aVar2, C85089a aVar3, C58833ax axVar, C86124t tVar, C21370a aVar4, SharedPreferences sharedPreferences, C94016a aVar5, C87348a aVar6, C91142g gVar2, C58833ax axVar2, C58833ax axVar3) {
        super(cVar);
        this.f262409b = aVar;
        this.f262410c = gVar;
        this.f262411d = aVar2;
        this.f262412e = aVar3;
        this.f262413f = axVar;
        this.f262414g = tVar;
        this.f262415h = aVar4;
        this.f262416i = sharedPreferences;
        this.f262417j = aVar5;
        this.f262418k = aVar6;
        this.f262419l = gVar2;
        this.f262420m = axVar2;
        this.f262421n = axVar3;
        cVar.mo28430t(C87348a.class);
        cVar.mo28429s(C87369b.class);
        cVar.mo28429s(C87347a.class);
        cVar.mo28429s(C87366a.class);
    }

    /* renamed from: j */
    private final void m155031j() {
        C60870cx cxVar = this.f262422o;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f262422o = null;
        }
    }

    /* renamed from: k */
    private final void m155032k() {
        C58976aa aaVar = C58975e.f156826a;
        this.f262416i.edit().putLong("momo_doodle_last_refresh_realtime", this.f262415h.mo26871c()).apply();
        m155031j();
        C60870cx e = this.f262411d.mo78413e();
        this.f262422o = e;
        new C90873ag(e, this.f262410c, "handleDoodleData", new C93959c(this)).mo85223a(C93961e.f262407a);
    }

    /* renamed from: e */
    public final void mo88250e() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f262409b.mo88238e()).f63720e;
        if (!axVar.mo56113h()) {
            C59104x d = f262408a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FeedDoodleHeaderCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(19363)).mo56386p("Can't search doodle, no DoodleData");
            return;
        }
        this.f262412e.mo78706j((DoodleData) axVar.mo56107c());
        this.f262417j.mo88298a(((DoodleData) axVar.mo56107c()).f252937c, Optional.m71637of(this.f262418k));
    }

    /* renamed from: f */
    public final void mo88251f(boolean z) {
        if (this.f262413f.mo56113h()) {
            ((C90249d) this.f262413f.mo56107c()).mo83967a(z ? (C58833ax) ((C23251a) this.f262409b.mo88238e()).f63720e : C58836b.f156633a);
        }
    }

    /* renamed from: h */
    public final void mo88252h() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f262409b.mo88238e()).f63720e;
        if (!axVar.mo56113h()) {
            C59104x d = f262408a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FeedDoodleHeaderCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(19368)).mo56386p("Can't open doodle, no DoodleData");
            return;
        }
        this.f262412e.mo78706j((DoodleData) axVar.mo56107c());
        this.f262417j.mo88299b((DoodleData) axVar.mo56107c(), Optional.m71637of(this.f262418k));
    }

    /* renamed from: i */
    public final void mo88253i() {
        if (this.f262420m.mo56113h() && this.f262421n.mo56113h()) {
            ((C87300a) this.f262420m.mo56107c()).mo80950c((C87334q) this.f262421n.mo56107c());
            ((C87300a) this.f262420m.mo56107c()).mo80948a(this.f63405W, C69381ac.LOBBY);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C22816b bVar = (C22816b) C23245b.m43557b(protoParcelable, C22816b.f62819k.getParserForType(), C62921ba.m95368a(), true);
        if (bVar == null) {
            bVar = C22816b.f62819k;
        }
        ((C23251a) this.f262409b.mo88240g()).mo28730f(Boolean.valueOf(bVar.f62822b), false);
        ((C23251a) this.f262409b.mo88237d()).mo28730f(Boolean.valueOf(bVar.f62823c), false);
        ((C23251a) this.f262409b.mo88239f()).mo28730f(Boolean.valueOf(bVar.f62825e), false);
        ((C23251a) this.f262409b.mo88236c()).mo28730f(Boolean.valueOf(bVar.f62824d), false);
        this.f262409b.mo88247n().mo28730f(Boolean.valueOf(bVar.f62826f), false);
        ((C23251a) this.f262409b.mo88241h()).mo28730f(Boolean.valueOf(bVar.f62827g), false);
        ((C23251a) this.f262409b.mo88243j()).mo28730f(Boolean.valueOf(bVar.f62828h), false);
        ((C23251a) this.f262409b.mo88242i()).mo28730f(Boolean.valueOf(bVar.f62829i), false);
        this.f262409b.mo88246m().mo28730f(Boolean.valueOf(bVar.f62830j), false);
        C23186f fVar = (C23186f) this.f262409b.mo88235b();
        C23129y yVar = C90254a.f252113c;
        C90256b bVar2 = (C90256b) C90259e.f252122d.createBuilder();
        C90258d dVar = bVar.f62830j ? C90258d.MINUS_ONE : C90258d.INTERESTS_TAB;
        bVar2.copyOnWrite();
        C90259e eVar = (C90259e) bVar2.instance;
        eVar.f252126c = dVar.f252121e;
        eVar.f252124a |= 2;
        fVar.mo28623d(yVar, C23245b.m43556a((C90259e) bVar2.build()));
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        boolean z = true;
        ((C23251a) this.f262409b.mo88244k()).mo28730f(Boolean.valueOf(!((Boolean) this.f262409b.mo88246m().f63720e).booleanValue() && this.f262419l.mo85405j(C90010bp.f246987bc)), false);
        this.f262409b.mo88245l().mo28730f(Boolean.valueOf(!((Boolean) this.f262409b.mo88246m().f63720e).booleanValue() && this.f262414g.mo79746e(C90010bp.f246930Z)), false);
        if (!((Boolean) ((C23251a) this.f262409b.mo88244k()).f63720e).booleanValue() && !((Boolean) this.f262409b.mo88245l().f63720e).booleanValue()) {
            if (((Boolean) this.f262409b.mo88247n().f63720e).booleanValue()) {
                long j = this.f262416i.getLong("momo_doodle_last_refresh_realtime", 0);
                long c = this.f262415h.mo26871c() - j;
                if (j != 0 && c >= 0 && c <= Duration.ofMinutes(this.f262414g.mo79743a(C90010bp.f246963af)).toMillis()) {
                    z = false;
                }
                C58976aa aaVar = C58975e.f156826a;
                if (z) {
                    m155032k();
                    return;
                }
                m155031j();
                C60870cx a = this.f262411d.mo78411a();
                this.f262422o = a;
                new C90873ag(a, this.f262410c, "handleDoodleData", new C93959c(this)).mo85223a(C93960d.f262406a);
                return;
            }
            m155032k();
        }
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        if (!((Boolean) ((C23251a) this.f262409b.mo88244k()).f63720e).booleanValue() && !((Boolean) this.f262409b.mo88245l().f63720e).booleanValue()) {
            m155031j();
        }
    }
}
