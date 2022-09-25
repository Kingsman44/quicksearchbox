package androidx.mediarouter.p175a;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.mediarouter.a.f */
/* compiled from: PG */
final class C3733f extends C3745r {

    /* renamed from: a */
    final String f11980a;

    /* renamed from: b */
    final MediaRouter2.RoutingController f11981b;

    /* renamed from: c */
    final Messenger f11982c;

    /* renamed from: d */
    final Messenger f11983d;

    /* renamed from: e */
    final SparseArray f11984e = new SparseArray();

    /* renamed from: f */
    final Handler f11985f;

    /* renamed from: g */
    final AtomicInteger f11986g = new AtomicInteger(1);

    /* renamed from: h */
    int f11987h = -1;

    /* renamed from: i */
    C3739l f11988i;

    /* renamed from: o */
    private final Runnable f11989o = new C3731d(this);

    public C3733f(MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f11981b = routingController;
        this.f11980a = str;
        Messenger a = C3737j.m10817a(routingController);
        this.f11982c = a;
        if (a == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new C3732e(this));
        }
        this.f11983d = messenger;
        this.f11985f = new Handler(Looper.getMainLooper());
    }

    /* renamed from: j */
    private final void m10809j() {
        this.f11985f.removeCallbacks(this.f11989o);
        this.f11985f.postDelayed(this.f11989o, 1000);
    }

    /* renamed from: a */
    public final void mo7816a() {
        this.f11981b.release();
    }

    /* renamed from: b */
    public final void mo7817b(int i) {
        MediaRouter2.RoutingController routingController = this.f11981b;
        if (routingController != null) {
            routingController.setVolume(i);
            this.f11987h = i;
            m10809j();
        }
    }

    /* renamed from: c */
    public final void mo7818c(int i) {
        MediaRouter2.RoutingController routingController = this.f11981b;
        if (routingController != null) {
            int i2 = this.f11987h;
            if (i2 < 0) {
                i2 = routingController.getVolume();
            }
            int max = Math.max(0, Math.min(i2 + i, this.f11981b.getVolumeMax()));
            this.f11987h = max;
            this.f11981b.setVolume(max);
            m10809j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo7861d(String str, int i) {
        MediaRouter2.RoutingController routingController = this.f11981b;
        if (routingController != null && !routingController.isReleased() && this.f11982c != null) {
            int andIncrement = this.f11986g.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f11983d;
            try {
                this.f11982c.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo7862e(String str, int i) {
        MediaRouter2.RoutingController routingController = this.f11981b;
        if (routingController != null && !routingController.isReleased() && this.f11982c != null) {
            int andIncrement = this.f11986g.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f11983d;
            try {
                this.f11982c.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }
}
