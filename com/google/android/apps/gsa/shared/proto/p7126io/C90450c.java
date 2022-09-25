package com.google.android.apps.gsa.shared.proto.p7126io;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.shared.proto.io.c */
/* compiled from: PG */
public final /* synthetic */ class C90450c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ MessageLite f252682a;

    public /* synthetic */ C90450c(MessageLite messageLite) {
        this.f252682a = messageLite;
    }

    public final Object apply(Object obj) {
        MessageLite messageLite = this.f252682a;
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            return messageLite;
        }
        try {
            return messageLite.toBuilder().mergeFrom(bArr, C62921ba.m95368a()).build();
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }
}
