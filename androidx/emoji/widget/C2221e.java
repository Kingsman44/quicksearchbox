package androidx.emoji.widget;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji.p108a.C2192b;
import androidx.emoji.p108a.C2193c;
import androidx.emoji.p108a.C2200j;
import androidx.emoji.p108a.C2204n;
import androidx.p191s.p192a.p193a.C4081b;

/* renamed from: androidx.emoji.widget.e */
/* compiled from: PG */
final class C2221e extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f6277a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2221e(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i = 0;
        this.f6277a = textView;
        C2200j b = C2200j.m6088b();
        if (b.mo5514d() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C2193c cVar = b.f6227g;
            Bundle bundle = editorInfo.extras;
            C2192b bVar = (C2192b) cVar;
            C4081b bVar2 = bVar.f6214b.f6265a;
            int e = bVar2.mo8580e(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", e != 0 ? bVar2.f13069b.getInt(e + bVar2.f13068a) : i);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", bVar.f6215c.f6229i);
        }
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        if (C2204n.m6100b(this, this.f6277a.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (C2204n.m6100b(this, this.f6277a.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
