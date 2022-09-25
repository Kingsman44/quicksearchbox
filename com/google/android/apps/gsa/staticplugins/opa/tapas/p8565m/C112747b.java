package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.b */
/* compiled from: PG */
final class C112747b extends C90953s {

    /* renamed from: a */
    final /* synthetic */ ImageView f312526a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112747b(ImageView imageView) {
        super("AnswerResultRenderer");
        this.f312526a = imageView;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        this.f312526a.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f312526a.setAdjustViewBounds(true);
        this.f312526a.setImageDrawable((Drawable) obj);
        this.f312526a.setVisibility(0);
    }
}
