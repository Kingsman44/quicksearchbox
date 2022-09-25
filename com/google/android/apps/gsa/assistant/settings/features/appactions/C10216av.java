package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10266k;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10267l;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p568d.C10311c;
import com.google.android.apps.gsa.assistant.settings.shared.e.j;
import com.google.android.apps.gsa.assistant.settings.shared.e.l;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.av */
/* compiled from: PG */
public final class C10216av {

    /* renamed from: a */
    public static final C59071e f34665a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.appactions.av");

    /* renamed from: b */
    public static final C58487gw f34666b;

    /* renamed from: c */
    public final C10267l f34667c;

    /* renamed from: d */
    public final C10201ag f34668d;

    /* renamed from: e */
    public final C10325al f34669e;

    /* renamed from: f */
    public final C73812a f34670f;

    /* renamed from: g */
    public final C91189au f34671g;

    /* renamed from: h */
    public final l f34672h;

    /* renamed from: i */
    public final C22871g f34673i;

    /* renamed from: j */
    public final C28310af f34674j;

    /* renamed from: k */
    public final C46439e f34675k;

    /* renamed from: l */
    public final C10372de f34676l;

    /* renamed from: m */
    public Optional f34677m = Optional.empty();

    /* renamed from: n */
    public Optional f34678n = Optional.empty();

    /* renamed from: o */
    public Optional f34679o = Optional.empty();

    /* renamed from: p */
    public View f34680p;

    /* renamed from: q */
    public Optional f34681q = Optional.empty();

    /* renamed from: r */
    public C58495hd f34682r = C58729pv.f156485a;

    /* renamed from: s */
    public View f34683s;

    /* renamed from: t */
    public View f34684t;

    /* renamed from: u */
    private final C10311c f34685u;

    /* renamed from: v */
    private final C22871g f34686v;

    /* renamed from: w */
    private final C90021c f34687w;

    static {
        C58486gv gvVar = new C58486gv();
        C10266k kVar = C10266k.MAIN_PAGE;
        Integer valueOf = Integer.valueOf(R.string.your_shortcuts_tab_header);
        gvVar.mo55422f(kVar, Integer.valueOf(R.string.explore_tab_header), valueOf);
        gvVar.mo55422f(C10266k.APP_SPECIFIC_PAGE, Integer.valueOf(R.string.shortcuts_overview_tab_header), valueOf);
        f34666b = gvVar.mo55417a();
    }

    public C10216av(C10201ag agVar, C10267l lVar, C91189au auVar, C90021c cVar, C10325al alVar, C10311c cVar2, C73812a aVar, l lVar2, C28310af afVar, C22871g gVar, C22871g gVar2, C10373df dfVar, C46439e eVar) {
        this.f34668d = agVar;
        this.f34667c = lVar;
        this.f34671g = auVar;
        this.f34687w = cVar;
        this.f34669e = alVar;
        this.f34685u = cVar2;
        this.f34670f = aVar;
        this.f34672h = lVar2;
        this.f34674j = afVar;
        this.f34686v = gVar;
        this.f34673i = gVar2;
        this.f34675k = eVar;
        this.f34676l = dfVar.mo18453a(new C10215au(this), agVar, new C10206al(this), new C10207am(this), new C10208an(this), C10209ao.f34657a);
    }

    /* renamed from: c */
    public static void m25100c(TextView textView, String str) {
        if (!str.isEmpty()) {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public final j mo18344a() {
        C10266k kVar = C10266k.UNKNOWN;
        C10266k a = C10266k.m25161a(this.f34667c.f34807d);
        if (a == null) {
            a = C10266k.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            return new C10214at(this);
        }
        if (ordinal == 2) {
            return new C10213as(this);
        }
        throw new AssertionError("Unexpected page type.");
    }

    /* renamed from: b */
    public final C60870cx mo18345b() {
        if (this.f34687w.mo79746e(C90019by.f248074h)) {
            return this.f34685u.mo18408a();
        }
        return C60856cj.m92900i(C58729pv.f156485a);
    }

    /* renamed from: d */
    public final void mo18346d(j jVar) {
        C60870cx d = jVar.d();
        C22871g gVar = this.f34686v;
        Objects.requireNonNull(jVar);
        new C90873ag(d, gVar, "Reload app shortcuts", new C10204aj(jVar)).mo85223a(C10205ak.f34653a);
    }

    /* renamed from: f */
    public final void mo18348f(Optional optional) {
        C46439e eVar = this.f34675k;
        C10325al alVar = this.f34669e;
        C49838aw awVar = ((C10273r) optional.get()).f34820b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        String str = awVar.f129507b;
        C49826ak akVar = ((C10273r) optional.get()).f34821c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        eVar.mo50445g(new C46438d(alVar.mo18427i(str, akVar, Optional.m71637of(Long.valueOf(((C10273r) optional.get()).f34822d)))), new C46436b((Object) null), this.f34676l);
    }

    /* renamed from: g */
    public final void mo18349g(List list, List list2, Optional optional) {
        C58495hd hdVar;
        C10212ar arVar = (C10212ar) this.f34681q.get();
        arVar.getClass();
        C58485gu j = C58485gu.m89842j(list);
        C58485gu j2 = C58485gu.m89842j(list2);
        if (this.f34687w.mo79746e(C90019by.f248074h)) {
            hdVar = this.f34682r;
        } else {
            hdVar = C58729pv.f156485a;
        }
        for (Fragment fragment : arVar.f34660c.f634a.mo677i()) {
            if (fragment instanceof C10304cw) {
                ((C10304cw) fragment).mo17754z().mo18409a(j, j2, hdVar, optional);
            }
        }
        C58485gu.m89842j(j);
        C58485gu.m89842j(j2);
        arVar.mo9178n();
    }

    /* renamed from: e */
    public final void mo18347e(View view) {
        View view2 = this.f34680p;
        view2.getClass();
        ((AppBarLayout) view2.findViewById(R.id.app_bar)).mo47402l(new C10211aq(view));
    }
}
