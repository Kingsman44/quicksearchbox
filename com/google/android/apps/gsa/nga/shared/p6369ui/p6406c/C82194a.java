package com.google.android.apps.gsa.nga.shared.p6369ui.p6406c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.constraint.C0129a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.gsa.nga.api.a.bc;
import com.google.android.apps.gsa.nga.shared.p6303ac.C80551b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.c.a */
/* compiled from: PG */
public final class C82194a {

    /* renamed from: a */
    public final Context f224653a;

    /* renamed from: b */
    public final C80551b f224654b;

    public C82194a(Context context, C80551b bVar) {
        this.f224653a = context;
        this.f224654b = bVar;
    }

    /* renamed from: c */
    public static View m130504c(LayoutInflater layoutInflater, FrameLayout frameLayout, bc bcVar) {
        View inflate = layoutInflater.inflate(R.layout.nga_input_plate_left_icon, frameLayout, false);
        m130505d(inflate, bcVar);
        m130509h(inflate);
        return inflate;
    }

    /* renamed from: d */
    public static void m130505d(View view, bc bcVar) {
        ImageView imageView = (ImageView) view.findViewById(R.id.nga_input_plate_left_icon);
        bc bcVar2 = bc.a;
        if (bcVar.ordinal() != 2) {
            imageView.setImageResource(R.drawable.nga_assist_ic_zero_state);
        } else {
            imageView.setImageResource(R.drawable.dora_blue_lightbulb_default);
        }
    }

    /* renamed from: e */
    public static void m130506e(View view, boolean z) {
        View findViewById = view.findViewById(R.id.nga_input_plate_left_red_dot);
        if (z) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: f */
    public static void m130507f(ImageView imageView, int i) {
        int i2;
        bc bcVar = bc.a;
        if (i - 1 != 0) {
            i2 = C19391a.m36980a(imageView.getContext(), R.attr.colorOnSurfaceVariant);
        } else {
            i2 = C19391a.m36980a(imageView.getContext(), R.attr.colorOnBackground);
        }
        imageView.setImageTintList(ColorStateList.valueOf(i2));
    }

    /* renamed from: g */
    public static final ImageView m130508g(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ImageView imageView = (ImageView) layoutInflater.inflate(R.layout.nga_input_plate_right_icon, frameLayout, false);
        m130511j(imageView);
        return imageView;
    }

    /* renamed from: h */
    public static void m130509h(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.bottomMargin = view.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_icons_bottom_margin);
        view.setLayoutParams(layoutParams);
        View findViewById = view.findViewById(R.id.nga_input_plate_left_icon);
        int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_vertical_padding);
        int dimensionPixelOffset2 = view.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_horizontal_padding);
        findViewById.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
    }

    /* renamed from: i */
    public static final void m130510i(View view, int i) {
        m130507f((ImageView) view.findViewById(R.id.nga_input_plate_left_icon), i);
    }

    /* renamed from: j */
    public static void m130511j(ImageView imageView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_icons_width), imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_icons_height), 8388693);
        layoutParams.bottomMargin = imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_icons_bottom_margin);
        imageView.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final int mo75535a() {
        this.f224654b.mo74350a();
        return this.f224653a.getResources().getDimensionPixelOffset(R.dimen.assist_layer_any_nav_suggestion_bottom_margin);
    }

    /* renamed from: b */
    public final C0129a mo75536b() {
        C0129a aVar = new C0129a(this.f224653a.getResources().getDimensionPixelOffset(R.dimen.nga_assist_animated_logo_icon_width), this.f224653a.getResources().getDimensionPixelOffset(R.dimen.nga_assist_animated_logo_icon_height));
        aVar.f378k = 0;
        aVar.f371d = 0;
        aVar.f374g = 0;
        return aVar;
    }
}
