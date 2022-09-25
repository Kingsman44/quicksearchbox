package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.view.View;
import android.widget.RadioGroup;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.l */
/* compiled from: PG */
public final /* synthetic */ class C97610l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C97620v f272645a;

    public /* synthetic */ C97610l(C97620v vVar) {
        this.f272645a = vVar;
    }

    public final void onClick(View view) {
        C97620v vVar = this.f272645a;
        vVar.f272659e.setClickable(false);
        vVar.f272660f.setClickable(false);
        int checkedRadioButtonId = ((RadioGroup) vVar.f54539k.mo24854d(R.id.notification_feedback_rating_group)).getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.notification_feedback_rating_1) {
            vVar.f272661g.mo85235a(new C97617s(vVar));
        } else if (checkedRadioButtonId == R.id.notification_feedback_rating_2) {
            vVar.f272661g.mo85235a(new C97618t(vVar));
        } else if (checkedRadioButtonId == R.id.notification_feedback_rating_3) {
            vVar.f272661g.mo85235a(new C97619u(vVar));
        } else if (checkedRadioButtonId == R.id.notification_feedback_rating_4) {
            vVar.f272661g.mo85235a(new C97606h(vVar));
        } else {
            C59104x d = C97620v.f272655a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifFeedbackActy");
            ((C59052c) ((C59052c) d).mo56372aa(22452)).mo56386p("UNKNOWN_SELECTION");
            int i = C90755l.f253831a;
        }
        vVar.f272661g.mo85235a(new C97607i(vVar));
    }
}
