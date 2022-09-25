package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9847c;

import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65507aa;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65509ac;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65511ae;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65513ag;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65515ai;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65517ak;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65539w;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65541y;
import p5462h.C69677g;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.c.a */
/* compiled from: PG */
public final class C129753a {

    /* renamed from: a */
    final /* synthetic */ C65507aa f356058a;

    public C129753a(C65507aa aaVar) {
        this.f356058a = aaVar;
    }

    public final String toString() {
        int i;
        C65541y yVar;
        C65515ai aiVar;
        C65517ak akVar;
        C65511ae aeVar;
        C65513ag agVar;
        C65509ac acVar;
        C65539w wVar;
        C65507aa aaVar = this.f356058a;
        int i2 = aaVar.f178068a;
        char c = 5;
        char c2 = 4;
        switch (i2) {
            case 0:
                i = 8;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        int i3 = i - 1;
        if (i != 0) {
            String str = "UNKNOWN";
            String str2 = "UNRECOGNIZED";
            switch (i3) {
                case 0:
                    if (i2 == 1) {
                        yVar = (C65541y) aaVar.f178069b;
                    } else {
                        yVar = C65541y.f178123e;
                    }
                    C69664n.m101060f(yVar, "value.initializeWebApp");
                    String str3 = yVar.f178125a;
                    C69664n.m101060f(str3, "value.src");
                    String str4 = yVar.f178127c;
                    C69664n.m101060f(str4, "value.libUrl");
                    return C129755c.m211836b("initialize_web_app", C129755c.m211837c(C69540x.m100947e(C129755c.m211836b("src", str3), C129755c.m211836b("is_source_trusted", String.valueOf(yVar.f178126b)), C129755c.m211836b("lib_url", str4))));
                case 1:
                    if (i2 == 2) {
                        aiVar = (C65515ai) aaVar.f178069b;
                    } else {
                        aiVar = C65515ai.f178081c;
                    }
                    C69664n.m101060f(aiVar, "value.triggerUpdate");
                    String str5 = aiVar.f178083a;
                    C69664n.m101060f(str5, "value.requestId");
                    return C129755c.m211836b("trigger_update", C129755c.m211837c(C69540x.m100944b(C129755c.m211836b("request_id", str5))));
                case 2:
                    if (i2 == 3) {
                        akVar = (C65517ak) aaVar.f178069b;
                    } else {
                        akVar = C65517ak.f178085b;
                    }
                    C69664n.m101060f(akVar, "value.ttsMarkUpdate");
                    String str6 = akVar.f178087a;
                    C69664n.m101060f(str6, "value.markName");
                    return C129755c.m211836b("tts_mark_update", C129755c.m211837c(C69540x.m100944b(C129755c.m211836b("mark_name", str6))));
                case 3:
                    if (i2 == 4) {
                        aeVar = (C65511ae) aaVar.f178069b;
                    } else {
                        aeVar = C65511ae.f178074c;
                    }
                    C69664n.m101060f(aeVar, "value.outputTtsStatusUpdate");
                    String str7 = aeVar.f178076a;
                    C69664n.m101060f(str7, "value.requestId");
                    String str8 = aeVar.f178077b;
                    C69664n.m101060f(str8, "value.status");
                    return C129755c.m211836b("output_tts_status_update", C129755c.m211837c(C69540x.m100947e(C129755c.m211836b("request_id", str7), C129755c.m211836b("status", str8))));
                case 4:
                    if (i2 == 5) {
                        agVar = (C65513ag) aaVar.f178069b;
                    } else {
                        agVar = C65513ag.f178078b;
                    }
                    C69664n.m101060f(agVar, "value.sendTextQueryStatusUpdate");
                    int i4 = agVar.f178080a;
                    if (i4 == 0) {
                        c2 = 2;
                    } else if (i4 == 1) {
                        c2 = 3;
                    } else if (i4 != 2) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        str = str2;
                    } else if (c2 != 2) {
                        str = c2 != 3 ? "BLOCKED" : "SUCCESS";
                    }
                    return C129755c.m211836b("send_text_query_status_update", C129755c.m211837c(C69540x.m100944b(C129755c.m211836b("status", str))));
                case 5:
                    if (i2 == 6) {
                        acVar = (C65509ac) aaVar.f178069b;
                    } else {
                        acVar = C65509ac.f178070c;
                    }
                    C69664n.m101060f(acVar, "value.micModeUpdate");
                    String[] strArr = new String[2];
                    int i5 = acVar.f178072a;
                    char c3 = i5 != 0 ? i5 != 1 ? i5 != 2 ? (char) 0 : 4 : 3 : 2;
                    if (c3 == 0) {
                        str = str2;
                    } else if (c3 != 2) {
                        str = c3 != 3 ? "STREAMING" : "CONVERSATIONAL";
                    }
                    strArr[0] = C129755c.m211836b("mic_mode", str);
                    int i6 = acVar.f178073b;
                    if (i6 == 0) {
                        c = 2;
                    } else if (i6 == 1) {
                        c = 3;
                    } else if (i6 == 2) {
                        c = 4;
                    } else if (i6 != 3) {
                        c = 0;
                    }
                    if (c != 0) {
                        str2 = c != 2 ? c != 3 ? c != 4 ? "STREAMING_MODE_TIMEOUT" : "STREAMING_MODE_WEB_APP_EXIT" : "STREAMING_MODE_USER_EXIT" : "UNKNOWN_REASON";
                    }
                    strArr[1] = C129755c.m211836b("change_reason", str2);
                    return C129755c.m211836b("mic_mode_update", C129755c.m211837c(C69540x.m100947e(strArr)));
                case 6:
                    if (i2 == 7) {
                        wVar = (C65539w) aaVar.f178069b;
                    } else {
                        wVar = C65539w.f178119c;
                    }
                    C69664n.m101060f(wVar, "value.continuousMatchResult");
                    String str9 = wVar.f178121a;
                    C69664n.m101060f(str9, "value.matchSets");
                    return C129755c.m211836b("continuous_match_result", C129755c.m211837c(C69540x.m100947e(C129755c.m211836b("match_sets", str9), C129755c.m211836b("is_final", String.valueOf(wVar.f178122b)))));
                case 7:
                    return "TYPE_NOT_SET";
                default:
                    throw new C69677g();
            }
        } else {
            throw null;
        }
    }
}
