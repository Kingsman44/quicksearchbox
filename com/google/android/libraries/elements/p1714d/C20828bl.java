package com.google.android.libraries.elements.p1714d;

import android.text.Editable;
import android.widget.EditText;
import com.facebook.litho.widget.C6526ed;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;

/* renamed from: com.google.android.libraries.elements.d.bl */
/* compiled from: PG */
final class C20828bl extends C6526ed {

    /* renamed from: b */
    private int f58350b;

    /* renamed from: c */
    private int f58351c;

    /* renamed from: d */
    private final C21357r f58352d;

    /* renamed from: e */
    private final C21313t f58353e;

    /* renamed from: f */
    private final C21319z f58354f;

    public C20828bl(C21357r rVar, C21313t tVar, C21319z zVar) {
        this.f58352d = rVar;
        this.f58353e = tVar;
        this.f58354f = zVar;
    }

    public final void afterTextChanged(Editable editable) {
        EditText editText;
        if (editable.subSequence(this.f58350b, this.f58351c).toString().contains("\n")) {
            int i = this.f58351c;
            if (editable.subSequence(i - 1, i).toString().equals("\n") && (editText = this.f19435a) != null) {
                this.f58353e.mo26124a(this.f58352d.mo26862a(), C20829bm.m39126b(editText, this.f58354f.mo26806h())).mo61453k();
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f58350b = i;
        this.f58351c = i + i3;
    }
}
