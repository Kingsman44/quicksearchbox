package com.airbnb.lottie;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.p */
/* compiled from: PG */
final class C4969p implements Callable {

    /* renamed from: a */
    final /* synthetic */ WeakReference f15773a;

    /* renamed from: b */
    final /* synthetic */ Context f15774b;

    /* renamed from: c */
    final /* synthetic */ int f15775c;

    /* renamed from: d */
    final /* synthetic */ String f15776d;

    public C4969p(WeakReference weakReference, Context context, int i, String str) {
        this.f15773a = weakReference;
        this.f15774b = context;
        this.f15775c = i;
        this.f15776d = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = (Context) this.f15773a.get();
        if (context == null) {
            context = this.f15774b;
        }
        return C4972s.m13746d(context, this.f15775c, this.f15776d);
    }
}
