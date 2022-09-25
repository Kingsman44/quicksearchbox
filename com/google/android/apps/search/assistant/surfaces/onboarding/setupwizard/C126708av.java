package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.av */
/* compiled from: PG */
public final class C126708av {

    /* renamed from: a */
    public static final C59071e f348945a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.av");

    /* renamed from: b */
    public final AccountId f348946b;

    /* renamed from: c */
    public final Context f348947c;

    /* renamed from: d */
    public final C126704ar f348948d;

    /* renamed from: e */
    public final C46175b f348949e;

    /* renamed from: f */
    public final C58833ax f348950f;

    /* renamed from: g */
    public final C46801dp f348951g;

    /* renamed from: h */
    public final C28306ab f348952h;

    /* renamed from: i */
    public final C28310af f348953i;

    /* renamed from: j */
    public final C28443m f348954j;

    /* renamed from: k */
    public final boolean f348955k;

    /* renamed from: l */
    public final boolean f348956l;

    /* renamed from: m */
    public final String f348957m;

    /* renamed from: n */
    final C126702ap f348958n = new C126702ap();

    /* renamed from: o */
    private final C36624a f348959o;

    public C126708av(AccountId accountId, C46175b bVar, C36624a aVar, C58833ax axVar, C46801dp dpVar, C28306ab abVar, C28310af afVar, C28443m mVar, Context context, C126704ar arVar, boolean z, String str) {
        this.f348946b = accountId;
        this.f348949e = bVar;
        this.f348959o = aVar;
        this.f348950f = axVar;
        this.f348951g = dpVar;
        this.f348952h = abVar;
        this.f348953i = afVar;
        this.f348954j = mVar;
        this.f348947c = context;
        this.f348948d = arVar;
        this.f348955k = z;
        this.f348957m = str;
        this.f348956l = arVar.getActivity().getIntent().getBooleanExtra("intent_extra_tng_suw_enabled_from_agsa_c", false);
    }

    /* renamed from: a */
    public final void mo107703a(boolean z) {
        this.f348959o.mo40251o(z ? C9855w.ENABLED : C9855w.DISABLED);
    }
}
