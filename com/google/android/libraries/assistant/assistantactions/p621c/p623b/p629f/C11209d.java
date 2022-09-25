package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f;

import android.text.TextUtils;
import com.google.android.libraries.assistant.assistantactions.p619a.C11053d;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51115gy;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;
import com.google.assistant.p3897e.p3902c.p3907c.C51138hu;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3917i.p3918a.C51384fs;
import com.google.assistant.p3897e.p3917i.p3918a.C51387fv;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.assistant.p3897e.p3921j.aor;
import com.google.assistant.p3897e.p3921j.aos;
import com.google.assistant.p3897e.p3921j.apn;
import com.google.assistant.p3897e.p3921j.p3926e.C51934en;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51942ev;
import com.google.assistant.p3897e.p3921j.p3926e.C51943ew;
import com.google.assistant.p3897e.p3921j.p3926e.C51944ex;
import com.google.assistant.p3897e.p3921j.p3926e.C51948fa;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.assistant.p3897e.p3921j.p3926e.C52056o;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.f.d */
/* compiled from: PG */
public final class C11209d {
    /* renamed from: a */
    public static C51809dy m26571a(C52289mf mfVar) {
        return m26575e("call.CALL", "call_client_op_args", "assistant.api.client_op.CallArgs", mfVar);
    }

    /* renamed from: b */
    public static C51809dy m26572b(String str) {
        return m26573c(str, C51950fc.FORM_UI_THEME_DEFAULT, C51936ep.DEFAULT);
    }

    /* renamed from: c */
    public static C51809dy m26573c(String str, C51950fc fcVar, C51936ep epVar) {
        C51941eu euVar;
        if (fcVar == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
            C51937eq eqVar = (C51937eq) C51941eu.f136271l.createBuilder();
            C51115gy gyVar = (C51115gy) C51119hb.f133058f.createBuilder();
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            dcVar.f132815a |= 2;
            dcVar.f132817c = "https://www.gstatic.com/images/icons/material/system/2x/cancel_grey600_24dp.png";
            gyVar.copyOnWrite();
            C51119hb hbVar = (C51119hb) gyVar.instance;
            C51012dc dcVar2 = (C51012dc) dbVar.build();
            dcVar2.getClass();
            hbVar.f133063d = dcVar2;
            hbVar.f133060a |= 4;
            gyVar.copyOnWrite();
            C51119hb hbVar2 = (C51119hb) gyVar.instance;
            str.getClass();
            hbVar2.f133060a |= 1;
            hbVar2.f133061b = str;
            C51119hb hbVar3 = (C51119hb) gyVar.build();
            eqVar.copyOnWrite();
            C51941eu euVar2 = (C51941eu) eqVar.instance;
            hbVar3.getClass();
            euVar2.f136278f = hbVar3;
            euVar2.f136277e = 26;
            euVar = (C51941eu) eqVar.build();
        } else {
            C51937eq eqVar2 = (C51937eq) C51941eu.f136271l.createBuilder();
            C51138hu huVar = (C51138hu) C51141hx.f133119h.createBuilder();
            C51011db dbVar2 = (C51011db) C51012dc.f132813k.createBuilder();
            dbVar2.copyOnWrite();
            C51012dc dcVar3 = (C51012dc) dbVar2.instance;
            dcVar3.f132815a |= 2;
            dcVar3.f132817c = "https://www.gstatic.com/images/icons/material/system/2x/cancel_grey600_24dp.png";
            huVar.copyOnWrite();
            C51141hx hxVar = (C51141hx) huVar.instance;
            C51012dc dcVar4 = (C51012dc) dbVar2.build();
            dcVar4.getClass();
            hxVar.f133126f = dcVar4;
            hxVar.f133121a |= 16;
            huVar.copyOnWrite();
            C51141hx hxVar2 = (C51141hx) huVar.instance;
            str.getClass();
            hxVar2.f133122b = 1;
            hxVar2.f133123c = str;
            eqVar2.copyOnWrite();
            C51941eu euVar3 = (C51941eu) eqVar2.instance;
            C51141hx hxVar3 = (C51141hx) huVar.build();
            hxVar3.getClass();
            euVar3.f136278f = hxVar3;
            euVar3.f136277e = 3;
            euVar = (C51941eu) eqVar2.build();
        }
        C51934en enVar = (C51934en) C51953ff.f136315l.createBuilder();
        C51944ex exVar = (C51944ex) C51948fa.f136294i.createBuilder();
        boolean z = fcVar == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY;
        exVar.copyOnWrite();
        C51948fa faVar = (C51948fa) exVar.instance;
        faVar.f136296a |= 16;
        faVar.f136301f = z;
        C51942ev evVar = (C51942ev) C51943ew.f136285f.createBuilder();
        evVar.mo53759b(euVar);
        exVar.mo53762a(evVar);
        enVar.mo53754a(exVar);
        enVar.copyOnWrite();
        C51953ff ffVar = (C51953ff) enVar.instance;
        ffVar.f136317a |= 16;
        ffVar.f136322f = true;
        enVar.copyOnWrite();
        C51953ff ffVar2 = (C51953ff) enVar.instance;
        ffVar2.f136324h = fcVar.f136309c;
        ffVar2.f136317a |= 64;
        enVar.copyOnWrite();
        C51953ff ffVar3 = (C51953ff) enVar.instance;
        ffVar3.f136323g = epVar.f136236u;
        ffVar3.f136317a |= 32;
        return m26580j((C51953ff) enVar.build());
    }

    /* renamed from: d */
    public static C51809dy m26574d(String str, C51807dw dwVar) {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = str;
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: e */
    public static C51809dy m26575e(String str, String str2, String str3, MessageLite messageLite) {
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        dvVar.mo53733c(m26587q(str2, str3, messageLite));
        return m26574d(str, (C51807dw) dvVar.build());
    }

    /* renamed from: f */
    public static C51809dy m26576f() {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "core.DISMISS_ASSISTANT";
        C51807dw dwVar = C51807dw.f135930b;
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: g */
    public static C51809dy m26577g(C52056o oVar) {
        return m26575e("ui.EXIT_NATIVE_FORM", "exit_native_form_args", "assistant.api.client_op.ui.ExitNativeFormArgs", oVar);
    }

    /* renamed from: h */
    public static C51809dy m26578h(C52654zt ztVar) {
        return m26575e("mic.UPDATE", "mic_behavior_args", "assistant.api.client_op.MicBehaviorArgs", ztVar);
    }

    /* renamed from: i */
    public static C51809dy m26579i(C52321nk nkVar) {
        return m26575e("chat_message.SEND", "chat_args", "assistant.api.client_op.ChatMessageArgs", nkVar);
    }

    /* renamed from: j */
    public static C51809dy m26580j(C51953ff ffVar) {
        return m26575e("ui.SHOW_NATIVE_FORM", "show_native_form_args", "assistant.api.client_op.ui.ShowNativeFormArgs", ffVar);
    }

    /* renamed from: k */
    public static C51809dy m26581k(C51953ff ffVar, C11053d dVar) {
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        dvVar.mo53733c(m26587q("show_native_form_field_update_args", "java.com.google.android.libraries.assistant.assistantactions.api.ShowNativeFormFieldUpdateArgs", dVar));
        dvVar.mo53733c(m26587q("show_native_form_args", "assistant.api.client_op.ui.ShowNativeFormArgs", ffVar));
        return m26574d("ui.SHOW_NATIVE_FORM", (C51807dw) dvVar.build());
    }

    /* renamed from: l */
    public static C51809dy m26582l(C52003hb hbVar) {
        return m26575e("ui.SHOW_TEXT", "show_text_args", "assistant.api.client_op.ShowTextArgs", hbVar);
    }

    /* renamed from: m */
    public static C51809dy m26583m(C64735n nVar) {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "text.START_DICTATION";
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "start_dictation_args";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.text.StartDictationArgs";
        C63088z byteString = nVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        dvVar.mo53733c((C52232kc) kbVar.build());
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: n */
    public static C51809dy m26584n(String str, String str2) {
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        str.getClass();
        ahVar.f182622a |= 1;
        ahVar.f182625d = str;
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        ahVar2.f182622a |= 8192;
        ahVar2.f182632k = str2;
        aor aor = (aor) aos.f135519e.createBuilder();
        aor.copyOnWrite();
        aos aos = (aos) aor.instance;
        str.getClass();
        aos.f135521a |= 1;
        aos.f135522b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "speech.s3.TtsServiceRequest";
        C63088z byteString = ((C67190ah) aeVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        aor.copyOnWrite();
        aos aos2 = (aos) aor.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        aos2.f135523c = kaVar3;
        aos2.f135521a |= 2;
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "tts.OUTPUT";
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "speech_output_args";
        C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar2.copyOnWrite();
        C52230ka kaVar4 = (C52230ka) jzVar2.instance;
        kaVar4.f137059a |= 1;
        kaVar4.f137060b = "assistant.api.client_op.SpeechOutputArgs";
        C63088z byteString2 = ((aos) aor.build()).toByteString();
        jzVar2.copyOnWrite();
        C52230ka kaVar5 = (C52230ka) jzVar2.instance;
        byteString2.getClass();
        kaVar5.f137059a |= 2;
        kaVar5.f137061c = byteString2;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar6 = (C52230ka) jzVar2.build();
        kaVar6.getClass();
        kcVar2.f137066c = kaVar6;
        kcVar2.f137064a |= 2;
        dvVar.mo53732b(kbVar);
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: o */
    public static C51809dy m26585o(apn apn) {
        return m26575e("video_call.CALL", "video_call_args", "assistant.api.client_op.VideoCallArgs", apn);
    }

    /* renamed from: p */
    public static C51809dy m26586p(C51809dy dyVar, C51950fc fcVar) {
        if (fcVar != C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
            return dyVar;
        }
        C51808dx dxVar = (C51808dx) dyVar.toBuilder();
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C51806dv dvVar = (C51806dv) dwVar.toBuilder();
        C51384fs fsVar = (C51384fs) C51387fv.f133828e.createBuilder();
        fsVar.copyOnWrite();
        C51387fv fvVar = (C51387fv) fsVar.instance;
        fvVar.f133831b = 2;
        fvVar.f133830a |= 1;
        fsVar.copyOnWrite();
        C51387fv fvVar2 = (C51387fv) fsVar.instance;
        fvVar2.f133832c = 2;
        fvVar2.f133830a = 2 | fvVar2.f133830a;
        dvVar.mo53733c(m26587q("show_drl_visual_treatment_args", "assistant.api.params.DrlVisualTreatmentParams", fsVar.build()));
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar2 = (C51807dw) dvVar.build();
        dwVar2.getClass();
        dyVar2.f135938d = dwVar2;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: q */
    public static C52232kc m26587q(String str, String str2, MessageLite messageLite) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = str2;
        C63088z byteString = messageLite.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }

    /* renamed from: r */
    public static String m26588r(Locale locale) {
        StringBuilder sb = new StringBuilder(locale.getLanguage().toLowerCase(Locale.US));
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country.toUpperCase(Locale.US));
        }
        return sb.toString();
    }
}
