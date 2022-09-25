package com.android.launcher3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.UserManager;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.Toast;
import com.android.launcher3.DropTarget;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class UninstallDropTarget extends ButtonDropTarget {

    /* compiled from: PG */
    public interface UninstallSource {
        void deferCompleteDropAfterUninstallActivity();

        void onUninstallActivityReturned(boolean z);
    }

    public UninstallDropTarget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static Pair getAppInfoFlags(Object obj) {
        if (obj instanceof AppInfo) {
            AppInfo appInfo = (AppInfo) obj;
            return Pair.create(appInfo.componentName, Integer.valueOf(appInfo.flags));
        } else if (!(obj instanceof ShortcutInfo)) {
            return null;
        } else {
            ShortcutInfo shortcutInfo = (ShortcutInfo) obj;
            ComponentName targetComponent = shortcutInfo.getTargetComponent();
            if (shortcutInfo.itemType != 0 || targetComponent == null) {
                return null;
            }
            return Pair.create(targetComponent, Integer.valueOf(shortcutInfo.flags));
        }
    }

    static final void sendUninstallResult$ar$ds(DragSource dragSource, boolean z) {
        if (dragSource instanceof UninstallSource) {
            ((UninstallSource) dragSource).onUninstallActivityReturned(z);
        }
    }

    public static boolean startUninstallActivity(Launcher launcher, Object obj) {
        Pair appInfoFlags = getAppInfoFlags(obj);
        UserHandleCompat userHandleCompat = ((ItemInfo) obj).user;
        ComponentName componentName = (ComponentName) appInfoFlags.first;
        if ((((Integer) appInfoFlags.second).intValue() & 1) == 0) {
            Toast.makeText(launcher, R.string.uninstall_system_app_text, 0).show();
            return false;
        }
        Intent intent = new Intent("android.intent.action.DELETE", Uri.fromParts("package", componentName.getPackageName(), componentName.getClassName()));
        intent.setFlags(276824064);
        if (userHandleCompat != null) {
            userHandleCompat.addToIntent(intent, "android.intent.extra.USER");
        }
        launcher.startActivity(intent);
        return true;
    }

    public static boolean supportsDrop(Context context, Object obj) {
        if (Utilities.ATLEAST_JB_MR2) {
            Bundle userRestrictions = ((UserManager) context.getSystemService("user")).getUserRestrictions();
            if (userRestrictions.getBoolean("no_control_apps", false) || userRestrictions.getBoolean("no_uninstall_apps", false)) {
                return false;
            }
        }
        Pair appInfoFlags = getAppInfoFlags(obj);
        if (appInfoFlags == null || (((Integer) appInfoFlags.second).intValue() & 1) == 0) {
            return false;
        }
        return true;
    }

    public final void completeDrop(final DropTarget.DragObject dragObject) {
        final Pair appInfoFlags = getAppInfoFlags(dragObject.dragInfo);
        Object obj = dragObject.dragInfo;
        final UserHandleCompat userHandleCompat = ((ItemInfo) obj).user;
        if (startUninstallActivity(this.mLauncher, obj)) {
            this.mLauncher.mOnResumeCallbacks.add(new Runnable() {
                public final void run() {
                    UninstallDropTarget.sendUninstallResult$ar$ds(dragObject.dragSource, !(LauncherAppsCompat.getInstance(UninstallDropTarget.this.getContext()).getActivityList(((ComponentName) appInfoFlags.first).getPackageName(), userHandleCompat).size() > 0));
                }
            });
            return;
        }
        sendUninstallResult$ar$ds(dragObject.dragSource, false);
    }

    public final void onDrop(DropTarget.DragObject dragObject) {
        DragSource dragSource = dragObject.dragSource;
        if (dragSource instanceof UninstallSource) {
            ((UninstallSource) dragSource).deferCompleteDropAfterUninstallActivity();
        }
        super.onDrop(dragObject);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.mHoverColor = getResources().getColor(R.color.uninstall_target_hover_tint);
        setDrawable(R.drawable.ic_uninstall_launcher);
    }

    public UninstallDropTarget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final boolean supportsDrop(DragSource dragSource, Object obj) {
        return supportsDrop(getContext(), obj);
    }
}
