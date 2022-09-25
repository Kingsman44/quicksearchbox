package com.google.android.enterprise.connectedapps;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

/* renamed from: com.google.android.enterprise.connectedapps.w */
/* compiled from: PG */
final class C142620w implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C142543ac f386948a;

    public C142620w(C142543ac acVar) {
        this.f386948a = acVar;
    }

    public final void onBindingDied(ComponentName componentName) {
        Log.e("CrossProfileSender", "onBindingDied for component ".concat(String.valueOf(String.valueOf(componentName))));
        this.f386948a.f386808c.execute(new C142617t(this));
    }

    public final void onNullBinding(ComponentName componentName) {
        Log.e("CrossProfileSender", "onNullBinding for component ".concat(String.valueOf(String.valueOf(componentName))));
        this.f386948a.f386808c.execute(new C142618u(this));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i("CrossProfileSender", "onServiceConnected for component ".concat(String.valueOf(String.valueOf(componentName))));
        this.f386948a.f386808c.execute(new C142616s(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Log.e("CrossProfileSender", "Unexpected disconnection for component ".concat(String.valueOf(String.valueOf(componentName))));
        this.f386948a.f386808c.execute(new C142619v(this));
    }
}
