package com.google.android.apps.search.sceneviewer.modelviewer;

import android.graphics.Bitmap;
import com.google.android.libraries.p579ar.sceneviewer.media.capture.ShutterButtonController;
import com.google.android.libraries.p579ar.sceneviewer.permissions.MediaPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionResult;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionUtilities;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionsCallback;
import java.util.Map;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ai */
/* compiled from: PG */
final class C141580ai implements PermissionsCallback {

    /* renamed from: a */
    final /* synthetic */ Bitmap f384263a;

    /* renamed from: b */
    final /* synthetic */ C141584am f384264b;

    public C141580ai(C141584am amVar, Bitmap bitmap) {
        this.f384264b = amVar;
        this.f384263a = bitmap;
    }

    public final void onPermissionsCheckSuccess() {
    }

    public final void onRequestPermissionsResult(Map map) {
        ShutterButtonController shutterButtonController;
        boolean shouldShowMicrophoneRequestPermissionRationale = PermissionUtilities.shouldShowMicrophoneRequestPermissionRationale(this.f384264b.f384337f);
        boolean shouldShowMediaRequestPermissionRationale = PermissionUtilities.shouldShowMediaRequestPermissionRationale(this.f384264b.f384337f);
        PermissionResult mediaPermissions = PermissionUtilities.getMediaPermissions(map);
        PermissionResult permissionResult = PermissionResult.DENIED;
        if ((PermissionUtilities.getMicrophonePermissions(map) == PermissionResult.DENIED && !shouldShowMicrophoneRequestPermissionRationale) || (mediaPermissions == permissionResult && !shouldShowMediaRequestPermissionRationale)) {
            PermissionUtilities.showMediaAndMicrophonePermissionsRationaleDialog(this.f384264b.f384337f.getContext());
        }
        if (MediaPermissionsFragment.isVisible(this.f384264b.f384337f.getChildFragmentManager())) {
            MediaPermissionsFragment.hide(this.f384264b.f384337f.getChildFragmentManager());
        }
        PermissionUtilities.logPermissions(map);
        if (PermissionUtilities.hasMediaPermissions(this.f384264b.f384337f.getContext()) && (shutterButtonController = this.f384264b.f384289Q) != null) {
            shutterButtonController.onGetRenderedImage(this.f384263a);
        }
    }
}
