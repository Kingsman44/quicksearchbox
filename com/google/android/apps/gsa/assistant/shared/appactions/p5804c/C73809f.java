package com.google.android.apps.gsa.assistant.shared.appactions.p5804c;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.assistant.shared.appactions.c.f */
/* compiled from: PG */
public final /* synthetic */ class C73809f implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ j f195111a;

    public /* synthetic */ C73809f(j jVar) {
        this.f195111a = jVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        j jVar = this.f195111a;
        if (i != 6) {
            return false;
        }
        jVar.g();
        return true;
    }
}
