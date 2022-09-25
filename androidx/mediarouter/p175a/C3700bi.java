package androidx.mediarouter.p175a;

import android.media.MediaRouter;
import android.util.Log;
import android.view.Display;

/* renamed from: androidx.mediarouter.a.bi */
/* compiled from: PG */
public final class C3700bi {
    /* renamed from: a */
    public static Display m10713a(Object obj) {
        try {
            return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError e) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
            return null;
        }
    }
}
