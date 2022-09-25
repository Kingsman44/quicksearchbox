package com.android.launcher3.model;

import android.content.Context;
import com.android.launcher3.AppFilter;
import com.android.launcher3.IconCache;
import com.android.launcher3.compat.AlphabeticIndexCompat;
import com.android.launcher3.compat.AppWidgetManagerCompat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: PG */
public final class WidgetsModel {
    public final AppFilter mAppFilter;
    public final Comparator mAppNameComparator;
    public final AppWidgetManagerCompat mAppWidgetMgr;
    public final IconCache mIconCache;
    public final AlphabeticIndexCompat mIndexer;
    public final ArrayList mPackageItemInfos;
    public ArrayList mRawList;
    public final WidgetsAndShortcutNameComparator mWidgetAndShortcutNameComparator;
    public final HashMap mWidgetsList;

    public WidgetsModel(Context context, IconCache iconCache, AppFilter appFilter) {
        this.mAppWidgetMgr = AppWidgetManagerCompat.getInstance(context);
        this.mWidgetAndShortcutNameComparator = new WidgetsAndShortcutNameComparator(context);
        this.mAppNameComparator = new AppNameComparator(context).mAppInfoComparator;
        this.mIconCache = iconCache;
        this.mAppFilter = appFilter;
        this.mIndexer = new AlphabeticIndexCompat(context);
        this.mPackageItemInfos = new ArrayList();
        this.mWidgetsList = new HashMap();
        this.mRawList = new ArrayList();
    }

    public final /* synthetic */ Object clone() {
        return new WidgetsModel(this);
    }

    public final PackageItemInfo getPackageItemInfo(int i) {
        if (i >= this.mPackageItemInfos.size() || i < 0) {
            return null;
        }
        return (PackageItemInfo) this.mPackageItemInfos.get(i);
    }

    public WidgetsModel(WidgetsModel widgetsModel) {
        this.mAppWidgetMgr = widgetsModel.mAppWidgetMgr;
        this.mPackageItemInfos = (ArrayList) widgetsModel.mPackageItemInfos.clone();
        this.mWidgetsList = (HashMap) widgetsModel.mWidgetsList.clone();
        this.mWidgetAndShortcutNameComparator = widgetsModel.mWidgetAndShortcutNameComparator;
        this.mAppNameComparator = widgetsModel.mAppNameComparator;
        this.mIconCache = widgetsModel.mIconCache;
        this.mAppFilter = widgetsModel.mAppFilter;
        this.mIndexer = widgetsModel.mIndexer;
        this.mRawList = (ArrayList) widgetsModel.mRawList.clone();
    }
}
