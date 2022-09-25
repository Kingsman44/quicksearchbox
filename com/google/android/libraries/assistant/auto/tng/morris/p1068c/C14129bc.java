package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.bc */
/* compiled from: PG */
public final class C14129bc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Optional f42837a;

    /* renamed from: b */
    final /* synthetic */ View.OnClickListener f42838b;

    /* renamed from: c */
    final /* synthetic */ C14132bf f42839c;

    public C14129bc(C14132bf bfVar, Optional optional, View.OnClickListener onClickListener) {
        this.f42839c = bfVar;
        this.f42837a = optional;
        this.f42838b = onClickListener;
    }

    public final void onClick(View view) {
        C28440j h = C28442l.m53142h();
        if (this.f42837a.isPresent()) {
            h.mo33895b(((C14131be) this.f42837a.get()).mo21443a());
        }
        this.f42839c.f42842a.mo33853c(h.mo33894a(), C28485y.m53234a(view));
        this.f42838b.onClick(view);
    }
}
