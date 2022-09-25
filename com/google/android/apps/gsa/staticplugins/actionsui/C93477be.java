package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.be */
/* compiled from: PG */
public class C93477be extends C93507m implements C93478bf {

    /* renamed from: e */
    private TextView f260874e;

    /* renamed from: f */
    private TextView f260875f;

    protected C93477be(Context context, String str) {
        super(context, str);
    }

    /* renamed from: A */
    public final void mo87772A(int i, int i2) {
        this.f260875f.setVisibility(0);
        if (i > 0) {
            this.f260875f.setText(i);
        }
        if (i2 > 0) {
            C89941l.m146512c(this.f260875f, i2);
        }
    }

    /* renamed from: t */
    public final View mo87752t(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CardView cardView = (CardView) layoutInflater.inflate(mo87773w(), viewGroup, false);
        cardView.mo4475e((float) getResources().getDimensionPixelSize(R.dimen.rounded_corner_radius));
        cardView.mo4474d((float) getResources().getDimensionPixelSize(R.dimen.card_elevation));
        cardView.mo4473c(getResources().getColor(R.color.agsa_color_surface_elevation_2));
        this.f260874e = (TextView) cardView.findViewById(R.id.message);
        TextView textView = (TextView) cardView.findViewById(R.id.continue_button);
        this.f260875f = textView;
        textView.setOnClickListener(new C93476bd(this));
        C89941l.m146512c(this.f260875f, 7362);
        return cardView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo87773w() {
        return R.layout.punt_card;
    }

    /* renamed from: x */
    public final void mo87774x() {
        this.f260875f.setVisibility(8);
    }

    /* renamed from: y */
    public final void mo87775y(int i) {
        this.f260874e.setText(i);
    }

    /* renamed from: z */
    public final void mo87776z(CharSequence charSequence) {
        this.f260874e.setText(charSequence);
    }
}
