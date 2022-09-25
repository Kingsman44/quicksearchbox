package com.google.android.spannedgridlayoutmanager;

import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0670ge;

/* renamed from: com.google.android.spannedgridlayoutmanager.f */
/* compiled from: PG */
final class C45340f {

    /* renamed from: a */
    C0661fw f118499a;

    /* renamed from: b */
    C0670ge f118500b;

    /* renamed from: c */
    int f118501c;

    /* renamed from: d */
    int f118502d;

    /* renamed from: e */
    int f118503e;

    /* renamed from: f */
    boolean f118504f;

    /* renamed from: g */
    boolean f118505g;

    /* renamed from: h */
    boolean f118506h;

    /* renamed from: i */
    final /* synthetic */ SpannedGridLayoutManager f118507i;

    public C45340f(SpannedGridLayoutManager spannedGridLayoutManager) {
        this.f118507i = spannedGridLayoutManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo49348a() {
        int i;
        if (this.f118504f) {
            i = this.f118507i.f118468a.mo49351c(this.f118501c);
            this.f118501c = i;
        } else {
            C45341g gVar = this.f118507i.f118468a;
            int i2 = this.f118501c;
            int a = gVar.mo49349a(i2);
            while (i2 > 0 && gVar.mo49349a(i2) == a) {
                i2--;
            }
            i = gVar.mo49349a(i2) == a ? -1 : i2;
            this.f118501c = i;
        }
        return this.f118507i.f118468a.mo49354f(i);
    }
}
