package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.google.android.libraries.aq.b.x */
/* compiled from: PG */
final class C10537x extends Property {
    public C10537x(Class cls) {
        super(cls, "text input showing");
    }

    /* renamed from: a */
    public static final InputMethodManager m25481a(EditText editText) {
        return (InputMethodManager) editText.getContext().getSystemService("input_method");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        EditText editText = (EditText) obj;
        Object tag = editText.getTag(editText.getId());
        boolean z = false;
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        EditText editText = (EditText) obj;
        Boolean bool = (Boolean) obj2;
        if (bool.booleanValue()) {
            editText.post(new C10536w(editText));
        } else {
            m25481a(editText).hideSoftInputFromWindow(editText.getWindowToken(), 0);
            editText.clearFocus();
        }
        editText.setTag(editText.getId(), bool);
    }
}
