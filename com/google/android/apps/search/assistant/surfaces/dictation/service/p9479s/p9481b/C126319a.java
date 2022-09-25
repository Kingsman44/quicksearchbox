package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9481b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125035a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125036b;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51673af;
import com.google.assistant.p3897e.p3921j.C51674ag;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3931f.p3939c.C52839p;
import com.google.assistant.p3931f.p3939c.C52845v;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64722a;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64723b;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64724c;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64725d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.b.a */
/* compiled from: PG */
public final class C126319a {
    /* renamed from: a */
    public static C51809dy m206546a(String str) {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = str;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: b */
    public static C51809dy m206547b(String str, String str2, C52230ka kaVar) {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = str;
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str2;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar.getClass();
        kcVar2.f137066c = kaVar;
        kcVar2.f137064a |= 2;
        dvVar.mo53733c((C52232kc) kbVar.build());
        C51807dw dwVar = (C51807dw) dvVar.build();
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: c */
    public static C51809dy m206548c(String str) {
        C125035a aVar = (C125035a) C125036b.f344969b.createBuilder();
        aVar.copyOnWrite();
        str.getClass();
        ((C125036b) aVar.instance).f344971a = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "java.com.google.android.apps.search.assistant.surfaces.dictation.proto.internal.DictateEmojiClientOpArgs";
        C63088z byteString = ((C125036b) aVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return m206547b("text.DICTATE_EMOJI", "dictate_emoji_args", (C52230ka) jzVar.build());
    }

    /* renamed from: d */
    public static C51809dy m206549d(String str) {
        C64724c cVar = (C64724c) C64725d.f175446b.createBuilder();
        cVar.copyOnWrite();
        ((C64725d) cVar.instance).f175448a = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.text.DictateArgs";
        C63088z byteString = ((C64725d) cVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return m206547b("text.DICTATE", "dictate_args", (C52230ka) jzVar.build());
    }

    /* renamed from: e */
    public static C51809dy m206550e(C52845v vVar) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.AppControlArgs";
        C51673af afVar = (C51673af) C51674ag.f135026a.createBuilder();
        C62940bt btVar = C48775a.f126211c;
        C52839p pVar = (C52839p) C52846w.f138653b.createBuilder();
        pVar.mo53925a(vVar);
        afVar.mo58885m(btVar, (C52846w) pVar.build());
        C63088z byteString = ((C51674ag) afVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return m206547b("device.EXECUTE_APP_CONTROL", "app_control_args", (C52230ka) jzVar.build());
    }

    /* renamed from: f */
    public static MessageLite m206551f(C51809dy dyVar, String str, C63010eb ebVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        for (C52232kc kcVar : dwVar.f135932a) {
            if (str.equals(kcVar.f137065b)) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return (MessageLite) ebVar.mo59011j(kaVar.f137061c, C62921ba.m95368a());
                } catch (C62974ct e) {
                    throw new IllegalArgumentException("Error parsing the arg with key=".concat(str), e);
                }
            }
        }
        throw new IllegalArgumentException("Couldn't find the arg with key=".concat(str));
    }

    /* renamed from: g */
    public static C51809dy m206552g() {
        C64722a aVar = (C64722a) C64723b.f175443b.createBuilder();
        aVar.copyOnWrite();
        ((C64723b) aVar.instance).f175445a = 11;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.text.ActionArgs";
        C63088z byteString = ((C64723b) aVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return m206547b("text.ACTION", "action_args", (C52230ka) jzVar.build());
    }
}
