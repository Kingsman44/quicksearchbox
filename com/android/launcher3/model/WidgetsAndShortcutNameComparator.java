package com.android.launcher3.model;

import android.content.Context;
import android.util.Log;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.compat.AppWidgetManagerCompat;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.util.ComponentKey;
import com.evernote.android.state.BuildConfig;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: PG */
public final class WidgetsAndShortcutNameComparator implements Comparator {
    private final Collator mCollator = Collator.getInstance();
    public final HashMap mLabelCache = new HashMap();
    private final UserHandleCompat mMainHandle = UserHandleCompat.myUserHandle();
    private final AppWidgetManagerCompat mManager;

    public WidgetsAndShortcutNameComparator(Context context) {
        this.mManager = AppWidgetManagerCompat.getInstance(context);
        context.getPackageManager();
    }

    private final ComponentKey getComponentKey(Object obj) {
        if (obj instanceof LauncherAppWidgetProviderInfo) {
            LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo = (LauncherAppWidgetProviderInfo) obj;
            return new ComponentKey(launcherAppWidgetProviderInfo.provider, this.mManager.getUser(launcherAppWidgetProviderInfo));
        }
        ShortcutConfigActivityInfo shortcutConfigActivityInfo = (ShortcutConfigActivityInfo) obj;
        return new ComponentKey(shortcutConfigActivityInfo.getComponent(), shortcutConfigActivityInfo.getUser());
    }

    private final String getLabel(Object obj) {
        if (obj instanceof LauncherAppWidgetProviderInfo) {
            return Utilities.trim(this.mManager.loadLabel((LauncherAppWidgetProviderInfo) obj));
        }
        try {
            return Utilities.trim(((ShortcutConfigActivityInfo) obj).getLabel());
        } catch (Exception e) {
            Log.e("ShortcutNameComparator", "Failed to extract app display name from resolve info", e);
            return BuildConfig.FLAVOR;
        }
    }

    public final int compare(Object obj, Object obj2) {
        ComponentKey componentKey = getComponentKey(obj);
        ComponentKey componentKey2 = getComponentKey(obj2);
        boolean z = !this.mMainHandle.equals(componentKey.user);
        boolean z2 = !this.mMainHandle.equals(componentKey2.user);
        if (z && !z2) {
            return 1;
        }
        if (!z && z2) {
            return -1;
        }
        String str = (String) this.mLabelCache.get(componentKey);
        String str2 = (String) this.mLabelCache.get(componentKey2);
        if (str == null) {
            str = getLabel(obj);
            this.mLabelCache.put(componentKey, str);
        }
        if (str2 == null) {
            str2 = getLabel(obj2);
            this.mLabelCache.put(componentKey2, str2);
        }
        return this.mCollator.compare(str, str2);
    }
}
