package com.google.android.apps.search.podcasts.language;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.google.android.apps.search.podcasts.language.m */
/* compiled from: PG */
final class C140548m implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ C140539e f381718a;

    public C140548m(C140539e eVar) {
        this.f381718a = eVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        this.f381718a.mo115723c();
        return false;
    }
}
