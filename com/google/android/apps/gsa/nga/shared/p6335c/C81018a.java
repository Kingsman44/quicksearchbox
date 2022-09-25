package com.google.android.apps.gsa.nga.shared.p6335c;

import com.google.assistant.p3897e.p3917i.p3918a.C51233ac;
import com.google.assistant.p3897e.p3917i.p3918a.C51239ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.assistant.p3897e.p3917i.p3918a.C51411gs;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import com.google.assistant.p3897e.p3917i.p3918a.C51481jh;
import com.google.assistant.p3897e.p3917i.p3918a.C51485jl;
import com.google.assistant.p3897e.p3917i.p3918a.C51491jr;
import com.google.assistant.p3897e.p3917i.p3918a.C51528la;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.assistant.p3897e.p3917i.p3918a.C51581n;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52092ey;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.c.a */
/* compiled from: PG */
public final class C81018a {

    /* renamed from: a */
    public static final C81018a f222062a = new C81018a("asst.display.context.params", "assistant.api.params.DisplayContextParams", C51379fn.f133814i.getParserForType(), C51379fn.f133814i);

    /* renamed from: b */
    public static final C81018a f222063b = new C81018a("asst.device.capabilities", "assistant.api.DeviceCapabilities", C51715bm.f135662t.getParserForType(), C51715bm.f135662t);

    /* renamed from: c */
    public static final C81018a f222064c = new C81018a("asst.device.properties", "assistant.api.params.DeviceProperties", C51334dw.f133658ab.getParserForType(), C51334dw.f133658ab);

    /* renamed from: d */
    public static final C81018a f222065d = new C81018a("media", "assistant.api.params.MediaParams", C51450id.f133992h.getParserForType(), C51450id.f133992h);

    /* renamed from: e */
    public static final C81018a f222066e = new C81018a("asst.communication.message", "assistant.api.params.MessageParams", C51460in.f134052e.getParserForType(), C51460in.f134052e);

    /* renamed from: f */
    public static final C81018a f222067f = new C81018a("asst.nga_params", "assistant.api.params.NgaParam", C51485jl.f134149c.getParserForType(), C51485jl.f134149c);

    /* renamed from: g */
    public static final C81018a f222068g = new C81018a("asst.conversation_ongoing_state_params", "assistant.api.params.ConversationOngoingStateParam", C51481jh.f134137e.getParserForType(), C51481jh.f134137e);

    /* renamed from: h */
    public static final C81018a f222069h = new C81018a("asst.request.logging.params", "assistant.api.params.RequestLoggingParams", C51536li.f134316k.getParserForType(), C51536li.f134316k);

    /* renamed from: i */
    public static final C81018a f222070i = new C81018a("asst.response.logging.params", "assistant.api.params.ResponseLoggingParams", C51544lq.f134342j.getParserForType(), C51544lq.f134342j);

    /* renamed from: j */
    public static final C81018a f222071j = new C81018a("app_actions_context_params", "assistant.api.params.AppActionsContextParams", C51581n.f134439b.getParserForType(), C51581n.f134439b);

    /* renamed from: k */
    public static final C81018a f222072k = new C81018a("privacy_settings_params", "assistant.api.params.PrivacySettingsParams", C51491jr.f134160c.getParserForType(), C51491jr.f134160c);

    /* renamed from: l */
    public static final C81018a f222073l = new C81018a("asst.assistant.sdk.device.params", "assistant.api.params.AssistantSdkDeviceParams", C51239ai.f133399g.getParserForType(), C51239ai.f133399g);

    /* renamed from: m */
    private static final C59071e f222074m = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.c.a");

    /* renamed from: n */
    private final String f222075n;

    /* renamed from: o */
    private final String f222076o;

    /* renamed from: p */
    private final C63010eb f222077p;

    /* renamed from: q */
    private final MessageLite f222078q;

    static {
        C51411gs.f133914b.getParserForType();
        C51274bq.f133487i.getParserForType();
        C51233ac.f133389b.getParserForType();
        C51528la.f134281a.getParserForType();
    }

    private C81018a(String str, String str2, C63010eb ebVar, MessageLite messageLite) {
        this.f222075n = str;
        this.f222076o = str2;
        this.f222077p = ebVar;
        this.f222078q = messageLite;
    }

    /* renamed from: a */
    public final MessageLite mo74801a(C52092ey eyVar) {
        return (MessageLite) mo74802b(eyVar).orElse(this.f222078q);
    }

    /* renamed from: b */
    public final Optional mo74802b(C52092ey eyVar) {
        for (C52232kc kcVar : eyVar.mo53788a()) {
            if (kcVar.f137065b.equals(this.f222075n)) {
                try {
                    C63010eb ebVar = this.f222077p;
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return Optional.m71637of((MessageLite) ebVar.mo59008g(kaVar.f137061c));
                } catch (C62974ct unused) {
                    ((C59052c) ((C59052c) f222074m.mo56226d()).mo56372aa(5799)).mo56389s("Unable to parse value of param %s, using default value", this.f222075n);
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: c */
    public final void mo74803c(C52090ew ewVar, C58817ah ahVar) {
        MessageLite messageLite = (MessageLite) ahVar.apply(mo74801a(ewVar));
        for (int i = 0; i < ((C52091ex) ewVar.instance).f136712a.size(); i++) {
            C52232kc b = ewVar.mo53789b(i);
            if (b.f137065b.equals(this.f222075n)) {
                C52231kb kbVar = (C52231kb) b.toBuilder();
                C52230ka kaVar = b.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                C52228jz jzVar = (C52228jz) kaVar.toBuilder();
                C63088z byteString = messageLite.toByteString();
                jzVar.copyOnWrite();
                C52230ka kaVar2 = (C52230ka) jzVar.instance;
                byteString.getClass();
                kaVar2.f137059a |= 2;
                kaVar2.f137061c = byteString;
                kbVar.copyOnWrite();
                C52232kc kcVar = (C52232kc) kbVar.instance;
                C52230ka kaVar3 = (C52230ka) jzVar.build();
                kaVar3.getClass();
                kcVar.f137066c = kaVar3;
                kcVar.f137064a |= 2;
                ewVar.mo53794g(i, kbVar);
                return;
            }
        }
        C52231kb kbVar2 = (C52231kb) C52232kc.f137062d.createBuilder();
        String str = this.f222075n;
        kbVar2.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar2.instance;
        str.getClass();
        kcVar2.f137064a |= 1;
        kcVar2.f137065b = str;
        C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
        String str2 = this.f222076o;
        jzVar2.copyOnWrite();
        C52230ka kaVar4 = (C52230ka) jzVar2.instance;
        str2.getClass();
        kaVar4.f137059a |= 1;
        kaVar4.f137060b = str2;
        C63088z byteString2 = messageLite.toByteString();
        jzVar2.copyOnWrite();
        C52230ka kaVar5 = (C52230ka) jzVar2.instance;
        byteString2.getClass();
        kaVar5.f137059a |= 2;
        kaVar5.f137061c = byteString2;
        kbVar2.copyOnWrite();
        C52232kc kcVar3 = (C52232kc) kbVar2.instance;
        C52230ka kaVar6 = (C52230ka) jzVar2.build();
        kaVar6.getClass();
        kcVar3.f137066c = kaVar6;
        kcVar3.f137064a |= 2;
        ewVar.mo53791d(kbVar2);
    }
}
