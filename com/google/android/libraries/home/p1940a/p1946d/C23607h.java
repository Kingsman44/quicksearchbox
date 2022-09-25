package com.google.android.libraries.home.p1940a.p1946d;

import com.google.android.libraries.home.p1940a.p1943c.C23524cy;
import com.google.android.libraries.home.p1940a.p1943c.C23525cz;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.assistant.p3897e.p3921j.p3926e.C52020hs;
import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.assistant.p3897e.p3921j.p3926e.C52058q;
import com.google.assistant.p3897e.p3921j.p3926e.C52060s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.d.h */
/* compiled from: PG */
public final class C23607h implements C23611l {
    /* renamed from: a */
    public final C23544dr mo28936a(C52023hv hvVar) {
        C69664n.m101061g(hvVar, "s3Param");
        if (C69664n.m101066l(hvVar.f136542b, "onOff")) {
            C52022hu huVar = hvVar.f136543c;
            if (huVar == null) {
                huVar = C52022hu.f136532f;
            }
            if ((huVar.f136534a & 1) != 0) {
                String str = huVar.f136535b;
                C69664n.m101060f(str, "argumentString");
                if (str.length() > 0) {
                    String str2 = huVar.f136535b;
                    C69664n.m101060f(str2, "argumentString");
                    return C23524cy.m43926b(str2, true);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final C52023hv mo28937b(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        C23525cz czVar = drVar instanceof C23525cz ? (C23525cz) drVar : null;
        if (czVar == null) {
            return null;
        }
        C52020hs hsVar = (C52020hs) C52023hv.f136539d.createBuilder();
        C69664n.m101060f(hsVar, "newBuilder()");
        C52058q a = C69664n.m101061g(hsVar, "builder");
        a.mo53775b("state");
        C52021ht htVar = (C52021ht) C52022hu.f136532f.createBuilder();
        C69664n.m101060f(htVar, "newBuilder()");
        C52060s a2 = C69664n.m101061g(htVar, "builder");
        a2.mo53778b(true != czVar.mo28903h() ? "off" : "on");
        a.mo53776c(a2.mo53777a());
        return a.mo53774a();
    }

    /* renamed from: c */
    public final String mo28938c(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        if (drVar instanceof C23525cz) {
            return "onOff";
        }
        return null;
    }
}
