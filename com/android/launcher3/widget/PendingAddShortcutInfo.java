package com.android.launcher3.widget;

import com.android.launcher3.PendingAddItemInfo;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;

/* compiled from: PG */
public final class PendingAddShortcutInfo extends PendingAddItemInfo {
    public final ShortcutConfigActivityInfo activityInfo;

    public PendingAddShortcutInfo(ShortcutConfigActivityInfo shortcutConfigActivityInfo) {
        this.activityInfo = shortcutConfigActivityInfo;
        this.componentName = shortcutConfigActivityInfo.getComponent();
        this.itemType = 1;
        this.user = shortcutConfigActivityInfo.getUser();
    }

    public final String toString() {
        return String.format("PendingAddShortcutInfo ".concat(String.valueOf(String.valueOf(this.activityInfo.getComponent()))), new Object[0]);
    }
}
