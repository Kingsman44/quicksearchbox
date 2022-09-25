package com.google.android.setupdesign.p3554c;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: com.google.android.setupdesign.c.c */
/* compiled from: PG */
public final class C45290c extends ClickableSpan {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.setupdesign.p3554c.C45289b
            if (r0 == 0) goto L_0x000d
            r0 = r3
            com.google.android.setupdesign.c.b r0 = (com.google.android.setupdesign.p3554c.C45289b) r0
            boolean r0 = r0.mo49217a()
            if (r0 != 0) goto L_0x0029
        L_0x000d:
            android.content.Context r0 = r3.getContext()
        L_0x0011:
            boolean r1 = r0 instanceof com.google.android.setupdesign.p3554c.C45288a
            if (r1 == 0) goto L_0x0018
            com.google.android.setupdesign.c.a r0 = (com.google.android.setupdesign.p3554c.C45288a) r0
            goto L_0x0024
        L_0x0018:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L_0x0023
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0011
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x002d
            r0.mo49216a()
        L_0x0029:
            r3.cancelPendingInputEvents()
            goto L_0x0034
        L_0x002d:
            java.lang.String r0 = "LinkSpan"
            java.lang.String r1 = "Dropping click event. No listener attached."
            android.util.Log.w(r0, r1)
        L_0x0034:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0048
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.CharSequence r3 = r3.getText()
            boolean r0 = r3 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x0048
            android.text.Spannable r3 = (android.text.Spannable) r3
            r0 = 0
            android.text.Selection.setSelection(r3, r0)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.p3554c.C45290c.onClick(android.view.View):void");
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
