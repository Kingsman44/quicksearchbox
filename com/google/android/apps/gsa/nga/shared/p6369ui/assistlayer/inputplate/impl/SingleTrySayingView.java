package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80792fm;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.C81666a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.SingleTrySayingView */
/* compiled from: PG */
public class SingleTrySayingView extends ConstraintLayout implements C81666a {

    /* renamed from: a */
    public final TextView f223503a;

    /* renamed from: b */
    public final TextView f223504b;

    /* renamed from: c */
    public final TextView f223505c;

    /* renamed from: d */
    public final TextView f223506d;

    /* renamed from: e */
    public final int f223507e;

    /* renamed from: f */
    public C80792fm f223508f;

    /* renamed from: g */
    private final ImageView f223509g;

    public SingleTrySayingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo75225a(boolean z) {
        this.f223509g.setImageTintList(z ? ColorStateList.valueOf(C19391a.m36980a(getContext(), R.attr.colorOnBackground)) : null);
    }

    public SingleTrySayingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f223508f = C80792fm.f221696l;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).cloneInContext(context).inflate(R.layout.nga_assist_tactile_single_trysaying, this, true);
        this.f223509g = (ImageView) viewGroup.findViewById(R.id.nga_assist_tactile_single_trysaying_logo);
        this.f223503a = (TextView) viewGroup.findViewById(R.id.nga_assist_tactile_single_trysaying_hint);
        this.f223506d = (TextView) viewGroup.findViewById(R.id.nga_assist_tactile_single_trysaying_bottom_text);
        this.f223504b = (TextView) viewGroup.findViewById(R.id.nga_assist_tactile_single_trysaying_query);
        this.f223505c = (TextView) viewGroup.findViewById(R.id.nga_assist_tactile_single_trysaying_disclosure);
        this.f223507e = context.getResources().getDimensionPixelOffset(R.dimen.nga_assist_single_try_saying_horizontal_padding);
    }
}
