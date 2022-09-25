package com.google.android.libraries.lens.ondevice.nativeapi;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24273e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4701g.C62351n;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;

/* compiled from: PG */
public class OnDeviceEngineNativeApi {

    /* renamed from: b */
    private static final C58974d f67833b = C58974d.m91135i("OnDeviceEngineNativeApi");

    /* renamed from: a */
    public long f67834a;

    /* renamed from: c */
    private final C24816a f67835c;

    public OnDeviceEngineNativeApi(C24816a aVar) {
        this.f67835c = aVar;
    }

    /* renamed from: h */
    private final void m45934h() {
        if (this.f67834a != 0) {
            C58974d dVar = f67833b;
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(48834)).mo56386p("Destroying OnDeviceEngineNativeApi...");
            nativeDestroy(this.f67834a);
            this.f67834a = 0;
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(48835)).mo56386p("OnDeviceEngineNativeApi destroyed.");
        }
    }

    private static native long nativeCreate(Context context, byte[] bArr);

    private native void nativeDestroy(long j);

    private native byte[] nativeSendRequest(long j, byte[] bArr);

    private native byte[] nativeSendRequestWithBitmap(long j, byte[] bArr, Bitmap bitmap);

    private native byte[] nativeSendRequestWithResourceHolderAndBitmap(long j, byte[] bArr, long j2, Bitmap bitmap);

    /* renamed from: a */
    public final synchronized long mo30010a() {
        return this.f67834a;
    }

    /* renamed from: b */
    public final synchronized C62355r mo30011b(C62353p pVar) {
        return (C62355r) C62942bv.parseFrom((C62942bv) C62355r.f168332e, nativeSendRequest(this.f67834a, pVar.toByteArray()), C62921ba.m95368a());
    }

    /* renamed from: c */
    public final synchronized C62355r mo30012c(C62353p pVar, Bitmap bitmap) {
        return (C62355r) C62942bv.parseFrom((C62942bv) C62355r.f168332e, nativeSendRequestWithBitmap(this.f67834a, pVar.toByteArray(), bitmap), C62921ba.m95368a());
    }

    /* renamed from: d */
    public final synchronized C62355r mo30013d(C62353p pVar, LodeResourceHolder lodeResourceHolder) {
        return (C62355r) C62942bv.parseFrom((C62942bv) C62355r.f168332e, nativeSendRequestWithResourceHolder(this.f67834a, pVar.toByteArray(), lodeResourceHolder.mo30006a()), C62921ba.m95368a());
    }

    /* renamed from: e */
    public final synchronized C62355r mo30014e(C62353p pVar, LodeResourceHolder lodeResourceHolder, Bitmap bitmap) {
        return (C62355r) C62942bv.parseFrom((C62942bv) C62355r.f168332e, nativeSendRequestWithResourceHolderAndBitmap(this.f67834a, pVar.toByteArray(), lodeResourceHolder.mo30006a(), bitmap), C62921ba.m95368a());
    }

    /* renamed from: f */
    public final synchronized void mo30015f(Context context, C62351n nVar) {
        C58974d dVar = f67833b;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(48832)).mo56386p("Initializing OnDeviceEngineNativeApi...");
        C24816a aVar = this.f67835c;
        C24821f fVar = new C24821f(this);
        synchronized (aVar.f67837b) {
            if (!aVar.f67839d) {
                aVar.f67838c.add(fVar);
            } else {
                throw new C24273e("Shutdown request in progress, no native components should be registered at this  point.");
            }
        }
        ((C58970a) ((C58970a) C24816a.f67836a.mo56224b()).mo56372aa(48825)).mo56389s("Registered lifecycle listener %s", fVar);
        this.f67834a = nativeCreate(context, nVar.toByteArray());
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(48833)).mo56386p("OnDeviceEngineNativeApi initialized.");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        m45934h();
        super.finalize();
    }

    /* renamed from: g */
    public final synchronized void mo30017g() {
        m45934h();
    }

    public native byte[] nativeSendRequestWithResourceHolder(long j, byte[] bArr, long j2);
}
