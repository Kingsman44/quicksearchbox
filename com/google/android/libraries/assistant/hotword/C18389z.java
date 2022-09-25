package com.google.android.libraries.assistant.hotword;

import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.hotword.z */
/* compiled from: PG */
public final /* synthetic */ class C18389z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C18328aa f52216a;

    /* renamed from: b */
    public final /* synthetic */ HotwordResult f52217b;

    public /* synthetic */ C18389z(C18328aa aaVar, HotwordResult hotwordResult) {
        this.f52216a = aaVar;
        this.f52217b = hotwordResult;
    }

    public final void run() {
        C18328aa aaVar = this.f52216a;
        HotwordResult hotwordResult = this.f52217b;
        C18332ae aeVar = aaVar.f51978g;
        ((C58970a) ((C58970a) C18339al.f51996a.mo56224b()).mo56372aa(47230)).mo56386p("Hotword Detected.");
        C18339al alVar = aeVar.f51987a;
        boolean z = alVar.f52016r;
        if (!z && hotwordResult == null) {
            C60870cx cxVar = alVar.f52011k;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
        } else if (!z || hotwordResult == null) {
            ((C58970a) ((C58970a) C18339al.f51996a.mo56225c()).mo56372aa(47231)).mo56355H("Invalid hotword result %s, useSodaProcessedAudioForQuery = %s", hotwordResult, aeVar.f51987a.f52016r);
            aeVar.f51987a.f52018t.mo103906d();
        } else {
            ((C58970a) ((C58970a) C18339al.f51996a.mo56224b()).mo56372aa(47232)).mo56389s("Hotword Result %s", hotwordResult);
            aeVar.f51987a.f52018t.mo103907e(hotwordResult);
        }
    }
}
