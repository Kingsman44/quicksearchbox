package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.setupdesign.C45318g;

/* compiled from: PG */
public class HeaderRecyclerView extends RecyclerView {

    /* renamed from: a */
    public View f118409a;

    /* renamed from: b */
    private int f118410b;

    /* renamed from: c */
    private boolean f118411c = false;

    public HeaderRecyclerView(Context context) {
        super(context);
        m80783a((AttributeSet) null, 0);
    }

    /* renamed from: a */
    private final void m80783a(AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C45318g.f118389h, i, 0);
            this.f118410b = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r2 == false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.f118411c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            int r0 = r7.getAction()
            if (r0 != r1) goto L_0x0010
            r6.f118411c = r2
            goto L_0x008a
        L_0x0010:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x008b
            int r0 = r7.getKeyCode()
            r3 = 19
            r4 = 0
            r5 = 2
            if (r0 == r3) goto L_0x005a
            r3 = 20
            if (r0 == r3) goto L_0x0025
            goto L_0x0085
        L_0x0025:
            android.view.View r0 = r6.findFocus()
            if (r0 != 0) goto L_0x002c
            goto L_0x0085
        L_0x002c:
            int[] r3 = new int[r5]
            int[] r5 = new int[r5]
            r0.getLocationInWindow(r3)
            r6.getLocationInWindow(r5)
            r3 = r3[r1]
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
            r0 = r5[r1]
            int r5 = r6.getMeasuredHeight()
            int r0 = r0 + r5
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x0085
            int r0 = r6.getMeasuredHeight()
            float r0 = (float) r0
            r5 = 1060320051(0x3f333333, float:0.7)
            float r0 = r0 * r5
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r0, r3)
            r6.smoothScrollBy$ar$ds$a5e2b4f9_0(r2, r0, r4, r2)
            goto L_0x0084
        L_0x005a:
            android.view.View r0 = r6.findFocus()
            if (r0 != 0) goto L_0x0061
            goto L_0x0085
        L_0x0061:
            int[] r3 = new int[r5]
            int[] r5 = new int[r5]
            r0.getLocationInWindow(r3)
            r6.getLocationInWindow(r5)
            r0 = r3[r1]
            r3 = r5[r1]
            int r0 = r0 - r3
            if (r0 >= 0) goto L_0x0085
            int r3 = r6.getMeasuredHeight()
            float r3 = (float) r3
            r5 = -1087163597(0xffffffffbf333333, float:-0.7)
            float r3 = r3 * r5
            int r3 = (int) r3
            int r0 = java.lang.Math.max(r3, r0)
            r6.smoothScrollBy$ar$ds$a5e2b4f9_0(r2, r0, r4, r2)
        L_0x0084:
            r2 = 1
        L_0x0085:
            r6.f118411c = r2
            if (r2 != 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            return r1
        L_0x008b:
            boolean r7 = super.dispatchKeyEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.view.HeaderRecyclerView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.f118409a != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    public final void setAdapter(C0640fb fbVar) {
        if (!(this.f118409a == null || fbVar == null)) {
            C45323c cVar = new C45323c(fbVar);
            cVar.f118445a = this.f118409a;
            fbVar = cVar;
        }
        super.setAdapter(fbVar);
    }

    public final void setLayoutManager(C0653fo foVar) {
        super.setLayoutManager(foVar);
        if (foVar != null && this.f118409a == null && this.f118410b != 0) {
            this.f118409a = LayoutInflater.from(getContext()).inflate(this.f118410b, this, false);
        }
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80783a(attributeSet, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80783a(attributeSet, i);
    }
}
