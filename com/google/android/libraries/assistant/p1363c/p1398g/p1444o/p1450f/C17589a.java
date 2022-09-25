package com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1450f;

import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import com.google.assistant.p3897e.p3929l.p3930a.C52794v;
import com.google.assistant.p3897e.p3929l.p3930a.C52796x;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.o.f.a */
/* compiled from: PG */
public final class C17589a {

    /* renamed from: a */
    private static final C59071e f50692a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.o.f.a");

    /* renamed from: b */
    private static final C58495hd f50693b;

    /* renamed from: c */
    private static final C58495hd f50694c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("VOICE_JMP", "en-us-x-jmp-local");
        gzVar.mo55429h("VOICE_TME", "en-us-x-tme-local");
        gzVar.mo55429h("VOICE_IOD", "en-us-x-iod-local");
        gzVar.mo55429h("VOICE_IOF", "en-us-x-iof-local");
        gzVar.mo55429h("VOICE_IOH", "en-us-x-ioh-local");
        gzVar.mo55429h("VOICE_IOJ", "en-us-x-ioj-local");
        gzVar.mo55429h("VOICE_IOP", "en-us-x-iop-local");
        gzVar.mo55429h("VOICE_FIS_US", "en-us-x-fis-local");
        gzVar.mo55429h("VOICE_AFH_US", "en-us-x-afh-local");
        C58495hd f = gzVar.mo55427f(false);
        f50693b = f;
        f50694c = f;
    }

    /* renamed from: a */
    public static void m34880a(TextToSpeech textToSpeech, C52796x xVar) {
        String str;
        Optional optional;
        int a = C52794v.m86703a(xVar.f138519a);
        if (a != 0) {
            switch (a) {
                case 1:
                    break;
                case 2:
                    str = "VOICE_HOL";
                    break;
                case 3:
                    str = "VOICE_JMP";
                    break;
                case 4:
                    str = "VOICE_TME";
                    break;
                case 5:
                    str = "VOICE_IOD";
                    break;
                case 6:
                    str = "VOICE_IOF";
                    break;
                case 7:
                    str = "VOICE_IOH";
                    break;
                case 8:
                    str = "VOICE_IOJ";
                    break;
                case 9:
                    str = "VOICE_IOP";
                    break;
                case 10:
                    str = "VOICE_CJL";
                    break;
                case 11:
                    str = "VOICE_FIS_US";
                    break;
                case 12:
                    str = "VOICE_AFH_US";
                    break;
                case 13:
                    str = "VOICE_IOL";
                    break;
                case 14:
                    str = "VOICE_IOG";
                    break;
                case 15:
                    str = "VOICE_MFK";
                    break;
                case 16:
                    str = "VOICE_JAA";
                    break;
                case 17:
                    str = "VOICE_KOA";
                    break;
                case 18:
                    str = "VOICE_NMP";
                    break;
                case 19:
                    str = "VOICE_FFP";
                    break;
                case 20:
                    str = "VOICE_FME";
                    break;
                case 21:
                    str = "VOICE_DFP";
                    break;
                case 22:
                    str = "VOICE_EMS";
                    break;
                case 23:
                    str = "VOICE_CXX";
                    break;
                case 24:
                    str = "VOICE_ENB";
                    break;
                case 25:
                    str = "VOICE_CFN";
                    break;
                case 26:
                    str = "VOICE_HIB";
                    break;
                case 27:
                    str = "VOICE_FIS";
                    break;
                case 28:
                    str = "VOICE_GBH";
                    break;
                case 29:
                    str = "VOICE_ITA";
                    break;
                case 30:
                    str = "VOICE_AMB";
                    break;
                case 31:
                    str = "VOICE_CFE";
                    break;
                case 32:
                    str = "VOICE_FRE";
                    break;
                case 33:
                    str = "VOICE_NFH";
                    break;
                case 34:
                    str = "VOICE_DEF";
                    break;
                case 35:
                    str = "VOICE_CIR";
                    break;
                case 36:
                    str = "VOICE_CTA";
                    break;
                case 37:
                    str = "VOICE_CTB";
                    break;
                case 38:
                    str = "VOICE_ENA";
                    break;
                case 39:
                    str = "VOICE_IDA";
                    break;
                case 40:
                    str = "VOICE_IDB";
                    break;
                case 41:
                    str = "VOICE_DEE";
                    break;
                case 42:
                    str = "VOICE_GBG";
                    break;
                case 43:
                    str = "VOICE_FRA";
                    break;
                case 44:
                    str = "VOICE_JAB";
                    break;
                case 45:
                    str = "VOICE_AFG";
                    break;
                case 46:
                    str = "VOICE_MMW";
                    break;
                case 47:
                    str = "VOICE_JFL";
                    break;
                case 48:
                    str = "VOICE_DMV";
                    break;
                case 49:
                    str = "VOICE_OFG";
                    break;
                case 50:
                    str = "VOICE_AMD";
                    break;
                case 51:
                    str = "VOICE_NHG";
                    break;
                case 52:
                    str = "VOICE_EEA";
                    break;
                case 53:
                    str = "VOICE_EEB";
                    break;
                case 54:
                    str = "VOICE_YUA";
                    break;
                case 55:
                    str = "VOICE_YUB";
                    break;
                case 56:
                    str = "VOICE_ARA";
                    break;
                case 57:
                    str = "VOICE_ARB";
                    break;
                case 58:
                    str = "VOICE_ESA";
                    break;
                case 59:
                    str = "VOICE_ESB";
                    break;
                case 60:
                    str = "VOICE_PAA";
                    break;
                case 61:
                    str = "VOICE_PAB";
                    break;
                case 62:
                    str = "VOICE_IFM";
                    break;
                case 63:
                    str = "VOICE_TMM";
                    break;
                case 64:
                    str = "VOICE_RUA";
                    break;
                case 65:
                    str = "VOICE_RUB";
                    break;
                case 66:
                    str = "VOICE_VIA";
                    break;
                case 67:
                    str = "VOICE_VIB";
                    break;
                case 68:
                    str = "VOICE_CCA";
                    break;
                case 69:
                    str = "VOICE_CCB";
                    break;
                case 70:
                    str = "VOICE_SFB";
                    break;
                case 71:
                    str = "VOICE_BEA";
                    break;
                case 72:
                    str = "VOICE_BEB";
                    break;
                case 73:
                    str = "VOICE_PFS";
                    break;
                case 74:
                    str = "VOICE_PTX";
                    break;
                case 75:
                    str = "VOICE_MRB";
                    break;
                case 76:
                    str = "VOICE_MRM";
                    break;
                case 77:
                    str = "VOICE_AFH";
                    break;
                case 78:
                    str = "VOICE_AMH";
                    break;
                case 79:
                    str = "VOICE_MRE";
                    break;
                case 80:
                    str = "VOICE_TAA";
                    break;
                case 81:
                    str = "VOICE_TAB";
                    break;
                case 82:
                    str = "VOICE_VFR";
                    break;
                case 83:
                    str = "VOICE_VMR";
                    break;
                case 84:
                    str = "VOICE_TAF";
                    break;
                case 85:
                    str = "VOICE_MRF";
                    break;
                case 86:
                    str = "VOICE_AKA";
                    break;
                case 87:
                    str = "VOICE_AKB";
                    break;
                case 88:
                    str = "VOICE_AKC";
                    break;
                case 89:
                    str = "VOICE_AKD";
                    break;
                case 90:
                    str = "VOICE_TEF";
                    break;
                case 91:
                    str = "VOICE_TEA";
                    break;
                case 92:
                    str = "VOICE_TEB";
                    break;
                case 93:
                    str = "VOICE_TEC";
                    break;
                case 94:
                    str = "VOICE_TED";
                    break;
                case 95:
                    str = "VOICE_MOL";
                    break;
                case 96:
                    str = "VOICE_THA";
                    break;
                case 97:
                    str = "VOICE_THB";
                    break;
                case 98:
                    str = "VOICE_THC";
                    break;
                case 99:
                    str = "VOICE_THD";
                    break;
                case 100:
                    str = "VOICE_MLF";
                    break;
                case 101:
                    str = "VOICE_MLA";
                    break;
                case 102:
                    str = "VOICE_MLB";
                    break;
                case 103:
                    str = "VOICE_MLC";
                    break;
                default:
                    str = "VOICE_MLE";
                    break;
            }
        }
        str = "DEFAULT_NO_PREFERENCE";
        C58495hd hdVar = f50694c;
        if (!hdVar.containsKey(str)) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of((String) hdVar.get(str));
        }
        if (optional.isEmpty()) {
            Optional.empty();
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        m34881b(textToSpeech, (String) optional.get());
    }

    /* renamed from: b */
    public static void m34881b(TextToSpeech textToSpeech, String str) {
        Optional.empty();
        for (Voice next : textToSpeech.getVoices()) {
            if (next.getName().equals(str)) {
                C59071e eVar = f50692a;
                C59104x b = eVar.mo56224b();
                b.mo56378ag(C58975e.f156826a, "TTS");
                ((C59052c) ((C59052c) b).mo56372aa(42813)).mo56389s("Setting the preferred Assistant voice: %s", str);
                if (textToSpeech.setVoice(next) == -1) {
                    C59104x d = eVar.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "TTS");
                    ((C59052c) ((C59052c) d).mo56372aa(42814)).mo56389s("Failed to set Assistant voice: %s", str);
                    return;
                }
                Optional.m71637of(next);
                return;
            }
        }
    }
}
