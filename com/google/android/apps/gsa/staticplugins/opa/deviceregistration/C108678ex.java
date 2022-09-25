package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83989a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83990b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83991c;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83994f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83995g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C84002n;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ex */
/* compiled from: PG */
public final class C108678ex extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302267b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ex");

    /* renamed from: c */
    public C108556ar f302268c;

    /* renamed from: d */
    public C108606cf f302269d;

    /* renamed from: e */
    public Button f302270e;

    /* renamed from: f */
    public C84002n f302271f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.multiple_devices_found, (ViewGroup) null);
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44608));
        RecyclerView recyclerView = legacyOpaStandardPage.f228724c.f228894q;
        legacyOpaStandardPage.mo77367b();
        C84002n nVar = new C84002n();
        this.f302271f = nVar;
        nVar.f228833c = true;
        nVar.f228835e = R.layout.checkable_flip_list_selector_row;
        C83989a aVar = new C83989a();
        aVar.mo77434a();
        aVar.mo77435b();
        C83990b bVar = new C83990b(aVar);
        C84002n nVar2 = this.f302271f;
        nVar2.f228832b = bVar;
        recyclerView.setAdapter(nVar2);
        recyclerView.mHasFixedSize = true;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        C84002n nVar3 = this.f302271f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = C58528ij.m90006F(this.f302268c.f301994b).iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            C108741i iVar = (C108741i) it.next();
            C108556ar arVar = this.f302268c;
            if (!C58837ba.m90859h(iVar.mo97110n()) && !C58837ba.m90859h(iVar.mo97104g())) {
                z = arVar.f301995c.contains(Pair.create(iVar.mo97110n(), iVar.mo97104g()));
            }
            C108676ev evVar = new C108676ev(this, iVar, z);
            if (evVar.mo77443h()) {
                arrayList.add(evVar);
            } else {
                arrayList2.add(evVar);
            }
        }
        this.f302269d.f302123b = arrayList.size();
        arrayList.add(new C108677ew(this));
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C83995g(16));
            arrayList.add(new C83994f());
            arrayList.add(new C83995g(16));
            arrayList.add(new C83991c(getString(R.string.device_not_linkable), true));
            arrayList.addAll(arrayList2);
        }
        nVar3.f228831a = arrayList;
        nVar3.mObservable.mo2879a();
        Button a = legacyOpaStandardPage.f228725d.mo77360a();
        this.f302270e = a;
        a.setEnabled(false);
        this.f302270e.setOnClickListener(new C89943l(new C108674et(this)));
        legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108675eu(this)));
        return legacyOpaStandardPage;
    }
}
