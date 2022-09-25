package android.support.p033v7.widget;

import java.util.Arrays;

/* renamed from: android.support.v7.widget.ib */
/* compiled from: PG */
final class C0721ib {

    /* renamed from: a */
    int f2551a;

    /* renamed from: b */
    int f2552b;

    /* renamed from: c */
    boolean f2553c;

    /* renamed from: d */
    boolean f2554d;

    /* renamed from: e */
    boolean f2555e;

    /* renamed from: f */
    int[] f2556f;

    /* renamed from: g */
    final /* synthetic */ StaggeredGridLayoutManager f2557g;

    public C0721ib(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2557g = staggeredGridLayoutManager;
        mo3203a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3203a() {
        this.f2551a = -1;
        this.f2552b = LinearLayoutManager.INVALID_OFFSET;
        this.f2553c = false;
        this.f2554d = false;
        this.f2555e = false;
        int[] iArr = this.f2556f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
