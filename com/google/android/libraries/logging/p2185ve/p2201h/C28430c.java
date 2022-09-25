package com.google.android.libraries.logging.p2185ve.p2201h;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.logging.ve.h.c */
/* compiled from: PG */
public final /* synthetic */ class C28430c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C28431d f77203a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f77204b;

    public /* synthetic */ C28430c(C28431d dVar, View.OnClickListener onClickListener) {
        this.f77203a = dVar;
        this.f77204b = onClickListener;
    }

    public final void onClick(View view) {
        C28431d dVar = this.f77203a;
        View.OnClickListener onClickListener = this.f77204b;
        dVar.f77205a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        onClickListener.onClick(view);
    }
}
