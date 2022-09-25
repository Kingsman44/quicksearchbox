package com.google.android.libraries.accountlinking.p10974a;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.accountlinking.a.a */
/* compiled from: PG */
public final /* synthetic */ class C147350a implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C147362c f397754a;

    public /* synthetic */ C147350a(C147362c cVar) {
        this.f397754a = cVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C147362c cVar = this.f397754a;
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (cVar.f397789d.canGoBack()) {
            cVar.f397789d.goBack();
            return true;
        }
        cVar.mo124126a();
        return true;
    }
}
