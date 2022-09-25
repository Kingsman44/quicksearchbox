package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.android.libraries.onegoogle.account.policyfooter.C30241a;
import com.google.android.libraries.onegoogle.account.policyfooter.C30243c;
import com.google.android.libraries.onegoogle.account.policyfooter.C30245e;
import com.google.android.libraries.onegoogle.account.policyfooter.C30246f;
import com.google.android.libraries.onegoogle.account.policyfooter.PolicyFooterView;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.features.C30639v;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.popovercontainer.C31032ag;
import com.google.common.base.C58833ax;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.ae */
/* compiled from: PG */
public final /* synthetic */ class C30656ae implements C31032ag {

    /* renamed from: a */
    public final /* synthetic */ C30305n f82753a;

    /* renamed from: b */
    public final /* synthetic */ C30922i f82754b;

    /* renamed from: c */
    public final /* synthetic */ C63644b f82755c;

    public /* synthetic */ C30656ae(C30305n nVar, C30922i iVar, C63644b bVar) {
        this.f82753a = nVar;
        this.f82754b = iVar;
        this.f82755c = bVar;
    }

    /* renamed from: a */
    public final View mo36355a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C30305n nVar = this.f82753a;
        C30922i iVar = this.f82754b;
        C63644b bVar = this.f82755c;
        PolicyFooterView policyFooterView = new PolicyFooterView(layoutInflater.getContext());
        C30639v e = nVar.mo35860k().mo36172e();
        C30243c cVar = new C30243c(nVar.mo35852b());
        C30245e j = C30246f.m56249j();
        C30241a aVar = (C30241a) j;
        aVar.f81756a = new C30653ab(nVar);
        j.mo35735d(nVar.mo35862m());
        j.mo35736e(bVar);
        j.mo35739h(nVar.mo35864o());
        C58833ax c = e.mo36334c();
        Objects.requireNonNull(cVar);
        j.mo35737f((C30156a) c.mo56109e(new C30654ac(cVar)));
        C58833ax d = e.mo36335d();
        Objects.requireNonNull(cVar);
        j.mo35738g((C30156a) d.mo56109e(new C30655ad(cVar)));
        j.mo35756i(e.mo36333b(), e.mo36332a());
        aVar.f81757b = iVar;
        policyFooterView.mo35729c(j.mo35732a());
        int dimensionPixelSize = policyFooterView.getResources().getDimensionPixelSize(R.dimen.additional_horizontal_spacing);
        policyFooterView.setPadding(policyFooterView.getPaddingLeft() + dimensionPixelSize, policyFooterView.getPaddingTop(), policyFooterView.getPaddingRight() + dimensionPixelSize, policyFooterView.getPaddingBottom());
        return policyFooterView;
    }
}
