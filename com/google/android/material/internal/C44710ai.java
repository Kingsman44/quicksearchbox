package com.google.android.material.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.internal.ai */
/* compiled from: PG */
final class C44710ai extends C44713al {
    public C44710ai(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
        this.itemView.setOnClickListener(onClickListener);
    }
}
