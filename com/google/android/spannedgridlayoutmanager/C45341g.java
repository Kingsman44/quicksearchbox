package com.google.android.spannedgridlayoutmanager;

import android.support.p033v7.widget.C0661fw;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.spannedgridlayoutmanager.g */
/* compiled from: PG */
final class C45341g {

    /* renamed from: a */
    final int f118508a;

    /* renamed from: b */
    final SparseArray f118509b = new SparseArray();

    /* renamed from: c */
    final List f118510c = new ArrayList();

    /* renamed from: d */
    final /* synthetic */ SpannedGridLayoutManager f118511d;

    /* renamed from: e */
    private final int[] f118512e;

    /* renamed from: f */
    private final C0661fw f118513f;

    public C45341g(SpannedGridLayoutManager spannedGridLayoutManager, C0661fw fwVar, int i) {
        this.f118511d = spannedGridLayoutManager;
        this.f118512e = new int[spannedGridLayoutManager.f118469b.f118488a];
        this.f118513f = fwVar;
        this.f118508a = i;
    }

    /* renamed from: g */
    private final void m80850g(int i, int i2) {
        if (this.f118510c.size() < i + 1) {
            this.f118510c.add(Integer.valueOf(i2));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a A[EDGE_INSN: B:43:0x007a->B:25:0x007a ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    private final void m80851h() {
        /*
            r10 = this;
            java.util.List r0 = r10.f118510c
            int r0 = r0.size()
            android.util.SparseArray r1 = r10.f118509b
            int r1 = r1.size()
            r10.m80850g(r0, r1)
            r2 = 0
            r3 = r1
            r4 = 0
        L_0x0012:
            int r5 = r10.f118508a
            if (r3 >= r5) goto L_0x00b6
            android.support.v7.widget.fw r5 = r10.f118513f
            int r5 = r5.mo3024a(r3)
            r6 = -1
            if (r5 != r6) goto L_0x00b4
            r5 = 0
        L_0x0020:
            com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager r6 = r10.f118511d
            int r6 = r6.getChildCount()
            if (r5 >= r6) goto L_0x0049
            com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager r6 = r10.f118511d
            android.view.View r6 = r6.getChildAt(r5)
            com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager r7 = r10.f118511d
            int r7 = r7.getPosition(r6)
            if (r3 != r7) goto L_0x0046
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            com.google.android.spannedgridlayoutmanager.d r5 = (com.google.android.spannedgridlayoutmanager.C45338d) r5
            com.google.android.spannedgridlayoutmanager.h r6 = new com.google.android.spannedgridlayoutmanager.h
            int r7 = r5.f118495a
            int r5 = r5.f118496b
            r6.<init>(r7, r5)
            goto L_0x004b
        L_0x0046:
            int r5 = r5 + 1
            goto L_0x0020
        L_0x0049:
            com.google.android.spannedgridlayoutmanager.h r6 = com.google.android.spannedgridlayoutmanager.C45342h.f118514a
        L_0x004b:
            int r5 = r6.f118515b
            com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager r7 = r10.f118511d
            com.google.android.spannedgridlayoutmanager.b r7 = r7.f118469b
            int r7 = r7.f118488a
            if (r5 <= r7) goto L_0x0058
            r6.f118515b = r7
            r5 = r7
        L_0x0058:
            int r5 = r5 + r4
            if (r5 <= r7) goto L_0x0061
            int r0 = r0 + 1
            r10.m80850g(r0, r1)
        L_0x0060:
            r4 = 0
        L_0x0061:
            int[] r5 = r10.f118512e
            r5 = r5[r4]
            if (r5 <= r0) goto L_0x007a
            int r4 = r4 + 1
            int r5 = r6.f118515b
            int r5 = r5 + r4
            com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager r7 = r10.f118511d
            com.google.android.spannedgridlayoutmanager.b r7 = r7.f118469b
            int r7 = r7.f118488a
            if (r5 <= r7) goto L_0x0061
            int r0 = r0 + 1
            r10.m80850g(r0, r1)
            goto L_0x0060
        L_0x007a:
            android.util.SparseArray r5 = r10.f118509b
            com.google.android.spannedgridlayoutmanager.c r7 = new com.google.android.spannedgridlayoutmanager.c
            int r8 = r6.f118516c
            int r9 = r6.f118515b
            r7.<init>(r0, r8, r4, r9)
            r5.put(r3, r7)
            int r5 = r6.f118516c
            int r5 = r5 + r0
            r7 = 0
        L_0x008c:
            int r8 = r6.f118515b
            if (r7 >= r8) goto L_0x0099
            int[] r8 = r10.f118512e
            int r9 = r4 + r7
            r8[r9] = r5
            int r7 = r7 + 1
            goto L_0x008c
        L_0x0099:
            int r4 = r4 + r8
            int r3 = r3 + 1
            int[] r5 = r10.f118512e
            r5 = r5[r2]
            r6 = 1
        L_0x00a1:
            com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager r7 = r10.f118511d
            com.google.android.spannedgridlayoutmanager.b r7 = r7.f118469b
            int r7 = r7.f118488a
            if (r6 >= r7) goto L_0x00b6
            int[] r7 = r10.f118512e
            r7 = r7[r6]
            if (r5 == r7) goto L_0x00b1
            goto L_0x0012
        L_0x00b1:
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x00b4:
            r0 = 0
            throw r0
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.C45341g.m80851h():void");
    }

    /* renamed from: i */
    private final void m80852i(int i) {
        while (i >= this.f118510c.size() && this.f118509b.size() < this.f118508a) {
            m80851h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo49349a(int i) {
        if (i >= this.f118510c.size()) {
            m80852i(i);
        }
        if (this.f118510c.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f118510c.get(i)).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo49350b(int i) {
        int c = mo49351c(i);
        return (mo49354f(c) ? mo49349a(c) : this.f118508a) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo49351c(int i) {
        int a = mo49349a(i);
        do {
            i++;
            if (!mo49354f(i) || mo49349a(i) != a) {
                return i;
            }
            i++;
            break;
        } while (mo49349a(i) != a);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo49352d(int i) {
        if (i < this.f118508a) {
            return mo49353e(i).f118491a;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C45337c mo49353e(int i) {
        if (i < this.f118508a) {
            if (i >= this.f118509b.size()) {
                while (i >= this.f118509b.size()) {
                    m80851h();
                }
            }
            return (C45337c) this.f118509b.get(i);
        }
        throw new IndexOutOfBoundsException(String.format(Locale.US, "index: %d out of range.", new Object[]{Integer.valueOf(i)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo49354f(int i) {
        if (i >= this.f118510c.size()) {
            m80852i(i);
        }
        return i >= 0 && i < this.f118510c.size();
    }
}
