package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.View;
import android.widget.ImageView;
import com.google.apps.p3589d.p3590a.C45704u;
import java.util.ArrayList;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.q */
/* compiled from: PG */
public final class C9096q implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        C69664n.m101061g(view, "v");
    }

    public final void onViewDetachedFromWindow(View view) {
        C69664n.m101061g(view, "v");
        ImageView imageView = (ImageView) view;
        C9088i.f31339a.mo17406b(imageView, (C45704u) null);
        C9085f fVar = C9085f.f31334a;
        C9085f.m23622b(imageView.getId(), (ArrayList) null);
    }
}
