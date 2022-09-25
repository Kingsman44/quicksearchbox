package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.bv */
/* compiled from: PG */
public final /* synthetic */ class C117148bv implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117149bw f325215a;

    public /* synthetic */ C117148bv(C117149bw bwVar) {
        this.f325215a = bwVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117149bw bwVar = this.f325215a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TextView textView = (TextView) bwVar.mo28297il().findViewById(R.id.reset_button);
        textView.setClickable(booleanValue);
        textView.setTextColor(bwVar.f325216a.getColor(true != booleanValue ? R.color.reset_text_color_disabled : R.color.reset_text_color_enabled));
    }
}
