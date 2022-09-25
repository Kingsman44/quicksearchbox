package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.components.c.s */
/* compiled from: PG */
final class C20317s implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C19983f f57101a;

    /* renamed from: b */
    final /* synthetic */ C19983f f57102b;

    /* renamed from: c */
    final /* synthetic */ C20318t f57103c;

    public C20317s(C20318t tVar, C19983f fVar, C19983f fVar2) {
        this.f57103c = tVar;
        this.f57101a = fVar;
        this.f57102b = fVar2;
    }

    public final void onClick(View view) {
        C19983f fVar;
        C19983f fVar2;
        this.f57103c.f57106g.toggle();
        if (this.f57103c.f57106g.isChecked() && (fVar2 = this.f57101a) != null) {
            this.f57103c.f57105c.mo25440b(fVar2, (C56429h) null);
        } else if (!this.f57103c.f57106g.isChecked() && (fVar = this.f57102b) != null) {
            this.f57103c.f57105c.mo25440b(fVar, (C56429h) null);
        }
    }
}
