package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.View;
import android.widget.EditText;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.aw */
/* compiled from: PG */
final class C27147aw implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ String f74180a;

    /* renamed from: b */
    final /* synthetic */ C27153bb f74181b;

    public C27147aw(C27153bb bbVar, String str) {
        this.f74181b = bbVar;
        this.f74180a = str;
    }

    public final void onFocusChange(View view, boolean z) {
        double d;
        if (z) {
            this.f74181b.f74206p.setText(this.f74181b.f74206p.getText().toString().replace(this.f74180a, BuildConfig.FLAVOR));
            C27153bb bbVar = this.f74181b;
            bbVar.f74206p.setFilters(bbVar.f74199i);
            this.f74181b.f74194d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f74181b.f74206p));
            return;
        }
        try {
            this.f74181b.mo32593d(Double.parseDouble(this.f74181b.f74206p.getText().toString().replace(this.f74180a, BuildConfig.FLAVOR)));
        } catch (NumberFormatException unused) {
            this.f74181b.mo32593d(C59203do.f157270a);
        }
        C27153bb bbVar2 = this.f74181b;
        bbVar2.f74206p.setFilters(bbVar2.f74200j);
        C27153bb bbVar3 = this.f74181b;
        EditText editText = bbVar3.f74206p;
        if (bbVar3.f74189A.isChecked()) {
            d = this.f74181b.f74214x;
        } else {
            d = this.f74181b.f74213w;
        }
        bbVar3.mo32591b(editText, d);
    }
}
