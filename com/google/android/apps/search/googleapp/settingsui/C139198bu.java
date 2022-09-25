package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139874j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bu */
/* compiled from: PG */
public final class C139198bu {

    /* renamed from: a */
    public final C139196bs f378570a;

    /* renamed from: b */
    public final C28306ab f378571b;

    /* renamed from: c */
    public final C139162ap f378572c;

    /* renamed from: d */
    public final boolean f378573d;

    public C139198bu(Activity activity, AccountId accountId, C139196bs bsVar, C47770dh dhVar, C28306ab abVar, boolean z, C139162ap apVar) {
        C69664n.m101061g(activity, "parentActivity");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f378570a = bsVar;
        this.f378571b = abVar;
        this.f378572c = apVar;
        boolean z2 = false;
        if (bsVar.getResources().getBoolean(R.bool.googleapp_settings_use_two_pane) && z) {
            z2 = true;
        }
        this.f378573d = z2;
    }

    /* renamed from: a */
    public final void mo114813a() {
        FragmentManager childFragmentManager = this.f378570a.getChildFragmentManager();
        if (childFragmentManager.f634a.mo670b(R.id.googleapp_settings_detail_pane) == null) {
            C69664n.m101060f(childFragmentManager, BuildConfig.FLAVOR);
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo689v(R.id.googleapp_settings_detail_pane, this.f378572c.mo114791a(new C139160an(C139874j.TOP), (C139873i) null), (String) null);
            aVar.mo686s("TOP_PAGE_ON_DETAIL_PANE");
            aVar.mo505b(false);
            childFragmentManager.mo467ah();
            return;
        }
        throw new IllegalStateException("It's impossible for the TOP page be in the middle of the back stack.");
    }

    /* renamed from: b */
    public final void mo114814b(C139161ao aoVar, C139873i iVar) {
        FragmentManager childFragmentManager = this.f378570a.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, BuildConfig.FLAVOR);
        C0154a aVar = new C0154a(childFragmentManager);
        aVar.mo689v(R.id.googleapp_settings_detail_pane, this.f378572c.mo114791a(aoVar, iVar), (String) null);
        aVar.f814j = 4099;
        aVar.mo686s((String) null);
        aVar.mo505b(false);
        childFragmentManager.mo467ah();
    }

    /* renamed from: c */
    public final void mo114815c() {
        FragmentManager parentFragmentManager = this.f378570a.getParentFragmentManager();
        C69664n.m101060f(parentFragmentManager, "twoPaneFragment.parentFragmentManager");
        C0154a aVar = new C0154a(parentFragmentManager);
        C139196bs bsVar = null;
        if (this.f378570a.getChildFragmentManager().mo471b() != 0) {
            int i = 1;
            if (this.f378573d && C69664n.m101066l(this.f378570a.getChildFragmentManager().mo476i(0).mo507d(), "TOP_PAGE_ON_DETAIL_PANE")) {
                i = 2;
            }
            if (this.f378570a.getChildFragmentManager().mo471b() > i) {
                bsVar = this.f378570a;
            }
        }
        aVar.mo518o(bsVar);
        aVar.mo505b(false);
    }
}
