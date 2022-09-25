package com.google.android.enterprise.connectedapps;

import android.os.UserHandle;
import android.os.UserManager;
import java.util.Comparator;

/* renamed from: com.google.android.enterprise.connectedapps.g */
/* compiled from: PG */
public final /* synthetic */ class C142572g implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ UserManager f386863a;

    public /* synthetic */ C142572g(UserManager userManager) {
        this.f386863a = userManager;
    }

    public final int compare(Object obj, Object obj2) {
        UserManager userManager = this.f386863a;
        return (int) (userManager.getSerialNumberForUser((UserHandle) obj) - userManager.getSerialNumberForUser((UserHandle) obj2));
    }
}
