package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110656v;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8454e.C110665a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8460k.C110716a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8463n.C110840a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8464o.C110842a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8466q.C110913i;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123774cn;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3994s.p3995a.C53232gg;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.j.f */
/* compiled from: PG */
public final class C110707f {

    /* renamed from: a */
    public final C118339a f308468a;

    /* renamed from: b */
    public final C22871g f308469b;

    /* renamed from: c */
    public final C110714m f308470c;

    /* renamed from: d */
    private final C83794j f308471d;

    /* renamed from: e */
    private final C83783a f308472e;

    /* renamed from: f */
    private final C110656v f308473f;

    /* renamed from: g */
    private final C58974d f308474g;

    /* renamed from: h */
    private final C83807w f308475h;

    public C110707f(C118339a aVar, C22871g gVar, C110714m mVar, C83794j jVar, C83783a aVar2, C110656v vVar, C83807w wVar, C83564a aVar3) {
        this.f308468a = aVar;
        this.f308469b = gVar;
        this.f308470c = mVar;
        this.f308474g = aVar3.mo76900a("SSPcpDataCtrl");
        this.f308471d = jVar;
        this.f308472e = aVar2;
        this.f308473f = vVar;
        this.f308475h = wVar;
    }

    /* renamed from: a */
    public final C60870cx mo98858a(List list) {
        C58485gu<C50818do> guVar;
        C60870cx cxVar;
        C60870cx cxVar2;
        int a;
        C53245gt gtVar;
        C123751br brVar;
        C123759bz bzVar;
        C123757bx bxVar;
        C50818do doVar;
        C123779h hVar;
        C53245gt gtVar2;
        int i;
        int a2;
        int a3;
        ((C58970a) ((C58970a) this.f308474g.mo56224b()).mo56372aa(26711)).mo56386p("#logProactiveDataReceived");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C123744bk bkVar = (C123744bk) it.next();
            C58970a aVar = (C58970a) ((C58970a) this.f308474g.mo56224b()).mo56372aa(26712);
            int i2 = bkVar.f341810e;
            int a4 = C123774cn.m203111a(bkVar.f341815j);
            aVar.mo56395y("data type: %s, update type: %s", i2, (a4 == 0 || a4 == 1) ? "UNKNOWN_UPDATE_TYPE" : a4 != 2 ? a4 != 3 ? a4 != 4 ? "NO_CHANGE" : "DELETE" : "UPDATE" : "ADD");
        }
        ArrayList arrayList = new ArrayList();
        for (C123744bk bkVar2 : (List) Collection.EL.stream(list).filter(new C110706e(this)).collect(Collectors.toList())) {
            ((C58970a) ((C58970a) this.f308474g.mo56224b()).mo56372aa(26705)).mo56387q("diffAndUpdateContentStore data type : %s", bkVar2.f341810e);
            int a5 = C123774cn.m203111a(bkVar2.f341815j);
            if ((a5 != 0 && a5 == 2) || (((a2 = C123774cn.m203111a((i = bkVar2.f341815j))) != 0 && a2 == 3) || ((a3 = C123774cn.m203111a(i)) != 0 && a3 == 5))) {
                C110714m mVar = this.f308470c;
                if (bkVar2.f341810e == 7) {
                    if (bkVar2.f341808c != 11) {
                        C59104x d = C110714m.f308484a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "PcpSSDataUtils");
                        ((C59052c) ((C59052c) d).mo56372aa(26725)).mo56386p("Missing weather data from proactiveData");
                    } else if (((C53245gt) bkVar2.f341809d).f139569c.isEmpty()) {
                        C59104x d2 = C110714m.f308484a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "PcpSSDataUtils");
                        ((C59052c) ((C59052c) d2).mo56372aa(26724)).mo56386p("Missing daily forecast in weatherData");
                        C130895ag agVar = mVar.f308494k;
                        if (bkVar2.f341808c == 11) {
                            gtVar2 = (C53245gt) bkVar2.f341809d;
                        } else {
                            gtVar2 = C53245gt.f139564n;
                        }
                        C53232gg a6 = C53232gg.m86789a(gtVar2.f139568b);
                        if (a6 == null) {
                            a6 = C53232gg.UNKNOWN;
                        }
                        agVar.mo109934g(a6.f139522g, true, false, false, false, false);
                    }
                }
                C110714m mVar2 = this.f308470c;
                C59104x b = C110714m.f308484a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "PcpSSDataUtils");
                ((C59052c) ((C59052c) b).mo56372aa(26723)).mo56386p("#getSmartspaceCard");
                C83739ak b2 = C110714m.m184430b(bkVar2);
                int i3 = bkVar2.f341810e;
                C50818do doVar2 = null;
                if (i3 != 7) {
                    if (i3 == 25 || i3 == 41) {
                        C110716a aVar2 = mVar2.f308492i;
                        C83738aj ajVar = b2.f228233b;
                        if (ajVar == null) {
                            ajVar = C83738aj.f228226c;
                        }
                        if (ajVar.f228228a == 8) {
                            brVar = (C123751br) ajVar.f228229b;
                        } else {
                            brVar = C123751br.f341826e;
                        }
                        C50818do a7 = aVar2.mo98859a(brVar, b2.f228244m, b2.f228237f);
                        if (a7 != null) {
                            guVar = C58485gu.m89846n(a7);
                        }
                    } else if (i3 == 16) {
                        C110842a aVar3 = mVar2.f308489f;
                        C83738aj ajVar2 = b2.f228233b;
                        if (ajVar2 == null) {
                            ajVar2 = C83738aj.f228226c;
                        }
                        if (ajVar2.f228228a == 7) {
                            bzVar = (C123759bz) ajVar2.f228229b;
                        } else {
                            bzVar = C123759bz.f341867e;
                        }
                        C50818do a8 = (bzVar.f341870b.isEmpty() || bzVar.f341871c.isEmpty()) ? null : aVar3.mo98895a(bzVar, b2.f228237f);
                        if (a8 != null) {
                            guVar = C58485gu.m89846n(a8);
                        }
                    } else if (i3 == 17) {
                        C50818do b3 = mVar2.f308487d.mo98760b(b2);
                        if (b3 != null) {
                            guVar = C58485gu.m89846n(b3);
                        }
                    } else if (i3 == 31) {
                        C110840a aVar4 = mVar2.f308491h;
                        C83738aj ajVar3 = b2.f228233b;
                        if (ajVar3 == null) {
                            ajVar3 = C83738aj.f228226c;
                        }
                        if (ajVar3.f228228a == 19) {
                            bxVar = (C123757bx) ajVar3.f228229b;
                        } else {
                            bxVar = C123757bx.f341854l;
                        }
                        if (bxVar.f341859d.isEmpty() || bxVar.f341860e.isEmpty()) {
                            doVar = null;
                        } else {
                            doVar = aVar4.mo98894a(bxVar, b2.f228237f).mo77056b().f228252c;
                            if (doVar == null) {
                                doVar = C50818do.f132293H;
                            }
                        }
                        if (doVar != null) {
                            guVar = C58485gu.m89846n(doVar);
                        }
                    } else if (i3 == 32) {
                        C110665a aVar5 = mVar2.f308490g;
                        C83738aj ajVar4 = b2.f228233b;
                        if (ajVar4 == null) {
                            ajVar4 = C83738aj.f228226c;
                        }
                        if (ajVar4.f228228a == 18) {
                            hVar = (C123779h) ajVar4.f228229b;
                        } else {
                            hVar = C123779h.f341925m;
                        }
                        C50818do a9 = (hVar.f341930d.isEmpty() || hVar.f341931e.isEmpty()) ? null : aVar5.mo98838a(hVar, b2.f228237f);
                        if (a9 != null) {
                            guVar = C58485gu.m89846n(a9);
                        }
                    }
                    guVar = null;
                } else {
                    C110913i iVar = mVar2.f308485b;
                    C83738aj ajVar5 = b2.f228233b;
                    if (ajVar5 == null) {
                        ajVar5 = C83738aj.f228226c;
                    }
                    if (ajVar5.f228228a == 3) {
                        gtVar = (C53245gt) ajVar5.f228229b;
                    } else {
                        gtVar = C53245gt.f139564n;
                    }
                    guVar = iVar.mo98929a(gtVar, iVar.f308960a.mo86768b(), b2.f228242k, b2.f228237f);
                }
                int i4 = 0;
                if (guVar == null || guVar.isEmpty() || guVar.get(0) == null) {
                    C58970a aVar6 = (C58970a) ((C58970a) this.f308474g.mo56226d()).mo56372aa(26707);
                    boolean z = guVar != null;
                    if (guVar != null) {
                        i4 = guVar.size();
                    }
                    aVar6.mo56356I("getSmartspaceCard failed, smartspaceCards is null=%s, smartspaceCards size=%d", z, i4);
                } else {
                    int i5 = bkVar2.f341815j;
                    int a10 = C123774cn.m203111a(i5);
                    if ((a10 != 0 && a10 == 2) || ((a = C123774cn.m203111a(i5)) != 0 && a == 3)) {
                        int i6 = bkVar2.f341810e;
                        if (i6 == 7) {
                            this.f308475h.mo77192a(C118569b.PCP_SMARTSPACE_WEATHER_NOTIFICATION, 1);
                        } else if (i6 == 17) {
                            this.f308475h.mo77192a(C118569b.PCP_SMARTSPACE_CALENDAR_NOTIFICATION, 1);
                        }
                    }
                    guVar.size();
                    int i7 = ((C50818do) guVar.get(0)).f132315l;
                    C50794cr crVar = C50794cr.UNDEFINED;
                    if (guVar.isEmpty() || guVar.get(0) == null) {
                        ((C58970a) ((C58970a) this.f308474g.mo56226d()).mo56372aa(26709)).mo56386p("card to update was null");
                        cxVar = C118826c.f331423b;
                    } else {
                        if (this.f308471d.mo77175m() && this.f308471d.mo77161F()) {
                            i4 = 1;
                        }
                        C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
                        for (C50818do doVar3 : guVar) {
                            if (doVar3 != null) {
                                C50794cr a11 = C50794cr.m85938a(doVar3.f132315l);
                                if (a11 == null) {
                                    a11 = C50794cr.UNDEFINED;
                                }
                                if (a11 == C50794cr.WEATHER) {
                                    if (i4 != 0) {
                                        alVar.mo77054a(doVar3);
                                    } else {
                                        alVar.copyOnWrite();
                                        C83741am amVar = (C83741am) alVar.instance;
                                        amVar.f228252c = doVar3;
                                        amVar.f228250a |= 4;
                                    }
                                } else if (doVar2 == null) {
                                    doVar2 = doVar3;
                                } else {
                                    C58970a aVar7 = (C58970a) ((C58970a) this.f308474g.mo56226d()).mo56372aa(26710);
                                    C50794cr a12 = C50794cr.m85938a(doVar2.f132315l);
                                    if (a12 == null) {
                                        a12 = C50794cr.UNDEFINED;
                                    }
                                    int i8 = a12.f132222T;
                                    C50794cr a13 = C50794cr.m85938a(doVar3.f132315l);
                                    if (a13 == null) {
                                        a13 = C50794cr.UNDEFINED;
                                    }
                                    aVar7.mo56393w("Multiple primary cards are not expected. current primary cardType:%s, incoming primary cardType:%s", i8, a13.f132222T);
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        C83741am amVar2 = (C83741am) alVar.instance;
                        if ((amVar2.f228250a & 4) != 0 || amVar2.f228253d.size() > 0) {
                            arrayList2.add(this.f308472e.mo77114m((C83741am) alVar.build()));
                        }
                        if (doVar2 != null) {
                            if (!this.f308471d.mo77183v()) {
                                C83783a aVar8 = this.f308472e;
                                String num = Integer.toString(doVar2.f132307d);
                                C83740al alVar2 = (C83740al) C83741am.f228248e.createBuilder();
                                alVar2.copyOnWrite();
                                C83741am amVar3 = (C83741am) alVar2.instance;
                                amVar3.f228252c = doVar2;
                                amVar3.f228250a |= 4;
                                C83741am amVar4 = (C83741am) alVar2.build();
                                C50794cr a14 = C50794cr.m85938a(doVar2.f132315l);
                                if (a14 == null) {
                                    a14 = C50794cr.UNDEFINED;
                                }
                                arrayList2.add(aVar8.mo77111j(num, amVar4, a14));
                            } else {
                                C110656v vVar = this.f308473f;
                                String num2 = Integer.toString(doVar2.f132307d);
                                C83740al alVar3 = (C83740al) C83741am.f228248e.createBuilder();
                                alVar3.copyOnWrite();
                                C83741am amVar5 = (C83741am) alVar3.instance;
                                amVar5.f228252c = doVar2;
                                amVar5.f228250a |= 4;
                                C83741am amVar6 = (C83741am) alVar3.build();
                                C50794cr a15 = C50794cr.m85938a(doVar2.f132315l);
                                if (a15 == null) {
                                    a15 = C50794cr.UNDEFINED;
                                }
                                C50818do doVar4 = amVar6.f228252c;
                                if (doVar4 == null) {
                                    doVar4 = C50818do.f132293H;
                                }
                                if (!doVar4.f132322s) {
                                    cxVar2 = vVar.f308348g.mo98823b().mo98781f(num2, amVar6, a15);
                                } else {
                                    cxVar2 = vVar.f308348g.mo98822a().mo98781f(num2, amVar6, a15);
                                }
                                arrayList2.add(cxVar2);
                            }
                        }
                        cxVar = C47638k.m84752c(arrayList2).mo51521b(C110704c.f308465a, C60826bg.f164896a);
                    }
                    arrayList.add(cxVar);
                }
            }
            int a16 = C123774cn.m203111a(bkVar2.f341815j);
            if (a16 != 0 && a16 == 4) {
                if (bkVar2.f341810e == 7) {
                    ((C58970a) ((C58970a) this.f308474g.mo56224b()).mo56372aa(26706)).mo56386p("Clear weather card");
                    arrayList.add(this.f308472e.mo77102a());
                } else {
                    String num3 = Integer.toString(C110714m.m184429a(bkVar2));
                    if (this.f308471d.mo77183v()) {
                        arrayList.add(this.f308473f.mo98832c(num3));
                    } else {
                        arrayList.add(this.f308472e.mo77108g(num3));
                    }
                }
            }
        }
        return C118826c.m197212b(arrayList);
    }
}
