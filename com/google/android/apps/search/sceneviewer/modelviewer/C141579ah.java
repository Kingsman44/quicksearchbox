package com.google.android.apps.search.sceneviewer.modelviewer;

import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.media.gallery.GalleryButtonController;
import com.google.android.libraries.p579ar.sceneviewer.permissions.AllPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.CameraPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionUtilities;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionsCallback;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ah */
/* compiled from: PG */
final class C141579ah implements PermissionsCallback {

    /* renamed from: a */
    final /* synthetic */ C141592b f384261a;

    /* renamed from: b */
    final /* synthetic */ C141584am f384262b;

    public C141579ah(C141584am amVar, C141592b bVar) {
        this.f384262b = amVar;
        this.f384261a = bVar;
    }

    public final void onPermissionsCheckSuccess() {
        this.f384262b.mo116578l(true);
        AllPermissionsFragment.hide(this.f384261a.getChildFragmentManager());
        CameraPermissionsFragment.hide(this.f384261a.getChildFragmentManager());
        this.f384262b.mo116587u(Types.ViewerMode.AR);
    }

    public final void onRequestPermissionsResult(Map map) {
        C141584am amVar = this.f384262b;
        AllPermissionsFragment.hide(amVar.f384337f.getChildFragmentManager());
        CameraPermissionsFragment.hide(amVar.f384337f.getChildFragmentManager());
        PermissionUtilities.logPermissions(map);
        if (!amVar.f384351t) {
            Stream stream = Collection.EL.stream(map.values());
            Boolean bool = Boolean.TRUE;
            Objects.requireNonNull(bool);
            if (!stream.allMatch(new C141608r(bool))) {
                ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSIONS_DENIED);
                if (!PermissionUtilities.shouldShowRequestPermissionRationale(amVar.f384337f)) {
                    PermissionUtilities.showAllPermissionsRationaleDialog(amVar.f384337f.getContext());
                    return;
                }
                return;
            }
        }
        if (!amVar.f384351t || (map.containsKey("android.permission.CAMERA") && ((Boolean) map.get("android.permission.CAMERA")).booleanValue())) {
            ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSIONS_ACCEPTED);
            amVar.mo116578l(true);
            amVar.mo116587u(Types.ViewerMode.AR);
            GalleryButtonController galleryButtonController = amVar.f384290R;
            if (galleryButtonController != null) {
                galleryButtonController.setGalleryButtonVisible(amVar.f384296X, 300);
                return;
            }
            return;
        }
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSIONS_DENIED);
        if (!PermissionUtilities.shouldShowCameraRequestPermissionRationale(amVar.f384337f)) {
            PermissionUtilities.showCameraPermissionsRationaleDialog(amVar.f384337f.getContext());
        }
    }
}
