package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.p5830s.C73908b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90146y;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107975ab;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.p8370a.C109212a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50631ag;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50661x;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.q */
/* compiled from: PG */
public final class C109243q implements C109212a {

    /* renamed from: a */
    public static final C59071e f304191a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.hq.q");

    /* renamed from: b */
    public final C86124t f304192b;

    /* renamed from: c */
    public final C21370a f304193c;

    /* renamed from: d */
    public final C22871g f304194d;

    /* renamed from: e */
    public final C22871g f304195e;

    /* renamed from: f */
    public final C68214a f304196f;

    /* renamed from: g */
    public final C68214a f304197g;

    /* renamed from: h */
    public final C68214a f304198h;

    /* renamed from: i */
    public final C68214a f304199i;

    /* renamed from: j */
    private final C91090a f304200j;

    /* renamed from: k */
    private final C109248v f304201k;

    /* renamed from: l */
    private final C22871g f304202l;

    /* renamed from: m */
    private final C73908b f304203m;

    /* renamed from: n */
    private final ViewGroup f304204n;

    public C109243q(Activity activity, C86124t tVar, C109248v vVar, C73908b bVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C21370a aVar4, C22871g gVar, C22871g gVar2, C22871g gVar3, C68214a aVar5) {
        this.f304203m = bVar;
        this.f304197g = aVar2;
        this.f304196f = aVar;
        this.f304198h = aVar3;
        this.f304192b = tVar;
        this.f304201k = vVar;
        this.f304193c = aVar4;
        this.f304194d = gVar;
        this.f304195e = gVar2;
        this.f304202l = gVar3;
        this.f304199i = aVar5;
        this.f304200j = new C91090a(activity, activity, 0);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.explore_icon_view, (ViewGroup) null);
        inflate.getClass();
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f304204n = viewGroup;
        viewGroup.setOnClickListener(new C89943l(new C109235i(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo97700a(boolean z) {
        long a = this.f304192b.mo79743a(C90014bt.f247294eT);
        if (z) {
            return C109230d.m181787a(a).f304165l;
        }
        return C109230d.m181787a(a).f304164k;
    }

    /* renamed from: b */
    public final ViewGroup mo97673b() {
        return this.f304204n;
    }

    /* renamed from: c */
    public final void mo97674c(C109246t tVar) {
        this.f304200j.mo65089a(this.f304201k.mo97704a(tVar));
    }

    /* renamed from: d */
    public final void mo97675d() {
    }

    /* renamed from: e */
    public final void mo97701e(C50637am amVar, C50638an anVar, ImageView imageView) {
        C58833ax axVar = C58836b.f156633a;
        Iterator it = anVar.f131729b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C50662y yVar = (C50662y) it.next();
            int a = C50661x.m85874a(yVar.f131786b);
            if (a != 0 && a == 3) {
                C50631ag agVar = yVar.f131785a;
                if (agVar == null) {
                    agVar = C50631ag.f131717c;
                }
                axVar = C58833ax.m90834k(agVar.f131719a == 1 ? (String) agVar.f131720b : BuildConfig.FLAVOR);
            }
        }
        boolean h = axVar.mo56113h();
        mo97702g(imageView, mo97700a(h));
        List list = (List) Collection.EL.stream(anVar.f131730c).filter(C109231e.f304167a).map(C109232f.f304168a).collect(Collectors.toList());
        if (h || !list.isEmpty()) {
            amVar.copyOnWrite();
            C50638an anVar2 = (C50638an) amVar.instance;
            anVar2.f131728a |= 1;
            anVar2.f131733f = h;
            this.f304194d.mo28211k(((C108013bm) this.f304198h.mo27525b()).f300493i.mo96376e(15, 26, C58836b.f156633a, C107975ab.f300443a), "#updatesCenter Get Updates Center visual data.", new C109242p(this, axVar, list, imageView));
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: f */
    public final void mo97676f(C50637am amVar, ImageView imageView) {
        if (!this.f304192b.mo79746e(C90146y.f251891c)) {
            this.f304202l.mo28211k(((C108013bm) this.f304198h.mo27525b()).mo96351B(), "#updatesCenter Get Updates Center Queue", new C109239m(this, amVar, imageView));
            return;
        }
        this.f304202l.mo28211k(this.f304203m.mo65439a(), "#updatesCenter Fetching badge data.", new C109238l(this, amVar, imageView));
    }

    /* renamed from: g */
    public final void mo97702g(ImageView imageView, int i) {
        this.f304194d.mo28212l("Set image drawable on UI thread.", new C109233g(imageView, i));
    }
}
