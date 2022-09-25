package com.android.launcher3.util;

import android.content.ComponentName;
import com.android.launcher3.compat.UserHandleCompat;
import java.util.Arrays;

/* compiled from: PG */
public class ComponentKey {
    public final ComponentName componentName;
    public final int mHashCode;
    public final UserHandleCompat user;

    public ComponentKey(ComponentName componentName2, UserHandleCompat userHandleCompat) {
        this.componentName = componentName2;
        this.user = userHandleCompat;
        this.mHashCode = Arrays.hashCode(new Object[]{componentName2, userHandleCompat});
    }

    public boolean equals(Object obj) {
        ComponentKey componentKey = (ComponentKey) obj;
        return componentKey.componentName.equals(this.componentName) && componentKey.user.equals(this.user);
    }

    public int hashCode() {
        return this.mHashCode;
    }
}
