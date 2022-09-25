package com.google.android.libraries.assistant.slices;

import android.content.Context;
import android.widget.EditText;

/* renamed from: com.google.android.libraries.assistant.slices.d */
/* compiled from: PG */
final class C19228d extends EditText {

    /* renamed from: a */
    final /* synthetic */ C19230f f53832a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19228d(C19230f fVar, Context context) {
        super(context);
        this.f53832a = fVar;
    }

    /* access modifiers changed from: protected */
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (hasFocus()) {
            setSelection(getText().length());
        }
        this.f53832a.mo24319r(this);
    }
}
