package com.google.android.material.datepicker;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.x */
/* compiled from: PG */
final class C44651x implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44608ad f116331a;

    public C44651x(C44608ad adVar) {
        this.f116331a = adVar;
    }

    public final void onClick(View view) {
        Iterator it = this.f116331a.f116213a.iterator();
        while (it.hasNext()) {
            ((C44609ae) it.next()).mo19885a(this.f116331a.mo47840a().mo47800b());
        }
        this.f116331a.dismiss();
    }
}
