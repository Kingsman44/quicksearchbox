package com.google.android.libraries.assistant.soda;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.assistant.soda.ag */
/* compiled from: PG */
public final class C19244ag {

    /* renamed from: a */
    private ByteBuffer f53924a;

    /* renamed from: a */
    public final ByteBuffer mo24395a(int i) {
        ByteBuffer byteBuffer = this.f53924a;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f53924a = ByteBuffer.allocateDirect(i);
        } else {
            this.f53924a.clear();
        }
        return this.f53924a;
    }
}
