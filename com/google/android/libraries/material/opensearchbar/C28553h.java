package com.google.android.libraries.material.opensearchbar;

import android.widget.EditText;
import com.google.android.material.internal.C44741bm;

/* renamed from: com.google.android.libraries.material.opensearchbar.h */
/* compiled from: PG */
public final /* synthetic */ class C28553h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ OpenSearchView f77632a;

    public /* synthetic */ C28553h(OpenSearchView openSearchView) {
        this.f77632a = openSearchView;
    }

    public final void run() {
        OpenSearchView openSearchView = this.f77632a;
        openSearchView.f77608j.requestFocus();
        EditText editText = openSearchView.f77608j;
        C44741bm.m79311d(editText).showSoftInput(editText, 1);
    }
}
