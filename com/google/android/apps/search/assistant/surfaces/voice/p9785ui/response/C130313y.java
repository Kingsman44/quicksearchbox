package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d.C130235b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d.C130244k;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52149ha;
import com.google.assistant.p3897e.p3921j.C52150hb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.y */
/* compiled from: PG */
public final /* synthetic */ class C130313y implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130235b f357184a;

    public /* synthetic */ C130313y(C130235b bVar) {
        this.f357184a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        C130235b bVar = this.f357184a;
        C52150hb hbVar = (C52150hb) obj;
        bVar.getClass();
        C130244k a = bVar.mo17754z();
        View findViewById = a.f357066b.requireView().findViewById(R.id.assistant_feedback_survey_floater);
        if (hbVar == null || (hbVar.f136845a & 512) == 0) {
            C59104x d = C130244k.f357063a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FeedbackFragment");
            ((C59052c) ((C59052c) d).mo56372aa(38788)).mo56386p("Feedback args not present.");
        } else {
            C52149ha haVar = hbVar.f136848d;
            if (haVar == null) {
                haVar = C52149ha.f136834h;
            }
            if ((haVar.f136836a & 1) != 0) {
                ((TextView) findViewById.findViewById(R.id.assistant_txt_header)).setText(haVar.f136837b);
                ((TextView) findViewById.findViewById(R.id.assistant_desc_very_satisfied)).setText(haVar.f136839d);
                ((TextView) findViewById.findViewById(R.id.assistant_desc_very_dissatisfied)).setText(haVar.f136840e);
                a.f357067c = haVar.f136838c;
                if ((haVar.f136836a & 32) != 0) {
                    findViewById.findViewById(R.id.assistant_user_consent_divider).setVisibility(0);
                    TextView textView = (TextView) findViewById.findViewById(R.id.assistant_user_consent);
                    textView.setText(Html.fromHtml(haVar.f136842g));
                    textView.setVisibility(0);
                } else {
                    C58976aa aaVar = C58975e.f156826a;
                }
                findViewById.setVisibility(0);
            } else {
                C59104x d2 = C130244k.f357063a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "FeedbackFragment");
                ((C59052c) ((C59052c) d2).mo56372aa(38790)).mo56386p("Feedback args have no question.");
            }
        }
        return C127406c.f350821b;
    }
}
