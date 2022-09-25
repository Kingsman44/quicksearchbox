package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30271p;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.p2351a.C30288c;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.android.libraries.onegoogle.popovercontainer.C31032ag;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.h */
/* compiled from: PG */
public final /* synthetic */ class C30682h implements C31032ag {

    /* renamed from: a */
    public final /* synthetic */ C31036ak f82821a;

    /* renamed from: b */
    public final /* synthetic */ C30305n f82822b;

    /* renamed from: c */
    public final /* synthetic */ C30922i f82823c;

    /* renamed from: d */
    public final /* synthetic */ C63644b f82824d;

    public /* synthetic */ C30682h(C31036ak akVar, C30305n nVar, C30922i iVar, C63644b bVar) {
        this.f82821a = akVar;
        this.f82822b = nVar;
        this.f82823c = iVar;
        this.f82824d = bVar;
    }

    /* renamed from: a */
    public final View mo36355a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C31036ak akVar = this.f82821a;
        C30305n nVar = this.f82822b;
        C30922i iVar = this.f82823c;
        C63644b bVar = this.f82824d;
        if (akVar.getView() == null) {
            return C30694t.m57352d(layoutInflater);
        }
        C30675ax axVar = new C30675ax(layoutInflater.getContext());
        C2391v viewLifecycleOwner = akVar.getViewLifecycleOwner();
        View findViewById = axVar.findViewById(R.id.sign_in_button);
        C30901aa aaVar = new C30901aa(new C30674aw(nVar, bVar));
        aaVar.f83316d = iVar.mo35755b();
        aaVar.f83317e = iVar.mo35754a();
        findViewById.setOnClickListener(new C30938y(aaVar));
        C30699y yVar = new C30699y(nVar, axVar.getContext(), bVar, iVar, viewLifecycleOwner);
        yVar.f82868e = true;
        yVar.f82871h = true;
        int i = C30288c.f81916a;
        yVar.f82869f = C30288c.m56359a(nVar, true);
        C30698x a = yVar.mo36385a();
        int a2 = C30271p.m56305a(axVar.getContext()) + axVar.getResources().getDimensionPixelSize(R.dimen.additional_horizontal_spacing);
        C30695u uVar = (C30695u) a;
        C30675ax.m57329b((RecyclerView) axVar.findViewById(R.id.cards_and_actions), axVar.mo36371a(uVar.f82860a, a2, nVar, iVar));
        C30675ax.m57329b((RecyclerView) axVar.findViewById(R.id.common_actions), axVar.mo36371a(uVar.f82861b, a2, nVar, iVar));
        return axVar;
    }
}
