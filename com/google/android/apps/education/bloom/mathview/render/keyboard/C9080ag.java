package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.ag */
/* compiled from: PG */
final class C9080ag implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f31319a;

    /* renamed from: b */
    final /* synthetic */ View f31320b;

    /* renamed from: c */
    final /* synthetic */ Context f31321c;

    /* renamed from: d */
    final /* synthetic */ PopupWindow f31322d;

    public C9080ag(View.OnClickListener onClickListener, View view, Context context, PopupWindow popupWindow) {
        this.f31319a = onClickListener;
        this.f31320b = view;
        this.f31321c = context;
        this.f31322d = popupWindow;
    }

    public final void onClick(View view) {
        this.f31319a.onClick(view);
        this.f31320b.postDelayed(new C9079af(this.f31322d), (long) this.f31321c.getResources().getInteger(R.integer.keyboard_overflow_dismiss_delay_ms));
    }
}
