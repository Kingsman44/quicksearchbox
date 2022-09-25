package android.support.p033v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: android.support.v7.widget.ai */
/* compiled from: PG */
final class C0511ai {
    /* renamed from: a */
    static void m1907a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof C0764jr) {
                    editorInfo.hintText = ((C0764jr) parent).mo3275a();
                    return;
                }
            }
        }
    }
}
