package com.google.android.apps.gsa.assistant.settings.shared;

import android.content.Context;
import android.widget.Spinner;

/* renamed from: com.google.android.apps.gsa.assistant.settings.shared.t */
/* compiled from: PG */
final class C73776t extends Spinner {
    public C73776t(Context context) {
        super(context);
    }

    public final boolean performClick() {
        return !isEnabled() || super.performClick();
    }
}
