package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.common.api.internal.aw */
/* compiled from: PG */
final class C143748aw extends C144861c {

    /* renamed from: a */
    final /* synthetic */ C143750ay f389696a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143748aw(C143750ay ayVar, Looper looper) {
        super(looper);
        this.f389696a = ayVar;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C143750ay ayVar = this.f389696a;
            ayVar.f389698b.lock();
            try {
                if (ayVar.mo119164o()) {
                    ayVar.mo119162m();
                }
            } finally {
                ayVar.f389698b.unlock();
            }
        } else if (i != 2) {
            int i2 = message.what;
            Log.w("GoogleApiClientImpl", "Unknown message id: " + i2);
        } else {
            this.f389696a.mo119163n();
        }
    }
}
