package com.google.apps.tiktok.concurrent.futuresmixin;

import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.apps.tiktok.concurrent.futuresmixin.b */
/* compiled from: PG */
public final class C46436b {

    /* renamed from: a */
    public final Object f121539a;

    public C46436b(Object obj) {
        this.f121539a = obj;
    }

    /* renamed from: a */
    public static C46436b m82808a(MessageLite messageLite) {
        return new C46436b(new ProtoParsers.InternalDontUse((byte[]) null, messageLite));
    }
}
