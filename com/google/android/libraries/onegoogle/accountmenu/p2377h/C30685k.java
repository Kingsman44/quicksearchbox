package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30378bf;
import com.google.android.libraries.onegoogle.accountmenu.features.p2364e.C30545a;
import com.google.android.libraries.onegoogle.accountmenu.p2351a.C30288c;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30908ah;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.android.libraries.onegoogle.popovercontainer.C31032ag;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.C58838bb;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.k */
/* compiled from: PG */
public final /* synthetic */ class C30685k implements C31032ag {

    /* renamed from: a */
    public final /* synthetic */ C30305n f82833a;

    /* renamed from: b */
    public final /* synthetic */ C30922i f82834b;

    /* renamed from: c */
    public final /* synthetic */ C63644b f82835c;

    /* renamed from: d */
    public final /* synthetic */ C31036ak f82836d;

    public /* synthetic */ C30685k(C30305n nVar, C30922i iVar, C63644b bVar, C31036ak akVar) {
        this.f82833a = nVar;
        this.f82834b = iVar;
        this.f82835c = bVar;
        this.f82836d = akVar;
    }

    /* renamed from: a */
    public final View mo36355a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C30305n nVar = this.f82833a;
        C30922i iVar = this.f82834b;
        C63644b bVar = this.f82835c;
        C31036ak akVar = this.f82836d;
        C30673av avVar = new C30673av(layoutInflater.getContext());
        C2391v viewLifecycleOwner = akVar.getViewLifecycleOwner();
        C58838bb.m90868c(nVar.mo35860k().mo36181n().mo56113h());
        MaterialButton materialButton = (MaterialButton) avVar.findViewById(R.id.turn_off_incognito_button);
        C30545a aVar = (C30545a) nVar.mo35860k().mo36181n().mo56107c();
        materialButton.setText(R.string.og_turn_off_incognito_mode);
        materialButton.mo28945lq(C0678gm.m2375e().mo3100c(avVar.getContext(), R.drawable.quantum_ic_incognito_vd_theme_24));
        C30901aa aaVar = new C30901aa(new C30672au(nVar, bVar));
        aaVar.f83316d = iVar.mo35755b();
        aaVar.f83317e = iVar.mo35754a();
        materialButton.setOnClickListener(new C30938y(aaVar));
        C30699y yVar = new C30699y(nVar, avVar.getContext(), bVar, iVar, viewLifecycleOwner);
        int i = C30288c.f81916a;
        yVar.f82869f = C30288c.m56359a(nVar, true);
        LiveData liveData = ((C30695u) yVar.mo36385a()).f82861b;
        Context context = avVar.getContext();
        C30306o i2 = nVar.mo35858i();
        if (liveData == null) {
            liveData = new C2332ag();
        }
        C30908ah.m57698a(avVar.f82810a, new C30378bf(context, i2, liveData, iVar, nVar.mo35864o(), 0, nVar.mo35860k().mo36170c()));
        avVar.f82810a.getScrollingChildHelper().mo5279a(false);
        avVar.f82810a.setLayoutManager(new LinearLayoutManager(avVar.getContext()));
        return avVar;
    }
}
