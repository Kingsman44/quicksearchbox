package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.a */
/* compiled from: PG */
public final class C126287a {

    /* renamed from: a */
    public static final C59071e f347953a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.s.a");

    /* renamed from: a */
    public static C52230ka m206487a(C63070h hVar) {
        String str = hVar.f170217a;
        if (!str.startsWith("type.googleapis.com/")) {
            C59052c cVar = (C59052c) f347953a.mo56226d();
            cVar.mo56380ai(C58979ad.FULL);
            ((C59052c) cVar.mo56372aa(36998)).mo56389s("Malformed Any.type_url: %s [SD]", C126290c.m206496a(str));
            return null;
        }
        String substring = str.substring(20);
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        substring.getClass();
        kaVar.f137059a |= 1;
        kaVar.f137060b = substring;
        C63088z zVar = hVar.f170218b;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        zVar.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = zVar;
        return (C52230ka) jzVar.build();
    }

    /* renamed from: b */
    public static C63070h m206488b(String str, MessageLite messageLite) {
        C58838bb.m90868c(!str.startsWith("type.googleapis.com/"));
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/".concat(str);
        C63088z byteString = messageLite.toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        return (C63070h) gVar.build();
    }
}
