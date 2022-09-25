package com.google.android.apps.search.googleapp.search.suggest.feedback;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.aj */
/* compiled from: PG */
public final /* synthetic */ class C138092aj implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C138093ak f375706a;

    /* renamed from: b */
    public final /* synthetic */ EditText f375707b;

    /* renamed from: c */
    public final /* synthetic */ EditText f375708c;

    public /* synthetic */ C138092aj(C138093ak akVar, EditText editText, EditText editText2) {
        this.f375706a = akVar;
        this.f375707b = editText;
        this.f375708c = editText2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C138093ak akVar = this.f375706a;
        EditText editText = this.f375707b;
        EditText editText2 = this.f375708c;
        if (motionEvent.getActionMasked() != 2) {
            return false;
        }
        if (editText.hasFocus()) {
            editText.clearFocus();
            akVar.mo114140e(editText);
            return false;
        } else if (!editText2.hasFocus()) {
            return false;
        } else {
            editText2.clearFocus();
            akVar.mo114140e(editText2);
            return false;
        }
    }
}
