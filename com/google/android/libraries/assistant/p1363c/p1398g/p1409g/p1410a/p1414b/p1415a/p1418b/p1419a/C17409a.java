package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.p1418b.p1419a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.a.b.a.a */
/* compiled from: PG */
public final class C17409a {

    /* renamed from: a */
    public static final int[] f50305a = {-1, -1};

    /* renamed from: b */
    private static final C59071e f50306b = C59071e.m91332i("com.google.android.libraries.assistant.c.g.g.a.b.a.b.a.a");

    /* renamed from: a */
    public static int[] m34686a(String str) {
        if (str == null || str.length() < 3) {
            C59104x b = f50306b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TTS.Server");
            ((C59052c) ((C59052c) b).mo56372aa(42713)).mo56386p("MccMnc is either null or has incorrect length.");
            return f50305a;
        }
        try {
            return new int[]{Integer.parseInt(str.substring(0, 3)), Integer.parseInt(str.substring(3))};
        } catch (NumberFormatException e) {
            C59104x c = f50306b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TTS.Server");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(42714)).mo56389s("Wrong mccMnc: %s", str);
            return f50305a;
        }
    }
}
