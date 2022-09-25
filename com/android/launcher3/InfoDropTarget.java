package com.android.launcher3;

import android.content.ComponentName;
import android.content.Context;
import android.util.AttributeSet;
import com.android.launcher3.DropTarget;
import com.android.launcher3.compat.UserHandleCompat;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class InfoDropTarget extends ButtonDropTarget {
    public InfoDropTarget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void startDetailsActivityForInfo(Object obj, Launcher launcher) {
        ComponentName componentName;
        UserHandleCompat userHandleCompat;
        if (obj instanceof AppInfo) {
            componentName = ((AppInfo) obj).componentName;
        } else if (obj instanceof ShortcutInfo) {
            componentName = ((ShortcutInfo) obj).intent.getComponent();
        } else {
            componentName = obj instanceof PendingAddItemInfo ? ((PendingAddItemInfo) obj).componentName : null;
        }
        if (obj instanceof ItemInfo) {
            userHandleCompat = ((ItemInfo) obj).user;
        } else {
            userHandleCompat = UserHandleCompat.myUserHandle();
        }
        if (componentName != null) {
            launcher.startApplicationDetailsActivity(componentName, userHandleCompat);
        }
    }

    public static boolean supportsDrop$ar$ds(Object obj) {
        return (obj instanceof AppInfo) || (obj instanceof PendingAddItemInfo);
    }

    public final void completeDrop(DropTarget.DragObject dragObject) {
        startDetailsActivityForInfo(dragObject.dragInfo, this.mLauncher);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.mHoverColor = getResources().getColor(R.color.info_target_hover_tint);
        setDrawable(R.drawable.ic_info_launcher);
    }

    /* access modifiers changed from: protected */
    public final boolean supportsDrop(DragSource dragSource, Object obj) {
        if (!dragSource.supportsAppInfoDropTarget()) {
            return false;
        }
        getContext();
        return supportsDrop$ar$ds(obj);
    }

    public InfoDropTarget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
