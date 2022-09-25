package com.google.android.libraries.p1649b.p1650a;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19631e;

/* renamed from: com.google.android.libraries.b.a.a */
/* compiled from: PG */
public final class C19604a extends C0658ft {

    /* renamed from: a */
    final int f54541a;

    /* renamed from: b */
    final /* synthetic */ boolean f54542b;

    /* renamed from: c */
    final /* synthetic */ boolean f54543c;

    /* renamed from: d */
    final /* synthetic */ C19605b f54544d;

    /* renamed from: e */
    private int f54545e = 0;

    /* renamed from: f */
    private int f54546f = 0;

    /* renamed from: g */
    private int f54547g = 0;

    public C19604a(C19605b bVar, boolean z, boolean z2) {
        this.f54544d = bVar;
        this.f54542b = z;
        this.f54543c = z2;
        this.f54541a = z ? 1 : 0;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        if (i != this.f54547g && i == 0) {
            int i3 = this.f54545e;
            if (i3 != 0) {
                i2 = i3;
            } else if (this.f54546f != 0) {
                i2 = 0;
            }
            this.f54544d.mo24921c(new C19623a(6), new C19631e(recyclerView, this.f54543c, this.f54541a, i2, this.f54546f));
            this.f54545e = 0;
            this.f54546f = 0;
        }
        this.f54547g = i;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.f54545e += i;
        this.f54546f += i2;
    }
}
