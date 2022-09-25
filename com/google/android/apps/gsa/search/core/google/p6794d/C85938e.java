package com.google.android.apps.gsa.search.core.google.p6794d;

import com.google.android.apps.gsa.shared.p6968aa.C89033bd;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.e */
/* compiled from: PG */
public final class C85938e {

    /* renamed from: a */
    private static final C59071e f232355a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.d.e");

    /* renamed from: b */
    private static final C58485gu f232356b = C58485gu.m89847o("application/x-protobuffer", "application/protobuf");

    /* renamed from: c */
    private static final C58485gu f232357c = C58485gu.m89847o("application/json", "x-application/json");

    /* renamed from: d */
    private static final C58485gu f232358d = C58485gu.m89846n("text/html");

    /* renamed from: a */
    public static int m138129a(C89033bd bdVar) {
        String str;
        if (!(bdVar == null || (str = bdVar.f241307b) == null)) {
            if (f232358d.contains(str)) {
                return 1;
            }
            if (f232357c.contains(bdVar.f241307b)) {
                return 2;
            }
            if (f232356b.contains(bdVar.f241307b)) {
                return 3;
            }
        }
        ((C59052c) ((C59052c) f232355a.mo56226d()).mo56372aa(8076)).mo56389s("Could not parse response format from Content-Type: %s", bdVar);
        return 0;
    }

    /* renamed from: b */
    public static String m138130b(int i) {
        return i != 1 ? i != 2 ? "PROTO" : "JSON" : "RAW";
    }
}
