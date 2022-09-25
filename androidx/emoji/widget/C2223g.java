package androidx.emoji.widget;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;
import androidx.emoji.p108a.C2196f;
import androidx.emoji.p108a.C2200j;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: androidx.emoji.widget.g */
/* compiled from: PG */
final class C2223g extends C2196f {

    /* renamed from: a */
    private final Reference f6279a;

    public C2223g(EditText editText) {
        this.f6279a = new WeakReference(editText);
    }

    /* renamed from: a */
    public final void mo5510a() {
        int i;
        EditText editText = (EditText) this.f6279a.get();
        if (editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2200j b = C2200j.m6088b();
            if (editableText == null) {
                i = 0;
            } else {
                i = editableText.length();
            }
            b.mo5515e(editableText, i);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }
}
