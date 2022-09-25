package com.google.android.libraries.material.opensearchbar;

import android.view.View;
import androidx.core.p098j.C2082cp;
import com.google.android.material.internal.C44739bk;
import com.google.android.material.internal.C44740bl;
import com.google.android.material.internal.C44741bm;

/* renamed from: com.google.android.libraries.material.opensearchbar.e */
/* compiled from: PG */
public final /* synthetic */ class C28550e implements C44739bk {

    /* renamed from: a */
    public final /* synthetic */ OpenSearchView f77629a;

    public /* synthetic */ C28550e(OpenSearchView openSearchView) {
        this.f77629a = openSearchView;
    }

    /* renamed from: a */
    public final void mo34121a(View view, C2082cp cpVar, C44740bl blVar) {
        int i;
        int i2;
        OpenSearchView openSearchView = this.f77629a;
        boolean j = C44741bm.m79317j(openSearchView.f77605g);
        if (j) {
            i = blVar.f116604c;
        } else {
            i = blVar.f116602a;
        }
        if (j) {
            i2 = blVar.f116602a;
        } else {
            i2 = blVar.f116604c;
        }
        openSearchView.f77605g.setPadding(i + cpVar.mo5240b(), blVar.f116603b, i2 + cpVar.mo5241c(), blVar.f116605d);
    }
}
