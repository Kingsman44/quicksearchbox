package com.google.android.apps.gsa.search.shared.actions.util;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.q */
/* compiled from: PG */
public final class C87495q {

    /* renamed from: a */
    public static final C59071e f236322a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.actions.util.q");

    /* renamed from: a */
    public static int m142027a(int i) {
        if (i == 65536) {
            return 7;
        }
        if (i == 131072) {
            return 1;
        }
        if (i == 262144) {
            return 2;
        }
        if (i == 524288) {
            return 3;
        }
        if (i == 1048576) {
            return 4;
        }
        if (i == 2097152) {
            return 5;
        }
        if (i == 4194304) {
            return 6;
        }
        ((C59052c) ((C59052c) f236322a.mo56225c()).mo56372aa(9574)).mo56387q("The day %d is invalid.", i);
        return 0;
    }
}
