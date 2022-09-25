package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* compiled from: PG */
public final class C143831t extends C144861c {
    public C143831t() {
        super(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo119282a(C143712ae aeVar, C143711ad adVar) {
        int i = BasePendingResult.f389629q;
        sendMessage(obtainMessage(1, new Pair(aeVar, adVar)));
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            C143712ae aeVar = (C143712ae) pair.first;
            C143711ad adVar = (C143711ad) pair.second;
            try {
                aeVar.mo6030a(adVar);
            } catch (RuntimeException e) {
                BasePendingResult.m233473o(adVar);
                throw e;
            }
        } else if (i != 2) {
            int i2 = message.what;
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i2, new Exception());
        } else {
            ((BasePendingResult) message.obj).mo119110m(Status.f389618d);
        }
    }

    public C143831t(Looper looper) {
        super(looper);
    }
}
