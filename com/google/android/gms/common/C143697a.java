package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.common.a */
/* compiled from: PG */
public final class C143697a implements ServiceConnection {

    /* renamed from: a */
    public boolean f389593a = false;

    /* renamed from: b */
    public final BlockingQueue f389594b = new LinkedBlockingQueue();

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f389594b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
