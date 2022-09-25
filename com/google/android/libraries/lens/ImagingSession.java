package com.google.android.libraries.lens;

import android.content.Context;
import com.google.lens.p4707j.C62417au;
import com.google.lens.p4707j.C62422az;
import com.google.lens.p4707j.C62425bb;
import com.google.lens.p4707j.C62427bd;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class ImagingSession {

    /* renamed from: a */
    public long f65745a;

    /* compiled from: PG */
    interface ImagingSessionNativeCallback {
        void onReceived(byte[] bArr);
    }

    public ImagingSession(Context context, C62422az azVar) {
        System.loadLibrary("lens_vision");
        this.f65745a = nativeCreateSession(context, azVar.toByteArray());
    }

    private static native long nativeCreateSession(Context context, byte[] bArr);

    private native void nativeDestroySession(long j);

    private native void nativeRegisterCallback(long j, byte[] bArr, ImagingSessionNativeCallback imagingSessionNativeCallback);

    private native byte[] nativeSendRequest(long j, byte[] bArr);

    /* renamed from: a */
    public final C62427bd mo29450a(C62425bb bbVar) {
        return (C62427bd) C62942bv.parseFrom((C62942bv) C62427bd.f168513e, nativeSendRequest(this.f65745a, bbVar.toByteArray()), C62921ba.m95368a());
    }

    /* renamed from: b */
    public final synchronized void mo29451b() {
        long j = this.f65745a;
        if (j != 0) {
            nativeDestroySession(j);
            this.f65745a = 0;
        }
    }

    /* renamed from: c */
    public final void mo29452c(C62417au auVar, C24066b bVar) {
        nativeRegisterCallback(this.f65745a, auVar.toByteArray(), new C24064a(bVar));
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo29451b();
        super.finalize();
    }

    public native byte[] nativeSendBufferRequestDirect(long j, byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public native byte[] nativeSendBufferRequestNonDirect(long j, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2);
}
