package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.View;
import android.widget.TextView;
import androidx.core.widget.C2136w;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.ae */
/* compiled from: PG */
public final class C9078ae extends C9082c {
    public C9078ae(float f) {
        super(f);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Float mo17395b(View view) {
        TextView textView = (TextView) view;
        C69664n.m101061g(textView, "view");
        C2136w.m5931g(textView, 1);
        float textSize = textView.getTextSize();
        C2136w.m5931g(textView, 0);
        return Float.valueOf(textSize);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo17396d(View view, float f) {
        TextView textView = (TextView) view;
        C69664n.m101061g(textView, "view");
        textView.setTextSize(0, f);
    }
}
