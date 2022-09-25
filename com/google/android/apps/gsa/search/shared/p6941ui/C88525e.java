package com.google.android.apps.gsa.search.shared.p6941ui;

import android.content.Context;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.widget.EditText;
import com.google.android.apps.gsa.searchplate.p6963a.C88892b;
import com.google.android.apps.gsa.shared.util.CorrectionSpan;
import com.google.common.base.C58832aw;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.e */
/* compiled from: PG */
public final class C88525e implements C88892b {

    /* renamed from: a */
    private final int f239251a;

    /* renamed from: b */
    private CorrectionSpan f239252b;

    public C88525e(Context context) {
        this.f239251a = new EditText(context).getHighlightColor();
    }

    /* renamed from: g */
    private static CorrectionSpan m142991g(MotionEvent motionEvent, EditText editText) {
        int offsetForPosition = editText.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
        if (offsetForPosition >= editText.getText().length()) {
            return null;
        }
        CorrectionSpan[] correctionSpanArr = (CorrectionSpan[]) editText.getText().getSpans(offsetForPosition, offsetForPosition, CorrectionSpan.class);
        if (correctionSpanArr.length == 1) {
            return correctionSpanArr[0];
        }
        return null;
    }

    /* renamed from: a */
    public final void mo82153a(Spanned spanned, Editable editable) {
        if (editable != null) {
            for (CorrectionSpan removeSpan : (CorrectionSpan[]) editable.getSpans(0, editable.length(), CorrectionSpan.class)) {
                editable.removeSpan(removeSpan);
            }
            if (spanned != null) {
                for (CorrectionSpan correctionSpan : (CorrectionSpan[]) spanned.getSpans(0, spanned.length(), CorrectionSpan.class)) {
                    int spanStart = spanned.getSpanStart(correctionSpan);
                    int spanEnd = spanned.getSpanEnd(correctionSpan);
                    String obj = spanned.subSequence(spanStart, spanEnd).toString();
                    if (editable.length() >= spanEnd && editable.subSequence(spanStart, spanEnd).toString().equals(obj)) {
                        editable.setSpan(correctionSpan, spanStart, spanEnd, 33);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo82154b(EditText editText) {
        editText.setCursorVisible(true);
        editText.setLongClickable(true);
        editText.setCustomSelectionActionModeCallback((ActionMode.Callback) null);
        editText.setHighlightColor(this.f239251a);
    }

    /* renamed from: c */
    public final boolean mo82155c(MotionEvent motionEvent, EditText editText) {
        if (TextUtils.isEmpty(editText.getText())) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                CorrectionSpan g = m142991g(motionEvent, editText);
                if (g == null || !C58832aw.m90831a(this.f239252b, g)) {
                    this.f239252b = null;
                } else {
                    String str = g.f253765a;
                    Editable text = editText.getText();
                    text.replace(text.getSpanStart(g), text.getSpanEnd(g), str, 0, str.length());
                    text.removeSpan(g);
                    this.f239252b = null;
                    return true;
                }
            }
            return false;
        }
        CorrectionSpan g2 = m142991g(motionEvent, editText);
        this.f239252b = g2;
        if (g2 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo82156d() {
        return true;
    }

    /* renamed from: e */
    public final void mo82157e() {
    }

    /* renamed from: f */
    public final void mo82158f() {
    }
}
