package com.google.android.libraries.onegoogle.account.policyfooter;

import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.account.policyfooter.k */
/* compiled from: PG */
final class C30251k extends C30248h {

    /* renamed from: b */
    final /* synthetic */ PolicyFooterView f81781b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30251k(PolicyFooterView policyFooterView) {
        super(policyFooterView);
        this.f81781b = policyFooterView;
    }

    /* renamed from: a */
    public final void mo35758a() {
        this.f81781b.f81746d.setVisibility(0);
        PolicyFooterView.m56209g(this.f81781b.f81743a);
        PolicyFooterView.m56209g(this.f81781b.f81744b);
        this.f81781b.mo35731f(1, 1, 1);
        if (this.f81781b.f81745c.getVisibility() == 0) {
            PolicyFooterView.m56209g(this.f81781b.f81745c);
            this.f81781b.f81747e.setVisibility(0);
        }
        this.f81781b.mo35728a(new int[][]{new int[]{R.id.og_privacy_policy_button}, new int[]{R.id.og_separator1}, new int[]{R.id.og_tos_button}, new int[]{R.id.og_separator2}, new int[]{R.id.og_custom_button}});
    }
}
