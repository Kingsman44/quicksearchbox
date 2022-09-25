package com.google.apps.tiktok.tracing;

import java.util.Arrays;

/* renamed from: com.google.apps.tiktok.tracing.br */
/* compiled from: PG */
final class C47567br {

    /* renamed from: a */
    public final int[] f123441a;

    /* renamed from: b */
    public final C47565bp f123442b;

    /* renamed from: c */
    public C47565bp f123443c;

    /* renamed from: d */
    public int f123444d;

    /* renamed from: e */
    public int f123445e;

    /* renamed from: f */
    public int f123446f;

    public C47567br(int[] iArr) {
        this.f123441a = iArr;
        C47565bp bpVar = new C47565bp(-1, -1);
        this.f123442b = bpVar;
        this.f123443c = bpVar;
    }

    /* renamed from: d */
    private final void m84661d(C47565bp bpVar, StringBuilder sb) {
        for (C47565bp bpVar2 : bpVar.f123437d.values()) {
            sb.append("  ");
            sb.append(bpVar);
            sb.append(" -> ");
            sb.append(bpVar2);
            sb.append(" [label=\"");
            int[] iArr = this.f123441a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, bpVar2.f123434a, Math.min(iArr.length, bpVar2.f123435b + 1))));
            sb.append("\"]\n");
            m84661d(bpVar2, sb);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51430a() {
        C47565bp bpVar = this.f123443c.f123436c;
        if (bpVar != null) {
            this.f123443c = bpVar;
        } else {
            this.f123443c = this.f123442b;
            int i = this.f123445e;
            if (i > 0) {
                this.f123445e = i - 1;
            }
            if (this.f123446f > 0) {
                this.f123444d++;
            }
        }
        mo51431b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo51431b() {
        if (this.f123445e != 0) {
            C47565bp bpVar = (C47565bp) this.f123443c.f123437d.get(Integer.valueOf(this.f123441a[this.f123444d]));
            while (true) {
                int i = (bpVar.f123435b - bpVar.f123434a) + 1;
                int i2 = this.f123445e;
                if (i <= i2) {
                    int i3 = this.f123444d + i;
                    this.f123444d = i3;
                    this.f123443c = bpVar;
                    int i4 = i2 - i;
                    this.f123445e = i4;
                    if (i4 > 0) {
                        bpVar = (C47565bp) bpVar.f123437d.get(Integer.valueOf(this.f123441a[i3]));
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo51432c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int min = Math.min(this.f123441a.length, i2);
            if (min - i == Math.min(this.f123441a.length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    int[] iArr = this.f123441a;
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        m84661d(this.f123442b, sb);
        sb.append("}");
        return sb.toString();
    }
}
