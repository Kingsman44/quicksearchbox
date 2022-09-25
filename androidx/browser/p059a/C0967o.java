package androidx.browser.p059a;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p026a.C0121c;
import android.support.p026a.C0122d;
import android.widget.RemoteViews;

/* renamed from: androidx.browser.a.o */
/* compiled from: PG */
public final class C0967o {

    /* renamed from: a */
    public final C0121c f3077a;

    /* renamed from: b */
    public final ComponentName f3078b;

    /* renamed from: c */
    public final PendingIntent f3079c;

    /* renamed from: d */
    public final C0122d f3080d;

    public C0967o(C0122d dVar, C0121c cVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f3080d = dVar;
        this.f3077a = cVar;
        this.f3078b = componentName;
        this.f3079c = pendingIntent;
    }

    /* renamed from: a */
    public final void mo3593a(Bundle bundle) {
        PendingIntent pendingIntent = this.f3079c;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* renamed from: b */
    public final boolean mo3594b(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
        mo3593a(bundle);
        try {
            return this.f3080d.mo94a(this.f3077a, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo3595c(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.customaction.ID", 100);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        mo3593a(bundle2);
        try {
            return this.f3080d.mo94a(this.f3077a, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
