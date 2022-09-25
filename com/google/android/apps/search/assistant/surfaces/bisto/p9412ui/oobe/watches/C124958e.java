package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124848bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.e */
/* compiled from: PG */
public final class C124958e {

    /* renamed from: a */
    public static final C59071e f344789a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.e");

    /* renamed from: b */
    public static final C46691ai f344790b = new C46885y("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ACCOUNT_NAME");

    /* renamed from: c */
    public final AccountMismatchFragment f344791c;

    /* renamed from: d */
    public final C46855i f344792d;

    /* renamed from: e */
    public final AccountId f344793e;

    /* renamed from: f */
    public final C124848bs f344794f;

    /* renamed from: g */
    public final C47770dh f344795g;

    /* renamed from: h */
    public final OobeActivityViewModel f344796h;

    /* renamed from: i */
    public final C124957d f344797i = new C124957d(this);

    /* renamed from: j */
    public final C124956c f344798j = new C124956c(this);

    /* renamed from: k */
    private final C46485f f344799k;

    public C124958e(AccountMismatchFragment accountMismatchFragment, C46855i iVar, C124848bs bsVar, C46485f fVar, AccountId accountId, C47770dh dhVar) {
        this.f344791c = accountMismatchFragment;
        this.f344792d = iVar;
        this.f344794f = bsVar;
        this.f344799k = fVar;
        this.f344793e = accountId;
        this.f344795g = dhVar;
        this.f344796h = (OobeActivityViewModel) new C2368bp(accountMismatchFragment.requireActivity()).mo5770a(OobeActivityViewModel.class);
    }

    /* renamed from: a */
    public final void mo106754a() {
        this.f344799k.mo50482c(this.f344791c).mo50509e(R.id.assistant_bisto_oobe_next, this.f344794f);
    }
}
