package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.aq.b.r */
/* compiled from: PG */
final class C10531r extends Property {
    public C10531r(Class cls) {
        super(cls, "bottom margin");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((ViewGroup.MarginLayoutParams) ((View) obj).getLayoutParams()).bottomMargin);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin = ((Float) obj2).intValue();
        view.requestLayout();
    }
}
