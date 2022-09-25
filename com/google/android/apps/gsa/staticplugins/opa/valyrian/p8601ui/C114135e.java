package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.e */
/* compiled from: PG */
public final /* synthetic */ class C114135e implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C114137g f316364a;

    /* renamed from: b */
    public final /* synthetic */ C108232bc f316365b;

    /* renamed from: c */
    public final /* synthetic */ C108241bl f316366c;

    /* renamed from: d */
    public final /* synthetic */ int f316367d;

    public /* synthetic */ C114135e(C114137g gVar, C108232bc bcVar, C108241bl blVar, int i) {
        this.f316364a = gVar;
        this.f316365b = bcVar;
        this.f316366c = blVar;
        this.f316367d = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C114137g gVar = this.f316364a;
        C108232bc bcVar = this.f316365b;
        C108241bl blVar = this.f316366c;
        int i9 = this.f316367d;
        TextView textView = (TextView) view.findViewById(R.id.chatui_text);
        TextView textView2 = (TextView) view.findViewById(R.id.chatui_long_text);
        C108262cf cfVar = (C108262cf) bcVar;
        CharSequence charSequence = cfVar.f301174d;
        if (textView != null && textView2 != null && charSequence != null) {
            TextPaint paint = textView.getPaint();
            boolean z = cfVar.f301178h;
            boolean z2 = false;
            if (paint.measureText(charSequence, 0, charSequence.length()) > ((float) textView.getWidth())) {
                z2 = true;
            }
            if (z != z2) {
                cfVar.f301178h = z2;
                blVar.itemView.post(new C114133c(gVar, i9));
            }
        }
    }
}
