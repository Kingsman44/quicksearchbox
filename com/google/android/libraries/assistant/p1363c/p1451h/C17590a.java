package com.google.android.libraries.assistant.p1363c.p1451h;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.h.a */
/* compiled from: PG */
public final class C17590a {
    /* renamed from: a */
    public static C51805du m34882a(C61752n nVar) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.IntentInput";
        C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
        C63088z byteString = nVar.toByteString();
        hcVar.copyOnWrite();
        C52152hd hdVar = (C52152hd) hcVar.instance;
        byteString.getClass();
        hdVar.f136852a |= 1;
        hdVar.f136853b = byteString;
        C63088z byteString2 = ((C52152hd) hcVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString2.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString2;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "asst_input.INTENT";
        dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }

    /* renamed from: b */
    public static Optional m34883b(C51805du duVar) {
        try {
            C62995dn dnVar = duVar.f135929d;
            if (dnVar.containsKey("intent_input")) {
                return Optional.m71637of((C61752n) C62942bv.parseFrom((C62942bv) C61752n.f166808f, ((C52152hd) C62942bv.parseFrom((C62942bv) C52152hd.f136850c, ((C52230ka) dnVar.get("intent_input")).f137061c, C62921ba.m95368a())).f136853b, C62921ba.m95368a()));
            }
            throw new IllegalArgumentException();
        } catch (C62974ct | IllegalArgumentException unused) {
            return Optional.empty();
        }
    }
}
