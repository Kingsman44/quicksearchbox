package android.support.p031v4.app;

import android.animation.Animator;
import android.util.Log;
import androidx.core.p094f.C1892e;

/* renamed from: android.support.v4.app.f */
/* compiled from: PG */
final class C0243f implements C1892e {

    /* renamed from: a */
    final /* synthetic */ Animator f890a;

    /* renamed from: b */
    final /* synthetic */ C0238dc f891b;

    public C0243f(Animator animator, C0238dc dcVar) {
        this.f890a = animator;
        this.f891b = dcVar;
    }

    /* renamed from: a */
    public final void mo739a() {
        this.f890a.end();
        if (FragmentManager.m246Z(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.f891b + " has been canceled.");
        }
    }
}
