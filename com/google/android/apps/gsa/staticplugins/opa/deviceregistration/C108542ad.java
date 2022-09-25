package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83989a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83990b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C84002n;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C50305sd;
import com.google.assistant.p3861at.C50308sg;
import com.google.assistant.p3861at.C50309sh;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ad */
/* compiled from: PG */
public final class C108542ad extends C83907bm {

    /* renamed from: b */
    public static final C59071e f301967b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ad");

    /* renamed from: c */
    public C108617cq f301968c;

    /* renamed from: d */
    public C108664ej f301969d;

    /* renamed from: e */
    public C22871g f301970e;

    /* renamed from: f */
    public C84002n f301971f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo96977e(String str) {
        C108617cq cqVar = this.f301968c;
        C50308sg sgVar = (C50308sg) C50309sh.f130935d.createBuilder();
        sgVar.copyOnWrite();
        C50309sh shVar = (C50309sh) sgVar.instance;
        str.getClass();
        shVar.f130937a |= 1;
        shVar.f130938b = str;
        C50309sh shVar2 = (C50309sh) sgVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        shVar2.getClass();
        acx.f128987d = shVar2;
        acx.f128984a |= 2;
        C108616cp e = C108616cp.m180628e();
        cqVar.f302138c.n((Account) ((C83893b) cqVar.f302137b.mo27525b()).mo77278a().mo56107c(), (acx) acw.build(), e, cqVar.getClass().getSimpleName());
        new C90873ag(e.f302134a, this.f301970e, "Update MSP Result", new C108770y(this)).mo85223a(new C108771z(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.fragment_default_media_selection, (ViewGroup) null);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.default_media_selection_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.default_media_selection_description, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        opaPageLayout.getClass();
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(1);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.next, footerLayout);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C108539aa(this)));
        RecyclerView recyclerView = (RecyclerView) opaPageLayout.findViewById(R.id.default_music_providers);
        recyclerView.getClass();
        C84002n nVar = new C84002n();
        this.f301971f = nVar;
        nVar.f228833c = true;
        nVar.f228835e = R.layout.checkable_flip_list_selector_row;
        C83989a aVar = new C83989a();
        aVar.mo77434a();
        aVar.mo77435b();
        C83990b bVar = new C83990b(aVar);
        C84002n nVar2 = this.f301971f;
        nVar2.f228832b = bVar;
        recyclerView.setAdapter(nVar2);
        recyclerView.mHasFixedSize = true;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        C84002n nVar3 = this.f301971f;
        ArrayList arrayList = new ArrayList();
        for (C108679ey eyVar : this.f301969d.f302228a) {
            if (eyVar.mo97058b()) {
                C50305sd sdVar = eyVar.f302272a;
                Drawable a = eyVar.mo97057a(getResources());
                if (a == null) {
                    a = C1877c.m5125a(getActivity(), R.drawable.quantum_ic_error_outline_vd_theme_24);
                }
                arrayList.add(new C108541ac(sdVar.f130921b, sdVar.f130920a, sdVar.f130922c, a, eyVar.f302273b));
            }
        }
        nVar3.f228831a = arrayList;
        nVar3.mObservable.mo2879a();
        return opaPageLayout;
    }
}
