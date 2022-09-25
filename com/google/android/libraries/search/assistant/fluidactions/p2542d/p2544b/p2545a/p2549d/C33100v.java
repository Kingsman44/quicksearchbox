package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19045c;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.assistant.p3897e.p3902c.p3907c.C51015df;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51024do;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52495tw;
import com.google.assistant.p3897e.p3921j.C52496tx;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.C52537vk;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5282c.C68013c;
import com.google.p5277z.p5282c.C68014d;
import com.google.protobuf.C63088z;
import com.google.protos.p4850an.C63634r;
import com.google.protos.p4850an.C63641y;
import com.google.protos.p4850an.C63642z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.v */
/* compiled from: PG */
public final class C33100v implements C33096r {

    /* renamed from: a */
    public static final C59071e f88616a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.v");

    /* renamed from: b */
    public C51953ff f88617b;

    /* renamed from: c */
    public final C52507uh f88618c;

    public C33100v(C51953ff ffVar, C52507uh uhVar) {
        this.f88617b = ffVar;
        this.f88618c = uhVar;
    }

    /* renamed from: c */
    public static C51027dr m61400c(C52541vo voVar) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.LocationSelectionContent";
        C52495tw twVar = (C52495tw) C52496tx.f137813c.createBuilder();
        twVar.copyOnWrite();
        C52496tx txVar = (C52496tx) twVar.instance;
        voVar.getClass();
        txVar.f137816b = voVar;
        txVar.f137815a |= 1;
        C63088z byteString = ((C52496tx) twVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        HashMap hashMap = new HashMap();
        hashMap.put("location_selection", (C52230ka) jzVar.build());
        C51024do doVar = (C51024do) C51027dr.f132852m.createBuilder();
        doVar.copyOnWrite();
        C51027dr drVar = (C51027dr) doVar.instance;
        drVar.f132854a |= 1;
        drVar.f132859f = true;
        C52537vk vkVar = voVar.f137912c;
        if (vkVar == null) {
            vkVar = C52537vk.f137903c;
        }
        String str = vkVar.f137906b;
        doVar.copyOnWrite();
        C51027dr drVar2 = (C51027dr) doVar.instance;
        str.getClass();
        drVar2.f132855b = 2;
        drVar2.f132856c = str;
        String str2 = voVar.f137911b;
        doVar.copyOnWrite();
        C51027dr drVar3 = (C51027dr) doVar.instance;
        str2.getClass();
        drVar3.f132854a |= 16;
        drVar3.f132861h = str2;
        C51015df dfVar = (C51015df) C51016dg.f132827g.createBuilder();
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a = 1 | duVar.f135926a;
        duVar.f135927b = "ui.FORM_INPUT";
        for (Map.Entry entry : hashMap.entrySet()) {
            dsVar.mo53729a((String) entry.getKey(), (C52230ka) entry.getValue());
        }
        C51805du duVar2 = (C51805du) dsVar.build();
        dfVar.copyOnWrite();
        C51016dg dgVar = (C51016dg) dfVar.instance;
        duVar2.getClass();
        dgVar.f132833e = duVar2;
        dgVar.f132829a |= 8;
        doVar.copyOnWrite();
        C51027dr drVar4 = (C51027dr) doVar.instance;
        C51016dg dgVar2 = (C51016dg) dfVar.build();
        dgVar2.getClass();
        drVar4.f132858e = dgVar2;
        drVar4.f132857d = 4;
        return (C51027dr) doVar.build();
    }

    /* renamed from: d */
    public static C51030du m61401d(C51030du duVar) {
        C51021dl dlVar = (C51021dl) duVar.toBuilder();
        dlVar.copyOnWrite();
        ((C51030du) dlVar.instance).f132875f = C51030du.emptyProtobufList();
        dlVar.mo53501b((List) Collection.EL.stream(duVar.f132875f).map(C33097s.f88613a).collect(Collectors.toCollection(C33098t.f88614a)));
        return (C51030du) dlVar.build();
    }

    /* renamed from: e */
    public static boolean m61402e(C52490tr trVar) {
        C52496tx txVar;
        if (!trVar.f137800d.equals("location_picker")) {
            return false;
        }
        if (trVar.f137798b == 7) {
            txVar = (C52496tx) trVar.f137799c;
        } else {
            txVar = C52496tx.f137813c;
        }
        return (txVar.f137815a & 1) != 0;
    }

    /* renamed from: a */
    public final C51953ff mo38521a(C51953ff ffVar) {
        C51030du duVar;
        Optional g = C33136x.m61490g("location", ffVar);
        if (!g.isPresent()) {
            return ffVar;
        }
        C51941eu euVar = (C51941eu) g.get();
        if (euVar.f136277e == 6) {
            duVar = (C51030du) euVar.f136278f;
        } else {
            duVar = C51030du.f132868g;
        }
        C51030du d = m61401d(duVar);
        C51937eq eqVar = (C51937eq) ((C51941eu) g.get()).toBuilder();
        C51021dl dlVar = (C51021dl) d.toBuilder();
        dlVar.copyOnWrite();
        C51030du duVar2 = (C51030du) dlVar.instance;
        duVar2.f132874e = null;
        duVar2.f132870a &= -17;
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        C51030du duVar3 = (C51030du) dlVar.build();
        duVar3.getClass();
        euVar2.f136278f = duVar3;
        euVar2.f136277e = 6;
        return C33136x.m61489f((C51941eu) eqVar.build(), ffVar, Optional.empty());
    }

    /* renamed from: b */
    public final void mo38522b(C19045c cVar) {
        boolean z;
        C51030du duVar;
        C68013c cVar2 = (C68013c) cVar.mo24271c().toBuilder();
        C61752n nVar = ((C68014d) cVar2.instance).f184280c;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        C61751m mVar = (C61751m) nVar.toBuilder();
        List<C63642z> e = cVar.mo24273e();
        Optional g = C33136x.m61490g("location", this.f88617b);
        if (!g.isPresent()) {
            z = false;
        } else {
            C51941eu euVar = (C51941eu) g.get();
            if (euVar.f136277e == 6) {
                duVar = (C51030du) euVar.f136278f;
            } else {
                duVar = C51030du.f132868g;
            }
            z = Collection.EL.stream(duVar.f132875f).anyMatch(C33099u.f88615a);
        }
        boolean z2 = !z;
        for (int i = 0; i < ((C61752n) mVar.instance).f166812c.size(); i++) {
            C61746h a = mVar.mo58182a(i);
            if (z2 && a.f166796d.equals("location")) {
                C61745g gVar = (C61745g) a.toBuilder();
                gVar.copyOnWrite();
                C61746h hVar = (C61746h) gVar.instance;
                hVar.f166797e = null;
                hVar.f166793a &= -5;
                mVar.mo58187f(i, gVar);
            }
        }
        cVar2.copyOnWrite();
        C68014d dVar = (C68014d) cVar2.instance;
        C61752n nVar2 = (C61752n) mVar.build();
        nVar2.getClass();
        dVar.f184280c = nVar2;
        dVar.f184278a |= 2;
        cVar.mo24277i(cVar2);
        ArrayList arrayList = new ArrayList();
        for (C63642z builder : e) {
            C63641y yVar = (C63641y) builder.toBuilder();
            if (((C63642z) yVar.instance).f172116c.equals(((C61752n) mVar.instance).f166811b)) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < ((C63642z) yVar.instance).f172117d.size(); i2++) {
                    C63634r a2 = yVar.mo59224a(i2);
                    if (!z2 || !a2.f172101d.equals("location")) {
                        arrayList2.add(a2);
                    }
                }
                yVar.copyOnWrite();
                ((C63642z) yVar.instance).f172117d = C63642z.emptyProtobufList();
                yVar.mo59225b(arrayList2);
            }
            arrayList.add((C63642z) yVar.build());
        }
        cVar.mo24279k(arrayList);
    }
}
