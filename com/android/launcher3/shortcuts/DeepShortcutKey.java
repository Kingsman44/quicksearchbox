package com.android.launcher3.shortcuts;

import android.content.ComponentName;
import android.content.Intent;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.util.ComponentKey;

/* compiled from: PG */
public final class DeepShortcutKey extends ComponentKey {
    public DeepShortcutKey(String str, UserHandleCompat userHandleCompat, String str2) {
        super(new ComponentName(str, str2), userHandleCompat);
    }

    public static DeepShortcutKey fromInfo(ShortcutInfoCompat shortcutInfoCompat) {
        return new DeepShortcutKey(shortcutInfoCompat.getPackage(), shortcutInfoCompat.getUserHandle(), shortcutInfoCompat.getId());
    }

    public static DeepShortcutKey fromIntent(Intent intent, UserHandleCompat userHandleCompat) {
        return new DeepShortcutKey(intent.getPackage(), userHandleCompat, intent.getStringExtra("shortcut_id"));
    }

    public static DeepShortcutKey fromShortcutInfo(ShortcutInfo shortcutInfo) {
        return fromIntent(shortcutInfo.getPromisedIntent(), shortcutInfo.user);
    }
}
