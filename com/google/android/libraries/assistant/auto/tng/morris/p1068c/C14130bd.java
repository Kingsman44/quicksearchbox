package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import android.widget.CompoundButton;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.bd */
/* compiled from: PG */
public final class C14130bd implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ CompoundButton.OnCheckedChangeListener f42840a;

    /* renamed from: b */
    final /* synthetic */ C14132bf f42841b;

    public C14130bd(C14132bf bfVar, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f42841b = bfVar;
        this.f42840a = onCheckedChangeListener;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C28443m mVar = this.f42841b.f42842a;
        C28440j h = C28442l.m53142h();
        h.mo33895b(C28442l.m53144j(compoundButton));
        mVar.mo33853c(h.mo33894a(), C28485y.m53234a(compoundButton));
        this.f42840a.onCheckedChanged(compoundButton, z);
    }
}
