package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.libraries.search.p3055n.C39377bz;
import com.google.android.libraries.search.p3055n.C39647ca;
import com.google.android.libraries.search.p3055n.C39658cl;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67078kf;
import com.google.speech.p5218j.C67079kg;
import com.google.speech.p5218j.C67080kh;
import com.google.speech.p5218j.C67083kk;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.k */
/* compiled from: PG */
public final /* synthetic */ class C120871k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120844ak f336078a;

    /* renamed from: b */
    public final /* synthetic */ C120511h f336079b;

    public /* synthetic */ C120871k(C120844ak akVar, C120511h hVar) {
        this.f336078a = akVar;
        this.f336079b = hVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        Object obj3;
        C120844ak akVar = this.f336078a;
        C120511h hVar = this.f336079b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return akVar.mo104941a("Missing soda compatibility response.");
        }
        C67087ko koVar = (C67087ko) axVar.mo56107c();
        C62940bt r3 = C62942bv.checkIsLite(C39647ca.f104366e);
        koVar.mo58887l(r3);
        Object l = koVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            obj2 = r3.f169969b;
        } else {
            obj2 = r3.mo58889c(l);
        }
        int i = 1;
        if (((C39647ca) obj2).f104369b) {
            Optional d = hVar.mo104772d();
            C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
            C67080kh khVar = (C67080kh) C67083kk.f182351g.createBuilder();
            C67078kf kfVar = (C67078kf) C67079kg.f182340h.createBuilder();
            kfVar.mo59768a(BuildConfig.FLAVOR);
            khVar.copyOnWrite();
            C67083kk kkVar = (C67083kk) khVar.instance;
            C67079kg kgVar = (C67079kg) kfVar.build();
            kgVar.getClass();
            kkVar.f182355c = kgVar;
            kkVar.f182354b = 4;
            knVar.copyOnWrite();
            C67087ko koVar2 = (C67087ko) knVar.instance;
            C67083kk kkVar2 = (C67083kk) khVar.build();
            kkVar2.getClass();
            koVar2.f182370c = kkVar2;
            koVar2.f182368a |= 2;
            if (d.isPresent()) {
                C67050je jeVar = (C67050je) d.get();
                knVar.copyOnWrite();
                C67087ko koVar3 = (C67087ko) knVar.instance;
                jeVar.getClass();
                koVar3.f182369b = jeVar;
                koVar3.f182368a |= 1;
            } else {
                C59104x d2 = C120844ak.f336019a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
                ((C59052c) ((C59052c) d2).mo56372aa(35623)).mo56386p("Hotword is missing. S3 request will contain the default device type and may fail MDA.");
            }
            akVar.f336028j.mo20123c((C67087ko) knVar.build());
            return C60866ct.f164955a;
        }
        C67087ko koVar4 = (C67087ko) axVar.mo56107c();
        C62940bt r1 = C62942bv.checkIsLite(C39647ca.f104366e);
        koVar4.mo58887l(r1);
        Object l2 = koVar4.f169962ag.mo58854l(r1.f169971d);
        if (l2 == null) {
            obj3 = r1.f169969b;
        } else {
            obj3 = r1.mo58889c(l2);
        }
        int a = C39377bz.m68768a(((C39647ca) obj3).f104370c);
        if (a != 0) {
            i = a;
        }
        C39658cl clVar = C39658cl.DEFAULT_UNKNOWN;
        int i2 = i - 1;
        if (i2 == 2) {
            return akVar.mo104941a("Compatibility check failed due to missing LP.");
        }
        if (i2 == 3) {
            return akVar.mo104941a("Compatibility check failed due to App Domain not supported.");
        }
        if (i2 == 4) {
            return akVar.mo104941a("Compatibility check failed due to missing locale.");
        }
        if (i2 != 5) {
            return akVar.mo104941a("Compatibility check failed due to unknown reason.");
        }
        return akVar.mo104941a("Compatibility check failed due to Multilang not supported.");
    }
}
