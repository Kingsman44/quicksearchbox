package com.android.launcher3;

import android.content.ComponentName;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.util.FlagOp;
import com.android.launcher3.util.StringFilter;
import java.util.ArrayList;

/* compiled from: PG */
final class AllAppsList {
    public ArrayList added = new ArrayList(42);
    public final ArrayList data = new ArrayList(42);
    private final AppFilter mAppFilter;
    public final IconCache mIconCache;
    public final ArrayList modified = new ArrayList();
    public final ArrayList removed = new ArrayList();

    public AllAppsList(IconCache iconCache, AppFilter appFilter) {
        this.mIconCache = iconCache;
        this.mAppFilter = appFilter;
    }

    public final void add(AppInfo appInfo) {
        AppFilter appFilter = this.mAppFilter;
        if (appFilter == null || appFilter.shouldShowApp$ar$ds()) {
            ArrayList arrayList = this.data;
            ComponentName componentName = appInfo.componentName;
            UserHandleCompat userHandleCompat = appInfo.user;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                AppInfo appInfo2 = (AppInfo) arrayList.get(i);
                if (!appInfo2.user.equals(userHandleCompat) || !appInfo2.componentName.equals(componentName)) {
                    i++;
                } else {
                    return;
                }
            }
            this.data.add(appInfo);
            this.added.add(appInfo);
        }
    }

    public final void updatePackageFlags(StringFilter stringFilter, UserHandleCompat userHandleCompat, FlagOp flagOp) {
        ArrayList arrayList = this.data;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AppInfo appInfo = (AppInfo) arrayList.get(size);
                ComponentName component = appInfo.intent.getComponent();
                if (appInfo.user.equals(userHandleCompat) && stringFilter.matches(component.getPackageName())) {
                    appInfo.isDisabled = flagOp.apply(appInfo.isDisabled);
                    this.modified.add(appInfo);
                }
            } else {
                return;
            }
        }
    }
}
