package androidx.media;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.p031v4.media.session.C0306h;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.core.app.C1826m;

/* renamed from: androidx.media.q */
/* compiled from: PG */
class C2440q extends MediaBrowserService {

    /* renamed from: a */
    final /* synthetic */ C2441r f6731a;

    public C2440q(C2441r rVar, Context context) {
        this.f6731a = rVar;
        attachBaseContext(context);
    }

    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        int i2;
        Bundle bundle3;
        C2434k kVar;
        IBinder iBinder;
        MediaSessionCompat.m652b(bundle);
        C2441r rVar = this.f6731a;
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        if (bundle2 == null || bundle2.getInt("extra_client_version", 0) == 0) {
            bundle3 = null;
            i2 = -1;
        } else {
            bundle2.remove("extra_client_version");
            rVar.f6734c = new Messenger(rVar.f6735d.f6688d);
            bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            C1826m.m5005b(bundle3, "extra_messenger", rVar.f6734c.getBinder());
            MediaSessionCompat.Token token = rVar.f6735d.f6689e;
            if (token != null) {
                C0306h extraBinder = token.getExtraBinder();
                if (extraBinder == null) {
                    iBinder = null;
                } else {
                    iBinder = extraBinder.asBinder();
                }
                C1826m.m5005b(bundle3, "extra_session_binder", iBinder);
            } else {
                rVar.f6732a.add(bundle3);
            }
            int i3 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
            i2 = i3;
        }
        C2436m mVar = new C2436m(rVar.f6735d, str, i2, i, (C2414al) null);
        C2434k h = rVar.f6735d.mo5835h(str, i);
        if (h == null) {
            kVar = null;
        } else {
            if (rVar.f6734c != null) {
                rVar.f6735d.f6686b.add(mVar);
            }
            if (bundle3 == null) {
                bundle3 = h.f6717b;
            } else {
                Bundle bundle4 = h.f6717b;
                if (bundle4 != null) {
                    bundle3.putAll(bundle4);
                }
            }
            kVar = new C2434k(h.f6716a, bundle3);
        }
        if (kVar == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(kVar.f6716a, kVar.f6717b);
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        C2441r rVar = this.f6731a;
        rVar.f6735d.mo5831b(str, new C2438o(str, new C2403aa(result)));
    }
}
