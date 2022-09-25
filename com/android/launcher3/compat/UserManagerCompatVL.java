package com.android.launcher3.compat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import com.android.launcher3.Utilities;
import com.android.launcher3.util.LongArrayMap;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
public class UserManagerCompatVL extends UserManagerCompatV17 {
    private static final String USER_CREATION_TIME_KEY = "user_creation_time_";
    private final Context mContext;
    private final PackageManager mPm;

    public UserManagerCompatVL(Context context) {
        super(context);
        this.mPm = context.getPackageManager();
        this.mContext = context;
    }

    public void enableAndResetCache() {
        synchronized (this) {
            this.mUsers = new LongArrayMap();
            this.mUserToSerialMap = new HashMap();
            List<UserHandle> userProfiles = this.mUserManager.getUserProfiles();
            if (userProfiles != null) {
                for (UserHandle next : userProfiles) {
                    long serialNumberForUser = this.mUserManager.getSerialNumberForUser(next);
                    UserHandleCompat fromUser = UserHandleCompat.fromUser(next);
                    this.mUsers.put(serialNumberForUser, fromUser);
                    this.mUserToSerialMap.put(fromUser, Long.valueOf(serialNumberForUser));
                }
            }
        }
    }

    public CharSequence getBadgedLabelForUser(CharSequence charSequence, UserHandleCompat userHandleCompat) {
        return userHandleCompat == null ? charSequence : this.mPm.getUserBadgedLabel(charSequence, userHandleCompat.getUser());
    }

    public long getUserCreationTime(UserHandleCompat userHandleCompat) {
        if (Utilities.ATLEAST_MARSHMALLOW) {
            return this.mUserManager.getUserCreationTime(userHandleCompat.getUser());
        }
        SharedPreferences prefs = Utilities.getPrefs(this.mContext);
        String str = USER_CREATION_TIME_KEY + getSerialNumberForUser(userHandleCompat);
        if (!prefs.contains(str)) {
            prefs.edit().putLong(str, System.currentTimeMillis()).apply();
        }
        return prefs.getLong(str, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r1 = new java.util.ArrayList(r0.size());
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0.hasNext() == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r1.add(com.android.launcher3.compat.UserHandleCompat.fromUser(r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = r3.mUserManager.getUserProfiles();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r0 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List getUserProfiles() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.android.launcher3.util.LongArrayMap r0 = r3.mUsers     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0015
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0045 }
            r0.<init>()     // Catch:{ all -> 0x0045 }
            java.util.HashMap r1 = r3.mUserToSerialMap     // Catch:{ all -> 0x0045 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0045 }
            r0.addAll(r1)     // Catch:{ all -> 0x0045 }
            monitor-exit(r3)     // Catch:{ all -> 0x0045 }
            return r0
        L_0x0015:
            monitor-exit(r3)     // Catch:{ all -> 0x0045 }
            android.os.UserManager r0 = r3.mUserManager
            java.util.List r0 = r0.getUserProfiles()
            if (r0 != 0) goto L_0x0023
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0023:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0030:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r0.next()
            android.os.UserHandle r2 = (android.os.UserHandle) r2
            com.android.launcher3.compat.UserHandleCompat r2 = com.android.launcher3.compat.UserHandleCompat.fromUser(r2)
            r1.add(r2)
            goto L_0x0030
        L_0x0044:
            return r1
        L_0x0045:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0049
        L_0x0048:
            throw r0
        L_0x0049:
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.compat.UserManagerCompatVL.getUserProfiles():java.util.List");
    }
}
