package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bf */
/* compiled from: PG */
public final class C139183bf {

    /* renamed from: a */
    public final Fragment f378535a;

    /* renamed from: b */
    public final AccountId f378536b;

    /* renamed from: c */
    public final Map f378537c;

    /* renamed from: d */
    public final boolean f378538d;

    public C139183bf(Activity activity, Fragment fragment, AccountId accountId, Map map, boolean z) {
        C69664n.m101061g(activity, "parentActivity");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(map, "settingSpecs");
        this.f378535a = fragment;
        this.f378536b = accountId;
        this.f378537c = map;
        boolean z2 = fragment.getResources().getBoolean(R.bool.googleapp_settings_use_two_pane);
        boolean z3 = false;
        if (z2 && z) {
            z3 = true;
        }
        this.f378538d = z3;
    }

    /* renamed from: a */
    public final Fragment mo114805a() {
        Fragment b = this.f378535a.getChildFragmentManager().f634a.mo670b(R.id.googleapp_settings_preference_content_fragment);
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: b */
    public final C139198bu mo114806b() {
        Fragment b = this.f378535a.getChildFragmentManager().f634a.mo670b(R.id.googleapp_settings_preference_content_fragment);
        C139196bs bsVar = b instanceof C139196bs ? (C139196bs) b : null;
        if (bsVar == null) {
            AccountId accountId = this.f378536b;
            C139196bs bsVar2 = new C139196bs();
            C68324h.m98669f(bsVar2);
            C47247a.m84047b(bsVar2, accountId);
            mo114808d(bsVar2);
            bsVar = bsVar2;
        }
        return bsVar.mo17754z();
    }

    /* renamed from: c */
    public final void mo114807c() {
        this.f378535a.requireActivity().f2707h.mo3340c();
    }

    /* renamed from: d */
    public final void mo114808d(Fragment fragment) {
        C0154a aVar = new C0154a(this.f378535a.getChildFragmentManager());
        aVar.mo689v(R.id.googleapp_settings_preference_content_fragment, fragment, (String) null);
        aVar.mo518o(fragment);
        aVar.mo509f();
    }
}
