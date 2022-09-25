package androidx.emoji.widget;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: androidx.emoji.widget.c */
/* compiled from: PG */
public final class C2219c {

    /* renamed from: a */
    public final C2218b f6273a;

    public C2219c(EditText editText) {
        this.f6273a = new C2217a(editText);
    }

    /* renamed from: a */
    public final InputConnection mo5535a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        C2218b bVar = this.f6273a;
        if (inputConnection instanceof C2221e) {
            return inputConnection;
        }
        return new C2221e(((C2217a) bVar).f6271a, inputConnection, editorInfo);
    }
}
