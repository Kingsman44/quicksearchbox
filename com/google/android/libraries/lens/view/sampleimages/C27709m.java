package com.google.android.libraries.lens.view.sampleimages;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.sampleimages.m */
/* compiled from: PG */
public final /* synthetic */ class C27709m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27711o f75655a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f75656b;

    public /* synthetic */ C27709m(C27711o oVar, View.OnClickListener onClickListener) {
        this.f75655a = oVar;
        this.f75656b = onClickListener;
    }

    public final void onClick(View view) {
        C27711o oVar = this.f75655a;
        View.OnClickListener onClickListener = this.f75656b;
        oVar.f75660a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        onClickListener.onClick(view);
    }
}
