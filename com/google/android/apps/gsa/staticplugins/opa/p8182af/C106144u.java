package com.google.android.apps.gsa.staticplugins.opa.p8182af;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.af.u */
/* compiled from: PG */
final class C106144u extends Property {
    public C106144u() {
        super(Integer.class, "Height");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((View) obj).getHeight());
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.getLayoutParams().height = ((Integer) obj2).intValue();
        view.requestLayout();
    }
}
