package com.google.android.libraries.places.widget.internal.p2441ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.C1878d;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.j */
/* compiled from: PG */
final class C31935j implements View.OnFocusChangeListener {
    public final void onFocusChange(View view, boolean z) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) C1878d.m5129b(view.getContext(), InputMethodManager.class);
            if (inputMethodManager != null) {
                if (z) {
                    inputMethodManager.showSoftInput(view, 1);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }
}
