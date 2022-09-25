package com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a;

import android.os.Bundle;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.assistant.f.a.a.a.a.c */
/* compiled from: PG */
public final class C52801c {
    /* renamed from: a */
    public static MessageLite m86708a(Bundle bundle, String str, MessageLite messageLite) {
        try {
            byte[] byteArray = bundle.getByteArray(str);
            return byteArray == null ? messageLite : (MessageLite) messageLite.getParserForType().mo59015n(byteArray, C62921ba.m95368a());
        } catch (C62974ct e) {
            throw new C52802d(String.format("Fail to deserialize proto param: %s", new Object[]{e.getMessage()}));
        }
    }
}
