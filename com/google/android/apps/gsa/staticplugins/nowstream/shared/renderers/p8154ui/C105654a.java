package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8154ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105416x;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105417y;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105618fk;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105620fm;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ui.a */
/* compiled from: PG */
public final /* synthetic */ class C105654a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105655b f294761a;

    /* renamed from: b */
    public final /* synthetic */ C105618fk f294762b;

    public /* synthetic */ C105654a(C105618fk fkVar, C105655b bVar) {
        this.f294762b = fkVar;
        this.f294761a = bVar;
    }

    public final void onClick(View view) {
        C105618fk fkVar = this.f294762b;
        C105655b bVar = this.f294761a;
        int i = RatingView.f294758b;
        C105620fm fmVar = fkVar.f294680a;
        ViewGroup viewGroup = fmVar.f294684c;
        if (!(viewGroup == null || viewGroup.getLayoutTransition() == null)) {
            fmVar.f294684c.getLayoutTransition().enableTransitionType(4);
        }
        C105620fm.m175757k(fmVar.f294688g, 8);
        C105620fm.m175757k(fmVar.f294686e, 8);
        C105620fm.m175757k(fmVar.f294687f, 8);
        C105620fm.m175754g(fmVar.f294685d, fmVar.f294682a.getString(R.string.survey_submitted_string));
        TextView textView = fmVar.f294685d;
        if (textView != null) {
            textView.announceForAccessibility(fmVar.f294682a.getString(R.string.survey_submitted_string));
        }
        C105416x xVar = fmVar.f294683b;
        Bundle bundle = new Bundle();
        C105655b.values();
        bundle.putInt("result", bVar.ordinal());
        ((C105417y) xVar).f294032a.mo28345s("logSurveyResult_com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ui.RatingView.OnSurveyResultListener.SurveyResult", "SmileScaleSurveyEventsDispatcher", bundle);
    }
}
