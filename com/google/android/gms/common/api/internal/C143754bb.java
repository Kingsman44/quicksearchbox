package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.common.api.internal.bb */
/* compiled from: PG */
final class C143754bb extends C144861c {

    /* renamed from: a */
    final /* synthetic */ C143755bc f389723a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143754bb(C143755bc bcVar, Looper looper) {
        super(looper);
        this.f389723a = bcVar;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C143753ba baVar = (C143753ba) message.obj;
            C143755bc bcVar = this.f389723a;
            bcVar.f389724a.lock();
            try {
                if (bcVar.f389734k == baVar.f389722c) {
                    baVar.mo119135a();
                    bcVar.f389724a.unlock();
                }
            } finally {
                bcVar.f389724a.unlock();
            }
        } else if (i != 2) {
            int i2 = message.what;
            Log.w("GACStateManager", "Unknown message id: " + i2);
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
