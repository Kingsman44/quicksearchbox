package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.i */
/* compiled from: PG */
public final /* synthetic */ class C129773i implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C129776l f356088a;

    /* renamed from: b */
    public final /* synthetic */ EditText f356089b;

    public /* synthetic */ C129773i(C129776l lVar, EditText editText) {
        this.f356088a = lVar;
        this.f356089b = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C129776l lVar = this.f356088a;
        EditText editText = this.f356089b;
        if (i != 4) {
            return false;
        }
        lVar.mo109250d(editText);
        lVar.mo109255i(editText, false);
        return true;
    }
}
