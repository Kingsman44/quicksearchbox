package com.google.android.apps.gsa.sidekick.shared.util;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.now.shared.p6421ui.RecyclerViewStub;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.ak */
/* compiled from: PG */
public final class C91960ak {
    /* renamed from: a */
    public static ImageView m150915a(View view) {
        View view2;
        RecyclerViewStub recyclerViewStub = (RecyclerViewStub) view.findViewById(R.id.gutter_icon_stub);
        if (recyclerViewStub != null) {
            recyclerViewStub.f227323a = R.layout.gutter_icon_tint_resource;
            view2 = recyclerViewStub.mo76714a();
        } else {
            view2 = null;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.action_icon);
        if (imageView != null) {
            imageView.setVisibility(0);
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        return imageView;
    }

    /* renamed from: b */
    public static void m150916b(View view, int i) {
        ImageView a = m150915a(view);
        if (a != null) {
            a.setImageResource(i);
        }
    }
}
