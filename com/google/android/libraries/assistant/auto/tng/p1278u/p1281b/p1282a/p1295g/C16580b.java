package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1295g;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.g.b */
/* compiled from: PG */
public final class C16580b {

    /* renamed from: a */
    public static final int[] f48619a = {-1, -1};

    /* renamed from: b */
    private static final C59071e f48620b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.u.b.a.g.b");

    /* renamed from: a */
    public static int[] m33630a(String str) {
        if (str == null || str.length() < 3) {
            ((C59052c) ((C59052c) f48620b.mo56224b()).mo56372aa(46391)).mo56386p("MccMnc is either null or has incorrect length.");
            return f48619a;
        }
        try {
            return new int[]{Integer.parseInt(str.substring(0, 3)), Integer.parseInt(str.substring(3))};
        } catch (NumberFormatException e) {
            ((C59052c) ((C59052c) ((C59052c) f48620b.mo56225c()).mo56382g(e)).mo56372aa(46392)).mo56389s("Wrong mccMnc: %s", str);
            return f48619a;
        }
    }
}
