package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83989a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83990b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83995g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C84002n;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dn */
/* compiled from: PG */
public final class C108641dn extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302180b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dn");

    /* renamed from: c */
    public C22871g f302181c;

    /* renamed from: d */
    public C108556ar f302182d;

    /* renamed from: e */
    public C108635dh f302183e;

    /* renamed from: f */
    public C84002n f302184f;

    /* renamed from: g */
    public Button f302185g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.language_selection, (ViewGroup) null);
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(46481));
        Locale locale = Locale.getDefault();
        String displayLanguage = locale.getDisplayLanguage();
        String displayCountry = locale.getDisplayCountry();
        String string = getString(R.string.language_selection_explanation, new Object[]{displayLanguage + " (" + displayCountry + ")"});
        HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout.f228719b, string, TextView.BufferType.NORMAL, headerLayout);
        RecyclerView recyclerView = legacyOpaStandardPage.f228724c.f228894q;
        legacyOpaStandardPage.mo77367b();
        C84002n nVar = new C84002n();
        this.f302184f = nVar;
        nVar.f228833c = true;
        nVar.f228834d = true;
        C83989a aVar = new C83989a();
        aVar.mo77434a();
        C83990b bVar = new C83990b(aVar);
        C84002n nVar2 = this.f302184f;
        nVar2.f228832b = bVar;
        recyclerView.setAdapter(nVar2);
        recyclerView.mHasFixedSize = true;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        C84002n nVar3 = this.f302184f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C83995g(8));
        C58485gu a = this.f302183e.mo97039a(this.f302182d.mo96983b());
        int size = a.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C108640dm(this, (String) a.get(i)));
        }
        nVar3.f228831a = arrayList;
        nVar3.mObservable.mo2879a();
        Button a2 = legacyOpaStandardPage.f228725d.mo77360a();
        this.f302185g = a2;
        a2.setOnClickListener(new C89943l(new C108636di(this)));
        this.f302185g.setVisibility(8);
        legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108637dj(this)));
        return legacyOpaStandardPage;
    }
}
