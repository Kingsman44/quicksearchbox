package com.google.android.libraries.onegoogle.account.policyfooter;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.account.policyfooter.g */
/* compiled from: PG */
public final /* synthetic */ class C30247g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PolicyFooterView f81775a;

    /* renamed from: b */
    public final /* synthetic */ C30156a f81776b;

    /* renamed from: c */
    public final /* synthetic */ int f81777c;

    public /* synthetic */ C30247g(PolicyFooterView policyFooterView, int i, C30156a aVar) {
        this.f81775a = policyFooterView;
        this.f81777c = i;
        this.f81776b = aVar;
    }

    public final void onClick(View view) {
        PolicyFooterView policyFooterView = this.f81775a;
        int i = this.f81777c;
        C30156a aVar = this.f81776b;
        C30860b bVar = policyFooterView.f81749g;
        Object a = policyFooterView.f81751i.mo5129a();
        C63643a aVar2 = (C63643a) policyFooterView.f81750h.toBuilder();
        aVar2.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar2.instance;
        bVar2.f172122b = i - 1;
        bVar2.f172121a |= 1;
        bVar.mo35875a(a, (C63644b) aVar2.build());
        policyFooterView.f81752j.mo35826f(C28442l.m53142h(), view);
        aVar.mo17832a(view, policyFooterView.f81751i.mo5129a());
    }
}
