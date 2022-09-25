package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.au.al;
import com.google.android.apps.gsa.nga.engine.au.bz;
import com.google.android.apps.gsa.nga.engine.au.c;
import com.google.android.apps.gsa.nga.engine.au.ce;
import com.google.android.apps.gsa.nga.engine.au.e;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80378h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4887at.p4888a.p4889a.C63813p;
import java.util.Set;
import p001a.p014d.p015a.p016a.C0072q;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.n */
/* compiled from: PG */
public final class C77337n implements C76591c {

    /* renamed from: a */
    private static final C58974d f213280a = C58974d.m91136j();

    /* renamed from: b */
    private final C77319ak f213281b;

    /* renamed from: c */
    private final C77338o f213282c;

    /* renamed from: d */
    private final al f213283d;

    /* renamed from: e */
    private final bz f213284e;

    /* renamed from: f */
    private final e f213285f;

    /* renamed from: g */
    private final Set f213286g;

    public C77337n(C77319ak akVar, C77338o oVar, al alVar, bz bzVar, e eVar, Set set) {
        this.f213281b = akVar;
        this.f213282c = oVar;
        this.f213283d = alVar;
        this.f213284e = bzVar;
        this.f213285f = eVar;
        this.f213286g = set;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.FIND_ON_SITE));
        C80378h hVar = (C80378h) C80379i.f220555h.createBuilder();
        hVar.copyOnWrite();
        ((C80379i) hVar.instance).f220559c = true;
        hVar.copyOnWrite();
        ((C80379i) hVar.instance).f220558b = true;
        h.mo72245d((C80379i) hVar.build());
        h.mo72244c(C58485gu.m89846n("FindOnSite"));
        ((C76541a) h).f211766c = 10806;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C79326x a = new C79326x(Optional.m71637of(f213280a)).mo73900a("\nFindOnSiteFulfiller");
        a.mo73900a("Input FunctionCall").mo73900a(bgVar.f211837a.toString());
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "website");
        if (!g.isPresent()) {
            a.mo73900a("Abort - Website argument not found.");
            return C81442m.f222851a;
        }
        String str = (String) g.get();
        C77338o oVar = this.f213282c;
        C79326x a2 = new C79326x(Optional.m71637of(C77338o.f213287a)).mo73900a("FulfillmentBlacklistHandler");
        C58495hd b = C77338o.m124110b(oVar.f213288b.mo85403h(C90126fx.f251721oE));
        a2.mo73900a(String.format("FindOnSite blacklist: %s.", new Object[]{b}));
        String str2 = (String) b.get(c.a(str, oVar.f213289c.mo71415a().f209313b));
        if (str2 != null && C77338o.m124111c(str2, oVar.mo72523a())) {
            a.mo73900a(String.format("Abort - Website [%s] is blacklisted.", new Object[]{str}));
            return C81442m.f222851a;
        }
        String str3 = (String) bgVar.mo72265g(C76564ah.f211801a, "query").orElse(BuildConfig.FLAVOR);
        Optional empty = Optional.empty();
        Optional c = this.f213283d.a().c(str, Optional.m71637of(this.f213285f.a()));
        if (c.isPresent()) {
            if (((C0072q) c.get()).f200b != null) {
                C63813p pVar = ((C0072q) c.get()).f200b;
                if (pVar == null) {
                    pVar = C63813p.f172587d;
                }
                empty = Optional.m71637of(ce.a(str3, pVar));
            } else {
                a.mo73900a(String.format("Url fulfillment not supported for [%s]. Autobot fulfillment might still work.", new Object[]{str}));
            }
        }
        if (!empty.isPresent()) {
            a.mo73900a("Abort - Url could not be generated.");
            return C81442m.f222851a;
        }
        String str4 = (String) empty.get();
        if (C77321am.m124094b(str4)) {
            a.mo73900a("Abort - Url [%s] is marked as Sensitive.");
            return C81442m.f222851a;
        }
        a.mo73900a("URL generated: ".concat(String.valueOf(str4)));
        C79326x a3 = a.mo73900a("Open URL");
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(5);
        if (this.f213281b.mo72522a(str4, lVar, this.f213286g, nVar, false, a3)) {
            a.mo73900a("RETURNING - Generated open URL intent");
            lVar.mo74315g(C77324ap.m124097b(bgVar, str4, this.f213284e.a(), this.f213285f.a()));
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        a.mo73900a("Could not fulfill intent");
        return C81442m.f222851a;
    }
}
