package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.e */
/* compiled from: PG */
public final /* synthetic */ class C102174e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102176g f285035a;

    public /* synthetic */ C102174e(C102176g gVar) {
        this.f285035a = gVar;
    }

    public final void onClick(View view) {
        C102176g gVar = this.f285035a;
        ((C89859i) gVar.f285041d.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FED_HOT_ENROLLMENT_ACCEPT_ON_BOARDING_PAGE);
        if (gVar.f285040c.isPresent()) {
            ((C19435g) gVar.f285040c.get()).mo24621c("FedHot.FedHotDiscoverability.Status", 2);
            gVar.f285044g = gVar.f285038a.getActivity().getLayoutInflater().inflate(R.layout.fed_hot_consent_dialog_content, (ViewGroup) null);
            C0391l lVar = new C0391l(gVar.f285038a.getActivity(), 2132150770);
            HeaderLayout headerLayout = (HeaderLayout) gVar.f285044g.findViewById(R.id.opa_header);
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.fed_hot_consent_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.fed_hot_consent_subtitle, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            FooterLayout footerLayout = (FooterLayout) gVar.f285044g.findViewById(R.id.bottom_sheet_opa_footer);
            footerLayout.mo77362c(2);
            footerLayout.mo77363d(true);
            Button b = footerLayout.mo77361b();
            b.setText(R.string.fed_hot_consent_no_thanks);
            b.setOnClickListener(new C102172c(gVar));
            Button a = footerLayout.mo77360a();
            a.setText(R.string.fed_hot_consent_agree);
            a.setOnClickListener(new C102173d(gVar));
            lVar.setView(gVar.f285044g);
            gVar.f285043f = lVar.create();
            C0392m mVar = gVar.f285043f;
            mVar.getClass();
            mVar.show();
        }
    }
}
