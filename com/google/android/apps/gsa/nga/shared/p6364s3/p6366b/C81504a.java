package com.google.android.apps.gsa.nga.shared.p6364s3.p6366b;

import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81501s;
import com.google.common.util.concurrent.SettableFuture;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.b.a */
/* compiled from: PG */
final class C81504a extends C81501s {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f222925a;

    public C81504a(SettableFuture settableFuture) {
        this.f222925a = settableFuture;
    }

    /* renamed from: e */
    public final void mo75110e() {
        this.f222925a.mo57357o(new EOFException());
    }

    /* renamed from: f */
    public final void mo75111f(byte[] bArr) {
        this.f222925a.mo57356n(ByteBuffer.wrap(bArr));
    }
}
