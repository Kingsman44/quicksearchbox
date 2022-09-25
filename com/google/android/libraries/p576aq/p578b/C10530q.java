package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.aq.b.q */
/* compiled from: PG */
final class C10530q extends Property {
    public C10530q(Class cls) {
        super(cls, "right margin");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((ViewGroup.MarginLayoutParams) ((View) obj).getLayoutParams()).rightMargin);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = ((Float) obj2).intValue();
        view.requestLayout();
    }
}
