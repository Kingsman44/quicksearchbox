package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.j */
/* compiled from: PG */
final class C138608j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C138611m f376963a;

    /* renamed from: b */
    final /* synthetic */ View f376964b;

    /* renamed from: c */
    final /* synthetic */ EditText f376965c;

    public C138608j(C138611m mVar, View view, EditText editText) {
        this.f376963a = mVar;
        this.f376964b = view;
        this.f376965c = editText;
    }

    public final void onClick(View view) {
        this.f376963a.f376977h.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f376964b));
        Editable text = this.f376965c.getText();
        C69664n.m101060f(text, "searchBox.text");
        if (text.length() > 0) {
            this.f376963a.mo114405g(this.f376965c);
            this.f376963a.mo114404f(BuildConfig.FLAVOR);
            C138057n nVar = this.f376963a.f376973d;
            nVar.f375630a.mo114104b(Duration.ofNanos(nVar.f375631b.mo26872d()), "AGA");
        }
    }
}
