package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.aq.b.ae */
/* compiled from: PG */
final class C10498ae extends Property {
    public C10498ae(Class cls) {
        super(cls, "text");
    }

    public final /* synthetic */ Object get(Object obj) {
        return ((TextView) obj).getText();
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((TextView) obj).setText((CharSequence) obj2);
    }
}
