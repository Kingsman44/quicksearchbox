package com.android.launcher3.compat;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.shortcuts.DeepShortcutKey;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import java.util.List;

/* compiled from: PG */
public abstract class DeepShortcutManagerCompat {
    protected static final int FLAG_GET_ALL = 11;
    protected static final int FLAG_MATCH_DYNAMIC = 1;
    protected static final int FLAG_MATCH_MANIFEST = 8;
    protected static final int FLAG_MATCH_PINNED = 2;
    protected static final String TAG = "DeepShortcutManager";
    private static DeepShortcutManagerCompat sInstance;
    private static final Object sInstanceLock = new Object();

    public static DeepShortcutManagerCompat getInstance(Context context) {
        DeepShortcutManagerCompat deepShortcutManagerCompat;
        synchronized (sInstanceLock) {
            if (sInstance == null) {
                boolean z = Utilities.ATLEAST_O;
                sInstance = new DeepShortcutManagerCompatVNMR1(context.getApplicationContext());
            }
            deepShortcutManagerCompat = sInstance;
        }
        return deepShortcutManagerCompat;
    }

    public static boolean supportsShortcuts(ItemInfo itemInfo) {
        boolean z = Utilities.ATLEAST_O;
        return itemInfo.itemType == 0 && !itemInfo.isDisabled();
    }

    public abstract Drawable getShortcutIconDrawable(ShortcutInfoCompat shortcutInfoCompat, int i);

    public abstract boolean hasHostPermission();

    public abstract void onShortcutsChanged(List list);

    public abstract void pinShortcut(DeepShortcutKey deepShortcutKey);

    public abstract List queryForAllShortcuts(UserHandleCompat userHandleCompat);

    public abstract List queryForFullDetails(String str, List list, UserHandleCompat userHandleCompat);

    public abstract List queryForPinnedShortcuts(String str, UserHandleCompat userHandleCompat);

    public abstract List queryForShortcutsContainer(String str, List list, UserHandleCompat userHandleCompat);

    public abstract void startShortcut(String str, String str2, Rect rect, Bundle bundle, UserHandleCompat userHandleCompat);

    public abstract void unpinShortcut(DeepShortcutKey deepShortcutKey);

    public abstract boolean wasLastCallSuccess();
}
