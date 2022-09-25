package com.google.android.apps.gsa.shared.util.p7187ui;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.t */
/* compiled from: PG */
public final class C91121t {

    /* renamed from: a */
    private static final C59071e f254435a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.ui.t");

    /* renamed from: a */
    public static int m148887a(int... iArr) {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                i = -1;
                break;
            }
            i = iArr[i2];
            if (i != -1) {
                break;
            }
            i2++;
        }
        if (i != -1) {
            return i;
        }
        ((C59052c) ((C59052c) f254435a.mo56226d()).mo56372aa(11462)).mo56386p("No ID found.");
        throw new IllegalArgumentException("No ID found.");
    }
}
