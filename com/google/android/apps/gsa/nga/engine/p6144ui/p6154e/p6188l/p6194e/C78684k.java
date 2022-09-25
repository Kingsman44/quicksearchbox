package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80579m;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80582p;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80584r;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80585s;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80586t;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80588v;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6348i.C81331a;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.k */
/* compiled from: PG */
public final /* synthetic */ class C78684k implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C78688o f216608a;

    /* renamed from: b */
    public final /* synthetic */ C78670ad f216609b;

    public /* synthetic */ C78684k(C78688o oVar, C78670ad adVar) {
        this.f216608a = oVar;
        this.f216609b = adVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C78688o oVar = this.f216608a;
        C78670ad adVar = this.f216609b;
        Locale a = C78671ae.m126392a(adVar);
        String str = adVar.f216579a;
        String str2 = adVar.f216580b;
        String str3 = str + "/" + str2;
        if ((!C81331a.f222607a.contains(str) || !"org.chromium.chrome.browser.ChromeTabbedActivity".equals(str2)) && (!oVar.f216616d.mo85405j(C90040cs.f248659Z) || !oVar.f216617e.f216601b.contains(str3))) {
            return Optional.empty();
        }
        C80579m mVar = (C80579m) C80581o.f221189i.createBuilder();
        C80590x xVar = C80590x.READ_ALOUD;
        mVar.copyOnWrite();
        ((C80581o) mVar.instance).f221191a = xVar.getNumber();
        C80585s sVar = (C80585s) C80586t.f221205g.createBuilder();
        String string = oVar.f216614b.mo75121a(a).getString(R.string.tactile_on_my_screen_read_aloud_button_label, new Object[0]);
        sVar.copyOnWrite();
        string.getClass();
        ((C80586t) sVar.instance).f221208b = string;
        C80582p pVar = (C80582p) C80584r.f221200d.createBuilder();
        pVar.copyOnWrite();
        ((C80584r) pVar.instance).f221204c = true;
        pVar.copyOnWrite();
        C80584r rVar = (C80584r) pVar.instance;
        rVar.f221202a = 3;
        rVar.f221203b = Integer.valueOf(R.drawable.quantum_gm_ic_record_voice_over_vd_theme_24);
        sVar.copyOnWrite();
        C80584r rVar2 = (C80584r) pVar.build();
        rVar2.getClass();
        ((C80586t) sVar.instance).f221210d = rVar2;
        mVar.copyOnWrite();
        C80586t tVar = (C80586t) sVar.build();
        tVar.getClass();
        ((C80581o) mVar.instance).f221192b = tVar;
        C80588v vVar = (C80588v) C80589w.f221220i.createBuilder();
        vVar.copyOnWrite();
        ((C80589w) vVar.instance).f221226e = 132110;
        mVar.copyOnWrite();
        C80589w wVar = (C80589w) vVar.build();
        wVar.getClass();
        ((C80581o) mVar.instance).f221194d = wVar;
        C80578l a2 = C78688o.m126410a(C80590x.READ_ALOUD);
        mVar.copyOnWrite();
        a2.getClass();
        ((C80581o) mVar.instance).f221193c = a2;
        return Optional.m71637of((C80581o) mVar.build());
    }
}
