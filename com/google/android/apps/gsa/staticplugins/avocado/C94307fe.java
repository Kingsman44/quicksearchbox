package com.google.android.apps.gsa.staticplugins.avocado;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.assistant.settings.features.p5702av.C72879n;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83983ah;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.fe */
/* compiled from: PG */
public final /* synthetic */ class C94307fe implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94315fm f263532a;

    public /* synthetic */ C94307fe(C94315fm fmVar) {
        this.f263532a = fmVar;
    }

    public final void onClick(View view) {
        String str;
        C94315fm fmVar = this.f263532a;
        if (fmVar.f263541c.a != 1) {
            HeaderLayout headerLayout = (HeaderLayout) fmVar.f263540b.findViewById(R.id.opa_header);
            boolean d = fmVar.f263548j.d();
            String str2 = BuildConfig.FLAVOR;
            if (d) {
                Resources resources = fmVar.f263540b.getResources();
                Object[] objArr = new Object[2];
                objArr[0] = fmVar.f263548j.b();
                ei eiVar = fmVar.f263543e;
                bh bhVar = fmVar.f263541c;
                objArr[1] = eiVar.d(bhVar.a == 2 ? (String) bhVar.b : str2);
                str = resources.getString(R.string.structure_level_face_match_consent_header_title_kid, objArr);
            } else {
                Resources resources2 = fmVar.f263540b.getResources();
                Object[] objArr2 = new Object[1];
                ei eiVar2 = fmVar.f263543e;
                bh bhVar2 = fmVar.f263541c;
                objArr2[0] = eiVar2.d(bhVar2.a == 2 ? (String) bhVar2.b : str2);
                str = resources2.getString(R.string.structure_level_face_match_consent_header_title, objArr2);
            }
            C84018m.m133908c(headerLayout.f228718a, str, TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.structure_level_face_match_consent_header_description, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            fmVar.f263540b.findViewById(R.id.value_prop_animation).setVisibility(8);
            C83983ah.m133842b(fmVar.f263540b, new C94311fi(fmVar)).mo77412a();
            fmVar.f263540b.findViewById(R.id.consent_details_section_header).d();
            if (fmVar.f263548j.d()) {
                OpaPageLayout opaPageLayout = fmVar.f263540b;
                String b = fmVar.f263548j.b();
                String c = fmVar.f263548j.c();
                opaPageLayout.findViewById(R.id.consent_details_identification_item).o(C5114a.m13988b(Locale.getDefault(), opaPageLayout.getResources().getString(R.string.structure_level_face_match_consent_identification_item_text_kid, new Object[]{b}), "GENDER", c));
                opaPageLayout.findViewById(R.id.consent_details_retention_item).o(opaPageLayout.getResources().getString(R.string.structure_level_face_match_consent_retention_item_text_kid, new Object[]{b}));
                opaPageLayout.findViewById(R.id.consent_details_forewarning_item).o(C5114a.m13988b(Locale.getDefault(), opaPageLayout.getResources().getString(R.string.structure_level_face_match_consent_forewarning_item_text_kid, new Object[]{b}), "GENDER", c));
                opaPageLayout.findViewById(R.id.consent_device_list_section_header).c(opaPageLayout.getResources().getString(R.string.structure_level_face_match_consent_device_list_section_header_kid, new Object[]{fmVar.f263548j.b()}));
            }
            LinearLayout linearLayout = (LinearLayout) fmVar.f263540b.findViewById(R.id.consent_device_list);
            linearLayout.addView(fmVar.mo88453g(fmVar.f263540b.getResources().getString(R.string.structure_level_face_match_consent_future_devices_hint), R.drawable.quantum_ic_google_home_devices_grey600_24));
            ei eiVar3 = fmVar.f263543e;
            bh bhVar3 = fmVar.f263541c;
            if (bhVar3.a == 2) {
                str2 = (String) bhVar3.b;
            }
            for (C72879n nVar : eiVar3.j(str2, 2)) {
                linearLayout.addView(fmVar.mo88453g(nVar.mo64575c(), nVar.mo64573a()));
            }
            fmVar.f263540b.findViewById(R.id.consent_screen_views_container).setVisibility(0);
            if (fmVar.f263546h.mo85090c()) {
                C90743b.m148214a(headerLayout.f228718a, 500);
                return;
            }
            return;
        }
        fmVar.f263542d = 1;
        fmVar.mo77318iT().mo77312a();
    }
}
