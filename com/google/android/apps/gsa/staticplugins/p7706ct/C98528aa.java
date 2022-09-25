package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.p8889z.p8917f.C119073b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.aa */
/* compiled from: PG */
public final class C98528aa {

    /* renamed from: a */
    private static final C59071e f275122a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ct.aa");

    /* renamed from: a */
    static boolean m163207a(String str, int i) {
        Integer num = (Integer) C119073b.f332165a.get(str);
        if (num == null) {
            ((C59052c) ((C59052c) f275122a.mo56226d()).mo56372aa(30864)).mo56389s("isActionEnabled() - unknown, assuming true: %s", str);
            return true;
        } else if ((num.intValue() & i) != 0) {
            return true;
        } else {
            return false;
        }
    }
}
