package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ap */
/* compiled from: PG */
public final class C114632ap {

    /* renamed from: a */
    public final View f318020a;

    public C114632ap(Context context, String str, int i, View.OnClickListener onClickListener) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.zero_state_suggestion_chip_view, (ViewGroup) null);
        this.f318020a = inflate;
        ((TextView) inflate.findViewById(R.id.zero_state_suggestion_chip_text)).setText(str);
        ((ImageView) inflate.findViewById(R.id.zero_state_suggestion_chip_icon)).setImageDrawable(context.getDrawable(i));
        inflate.setOnClickListener(onClickListener);
    }
}
