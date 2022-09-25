package com.google.android.libraries.home.p1940a.p1946d;

import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1940a.p1943c.C23587n;
import com.google.android.libraries.home.p1940a.p1943c.C23589p;
import com.google.android.libraries.home.p1940a.p1943c.C23591r;
import com.google.assistant.p3897e.p3921j.p3926e.C52020hs;
import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.assistant.p3897e.p3921j.p3926e.C52058q;
import com.google.assistant.p3897e.p3921j.p3926e.C52060s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.d.c */
/* compiled from: PG */
public final class C23602c implements C23611l {
    /* renamed from: a */
    public final C23544dr mo28936a(C52023hv hvVar) {
        C69664n.m101061g(hvVar, "s3Param");
        return null;
    }

    /* renamed from: b */
    public final C52023hv mo28937b(C23544dr drVar) {
        C23591r rVar;
        C69664n.m101061g(drVar, "param");
        if (drVar instanceof C23587n) {
            C23587n nVar = (C23587n) drVar;
            if (nVar == null) {
                return null;
            }
            C52020hs hsVar = (C52020hs) C52023hv.f136539d.createBuilder();
            C69664n.m101060f(hsVar, "newBuilder()");
            C52058q a = C69664n.m101061g(hsVar, "builder");
            a.mo53775b("channelCode");
            C52021ht htVar = (C52021ht) C52022hu.f136532f.createBuilder();
            C69664n.m101060f(htVar, "newBuilder()");
            C52060s a2 = C69664n.m101061g(htVar, "builder");
            a2.mo53778b(nVar.f64494c);
            a.mo53776c(a2.mo53777a());
            return a.mo53774a();
        } else if (drVar instanceof C23589p) {
            C23589p pVar = (C23589p) drVar;
            if (pVar == null) {
                return null;
            }
            C52020hs hsVar2 = (C52020hs) C52023hv.f136539d.createBuilder();
            C69664n.m101060f(hsVar2, "newBuilder()");
            C52058q a3 = C69664n.m101061g(hsVar2, "builder");
            a3.mo53775b("channelName");
            C52021ht htVar2 = (C52021ht) C52022hu.f136532f.createBuilder();
            C69664n.m101060f(htVar2, "newBuilder()");
            C52060s a4 = C69664n.m101061g(htVar2, "builder");
            a4.mo53778b(pVar.f64494c);
            a3.mo53776c(a4.mo53777a());
            return a3.mo53774a();
        } else if (!(drVar instanceof C23591r) || (rVar = (C23591r) drVar) == null) {
            return null;
        } else {
            C52020hs hsVar3 = (C52020hs) C52023hv.f136539d.createBuilder();
            C69664n.m101060f(hsVar3, "newBuilder()");
            C52058q a5 = C69664n.m101061g(hsVar3, "builder");
            a5.mo53775b("channelNumber");
            C52021ht htVar3 = (C52021ht) C52022hu.f136532f.createBuilder();
            C69664n.m101060f(htVar3, "newBuilder()");
            C52060s a6 = C69664n.m101061g(htVar3, "builder");
            a6.mo53778b(rVar.f64494c);
            a5.mo53776c(a6.mo53777a());
            return a5.mo53774a();
        }
    }

    /* renamed from: c */
    public final String mo28938c(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        if (!(drVar instanceof C23587n) && !(drVar instanceof C23589p) && !(drVar instanceof C23591r)) {
            return null;
        }
        return "selectChannel";
    }
}
