package com.android.launcher3.compat;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.android.launcher3.shortcuts.DeepShortcutKey;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class DeepShortcutManagerCompatV16 extends DeepShortcutManagerCompat {
    public Drawable getShortcutIconDrawable(ShortcutInfoCompat shortcutInfoCompat, int i) {
        return null;
    }

    public boolean hasHostPermission() {
        return false;
    }

    public void onShortcutsChanged(List list) {
    }

    public void pinShortcut(DeepShortcutKey deepShortcutKey) {
    }

    public List queryForAllShortcuts(UserHandleCompat userHandleCompat) {
        return Collections.EMPTY_LIST;
    }

    public List queryForFullDetails(String str, List list, UserHandleCompat userHandleCompat) {
        return Collections.EMPTY_LIST;
    }

    public List queryForPinnedShortcuts(String str, UserHandleCompat userHandleCompat) {
        return Collections.EMPTY_LIST;
    }

    public List queryForShortcutsContainer(String str, List list, UserHandleCompat userHandleCompat) {
        return Collections.EMPTY_LIST;
    }

    public void startShortcut(String str, String str2, Rect rect, Bundle bundle, UserHandleCompat userHandleCompat) {
    }

    public void unpinShortcut(DeepShortcutKey deepShortcutKey) {
    }

    public boolean wasLastCallSuccess() {
        return false;
    }
}
