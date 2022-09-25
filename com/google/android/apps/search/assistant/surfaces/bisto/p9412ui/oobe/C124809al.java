package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c.C124862e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c.C124863f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.C125009e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142340bs;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46854h;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.al */
/* compiled from: PG */
public final class C124809al implements C46852f, C46851e {

    /* renamed from: i */
    private static final C59071e f344333i = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.al");

    /* renamed from: a */
    public final FinishedFragment f344334a;

    /* renamed from: b */
    public final C124921r f344335b;

    /* renamed from: c */
    public final OobeActivityViewModel f344336c;

    /* renamed from: d */
    public final C46855i f344337d;

    /* renamed from: e */
    public C46854h f344338e;

    /* renamed from: f */
    public final C124844bo f344339f;

    /* renamed from: g */
    public C142324bc f344340g = C142324bc.f386113s;

    /* renamed from: h */
    public boolean f344341h = false;

    /* renamed from: j */
    private final C47770dh f344342j;

    /* renamed from: k */
    private final AccountId f344343k;

    /* renamed from: l */
    private final C46128f f344344l;

    /* renamed from: m */
    private final boolean f344345m;

    /* renamed from: n */
    private final C124883ch f344346n;

    public C124809al(C124848bs bsVar, FinishedFragment finishedFragment, C124921r rVar, C47770dh dhVar, AccountId accountId, C46855i iVar, C124883ch chVar, C46128f fVar) {
        this.f344334a = finishedFragment;
        this.f344335b = rVar;
        this.f344342j = dhVar;
        this.f344343k = accountId;
        this.f344336c = (OobeActivityViewModel) new C2368bp(finishedFragment.requireActivity()).mo5770a(OobeActivityViewModel.class);
        C124844bo boVar = bsVar.f344439b;
        this.f344339f = boVar == null ? C124844bo.f344417m : boVar;
        C124844bo boVar2 = bsVar.f344439b;
        this.f344345m = (boVar2 == null ? C124844bo.f344417m : boVar2).f344425g;
        this.f344337d = iVar;
        this.f344346n = chVar;
        this.f344344l = fVar;
    }

    /* renamed from: c */
    private final void m204582c(C142324bc bcVar, boolean z) {
        String str;
        String str2;
        GlifLayout glifLayout = (GlifLayout) ((ScreenStateView) this.f344334a.requireView().findViewById(R.id.assistant_oobe_template_screen_root)).mo106775a(C125009e.MAIN, R.layout.assistant_bisto_oobe_generic);
        Context requireContext = this.f344334a.requireContext();
        if (this.f344336c.f344279f) {
            if (z) {
                str = requireContext.getString(R.string.assistant_bisto_oobe_unicorn_finish_setup_title);
                if (this.f344345m) {
                    str2 = requireContext.getString(R.string.assistant_bisto_oobe_unicorn_finish_setup_description);
                } else {
                    str2 = requireContext.getString(R.string.assistant_bisto_oobe_jit_unicorn_finish_setup_description);
                }
            } else {
                str = requireContext.getString(R.string.assistant_bisto_oobe_finish_setup_title);
                if (this.f344345m) {
                    str2 = requireContext.getString(R.string.assistant_bisto_oobe_finish_setup_description);
                } else {
                    str2 = requireContext.getString(R.string.assistant_bisto_oobe_jit_finish_setup_description);
                }
            }
        } else if (z) {
            str = requireContext.getString(R.string.assistant_bisto_oobe_unicorn_finish_setup_title);
            str2 = requireContext.getString(R.string.assistant_bisto_oobe_unicorn_finish_setup_description_no_hotword);
        } else {
            str = requireContext.getString(R.string.assistant_bisto_oobe_finish_setup_title);
            str2 = requireContext.getString(R.string.assistant_bisto_oobe_finish_setup_description_no_hotword);
        }
        glifLayout.mo49197s(str);
        glifLayout.mo49195q(str2);
        C142340bs bsVar = bcVar.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142328bg bgVar = bsVar.f386181d;
        if (bgVar == null) {
            bgVar = C142328bg.f386139f;
        }
        C124862e a = C124863f.m204684a(this.f344343k, bgVar);
        C0154a aVar = new C0154a(this.f344334a.getChildFragmentManager());
        aVar.mo689v(R.id.assistant_bisto_oobe_webview_container, a, (String) null);
        aVar.mo509f();
        C45275b bVar = (C45275b) glifLayout.mo49129j(C45275b.class);
        int i = true != this.f344345m ? R.string.assistant_bisto_oobe_button_ok : R.string.assistant_bisto_generic_next;
        C47591co coVar = new C47591co(this.f344342j, "Next button click", C124807aj.f344331a);
        C45276c c = C124849bt.m204632c(this.f344334a.requireContext());
        c.f118282c = 4;
        c.mo49181b(i);
        c.f118281b = coVar;
        bVar.mo49175f(c.mo49180a());
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        return new C46885y("assistant.bisto.Finished");
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C124883ch chVar = this.f344346n;
        return C47633f.m84733g(this.f344344l.mo50214a(this.f344343k)).mo51516i(new C124882cg(chVar), chVar.f344571b);
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f344333i.mo56226d()).mo56382g(th)).mo56372aa(36322)).mo56386p("Failed to get unicorn info.");
        m204582c(this.f344340g, false);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        Boolean bool = (Boolean) obj;
        ((C59052c) ((C59052c) f344333i.mo56224b()).mo56372aa(36323)).mo56389s("isUnicorn = %b", bool);
        m204582c(this.f344340g, bool.booleanValue());
    }
}
