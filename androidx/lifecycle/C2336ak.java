package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.ak */
/* compiled from: PG */
final class C2336ak extends C2377h {

    /* renamed from: a */
    final /* synthetic */ C2338am f6533a;

    public C2336ak(C2338am amVar) {
        this.f6533a = amVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
        C2338am amVar = this.f6533a;
        int i = amVar.f6536c - 1;
        amVar.f6536c = i;
        if (i == 0) {
            amVar.f6539f.postDelayed(amVar.f6541h, 700);
        }
    }

    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        C2337al.m6323a(activity, new C2335aj(this));
    }

    public final void onActivityStopped(Activity activity) {
        C2338am amVar = this.f6533a;
        amVar.f6535b--;
        amVar.mo5735a();
    }
}
