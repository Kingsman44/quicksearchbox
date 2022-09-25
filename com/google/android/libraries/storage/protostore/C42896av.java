package com.google.android.libraries.storage.protostore;

import android.util.Log;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4874ap.p4877b.p4878a.C63710u;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.storage.protostore.av */
/* compiled from: PG */
final class C42896av implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f112220a;

    public C42896av(AtomicBoolean atomicBoolean) {
        this.f112220a = atomicBoolean;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.v("ProtoDataStoreWithLams", "RPC failed", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C63710u uVar = (C63710u) obj;
        if (!Log.isLoggable("ProtoDataStoreWithLams", 2)) {
            return;
        }
        if (this.f112220a.get()) {
            Log.v("ProtoDataStoreWithLams", "RPC skipped");
        } else {
            Log.v("ProtoDataStoreWithLams", "RPC response: ".concat(String.valueOf(String.valueOf(uVar))));
        }
    }
}
