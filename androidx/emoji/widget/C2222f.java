package androidx.emoji.widget;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: androidx.emoji.widget.f */
/* compiled from: PG */
final class C2222f implements KeyListener {

    /* renamed from: a */
    private final KeyListener f6278a;

    public C2222f(KeyListener keyListener) {
        this.f6278a = keyListener;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f6278a.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.f6278a.getInputType();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
        /*
            r3 = this;
            r0 = 67
            r1 = 1
            r2 = 0
            if (r6 == r0) goto L_0x0010
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto L_0x000b
            goto L_0x001a
        L_0x000b:
            boolean r0 = androidx.emoji.p108a.C2204n.m6099a(r5, r7, r1)
            goto L_0x0014
        L_0x0010:
            boolean r0 = androidx.emoji.p108a.C2204n.m6099a(r5, r7, r2)
        L_0x0014:
            if (r0 == 0) goto L_0x001a
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            goto L_0x0022
        L_0x001a:
            android.text.method.KeyListener r0 = r3.f6278a
            boolean r4 = r0.onKeyDown(r4, r5, r6, r7)
            if (r4 == 0) goto L_0x0023
        L_0x0022:
            return r1
        L_0x0023:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.widget.C2222f.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f6278a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f6278a.onKeyUp(view, editable, i, keyEvent);
    }
}
