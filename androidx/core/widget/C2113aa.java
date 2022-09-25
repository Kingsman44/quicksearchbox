package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.p098j.C2011ae;
import androidx.core.p098j.C2096k;

/* renamed from: androidx.core.widget.aa */
/* compiled from: PG */
public final class C2113aa implements C2011ae {
    /* renamed from: a */
    public final C2096k mo5174a(View view, C2096k kVar) {
        CharSequence charSequence;
        if (Log.isLoggable("ReceiveContent", 3)) {
            new StringBuilder("onReceive: ").append(kVar);
            Log.d("ReceiveContent", "onReceive: ".concat(String.valueOf(kVar)));
        }
        if (kVar.f6012a.mo5263b() == 2) {
            return kVar;
        }
        ClipData c = kVar.f6012a.mo5264c();
        int a = kVar.f6012a.mo5262a();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < c.getItemCount(); i++) {
            ClipData.Item itemAt = c.getItemAt(i);
            if ((a & 1) != 0) {
                charSequence = itemAt.coerceToText(context);
                if (charSequence instanceof Spanned) {
                    charSequence = charSequence.toString();
                }
            } else {
                charSequence = itemAt.coerceToStyledText(context);
            }
            if (charSequence != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, charSequence);
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequence);
                }
                z = true;
            }
        }
        return null;
    }
}
