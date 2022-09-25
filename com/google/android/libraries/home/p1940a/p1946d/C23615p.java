package com.google.android.libraries.home.p1940a.p1946d;

import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23431af;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23433ah;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23435aj;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23436ak;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23437al;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23438am;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23439an;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23441ap;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23442aq;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23448b;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23452f;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23454h;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23456j;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23458l;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23462p;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23470x;
import com.google.assistant.p3897e.p3921j.p3926e.C52020hs;
import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.assistant.p3897e.p3921j.p3926e.C52058q;
import com.google.assistant.p3897e.p3921j.p3926e.C52060s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.d.p */
/* compiled from: PG */
public final class C23615p implements C23611l {
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
        int i = huVar.f136534a;
        if ((i & 1) == 0) {
            if ((i & 8) != 0) {
                switch (str.hashCode()) {
                    case -1493380402:
                        if (str.equals("heatCoolSettingHighRoundC")) {
                            return new C23456j(huVar.f136537d, false);
                        }
                        break;
                    case -796632575:
                        if (str.equals("ambientAirTemperatureC")) {
                            return new C23448b(huVar.f136537d, false);
                        }
                        break;
                    case -417603794:
                        if (str.equals("heatSettingRound")) {
                            return new C23435aj(huVar.f136537d, false);
                        }
                        break;
                    case -404913401:
                        if (str.equals("coolSettingRound")) {
                            return new C23470x(huVar.f136537d, false);
                        }
                        break;
                    case -60815659:
                        if (str.equals("heatSettingRoundC")) {
                            return new C23454h(huVar.f136537d, false);
                        }
                        break;
                    case 150362098:
                        if (str.equals("heatCoolSettingLowRoundC")) {
                            return new C23458l(huVar.f136537d, false);
                        }
                        break;
                    case 332586524:
                        if (str.equals("coolSettingRoundC")) {
                            return new C23452f(huVar.f136537d, false);
                        }
                        break;
                    case 506015765:
                        if (str.equals("heatCoolSettingHighRound")) {
                            return new C23431af(huVar.f136537d, false);
                        }
                        break;
                    case 974681713:
                        if (str.equals("heatCoolSettingLowRound")) {
                            return new C23433ah(huVar.f136537d, false);
                        }
                        break;
                    case 1221228162:
                        if (str.equals("ambientAirTemperature")) {
                            return new C23462p(huVar.f136537d, false);
                        }
                        break;
                }
            }
            return null;
        } else if (C69664n.m101066l(str, "mode")) {
            String str2 = huVar.f136535b;
            C69664n.m101060f(str2, "value.argumentString");
            return C23438am.m43852b(str2, true);
        } else if (!C69664n.m101066l(str, "activeThermostatMode")) {
            return null;
        } else {
            String str3 = huVar.f136535b;
            C69664n.m101060f(str3, "value.argumentString");
            return C23442aq.m43856c(str3, 6);
        }
    }

    /* renamed from: b */
    public final C52023hv mo28937b(C23544dr drVar) {
        C23437al alVar;
        C69664n.m101061g(drVar, "param");
        if (drVar instanceof C23441ap) {
            C23441ap apVar = (C23441ap) drVar;
            if (apVar == null) {
                return null;
            }
            C52020hs hsVar = (C52020hs) C52023hv.f136539d.createBuilder();
            C69664n.m101060f(hsVar, "newBuilder()");
            C52058q a = C69664n.m101061g(hsVar, "builder");
            a.mo53775b("tempSetting");
            C52021ht htVar = (C52021ht) C52022hu.f136532f.createBuilder();
            C69664n.m101060f(htVar, "newBuilder()");
            C52060s a2 = C69664n.m101061g(htVar, "builder");
            float floatValue = Float.valueOf(apVar.f64200a).floatValue();
            C52021ht htVar2 = a2.f136627a;
            htVar2.copyOnWrite();
            C52022hu huVar = (C52022hu) htVar2.instance;
            huVar.f136534a |= 8;
            huVar.f136537d = floatValue;
            a.mo53776c(a2.mo53777a());
            return a.mo53774a();
        } else if (drVar instanceof C23439an) {
            C23439an anVar = (C23439an) drVar;
            if (anVar == null) {
                return null;
            }
            C52020hs hsVar2 = (C52020hs) C52023hv.f136539d.createBuilder();
            C69664n.m101060f(hsVar2, "newBuilder()");
            C52058q a3 = C69664n.m101061g(hsVar2, "builder");
            a3.mo53775b("mode");
            C52021ht htVar3 = (C52021ht) C52022hu.f136532f.createBuilder();
            C69664n.m101060f(htVar3, "newBuilder()");
            C52060s a4 = C69664n.m101061g(htVar3, "builder");
            a4.mo53778b(anVar.f64494c);
            a3.mo53776c(a4.mo53777a());
            return a3.mo53774a();
        } else if (drVar instanceof C23436ak) {
            C23436ak akVar = (C23436ak) drVar;
            if (akVar == null) {
                return null;
            }
            C52020hs hsVar3 = (C52020hs) C52023hv.f136539d.createBuilder();
            C69664n.m101060f(hsVar3, "newBuilder()");
            C52058q a5 = C69664n.m101061g(hsVar3, "builder");
            a5.mo53775b("tempSettingHigh");
            C52021ht htVar4 = (C52021ht) C52022hu.f136532f.createBuilder();
            C69664n.m101060f(htVar4, "newBuilder()");
            C52060s a6 = C69664n.m101061g(htVar4, "builder");
            float floatValue2 = Float.valueOf(akVar.f64200a).floatValue();
            C52021ht htVar5 = a6.f136627a;
            htVar5.copyOnWrite();
            C52022hu huVar2 = (C52022hu) htVar5.instance;
            huVar2.f136534a |= 8;
            huVar2.f136537d = floatValue2;
            a5.mo53776c(a6.mo53777a());
            return a5.mo53774a();
        } else if (!(drVar instanceof C23437al) || (alVar = (C23437al) drVar) == null) {
            return null;
        } else {
            C52020hs hsVar4 = (C52020hs) C52023hv.f136539d.createBuilder();
            C69664n.m101060f(hsVar4, "newBuilder()");
            C52058q a7 = C69664n.m101061g(hsVar4, "builder");
            a7.mo53775b("tempSettingLow");
            C52021ht htVar6 = (C52021ht) C52022hu.f136532f.createBuilder();
            C69664n.m101060f(htVar6, "newBuilder()");
            C52060s a8 = C69664n.m101061g(htVar6, "builder");
            float floatValue3 = Float.valueOf(alVar.f64200a).floatValue();
            C52021ht htVar7 = a8.f136627a;
            htVar7.copyOnWrite();
            C52022hu huVar3 = (C52022hu) htVar7.instance;
            huVar3.f136534a |= 8;
            huVar3.f136537d = floatValue3;
            a7.mo53776c(a8.mo53777a());
            return a7.mo53774a();
        }
    }

    /* renamed from: c */
    public final String mo28938c(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        if (!(drVar instanceof C23439an) && !(drVar instanceof C23441ap) && !(drVar instanceof C23436ak) && !(drVar instanceof C23437al)) {
            return null;
        }
        return "temperatureSetting";
    }
}
