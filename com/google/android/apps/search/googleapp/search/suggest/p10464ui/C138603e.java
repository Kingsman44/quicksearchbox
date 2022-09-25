package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138585j;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.e */
/* compiled from: PG */
public final class C138603e implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ EditText f376950a;

    /* renamed from: b */
    final /* synthetic */ View f376951b;

    /* renamed from: c */
    final /* synthetic */ View f376952c;

    /* renamed from: d */
    final /* synthetic */ ImageButton f376953d;

    /* renamed from: e */
    final /* synthetic */ C138611m f376954e;

    public C138603e(EditText editText, View view, View view2, ImageButton imageButton, C138611m mVar) {
        this.f376950a = editText;
        this.f376951b = view;
        this.f376952c = view2;
        this.f376953d = imageButton;
        this.f376954e = mVar;
    }

    public final void afterTextChanged(Editable editable) {
        C138611m.m225071d(this.f376951b, this.f376950a, this.f376952c, this.f376953d, this.f376954e);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Editable text = this.f376950a.getText();
        C69664n.m101060f(text, "searchBox.text");
        C47393f.m84237h(new C138585j(text, this.f376950a.getSelectionStart(), this.f376950a.hasFocus()), this.f376950a);
    }
}
