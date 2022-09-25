package com.google.android.apps.gsa.staticplugins.p7932f.p7934b;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6513aj.C84556p;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.shared.p7066m.C90140s;
import com.google.android.apps.gsa.staticplugins.p7932f.p7935c.C100689a;
import com.google.android.apps.gsa.staticplugins.p7932f.p7935c.C100692d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.ampactions.AmpWebView;
import com.google.android.libraries.assistant.ampactions.C11031d;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23058i;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.acx;
import com.google.assistant.p3897e.p3921j.acy;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.b.n */
/* compiled from: PG */
public final class C100686n extends C23056g implements C100689a {

    /* renamed from: a */
    public static final C59071e f281523a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.f.b.n");

    /* renamed from: b */
    public final C11031d f281524b;

    /* renamed from: c */
    public final C100692d f281525c;

    /* renamed from: d */
    public final C22871g f281526d;

    /* renamed from: e */
    public final C22871g f281527e;

    /* renamed from: f */
    public final C22871g f281528f;

    /* renamed from: g */
    public acy f281529g;

    /* renamed from: h */
    public AmpWebView f281530h;

    /* renamed from: i */
    public final C87290c f281531i;

    /* renamed from: j */
    public final C100685m f281532j = new C100685m(this);

    /* renamed from: k */
    private final C23058i f281533k;

    /* renamed from: l */
    private final C86124t f281534l;

    public C100686n(C23052c cVar, C100692d dVar, C11031d dVar2, C87290c cVar2, C23058i iVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C86124t tVar) {
        super(cVar);
        this.f281524b = dVar2;
        this.f281525c = dVar;
        this.f281531i = cVar2;
        this.f281533k = iVar;
        this.f281526d = gVar;
        this.f281527e = gVar2;
        this.f281528f = gVar3;
        this.f281534l = tVar;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        Object obj;
        acy acy = (acy) C23245b.m43557b(protoParcelable, acy.f134860d.getParserForType(), C62921ba.m95368a(), true);
        acy.getClass();
        ((C23251a) this.f281525c.mo92008b()).mo28730f(acy, false);
        C23251a aVar = (C23251a) this.f281525c.mo92010d();
        acx acx = acy.f134864c;
        if (acx == null) {
            acx = acx.f134854e;
        }
        aVar.mo28730f(acx.f134858c, false);
        C23251a aVar2 = (C23251a) this.f281525c.mo92012f();
        acx acx2 = acy.f134864c;
        if (acx2 == null) {
            acx2 = acx.f134854e;
        }
        aVar2.mo28730f(acx2.f134859d, false);
        C23251a aVar3 = (C23251a) this.f281525c.mo92011e();
        String x = this.f281534l.mo79758x(C90140s.f251869b);
        String x2 = this.f281534l.mo79758x(C90140s.f251870c);
        if (x.isEmpty()) {
            obj = C58836b.f156633a;
        } else if (x2.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(x));
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addFlags(268435456);
            obj = C58833ax.m90834k(intent);
        } else {
            Intent a = C84556p.m135246a(R.string.feedback_entrypoint_ampactions, Uri.parse(x), false, x2, "velvet");
            a.addFlags(268435456);
            obj = C58833ax.m90834k(a);
        }
        aVar3.mo28730f(obj, false);
        ((C23251a) this.f281525c.mo92009c()).mo28730f(this.f281534l.mo79758x(C90140s.f251868a), false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        acy acy = (acy) ((C23251a) this.f281525c.mo92008b()).f63720e;
        acy.getClass();
        this.f281529g = acy;
        this.f281533k.mo28500a(this.f63405W, new C100682j(this));
        this.f281529g.getClass();
        this.f281528f.mo28212l("onArgsUpdated", new C100683k(this));
    }
}
