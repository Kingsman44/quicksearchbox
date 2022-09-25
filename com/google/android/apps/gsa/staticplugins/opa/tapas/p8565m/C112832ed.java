package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ed */
/* compiled from: PG */
public final /* synthetic */ class C112832ed implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C112849eu f312727a;

    public /* synthetic */ C112832ed(C112849eu euVar) {
        this.f312727a = euVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C112849eu euVar = this.f312727a;
        C59071e eVar = C112851ew.f312789a;
        if (i != 4) {
            return false;
        }
        String obj = textView.getText().toString();
        if (obj.isEmpty()) {
            return true;
        }
        euVar.mo99752a(obj);
        return true;
    }
}
