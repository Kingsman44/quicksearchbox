package com.google.android.libraries.home.p1940a.p1946d;

import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1940a.p1943c.C23583j;
import com.google.assistant.p3897e.p3921j.p3926e.C52020hs;
import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.assistant.p3897e.p3921j.p3926e.C52058q;
import com.google.assistant.p3897e.p3921j.p3926e.C52060s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.d.a */
/* compiled from: PG */
public final class C23600a implements C23611l {
    /* renamed from: a */
    public final C23544dr mo28936a(C52023hv hvVar) {
        C69664n.m101061g(hvVar, "s3Param");
        if (!C69664n.m101066l(hvVar.f136542b, "brightness")) {
            return null;
        }
        C52022hu huVar = hvVar.f136543c;
        if (huVar == null) {
            huVar = C52022hu.f136532f;
        }
        if ((huVar.f136534a & 2) == 0) {
            return null;
        }
        C52022hu huVar2 = hvVar.f136543c;
        if (huVar2 == null) {
            huVar2 = C52022hu.f136532f;
        }
        return new C23583j(huVar2.f136536c, true);
    }

    /* renamed from: b */
    public final C52023hv mo28937b(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        C23583j jVar = drVar instanceof C23583j ? (C23583j) drVar : null;
        if (jVar == null) {
            return null;
        }
        C52020hs hsVar = (C52020hs) C52023hv.f136539d.createBuilder();
        C69664n.m101060f(hsVar, "newBuilder()");
        C52058q a = C69664n.m101061g(hsVar, "builder");
        a.mo53775b("brightness");
        C52021ht htVar = (C52021ht) C52022hu.f136532f.createBuilder();
        C69664n.m101060f(htVar, "newBuilder()");
        C52060s a2 = C69664n.m101061g(htVar, "builder");
        int intValue = Integer.valueOf(jVar.f64210c).intValue();
        C52021ht htVar2 = a2.f136627a;
        htVar2.copyOnWrite();
        C52022hu huVar = (C52022hu) htVar2.instance;
        huVar.f136534a |= 8;
        huVar.f136537d = ((float) intValue) / 100.0f;
        a.mo53776c(a2.mo53777a());
        return a.mo53774a();
    }

    /* renamed from: c */
    public final String mo28938c(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        if (drVar instanceof C23583j) {
            return "brightness";
        }
        return null;
    }
}
