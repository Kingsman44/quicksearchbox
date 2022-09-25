package com.android.launcher3.model;

import android.content.Context;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import java.util.Comparator;

/* compiled from: PG */
public class AbstractUserComparator implements Comparator {
    public final UserHandleCompat mMyUser = UserHandleCompat.myUserHandle();
    public final UserManagerCompat mUserManager;

    public AbstractUserComparator(Context context) {
        this.mUserManager = UserManagerCompat.getInstance(context);
    }

    public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
        throw null;
    }
}
