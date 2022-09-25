package com.google.android.apps.gsa.staticplugins.searchwidget;

import androidx.core.content.C1882h;
import androidx.core.p094f.C1888a;
import androidx.p201w.C4372p;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.location.p5873a.C74632a;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6802h.p6803a.C86089d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6995aq.C89256a;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.util.p7158b.C90744a;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117213a;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117214b;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117215c;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117217e;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117218f;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117219g;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117220h;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117221i;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117222j;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117224l;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8755b.C117225m;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60512sq;
import com.google.common.p4552o.C60520sy;
import com.google.common.p4552o.C60523ta;
import com.google.common.p4552o.alq;
import com.google.common.p4552o.alr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.ab */
/* compiled from: PG */
public final class C117187ab implements C118549h {

    /* renamed from: a */
    public final C86124t f325301a;

    /* renamed from: b */
    public final C68214a f325302b;

    /* renamed from: c */
    public final C21370a f325303c;

    /* renamed from: d */
    public final C86089d f325304d;

    /* renamed from: e */
    private final C68214a f325305e;

    /* renamed from: f */
    private final C68214a f325306f;

    /* renamed from: g */
    private final C117233ba f325307g;

    /* renamed from: h */
    private final C89257aa f325308h;

    /* renamed from: i */
    private final C84474e f325309i;

    /* renamed from: j */
    private final C117219g f325310j;

    public C117187ab(C68214a aVar, C68214a aVar2, C86124t tVar, C21370a aVar3, C68214a aVar4, C117233ba baVar, C89257aa aaVar, C86089d dVar, C117219g gVar, C84474e eVar) {
        this.f325305e = aVar;
        this.f325306f = aVar2;
        this.f325301a = tVar;
        this.f325302b = aVar4;
        this.f325303c = aVar3;
        this.f325307g = baVar;
        this.f325308h = aaVar;
        this.f325304d = dVar;
        this.f325310j = gVar;
        this.f325309i = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C58976aa aaVar = C58975e.f156826a;
        C117219g gVar = this.f325310j;
        C60512sq sqVar = (C60512sq) C60523ta.f163862u.createBuilder();
        String g = C58837ba.m90858g(((C89256a) gVar.f325393c.f325420a.mo27525b()).mo83214b());
        sqVar.copyOnWrite();
        C60523ta taVar = (C60523ta) sqVar.instance;
        taVar.f163864a |= 1;
        taVar.f163865b = g;
        int a = ((C89256a) gVar.f325393c.f325420a.mo27525b()).mo83213a();
        int i = -1;
        if (a < 0) {
            a = -1;
        }
        sqVar.copyOnWrite();
        C60523ta taVar2 = (C60523ta) sqVar.instance;
        taVar2.f163864a |= 2;
        taVar2.f163866c = (long) a;
        boolean c = ((C89256a) gVar.f325393c.f325420a.mo27525b()).mo83215c();
        sqVar.copyOnWrite();
        C60523ta taVar3 = (C60523ta) sqVar.instance;
        taVar3.f163864a |= 4;
        taVar3.f163867d = c;
        int d = ((C89256a) gVar.f325393c.f325420a.mo27525b()).mo83216d();
        sqVar.copyOnWrite();
        C60523ta taVar4 = (C60523ta) sqVar.instance;
        taVar4.f163864a |= 8;
        taVar4.f163868e = (long) d;
        C60520sy a2 = C117225m.m194791a(gVar.f325394d);
        sqVar.copyOnWrite();
        C60523ta taVar5 = (C60523ta) sqVar.instance;
        a2.getClass();
        taVar5.f163870g = a2;
        taVar5.f163864a |= 32;
        C60520sy a3 = C117225m.m194791a(gVar.f325395e);
        sqVar.copyOnWrite();
        C60523ta taVar6 = (C60523ta) sqVar.instance;
        a3.getClass();
        taVar6.f163871h = a3;
        taVar6.f163864a |= 64;
        C60520sy a4 = C117225m.m194791a(gVar.f325396f);
        sqVar.copyOnWrite();
        C60523ta taVar7 = (C60523ta) sqVar.instance;
        a4.getClass();
        taVar7.f163872i = a4;
        taVar7.f163864a |= 128;
        C60520sy a5 = C117225m.m194791a(gVar.f325397g);
        sqVar.copyOnWrite();
        C60523ta taVar8 = (C60523ta) sqVar.instance;
        a5.getClass();
        taVar8.f163873j = a5;
        taVar8.f163864a |= 256;
        C60520sy a6 = C117225m.m194791a(gVar.f325398h);
        sqVar.copyOnWrite();
        C60523ta taVar9 = (C60523ta) sqVar.instance;
        a6.getClass();
        taVar9.f163874k = a6;
        taVar9.f163864a |= 512;
        C117224l lVar = gVar.f325399i;
        int i2 = lVar.f325412a.contains("search_widget_doodle_preference") ? lVar.f325412a.getBoolean("search_widget_doodle_preference", true) ? 2 : 3 : 1;
        sqVar.copyOnWrite();
        C60523ta taVar10 = (C60523ta) sqVar.instance;
        taVar10.f163875l = i2 - 1;
        taVar10.f163864a |= 1024;
        if (gVar.f325392b.mo79746e(C89972ak.f246578s)) {
            Optional empty = Optional.empty();
            try {
                empty = Optional.m71637of(Integer.valueOf(Integer.parseInt(C58837ba.m90858g(C90744a.m148217a("ro.product.first_api_level")))));
            } catch (NumberFormatException e) {
                C59104x c2 = C117220h.f325404a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "DeviceFirstSdkFetcher");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(32792)).mo56386p("Cannot parse first SDK.");
            }
            if (empty.isPresent()) {
                int intValue = ((Integer) empty.get()).intValue();
                sqVar.copyOnWrite();
                C60523ta taVar11 = (C60523ta) sqVar.instance;
                taVar11.f163864a |= 16;
                taVar11.f163869f = intValue;
            }
        }
        Optional map = Optional.ofNullable(C4372p.m12527f()).map(C117221i.f325405a);
        if (map.isPresent()) {
            String str = (String) map.get();
            sqVar.copyOnWrite();
            C60523ta taVar12 = (C60523ta) sqVar.instance;
            str.getClass();
            taVar12.f163864a |= 2048;
            taVar12.f163876m = str;
        }
        Optional map2 = Optional.ofNullable(C4372p.m12527f()).map(C117222j.f325406a);
        if (map2.isPresent()) {
            long longValue = ((Long) map2.get()).longValue();
            sqVar.copyOnWrite();
            C60523ta taVar13 = (C60523ta) sqVar.instance;
            taVar13.f163864a |= 4096;
            taVar13.f163877n = longValue;
        }
        if (C1888a.m5149c()) {
            gVar.f325400j.mo103202a().ifPresent(new C117217e(sqVar));
        }
        alq alq = (alq) alr.f159095g.createBuilder();
        boolean z = C1882h.m5137c(gVar.f325391a, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        alq.copyOnWrite();
        alr alr = (alr) alq.instance;
        alr.f159097a |= 1;
        alr.f159098b = z;
        boolean z2 = C1882h.m5137c(gVar.f325391a, "android.permission.ACCESS_FINE_LOCATION") == 0;
        alq.copyOnWrite();
        alr alr2 = (alr) alq.instance;
        alr2.f159097a |= 4;
        alr2.f159100d = z2;
        boolean z3 = C1882h.m5137c(gVar.f325391a, "android.permission.CAMERA") == 0;
        alq.copyOnWrite();
        alr alr3 = (alr) alq.instance;
        alr3.f159097a |= 8;
        alr3.f159101e = z3;
        boolean z4 = C1882h.m5137c(gVar.f325391a, "android.permission.RECORD_AUDIO") == 0;
        alq.copyOnWrite();
        alr alr4 = (alr) alq.instance;
        alr4.f159097a |= 16;
        alr4.f159102f = z4;
        boolean z5 = C1882h.m5137c(gVar.f325391a, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
        alq.copyOnWrite();
        alr alr5 = (alr) alq.instance;
        alr5.f159097a |= 2;
        alr5.f159099c = z5;
        alr alr6 = (alr) alq.build();
        sqVar.copyOnWrite();
        C60523ta taVar14 = (C60523ta) sqVar.instance;
        alr6.getClass();
        taVar14.f163883t = alr6;
        taVar14.f163864a |= C89885b.HTTP_VALUE;
        C60870cx a7 = gVar.f325401k.f325385a.mo111245a();
        C117215c cVar = gVar.f325402l;
        if (cVar.f325383a.isPresent()) {
            cxVar = C60922j.m93044g(((C74632a) cVar.f325383a.get()).mo71011b(), C117214b.f325382a, cVar.f325384b);
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        C117215c cVar2 = gVar.f325402l;
        if (cVar2.f325383a.isPresent()) {
            cxVar2 = C60922j.m93044g(((C74632a) cVar2.f325383a.get()).mo71012c(), C117213a.f325381a, cVar2.f325384b);
        } else {
            cxVar2 = C60856cj.m92900i(Optional.empty());
        }
        C60870cx a8 = C60856cj.m92893b(cxVar, cxVar2, a7).mo57334a(new C117218f(cxVar, cxVar2, sqVar, a7), gVar.f325403m);
        if (!this.f325309i.mo78076U() && this.f325308h.mo83220l()) {
            this.f325307g.mo103203b(false);
        }
        C86337q b = ((C86338r) this.f325305e.mo27525b()).mo80076b();
        String string = ((C86338r) this.f325305e.mo27525b()).getString("launcher", BuildConfig.FLAVOR);
        String g2 = C58837ba.m90858g(((C89256a) this.f325306f.mo27525b()).mo83214b());
        if (!g2.equals(string)) {
            b.putString("launcher", g2);
        }
        int i3 = ((C86338r) this.f325305e.mo27525b()).getInt("launcher_version_code", -1);
        int a9 = ((C89256a) this.f325306f.mo27525b()).mo83213a();
        if (a9 >= 0) {
            i = a9;
        }
        if (i3 != i) {
            b.putInt("launcher_version_code", i);
        }
        b.putBoolean("launcher_quickstep_enabled", ((C89256a) this.f325306f.mo27525b()).mo83215c());
        b.putInt("launcher_system_navigation_mode", ((C89256a) this.f325306f.mo27525b()).mo83216d());
        b.apply();
        return C60922j.m93045h(a8, new C117186aa(this), C60826bg.f164896a);
    }
}
