package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.particle.C30233g;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30271p;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.p2351a.C30288c;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.popovercontainer.C31032ag;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;
import com.google.common.base.C58833ax;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.i */
/* compiled from: PG */
public final /* synthetic */ class C30683i implements C31032ag {

    /* renamed from: a */
    public final /* synthetic */ C31036ak f82825a;

    /* renamed from: b */
    public final /* synthetic */ C30305n f82826b;

    /* renamed from: c */
    public final /* synthetic */ C30922i f82827c;

    /* renamed from: d */
    public final /* synthetic */ C63644b f82828d;

    public /* synthetic */ C30683i(C31036ak akVar, C30305n nVar, C30922i iVar, C63644b bVar) {
        this.f82825a = akVar;
        this.f82826b = nVar;
        this.f82827c = iVar;
        this.f82828d = bVar;
    }

    /* renamed from: a */
    public final View mo36355a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C31036ak akVar = this.f82825a;
        C30305n nVar = this.f82826b;
        C30922i iVar = this.f82827c;
        C63644b bVar = this.f82828d;
        if (akVar.getView() == null) {
            return C30694t.m57352d(layoutInflater);
        }
        C2391v viewLifecycleOwner = akVar.getViewLifecycleOwner();
        C30652aa aaVar = new C30652aa(layoutInflater.getContext());
        C30233g c = C30694t.m57351c(nVar, viewLifecycleOwner);
        int dimensionPixelSize = aaVar.getResources().getDimensionPixelSize(R.dimen.additional_horizontal_spacing);
        C30652aa.m57302b((RecyclerView) aaVar.findViewById(R.id.accounts), new C30271p(aaVar.getContext(), C30677c.m57333a(nVar), new C30700z(iVar, nVar), iVar, bVar, nVar.mo35864o(), dimensionPixelSize, C58833ax.m90834k(c)));
        C30652aa aaVar2 = aaVar;
        C30922i iVar2 = iVar;
        C30699y yVar = new C30699y(nVar, aaVar.getContext(), bVar, iVar, viewLifecycleOwner);
        yVar.f82870g = C30676b.m57331a(aaVar2.getContext(), nVar, bVar);
        yVar.f82868e = true;
        yVar.f82871h = true;
        int i = C30288c.f81916a;
        yVar.f82869f = C30288c.m56359a(nVar, true);
        C30698x a = yVar.mo36385a();
        int a2 = C30271p.m56305a(aaVar2.getContext()) + dimensionPixelSize;
        C30695u uVar = (C30695u) a;
        C30652aa.m57302b((RecyclerView) aaVar2.findViewById(R.id.cards_and_actions), aaVar2.mo36354a(uVar.f82860a, a2, nVar, iVar2));
        C30652aa.m57302b((RecyclerView) aaVar2.findViewById(R.id.common_actions), aaVar2.mo36354a(uVar.f82861b, a2, nVar, iVar2));
        return aaVar2;
    }
}
