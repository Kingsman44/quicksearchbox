package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36626b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ab */
/* compiled from: PG */
public final class C126688ab {

    /* renamed from: a */
    public static final C59071e f348882a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ab");

    /* renamed from: b */
    public static final C58495hd f348883b;

    /* renamed from: c */
    public static final C58495hd f348884c;

    /* renamed from: d */
    public final AccountId f348885d;

    /* renamed from: e */
    public final Context f348886e;

    /* renamed from: f */
    public final C126736w f348887f;

    /* renamed from: g */
    public final C46175b f348888g;

    /* renamed from: h */
    public final C36626b f348889h;

    /* renamed from: i */
    public final C58833ax f348890i;

    /* renamed from: j */
    public final C46801dp f348891j;

    /* renamed from: k */
    public final C28306ab f348892k;

    /* renamed from: l */
    public final C28310af f348893l;

    /* renamed from: m */
    public final C28443m f348894m;

    /* renamed from: n */
    public final boolean f348895n;

    /* renamed from: o */
    public final boolean f348896o;

    /* renamed from: p */
    public final boolean f348897p;

    /* renamed from: q */
    public final String f348898q;

    /* renamed from: r */
    final C126702ap f348899r;

    /* renamed from: s */
    public boolean f348900s = false;

    /* renamed from: t */
    public int f348901t = 1;

    static {
        C58490gz gzVar = new C58490gz(4);
        Integer valueOf = Integer.valueOf(R.id.assistant_suw_intro_item_title_1);
        gzVar.mo55429h(valueOf, Integer.valueOf(R.string.assistant_suw_intro_screen_with_ww_item_title_1));
        Integer valueOf2 = Integer.valueOf(R.id.assistant_suw_intro_item_summary_1);
        gzVar.mo55429h(valueOf2, Integer.valueOf(R.string.assistant_suw_intro_screen_with_ww_item_summary_1));
        Integer valueOf3 = Integer.valueOf(R.id.assistant_suw_intro_item_title_2);
        gzVar.mo55429h(valueOf3, Integer.valueOf(R.string.assistant_suw_intro_screen_with_ww_item_title_2));
        Integer valueOf4 = Integer.valueOf(R.id.assistant_suw_intro_item_summary_2);
        gzVar.mo55429h(valueOf4, Integer.valueOf(R.string.assistant_suw_intro_screen_with_ww_item_summary_2));
        f348883b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(valueOf, Integer.valueOf(R.string.assistant_suw_intro_screen_with_ww_item_title_1_t));
        gzVar2.mo55429h(valueOf2, Integer.valueOf(R.string.assistant_suw_intro_screen_with_ww_item_summary_1_t));
        gzVar2.mo55429h(valueOf3, Integer.valueOf(R.string.assistant_suw_intro_screen_with_ww_item_title_2_t));
        gzVar2.mo55429h(valueOf4, Integer.valueOf(R.string.assistant_suw_intro_screen_with_ww_item_summary_2_t));
        gzVar2.mo55429h(Integer.valueOf(R.id.assistant_suw_intro_hint), Integer.valueOf(R.string.assistant_suw_intro_screen_with_ww_hint_t));
        f348884c = gzVar2.mo55427f(false);
    }

    public C126688ab(AccountId accountId, C46175b bVar, C36626b bVar2, C58833ax axVar, C46801dp dpVar, C28306ab abVar, C28310af afVar, C28443m mVar, Context context, C126736w wVar, boolean z, boolean z2, String str) {
        this.f348885d = accountId;
        this.f348888g = bVar;
        this.f348889h = bVar2;
        this.f348890i = axVar;
        this.f348891j = dpVar;
        this.f348892k = abVar;
        this.f348893l = afVar;
        this.f348894m = mVar;
        this.f348886e = context;
        this.f348887f = wVar;
        this.f348895n = z;
        this.f348897p = z2;
        this.f348898q = str;
        this.f348899r = new C126702ap();
        this.f348896o = wVar.getActivity().getIntent().getBooleanExtra("intent_extra_tng_suw_enabled_from_agsa_c", false);
    }

    /* renamed from: b */
    public static boolean m207180b(Bundle bundle) {
        return bundle != null && bundle.containsKey("intent_extra_use_unicorn_flow") && bundle.getBoolean("intent_extra_use_unicorn_flow") && bundle.containsKey("intent_extra_given_name") && !TextUtils.isEmpty(bundle.getString("intent_extra_given_name")) && bundle.containsKey("intent_extra_standard_gender");
    }

    /* renamed from: a */
    public final void mo107684a(boolean z) {
        this.f348889h.mo40292e(z);
    }

    /* renamed from: c */
    public final void mo107685c(int i) {
        this.f348889h.mo40291d(i);
    }
}
