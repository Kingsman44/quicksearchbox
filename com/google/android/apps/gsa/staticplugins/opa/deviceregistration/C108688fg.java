package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83989a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83990b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83991c;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83994f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83995g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C84002n;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8356a.C108530a;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8356a.C108531b;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8356a.C108532c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fg */
/* compiled from: PG */
public final class C108688fg extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302289b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fg");

    /* renamed from: c */
    public C90929bz f302290c;

    /* renamed from: d */
    public C108556ar f302291d;

    /* renamed from: e */
    public C108532c f302292e;

    /* renamed from: f */
    public C84002n f302293f;

    /* renamed from: g */
    public Button f302294g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.room_picker, (ViewGroup) null);
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44612));
        C108741i iVar = this.f302291d.f302004l;
        iVar.getClass();
        String h = iVar.mo97105h() == null ? BuildConfig.FLAVOR : iVar.mo97105h();
        h.getClass();
        HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout.f228718a, h, TextView.BufferType.NORMAL, headerLayout);
        RecyclerView recyclerView = legacyOpaStandardPage.f228724c.f228894q;
        legacyOpaStandardPage.mo77367b();
        C84002n nVar = new C84002n();
        this.f302293f = nVar;
        nVar.f228833c = true;
        nVar.f228834d = true;
        C83989a aVar = new C83989a();
        aVar.mo77434a();
        C83990b bVar = new C83990b(aVar);
        C84002n nVar2 = this.f302293f;
        nVar2.f228832b = bVar;
        recyclerView.setAdapter(nVar2);
        recyclerView.mHasFixedSize = true;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        C84002n nVar3 = this.f302293f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C83995g(8));
        Set<C108531b> d = this.f302292e.mo96973d();
        if (!d.isEmpty()) {
            arrayList.add(new C83995g(16));
            arrayList.add(new C83991c(getString(R.string.room_picker_my_room), false));
            arrayList.add(new C83995g(16));
            for (C108531b ffVar : d) {
                arrayList.add(new C108687ff(this, ffVar));
            }
            arrayList.add(new C83995g(16));
            arrayList.add(new C83994f());
            arrayList.add(new C83995g(16));
            arrayList.add(new C83991c(getString(R.string.room_picker_create_new), false));
            arrayList.add(new C83995g(16));
        }
        for (String aVar2 : getResources().getStringArray(R.array.assistant_settings_home_suggested_room_names)) {
            arrayList.add(new C108687ff(this, new C108530a((String) null, aVar2)));
        }
        nVar3.f228831a = arrayList;
        nVar3.mObservable.mo2879a();
        Button a = legacyOpaStandardPage.f228725d.mo77360a();
        this.f302294g = a;
        a.setOnClickListener(new C89943l(new C108684fc(this)));
        this.f302294g.setVisibility(8);
        legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108685fd(this)));
        return legacyOpaStandardPage;
    }
}
