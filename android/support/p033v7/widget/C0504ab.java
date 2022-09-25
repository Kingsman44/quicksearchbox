package android.support.p033v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.widget.C2118e;

/* renamed from: android.support.v7.widget.ab */
/* compiled from: PG */
final class C0504ab {

    /* renamed from: a */
    public PorterDuff.Mode f2033a = null;

    /* renamed from: b */
    public boolean f2034b = false;

    /* renamed from: c */
    public boolean f2035c = false;

    /* renamed from: d */
    private final CompoundButton f2036d;

    /* renamed from: e */
    private boolean f2037e;

    public C0504ab(CompoundButton compoundButton) {
        this.f2036d = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2473a() {
        Drawable a = C2118e.m5881a(this.f2036d);
        if (a == null) {
            return;
        }
        if (this.f2034b || this.f2035c) {
            Drawable mutate = a.mutate();
            if (this.f2034b) {
                C1929b.m5226g(mutate, (ColorStateList) null);
            }
            if (this.f2035c) {
                C1929b.m5227h(mutate, this.f2033a);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2036d.getDrawableState());
            }
            this.f2036d.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|8|9|(1:13)|14|(1:16)|17|(1:19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0040 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2474b(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f2036d
            android.content.Context r0 = r0.getContext()
            int[] r1 = android.support.p033v7.p034a.C0338a.f1077m
            r2 = 0
            android.support.v7.widget.ip r0 = android.support.p033v7.widget.C0735ip.m2473f(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f2036d
            android.content.Context r4 = r3.getContext()
            int[] r5 = android.support.p033v7.p034a.C0338a.f1077m
            android.content.res.TypedArray r7 = r0.f2596b
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.p098j.C2043bi.m5525S(r3, r4, r5, r6, r7, r8, r9)
            android.content.res.TypedArray r11 = r0.f2596b     // Catch:{ all -> 0x0093 }
            r12 = 1
            boolean r11 = r11.hasValue(r12)     // Catch:{ all -> 0x0093 }
            if (r11 == 0) goto L_0x0040
            android.content.res.TypedArray r11 = r0.f2596b     // Catch:{ all -> 0x0093 }
            int r11 = r11.getResourceId(r12, r2)     // Catch:{ all -> 0x0093 }
            if (r11 == 0) goto L_0x0040
            android.widget.CompoundButton r12 = r10.f2036d     // Catch:{ NotFoundException -> 0x0040 }
            android.content.Context r1 = r12.getContext()     // Catch:{ NotFoundException -> 0x0040 }
            android.support.v7.widget.gm r3 = android.support.p033v7.widget.C0678gm.m2375e()     // Catch:{ NotFoundException -> 0x0040 }
            android.graphics.drawable.Drawable r11 = r3.mo3100c(r1, r11)     // Catch:{ NotFoundException -> 0x0040 }
            r12.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0040 }
            goto L_0x0061
        L_0x0040:
            android.content.res.TypedArray r11 = r0.f2596b     // Catch:{ all -> 0x0093 }
            boolean r11 = r11.hasValue(r2)     // Catch:{ all -> 0x0093 }
            if (r11 == 0) goto L_0x0061
            android.content.res.TypedArray r11 = r0.f2596b     // Catch:{ all -> 0x0093 }
            int r11 = r11.getResourceId(r2, r2)     // Catch:{ all -> 0x0093 }
            if (r11 == 0) goto L_0x0061
            android.widget.CompoundButton r12 = r10.f2036d     // Catch:{ all -> 0x0093 }
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x0093 }
            android.support.v7.widget.gm r2 = android.support.p033v7.widget.C0678gm.m2375e()     // Catch:{ all -> 0x0093 }
            android.graphics.drawable.Drawable r11 = r2.mo3100c(r1, r11)     // Catch:{ all -> 0x0093 }
            r12.setButtonDrawable(r11)     // Catch:{ all -> 0x0093 }
        L_0x0061:
            android.content.res.TypedArray r11 = r0.f2596b     // Catch:{ all -> 0x0093 }
            r12 = 2
            boolean r11 = r11.hasValue(r12)     // Catch:{ all -> 0x0093 }
            if (r11 == 0) goto L_0x0073
            android.widget.CompoundButton r11 = r10.f2036d     // Catch:{ all -> 0x0093 }
            android.content.res.ColorStateList r12 = r0.mo3245a(r12)     // Catch:{ all -> 0x0093 }
            androidx.core.widget.C2117d.m5879c(r11, r12)     // Catch:{ all -> 0x0093 }
        L_0x0073:
            android.content.res.TypedArray r11 = r0.f2596b     // Catch:{ all -> 0x0093 }
            r12 = 3
            boolean r11 = r11.hasValue(r12)     // Catch:{ all -> 0x0093 }
            if (r11 == 0) goto L_0x008d
            android.widget.CompoundButton r11 = r10.f2036d     // Catch:{ all -> 0x0093 }
            android.content.res.TypedArray r1 = r0.f2596b     // Catch:{ all -> 0x0093 }
            r2 = -1
            int r12 = r1.getInt(r12, r2)     // Catch:{ all -> 0x0093 }
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = android.support.p033v7.widget.C0571cn.m2114a(r12, r1)     // Catch:{ all -> 0x0093 }
            androidx.core.widget.C2117d.m5880d(r11, r12)     // Catch:{ all -> 0x0093 }
        L_0x008d:
            android.content.res.TypedArray r11 = r0.f2596b
            r11.recycle()
            return
        L_0x0093:
            r11 = move-exception
            android.content.res.TypedArray r12 = r0.f2596b
            r12.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0504ab.mo2474b(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo2475c() {
        if (this.f2037e) {
            this.f2037e = false;
            return;
        }
        this.f2037e = true;
        mo2473a();
    }
}
