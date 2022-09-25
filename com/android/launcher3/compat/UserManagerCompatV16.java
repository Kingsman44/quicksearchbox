package com.android.launcher3.compat;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class UserManagerCompatV16 extends UserManagerCompat {
    public void enableAndResetCache() {
    }

    public CharSequence getBadgedLabelForUser(CharSequence charSequence, UserHandleCompat userHandleCompat) {
        return charSequence;
    }

    public long getSerialNumberForUser(UserHandleCompat userHandleCompat) {
        return 0;
    }

    public long getUserCreationTime(UserHandleCompat userHandleCompat) {
        return 0;
    }

    public UserHandleCompat getUserForSerialNumber(long j) {
        return UserHandleCompat.myUserHandle();
    }

    public List getUserProfiles() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(UserHandleCompat.myUserHandle());
        return arrayList;
    }

    public boolean isQuietModeEnabled(UserHandleCompat userHandleCompat) {
        return false;
    }

    public boolean isUserUnlocked(UserHandleCompat userHandleCompat) {
        return true;
    }
}
