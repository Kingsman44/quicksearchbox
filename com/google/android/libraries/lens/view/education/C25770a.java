package com.google.android.libraries.lens.view.education;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.education.a */
/* compiled from: PG */
public class C25770a {

    /* renamed from: a */
    public final ViewGroup f70037a;

    /* renamed from: b */
    protected final LatexRendererScrollView f70038b;

    /* renamed from: c */
    protected final TextView f70039c;

    /* renamed from: d */
    public final TextView f70040d;

    protected C25770a(ViewGroup viewGroup) {
        this.f70037a = viewGroup;
        LatexRendererScrollView latexRendererScrollView = (LatexRendererScrollView) viewGroup.findViewById(R.id.latex_renderer_content_wrapper);
        latexRendererScrollView.getClass();
        this.f70038b = latexRendererScrollView;
        TextView textView = (TextView) viewGroup.findViewById(R.id.latex_renderer_overflow);
        textView.getClass();
        this.f70039c = textView;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.latex_renderer_fallback);
        textView2.getClass();
        this.f70040d = textView2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30917a(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            this.f70038b.setVisibility(0);
            this.f70039c.setVisibility(8);
            this.f70040d.setVisibility(8);
        } else if (i2 != 2) {
            this.f70038b.setVisibility(8);
            this.f70039c.setVisibility(8);
            this.f70040d.setVisibility(0);
        } else {
            this.f70038b.setVisibility(0);
            this.f70039c.setVisibility(0);
            this.f70040d.setVisibility(8);
        }
    }
}
