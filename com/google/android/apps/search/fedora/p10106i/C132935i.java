package com.google.android.apps.search.fedora.p10106i;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.fedora.p10099e.C132780ak;
import com.google.android.apps.search.fedora.p10099e.C132781al;
import com.google.android.apps.search.fedora.p10099e.C132784ao;
import com.google.android.apps.search.fedora.p10099e.C132785ap;
import com.google.android.apps.search.fedora.p10099e.C132786aq;
import com.google.android.apps.search.fedora.p10099e.C132787ar;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62995dn;
import com.google.speech.p5228m.C67324ca;
import com.google.speech.p5228m.C67325cb;
import com.google.speech.p5228m.C67326cc;
import com.google.speech.p5228m.C67327cd;
import com.google.speech.p5228m.C67340d;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.search.fedora.i.i */
/* compiled from: PG */
final class C132935i {

    /* renamed from: b */
    private static final C59071e f362613b = C59071e.m91332i("com.google.android.apps.search.fedora.i.i");

    /* renamed from: a */
    public final C132787ar f362614a;

    public C132935i(boolean z, boolean z2, boolean z3, String str, boolean z4, long j, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C67327cd cdVar, boolean z12, boolean z13, String str3, long j2, boolean z14) {
        C67327cd cdVar2;
        boolean z15 = z3;
        boolean z16 = z11;
        C132785ap apVar = (C132785ap) C132786aq.f362276d.createBuilder();
        apVar.copyOnWrite();
        C132786aq aqVar = (C132786aq) apVar.instance;
        aqVar.f362278a |= 1;
        aqVar.f362279b = z;
        apVar.copyOnWrite();
        C132786aq aqVar2 = (C132786aq) apVar.instance;
        aqVar2.f362278a |= 4;
        aqVar2.f362280c = z2;
        C132786aq aqVar3 = (C132786aq) apVar.build();
        if (!z16) {
            cdVar2 = C67327cd.f182998h;
        } else if (cdVar == null) {
            C67326cc ccVar = (C67326cc) C67327cd.f182998h.createBuilder();
            C67324ca caVar = (C67324ca) C67325cb.f182991f.createBuilder();
            caVar.copyOnWrite();
            C67325cb cbVar = (C67325cb) caVar.instance;
            cbVar.f182993a |= 1;
            cbVar.f182994b = 0.4f;
            caVar.copyOnWrite();
            C67325cb cbVar2 = (C67325cb) caVar.instance;
            cbVar2.f182993a |= 2;
            cbVar2.f182995c = 6.1f;
            caVar.copyOnWrite();
            C67325cb cbVar3 = (C67325cb) caVar.instance;
            cbVar3.f182993a |= 4;
            cbVar3.f182996d = 0.35f;
            caVar.copyOnWrite();
            C67325cb cbVar4 = (C67325cb) caVar.instance;
            cbVar4.f182993a |= 8;
            cbVar4.f182997e = 7.1f;
            C67325cb cbVar5 = (C67325cb) caVar.build();
            ccVar.copyOnWrite();
            C67327cd cdVar3 = (C67327cd) ccVar.instance;
            cbVar5.getClass();
            cdVar3.f183001b = cbVar5;
            cdVar3.f183000a |= 1;
            ccVar.copyOnWrite();
            C67327cd cdVar4 = (C67327cd) ccVar.instance;
            cdVar4.f183000a |= 2;
            cdVar4.f183002c = false;
            ccVar.copyOnWrite();
            C67327cd cdVar5 = (C67327cd) ccVar.instance;
            cdVar5.f183000a |= 4;
            cdVar5.f183003d = false;
            ccVar.copyOnWrite();
            C67327cd cdVar6 = (C67327cd) ccVar.instance;
            cdVar6.f183000a |= 8;
            cdVar6.f183004e = 0.5d;
            ccVar.copyOnWrite();
            C67327cd cdVar7 = (C67327cd) ccVar.instance;
            cdVar7.f183000a |= 16;
            cdVar7.f183005f = 0.25d;
            ccVar.copyOnWrite();
            C67327cd cdVar8 = (C67327cd) ccVar.instance;
            cdVar8.f183000a |= 32;
            cdVar8.f183006g = 0.5d;
            cdVar2 = (C67327cd) ccVar.build();
        } else {
            cdVar2 = cdVar;
        }
        C132781al alVar = (C132781al) C132784ao.f362255t.createBuilder();
        alVar.copyOnWrite();
        C132784ao aoVar = (C132784ao) alVar.instance;
        aoVar.f362257a |= 4;
        aoVar.f362259c = z15;
        alVar.copyOnWrite();
        C132784ao aoVar2 = (C132784ao) alVar.instance;
        aoVar2.f362257a |= 1;
        aoVar2.f362258b = z15;
        alVar.copyOnWrite();
        C132784ao aoVar3 = (C132784ao) alVar.instance;
        aoVar3.f362257a |= 8;
        aoVar3.f362260d = z15;
        alVar.copyOnWrite();
        C132784ao aoVar4 = (C132784ao) alVar.instance;
        aoVar4.f362257a |= 16;
        aoVar4.f362262f = z4;
        HashMap hashMap = new HashMap();
        for (String i : C58869cf.m90936b(new C58903m(',')).mo56152f(C58911u.f156751b).mo56151a().mo56155i(str)) {
            List i2 = C58869cf.m90936b(new C58903m(':')).mo56152f(C58911u.f156751b).mo56155i(i);
            if (i2.size() == 2) {
                try {
                    hashMap.put((String) i2.get(0), Float.valueOf(Float.parseFloat((String) i2.get(1))));
                } catch (Throwable th) {
                    C59104x c = f362613b.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "FedoraFlagHelper");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(39935)).mo56386p("Failed to parse caching threshold value.");
                }
            } else {
                C59104x c2 = f362613b.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "FedoraFlagHelper");
                ((C59052c) ((C59052c) c2).mo56372aa(39934)).mo56386p("Invalid caching threshold format.");
            }
        }
        alVar.copyOnWrite();
        C132784ao aoVar5 = (C132784ao) alVar.instance;
        C62995dn dnVar = aoVar5.f362261e;
        if (!dnVar.f170058b) {
            aoVar5.f362261e = dnVar.mo58980a();
        }
        aoVar5.f362261e.putAll(hashMap);
        alVar.copyOnWrite();
        C132784ao aoVar6 = (C132784ao) alVar.instance;
        aoVar6.f362257a |= 32;
        aoVar6.f362263g = j;
        alVar.copyOnWrite();
        C132784ao aoVar7 = (C132784ao) alVar.instance;
        aoVar7.f362257a |= 8192;
        aoVar7.f362270n = z6;
        alVar.copyOnWrite();
        C132784ao aoVar8 = (C132784ao) alVar.instance;
        aoVar8.f362257a |= 128;
        aoVar8.f362264h = z7;
        alVar.copyOnWrite();
        C132784ao aoVar9 = (C132784ao) alVar.instance;
        aoVar9.f362257a |= 512;
        aoVar9.f362266j = z8;
        alVar.copyOnWrite();
        C132784ao aoVar10 = (C132784ao) alVar.instance;
        aoVar10.f362257a |= 1024;
        aoVar10.f362267k = z9;
        alVar.copyOnWrite();
        C132784ao aoVar11 = (C132784ao) alVar.instance;
        aoVar11.f362257a |= 2048;
        aoVar11.f362268l = z10;
        alVar.copyOnWrite();
        C132784ao aoVar12 = (C132784ao) alVar.instance;
        aoVar12.f362257a |= 256;
        aoVar12.f362265i = z16;
        alVar.copyOnWrite();
        C132784ao aoVar13 = (C132784ao) alVar.instance;
        aoVar13.f362257a |= 4096;
        aoVar13.f362269m = z12;
        alVar.copyOnWrite();
        C132784ao aoVar14 = (C132784ao) alVar.instance;
        cdVar2.getClass();
        aoVar14.f362271o = cdVar2;
        aoVar14.f362257a |= 16384;
        alVar.copyOnWrite();
        C132784ao aoVar15 = (C132784ao) alVar.instance;
        aoVar15.f362257a |= 65536;
        aoVar15.f362272p = z13;
        HashMap hashMap2 = new HashMap();
        for (String i3 : C58869cf.m90936b(new C58903m(';')).mo56152f(C58911u.f156751b).mo56151a().mo56155i(str3)) {
            List i4 = C58869cf.m90936b(new C58903m(',')).mo56152f(C58911u.f156751b).mo56155i(i3);
            if (i4.size() == 2) {
                try {
                    hashMap2.put((String) i4.get(0), (String) i4.get(1));
                } catch (Throwable th2) {
                    C59104x c3 = f362613b.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "FedoraFlagHelper");
                    ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(th2)).mo56372aa(39937)).mo56386p("Failed to parse Sheldon notification text value.");
                }
            } else {
                C59104x c4 = f362613b.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "FedoraFlagHelper");
                ((C59052c) ((C59052c) c4).mo56372aa(39936)).mo56386p("Invalid Sheldon notification text format.");
            }
        }
        alVar.copyOnWrite();
        C132784ao aoVar16 = (C132784ao) alVar.instance;
        C62995dn dnVar2 = aoVar16.f362273q;
        if (!dnVar2.f170058b) {
            aoVar16.f362273q = dnVar2.mo58980a();
        }
        aoVar16.f362273q.putAll(hashMap2);
        int a = C67340d.m97452a((int) j2);
        a = a == 0 ? 2 : a;
        alVar.copyOnWrite();
        C132784ao aoVar17 = (C132784ao) alVar.instance;
        aoVar17.f362274r = a - 1;
        aoVar17.f362257a |= C89885b.HTTP_VALUE;
        alVar.copyOnWrite();
        C132784ao aoVar18 = (C132784ao) alVar.instance;
        aoVar18.f362257a |= 524288;
        aoVar18.f362275s = z14;
        C132784ao aoVar19 = (C132784ao) alVar.build();
        C132780ak akVar = (C132780ak) C132787ar.f362281g.createBuilder();
        akVar.copyOnWrite();
        C132787ar arVar = (C132787ar) akVar.instance;
        aqVar3.getClass();
        arVar.f362284b = aqVar3;
        arVar.f362283a |= 1;
        akVar.copyOnWrite();
        C132787ar arVar2 = (C132787ar) akVar.instance;
        aoVar19.getClass();
        arVar2.f362285c = aoVar19;
        arVar2.f362283a |= 2;
        akVar.copyOnWrite();
        C132787ar arVar3 = (C132787ar) akVar.instance;
        str2.getClass();
        arVar3.f362283a |= 8;
        arVar3.f362287e = str2;
        akVar.copyOnWrite();
        C132787ar arVar4 = (C132787ar) akVar.instance;
        arVar4.f362283a |= 4;
        arVar4.f362286d = z5;
        this.f362614a = (C132787ar) akVar.build();
    }
}
