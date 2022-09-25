package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.features.p2364e.C30545a;
import com.google.android.libraries.onegoogle.accountmenu.p2376g.C30643a;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.az */
/* compiled from: PG */
final class C30728az extends C0673gh {
    public C30728az(Context context, ViewGroup viewGroup, C30643a aVar, View.OnClickListener onClickListener) {
        super(LayoutInflater.from(context).inflate(R.layout.incognito_action_list_item, viewGroup, false));
        this.itemView.setOnClickListener(onClickListener);
        ((ImageView) this.itemView.findViewById(R.id.incognito_icon)).setImageDrawable(C30545a.m57051a(context, aVar));
        ((TextView) this.itemView.findViewById(R.id.incognito_text)).setText(R.string.og_turn_on_incognito_mode);
    }
}
