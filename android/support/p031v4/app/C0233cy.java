package android.support.p031v4.app;

import android.util.Log;
import android.view.View;
import androidx.core.p094f.C1893f;

/* renamed from: android.support.v4.app.cy */
/* compiled from: PG */
final class C0233cy extends C0238dc {

    /* renamed from: g */
    private final C0209ca f868g;

    public C0233cy(int i, int i2, C0209ca caVar, C1893f fVar) {
        super(i, i2, caVar.f785a, fVar);
        this.f868g = caVar;
    }

    /* renamed from: a */
    public final void mo737a() {
        super.mo737a();
        this.f868g.mo664e();
    }

    /* renamed from: b */
    public final void mo738b() {
        int i = this.f877f;
        if (i == 2) {
            Fragment fragment = this.f868g.f785a;
            View findFocus = fragment.mView.findFocus();
            if (findFocus != null) {
                fragment.setFocusedView(findFocus);
                if (FragmentManager.m246Z(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                }
            }
            View requireView = this.f872a.requireView();
            if (requireView.getParent() == null) {
                this.f868g.mo661b();
                requireView.setAlpha(0.0f);
            }
            if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                requireView.setVisibility(4);
            }
            requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
        } else if (i == 3) {
            Fragment fragment2 = this.f868g.f785a;
            View requireView2 = fragment2.requireView();
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
            }
            requireView2.clearFocus();
        }
    }
}
