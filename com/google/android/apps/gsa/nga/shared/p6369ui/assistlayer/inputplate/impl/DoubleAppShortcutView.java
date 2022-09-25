package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.C81666a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.DoubleAppShortcutView */
/* compiled from: PG */
public class DoubleAppShortcutView extends FrameLayout implements C81666a {

    /* renamed from: a */
    public final TextView f223481a;

    /* renamed from: b */
    public final TextView f223482b;

    /* renamed from: c */
    public String f223483c;

    /* renamed from: d */
    public String f223484d;

    /* renamed from: e */
    public Optional f223485e;

    /* renamed from: f */
    private final ImageView f223486f;

    public DoubleAppShortcutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo75225a(boolean z) {
        this.f223486f.setImageTintList(z ? ColorStateList.valueOf(C19391a.m36980a(getContext(), R.attr.colorOnBackground)) : null);
    }

    public DoubleAppShortcutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f223485e = Optional.empty();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).cloneInContext(context).inflate(R.layout.nga_assist_tactile_double_app_shortcut, this, true);
        this.f223486f = (ImageView) viewGroup.findViewById(R.id.nga_assist_tactile_app_shortcut_logo);
        this.f223481a = (TextView) viewGroup.findViewById(R.id.nga_assist_tactile_app_shortcut_hint);
        this.f223482b = (TextView) viewGroup.findViewById(R.id.nga_assist_tactile_app_shortcut_query);
    }
}
