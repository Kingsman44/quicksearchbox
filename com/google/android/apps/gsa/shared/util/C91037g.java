package com.google.android.apps.gsa.shared.util;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.shared.util.g */
/* compiled from: PG */
public abstract class C91037g implements ServiceConnection {

    /* renamed from: b */
    public final SettableFuture f254285b = new SettableFuture();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo81750a(IBinder iBinder);

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C58976aa aaVar = C58975e.f156826a;
        this.f254285b.mo57356n(mo81750a(iBinder));
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f254285b.isDone()) {
            this.f254285b.cancel(false);
        }
    }
}
