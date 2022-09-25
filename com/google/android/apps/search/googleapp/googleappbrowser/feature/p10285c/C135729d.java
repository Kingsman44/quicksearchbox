package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c;

import android.view.View;
import android.widget.EditText;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.c.d */
/* compiled from: PG */
public final /* synthetic */ class C135729d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C135732g f369701a;

    /* renamed from: b */
    public final /* synthetic */ View f369702b;

    public /* synthetic */ C135729d(C135732g gVar, View view) {
        this.f369701a = gVar;
        this.f369702b = view;
    }

    public final void run() {
        C135732g gVar = this.f369701a;
        EditText editText = (EditText) this.f369702b.findViewById(R.id.googleapp_browser_findinpage_searchbox);
        editText.requestFocus();
        gVar.f369708c.showSoftInput(editText, 1);
    }
}
