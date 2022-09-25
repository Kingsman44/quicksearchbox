package com.android.launcher3.compat;

import android.content.Context;
import android.os.UserManager;
import com.android.launcher3.util.LongArrayMap;
import java.util.HashMap;

/* compiled from: PG */
public class UserManagerCompatV17 extends UserManagerCompatV16 {
    protected UserManager mUserManager;
    protected HashMap mUserToSerialMap;
    protected LongArrayMap mUsers;

    public UserManagerCompatV17(Context context) {
        this.mUserManager = (UserManager) context.getSystemService("user");
    }

    public void enableAndResetCache() {
        synchronized (this) {
            this.mUsers = new LongArrayMap();
            this.mUserToSerialMap = new HashMap();
            UserHandleCompat myUserHandle = UserHandleCompat.myUserHandle();
            long serialNumberForUser = this.mUserManager.getSerialNumberForUser(myUserHandle.getUser());
            this.mUsers.put(serialNumberForUser, myUserHandle);
            this.mUserToSerialMap.put(myUserHandle, Long.valueOf(serialNumberForUser));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getSerialNumberForUser(com.android.launcher3.compat.UserHandleCompat r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap r0 = r2.mUserToSerialMap     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0016
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0022 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0014
        L_0x0010:
            long r0 = r3.longValue()     // Catch:{ all -> 0x0022 }
        L_0x0014:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r0
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            android.os.UserManager r0 = r2.mUserManager
            android.os.UserHandle r3 = r3.getUser()
            long r0 = r0.getSerialNumberForUser(r3)
            return r0
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.compat.UserManagerCompatV17.getSerialNumberForUser(com.android.launcher3.compat.UserHandleCompat):long");
    }

    public UserHandleCompat getUserForSerialNumber(long j) {
        synchronized (this) {
            LongArrayMap longArrayMap = this.mUsers;
            if (longArrayMap == null) {
                return UserHandleCompat.fromUser(this.mUserManager.getUserForSerialNumber(j));
            }
            UserHandleCompat userHandleCompat = (UserHandleCompat) longArrayMap.get(j);
            return userHandleCompat;
        }
    }
}
