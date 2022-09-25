package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bc */
/* compiled from: PG */
public final class C93475bc extends C93507m implements C93690o {

    /* renamed from: e */
    WebImageView f260870e;

    /* renamed from: f */
    TextView f260871f;

    /* renamed from: g */
    TextView f260872g;

    public C93475bc(Context context) {
        super(context, "PromoButtonCard");
    }

    /* renamed from: t */
    public final View mo87752t(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.promo_action_button, viewGroup, false);
        this.f260871f = (TextView) inflate.findViewById(R.id.promo_card_title);
        this.f260872g = (TextView) inflate.findViewById(R.id.promo_card_subtitle);
        WebImageView webImageView = (WebImageView) inflate.findViewById(R.id.promo_card_image);
        this.f260870e = webImageView;
        this.f260871f.getClass();
        this.f260872g.getClass();
        webImageView.getClass();
        setClickable(false);
        C89941l.m146512c(inflate, 18448);
        return inflate;
    }
}
