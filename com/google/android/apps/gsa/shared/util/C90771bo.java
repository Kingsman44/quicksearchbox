package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.bo */
/* compiled from: PG */
public final class C90771bo {
    /* renamed from: a */
    public static List m148272a(Context context) {
        ArrayList<UserHandleCompat> arrayList;
        List<UserHandle> userProfiles = ((UserManager) context.getSystemService("user")).getUserProfiles();
        if (userProfiles == null) {
            arrayList = new ArrayList<>();
        } else {
            ArrayList e = C58597ky.m90214e(userProfiles.size());
            for (UserHandle userHandleCompat : userProfiles) {
                e.add(new UserHandleCompat(userHandleCompat));
            }
            arrayList = e;
        }
        if (arrayList.size() <= 1) {
            return new ArrayList();
        }
        ArrayList b = C58597ky.m90211b(arrayList);
        for (UserHandleCompat userHandleCompat2 : arrayList) {
            if (userHandleCompat2.mo85068b()) {
                b.remove(userHandleCompat2);
            }
        }
        return b;
    }

    /* renamed from: b */
    public static boolean m148273b(Context context, UserHandleCompat userHandleCompat) {
        return m148272a(context).contains(userHandleCompat);
    }
}
