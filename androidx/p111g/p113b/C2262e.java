package androidx.p111g.p113b;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.p111g.p112a.C2253a;
import androidx.p111g.p112a.C2254b;

/* renamed from: androidx.g.b.e */
/* compiled from: PG */
final class C2262e extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f6355a;

    public C2262e(TextView textView, InputConnection inputConnection) {
        super(inputConnection, false);
        this.f6355a = textView;
        C2253a aVar = C2253a.f6344b;
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        if (C2254b.m6167b(this, this.f6355a.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (C2254b.m6167b(this, this.f6355a.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
