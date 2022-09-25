package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.text.C24141q;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.bh */
/* compiled from: PG */
final class C27159bh implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ View f74234a;

    public C27159bh(View view) {
        this.f74234a = view;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f74234a.setVisibility(8);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            mo17910gl(new Throwable("TranslateResponse is empty"));
            return;
        }
        String d = new C58827ar(C24141q.m44840b()).mo56097d(guVar);
        if (d.isEmpty()) {
            mo17910gl(new Throwable("TranslateResponse is empty"));
            return;
        }
        View view = this.f74234a;
        TextView textView = (TextView) view.findViewById(R.id.translation_card_text);
        textView.setText(d);
        textView.setVisibility(0);
        ((ProgressBar) view.findViewById(R.id.translation_card_progress_bar)).setVisibility(8);
    }
}
