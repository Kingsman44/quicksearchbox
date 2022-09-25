package com.google.android.libraries.componentview.components.p1689c;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.componentview.components.c.de */
/* compiled from: PG */
final class C20266de implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ C20269dh f56875a;

    public C20266de(C20269dh dhVar) {
        this.f56875a = dhVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        this.f56875a.mo25315i();
        return true;
    }
}
