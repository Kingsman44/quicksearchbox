package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fi */
/* compiled from: PG */
public final /* synthetic */ class C105616fi implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105620fm f294678a;

    public /* synthetic */ C105616fi(C105620fm fmVar) {
        this.f294678a = fmVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105620fm fmVar = this.f294678a;
        Boolean bool = (Boolean) obj;
        if (fmVar.f294684c != null) {
            if (bool.booleanValue()) {
                fmVar.f294684c.setBackgroundResource(R.drawable.smile_scale_survey_container_background_dark);
                C105620fm.m175755h(fmVar.f294685d, C1878d.m5128a(fmVar.f294682a, R.color.smile_survey_headline_dark_theme));
                C105620fm.m175755h(fmVar.f294687f, C1878d.m5128a(fmVar.f294682a, R.color.smile_survey_body_dark_theme));
                C105620fm.m175755h(fmVar.f294686e, C1878d.m5128a(fmVar.f294682a, R.color.smile_survey_body_dark_theme));
                C105620fm.m175753e(fmVar.f294688g, C1878d.m5128a(fmVar.f294682a, R.color.smile_survey_body_dark_theme));
                return;
            }
            fmVar.f294684c.setBackgroundResource(R.drawable.smile_scale_survey_container_background);
            C105620fm.m175755h(fmVar.f294685d, C1878d.m5128a(fmVar.f294682a, R.color.smile_survey_headline));
            C105620fm.m175755h(fmVar.f294687f, C1878d.m5128a(fmVar.f294682a, R.color.smile_survey_body));
            C105620fm.m175755h(fmVar.f294686e, C1878d.m5128a(fmVar.f294682a, R.color.smile_survey_body));
            C105620fm.m175753e(fmVar.f294688g, C1878d.m5128a(fmVar.f294682a, R.color.smile_survey_body));
        }
    }
}
