package com.google.android.apps.gsa.shared.p7148ui.p7150b;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.gsa.shared.ui.b.d */
/* compiled from: PG */
public final class C90655d {

    /* renamed from: a */
    public final C87680ah f253530a;

    /* renamed from: b */
    public int f253531b = 0;

    /* renamed from: c */
    public int f253532c = 0;

    /* renamed from: d */
    public int f253533d = 0;

    /* renamed from: e */
    public int f253534e = 0;

    /* renamed from: f */
    public C87739bu f253535f = C87739bu.UNKNOWN;

    /* renamed from: g */
    public C87739bu f253536g;

    /* renamed from: h */
    public C87739bu f253537h;

    /* renamed from: i */
    public C44565p f253538i;

    /* renamed from: j */
    private final Context f253539j;

    /* renamed from: k */
    private final ContextThemeWrapper f253540k;

    public C90655d(Context context, C87680ah ahVar) {
        C87739bu buVar = C87739bu.UNKNOWN;
        this.f253536g = buVar;
        this.f253537h = buVar;
        this.f253539j = context;
        this.f253530a = ahVar;
        this.f253540k = new ContextThemeWrapper(context, C10678R.style.Theme_GoogleMaterial_DayNight);
    }

    /* renamed from: a */
    public final void mo84948a() {
        if (this.f253531b != 0 && this.f253532c != 0 && this.f253533d != 0 && this.f253534e != 0) {
            C44565p pVar = new C44565p(this.f253540k);
            View inflate = LayoutInflater.from(this.f253539j).inflate(R.layout.bottom_dialog, (ViewGroup) null);
            pVar.setContentView(inflate);
            TypedValue typedValue = new TypedValue();
            this.f253539j.getResources().getValue(R.dimen.bottom_dialog_overlay_opacity, typedValue, true);
            Window window = pVar.getWindow();
            if (window != null) {
                window.addFlags(2);
                window.addFlags(134217728);
                window.setDimAmount(typedValue.getFloat());
            }
            if (inflate.getParent() instanceof FrameLayout) {
                BottomSheetBehavior.m78767C((FrameLayout) inflate.getParent()).mo47519v(3);
            }
            TextView textView = (TextView) pVar.mo1197b().mo1177e(R.id.bottom_dialog_text);
            if (textView != null) {
                textView.setText(this.f253531b);
            }
            ImageView imageView = (ImageView) pVar.mo1197b().mo1177e(R.id.bottom_dialog_icon);
            if (imageView != null) {
                imageView.setImageResource(this.f253532c);
            }
            TextView textView2 = (TextView) pVar.mo1197b().mo1177e(R.id.bottom_dialog_accept_button);
            if (textView2 != null) {
                textView2.setText(this.f253533d);
                textView2.setOnClickListener(new C90652a(this, pVar));
            }
            TextView textView3 = (TextView) pVar.mo1197b().mo1177e(R.id.bottom_dialog_decline_button);
            if (textView3 != null) {
                textView3.setText(this.f253534e);
                textView3.setOnClickListener(new C90653b(this, pVar));
            }
            pVar.setOnCancelListener(new C90654c(this));
            this.f253538i = pVar;
        }
    }
}
