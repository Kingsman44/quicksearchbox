package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.n */
/* compiled from: PG */
final class C9093n extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ View f31355a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9093n(View view) {
        super(1);
        this.f31355a = view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        View view = (View) obj;
        C69664n.m101061g(view, "v");
        View view2 = this.f31355a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = view2.getWidth();
            layoutParams.height = view2.getHeight();
            view.setLayoutParams(layoutParams);
            if (view instanceof ImageView) {
                C9088i.f31339a.mo17405a((ImageView) view);
            }
            return C69788q.f186170a;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
