package com.google.android.libraries.onegoogle.account.policyfooter;

import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.account.policyfooter.j */
/* compiled from: PG */
final class C30250j extends C30248h {

    /* renamed from: b */
    final /* synthetic */ PolicyFooterView f81780b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30250j(PolicyFooterView policyFooterView) {
        super(policyFooterView);
        this.f81780b = policyFooterView;
    }

    /* renamed from: a */
    public final void mo35758a() {
        this.f81780b.f81746d.setVisibility(0);
        this.f81780b.f81747e.setVisibility(8);
        PolicyFooterView.m56210h(this.f81780b.f81743a);
        PolicyFooterView.m56209g(this.f81780b.f81745c);
        this.f81780b.mo35731f(8388613, 8388611, 1);
        this.f81780b.mo35728a(new int[][]{new int[]{R.id.og_privacy_policy_button, R.id.og_separator1, R.id.og_tos_button}, new int[]{R.id.og_custom_button}});
        PolicyFooterView policyFooterView = this.f81780b;
        PolicyFooterView.m56211i(policyFooterView.f81746d, policyFooterView.f81748f);
    }

    /* renamed from: b */
    public final void mo35759b(int i) {
        mo35760c(this.f81780b.f81745c, i);
    }
}
