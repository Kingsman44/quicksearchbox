package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.opa.smartspace.p6458g.C83789a;
import com.google.android.apps.gsa.opa.smartspace.p6458g.C83791c;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131593n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.assistant.p3886c.p3889c.C50763a;
import com.google.assistant.p3886c.p3889c.C50764b;
import com.google.assistant.p3886c.p3889c.C50765c;
import com.google.assistant.p3886c.p3889c.C50767e;
import com.google.assistant.p3886c.p3889c.C50769g;
import com.google.assistant.p3886c.p3889c.C50770h;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.bf */
/* compiled from: PG */
public final /* synthetic */ class C110761bf implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308588a;

    /* renamed from: b */
    public final /* synthetic */ C83800p f308589b;

    public /* synthetic */ C110761bf(C110764bi biVar, C83800p pVar) {
        this.f308588a = biVar;
        this.f308589b = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        ArrayList arrayList;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        C62971cq cqVar;
        C58485gu g;
        C110764bi biVar = this.f308588a;
        C83800p pVar = this.f308589b;
        Pair pair = (Pair) obj;
        if (!biVar.f308612c.mo77175m() || !biVar.f308612c.mo77161F()) {
            C50818do doVar = pVar.mo77056b().f228252c;
            if (doVar == null) {
                doVar = C50818do.f132293H;
            }
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (a == C50794cr.WEATHER) {
                C92111g gVar = biVar.f308613d;
                C50818do doVar2 = pVar.mo77056b().f228252c;
                if (doVar2 == null) {
                    doVar2 = C50818do.f132293H;
                }
                if (gVar.mo86743d(doVar2)) {
                    C50818do doVar3 = pVar.mo77056b().f228252c;
                    if (doVar3 == null) {
                        doVar3 = C50818do.f132293H;
                    }
                    C50818do b = biVar.mo98866b(doVar3);
                    if (pVar.mo77059e().isEmpty()) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = (Bitmap) pVar.mo77059e().get(0);
                    }
                    arrayList = C58485gu.m89846n(new C92113i(b, bitmap3, true));
                }
            }
            C58833ax e = biVar.mo98867e(pVar);
            if (e.mo56113h()) {
                C50818do doVar4 = ((C83741am) e.mo56107c()).f228252c;
                if (doVar4 == null) {
                    doVar4 = C50818do.f132293H;
                }
                if (pVar.mo77062g().isEmpty()) {
                    bitmap2 = null;
                } else {
                    bitmap2 = (Bitmap) pVar.mo77062g().get(0);
                }
                arrayList = C58485gu.m89846n(new C92113i(doVar4, bitmap2, true));
            } else {
                arrayList = C58485gu.m89845m();
            }
        } else {
            C83791c cVar = biVar.f308622m;
            if (!pVar.mo77056b().f228253d.isEmpty()) {
                cqVar = pVar.mo77056b().f228253d;
                g = pVar.mo77059e();
            } else {
                C58833ax c = cVar.mo77140c(pVar);
                if (c.mo56113h()) {
                    cqVar = ((C83741am) c.mo56107c()).f228253d;
                    g = pVar.mo77062g();
                } else {
                    arrayList = C58485gu.m89845m();
                }
            }
            arrayList = cVar.mo77145h(cqVar, g);
        }
        List list = (List) Collection.EL.stream((List) pair.first).map(new C110783s(biVar, pVar)).filter(C110784t.f308686a).map(C110785u.f308687a).collect(Collectors.toList());
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            ((C58970a) ((C58970a) biVar.f308623n.mo56224b()).mo56372aa(26774)).mo56387q("Send %d weather cards", arrayList.size());
            if (biVar.f308612c.mo77162G()) {
                biVar.f308631v = C58485gu.m89842j(arrayList);
            }
        } else {
            if (biVar.f308613d.mo86742c(C50794cr.WEATHER)) {
                if (biVar.f308612c.mo77162G()) {
                    C58485gu guVar = biVar.f308631v;
                    int size = guVar.size();
                    for (int i = 0; i < size; i++) {
                        C92113i iVar = (C92113i) guVar.get(i);
                        if (!biVar.f308613d.mo86741b(iVar.f256820a)) {
                            arrayList2.add(iVar);
                        } else if (iVar.f256820a.f132317n == 0) {
                            ((C58970a) ((C58970a) biVar.f308623n.mo56226d()).mo56372aa(26773)).mo56386p("Expired weather card with zero update time");
                            biVar.f308620k.mo109905ac();
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        biVar.f308620k.mo109904ab();
                        ((C58970a) ((C58970a) biVar.f308623n.mo56224b()).mo56372aa(26772)).mo56386p("Weather card wrapper cache used");
                    }
                }
                if (arrayList2.isEmpty()) {
                    ((C58970a) ((C58970a) biVar.f308623n.mo56226d()).mo56372aa(26771)).mo56386p("Missing weather card");
                }
            }
            arrayList = arrayList2;
        }
        ArrayList<C92113i> arrayList3 = new ArrayList<>(arrayList);
        if (biVar.f308612c.f228394e.mo79746e(C89985ax.f246741x)) {
            C83791c cVar2 = biVar.f308622m;
            int size2 = list.size();
            Collection.EL.removeIf(list, C83789a.f228367a);
            if (size2 > list.size() + 1) {
                cVar2.f228371a.mo109950w();
            }
        }
        if (!list.isEmpty()) {
            if (biVar.f308612c.mo77177o()) {
                list = biVar.f308628s.mo98915a(list);
            }
            C50818do doVar5 = ((C83741am) list.get(0)).f228252c;
            if (doVar5 == null) {
                doVar5 = C50818do.f132293H;
            }
            arrayList3.addAll((List) Collection.EL.stream(list).map(new C110786v(biVar, doVar5)).collect(Collectors.toList()));
        } else {
            arrayList3.add(new C92113i(biVar.f308612c.mo77169f(), (Bitmap) null, true));
        }
        biVar.f308626q.keySet().removeAll(C58758qx.m90645c(biVar.f308626q.keySet(), (Set) Collection.EL.stream(arrayList3).map(C110737ai.f308544a).collect(Collectors.toSet())));
        biVar.mo98882t(pVar);
        if (biVar.f308612c.f228394e.mo79746e(C89985ax.f246651E) && biVar.f308613d.mo86742c(C50794cr.WEATHER) && (!biVar.f308612c.f228394e.mo79746e(C89985ax.f246652F) || !C83794j.m133428E(biVar.f308621l))) {
            if (biVar.f308627r.mo79746e(C89985ax.f246653G)) {
                bitmap = BitmapFactory.decodeResource(biVar.f308615f.getResources(), R.drawable.quantum_gm_ic_partly_cloudy_day_vd_theme_24);
            } else {
                bitmap = BitmapFactory.decodeResource(biVar.f308615f.getResources(), R.drawable.stat_notify_weather);
            }
            if (bitmap != null) {
                C83791c cVar3 = biVar.f308622m;
                Intent b2 = biVar.f308617h.mo86768b();
                C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
                cnVar.copyOnWrite();
                C50818do doVar6 = (C50818do) cnVar.instance;
                doVar6.f132304a |= 4;
                doVar6.f132307d = 88888888;
                cnVar.copyOnWrite();
                C50818do doVar7 = (C50818do) cnVar.instance;
                doVar7.f132304a |= 1;
                doVar7.f132305b = false;
                C50792cp cpVar = C50792cp.SECONDARY;
                cnVar.copyOnWrite();
                C50818do doVar8 = (C50818do) cnVar.instance;
                doVar8.f132306c = cpVar.f132174e;
                doVar8.f132304a |= 2;
                cnVar.copyOnWrite();
                C50818do doVar9 = (C50818do) cnVar.instance;
                doVar9.f132304a |= 524288;
                doVar9.f132324u = true;
                C50731p pVar2 = C50731p.START_ACTIVITY;
                Intent d = C92122r.m151186d(b2, (String) null, (String) null, C50794cr.WEATHER, pVar2, false);
                C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
                qVar.copyOnWrite();
                C50733r rVar = (C50733r) qVar.instance;
                rVar.f132024b = pVar2.f132020d;
                rVar.f132023a |= 1;
                String uri = d.toUri(1);
                qVar.copyOnWrite();
                C50733r rVar2 = (C50733r) qVar.instance;
                uri.getClass();
                rVar2.f132023a |= 2;
                rVar2.f132025c = uri;
                C50733r rVar3 = (C50733r) qVar.build();
                cnVar.copyOnWrite();
                C50818do doVar10 = (C50818do) cnVar.instance;
                rVar3.getClass();
                doVar10.f132316m = rVar3;
                doVar10.f132304a |= 2048;
                C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
                C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
                aVar.copyOnWrite();
                C50723h hVar = (C50723h) aVar.instance;
                hVar.f132001a |= 1;
                hVar.f132002b = "--";
                C50722g gVar2 = C50722g.UNSPECIFIED;
                aVar.copyOnWrite();
                C50723h hVar2 = (C50723h) aVar.instance;
                hVar2.f132003c = gVar2.f131998e;
                hVar2.f132001a |= 2;
                C50723h hVar3 = (C50723h) aVar.build();
                cyVar.copyOnWrite();
                C50802cz czVar = (C50802cz) cyVar.instance;
                hVar3.getClass();
                czVar.f132239b = hVar3;
                czVar.f132238a |= 1;
                cnVar.copyOnWrite();
                C50818do doVar11 = (C50818do) cnVar.instance;
                C50802cz czVar2 = (C50802cz) cyVar.build();
                czVar2.getClass();
                doVar11.f132309f = czVar2;
                doVar11.f132304a |= 16;
                C50794cr crVar = C50794cr.WEATHER;
                cnVar.copyOnWrite();
                C50818do doVar12 = (C50818do) cnVar.instance;
                doVar12.f132315l = crVar.f132222T;
                doVar12.f132304a |= 1024;
                long millis = Duration.ofHours(cVar3.f228373c.mo79743a(C89985ax.f246706an)).toMillis();
                long b3 = cVar3.f228372b.mo26870b();
                for (C92113i iVar2 : arrayList3) {
                    C50818do doVar13 = iVar2.f256820a;
                    C50794cr a2 = C50794cr.m85938a(doVar13.f132315l);
                    if (a2 == null) {
                        a2 = C50794cr.UNDEFINED;
                    }
                    if (a2 == C50794cr.WEATHER) {
                        C50796ct ctVar = doVar13.f132320q;
                        if (ctVar == null) {
                            ctVar = C50796ct.f132223c;
                        }
                        long j = ctVar.f132226b;
                        if (b3 < j) {
                            b3 = j;
                        }
                    }
                }
                cnVar.copyOnWrite();
                C50818do doVar14 = (C50818do) cnVar.instance;
                doVar14.f132304a |= 4096;
                doVar14.f132317n = b3;
                cnVar.copyOnWrite();
                C50818do doVar15 = (C50818do) cnVar.instance;
                doVar15.f132304a |= 8192;
                doVar15.f132318o = b3;
                cnVar.copyOnWrite();
                C50818do doVar16 = (C50818do) cnVar.instance;
                doVar16.f132304a |= 16384;
                doVar16.f132319p = millis;
                C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
                csVar.copyOnWrite();
                C50796ct ctVar2 = (C50796ct) csVar.instance;
                ctVar2.f132225a |= 1;
                ctVar2.f132226b = b3 + millis;
                cnVar.copyOnWrite();
                C50818do doVar17 = (C50818do) cnVar.instance;
                C50796ct ctVar3 = (C50796ct) csVar.build();
                ctVar3.getClass();
                doVar17.f132320q = ctVar3;
                doVar17.f132304a |= 32768;
                if (cVar3.f228373c.mo79746e(C89985ax.f246654H)) {
                    C50763a aVar2 = (C50763a) C50770h.f132124g.createBuilder();
                    C50769g gVar3 = C50769g.DEFAULT;
                    aVar2.copyOnWrite();
                    C50770h hVar4 = (C50770h) aVar2.instance;
                    hVar4.f132127b = gVar3.f132123h;
                    hVar4.f132126a |= 1;
                    C50764b bVar = (C50764b) C50765c.f132101g.createBuilder();
                    bVar.copyOnWrite();
                    C50765c cVar4 = (C50765c) bVar.instance;
                    hVar3.getClass();
                    cVar4.f132104b = hVar3;
                    cVar4.f132103a |= 1;
                    bVar.copyOnWrite();
                    C50765c cVar5 = (C50765c) bVar.instance;
                    rVar3.getClass();
                    cVar5.f132106d = rVar3;
                    cVar5.f132103a |= 4;
                    C50767e a3 = C131593n.m214002a(88888888, C9027a.WEATHER_DEFAULT);
                    bVar.copyOnWrite();
                    C50765c cVar6 = (C50765c) bVar.instance;
                    a3.getClass();
                    cVar6.f132107e = a3;
                    cVar6.f132103a |= 8;
                    aVar2.copyOnWrite();
                    C50770h hVar5 = (C50770h) aVar2.instance;
                    C50765c cVar7 = (C50765c) bVar.build();
                    cVar7.getClass();
                    hVar5.f132129d = cVar7;
                    hVar5.f132126a |= 4;
                    cnVar.copyOnWrite();
                    C50818do doVar18 = (C50818do) cnVar.instance;
                    C50770h hVar6 = (C50770h) aVar2.build();
                    hVar6.getClass();
                    doVar18.f132299E = hVar6;
                    doVar18.f132304a |= 1073741824;
                }
                arrayList3.add(new C92113i((C50818do) cnVar.build(), bitmap, true));
                biVar.f308620k.mo109908af(C9027a.WEATHER_DEFAULT.f31227ag);
            }
        }
        return biVar.mo98878p((C92113i[]) arrayList3.toArray(new C92113i[0]), (C60870cx) pair.second);
    }
}
