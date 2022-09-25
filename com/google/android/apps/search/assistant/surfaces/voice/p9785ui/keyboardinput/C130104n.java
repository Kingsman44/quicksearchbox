package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130306d;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.n */
/* compiled from: PG */
public final /* synthetic */ class C130104n implements C46852f {

    /* renamed from: a */
    public final /* synthetic */ C130109s f356742a;

    public /* synthetic */ C130104n(C130109s sVar) {
        this.f356742a = sVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final void mo20961j(Object obj) {
        C130109s sVar = this.f356742a;
        C51656n nVar = (C51656n) obj;
        if (!sVar.f356762l) {
            C59104x d = C130109s.f356751a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "KeyboardInputFragment");
            ((C59052c) ((C59052c) d).mo56372aa(38685)).mo56386p("#highlightTranscription: Keyboard correction is not enabled.");
        } else if (nVar.f134600b.isEmpty()) {
            C59104x d2 = C130109s.f356751a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "KeyboardInputFragment");
            ((C59052c) ((C59052c) d2).mo56372aa(38684)).mo56386p("#highlightTranscription: HighlightUserQueryArgs text is empty.");
        } else {
            EditText a = C130109s.m212407a(sVar.f356752b);
            if (TextUtils.isEmpty(a.getText())) {
                C59104x d3 = C130109s.f356751a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "KeyboardInputFragment");
                ((C59052c) ((C59052c) d3).mo56372aa(38683)).mo56386p("#highlightTranscription: Edit box text is empty.");
            } else if (!a.getText().toString().equals(nVar.f134600b)) {
                C59104x d4 = C130109s.f356751a.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "KeyboardInputFragment");
                ((C59052c) ((C59052c) d4).mo56372aa(38682)).mo56386p("#highlightTranscription: Edit box text does not match HighlightUserQuery argument.");
            } else {
                a.setText(C130306d.m212747a(nVar, true));
                sVar.mo109503h();
            }
        }
    }
}
