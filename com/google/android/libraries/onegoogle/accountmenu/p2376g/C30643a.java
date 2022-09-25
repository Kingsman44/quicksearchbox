package com.google.android.libraries.onegoogle.accountmenu.p2376g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.g.a */
/* compiled from: PG */
public final class C30643a {

    /* renamed from: a */
    public final int f82732a;

    /* renamed from: b */
    public final int f82733b;

    /* renamed from: c */
    public final int f82734c;

    /* renamed from: d */
    public final int f82735d;

    /* renamed from: e */
    public final int f82736e;

    /* renamed from: f */
    public final Drawable f82737f;

    /* renamed from: g */
    public final boolean f82738g;

    /* renamed from: h */
    public final boolean f82739h;

    /* renamed from: i */
    public final Drawable f82740i;

    public C30643a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C30644b.f82741a, R.attr.ogAccountMenuStyle, 2132149621);
        try {
            this.f82732a = obtainStyledAttributes.getColor(4, context.getResources().getColor(R.color.og_background_light));
            this.f82733b = obtainStyledAttributes.getColor(11, context.getResources().getColor(R.color.og_default_icon_color_light));
            this.f82734c = obtainStyledAttributes.getColor(12, context.getResources().getColor(R.color.og_incognito_top_tight_icon_color_light));
            this.f82735d = obtainStyledAttributes.getColor(9, context.getResources().getColor(R.color.og_menu_title_color_light));
            this.f82736e = obtainStyledAttributes.getColor(10, context.getResources().getColor(R.color.google_white));
            this.f82737f = C0678gm.m2375e().mo3100c(context, obtainStyledAttributes.getResourceId(1, R.drawable.og_account_menu_ripple_light));
            this.f82738g = obtainStyledAttributes.getBoolean(13, true);
            this.f82739h = obtainStyledAttributes.getBoolean(8, false);
            this.f82740i = C0678gm.m2375e().mo3100c(context, obtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
