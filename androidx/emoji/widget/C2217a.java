package androidx.emoji.widget;

import android.text.method.KeyListener;
import android.widget.EditText;

/* renamed from: androidx.emoji.widget.a */
/* compiled from: PG */
final class C2217a extends C2218b {

    /* renamed from: a */
    public final EditText f6271a;

    /* renamed from: b */
    public final C2224h f6272b;

    public C2217a(EditText editText) {
        this.f6271a = editText;
        C2224h hVar = new C2224h(editText);
        this.f6272b = hVar;
        editText.addTextChangedListener(hVar);
        editText.setEditableFactory(C2220d.m6114a());
    }

    /* renamed from: a */
    public final KeyListener mo5534a(KeyListener keyListener) {
        return keyListener instanceof C2222f ? keyListener : new C2222f(keyListener);
    }
}
