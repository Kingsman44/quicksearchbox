package androidx.emoji.p108a;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.view.KeyEvent;
import androidx.core.graphics.C1939e;
import androidx.p191s.p192a.p193a.C4080a;

/* renamed from: androidx.emoji.a.n */
/* compiled from: PG */
public final class C2204n {

    /* renamed from: a */
    public final C2215y f6243a;

    /* renamed from: b */
    private final C2195e f6244b;

    public C2204n(C2215y yVar, C2195e eVar) {
        this.f6243a = yVar;
        this.f6244b = eVar;
    }

    /* renamed from: a */
    public static boolean m6099a(Editable editable, KeyEvent keyEvent, boolean z) {
        C2205o[] oVarArr;
        int length;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!m6102e(selectionStart, selectionEnd) && (oVarArr = (C2205o[]) editable.getSpans(selectionStart, selectionEnd, C2205o.class)) != null && (length = oVarArr.length) > 0) {
                int i = 0;
                while (i < length) {
                    C2205o oVar = oVarArr[i];
                    int spanStart = editable.getSpanStart(oVar);
                    int spanEnd = editable.getSpanEnd(oVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else if (spanEnd == selectionStart) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                    if (selectionStart <= spanStart || selectionStart >= spanEnd) {
                        i++;
                    } else {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        if (r11 != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007d, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0080;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6100b(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00ed
            if (r9 < 0) goto L_0x00ed
            if (r10 >= 0) goto L_0x0009
            goto L_0x00ed
        L_0x0009:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            boolean r3 = m6102e(r1, r2)
            if (r3 == 0) goto L_0x0018
            return r0
        L_0x0018:
            r3 = 1
            if (r11 == 0) goto L_0x00a4
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            r4 = -1
            if (r1 < 0) goto L_0x005a
            if (r11 >= r1) goto L_0x0029
            goto L_0x005a
        L_0x0029:
            if (r9 >= 0) goto L_0x002c
            goto L_0x005a
        L_0x002c:
            r11 = 0
        L_0x002d:
            if (r9 == 0) goto L_0x005b
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x0038
            if (r11 == 0) goto L_0x0036
            goto L_0x005a
        L_0x0036:
            r1 = 0
            goto L_0x005b
        L_0x0038:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x0048
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x0045
            goto L_0x005a
        L_0x0045:
            int r9 = r9 + -1
            goto L_0x002c
        L_0x0048:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0051
            int r9 = r9 + -1
            goto L_0x002d
        L_0x0051:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r11 = 1
            goto L_0x002d
        L_0x005a:
            r1 = -1
        L_0x005b:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x009d
            if (r10 >= r2) goto L_0x0068
            goto L_0x009d
        L_0x0068:
            if (r9 >= 0) goto L_0x006b
            goto L_0x009d
        L_0x006b:
            r11 = 0
        L_0x006c:
            if (r9 == 0) goto L_0x009b
            if (r2 < r10) goto L_0x0073
            if (r11 == 0) goto L_0x009e
            goto L_0x009d
        L_0x0073:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x0085
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0080
            goto L_0x009d
        L_0x0080:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006b
        L_0x0085:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0090
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006c
        L_0x0090:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x0097
            goto L_0x009d
        L_0x0097:
            int r2 = r2 + 1
            r11 = 1
            goto L_0x006c
        L_0x009b:
            r10 = r2
            goto L_0x009e
        L_0x009d:
            r10 = -1
        L_0x009e:
            if (r1 == r4) goto L_0x00a3
            if (r10 == r4) goto L_0x00a3
            goto L_0x00b2
        L_0x00a3:
            return r0
        L_0x00a4:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00b2:
            java.lang.Class<androidx.emoji.a.o> r9 = androidx.emoji.p108a.C2205o.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            androidx.emoji.a.o[] r9 = (androidx.emoji.p108a.C2205o[]) r9
            if (r9 == 0) goto L_0x00ed
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00ed
            r2 = 0
        L_0x00c0:
            if (r2 >= r11) goto L_0x00d7
            r4 = r9[r2]
            int r5 = r8.getSpanStart(r4)
            int r4 = r8.getSpanEnd(r4)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r4, r10)
            int r2 = r2 + 1
            goto L_0x00c0
        L_0x00d7:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            return r3
        L_0x00ed:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.p108a.C2204n.m6100b(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    /* renamed from: d */
    public static final void m6101d(Spannable spannable, C2201k kVar, int i, int i2) {
        spannable.setSpan(new C2216z(kVar), i, i2, 33);
    }

    /* renamed from: e */
    private static boolean m6102e(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: c */
    public final boolean mo5522c(CharSequence charSequence, int i, int i2, C2201k kVar) {
        if (kVar.f6234c == 0) {
            C2195e eVar = this.f6244b;
            C4080a a = kVar.mo5518a();
            int e = a.mo8580e(8);
            if (e != 0) {
                a.f13069b.getShort(e + a.f13068a);
            }
            if (C2202l.f6235a.get() == null) {
                C2202l.f6235a.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) C2202l.f6235a.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            kVar.f6234c = true != C1939e.m5252a(((C2202l) eVar).f6236b, sb.toString()) ? 1 : 2;
        }
        return kVar.f6234c == 2;
    }
}
