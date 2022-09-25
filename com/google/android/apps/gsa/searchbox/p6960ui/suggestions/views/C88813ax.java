package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.ax */
/* compiled from: PG */
final class C88813ax extends C90953s {

    /* renamed from: a */
    final /* synthetic */ ImageView f240446a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88813ax(ImageView imageView) {
        super("sb.u.UniSugView");
        this.f240446a = imageView;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        this.f240446a.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f240446a.setAdjustViewBounds(true);
        this.f240446a.setImageDrawable((Drawable) obj);
        this.f240446a.setVisibility(0);
    }
}
