package com.google.android.libraries.p579ar.sceneviewer.permissions;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.p031v4.app.Fragment;
import androidx.core.p094f.C1888a;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.PermissionUtilities */
/* compiled from: PG */
public final class PermissionUtilities {
    private static final String APP_NAME_PLACEHOLDER = "[App Name]";

    private PermissionUtilities() {
    }

    public static boolean checkPermission(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static List getAllPermissionStrings() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getCameraPermissionStrings());
        arrayList.addAll(getMicrophonePermissionStrings());
        arrayList.addAll(getMediaPermissionStrings());
        return arrayList;
    }

    public static String getAppName(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    public static List getCameraPermissionStrings() {
        return Arrays.asList(new String[]{"android.permission.CAMERA"});
    }

    public static PermissionResult getCameraPermissions(Map map) {
        if (!map.containsKey("android.permission.CAMERA")) {
            return PermissionResult.NONE;
        }
        if (((Boolean) map.get("android.permission.CAMERA")).booleanValue()) {
            return PermissionResult.GRANTED;
        }
        return PermissionResult.DENIED;
    }

    public static List getMediaPermissionStrings() {
        if (C1888a.m5150d()) {
            return Arrays.asList(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
        } else if (Build.VERSION.SDK_INT >= 30) {
            return Arrays.asList(new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
        } else {
            return Arrays.asList(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        }
    }

    public static PermissionResult getMediaPermissions(Map map) {
        if (C1888a.m5150d()) {
            return getMediaPermissionsAtAndAfterT(map);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return getMediaPermissionsAtAndAfterR(map);
        }
        return getMediaPermissionsBeforeR(map);
    }

    private static PermissionResult getMediaPermissionsAtAndAfterR(Map map) {
        if (!map.containsKey("android.permission.READ_EXTERNAL_STORAGE")) {
            return PermissionResult.NONE;
        }
        if (((Boolean) map.get("android.permission.READ_EXTERNAL_STORAGE")).booleanValue()) {
            return PermissionResult.GRANTED;
        }
        return PermissionResult.DENIED;
    }

    private static PermissionResult getMediaPermissionsAtAndAfterT(Map map) {
        if (!map.containsKey("android.permission.READ_MEDIA_IMAGES") || !map.containsKey("android.permission.READ_MEDIA_VIDEO")) {
            return PermissionResult.NONE;
        }
        if (!((Boolean) map.get("android.permission.READ_MEDIA_IMAGES")).booleanValue() || !((Boolean) map.get("android.permission.READ_MEDIA_VIDEO")).booleanValue()) {
            return PermissionResult.DENIED;
        }
        return PermissionResult.GRANTED;
    }

    private static PermissionResult getMediaPermissionsBeforeR(Map map) {
        if (!map.containsKey("android.permission.WRITE_EXTERNAL_STORAGE")) {
            return PermissionResult.NONE;
        }
        if (((Boolean) map.get("android.permission.WRITE_EXTERNAL_STORAGE")).booleanValue()) {
            return PermissionResult.GRANTED;
        }
        return PermissionResult.DENIED;
    }

    public static List getMicrophonePermissionStrings() {
        return Arrays.asList(new String[]{"android.permission.RECORD_AUDIO"});
    }

    public static PermissionResult getMicrophonePermissions(Map map) {
        if (!map.containsKey("android.permission.RECORD_AUDIO")) {
            return PermissionResult.NONE;
        }
        if (((Boolean) map.get("android.permission.RECORD_AUDIO")).booleanValue()) {
            return PermissionResult.GRANTED;
        }
        return PermissionResult.DENIED;
    }

    public static boolean hasAllPermissions(Context context) {
        return hasCameraPermissions(context) && hasMicrophonePermissions(context) && hasMediaPermissions(context);
    }

    public static boolean hasCameraPermissions(Context context) {
        return checkPermission(context, "android.permission.CAMERA");
    }

    public static boolean hasMediaPermissions(Context context) {
        if (C1888a.m5150d()) {
            return checkPermission(context, "android.permission.READ_MEDIA_IMAGES") && checkPermission(context, "android.permission.READ_MEDIA_VIDEO");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return checkPermission(context, "android.permission.READ_EXTERNAL_STORAGE");
        }
        return checkPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean hasMicrophonePermissions(Context context) {
        return checkPermission(context, "android.permission.RECORD_AUDIO");
    }

    static /* synthetic */ void lambda$showAllPermissionsRationaleDialog$1(DialogInterface dialogInterface, int i) {
    }

    static /* synthetic */ void lambda$showCameraPermissionsRationaleDialog$3(DialogInterface dialogInterface, int i) {
    }

    static /* synthetic */ void lambda$showMediaAndMicrophonePermissionsRationaleDialog$5(DialogInterface dialogInterface, int i) {
    }

    public static void launchPermissionSettings(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), (String) null));
        context.startActivity(intent);
    }

    public static void logPermissions(Map map) {
        ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent uIEvent;
        ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent uIEvent2;
        ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent uIEvent3;
        PermissionResult cameraPermissions = getCameraPermissions(map);
        if (!cameraPermissions.equals(PermissionResult.NONE)) {
            ViewerLogger instance = ViewerLogger.getInstance();
            if (cameraPermissions.equals(PermissionResult.GRANTED)) {
                uIEvent3 = ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_CAMERA_ACCEPTED;
            } else {
                uIEvent3 = ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_CAMERA_DENIED;
            }
            instance.logUIEvent(uIEvent3);
        }
        PermissionResult microphonePermissions = getMicrophonePermissions(map);
        if (!microphonePermissions.equals(PermissionResult.NONE)) {
            ViewerLogger instance2 = ViewerLogger.getInstance();
            if (microphonePermissions.equals(PermissionResult.GRANTED)) {
                uIEvent2 = ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_MICROPHONE_ACCEPTED;
            } else {
                uIEvent2 = ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_MICROPHONE_DENIED;
            }
            instance2.logUIEvent(uIEvent2);
        }
        PermissionResult mediaPermissions = getMediaPermissions(map);
        if (!mediaPermissions.equals(PermissionResult.NONE)) {
            ViewerLogger instance3 = ViewerLogger.getInstance();
            if (mediaPermissions.equals(PermissionResult.GRANTED)) {
                uIEvent = ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_STORAGE_ACCEPTED;
            } else {
                uIEvent = ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_STORAGE_DENIED;
            }
            instance3.logUIEvent(uIEvent);
        }
    }

    public static boolean shouldShowCameraRequestPermissionRationale(Fragment fragment) {
        return fragment.shouldShowRequestPermissionRationale("android.permission.CAMERA");
    }

    public static boolean shouldShowMediaRequestPermissionRationale(Fragment fragment) {
        if (C1888a.m5150d()) {
            return fragment.shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_IMAGES") || fragment.shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_VIDEO");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return fragment.shouldShowRequestPermissionRationale("android.permission.READ_EXTERNAL_STORAGE");
        }
        return fragment.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean shouldShowMicrophoneRequestPermissionRationale(Fragment fragment) {
        return fragment.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO");
    }

    public static boolean shouldShowRequestPermissionRationale(Fragment fragment) {
        return shouldShowMicrophoneRequestPermissionRationale(fragment) || shouldShowCameraRequestPermissionRationale(fragment) || shouldShowMediaRequestPermissionRationale(fragment);
    }

    public static void showAllPermissionsInfoDialog(Context context, Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(context.getResources().getString(C10746R.string.viewer_camera_permissions_info_message).replace(APP_NAME_PLACEHOLDER, getAppName(context)));
        builder.setPositiveButton(C10746R.string.viewer_ok_button, new PermissionUtilities$$ExternalSyntheticLambda8(runnable));
        builder.setNeutralButton(C10746R.string.viewer_settings_button, new PermissionUtilities$$ExternalSyntheticLambda9(context));
        builder.create().show();
        ViewerLogger.getInstance().logUIEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_CAMERA_REMINDED);
    }

    public static void showAllPermissionsRationaleDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(context.getResources().getString(C10746R.string.viewer_all_permissions_rationale_message).replace(APP_NAME_PLACEHOLDER, getAppName(context)));
        builder.setPositiveButton(C10746R.string.viewer_settings_button, new PermissionUtilities$$ExternalSyntheticLambda4(context));
        builder.setNegativeButton(C10746R.string.viewer_permissions_rationale_deny, PermissionUtilities$$ExternalSyntheticLambda5.INSTANCE);
        builder.create().show();
    }

    public static void showCameraPermissionsInfoDialog(Context context, Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(context.getResources().getString(C10746R.string.viewer_camera_permissions_info_message).replace(APP_NAME_PLACEHOLDER, getAppName(context)));
        builder.setPositiveButton(C10746R.string.viewer_ok_button, new PermissionUtilities$$ExternalSyntheticLambda2(runnable));
        builder.setNeutralButton(C10746R.string.viewer_settings_button, new PermissionUtilities$$ExternalSyntheticLambda3(context));
        builder.create().show();
        ViewerLogger.getInstance().logUIEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.PERMISSIONS_CAMERA_REMINDED);
    }

    public static void showCameraPermissionsRationaleDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(context.getResources().getString(C10746R.string.viewer_camera_permissions_rationale_message).replace(APP_NAME_PLACEHOLDER, getAppName(context)));
        builder.setPositiveButton(C10746R.string.viewer_settings_button, new PermissionUtilities$$ExternalSyntheticLambda6(context));
        builder.setNegativeButton(C10746R.string.viewer_permissions_rationale_deny, PermissionUtilities$$ExternalSyntheticLambda7.INSTANCE);
        builder.create().show();
    }

    public static void showMediaAndMicrophonePermissionsRationaleDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(context.getResources().getString(C10746R.string.viewer_media_permissions_rationale_message).replace(APP_NAME_PLACEHOLDER, getAppName(context)));
        builder.setPositiveButton(C10746R.string.viewer_settings_button, new PermissionUtilities$$ExternalSyntheticLambda0(context));
        builder.setNegativeButton(C10746R.string.viewer_permissions_rationale_deny, PermissionUtilities$$ExternalSyntheticLambda1.INSTANCE);
        builder.create().show();
    }
}
