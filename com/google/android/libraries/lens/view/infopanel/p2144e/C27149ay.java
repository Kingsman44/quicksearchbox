package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.ay */
/* compiled from: PG */
final class C27149ay implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C27153bb f74183a;

    public C27149ay(C27153bb bbVar) {
        this.f74183a = bbVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f74183a.f74194d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f74183a.f74207q));
            return;
        }
        try {
            int parseInt = Integer.parseInt(this.f74183a.f74207q.getText().toString());
            if (parseInt <= 0) {
                this.f74183a.f74207q.setText(String.format(Locale.getDefault(), "%d", new Object[]{1}));
            } else {
                C27153bb bbVar = this.f74183a;
                bbVar.f74216z = parseInt;
                bbVar.mo32595f();
            }
        } catch (NumberFormatException unused) {
            C27153bb bbVar2 = this.f74183a;
            bbVar2.f74216z = 1;
            bbVar2.mo32595f();
        }
        this.f74183a.f74207q.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(this.f74183a.f74216z)}));
    }
}
