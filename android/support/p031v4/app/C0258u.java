package android.support.p031v4.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;

/* renamed from: android.support.v4.app.u */
/* compiled from: PG */
final class C0258u implements C2333ah {

    /* renamed from: a */
    final /* synthetic */ C0260w f921a;

    public C0258u(C0260w wVar) {
        this.f921a = wVar;
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        if (((C2391v) obj) != null && this.f921a.mShowsDialog) {
            View requireView = this.f921a.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            } else if (this.f921a.mDialog != null) {
                if (FragmentManager.m246Z(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + this.f921a.mDialog);
                }
                this.f921a.mDialog.setContentView(requireView);
            }
        }
    }
}
