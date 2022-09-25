package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.by */
/* compiled from: PG */
final class C73600by extends C0673gh {

    /* renamed from: a */
    public final View f194716a;

    /* renamed from: b */
    public final TextView f194717b;

    /* renamed from: c */
    private final ImageView f194718c;

    public C73600by(View view) {
        super(view);
        this.f194716a = view;
        ImageView imageView = (ImageView) view.findViewById(R.id.autocomplete_image);
        imageView.getClass();
        this.f194718c = imageView;
        TextView textView = (TextView) view.findViewById(R.id.autocomplete_text);
        textView.getClass();
        this.f194717b = textView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65084a(Drawable drawable) {
        if (drawable == null) {
            this.f194718c.setVisibility(4);
            return;
        }
        this.f194718c.setImageDrawable(drawable);
        this.f194718c.setVisibility(0);
    }
}
