package com.google.android.libraries.lens.view.frozenimage;

import android.graphics.Bitmap;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.frozenimage.k */
/* compiled from: PG */
public final /* synthetic */ class C26279k implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26285q f71419a;

    public /* synthetic */ C26279k(C26285q qVar) {
        this.f71419a = qVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26285q qVar = this.f71419a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            if (!((C25533p) axVar.mo56107c()).mo30572d().isDone()) {
                C58833ax b = ((C25533p) axVar.mo56107c()).mo30570b();
                if (b.mo56113h()) {
                    qVar.mo31485c((Bitmap) b.mo56107c());
                } else {
                    qVar.mo31483a();
                }
            }
            ((C25533p) axVar.mo56107c()).mo30588g(new C26278j(qVar));
            return;
        }
        qVar.f71430f.setVisibility(8);
        qVar.mo31484b();
    }
}
