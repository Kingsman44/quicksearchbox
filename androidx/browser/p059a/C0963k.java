package androidx.browser.p059a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C1821h;
import androidx.core.app.C1823j;
import androidx.core.app.C1826m;

/* renamed from: androidx.browser.a.k */
/* compiled from: PG */
public final class C0963k {

    /* renamed from: a */
    public final Intent f3067a = new Intent("android.intent.action.VIEW");

    /* renamed from: b */
    public final C0953a f3068b = new C0953a();

    /* renamed from: c */
    public Bundle f3069c;

    /* renamed from: d */
    public int f3070d = 0;

    /* renamed from: e */
    public boolean f3071e = true;

    /* renamed from: f */
    private Bundle f3072f;

    /* renamed from: g */
    private SparseArray f3073g;

    public C0963k() {
    }

    /* renamed from: i */
    private final void m2901i(IBinder iBinder, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        C1826m.m5005b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        this.f3067a.putExtras(bundle);
    }

    /* renamed from: a */
    public final C0964l mo3582a() {
        if (!this.f3067a.hasExtra("android.support.customtabs.extra.SESSION")) {
            m2901i((IBinder) null, (PendingIntent) null);
        }
        this.f3067a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3071e);
        this.f3067a.putExtras(this.f3068b.mo3567a().mo3570a());
        Bundle bundle = this.f3069c;
        if (bundle != null) {
            this.f3067a.putExtras(bundle);
        }
        if (this.f3073g != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f3073g);
            this.f3067a.putExtras(bundle2);
        }
        this.f3067a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f3070d);
        return new C0964l(this.f3067a, this.f3072f);
    }

    /* renamed from: b */
    public final void mo3583b(int i) {
        this.f3067a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i);
    }

    /* renamed from: c */
    public final void mo3584c(int i, C0954b bVar) {
        if (this.f3073g == null) {
            this.f3073g = new SparseArray();
        }
        this.f3073g.put(i, bVar.mo3570a());
    }

    /* renamed from: d */
    public final void mo3585d(Context context, int i, int i2) {
        this.f3067a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ((C1821h) C1823j.m4996a(context, i, i2)).f5645a.toBundle());
    }

    /* renamed from: e */
    public final void mo3586e(RemoteViews remoteViews, int[] iArr) {
        this.f3067a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        this.f3067a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        this.f3067a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", (Parcelable) null);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.support.a.c, android.os.IBinder] */
    /* renamed from: f */
    public final void mo3587f(C0967o oVar) {
        this.f3067a.setPackage(oVar.f3078b.getPackageName());
        m2901i(oVar.f3077a, oVar.f3079c);
    }

    /* renamed from: g */
    public final void mo3588g(boolean z) {
        this.f3067a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
    }

    /* renamed from: h */
    public final void mo3589h(Context context) {
        this.f3072f = ((C1821h) C1823j.m4996a(context, 17432576, 17432577)).f5645a.toBundle();
    }

    public C0963k(C0967o oVar) {
        mo3587f(oVar);
    }
}
