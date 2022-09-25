package com.google.android.apps.search.webglide.bottombar;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;

/* renamed from: com.google.android.apps.search.webglide.bottombar.h */
/* compiled from: PG */
public final class C142193h extends C0673gh {

    /* renamed from: g */
    public static final /* synthetic */ int f385752g = 0;

    /* renamed from: a */
    public final TextView f385753a;

    /* renamed from: b */
    public final ImageView f385754b;

    /* renamed from: c */
    public final ImageView f385755c;

    /* renamed from: d */
    public final TextView f385756d;

    /* renamed from: e */
    public final ConstraintLayout f385757e;

    /* renamed from: f */
    public final ConstraintLayout f385758f;

    public C142193h(View view, C47400m mVar, C28306ab abVar) {
        super(view);
        abVar.mo33802c(view, abVar.f76990a.mo33805a(C28427h.m53115a(151183)));
        this.f385753a = (TextView) view.findViewById(R.id.webglide_web_content_card_text);
        this.f385754b = (ImageView) view.findViewById(R.id.webglide_web_content_card_image);
        this.f385755c = (ImageView) view.findViewById(R.id.webglide_bottom_bar_card_publisher_icon);
        this.f385756d = (TextView) view.findViewById(R.id.webglide_bottom_bar_card_publisher_name);
        this.f385757e = (ConstraintLayout) view.findViewById(R.id.webglide_bottombar_selected_indicator);
        this.f385758f = (ConstraintLayout) view.findViewById(R.id.webglide_bottom_bar_card_attribution_container);
        mVar.mo51253b(view, new C142192g(this, view));
    }
}
