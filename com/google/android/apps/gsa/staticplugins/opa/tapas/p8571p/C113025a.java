package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48715bw;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import com.google.assistant.p3781ad.p3789d.p3791b.C48717by;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;
import com.google.assistant.p3781ad.p3789d.p3791b.C48720ca;
import com.google.assistant.p3781ad.p3789d.p3791b.C48721cb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.a */
/* compiled from: PG */
public final class C113025a {

    /* renamed from: a */
    private static final C48672ag f313212a = C48672ag.COMPLETE_SERVER;

    /* renamed from: a */
    public static C48718bz m187025a() {
        C48717by byVar = (C48717by) C48718bz.f126051b.createBuilder();
        for (int i = 0; i < 500; i++) {
            C48715bw bwVar = (C48715bw) C48716bx.f126043g.createBuilder();
            bwVar.mo53174a(m187026b("abc" + i, 10000, false, 3, "intent_name_one" + i));
            bwVar.mo53174a(m187026b("abcd" + i, 10000, true, 2, "intent_name_three" + i));
            bwVar.copyOnWrite();
            C48716bx bxVar = (C48716bx) bwVar.instance;
            bxVar.f126045a |= 2;
            bxVar.f126048d = 900;
            bwVar.copyOnWrite();
            C48716bx bxVar2 = (C48716bx) bwVar.instance;
            bxVar2.f126049e = 2;
            bxVar2.f126045a |= 4;
            bwVar.copyOnWrite();
            C48716bx bxVar3 = (C48716bx) bwVar.instance;
            bxVar3.f126045a |= 1;
            bxVar3.f126047c = "abcde";
            byVar.mo53177b(bwVar);
            C48715bw bwVar2 = (C48715bw) C48716bx.f126043g.createBuilder();
            bwVar2.mo53174a(m187026b("xyz" + i, 10000, false, 3, "intent_name_three" + i));
            bwVar2.mo53174a(m187026b("abc" + i, 20000, false, 3, "intent_name_one" + i));
            bwVar2.mo53174a(m187026b(BuildConfig.FLAVOR, 20000, true, 1, BuildConfig.FLAVOR));
            bwVar2.copyOnWrite();
            C48716bx bxVar4 = (C48716bx) bwVar2.instance;
            bxVar4.f126045a |= 2;
            bxVar4.f126048d = 990;
            bwVar2.copyOnWrite();
            C48716bx bxVar5 = (C48716bx) bwVar2.instance;
            bxVar5.f126049e = 2;
            bxVar5.f126045a |= 4;
            bwVar2.copyOnWrite();
            C48716bx bxVar6 = (C48716bx) bwVar2.instance;
            bxVar6.f126045a |= 1;
            bxVar6.f126047c = "xyz";
            byVar.mo53177b(bwVar2);
            C48715bw bwVar3 = (C48715bw) C48716bx.f126043g.createBuilder();
            bwVar3.mo53174a(m187026b("YouTube" + i, 10000, false, 1, "intent_name_one" + i));
            bwVar3.mo53174a(m187026b("Trending" + i, 20000, false, 1, "intent_name_two" + i));
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            bwVar3.mo53174a(m187026b(sb.toString(), 30000, true, 3, "intent_name_one" + i));
            bwVar3.copyOnWrite();
            C48716bx bxVar7 = (C48716bx) bwVar3.instance;
            bxVar7.f126045a |= 2;
            bxVar7.f126048d = 980;
            bwVar3.copyOnWrite();
            C48716bx bxVar8 = (C48716bx) bwVar3.instance;
            bxVar8.f126049e = 2;
            bxVar8.f126045a |= 4;
            bwVar3.copyOnWrite();
            C48716bx bxVar9 = (C48716bx) bwVar3.instance;
            bxVar9.f126045a |= 1;
            bxVar9.f126047c = "weather" + i;
            byVar.mo53177b(bwVar3);
        }
        return (C48718bz) byVar.build();
    }

    /* renamed from: b */
    private static C48721cb m187026b(String str, int i, boolean z, int i2, String str2) {
        C48720ca caVar = (C48720ca) C48721cb.f126055m.createBuilder();
        caVar.copyOnWrite();
        C48721cb cbVar = (C48721cb) caVar.instance;
        cbVar.f126057a |= 1;
        cbVar.f126058b = i;
        caVar.copyOnWrite();
        C48721cb cbVar2 = (C48721cb) caVar.instance;
        cbVar2.f126057a |= 2;
        cbVar2.f126059c = 5;
        caVar.copyOnWrite();
        C48721cb cbVar3 = (C48721cb) caVar.instance;
        cbVar3.f126057a |= 4;
        cbVar3.f126060d = 6;
        int i3 = f313212a.f125915O;
        caVar.copyOnWrite();
        C48721cb cbVar4 = (C48721cb) caVar.instance;
        cbVar4.f126057a |= 32;
        cbVar4.f126063g = i3;
        caVar.copyOnWrite();
        C48721cb cbVar5 = (C48721cb) caVar.instance;
        cbVar5.f126057a |= 16;
        cbVar5.f126062f = str;
        caVar.copyOnWrite();
        C48721cb cbVar6 = (C48721cb) caVar.instance;
        cbVar6.f126057a |= 64;
        cbVar6.f126064h = z;
        caVar.copyOnWrite();
        C48721cb cbVar7 = (C48721cb) caVar.instance;
        cbVar7.f126057a |= 128;
        cbVar7.f126065i = i2 - 1;
        caVar.copyOnWrite();
        C48721cb cbVar8 = (C48721cb) caVar.instance;
        cbVar8.f126057a |= 256;
        cbVar8.f126066j = str2;
        return (C48721cb) caVar.build();
    }
}
