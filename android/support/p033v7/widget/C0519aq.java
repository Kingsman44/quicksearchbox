package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.aq */
/* compiled from: PG */
public class C0519aq extends SeekBar {

    /* renamed from: a */
    private final C0520ar f2072a;

    public C0519aq(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0520ar arVar = this.f2072a;
        Drawable drawable = arVar.f2074c;
        if (drawable != null && drawable.isStateful() && drawable.setState(arVar.f2073b.getDrawableState())) {
            arVar.f2073b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2072a.f2074c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            super.onDraw(r8)     // Catch:{ all -> 0x0073 }
            android.support.v7.widget.ar r0 = r7.f2072a     // Catch:{ all -> 0x0073 }
            android.graphics.drawable.Drawable r1 = r0.f2074c     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0071
            android.widget.SeekBar r1 = r0.f2073b     // Catch:{ all -> 0x0073 }
            int r1 = r1.getMax()     // Catch:{ all -> 0x0073 }
            r2 = 1
            if (r1 <= r2) goto L_0x0071
            android.graphics.drawable.Drawable r3 = r0.f2074c     // Catch:{ all -> 0x0073 }
            int r3 = r3.getIntrinsicWidth()     // Catch:{ all -> 0x0073 }
            android.graphics.drawable.Drawable r4 = r0.f2074c     // Catch:{ all -> 0x0073 }
            int r4 = r4.getIntrinsicHeight()     // Catch:{ all -> 0x0073 }
            if (r3 < 0) goto L_0x0023
            int r3 = r3 >> r2
            goto L_0x0024
        L_0x0023:
            r3 = 1
        L_0x0024:
            if (r4 < 0) goto L_0x0028
            int r2 = r4 >> 1
        L_0x0028:
            android.graphics.drawable.Drawable r4 = r0.f2074c     // Catch:{ all -> 0x0073 }
            int r5 = -r3
            int r6 = -r2
            r4.setBounds(r5, r6, r3, r2)     // Catch:{ all -> 0x0073 }
            android.widget.SeekBar r2 = r0.f2073b     // Catch:{ all -> 0x0073 }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x0073 }
            android.widget.SeekBar r3 = r0.f2073b     // Catch:{ all -> 0x0073 }
            int r3 = r3.getPaddingLeft()     // Catch:{ all -> 0x0073 }
            int r2 = r2 - r3
            android.widget.SeekBar r3 = r0.f2073b     // Catch:{ all -> 0x0073 }
            int r3 = r3.getPaddingRight()     // Catch:{ all -> 0x0073 }
            int r2 = r2 - r3
            float r2 = (float) r2     // Catch:{ all -> 0x0073 }
            float r3 = (float) r1     // Catch:{ all -> 0x0073 }
            float r2 = r2 / r3
            int r3 = r8.save()     // Catch:{ all -> 0x0073 }
            android.widget.SeekBar r4 = r0.f2073b     // Catch:{ all -> 0x0073 }
            int r4 = r4.getPaddingLeft()     // Catch:{ all -> 0x0073 }
            float r4 = (float) r4     // Catch:{ all -> 0x0073 }
            android.widget.SeekBar r5 = r0.f2073b     // Catch:{ all -> 0x0073 }
            int r5 = r5.getHeight()     // Catch:{ all -> 0x0073 }
            int r5 = r5 / 2
            float r5 = (float) r5     // Catch:{ all -> 0x0073 }
            r8.translate(r4, r5)     // Catch:{ all -> 0x0073 }
            r4 = 0
        L_0x005e:
            if (r4 > r1) goto L_0x006c
            android.graphics.drawable.Drawable r5 = r0.f2074c     // Catch:{ all -> 0x0073 }
            r5.draw(r8)     // Catch:{ all -> 0x0073 }
            r5 = 0
            r8.translate(r2, r5)     // Catch:{ all -> 0x0073 }
            int r4 = r4 + 1
            goto L_0x005e
        L_0x006c:
            r8.restoreToCount(r3)     // Catch:{ all -> 0x0073 }
            monitor-exit(r7)
            return
        L_0x0071:
            monitor-exit(r7)
            return
        L_0x0073:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0077
        L_0x0076:
            throw r8
        L_0x0077:
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0519aq.onDraw(android.graphics.Canvas):void");
    }

    public C0519aq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public C0519aq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0730ik.m2467d(this, getContext());
        C0520ar arVar = new C0520ar(this);
        this.f2072a = arVar;
        arVar.mo2512b(attributeSet, i);
    }
}
