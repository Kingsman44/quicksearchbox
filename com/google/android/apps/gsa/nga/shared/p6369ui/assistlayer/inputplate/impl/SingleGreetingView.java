package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.C81666a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.SingleGreetingView */
/* compiled from: PG */
public class SingleGreetingView extends ConstraintLayout implements C81666a {

    /* renamed from: a */
    public final TextView f223496a;

    /* renamed from: b */
    public final TextView f223497b;

    /* renamed from: c */
    public final int f223498c;

    /* renamed from: d */
    public String f223499d;

    /* renamed from: e */
    private final ImageView f223500e;

    /* renamed from: f */
    private final ImageView f223501f;

    public SingleGreetingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo75225a(boolean z) {
        ColorStateList colorStateList = null;
        this.f223500e.setImageTintList(z ? ColorStateList.valueOf(C19391a.m36980a(getContext(), R.attr.assistantOnBackground)) : null);
        ImageView imageView = this.f223501f;
        if (z) {
            colorStateList = ColorStateList.valueOf(C19391a.m36980a(getContext(), R.attr.assistantOnBackground));
        }
        imageView.setImageTintList(colorStateList);
    }

    /* renamed from: b */
    public final void mo75252b(boolean z) {
        this.f223500e.setVisibility(true != z ? 8 : 0);
    }

    /* renamed from: c */
    public final void mo75253c(boolean z) {
        this.f223501f.setVisibility(true != z ? 8 : 0);
    }

    public SingleGreetingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).cloneInContext(context).inflate(R.layout.nga_assist_tactile_single_greeting, this, true);
        this.f223496a = (TextView) viewGroup.findViewById(R.id.nga_assist_single_greeting_text);
        this.f223497b = (TextView) viewGroup.findViewById(R.id.nga_assist_single_greeting_bottom_text);
        this.f223500e = (ImageView) viewGroup.findViewById(R.id.nga_assist_single_greeting_side_logo);
        this.f223501f = (ImageView) viewGroup.findViewById(R.id.nga_assist_single_greeting_top_logo);
        this.f223498c = context.getResources().getDimensionPixelOffset(R.dimen.nga_assist_single_greeting_horizontal_padding);
    }
}
