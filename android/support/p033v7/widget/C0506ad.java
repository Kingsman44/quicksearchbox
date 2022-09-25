package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.ad */
/* compiled from: PG */
public final class C0506ad {

    /* renamed from: a */
    public static final PorterDuff.Mode f2044a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0506ad f2045b;

    /* renamed from: c */
    private C0678gm f2046c;

    /* renamed from: b */
    public static synchronized PorterDuffColorFilter m1894b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter b;
        synchronized (C0506ad.class) {
            b = C0678gm.m2374b(i, mode);
        }
        return b;
    }

    /* renamed from: d */
    public static synchronized C0506ad m1895d() {
        C0506ad adVar;
        synchronized (C0506ad.class) {
            if (f2045b == null) {
                m1896f();
            }
            adVar = f2045b;
        }
        return adVar;
    }

    /* renamed from: f */
    public static synchronized void m1896f() {
        synchronized (C0506ad.class) {
            if (f2045b == null) {
                C0506ad adVar = new C0506ad();
                f2045b = adVar;
                adVar.f2046c = C0678gm.m2375e();
                f2045b.f2046c.mo3103g(new C0505ac());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized ColorStateList mo2476a(Context context, int i) {
        return this.f2046c.mo3099a(context, i);
    }

    /* renamed from: c */
    public final synchronized Drawable mo2477c(Context context, int i) {
        return this.f2046c.mo3100c(context, i);
    }

    /* renamed from: e */
    public final synchronized void mo2478e(Context context) {
        this.f2046c.mo3102f(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized Drawable mo2479g(Context context, int i) {
        return this.f2046c.mo3101d(context, i, true);
    }
}
