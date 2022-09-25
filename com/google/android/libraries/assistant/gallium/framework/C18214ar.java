package com.google.android.libraries.assistant.gallium.framework;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65693s;
import com.google.protos.p5127o.C65696v;
import com.google.protos.p5127o.C65697w;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ar */
/* compiled from: PG */
public final class C18214ar {
    /* renamed from: a */
    public static MessageLite m35468a(C63070h hVar, C63010eb ebVar, String str) {
        try {
            return (MessageLite) ebVar.mo59011j(hVar.f170218b, C62921ba.m95368a());
        } catch (C62974ct e) {
            throw C18218av.m35479b(3, str.concat(" payload could not be parsed."), e);
        }
    }

    /* renamed from: b */
    public static MessageLite m35469b(C65693s sVar, C63010eb ebVar) {
        C63070h hVar = sVar.f178489b;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        return m35468a(hVar, ebVar, "Request");
    }

    /* renamed from: c */
    public static C65697w m35470c(MessageLite messageLite, String str) {
        C65696v vVar = (C65696v) C65697w.f178495c.createBuilder();
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        C63088z byteString = messageLite != null ? messageLite.toByteString() : C63088z.f170246b;
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = str;
        vVar.copyOnWrite();
        C65697w wVar = (C65697w) vVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        wVar.f178498b = hVar;
        wVar.f178497a = 1;
        return (C65697w) vVar.build();
    }

    /* renamed from: d */
    public static String m35471d(C65686l lVar) {
        return String.valueOf(lVar.f178473b).concat(!lVar.f178474c.isEmpty() ? "#".concat(String.valueOf(lVar.f178474c)) : BuildConfig.FLAVOR);
    }
}
