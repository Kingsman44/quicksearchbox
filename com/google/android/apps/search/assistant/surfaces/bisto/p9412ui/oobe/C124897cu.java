package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124524e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c.C124862e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c.C124863f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.C125009e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142327bf;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142351cc;
import com.google.android.p10712d.C142355cg;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.tracing.C47591co;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.cu */
/* compiled from: PG */
public final /* synthetic */ class C124897cu implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124907dd f344612a;

    public /* synthetic */ C124897cu(C124907dd ddVar) {
        this.f344612a = ddVar;
    }

    public final void accept(Object obj) {
        C124907dd ddVar = this.f344612a;
        GlifLayout glifLayout = (GlifLayout) ((ScreenStateView) ddVar.f344627a.requireView().findViewById(R.id.assistant_oobe_template_screen_root)).mo106775a(C125009e.MAIN, R.layout.assistant_bisto_oobe_generic);
        C142340bs bsVar = ((C142324bc) obj).f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142351cc ccVar = bsVar.f386198u;
        if (ccVar == null) {
            ccVar = C142351cc.f386238i;
        }
        C142355cg cgVar = ccVar.f386246g;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        C124524e a = C124525f.m203985a(cgVar);
        Objects.requireNonNull(glifLayout);
        a.mo106448a(new C124898cv(glifLayout));
        C142355cg cgVar2 = ccVar.f386241b;
        if (cgVar2 == null) {
            cgVar2 = C142355cg.f386263b;
        }
        C124524e a2 = C124525f.m203985a(cgVar2);
        Objects.requireNonNull(glifLayout);
        a2.mo106448a(new C124899cw(glifLayout));
        C142355cg cgVar3 = ccVar.f386247h;
        if (cgVar3 == null) {
            cgVar3 = C142355cg.f386263b;
        }
        C124525f.m203985a(cgVar3).mo106448a(new C124900cx(glifLayout));
        if ((ccVar.f386240a & 2) != 0) {
            C142328bg bgVar = ccVar.f386242c;
            if (bgVar == null) {
                bgVar = C142328bg.f386139f;
            }
            C142327bf bfVar = (C142327bf) bgVar.toBuilder();
            C142328bg bgVar2 = ccVar.f386242c;
            if (bgVar2 == null) {
                bgVar2 = C142328bg.f386139f;
            }
            Collection.EL.stream(bgVar2.f386142b).findFirst().ifPresent(new C124904da(bfVar, ccVar));
            C142328bg bgVar3 = ccVar.f386242c;
            if (bgVar3 == null) {
                bgVar3 = C142328bg.f386139f;
            }
            Collection.EL.stream(bgVar3.f386144d).findFirst().ifPresent(new C124905db(bfVar, ccVar));
            C124862e a3 = C124863f.m204684a(ddVar.f344628b, (C142328bg) bfVar.build());
            C0154a aVar = new C0154a(ddVar.f344627a.getChildFragmentManager());
            aVar.mo689v(R.id.assistant_bisto_oobe_webview_container, a3, (String) null);
            aVar.mo509f();
        }
        C45275b bVar = (C45275b) glifLayout.mo49129j(C45275b.class);
        C45276c c = C124849bt.m204632c(ddVar.f344627a.requireContext());
        c.mo49181b(R.string.assistant_bisto_set_up);
        c.f118281b = new C47591co(ddVar.f344630d, "Set up button click", new C124901cy(ddVar));
        c.f118282c = 6;
        bVar.mo49175f(c.mo49180a());
        C45276c cVar = new C45276c(ddVar.f344627a.requireContext());
        cVar.mo49181b(R.string.assistant_bisto_no_thanks);
        cVar.f118281b = new C47591co(ddVar.f344630d, "cancel", C124902cz.f344617a);
        cVar.f118282c = 2;
        bVar.mo49176g(cVar.mo49180a(), false);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
