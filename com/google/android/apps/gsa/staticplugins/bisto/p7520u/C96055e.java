package com.google.android.apps.gsa.staticplugins.bisto.p7520u;

import android.media.MediaRouter;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.e */
/* compiled from: PG */
final class C96055e extends MediaRouter.Callback {

    /* renamed from: a */
    final /* synthetic */ C96056f f268936a;

    public C96055e(C96056f fVar) {
        this.f268936a = fVar;
    }

    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
    }

    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C59071e eVar = C96056f.f268937a;
        C58976aa aaVar = C58975e.f156826a;
        routeInfo.getName();
        this.f268936a.mo89920b();
    }

    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
    }

    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
    }

    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        if ((i & 1) == 1) {
            C59071e eVar = C96056f.f268937a;
            C58976aa aaVar = C58975e.f156826a;
            routeInfo.getName();
            routeInfo.getDescription();
            this.f268936a.mo89920b();
        }
    }

    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
    }

    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
    }

    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
    }
}
