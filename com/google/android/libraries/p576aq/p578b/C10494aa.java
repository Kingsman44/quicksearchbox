package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.widget.CompoundButton;

/* renamed from: com.google.android.libraries.aq.b.aa */
/* compiled from: PG */
final class C10494aa extends Property {
    public C10494aa(Class cls) {
        super(cls, "checked");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Boolean.valueOf(((CompoundButton) obj).isChecked());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((CompoundButton) obj).setChecked(((Boolean) obj2).booleanValue());
    }
}
