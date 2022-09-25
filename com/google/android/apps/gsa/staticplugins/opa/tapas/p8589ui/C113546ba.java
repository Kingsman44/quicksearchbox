package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gsa.assistant.shared.p.e;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.LiveDataResultReceiver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.ba */
/* compiled from: PG */
public final /* synthetic */ class C113546ba implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C113558bm f314347a;

    public /* synthetic */ C113546ba(C113558bm bmVar) {
        this.f314347a = bmVar;
    }

    public final void onClick(View view) {
        h hVar;
        C113558bm bmVar = this.f314347a;
        if (bmVar.mo99368y() && bmVar.f314414d != null) {
            LiveDataResultReceiver liveDataResultReceiver = new LiveDataResultReceiver();
            boolean hideSoftInputFromWindow = ((InputMethodManager) bmVar.f314412b.getSystemService("input_method")).hideSoftInputFromWindow(bmVar.f314414d.getWindowToken(), 0, liveDataResultReceiver);
            liveDataResultReceiver.f313590a.mo5704e(bmVar.f314413c, new C113534ap(bmVar));
            if (!hideSoftInputFromWindow && (hVar = bmVar.f314429s) != null) {
                hVar.b(e.e);
            }
        }
    }
}
