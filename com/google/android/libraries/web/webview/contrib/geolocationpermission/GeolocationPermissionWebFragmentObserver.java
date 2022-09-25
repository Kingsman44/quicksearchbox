package com.google.android.libraries.web.webview.contrib.geolocationpermission;

import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.web.lifecycle.internal.C43897e;
import com.google.android.libraries.web.lifecycle.internal.WebLifecycleMixins$registerInForeground$2;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3428m.C43943t;
import com.google.android.libraries.web.p3428m.p3429a.C43924m;
import com.google.android.libraries.web.shared.contrib.C44084b;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class GeolocationPermissionWebFragmentObserver implements C43773b {

    /* renamed from: a */
    public final GeolocationPermissionCallbacks f115358a;

    /* renamed from: b */
    private final C43943t f115359b;

    public GeolocationPermissionWebFragmentObserver(C44084b bVar, C43943t tVar) {
        C69664n.m101061g(bVar, "callbacksProvider");
        C69664n.m101061g(tVar, "webWindowMixins");
        this.f115359b = tVar;
        Object obj = bVar.mo47055a(GeolocationPermissionFeature.class, GeolocationPermissionCallbacks.class).get();
        C69664n.m101060f(obj, "callbacksProvider\n      …java\n      )\n      .get()");
        this.f115358a = (GeolocationPermissionCallbacks) obj;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        C43943t tVar = this.f115359b;
        C44369b bVar = new C44369b(this);
        C44370c cVar = C44370c.f115365a;
        C43897e eVar = tVar.f114433a;
        Class<C44373f> cls = C44373f.class;
        if (!eVar.f114353a.getLifecycle().mo5789a().mo5788a(C2383n.STARTED)) {
            eVar.f114353a.getLifecycle().mo5790b(new WebLifecycleMixins$registerInForeground$2((C43924m) eVar.f114354b.mo47072a(C43924m.class), cls, bVar, cVar));
            return;
        }
        throw new IllegalStateException("Cannot register callbacks to " + cls + " after the fragment is started.");
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
