package com.google.android.libraries.p579ar.sceneviewer.permissions;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0811d;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionsDialog;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.AllPermissionsFragment */
/* compiled from: PG */
public final class AllPermissionsFragment extends C0260w {
    public static final String TAG = "AllPermissionsFragment";
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.permissions.AllPermissionsFragment");
    private final View.OnClickListener givePermissionListener = new AllPermissionsFragment$$ExternalSyntheticLambda1(this);
    private PermissionsCallback permissionsCallback = new C10750a();
    private C0816c permissionsLauncher;

    public static void hide(FragmentManager fragmentManager) {
        Fragment c = fragmentManager.f634a.mo671c(TAG);
        if (c != null) {
            C0154a aVar = new C0154a(fragmentManager);
            aVar.mo516m(c);
            aVar.mo505b(false);
            c.setUserVisibleHint(false);
        }
    }

    public static boolean isVisible(FragmentManager fragmentManager) {
        Fragment c = fragmentManager.f634a.mo671c(TAG);
        return c != null && c.getUserVisibleHint();
    }

    public static void showNow(FragmentManager fragmentManager, PermissionsCallback permissionsCallback2) {
        if (isVisible(fragmentManager)) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42387)).mo56386p("AllPermissionsFragment is being requested when it's already visible.");
            return;
        }
        AllPermissionsFragment allPermissionsFragment = new AllPermissionsFragment();
        allPermissionsFragment.setUserVisibleHint(true);
        allPermissionsFragment.permissionsCallback = permissionsCallback2;
        allPermissionsFragment.showNow(fragmentManager, TAG);
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSIONS_SEEN);
        ViewerLogger.getInstance().logUIEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_CAMERA_SEEN);
        ViewerLogger.getInstance().logUIEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_STORAGE_SEEN);
        ViewerLogger.getInstance().logUIEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_MICROPHONE_SEEN);
    }

    /* renamed from: lambda$new$0$com-google-android-libraries-ar-sceneviewer-permissions-AllPermissionsFragment */
    public /* synthetic */ void mo19144x8a3256a2(View view) {
        if (PermissionUtilities.hasAllPermissions(getContext())) {
            Context context = getContext();
            PermissionsCallback permissionsCallback2 = this.permissionsCallback;
            Objects.requireNonNull(permissionsCallback2);
            PermissionUtilities.showAllPermissionsInfoDialog(context, new AllPermissionsFragment$$ExternalSyntheticLambda0(permissionsCallback2));
            return;
        }
        List allPermissionStrings = PermissionUtilities.getAllPermissionStrings();
        String[] strArr = new String[allPermissionStrings.size()];
        allPermissionStrings.toArray(strArr);
        C0816c cVar = this.permissionsLauncher;
        cVar.getClass();
        cVar.mo526b(strArr);
    }

    /* renamed from: lambda$onCreateDialog$1$com-google-android-libraries-ar-sceneviewer-permissions-AllPermissionsFragment */
    public /* synthetic */ void mo19145x49eec204(View view) {
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSION_WENT_BACK);
        dismiss();
        setUserVisibleHint(false);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C0811d dVar = new C0811d();
        PermissionsCallback permissionsCallback2 = this.permissionsCallback;
        Objects.requireNonNull(permissionsCallback2);
        this.permissionsLauncher = registerForActivityResult(dVar, new AllPermissionsFragment$$ExternalSyntheticLambda2(permissionsCallback2));
        PermissionsDialog.Builder builder = new PermissionsDialog.Builder(getContext(), C10746R.string.ar_permissions_screen_title, C10746R.string.all_permissions_screen_subtitle, this.givePermissionListener);
        builder.setDeclinePermissionOnClickListener(new AllPermissionsFragment$$ExternalSyntheticLambda3(this));
        builder.setImageBackground(C10746R.C10747drawable.room);
        builder.setImageForeground(C10746R.C10747drawable.person);
        builder.setImageContent(C10746R.C10747drawable.permissions_image_animation);
        return builder.build();
    }
}
