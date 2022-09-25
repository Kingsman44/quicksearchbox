package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.u */
/* compiled from: PG */
public final /* synthetic */ class C113704u implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ InterpreterKeyboardInputView f314904a;

    public /* synthetic */ C113704u(InterpreterKeyboardInputView interpreterKeyboardInputView) {
        this.f314904a = interpreterKeyboardInputView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        InterpreterKeyboardInputView interpreterKeyboardInputView = this.f314904a;
        if (i != 4) {
            return false;
        }
        interpreterKeyboardInputView.mo100403f();
        return true;
    }
}
