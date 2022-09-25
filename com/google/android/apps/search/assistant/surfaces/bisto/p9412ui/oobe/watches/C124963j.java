package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import android.support.p031v4.app.C0154a;
import androidx.lifecycle.C2368bp;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124524e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124849bt;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c.C124862e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c.C124863f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.C125009e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142338bq;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142355cg;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47591co;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.j */
/* compiled from: PG */
public final /* synthetic */ class C124963j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124964k f344803a;

    public /* synthetic */ C124963j(C124964k kVar) {
        this.f344803a = kVar;
    }

    public final void accept(Object obj) {
        C124964k kVar = this.f344803a;
        C142324bc bcVar = (C142324bc) obj;
        C142340bs bsVar = bcVar.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        if ((bsVar.f386178a & C89885b.NOW_VALUE) != 0) {
            ((OobeActivityViewModel) new C2368bp(kVar.f344804a.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a().mo106662b("ButtonPressEducationFragment");
            C142340bs bsVar2 = bcVar.f386119e;
            if (bsVar2 == null) {
                bsVar2 = C142340bs.f386174C;
            }
            C142338bq bqVar = bsVar2.f386203z;
            if (bqVar == null) {
                bqVar = C142338bq.f386166g;
            }
            GlifLayout glifLayout = (GlifLayout) ((ScreenStateView) kVar.f344804a.requireView().findViewById(R.id.assistant_oobe_template_screen_root)).mo106775a(C125009e.MAIN, R.layout.assistant_bisto_oobe_generic);
            C142355cg cgVar = bqVar.f386169b;
            if (cgVar == null) {
                cgVar = C142355cg.f386263b;
            }
            C124524e a = C124525f.m203985a(cgVar);
            Objects.requireNonNull(glifLayout);
            a.mo106448a(new C124960g(glifLayout));
            C142355cg cgVar2 = bqVar.f386171d;
            if (cgVar2 == null) {
                cgVar2 = C142355cg.f386263b;
            }
            C124524e a2 = C124525f.m203985a(cgVar2);
            Objects.requireNonNull(glifLayout);
            a2.mo106448a(new C124961h(glifLayout));
            if ((bqVar.f386168a & 2) != 0) {
                AccountId accountId = kVar.f344805b;
                C142328bg bgVar = bqVar.f386170c;
                if (bgVar == null) {
                    bgVar = C142328bg.f386139f;
                }
                C124862e a3 = C124863f.m204684a(accountId, bgVar);
                C0154a aVar = new C0154a(kVar.f344804a.getChildFragmentManager());
                aVar.mo689v(R.id.assistant_bisto_oobe_webview_container, a3, (String) null);
                aVar.mo509f();
            }
            C45276c c = C124849bt.m204632c(kVar.f344804a.requireContext());
            c.mo49181b(R.string.assistant_bisto_generic_next);
            c.f118281b = new C47591co(kVar.f344807d, "next", new C124962i(kVar));
            c.f118282c = 5;
            ((C45275b) glifLayout.mo49129j(C45275b.class)).mo49175f(c.mo49180a());
            return;
        }
        kVar.mo106756a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
