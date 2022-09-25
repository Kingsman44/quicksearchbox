package androidx.mediarouter.p175a;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.mediarouter.a.i */
/* compiled from: PG */
final class C3736i extends MediaRouter2.TransferCallback {

    /* renamed from: a */
    final /* synthetic */ C3737j f11993a;

    public C3736i(C3737j jVar) {
        this.f11993a = jVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        C3748u uVar = (C3748u) this.f11993a.f11996c.remove(routingController);
        if (uVar != null) {
            C3676al alVar = (C3676al) this.f11993a.f11995b;
            if (uVar == alVar.f11811a.f11837s) {
                alVar.mo7730a(2);
            } else if (C3687aw.f11883a) {
                new StringBuilder("A RouteController unrelated to the selected route is released. controller=").append(uVar);
                Log.d("MediaRouter", "A RouteController unrelated to the selected route is released. controller=".concat(uVar.toString()));
            }
        } else {
            new StringBuilder("onStop: No matching routeController found. routingController=").append(routingController);
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=".concat(String.valueOf(routingController)));
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        C3685au auVar;
        this.f11993a.f11996c.remove(routingController);
        if (routingController2 == this.f11993a.f11994a.getSystemController()) {
            ((C3676al) this.f11993a.f11995b).mo7730a(3);
            return;
        }
        List selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = ((MediaRoute2Info) selectedRoutes.get(0)).getId();
        this.f11993a.f11996c.put(routingController2, new C3733f(routingController2, id));
        C3676al alVar = (C3676al) this.f11993a.f11995b;
        Iterator it = alVar.f11811a.f11826h.iterator();
        while (true) {
            if (!it.hasNext()) {
                auVar = null;
                break;
            }
            auVar = (C3685au) it.next();
            C3684at atVar = auVar.f11861a;
            C3687aw.m10684i();
            if (atVar.f11857a == alVar.f11811a.f11824f && TextUtils.equals(id, auVar.f11862b)) {
                break;
            }
        }
        if (auVar == null) {
            Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=".concat(String.valueOf(id)));
        } else {
            alVar.f11811a.mo7742l(auVar, 3);
        }
        this.f11993a.mo7870h(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        new StringBuilder("Transfer failed. requestedRoute=").append(mediaRoute2Info);
        Log.w("MR2Provider", "Transfer failed. requestedRoute=".concat(String.valueOf(mediaRoute2Info)));
    }
}
