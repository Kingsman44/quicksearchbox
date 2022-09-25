package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.z */
/* compiled from: PG */
public class C2395z extends Service implements C2391v {

    /* renamed from: a */
    public final C2357be f6618a = new C2357be(this);

    public final C2384o getLifecycle() {
        return this.f6618a.f6570a;
    }

    public IBinder onBind(Intent intent) {
        this.f6618a.mo5765a(C2382m.ON_START);
        return null;
    }

    public void onCreate() {
        this.f6618a.mo5765a(C2382m.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        C2357be beVar = this.f6618a;
        beVar.mo5765a(C2382m.ON_STOP);
        beVar.mo5765a(C2382m.ON_DESTROY);
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i) {
        this.f6618a.mo5765a(C2382m.ON_START);
        super.onStart(intent, i);
    }
}
