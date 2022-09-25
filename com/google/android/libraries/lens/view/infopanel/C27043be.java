package com.google.android.libraries.lens.view.infopanel;

import android.support.p033v7.widget.C0508af;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.p119j.p120a.p121a.C2300b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.infopanel.be */
/* compiled from: PG */
final class C27043be implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f73704a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f73705b;

    /* renamed from: c */
    final /* synthetic */ C27051bm f73706c;

    public C27043be(C27051bm bmVar, ImageView imageView, ViewGroup viewGroup) {
        this.f73706c = bmVar;
        this.f73704a = imageView;
        this.f73705b = viewGroup;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo32484a() {
        C27051bm bmVar = this.f73706c;
        bmVar.f73734n = null;
        C0508af afVar = (C0508af) bmVar.f73725e.requireView().findViewById(R.id.multimodal_panel_input);
        Object systemService = bmVar.f73725e.getContext().getSystemService("input_method");
        systemService.getClass();
        afVar.setFocusableInTouchMode(true);
        afVar.requestFocus();
        ((InputMethodManager) systemService).showSoftInput(afVar, 1);
    }

    public final void onGlobalLayout() {
        this.f73704a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f73706c.f73734n = new C27050bl(this.f73704a, this.f73705b.findViewById(R.id.multimodal_panel_input_layout), this.f73706c.f73725e.getResources().getDimensionPixelSize(R.dimen.lens_info_panel_header_multimodal_thumbnail_size), this.f73706c.f73725e.getResources().getDimensionPixelSize(R.dimen.lens_info_panel_multimodal_panel_thumbnail_size), this.f73706c.f73726f, new C27042bd(this));
        C27050bl blVar = this.f73706c.f73734n;
        blVar.f73715a.animate().setDuration(200).setInterpolator(new C2300b()).setUpdateListener(new C27049bk(blVar)).start();
    }
}
