package com.google.android.libraries.material.opensearchbar;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.material.opensearchbar.j */
/* compiled from: PG */
public final /* synthetic */ class C28555j implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ OpenSearchView f77636a;

    public /* synthetic */ C28555j(OpenSearchView openSearchView) {
        this.f77636a = openSearchView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        OpenSearchView openSearchView = this.f77636a;
        if (!openSearchView.mo34109k()) {
            return false;
        }
        openSearchView.mo34101c();
        return false;
    }
}
