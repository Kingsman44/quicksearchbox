package com.android.recurrencepicker;

import android.text.TextWatcher;

/* renamed from: com.android.recurrencepicker.g */
/* compiled from: PG */
class C5483g implements TextWatcher {

    /* renamed from: a */
    private final int f16623a;

    /* renamed from: b */
    final /* synthetic */ RecurrencePickerBaseDialog f16624b;

    /* renamed from: c */
    private final int f16625c;

    public C5483g(RecurrencePickerBaseDialog recurrencePickerBaseDialog, int i, int i2) {
        this.f16624b = recurrencePickerBaseDialog;
        this.f16623a = i2;
        this.f16625c = i;
    }

    /* renamed from: a */
    public void mo11808a(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.toString()     // Catch:{ NumberFormatException -> 0x0009 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0009 }
            goto L_0x000b
        L_0x0009:
            int r0 = r4.f16625c
        L_0x000b:
            r1 = 0
            r2 = 1
            if (r0 > 0) goto L_0x0012
            r0 = 1
        L_0x0010:
            r3 = 1
            goto L_0x0019
        L_0x0012:
            int r3 = r4.f16623a
            if (r0 <= r3) goto L_0x0018
            r0 = r3
            goto L_0x0010
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 == 0) goto L_0x002f
            r5.clear()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2[r1] = r3
            java.lang.String r1 = "%d"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r5.append(r1)
        L_0x002f:
            com.android.recurrencepicker.RecurrencePickerBaseDialog r5 = r4.f16624b
            r5.mo11795f()
            r4.mo11808a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.recurrencepicker.C5483g.afterTextChanged(android.text.Editable):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
