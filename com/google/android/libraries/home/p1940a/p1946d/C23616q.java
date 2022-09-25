package com.google.android.libraries.home.p1940a.p1946d;

import com.google.android.libraries.home.p1940a.p1943c.C23493bu;
import com.google.android.libraries.home.p1940a.p1943c.C23501cb;
import com.google.android.libraries.home.p1940a.p1943c.C23503cd;
import com.google.android.libraries.home.p1940a.p1943c.C23515cp;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.assistant.p3897e.p3921j.p3926e.C52020hs;
import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.assistant.p3897e.p3921j.p3926e.C52058q;
import com.google.assistant.p3897e.p3921j.p3926e.C52060s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.d.q */
/* compiled from: PG */
public final class C23616q implements C23611l {
    /* renamed from: a */
    public final C23544dr mo28936a(C52023hv hvVar) {
        C69664n.m101061g(hvVar, "s3Param");
        return null;
    }

    /* renamed from: b */
    public final C52023hv mo28937b(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        C23503cd cdVar = drVar instanceof C23503cd ? (C23503cd) drVar : null;
        if (cdVar == null) {
            return null;
        }
        C52020hs hsVar = (C52020hs) C52023hv.f136539d.createBuilder();
        C69664n.m101060f(hsVar, "newBuilder()");
        C52058q a = C69664n.m101061g(hsVar, "builder");
        a.mo53775b("offsetInMs");
        C52021ht htVar = (C52021ht) C52022hu.f136532f.createBuilder();
        C69664n.m101060f(htVar, "newBuilder()");
        C52060s a2 = C69664n.m101061g(htVar, "builder");
        int intValue = Integer.valueOf(cdVar.f64210c).intValue();
        C52021ht htVar2 = a2.f136627a;
        htVar2.copyOnWrite();
        C52022hu huVar = (C52022hu) htVar2.instance;
        huVar.f136534a |= 2;
        huVar.f136536c = intValue;
        a.mo53776c(a2.mo53777a());
        return a.mo53774a();
    }

    /* renamed from: c */
    public final String mo28938c(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        if (drVar instanceof C23493bu) {
            return "mediaPause";
        }
        if (drVar instanceof C23501cb) {
            return "mediaResume";
        }
        if (drVar instanceof C23515cp) {
            return "mediaStop";
        }
        if (!(drVar instanceof C23503cd)) {
            return null;
        }
        return "mediaSeekRelative";
    }
}
