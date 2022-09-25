package com.google.android.setupcompat.internal;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;

/* renamed from: com.google.android.setupcompat.internal.c */
/* compiled from: PG */
public final class C45255c extends ContextThemeWrapper {
    public C45255c(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: protected */
    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, false);
    }
}
