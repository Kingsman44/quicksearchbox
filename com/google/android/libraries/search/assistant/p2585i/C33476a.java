package com.google.android.libraries.search.assistant.p2585i;

import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.search.assistant.i.a */
/* compiled from: PG */
public final class C33476a {

    /* renamed from: a */
    public final MessageLite f89590a;

    /* renamed from: b */
    private final String f89591b;

    public C33476a(String str, MessageLite messageLite) {
        this.f89591b = str;
        this.f89590a = messageLite;
    }

    /* renamed from: a */
    public final C52230ka mo38879a(MessageLite messageLite) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        String str = this.f89591b;
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = str;
        C63088z byteString = messageLite.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return (C52230ka) jzVar.build();
    }

    /* renamed from: b */
    public final MessageLite mo38880b(C52230ka kaVar) {
        if (kaVar.f137060b.equals(this.f89591b)) {
            MessageLite messageLite = this.f89590a;
            return (MessageLite) messageLite.getParserForType().mo59011j(kaVar.f137061c, C62921ba.m95368a());
        }
        throw new C62974ct(String.format("Invalid protobuf type, expected %s, got %s", new Object[]{this.f89591b, kaVar.f137060b}));
    }
}
