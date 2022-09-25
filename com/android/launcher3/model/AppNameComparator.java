package com.android.launcher3.model;

import android.content.Context;
import com.android.launcher3.AppInfo;
import com.android.launcher3.ItemInfo;
import java.text.Collator;
import java.util.Comparator;

/* compiled from: PG */
public final class AppNameComparator {
    public final AbstractUserComparator mAppInfoComparator;
    private final Collator mCollator = Collator.getInstance();
    public final Comparator mSectionNameComparator;

    public AppNameComparator(Context context) {
        this.mAppInfoComparator = new AbstractUserComparator(context) {
            public final int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
                int compareTitles = AppNameComparator.this.compareTitles(itemInfo.title.toString(), itemInfo2.title.toString());
                if (compareTitles != 0) {
                    return compareTitles;
                }
                if (!(itemInfo instanceof AppInfo) || !(itemInfo2 instanceof AppInfo)) {
                    return 0;
                }
                int compareTo = ((AppInfo) itemInfo).componentName.compareTo(((AppInfo) itemInfo2).componentName);
                if (compareTo != 0) {
                    return compareTo;
                }
                if (this.mMyUser.equals(itemInfo.user)) {
                    return -1;
                }
                return Long.valueOf(this.mUserManager.getSerialNumberForUser(itemInfo.user)).compareTo(Long.valueOf(this.mUserManager.getSerialNumberForUser(itemInfo2.user)));
            }

            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return compare((ItemInfo) obj, (ItemInfo) obj2);
            }
        };
        this.mSectionNameComparator = new Comparator() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return AppNameComparator.this.compareTitles((String) obj, (String) obj2);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final int compareTitles(String str, String str2) {
        boolean z = false;
        boolean z2 = str.length() > 0 && Character.isLetterOrDigit(str.codePointAt(0));
        if (str2.length() > 0 && Character.isLetterOrDigit(str2.codePointAt(0))) {
            z = true;
        }
        if (z2 && !z) {
            return -1;
        }
        if (z2 || !z) {
            return this.mCollator.compare(str, str2);
        }
        return 1;
    }
}
