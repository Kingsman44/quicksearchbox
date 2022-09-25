package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.t */
/* compiled from: PG */
public final class C95624t {

    /* renamed from: a */
    private static final List f267620a;

    static {
        ArrayList arrayList = new ArrayList();
        f267620a = arrayList;
        arrayList.add(new C95623s());
    }

    /* renamed from: a */
    public static boolean m158316a(C90421b bVar, boolean z) {
        for (C95623s sVar : f267620a) {
            if (bVar.f252591l.equals("com.whatsapp")) {
                if (!z) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
