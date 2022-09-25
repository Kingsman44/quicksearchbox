package com.google.android.apps.gsa.p6487s3.p6488a;

import com.google.android.apps.gsa.shared.p6968aa.C89039bj;
import com.google.protobuf.C62906an;
import com.google.speech.p5208h.C66607ce;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.s3.a.b */
/* compiled from: PG */
public final /* synthetic */ class C84281b implements C89039bj {

    /* renamed from: a */
    public final /* synthetic */ int f229355a;

    /* renamed from: b */
    public final /* synthetic */ C66607ce f229356b;

    public /* synthetic */ C84281b(int i, C66607ce ceVar) {
        this.f229355a = i;
        this.f229356b = ceVar;
    }

    /* renamed from: a */
    public final void mo77819a(ByteBuffer byteBuffer) {
        int i = this.f229355a;
        C66607ce ceVar = this.f229356b;
        int i2 = C84282c.f229358b;
        byteBuffer.putInt(i);
        try {
            ceVar.writeTo(C62906an.m95326S(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i));
            byteBuffer.position(byteBuffer.position() + i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
