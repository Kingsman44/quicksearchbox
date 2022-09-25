package com.google.android.apps.gsa.staticplugins.p7321ab.p7323b.p7324a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6906n.p6907a.C87357a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6906n.p6907a.C87358b;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87360a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87361b;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87363d;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6910b.C87366a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.monet.p7070b.p7072aa.C90174b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7088g.C90240e;
import com.google.android.apps.gsa.shared.p6968aa.C89067w;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90076ea;
import com.google.android.apps.gsa.staticplugins.p7321ab.p7322a.C92671a;
import com.google.android.apps.gsa.staticplugins.p7321ab.p7323b.p7325b.C92685a;
import com.google.android.libraries.gsa.monet.service.C23051b;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23160l;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.ab.b.a.l */
/* compiled from: PG */
public final class C92683l extends C23056g implements C23051b, C87360a, C87363d, C87361b {

    /* renamed from: a */
    public static final C59071e f258698a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ab.b.a.l");

    /* renamed from: b */
    public final C58833ax f258699b;

    /* renamed from: c */
    public final C22871g f258700c;

    /* renamed from: d */
    public final C89067w f258701d;

    /* renamed from: e */
    public final C89859i f258702e;

    /* renamed from: f */
    private final C92685a f258703f;

    /* renamed from: g */
    private final C90021c f258704g;

    /* renamed from: h */
    private final C86054o f258705h;

    /* renamed from: i */
    private final boolean f258706i;

    /* renamed from: j */
    private C86052m f258707j;

    /* renamed from: k */
    private final C92671a f258708k;

    public C92683l(C23052c cVar, C58833ax axVar, C92685a aVar, C22871g gVar, C92671a aVar2, C86054o oVar, C89067w wVar, C90021c cVar2, boolean z, C89859i iVar) {
        super(cVar);
        this.f258703f = aVar;
        this.f258699b = axVar;
        this.f258700c = gVar;
        this.f258708k = aVar2;
        this.f258705h = oVar;
        this.f258701d = wVar;
        this.f258704g = cVar2;
        this.f258706i = z;
        this.f258702e = iVar;
        cVar.mo28429s(C87366a.class);
        cVar.mo28429s(C87348a.class);
    }

    /* renamed from: a */
    public final void mo81029a() {
        this.f258703f.mo87436c().mo28730f(true, false);
        if (this.f258704g.mo79746e(C90076ea.f249785f)) {
            ((C23160l) this.f258703f.mo87435b()).mo28605d(new C92679h(this));
        }
    }

    /* renamed from: b */
    public final void mo81030b() {
        this.f258703f.mo87436c().mo28730f(false, false);
    }

    /* renamed from: c */
    public final void mo81032c() {
        ((C23160l) this.f258703f.mo87435b()).mo28605d(new C92677f(this));
    }

    /* renamed from: e */
    public final Uri mo87437e(C58833ax axVar, C58833ax axVar2) {
        String str;
        if (C58837ba.m90859h(this.f258704g.mo79758x(C90076ea.f249783d))) {
            str = this.f258708k.f258684a.mo83211i();
        } else {
            str = this.f258704g.mo79758x(C90076ea.f249783d);
        }
        Uri.Builder path = new Uri.Builder().scheme(this.f258708k.f258684a.mo83212j()).encodedAuthority(str).path("collections");
        if (axVar.mo56113h()) {
            for (String appendPath : Uri.parse((String) axVar.mo56107c()).getPathSegments()) {
                path.appendPath(appendPath);
            }
        }
        path.appendQueryParameter("hl", Locale.getDefault().getLanguage());
        String x = this.f258704g.mo79758x(C90076ea.f249786g);
        if (!C58837ba.m90859h(x)) {
            path.appendQueryParameter("th", x);
        }
        if (this.f258706i) {
            path.appendQueryParameter("cs", "1");
        }
        if (axVar2.mo56113h()) {
            path.appendQueryParameter("ved", (String) axVar2.mo56107c());
        }
        return path.build();
    }

    /* renamed from: f */
    public final void mo87438f() {
        if (!this.f258704g.mo79746e(C90076ea.f249785f) || ((Boolean) this.f258703f.mo87436c().f63720e).booleanValue()) {
            ((C23160l) this.f258703f.mo87435b()).mo28605d(C92676e.f258691a);
        } else {
            ((C23160l) this.f258703f.mo87435b()).mo28605d(C92675d.f258690a);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C58833ax axVar;
        C58833ax axVar2;
        C90240e eVar = (C90240e) C23245b.m43557b(protoParcelable, C90240e.f252086e.getParserForType(), C62921ba.m95368a(), true);
        if (eVar != null) {
            C87357a aVar = (C87357a) C87358b.f235922c.createBuilder();
            if ((eVar.f252088a & 4) != 0) {
                axVar = C58833ax.m90834k(eVar.f252091d);
            } else {
                axVar = C58836b.f156633a;
            }
            if ((eVar.f252088a & 2) != 0) {
                axVar2 = C58833ax.m90834k(eVar.f252090c);
            } else {
                axVar2 = C58836b.f156633a;
            }
            String uri = mo87437e(axVar, axVar2).toString();
            aVar.copyOnWrite();
            C87358b bVar = (C87358b) aVar.instance;
            uri.getClass();
            bVar.f235924a = 1 | bVar.f235924a;
            bVar.f235925b = uri;
            this.f258702e.mo83702b(C89849ae.SILKYTAB_INITIALIZE_START);
            ((C23160l) this.f258703f.mo87435b()).mo28606e(C90174b.f251936a, C23245b.m43556a((C87358b) aVar.build()));
            ((C23160l) this.f258703f.mo87435b()).mo28605d(new C92678g(this));
            return;
        }
        throw new IllegalArgumentException("CollectionsInitModel invalid format");
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        ((C23160l) this.f258703f.mo87435b()).f63521d = new C92673b(this);
        if (this.f258699b.mo56113h()) {
            ((C23149a) this.f258699b.mo56107c()).mo28592a(new C92674c(this));
        }
        C92682k kVar = new C92682k(this);
        this.f258707j = kVar;
        this.f258705h.mo79675i(kVar);
    }

    /* renamed from: iF */
    public final boolean mo28488iF() {
        return ((C23160l) this.f258703f.mo87435b()).mo28608g();
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        C86052m mVar = this.f258707j;
        if (mVar != null) {
            this.f258705h.mo79681o(mVar);
            this.f258707j = null;
        }
    }
}
