package com.google.android.libraries.lens.view.education;

import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.education.n */
/* compiled from: PG */
public final class C25784n extends C25770a {

    /* renamed from: e */
    public final TextView f70053e;

    /* renamed from: f */
    public final HorizontalScrollView f70054f;

    public C25784n(ViewGroup viewGroup) {
        super(viewGroup);
        TextView textView = (TextView) viewGroup.findViewById(R.id.latex_renderer_content);
        textView.getClass();
        this.f70053e = textView;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) viewGroup.findViewById(R.id.latex_renderer_content_inner_wrapper);
        horizontalScrollView.getClass();
        this.f70054f = horizontalScrollView;
    }
}
