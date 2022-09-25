package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.p2067ak.C25204aj;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.at */
/* compiled from: PG */
final class C27144at implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ String f74176a;

    /* renamed from: b */
    final /* synthetic */ C27153bb f74177b;

    public C27144at(C27153bb bbVar, String str) {
        this.f74177b = bbVar;
        this.f74176a = str;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C27153bb bbVar = this.f74177b;
            bbVar.f74205o.setFilters(bbVar.f74197g);
            this.f74177b.f74205o.setText(this.f74177b.f74205o.getText().toString().replace(this.f74176a, BuildConfig.FLAVOR));
            this.f74177b.f74194d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f74177b.f74205o));
            return;
        }
        String replace = this.f74177b.f74205o.getText().toString().replace(this.f74176a, BuildConfig.FLAVOR);
        try {
            C27153bb bbVar2 = this.f74177b;
            double parseInt = (double) Integer.parseInt(replace);
            Double.isNaN(parseInt);
            bbVar2.f74215y = parseInt / 100.0d;
            bbVar2.mo32595f();
        } catch (NumberFormatException unused) {
            C27153bb bbVar3 = this.f74177b;
            bbVar3.f74215y = C59203do.f157270a;
            bbVar3.mo32595f();
        }
        C27153bb bbVar4 = this.f74177b;
        bbVar4.f74205o.setFilters(bbVar4.f74198h);
        C27153bb bbVar5 = this.f74177b;
        int i = (int) (bbVar5.f74215y * 100.0d);
        bbVar5.mo32592c(bbVar5.f74205o, i);
        this.f74177b.f74192b.f68662a.mo30363c(new C25204aj(i));
    }
}
