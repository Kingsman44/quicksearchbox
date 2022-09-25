package com.google.p4486ci.p4487a;

import com.google.common.base.C58838bb;
import com.google.common.base.C58890d;

/* renamed from: com.google.ci.a.x */
/* compiled from: PG */
public final class C58119x {
    /* renamed from: a */
    public static final C58114s m88920a(String str, C58100e eVar, C58097b bVar, String str2) {
        boolean z = true;
        if (!C58890d.m90990e("POST", "put") && !C58890d.m90990e("POST", "post")) {
            z = false;
        }
        C58838bb.m90868c(z);
        if (bVar.mo54644e() == -1 || bVar.mo54644e() >= 0) {
            return new C58112q(str, "POST", eVar, bVar, str2, false);
        }
        return new C58108m(str, eVar, bVar, str2);
    }
}
