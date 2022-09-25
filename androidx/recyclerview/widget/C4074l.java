package androidx.recyclerview.widget;

import android.support.p033v7.widget.LinearLayoutManager;
import java.util.Arrays;

/* renamed from: androidx.recyclerview.widget.l */
/* compiled from: PG */
public final class C4074l {

    /* renamed from: a */
    int f13044a;

    /* renamed from: b */
    int f13045b;

    /* renamed from: c */
    boolean f13046c;

    /* renamed from: d */
    boolean f13047d;

    /* renamed from: e */
    boolean f13048e;

    /* renamed from: f */
    int[] f13049f;

    /* renamed from: g */
    final /* synthetic */ DiscoverStaggeredGridLayoutManager f13050g;

    public C4074l(DiscoverStaggeredGridLayoutManager discoverStaggeredGridLayoutManager) {
        this.f13050g = discoverStaggeredGridLayoutManager;
        mo8550a();
    }

    /* renamed from: a */
    public final void mo8550a() {
        this.f13044a = -1;
        this.f13045b = LinearLayoutManager.INVALID_OFFSET;
        this.f13046c = false;
        this.f13047d = false;
        this.f13048e = false;
        int[] iArr = this.f13049f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
