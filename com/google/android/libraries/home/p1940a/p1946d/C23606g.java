package com.google.android.libraries.home.p1940a.p1946d;

import com.google.android.libraries.home.p1940a.p1943c.C23477be;
import com.google.android.libraries.home.p1940a.p1943c.C23478bf;
import com.google.android.libraries.home.p1940a.p1943c.C23481bi;
import com.google.android.libraries.home.p1940a.p1943c.C23482bj;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.assistant.p3897e.p3921j.p3926e.C52020hs;
import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.assistant.p3897e.p3921j.p3926e.C52058q;
import com.google.assistant.p3897e.p3921j.p3926e.C52060s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.d.g */
/* compiled from: PG */
public final class C23606g implements C23611l {
    /* renamed from: a */
    public final C23544dr mo28936a(C52023hv hvVar) {
        C69664n.m101061g(hvVar, "s3Param");
        C52022hu huVar = hvVar.f136543c;
        if (huVar == null) {
            huVar = C52022hu.f136532f;
        }
        if ((huVar.f136534a & 16) == 0) {
            return null;
        }
        String str = hvVar.f136542b;
        int hashCode = str.hashCode();
        if (hashCode != -493306432) {
            if (hashCode != -423418668 || !str.equals("isLocked")) {
                return null;
            }
            C52022hu huVar2 = hvVar.f136543c;
            if (huVar2 == null) {
                huVar2 = C52022hu.f136532f;
            }
            if (huVar2.f136538e) {
                C23481bi biVar = C23482bj.f64218b;
                return C23481bi.m43892b(true);
            }
            C23481bi biVar2 = C23482bj.f64218b;
            return C23481bi.m43892b(false);
        } else if (!str.equals("isJammed")) {
            return null;
        } else {
            C23477be beVar = C23478bf.f64214b;
            C52022hu huVar3 = hvVar.f136543c;
            if (huVar3 == null) {
                huVar3 = C52022hu.f136532f;
            }
            return C23477be.m43889b(huVar3.f136538e);
        }
    }

    /* renamed from: b */
    public final C52023hv mo28937b(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        C23482bj bjVar = drVar instanceof C23482bj ? (C23482bj) drVar : null;
        if (bjVar == null) {
            return null;
        }
        C52020hs hsVar = (C52020hs) C52023hv.f136539d.createBuilder();
        C69664n.m101060f(hsVar, "newBuilder()");
        C52058q a = C69664n.m101061g(hsVar, "builder");
        a.mo53775b("state");
        C52021ht htVar = (C52021ht) C52022hu.f136532f.createBuilder();
        C69664n.m101060f(htVar, "newBuilder()");
        C52060s a2 = C69664n.m101061g(htVar, "builder");
        a2.mo53778b(true != Boolean.valueOf(bjVar.f64597a).booleanValue() ? "unlock" : "lock");
        a.mo53776c(a2.mo53777a());
        return a.mo53774a();
    }

    /* renamed from: c */
    public final String mo28938c(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        if (drVar instanceof C23482bj) {
            return "lockUnlock";
        }
        return null;
    }
}
