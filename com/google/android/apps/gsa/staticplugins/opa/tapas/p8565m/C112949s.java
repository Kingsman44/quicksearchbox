package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110964ab;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59545do;
import com.google.common.p4552o.p4553a.C59546dp;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Arrays;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.s */
/* compiled from: PG */
public final class C112949s extends C112920hk {

    /* renamed from: a */
    public static final C59071e f313005a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.s");

    /* renamed from: b */
    private final C110964ab f313006b;

    /* renamed from: c */
    private final C112794ct f313007c;

    /* renamed from: d */
    private final C68214a f313008d;

    /* renamed from: e */
    private final C112925hp f313009e;

    /* renamed from: f */
    private final C86124t f313010f;

    /* renamed from: g */
    private final C68214a f313011g;

    /* renamed from: h */
    private final C22871g f313012h;

    /* renamed from: i */
    private final C58528ij f313013i;

    /* renamed from: j */
    private final C113206m f313014j;

    public C112949s(C110964ab abVar, C112794ct ctVar, C68214a aVar, C112925hp hpVar, C68214a aVar2, C22871g gVar, C86124t tVar, C113206m mVar) {
        this.f313006b = abVar;
        this.f313007c = ctVar;
        this.f313008d = aVar;
        this.f313009e = hpVar;
        this.f313012h = gVar;
        this.f313011g = aVar2;
        this.f313010f = tVar;
        this.f313014j = mVar;
        this.f313013i = C58528ij.m90006F(tVar.mo79749o(C90063do.f249413d));
    }

    /* renamed from: k */
    private final void m186921k(C113415ez ezVar, C112919hj hjVar, Optional optional, Optional optional2) {
        C112725ae aeVar = new C112725ae();
        aeVar.f312483a = hjVar.f312954b;
        aeVar.f312484b = hjVar.f312953a;
        aeVar.mo99702b(ezVar.mo100199L());
        Objects.requireNonNull(aeVar);
        optional.ifPresent(new C112943m(aeVar));
        Objects.requireNonNull(aeVar);
        optional2.ifPresent(new C112944n(aeVar));
        this.f313009e.mo99783b(aeVar.mo99701a());
        hjVar.itemView.setVisibility(0);
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return C48672ag.APP_ACTIONS_SHORTCUT.equals(ezVar.mo100211k()) ? 125143 : 88405;
    }

    /* renamed from: d */
    public final Optional mo99715d(C113415ez ezVar) {
        return ezVar.mo100218r().map(new C112945o((C59545do) C59546dp.f158007d.createBuilder()));
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112794ct ctVar = this.f313007c;
        Integer[] numArr = new Integer[1];
        numArr[0] = Integer.valueOf(true != ezVar.mo100211k().equals(C48672ag.APP_ACTIONS_SHORTCUT) ? 74338 : 58128);
        ctVar.mo99739a(4, ezVar, esVar, Optional.m71637of(Arrays.asList(numArr)));
        C58976aa aaVar = C58975e.f156826a;
        Optional r = ezVar.mo100218r();
        if (r.isEmpty()) {
            C59104x d = f313005a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppActionTextItemRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(27762)).mo56386p("#handleOnClick: OnClick was called without AppActionSuggestionParams.");
            return;
        }
        C113502n nVar = (C113502n) r.get();
        C58495hd c = nVar.mo100038c();
        if (c.isEmpty()) {
            this.f313006b.mo98994a(nVar, C58729pv.f156485a);
        } else {
            this.f313006b.mo98994a(nVar, c);
        }
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        ((C112880fy) this.f313008d.mo27525b()).mo99774b(ezVar, view);
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        Optional optional;
        C112919hj hjVar = (C112919hj) ghVar;
        Optional r = ezVar.mo100218r();
        if (r.isEmpty()) {
            C59104x d = f313005a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppActionTextItemRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(27771)).mo56386p("#renderView - AppActionSuggestionParams is not present.");
            hjVar.itemView.setVisibility(8);
            return;
        }
        C113502n nVar = (C113502n) r.get();
        if (nVar.mo100047j().isEmpty()) {
            C59104x d2 = f313005a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AppActionTextItemRenderer");
            ((C59052c) ((C59052c) d2).mo56372aa(27770)).mo56386p("#renderView - No package name present for app action.");
            hjVar.itemView.setVisibility(8);
        } else if (this.f313013i.contains(Integer.valueOf(ezVar.mo100211k().f125915O))) {
            String str = (String) nVar.mo100047j().get();
            C60870cx b = ((C113251ad) this.f313011g.mo27525b()).mo99925b(str);
            C60870cx a = ((C113251ad) this.f313011g.mo27525b()).mo99924a(str);
            C58976aa aaVar = C58975e.f156826a;
            C60870cx f = C60856cj.m92897f(b, a);
            if (C90877ak.m148480n(f)) {
                mo99784j(hjVar, (Optional) C90877ak.m148474h(b), (Optional) C90877ak.m148474h(a), str, ezVar);
                return;
            }
            new C90873ag(f, this.f313012h, "Fetching app Info", new C112941k(this, str, hjVar, b, a, ezVar)).mo85223a(C112942l.f312998a);
        } else {
            if (this.f313010f.mo79746e(C90063do.f249261aG)) {
                String str2 = (String) nVar.mo100047j().get();
                Optional d3 = this.f313014j.mo99845d(str2);
                if (d3.isEmpty()) {
                    C59104x d4 = f313005a.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "AppActionTextItemRenderer");
                    ((C59052c) ((C59052c) d4).mo56372aa(27766)).mo56389s("#renderImmediately - Couldn't find icon for %s", str2);
                    hjVar.itemView.setVisibility(8);
                    return;
                }
                optional = Optional.m71637of(C113259al.m187317b((Drawable) d3.get()));
            } else {
                optional = nVar.mo100039d().map(C112948r.f313004a);
            }
            Optional g = nVar.mo100043g();
            ezVar.mo100199L();
            C58976aa aaVar2 = C58975e.f156826a;
            ezVar.mo100199L();
            m186921k(ezVar, hjVar, g, optional);
        }
    }

    /* renamed from: j */
    public final void mo99784j(C112919hj hjVar, Optional optional, Optional optional2, String str, C113415ez ezVar) {
        if (optional.isEmpty()) {
            C59104x d = f313005a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppActionTextItemRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(27769)).mo56389s("#renderSuggestion - No AppLabel exists for %s", str);
            hjVar.itemView.setVisibility(8);
        } else if (optional2.isEmpty()) {
            C59104x d2 = f313005a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AppActionTextItemRenderer");
            ((C59052c) ((C59052c) d2).mo56372aa(27768)).mo56389s("#renderSuggestion - No AppIcon exists for %s", str);
            hjVar.itemView.setVisibility(8);
        } else {
            String obj = ((CharSequence) optional.get()).toString();
            C58976aa aaVar = C58975e.f156826a;
            m186921k(ezVar, hjVar, Optional.m71637of(obj), Optional.m71637of(C113259al.m187317b((Drawable) optional2.get())));
        }
    }
}
