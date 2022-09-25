package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ad */
/* compiled from: PG */
public final /* synthetic */ class C114099ad implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C114104ai f316188a;

    /* renamed from: b */
    public final /* synthetic */ C108232bc f316189b;

    /* renamed from: c */
    public final /* synthetic */ C108241bl f316190c;

    /* renamed from: d */
    public final /* synthetic */ int f316191d;

    public /* synthetic */ C114099ad(C114104ai aiVar, C108232bc bcVar, C108241bl blVar, int i) {
        this.f316188a = aiVar;
        this.f316189b = bcVar;
        this.f316190c = blVar;
        this.f316191d = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C114104ai aiVar = this.f316188a;
        C108232bc bcVar = this.f316189b;
        C108241bl blVar = this.f316190c;
        int i9 = this.f316191d;
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
                blVar.itemView.post(new C114101af(aiVar, i9));
            }
        }
    }
}
