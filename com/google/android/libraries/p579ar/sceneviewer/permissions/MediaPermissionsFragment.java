package com.google.android.libraries.p579ar.sceneviewer.permissions;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0811d;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionsDialog;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.MediaPermissionsFragment */
/* compiled from: PG */
public final class MediaPermissionsFragment extends C0260w {
    public static final String TAG = "MediaPermissionsFragment";
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.permissions.MediaPermissionsFragment");
    private final View.OnClickListener givePermissionListener = new MediaPermissionsFragment$$ExternalSyntheticLambda3(this);
    private PermissionsCallback permissionsCallback = new C10752c();
    private C0816c permissionsLauncher;
    private Bitmap sourceImage;

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

    public static void relaunch(FragmentManager fragmentManager) {
        Fragment c = fragmentManager.f634a.mo671c(TAG);
        if (c instanceof MediaPermissionsFragment) {
            MediaPermissionsFragment mediaPermissionsFragment = (MediaPermissionsFragment) c;
            Bitmap bitmap = mediaPermissionsFragment.sourceImage;
            PermissionsCallback permissionsCallback2 = mediaPermissionsFragment.permissionsCallback;
            C0154a aVar = new C0154a(fragmentManager);
            aVar.mo516m(c);
            aVar.mo505b(false);
            c.setUserVisibleHint(false);
            showNow(fragmentManager, bitmap, permissionsCallback2);
            ViewerLogger.getInstance().logUIEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_RECORD_MEDIA_SCREEN_SHOWN);
        }
    }

    public static void showNow(FragmentManager fragmentManager, Bitmap bitmap, PermissionsCallback permissionsCallback2) {
        if (isVisible(fragmentManager)) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42389)).mo56386p("MediaPermissionsFragment is being requested when it's already visible.");
            return;
        }
        MediaPermissionsFragment mediaPermissionsFragment = new MediaPermissionsFragment();
        mediaPermissionsFragment.sourceImage = bitmap;
        mediaPermissionsFragment.setUserVisibleHint(true);
        mediaPermissionsFragment.permissionsCallback = permissionsCallback2;
        mediaPermissionsFragment.showNow(fragmentManager, TAG);
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSIONS_SEEN);
        ViewerLogger.getInstance().logUIEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_STORAGE_SEEN);
        ViewerLogger.getInstance().logUIEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_MICROPHONE_SEEN);
    }

    /* renamed from: lambda$new$0$com-google-android-libraries-ar-sceneviewer-permissions-MediaPermissionsFragment */
    public /* synthetic */ void mo19154x9be433bf(View view) {
        boolean hasMicrophonePermissions = PermissionUtilities.hasMicrophonePermissions(getContext());
        boolean hasMediaPermissions = PermissionUtilities.hasMediaPermissions(getContext());
        if (!hasMicrophonePermissions || !hasMediaPermissions) {
            ArrayList arrayList = new ArrayList();
            if (!hasMicrophonePermissions) {
                arrayList.addAll(PermissionUtilities.getMicrophonePermissionStrings());
            }
            if (!hasMediaPermissions) {
                arrayList.addAll(PermissionUtilities.getMediaPermissionStrings());
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            C0816c cVar = this.permissionsLauncher;
            cVar.getClass();
            cVar.mo526b(strArr);
            return;
        }
        Context context = getContext();
        PermissionsCallback permissionsCallback2 = this.permissionsCallback;
        Objects.requireNonNull(permissionsCallback2);
        PermissionUtilities.showCameraPermissionsInfoDialog(context, new MediaPermissionsFragment$$ExternalSyntheticLambda2(permissionsCallback2));
    }

    /* renamed from: lambda$onCreateDialog$1$com-google-android-libraries-ar-sceneviewer-permissions-MediaPermissionsFragment */
    public /* synthetic */ void mo19155x5e334ea1(View view) {
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSION_WENT_BACK);
        dismiss();
        setUserVisibleHint(false);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C0811d dVar = new C0811d();
        PermissionsCallback permissionsCallback2 = this.permissionsCallback;
        Objects.requireNonNull(permissionsCallback2);
        this.permissionsLauncher = registerForActivityResult(dVar, new MediaPermissionsFragment$$ExternalSyntheticLambda0(permissionsCallback2));
        PermissionsDialog.Builder builder = new PermissionsDialog.Builder(getContext(), C10746R.string.media_permissions_screen_title, C10746R.string.media_permissions_screen_subtitle, this.givePermissionListener);
        builder.setDeclinePermissionOnClickListener(new MediaPermissionsFragment$$ExternalSyntheticLambda1(this));
        Bitmap bitmap = this.sourceImage;
        bitmap.getClass();
        builder.setImageBackground(MediaUtilities.cropToSquare(bitmap, 0, 0));
        return builder.build();
    }
}
