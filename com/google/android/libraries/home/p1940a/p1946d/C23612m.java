package com.google.android.libraries.home.p1940a.p1946d;

import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1940a.p1943c.C23545ds;
import com.google.android.libraries.home.p1940a.p1943c.C23546dt;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.d.m */
/* compiled from: PG */
public final class C23612m implements C23611l {
    /* renamed from: a */
    public final C23544dr mo28936a(C52023hv hvVar) {
        C69664n.m101061g(hvVar, "s3Param");
        if (!C69664n.m101066l(hvVar.f136542b, "partnerDeviceId")) {
            return null;
        }
        C52022hu huVar = hvVar.f136543c;
        if (huVar == null) {
            huVar = C52022hu.f136532f;
        }
        if ((huVar.f136534a & 1) == 0) {
            return null;
        }
        C23545ds dsVar = C23546dt.f64456a;
        C52022hu huVar2 = hvVar.f136543c;
        if (huVar2 == null) {
            huVar2 = C52022hu.f136532f;
        }
        String str = huVar2.f136535b;
        C69664n.m101060f(str, "s3Param.parameterValue.argumentString");
        return C23545ds.m43954b(str, true);
    }

    /* renamed from: b */
    public final C52023hv mo28937b(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        return null;
    }

    /* renamed from: c */
    public final String mo28938c(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        if (drVar instanceof C23546dt) {
            return "partnerDeviceId";
        }
        return null;
    }
}
