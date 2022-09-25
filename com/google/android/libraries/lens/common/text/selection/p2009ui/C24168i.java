package com.google.android.libraries.lens.common.text.selection.p2009ui;

import android.view.View;
import com.google.common.p4575r.C60752i;
import com.google.common.p4575r.C60757n;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.i */
/* compiled from: PG */
final class C24168i {

    /* renamed from: a */
    float f66044a = 1.0f;

    /* renamed from: b */
    final int f66045b;

    /* renamed from: c */
    final int f66046c;

    /* renamed from: d */
    final View f66047d;

    public C24168i(int i, int i2, View view) {
        this.f66045b = i;
        this.f66046c = i2;
        this.f66047d = view;
    }

    /* renamed from: k */
    private final float m44927k() {
        return ((float) (this.f66046c - this.f66045b)) / this.f66044a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo29609a() {
        return ((float) (this.f66046c - mo29615g())) / this.f66044a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo29610b(int i) {
        return C60752i.m92727a((mo29609a() - ((float) i)) / m44927k(), 0.0f, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final float mo29611c() {
        return ((float) this.f66045b) / this.f66044a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final float mo29612d() {
        return ((float) (mo29616h() - this.f66046c)) / this.f66044a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final float mo29613e(int i) {
        return C60752i.m92727a((((float) i) - mo29612d()) / m44927k(), 0.0f, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo29614f(int i) {
        return C60757n.m92742c(i, Math.max(0, (int) (((float) (-mo29615g())) / this.f66044a)), Math.min(this.f66047d.getWidth(), (int) (((float) mo29616h()) / this.f66044a)));
    }

    /* renamed from: g */
    public final int mo29615g() {
        int[] iArr = new int[2];
        this.f66047d.getLocationInWindow(iArr);
        return iArr[0];
    }

    /* renamed from: h */
    public final int mo29616h() {
        int[] iArr = new int[2];
        this.f66047d.getLocationInWindow(iArr);
        return this.f66047d.getRootView().getWidth() - iArr[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo29617i(int i) {
        return ((float) i) < mo29609a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo29618j(int i) {
        return ((float) i) > mo29612d();
    }
}
