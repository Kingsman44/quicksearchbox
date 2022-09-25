package com.google.android.libraries.home.p1940a.p1946d;

import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23353a;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23358ae;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23359af;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23367an;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23368ao;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23372as;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23373b;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23381j;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23382k;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23385n;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23386o;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23387p;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23388q;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23389r;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23390s;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23391t;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23392u;
import com.google.assistant.p3897e.p3921j.p3926e.C52020hs;
import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.assistant.p3897e.p3921j.p3926e.C52058q;
import com.google.assistant.p3897e.p3921j.p3926e.C52060s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.d.b */
/* compiled from: PG */
public final class C23601b implements C23611l {
    /* renamed from: a */
    public final C23544dr mo28936a(C52023hv hvVar) {
        C69664n.m101061g(hvVar, "s3Param");
        String str = hvVar.f136542b;
        C69664n.m101060f(str, "s3Param.parameterName");
        C52022hu huVar = hvVar.f136543c;
        if (huVar == null) {
            huVar = C52022hu.f136532f;
        }
        C69664n.m101060f(huVar, "s3Param.parameterValue");
        if (!C69664n.m101066l(str, "cameraStreamAuthTokenExpirationSec") || (huVar.f136534a & 2) == 0) {
            if ((huVar.f136534a & 1) != 0) {
                switch (str.hashCode()) {
                    case -1259470086:
                        if (str.equals("audioCommunicationType")) {
                            C23353a aVar = C23373b.f63925a;
                            String str2 = huVar.f136535b;
                            C69664n.m101060f(str2, "value.argumentString");
                            return C23353a.m43789b(str2, true);
                        }
                        break;
                    case 105650780:
                        if (str.equals("offer")) {
                            C23385n nVar = C23386o.f63941a;
                            String str3 = huVar.f136535b;
                            C69664n.m101060f(str3, "value.argumentString");
                            return C23385n.m43810b(str3);
                        }
                        break;
                    case 476322732:
                        if (str.equals("cameraStreamAuthToken")) {
                            C23391t tVar = C23392u.f63947a;
                            String str4 = huVar.f136535b;
                            C69664n.m101060f(str4, "value.argumentString");
                            return C23391t.m43815b(str4);
                        }
                        break;
                    case 740632186:
                        if (str.equals("cameraStreamSignalingUrl")) {
                            C23387p pVar = C23388q.f63943a;
                            String str5 = huVar.f136535b;
                            C69664n.m101060f(str5, "value.argumentString");
                            return C23387p.m43812b(str5);
                        }
                        break;
                    case 1205654502:
                        if (str.equals("cameraStreamAccessUrl")) {
                            C23367an anVar = C23368ao.f63920a;
                            String str6 = huVar.f136535b;
                            C69664n.m101060f(str6, "value.argumentString");
                            return C23367an.m43800b(str6);
                        }
                        break;
                    case 1575573637:
                        if (str.equals("iceServers")) {
                            C23381j jVar = C23382k.f63937a;
                            String str7 = huVar.f136535b;
                            C69664n.m101060f(str7, "value.argumentString");
                            return C23381j.m43807b(str7);
                        }
                        break;
                    case 2027449533:
                        if (str.equals("cameraStreamProtocol")) {
                            C23358ae aeVar = C23359af.f63888a;
                            String str8 = huVar.f136535b;
                            C69664n.m101060f(str8, "value.argumentString");
                            return C23358ae.m43793b(str8);
                        }
                        break;
                }
            }
            return null;
        }
        C23389r rVar = C23390s.f63945a;
        return new C23390s(huVar.f136536c);
    }

    /* renamed from: b */
    public final C52023hv mo28937b(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        C23372as asVar = drVar instanceof C23372as ? (C23372as) drVar : null;
        if (asVar == null) {
            return null;
        }
        C52020hs hsVar = (C52020hs) C52023hv.f136539d.createBuilder();
        C69664n.m101060f(hsVar, "newBuilder()");
        C52058q a = C69664n.m101061g(hsVar, "builder");
        a.mo53775b("cameraStreamSupportedProtocols");
        C52021ht htVar = (C52021ht) C52022hu.f136532f.createBuilder();
        C69664n.m101060f(htVar, "newBuilder()");
        C52060s a2 = C69664n.m101061g(htVar, "builder");
        a2.mo53778b(asVar.f64494c);
        a.mo53776c(a2.mo53777a());
        return a.mo53774a();
    }

    /* renamed from: c */
    public final String mo28938c(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        if (drVar instanceof C23372as) {
            return "cameraStream";
        }
        return null;
    }
}
