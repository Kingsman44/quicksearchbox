package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.ak */
/* compiled from: PG */
public final class C15002ak extends C0648fj {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view) % 3;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.findViewById(R.id.app_button).getLayoutParams();
        if (childLayoutPosition == 0) {
            layoutParams.gravity = 8388611;
        } else if (childLayoutPosition == 1) {
            layoutParams.gravity = 1;
        } else if (childLayoutPosition == 2) {
            layoutParams.gravity = 8388613;
        }
    }
}
