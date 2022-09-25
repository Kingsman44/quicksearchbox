package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138584i;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.d */
/* compiled from: PG */
final class C138602d implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ EditText f376949a;

    public C138602d(EditText editText) {
        this.f376949a = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            Editable text = this.f376949a.getText();
            C69664n.m101060f(text, "searchBox.text");
            C47393f.m84237h(new C138584i(text), this.f376949a);
        }
    }
}
