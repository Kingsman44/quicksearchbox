package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p */
/* compiled from: PG */
final class C136098p extends Property {
    public C136098p(Class cls) {
        super(cls, "backgroundAlpha");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((View) obj).getBackground().getAlpha());
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).getBackground().setAlpha(((Integer) obj2).intValue());
    }
}
