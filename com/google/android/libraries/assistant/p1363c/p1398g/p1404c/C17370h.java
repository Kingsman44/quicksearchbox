package com.google.android.libraries.assistant.p1363c.p1398g.p1404c;

import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17476al;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.protobuf.C63088z;
import java.util.Random;

/* renamed from: com.google.android.libraries.assistant.c.g.c.h */
/* compiled from: PG */
public final class C17370h {

    /* renamed from: a */
    private final Random f50234a = new Random();

    /* renamed from: a */
    public final synchronized C17477am mo23324a() {
        C17476al alVar;
        byte[] bArr = new byte[8];
        this.f50234a.nextBytes(bArr);
        alVar = (C17476al) C17477am.f50464c.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        alVar.copyOnWrite();
        C17477am amVar = (C17477am) alVar.instance;
        amVar.f50466a |= 1;
        amVar.f50467b = A;
        return (C17477am) alVar.build();
    }
}
