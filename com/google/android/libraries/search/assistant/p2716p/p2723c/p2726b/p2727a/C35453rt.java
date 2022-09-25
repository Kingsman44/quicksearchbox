package com.google.android.libraries.search.assistant.p2716p.p2723c.p2726b.p2727a;

import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4985f.p5030q.C65122cn;
import com.google.protos.p4985f.p5030q.C65123co;

/* renamed from: com.google.android.libraries.search.assistant.p.c.b.a.rt */
/* compiled from: PG */
public final class C35453rt {
    /* renamed from: a */
    public static C65123co m63810a(Boolean bool) {
        C65122cn cnVar = (C65122cn) C65123co.f176284c.createBuilder();
        boolean booleanValue = bool.booleanValue();
        cnVar.copyOnWrite();
        C65123co coVar = (C65123co) cnVar.instance;
        coVar.f176286a = 1;
        coVar.f176287b = Boolean.valueOf(booleanValue);
        return (C65123co) cnVar.build();
    }

    /* renamed from: b */
    public static C65123co m63811b(Long l) {
        C65122cn cnVar = (C65122cn) C65123co.f176284c.createBuilder();
        long longValue = l.longValue();
        cnVar.copyOnWrite();
        C65123co coVar = (C65123co) cnVar.instance;
        coVar.f176286a = 2;
        coVar.f176287b = Long.valueOf(longValue);
        return (C65123co) cnVar.build();
    }

    /* renamed from: c */
    public static C65123co m63812c(String str) {
        C65122cn cnVar = (C65122cn) C65123co.f176284c.createBuilder();
        cnVar.copyOnWrite();
        C65123co coVar = (C65123co) cnVar.instance;
        str.getClass();
        coVar.f176286a = 4;
        coVar.f176287b = str;
        return (C65123co) cnVar.build();
    }

    /* renamed from: d */
    public static C65123co m63813d(MessageLite messageLite, String str) {
        C65122cn cnVar = (C65122cn) C65123co.f176284c.createBuilder();
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        C63088z byteString = messageLite.toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = str;
        cnVar.copyOnWrite();
        C65123co coVar = (C65123co) cnVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        coVar.f176287b = hVar;
        coVar.f176286a = 6;
        return (C65123co) cnVar.build();
    }
}
