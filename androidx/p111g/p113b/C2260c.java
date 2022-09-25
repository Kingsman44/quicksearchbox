package androidx.p111g.p113b;

import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: androidx.g.b.c */
/* compiled from: PG */
public final class C2260c {

    /* renamed from: a */
    public final C2259b f6351a;

    public C2260c(EditText editText) {
        this.f6351a = new C2258a(editText);
    }

    /* renamed from: a */
    public final InputConnection mo5622a(InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        C2259b bVar = this.f6351a;
        if (inputConnection instanceof C2262e) {
            return inputConnection;
        }
        return new C2262e(((C2258a) bVar).f6349a, inputConnection);
    }
}
