package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.support.p033v7.widget.C0508af;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ActionEditText */
/* compiled from: PG */
public final class ActionEditText extends C0508af {
    public ActionEditText(Context context) {
        super(context);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -1073741825;
        editorInfo.imeOptions |= 6;
        return onCreateInputConnection;
    }

    public ActionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
