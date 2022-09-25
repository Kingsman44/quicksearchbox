package com.google.android.libraries.assistant.auto.ondevice.utils;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.nlp.p4730a.C62750an;
import com.google.nlp.p4730a.C62751ao;
import com.google.nlp.p4730a.C62752ap;
import com.google.nlp.p4730a.C62755as;
import com.google.nlp.p4730a.C62756at;
import com.google.nlp.p4730a.C62759aw;
import com.google.nlp.p4730a.C62760ax;
import com.google.nlp.p4730a.C62782ba;
import com.google.nlp.p4730a.C62790j;
import com.google.nlp.p4730a.C62791k;
import com.google.nlp.p4730a.C62796p;
import com.google.nlp.p4730a.C62797q;
import com.google.nlp.p4730a.C62798r;
import com.google.nlp.p4730a.C62799s;
import com.google.nlp.p4730a.C62801u;
import com.google.p4242bp.p4252d.C56179a;
import com.google.p4242bp.p4252d.C56180b;
import com.google.p5277z.p5282c.C68006ap;
import com.google.p5277z.p5282c.C68007aq;
import com.google.p5277z.p5282c.C68008ar;
import com.google.p5277z.p5282c.C68009as;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4988b.p4995e.C64802b;

/* compiled from: PG */
public class CommsNlgUtil {

    /* renamed from: a */
    private static final C58974d f38325a = C58974d.m91134h("CommsNlgUtil");

    /* renamed from: b */
    public static C62799s m27744b(String str, C62782ba baVar) {
        C62798r rVar = (C62798r) C62799s.f169588g.createBuilder();
        rVar.copyOnWrite();
        C62799s sVar = (C62799s) rVar.instance;
        sVar.f169590a |= 1;
        sVar.f169591b = "en-US";
        rVar.copyOnWrite();
        C62799s sVar2 = (C62799s) rVar.instance;
        sVar2.f169590a |= 64;
        sVar2.f169594e = true;
        C62796p pVar = (C62796p) C62797q.f169576g.createBuilder();
        pVar.copyOnWrite();
        C62797q qVar = (C62797q) pVar.instance;
        qVar.f169579b = C64802b.m96463a(3);
        qVar.f169578a |= 2;
        rVar.copyOnWrite();
        C62799s sVar3 = (C62799s) rVar.instance;
        C62797q qVar2 = (C62797q) pVar.build();
        qVar2.getClass();
        sVar3.f169593d = qVar2;
        sVar3.f169590a |= 8;
        C62940bt btVar = C62791k.f169562e;
        C62790j jVar = (C62790j) C62791k.f169561d.createBuilder();
        C62759aw awVar = (C62759aw) C62760ax.f169492b.createBuilder();
        C62750an anVar = (C62750an) C62751ao.f169475d.createBuilder();
        anVar.copyOnWrite();
        C62751ao aoVar = (C62751ao) anVar.instance;
        aoVar.f169477a |= 1;
        aoVar.f169478b = "call";
        anVar.copyOnWrite();
        C62751ao aoVar2 = (C62751ao) anVar.instance;
        aoVar2.f169477a |= 2;
        aoVar2.f169479c = str;
        awVar.copyOnWrite();
        C62760ax axVar = (C62760ax) awVar.instance;
        C62751ao aoVar3 = (C62751ao) anVar.build();
        aoVar3.getClass();
        C62971cq cqVar = axVar.f169494a;
        if (!cqVar.mo58948c()) {
            axVar.f169494a = C62942bv.mutableCopy(cqVar);
        }
        axVar.f169494a.add(aoVar3);
        jVar.copyOnWrite();
        C62791k kVar = (C62791k) jVar.instance;
        C62760ax axVar2 = (C62760ax) awVar.build();
        axVar2.getClass();
        kVar.f169565b = axVar2;
        kVar.f169564a = 1 | kVar.f169564a;
        rVar.mo58885m(btVar, (C62791k) jVar.build());
        if (baVar != null) {
            C62940bt btVar2 = C62791k.f169562e;
            C62790j jVar2 = (C62790j) ((C62791k) rVar.mo58881i(btVar2)).toBuilder();
            jVar2.copyOnWrite();
            C62791k kVar2 = (C62791k) jVar2.instance;
            kVar2.f169566c = baVar;
            kVar2.f169564a |= 4;
            rVar.mo58885m(btVar2, (C62791k) jVar2.build());
        }
        return (C62799s) rVar.build();
    }

    static native byte[] nativeRealizeTtsWithGenX(byte[] bArr);

    /* renamed from: a */
    public final C51809dy mo20309a(C62799s sVar) {
        C62801u uVar;
        try {
            uVar = (C62801u) C62942bv.parseFrom((C62942bv) C62801u.f169598d, nativeRealizeTtsWithGenX(sVar.toByteArray()), C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f38325a.mo56225c()).mo56382g(e)).mo56372aa(43802)).mo56386p("Failed to parse byte array returned from native c++ function into RealizationResponse.");
            uVar = null;
        }
        if (uVar == null) {
            ((C58970a) ((C58970a) f38325a.mo56226d()).mo56372aa(43800)).mo56386p("GenX response is null");
            return null;
        }
        String str = uVar.f169601b;
        if (!str.isEmpty()) {
            return C15669a.m32462a(str);
        }
        ((C58970a) ((C58970a) f38325a.mo56226d()).mo56372aa(43799)).mo56386p("GenX returns empty string");
        return null;
    }

    /* renamed from: c */
    public final C62799s mo20310c(String str, C58485gu guVar, int i) {
        C62752ap apVar = (C62752ap) C62782ba.f169539b.createBuilder();
        C62755as asVar = (C62755as) C62756at.f169482e.createBuilder();
        asVar.copyOnWrite();
        C62756at atVar = (C62756at) asVar.instance;
        atVar.f169484a |= 1;
        atVar.f169487d = "action_name";
        asVar.copyOnWrite();
        C62756at atVar2 = (C62756at) asVar.instance;
        atVar2.f169485b = 4;
        atVar2.f169486c = "call";
        apVar.mo58631a(asVar);
        C62755as asVar2 = (C62755as) C62756at.f169482e.createBuilder();
        asVar2.copyOnWrite();
        C62756at atVar3 = (C62756at) asVar2.instance;
        atVar3.f169484a |= 1;
        atVar3.f169487d = "contact_disambiguation_person_queried_name";
        asVar2.copyOnWrite();
        C62756at atVar4 = (C62756at) asVar2.instance;
        atVar4.f169485b = 4;
        atVar4.f169486c = str;
        apVar.mo58631a(asVar2);
        C62755as asVar3 = (C62755as) C62756at.f169482e.createBuilder();
        asVar3.copyOnWrite();
        C62756at atVar5 = (C62756at) asVar3.instance;
        atVar5.f169484a |= 1;
        atVar5.f169487d = "list_item_names";
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/quality.dialog_manager.ListValues";
        C68008ar arVar = (C68008ar) C68009as.f184267b.createBuilder();
        int size = guVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) guVar.get(i2);
            C68006ap apVar2 = (C68006ap) C68007aq.f184262c.createBuilder();
            C56179a aVar = (C56179a) C56180b.f149684c.createBuilder();
            aVar.copyOnWrite();
            C56180b bVar = (C56180b) aVar.instance;
            str2.getClass();
            bVar.f149686a |= 8;
            bVar.f149687b = str2;
            apVar2.copyOnWrite();
            C68007aq aqVar = (C68007aq) apVar2.instance;
            C56180b bVar2 = (C56180b) aVar.build();
            bVar2.getClass();
            aqVar.f184265b = bVar2;
            aqVar.f184264a |= 2;
            arVar.copyOnWrite();
            C68009as asVar4 = (C68009as) arVar.instance;
            C68007aq aqVar2 = (C68007aq) apVar2.build();
            aqVar2.getClass();
            C62971cq cqVar = asVar4.f184269a;
            if (!cqVar.mo58948c()) {
                asVar4.f184269a = C62942bv.mutableCopy(cqVar);
            }
            asVar4.f184269a.add(aqVar2);
        }
        C63088z byteString = ((C68009as) arVar.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        C63070h hVar = (C63070h) gVar.build();
        asVar3.copyOnWrite();
        C62756at atVar6 = (C62756at) asVar3.instance;
        hVar.getClass();
        atVar6.f169486c = hVar;
        atVar6.f169485b = 13;
        apVar.mo58631a(asVar3);
        C62755as asVar5 = (C62755as) C62756at.f169482e.createBuilder();
        asVar5.copyOnWrite();
        C62756at atVar7 = (C62756at) asVar5.instance;
        atVar7.f169484a |= 1;
        atVar7.f169487d = "count";
        asVar5.copyOnWrite();
        C62756at atVar8 = (C62756at) asVar5.instance;
        atVar8.f169485b = 9;
        atVar8.f169486c = Integer.valueOf(i);
        apVar.mo58631a(asVar5);
        return m27744b("contact_disambiguation_type__FLF_INFO_REQUEST", (C62782ba) apVar.build());
    }
}
