package com.google.android.material.datepicker;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.y */
/* compiled from: PG */
final class C44652y implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44608ad f116332a;

    public C44652y(C44608ad adVar) {
        this.f116332a = adVar;
    }

    public final void onClick(View view) {
        Iterator it = this.f116332a.f116214b.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        this.f116332a.dismiss();
    }
}
