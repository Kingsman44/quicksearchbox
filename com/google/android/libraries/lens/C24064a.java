package com.google.android.libraries.lens;

import com.google.android.libraries.lens.ImagingSession;
import com.google.lens.p4707j.C62419aw;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.a */
/* compiled from: PG */
final class C24064a implements ImagingSession.ImagingSessionNativeCallback {

    /* renamed from: a */
    final /* synthetic */ C24066b f65746a;

    public C24064a(C24066b bVar) {
        this.f65746a = bVar;
    }

    public final void onReceived(byte[] bArr) {
        try {
            this.f65746a.mo29457a((C62419aw) C62942bv.parseFrom((C62942bv) C62419aw.f168491e, bArr, C62921ba.m95368a()));
        } catch (C62974ct e) {
            throw new IllegalStateException(e);
        }
    }
}
