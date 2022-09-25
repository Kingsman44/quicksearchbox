package com.google.android.libraries.assistant.trainingcache.bindings;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63000ds;
import com.google.protobuf.MessageLite;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.trainingcache.bindings.a */
/* compiled from: PG */
public final class C19438a {

    /* renamed from: a */
    private static final C59071e f54365a = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.bindings.a");

    /* renamed from: a */
    public static MessageLite m37131a(byte[] bArr, MessageLite messageLite) {
        C63000ds newBuilderForType = messageLite.newBuilderForType();
        try {
            newBuilderForType.mergeFrom(bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f54365a.mo56225c()).mo56382g(e)).mo56372aa(47839)).mo56386p("Failed to parse message.");
        }
        return newBuilderForType.build();
    }

    /* renamed from: b */
    public static List m37132b(byte[][] bArr, MessageLite messageLite) {
        C58480gp e = C58485gu.m89837e();
        for (byte[] mergeFrom : bArr) {
            try {
                e.mo55395g(messageLite.toBuilder().mergeFrom(mergeFrom, C62921ba.m95368a()).build());
            } catch (Exception e2) {
                ((C59052c) ((C59052c) ((C59052c) f54365a.mo56225c()).mo56382g(e2)).mo56372aa(47840)).mo56386p("Failed to parse message.");
            }
        }
        return e.mo55394f();
    }
}
