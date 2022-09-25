package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.C81666a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.DoubleTopGreetingView */
/* compiled from: PG */
public class DoubleTopGreetingView extends FrameLayout implements C81723ab, C81666a {

    /* renamed from: a */
    public final TextView f223487a;

    /* renamed from: b */
    public final TextView f223488b;

    /* renamed from: c */
    public final TextView f223489c;

    /* renamed from: d */
    public String f223490d;

    /* renamed from: e */
    private final ImageView f223491e;

    /* renamed from: f */
    private final TextView f223492f;

    /* renamed from: g */
    private final View f223493g;

    /* renamed from: h */
    private final int f223494h;

    /* renamed from: i */
    private final int f223495i;

    public DoubleTopGreetingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo75225a(boolean z) {
        this.f223491e.setImageTintList(z ? ColorStateList.valueOf(C19391a.m36980a(getContext(), R.attr.assistantOnBackground)) : null);
    }

    /* renamed from: b */
    public final void mo75248b(String str) {
        if (TextUtils.isEmpty(str)) {
            mo75249c(false);
        }
        if (this.f223492f.getVisibility() == 0) {
            this.f223492f.setText(str);
        }
    }

    /* renamed from: c */
    public final void mo75249c(boolean z) {
        if (z) {
            this.f223492f.setVisibility(0);
            this.f223493g.setVisibility(0);
            return;
        }
        this.f223492f.setVisibility(8);
        this.f223493g.setVisibility(8);
    }

    public DoubleTopGreetingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).cloneInContext(context).inflate(R.layout.nga_assist_large_greeting, this, true);
        this.f223491e = (ImageView) viewGroup.findViewById(R.id.nga_assist_greeting_logo);
        this.f223487a = (TextView) viewGroup.findViewById(R.id.nga_assist_greeting_text);
        this.f223492f = (TextView) viewGroup.findViewById(R.id.nga_assist_single_greeting_bottom_text);
        this.f223493g = viewGroup.findViewById(R.id.nga_assist_single_greeting_bottom_space);
        this.f223488b = (TextView) viewGroup.findViewById(R.id.nga_assist_privacy_text);
        this.f223489c = (TextView) viewGroup.findViewById(R.id.nga_assist_privacy_click_text);
        this.f223494h = context.getResources().getDimensionPixelSize(R.dimen.nga_tactile_greeting_text_size);
        this.f223495i = context.getResources().getDimensionPixelSize(R.dimen.nga_lockscreen_greeting_text_size);
    }

    /* renamed from: d */
    public final void mo75250d(int i) {
        int i2;
        int i3 = i - 1;
        if (i != 0) {
            if (i3 != 0) {
                i2 = i3 != 1 ? 0 : this.f223495i;
            } else {
                i2 = this.f223494h;
            }
            this.f223487a.setTextSize(0, (float) i2);
            return;
        }
        throw null;
    }

    public final void setVisibility(int i) {
        if (i == 4 || i == 8) {
            this.f223487a.setText(BuildConfig.FLAVOR);
        } else {
            String str = this.f223490d;
            if (str != null) {
                this.f223487a.setText(str);
            }
        }
        super.setVisibility(i);
    }
}
