package com.google.android.apps.gsa.searchplate;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.apps.gsa.searchplate.p6966d.C88934f;
import com.google.android.apps.gsa.searchplate.p6966d.C88935g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchplate.g */
/* compiled from: PG */
public final class C88944g extends InputConnectionWrapper {

    /* renamed from: a */
    private final SimpleSearchText f240955a;

    public C88944g(InputConnection inputConnection, SimpleSearchText simpleSearchText) {
        super(inputConnection, true);
        this.f240955a = simpleSearchText;
    }

    public final boolean beginBatchEdit() {
        C58976aa aaVar = C58975e.f156826a;
        this.f240955a.onBeginBatchEdit();
        return super.beginBatchEdit();
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        C58976aa aaVar = C58975e.f156826a;
        this.f240955a.onCommitCompletion(completionInfo);
        commitText(completionInfo.getText(), completionInfo.getText().length() - 1);
        return super.commitCompletion(completionInfo);
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        C58976aa aaVar = C58975e.f156826a;
        SimpleSearchText simpleSearchText = this.f240955a;
        C88935g gVar = simpleSearchText.f240758e;
        Editable editableText = simpleSearchText.getEditableText();
        C88934f fVar = gVar.f240919a;
        if (fVar != null) {
            if (C88935g.m144540e(editableText)) {
                if (fVar.f240918g == 1) {
                    fVar.f240918g = 5;
                }
                fVar.f240916e = charSequence;
                fVar.f240914c = !TextUtils.equals(charSequence, C88935g.m144538c(editableText));
            } else if (charSequence != null && !(charSequence instanceof Spanned)) {
                if (!fVar.f240913b) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= charSequence.length()) {
                            break;
                        } else if (Character.isLetterOrDigit(charSequence.charAt(i2))) {
                            fVar.f240918g = 4;
                            fVar.f240916e = charSequence;
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    fVar.f240918g = 6;
                    fVar.f240916e = charSequence;
                }
                if (fVar.f240916e != null) {
                    fVar.f240917f = charSequence;
                }
            }
        }
        return super.commitText(charSequence, i);
    }

    public final boolean endBatchEdit() {
        C58976aa aaVar = C58975e.f156826a;
        this.f240955a.onEndBatchEdit();
        return super.endBatchEdit();
    }

    public final boolean finishComposingText() {
        C58976aa aaVar = C58975e.f156826a;
        SimpleSearchText simpleSearchText = this.f240955a;
        C88935g gVar = simpleSearchText.f240758e;
        Editable editableText = simpleSearchText.getEditableText();
        C88934f fVar = gVar.f240919a;
        if (fVar != null) {
            fVar.f240916e = C88935g.m144538c(editableText);
            fVar.f240915d = true;
        }
        return super.finishComposingText();
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        C58976aa aaVar = C58975e.f156826a;
        SimpleSearchText simpleSearchText = this.f240955a;
        C88935g gVar = simpleSearchText.f240758e;
        Editable editableText = simpleSearchText.getEditableText();
        C88934f fVar = gVar.f240919a;
        if (fVar != null) {
            fVar.f240918g = (charSequence.length() <= 1 || C88935g.m144540e(editableText)) ? 2 : 3;
        }
        return super.setComposingText(charSequence, i);
    }
}
