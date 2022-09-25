package androidx.p111g.p113b;

import android.widget.EditText;

/* renamed from: androidx.g.b.a */
/* compiled from: PG */
public final class C2258a extends C2259b {

    /* renamed from: a */
    public final EditText f6349a;

    /* renamed from: b */
    public final C2268k f6350b;

    public C2258a(EditText editText) {
        this.f6349a = editText;
        C2268k kVar = new C2268k(editText);
        this.f6350b = kVar;
        editText.addTextChangedListener(kVar);
        editText.setEditableFactory(C2261d.m6175a());
    }
}
