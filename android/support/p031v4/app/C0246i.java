package android.support.p031v4.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p094f.C1892e;

/* renamed from: android.support.v4.app.i */
/* compiled from: PG */
final class C0246i implements C1892e {

    /* renamed from: a */
    final /* synthetic */ View f897a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f898b;

    /* renamed from: c */
    final /* synthetic */ C0251n f899c;

    /* renamed from: d */
    final /* synthetic */ C0238dc f900d;

    public C0246i(View view, ViewGroup viewGroup, C0251n nVar, C0238dc dcVar) {
        this.f897a = view;
        this.f898b = viewGroup;
        this.f899c = nVar;
        this.f900d = dcVar;
    }

    /* renamed from: a */
    public final void mo739a() {
        this.f897a.clearAnimation();
        this.f898b.endViewTransition(this.f897a);
        this.f899c.mo766b();
        if (FragmentManager.m246Z(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f900d + " has been cancelled.");
        }
    }
}
