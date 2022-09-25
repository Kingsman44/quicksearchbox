package com.google.android.apps.gsa.nga.engine.p6144ui.p6148c;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.c.o */
/* compiled from: PG */
public final /* synthetic */ class C78105o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C78107q f215099a;

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f215100b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f215101c;

    public /* synthetic */ C78105o(C78107q qVar, FrameLayout frameLayout, ImageView imageView) {
        this.f215099a = qVar;
        this.f215100b = frameLayout;
        this.f215101c = imageView;
    }

    public final void onClick(View view) {
        C78107q qVar = this.f215099a;
        FrameLayout frameLayout = this.f215100b;
        ImageView imageView = this.f215101c;
        if (frameLayout.getVisibility() == 0) {
            frameLayout.setVisibility(8);
            imageView.setImageDrawable(qVar.f215104b.getDrawable(R.drawable.quantum_ic_expand_more_grey600_24));
            return;
        }
        frameLayout.setVisibility(0);
        imageView.setImageDrawable(qVar.f215104b.getDrawable(R.drawable.quantum_ic_expand_less_grey600_24));
    }
}
