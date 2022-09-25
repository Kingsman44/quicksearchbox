package com.google.android.gms.vision.face;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.vision.C146300a;
import com.google.android.gms.vision.C146304e;
import com.google.android.gms.vision.face.internal.client.C146312b;
import com.google.android.gms.vision.face.internal.client.C146315e;

@Deprecated
/* renamed from: com.google.android.gms.vision.face.d */
/* compiled from: PG */
public final class C146309d extends C146300a {

    /* renamed from: b */
    public final C146304e f395180b = new C146304e();

    /* renamed from: c */
    public final C146312b f395181c;

    /* renamed from: d */
    public final Object f395182d = new Object();

    /* renamed from: e */
    public boolean f395183e = true;

    private C146309d() {
        throw new IllegalStateException("Default constructor called");
    }

    /* renamed from: a */
    public final void mo122867a() {
        synchronized (this.f395155a) {
        }
        synchronized (this.f395182d) {
            if (this.f395183e) {
                C146312b bVar = this.f395181c;
                synchronized (bVar.f395217a) {
                    if (bVar.f395219c != null) {
                        try {
                            C146315e eVar = (C146315e) bVar.mo122883b();
                            C143919bh.m233958a(eVar);
                            eVar.mo17262he(3, eVar.mo17260gA());
                        } catch (RemoteException e) {
                            Log.e(bVar.f395218b, "Could not finalize native handle", e);
                        }
                    }
                }
                this.f395183e = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this.f395182d) {
                if (this.f395183e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    mo122867a();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public C146309d(C146312b bVar) {
        this.f395181c = bVar;
    }
}
