package androidx.browser.p059a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.support.p026a.C0122d;

/* renamed from: androidx.browser.a.n */
/* compiled from: PG */
public abstract class C0966n implements ServiceConnection {

    /* renamed from: a */
    public Context f3076a;

    /* renamed from: a */
    public abstract void mo3591a(ComponentName componentName, C0962j jVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0122d dVar;
        if (this.f3076a != null) {
            if (iBinder == null) {
                dVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0122d)) ? new C0122d(iBinder) : (C0122d) queryLocalInterface;
            }
            mo3591a(componentName, new C0965m(dVar, componentName, this.f3076a));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
