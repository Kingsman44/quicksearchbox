package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80727db;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.C81666a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.c */
/* compiled from: PG */
public class C81775c extends FrameLayout implements C81666a {

    /* renamed from: a */
    protected final ImageView f223689a;

    /* renamed from: b */
    protected final TextView f223690b;

    /* renamed from: c */
    protected final TextView f223691c;

    /* renamed from: d */
    protected final TextView f223692d;

    /* renamed from: e */
    public final TextView f223693e;

    /* renamed from: f */
    protected final LottieAnimationView f223694f;

    /* renamed from: g */
    public String f223695g;

    /* renamed from: h */
    public String f223696h;

    /* renamed from: i */
    public Optional f223697i;

    /* renamed from: j */
    public C80727db f223698j;

    public C81775c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo75225a(boolean z) {
        this.f223689a.setImageTintList(z ? ColorStateList.valueOf(C19391a.m36980a(getContext(), R.attr.colorOnBackground)) : null);
    }

    public C81775c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f223697i = Optional.empty();
        this.f223698j = C80727db.f221610d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C81724ac.f223568a, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.nga_assist_fre_suggestion);
        obtainStyledAttributes.recycle();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).cloneInContext(context).inflate(resourceId, this, true);
        viewGroup.setClipChildren(false);
        this.f223689a = (ImageView) viewGroup.findViewById(R.id.nga_assist_fre_suggestion_logo);
        this.f223693e = (TextView) viewGroup.findViewById(R.id.nga_assist_fre_suggestion_bottom_text);
        this.f223690b = (TextView) viewGroup.findViewById(R.id.nga_assist_fre_suggestion_first_line);
        this.f223691c = (TextView) viewGroup.findViewById(R.id.nga_assist_fre_suggestion_second_line);
        this.f223694f = (LottieAnimationView) viewGroup.findViewById(R.id.nga_assist_fre_suggestion_gif);
        this.f223692d = (TextView) viewGroup.findViewById(R.id.nga_assist_fre_suggestion_disclosure_line);
    }
}
