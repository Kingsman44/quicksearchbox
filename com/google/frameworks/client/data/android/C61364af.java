package com.google.frameworks.client.data.android;

import java.nio.ByteBuffer;

/* renamed from: com.google.frameworks.client.data.android.af */
/* compiled from: PG */
public final class C61364af {

    /* renamed from: a */
    public final String f165936a;

    /* renamed from: b */
    public final ByteBuffer f165937b;

    public C61364af(String str, ByteBuffer byteBuffer) {
        this.f165936a = str;
        this.f165937b = byteBuffer;
    }

    public final String toString() {
        String obj = super.toString();
        String str = this.f165936a;
        String obj2 = this.f165937b.toString();
        return obj + ": contentType=" + str + ", data=" + obj2;
    }
}
