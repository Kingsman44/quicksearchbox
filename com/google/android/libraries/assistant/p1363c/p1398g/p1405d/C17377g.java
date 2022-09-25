package com.google.android.libraries.assistant.p1363c.p1398g.p1405d;

import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17465aa;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17467ac;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17469ae;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17471ag;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17473ai;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17475ak;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17481aq;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17484at;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17487aw;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17489ay;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17507j;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.common.p4537i.C59294s;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62972cr;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.g.d.g */
/* compiled from: PG */
public final class C17377g {
    /* renamed from: a */
    public static final String m34653a(C17508k kVar) {
        C69664n.m101061g(kVar, "clientInfo");
        int b = C17507j.m34793b(kVar.f50523a);
        String a = C17507j.m34792a(b);
        if (b != 0) {
            return a;
        }
        throw null;
    }

    /* renamed from: b */
    public static final String m34654b(C17522y yVar) {
        C69664n.m101061g(yVar, "playbackAttributes");
        int i = yVar.f50538b;
        return "{usage: " + i + "}";
    }

    /* renamed from: c */
    public static final String m34655c(C17477am amVar) {
        C69664n.m101061g(amVar, "sessionToken");
        return C59294s.m92132b().mo56760b(amVar.f50467b.mo59170I(C62972cr.f170009a)).toString();
    }

    /* renamed from: d */
    public static final String m34656d(C17485au auVar) {
        C69664n.m101061g(auVar, "request");
        StringBuilder sb = new StringBuilder();
        C17484at a = C17484at.m34786a(auVar.f50486d);
        if (a == null) {
            a = C17484at.UNKNOWN_MODE;
        }
        String name = a.name();
        sb.append("{mode: " + name + ", ");
        int i = auVar.f50484b;
        boolean z = false;
        char c = i != 0 ? i != 2 ? i != 3 ? i != 4 ? (char) 0 : 5 : 4 : 3 : 1;
        String str = c != 1 ? c != 3 ? c != 4 ? c != 5 ? "null" : "NLG_SERVICE_REQUEST" : "TTS_SERVICE_REQUEST" : "MARKUP_TEXT" : "SYNTHESISTYPE_NOT_SET";
        if (c != 0) {
            sb.append("type: " + str + ", ");
            long j = auVar.f50488f;
            sb.append("serverSynthesisProgressTimeoutMs: " + j + ", ");
            if ((auVar.f50483a & 64) != 0) {
                z = true;
            }
            sb.append("hasExtraS3Header: " + z + "}");
            return sb.toString();
        }
        throw null;
    }

    /* renamed from: f */
    public static final String m34658f(C17508k kVar, C17477am amVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        String str;
        String str2;
        int a;
        C17465aa aaVar;
        int a2;
        C17471ag agVar;
        C69664n.m101061g(kVar, "clientInfo");
        C69664n.m101061g(amVar, "sessionToken");
        C69664n.m101061g(cxVar, "synthesisStatus");
        C69664n.m101061g(cxVar2, "playbackStartStatus");
        C69664n.m101061g(cxVar3, "playbackEndStatus");
        StringBuilder sb = new StringBuilder();
        sb.append("sessionToken: " + m34655c(amVar) + ", ");
        sb.append("clientInfo: " + m34653a(kVar) + ", ");
        String str3 = "Not available";
        if (cxVar.isDone()) {
            Object r = C60856cj.m92909r(cxVar);
            C69664n.m101060f(r, "getDone(synthesisStatus)");
            str = m34657e((C17487aw) r);
        } else {
            str = str3;
        }
        sb.append("synthesisStatus: " + str + ", ");
        if (!cxVar2.isDone()) {
            str2 = str3;
        } else {
            int i = ((C17473ai) C60856cj.m92909r(cxVar2)).f50460b;
            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                C17473ai aiVar = (C17473ai) C60856cj.m92909r(cxVar2);
                String str4 = (aiVar.f50460b != 1 || (a2 = C17475ak.m34784a(((Integer) aiVar.f50461c).intValue())) == 0 || a2 == 1) ? "UNSPECIFIED_PLAYBACK_START_SUCCESS" : "PLAYBACK_READY_TO_START";
                str2 = "succeeded with reason " + str4 + ", timestamp: " + ((C17473ai) C60856cj.m92909r(cxVar2)).f50462d + "ms";
            } else if (i3 == 1) {
                C17473ai aiVar2 = (C17473ai) C60856cj.m92909r(cxVar2);
                if (aiVar2.f50460b == 2) {
                    agVar = C17471ag.m34782a(((Integer) aiVar2.f50461c).intValue());
                    if (agVar == null) {
                        agVar = C17471ag.UNSPECIFIED_PLAYBACK_START_FAILURE;
                    }
                } else {
                    agVar = C17471ag.UNSPECIFIED_PLAYBACK_START_FAILURE;
                }
                str2 = "failed with reason " + agVar.name() + ", timestamp: " + ((C17473ai) C60856cj.m92909r(cxVar2)).f50462d + "ms";
            } else if (i3 == 2) {
                str2 = "Not set";
            } else {
                throw new C69677g();
            }
        }
        sb.append("playbackStartStatus: " + str2 + ", ");
        if (cxVar3.isDone()) {
            int i4 = ((C17467ac) C60856cj.m92909r(cxVar3)).f50443b;
            int i5 = i4 != 0 ? i4 != 1 ? i4 != 2 ? 0 : 2 : 1 : 3;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            } else if (i6 == 0) {
                C17467ac acVar = (C17467ac) C60856cj.m92909r(cxVar3);
                String str5 = (acVar.f50443b != 1 || (a = C17469ae.m34781a(((Integer) acVar.f50444c).intValue())) == 0 || a == 1) ? "UNSPECIFIED_PLAYBACK_END_SUCCESS" : "PLAYBACK_ENDED";
                str3 = "succeeded with reason " + str5 + ", timestamp " + ((C17467ac) C60856cj.m92909r(cxVar3)).f50445d + "ms";
            } else if (i6 == 1) {
                C17467ac acVar2 = (C17467ac) C60856cj.m92909r(cxVar3);
                if (acVar2.f50443b == 2) {
                    aaVar = C17465aa.m34779a(((Integer) acVar2.f50444c).intValue());
                    if (aaVar == null) {
                        aaVar = C17465aa.UNSPECIFIED_PLAYBACK_END_FAILURE;
                    }
                } else {
                    aaVar = C17465aa.UNSPECIFIED_PLAYBACK_END_FAILURE;
                }
                str3 = "failed with reason " + aaVar.name() + ", timestamp " + ((C17467ac) C60856cj.m92909r(cxVar3)).f50445d + "ms";
            } else if (i6 == 2) {
                str3 = "Not set";
            } else {
                throw new C69677g();
            }
        }
        sb.append("playbackEndStatus: " + str3 + ".");
        return sb.toString();
    }

    /* renamed from: e */
    public static final String m34657e(C17487aw awVar) {
        int a;
        String str;
        int a2;
        C69664n.m101061g(awVar, "synthesisStatus");
        int i = awVar.f50493a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            return "succeeded with reason ".concat((i != 1 || (a = C17489ay.m34788a(((Integer) awVar.f50494b).intValue())) == 0 || a == 1) ? "UNSPECIFIED_SYNTHESIS_SUCCESS" : a != 2 ? a != 3 ? "S3_NETWORK_SYNTHESIS_DONE" : "ON_DEVICE_SYNTHESIS_DONE" : "PRE_SYNTHESIZED");
        } else if (i3 == 1) {
            if (i == 2 && (a2 = C17481aq.m34785a(((Integer) awVar.f50494b).intValue())) != 0) {
                if (a2 == 201) {
                    str = "SYNTHESIS_FAILED_DUE_TO_THROWABLE_IN_RESPONSE";
                } else if (a2 != 202) {
                    switch (a2) {
                        case 1:
                            break;
                        case 2:
                            str = "SYNTHESIS_MODE_NOT_IMPLEMENTED_YET";
                            break;
                        case 3:
                            str = "SYNTHESIS_ABORTED_DUE_TO_STALE_SESSION";
                            break;
                        case 4:
                            str = "SYNTHESIS_CLOSED_BY_CLIENT";
                            break;
                        case 5:
                            str = "SYNTHESIS_INVALID_REQUEST_MISSING_LOCALE";
                            break;
                        case 6:
                            str = "SYNTHESIS_FAILED_DUE_TO_THROWABLE_IN_GET_SYNTHESIS_STATUS_FUTURE";
                            break;
                        default:
                            switch (a2) {
                                case 101:
                                    str = "SYNTHESIS_FAILED_DUE_TO_TEXT_TO_SPEECH_ERROR";
                                    break;
                                case 102:
                                    str = "SYNTHESIS_FAILED_DUE_TO_TEXT_TO_SPEECH_INIT_FAILURE";
                                    break;
                                case 103:
                                    str = "SYNTHESIS_FAILED_CANNOT_CREATE_TEMP_FILE";
                                    break;
                                default:
                                    str = "null";
                                    break;
                            }
                    }
                } else {
                    str = "SYNTHESIS_FAILED_DUE_TO_TIMEOUT";
                }
                return "failed with reason ".concat(str);
            }
            str = "UNKNOWN_SYNTHESIS_FAILURE";
            return "failed with reason ".concat(str);
        } else if (i3 == 2) {
            return "Not set";
        } else {
            throw new C69677g();
        }
    }
}
