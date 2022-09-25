package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9847c;

import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65520d;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65524h;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65525i;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65529m;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65533q;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65537u;
import p5462h.C69677g;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.c.b */
/* compiled from: PG */
public final class C129754b {

    /* renamed from: a */
    final /* synthetic */ C65525i f356059a;

    public C129754b(C65525i iVar) {
        this.f356059a = iVar;
    }

    public final String toString() {
        C65537u uVar;
        C65529m mVar;
        C65533q qVar;
        C65520d dVar;
        C65525i iVar = this.f356059a;
        int i = iVar.f178099a;
        int a = C65524h.m96712a(i);
        int i2 = a - 1;
        if (a != 0) {
            switch (i2) {
                case 0:
                    return "page_loading_done";
                case 1:
                    if (i == 2) {
                        uVar = (C65537u) iVar.f178100b;
                    } else {
                        uVar = C65537u.f178116b;
                    }
                    C69664n.m101060f(uVar, "value.updateDone");
                    String str = uVar.f178118a;
                    C69664n.m101060f(str, "value.requestId");
                    return C129755c.m211836b("update_done", C129755c.m211837c(C69540x.m100944b(C129755c.m211836b("request_id", str))));
                case 2:
                    return "on_load";
                case 3:
                    if (i == 4) {
                        mVar = (C65529m) iVar.f178100b;
                    } else {
                        mVar = C65529m.f178103d;
                    }
                    C69664n.m101060f(mVar, "value.outputTts");
                    String str2 = mVar.f178105a;
                    C69664n.m101060f(str2, "value.requestId");
                    String str3 = mVar.f178107c;
                    C69664n.m101060f(str3, "value.tts");
                    return C129755c.m211836b("output_tts", C129755c.m211837c(C69540x.m100947e(C129755c.m211836b("request_id", str2), C129755c.m211836b("open_mic", String.valueOf(mVar.f178106b)), C129755c.m211836b("tts", str3))));
                case 4:
                    if (i == 5) {
                        qVar = (C65533q) iVar.f178100b;
                    } else {
                        qVar = C65533q.f178110b;
                    }
                    C69664n.m101060f(qVar, "value.sendTextQuery");
                    String str4 = qVar.f178112a;
                    C69664n.m101060f(str4, "value.query");
                    return C129755c.m211836b("send_text_query", C129755c.m211837c(C69540x.m100944b(C129755c.m211836b("query", str4))));
                case 5:
                    if (i == 6) {
                        dVar = (C65520d) iVar.f178100b;
                    } else {
                        dVar = C65520d.f178092b;
                    }
                    C69664n.m101060f(dVar, "value.exit");
                    String str5 = dVar.f178094a;
                    C69664n.m101060f(str5, "value.finalText");
                    return C129755c.m211837c(C69540x.m100944b(C129755c.m211836b("exit", C129755c.m211837c(C69540x.m100944b(C129755c.m211836b("final_text", str5))))));
                case 6:
                    return "exit_continuous_match_mode";
                case 7:
                    return "state_update";
                case 8:
                    return "TYPE_NOT_SET";
                default:
                    throw new C69677g();
            }
        } else {
            throw null;
        }
    }
}
