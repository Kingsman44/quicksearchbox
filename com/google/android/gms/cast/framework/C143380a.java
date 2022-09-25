package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.RemoteException;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.mediarouter.p175a.C3753z;
import com.google.android.gms.cast.framework.p10772a.p10773a.C143390i;
import com.google.android.gms.cast.framework.p10774b.C143426h;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.C143919bh;
import com.google.common.p4552o.p4557d.p4558a.C59715c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.a */
/* compiled from: PG */
public final class C143380a {

    /* renamed from: a */
    private static final List f388843a = new ArrayList();

    static {
        new C143566ae("CastButtonFactory");
        new ArrayList();
    }

    /* renamed from: a */
    public static void m232631a(Context context, MediaRouteButton mediaRouteButton) {
        C59715c cVar;
        C143919bh.m233964g("Must be called from the main thread.");
        boolean b = m232632b(context);
        if (mediaRouteButton != null) {
            if (m232632b(context)) {
                mediaRouteButton.mo7936e();
            }
            C3753z zVar = null;
            C143426h hVar = b ? new C143426h() : null;
            C143919bh.m233964g("Must be called from the main thread.");
            C143429e b2 = C143429e.m232796b(context);
            if (b2 != null) {
                C143919bh.m233964g("Must be called from the main thread.");
                try {
                    zVar = C3753z.m10882a(b2.f388952e.mo118854e());
                } catch (RemoteException e) {
                    C143429e.f388948a.mo118885c(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", C143549t.class.getSimpleName());
                }
                if (zVar != null && !mediaRouteButton.f12051d.equals(zVar)) {
                    if (mediaRouteButton.f12053f) {
                        if (!mediaRouteButton.f12051d.mo7927d()) {
                            mediaRouteButton.f12049b.mo7774j(mediaRouteButton.f12050c);
                        }
                        if (!zVar.mo7927d()) {
                            mediaRouteButton.f12049b.mo7773h(zVar, mediaRouteButton.f12050c, 0);
                        }
                    }
                    mediaRouteButton.f12051d = zVar;
                    mediaRouteButton.mo7931a();
                }
            }
            if (hVar != null) {
                mediaRouteButton.f12052e = hVar;
            }
            f388843a.add(new WeakReference(mediaRouteButton));
        }
        if (b) {
            cVar = C59715c.CAST_SDK_DEFAULT_DEVICE_DIALOG;
        } else {
            cVar = C59715c.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
        }
        C143390i.m232669e(cVar);
    }

    /* renamed from: b */
    private static boolean m232632b(Context context) {
        C143429e b = C143429e.m232796b(context);
        if (b == null) {
            return false;
        }
        CastOptions c = b.mo118636c();
        int i = c.f388842n;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        boolean z = c.f388838j;
        return false;
    }
}
