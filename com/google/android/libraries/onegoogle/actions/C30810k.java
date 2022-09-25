package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;

/* renamed from: com.google.android.libraries.onegoogle.actions.k */
/* compiled from: PG */
public final class C30810k extends C0673gh {

    /* renamed from: a */
    public final ImageView f83132a;

    /* renamed from: b */
    public final TextView f83133b;

    /* renamed from: c */
    public final int f83134c;

    /* renamed from: d */
    public final C30897z f83135d;

    /* renamed from: e */
    public final SimpleActionView f83136e;

    public C30810k(Context context, C30897z zVar, ViewGroup viewGroup, C30809j jVar) {
        super(LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        View view = this.itemView;
        this.f83136e = (SimpleActionView) view;
        this.f83135d = zVar;
        this.f83132a = (ImageView) view.findViewById(R.id.icon);
        TextView textView = (TextView) this.itemView.findViewById(R.id.text);
        this.f83133b = textView;
        C30805f fVar = (C30805f) jVar;
        this.f83134c = fVar.f83126a;
        if (!fVar.f83129d) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_padding_start_small_disc);
            View view2 = this.itemView;
            C2043bi.m5556aj(view2, dimensionPixelSize, view2.getPaddingTop(), C2043bi.m5582k(this.itemView), this.itemView.getPaddingBottom());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_title_margin_start_small_disc);
            C2104s.m5794g(layoutParams, dimensionPixelSize2);
            layoutParams.leftMargin = dimensionPixelSize2;
            textView.setLayoutParams(layoutParams);
        }
    }
}
