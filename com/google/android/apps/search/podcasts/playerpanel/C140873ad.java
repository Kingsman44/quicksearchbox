package com.google.android.apps.search.podcasts.playerpanel;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.ad */
/* compiled from: PG */
public final class C140873ad implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f382540a;

    /* renamed from: b */
    final /* synthetic */ C140879aj f382541b;

    public C140873ad(View view, C140879aj ajVar) {
        this.f382540a = view;
        this.f382541b = ajVar;
    }

    public final void onGlobalLayout() {
        this.f382540a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ViewParent parent = this.f382540a.getParent();
        if (parent != null) {
            while (parent.getParent() != null) {
                parent = parent.getParent();
                C69664n.m101060f(parent, "parentView.parent");
                if (parent instanceof CoordinatorLayout) {
                    C140879aj ajVar = this.f382541b;
                    View view = (View) parent;
                    double height = (double) view.getHeight();
                    Double.isNaN(height);
                    double height2 = (double) ajVar.f382548a.requireView().getHeight();
                    Double.isNaN(height2);
                    double width = (double) view.getWidth();
                    Double.isNaN(width);
                    int min = Math.min((int) ((height * 0.92d) - height2), (int) (width * 0.8d));
                    View requireView = ajVar.f382548a.requireView();
                    C69664n.m101060f(requireView, "fragment.requireView()");
                    ViewGroup.LayoutParams layoutParams = C140880ak.m228805j(requireView).getLayoutParams();
                    layoutParams.height = min;
                    layoutParams.width = min;
                    View requireView2 = ajVar.f382548a.requireView();
                    C69664n.m101060f(requireView2, "fragment.requireView()");
                    ThumbnailView j = C140880ak.m228805j(requireView2);
                    j.setLayoutParams(layoutParams);
                    j.setVisibility(min < ajVar.f382548a.requireContext().getResources().getDimensionPixelSize(R.dimen.google_min_touch_target_size) ? 8 : 0);
                }
            }
        }
    }
}
