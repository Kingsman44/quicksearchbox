package com.google.android.apps.gsa.shared.p6987ak;

import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.shared.ak.b */
/* compiled from: PG */
public final /* synthetic */ class C89188b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C89190d f241806a;

    public /* synthetic */ C89188b(C89190d dVar) {
        this.f241806a = dVar;
    }

    public final C60870cx apply(Object obj) {
        C89190d dVar = this.f241806a;
        if (!((Boolean) obj).booleanValue()) {
            dVar.f241810d.getString(R.string.assistant_hotword_proactive_feedback_notification_title);
            ((C89192f) dVar.f241809c.mo56107c()).mo83152b();
        } else {
            C59104x b = C89190d.f241807a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordFeedbackTngEntry");
            ((C59052c) ((C59052c) b).mo56372aa(11010)).mo56386p("#suggestFeedback: feedback was suppressed");
        }
        return C60866ct.f164955a;
    }
}
