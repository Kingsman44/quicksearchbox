package com.google.android.apps.gsa.staticplugins.bisto.p7514p;

import com.google.android.apps.gsa.nga.api.a.y;
import com.google.android.apps.gsa.nga.shared.p6356m.C81428d;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.C60057jf;
import com.google.common.p4552o.C60059jh;
import com.google.common.p4552o.C60087kg;
import com.google.common.p4552o.C60088kh;
import com.google.common.p4552o.C60089ki;
import com.google.common.p4552o.C60091kk;
import com.google.common.p4552o.C60092kl;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.p.d */
/* compiled from: PG */
public final class C95832d implements C95838j {

    /* renamed from: d */
    private static final C59071e f268361d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.p.d");

    /* renamed from: a */
    public final AtomicBoolean f268362a = new AtomicBoolean(false);

    /* renamed from: b */
    public int f268363b = 0;

    /* renamed from: c */
    public long f268364c = 0;

    /* renamed from: e */
    private final C95307m f268365e;

    /* renamed from: f */
    private final Map f268366f = new HashMap();

    /* renamed from: g */
    private final String f268367g;

    /* renamed from: h */
    private final Optional f268368h;

    /* renamed from: i */
    private final Set f268369i = new HashSet();

    /* renamed from: j */
    private final C21370a f268370j;

    /* renamed from: k */
    private final int f268371k;

    public C95832d(C21370a aVar, Optional optional, C95307m mVar, int i) {
        this.f268370j = aVar;
        this.f268365e = mVar;
        this.f268368h = optional;
        this.f268371k = i;
        this.f268367g = String.valueOf(C90719ac.f253778a.f253779b.nextLong());
    }

    /* renamed from: a */
    public static C60089ki m158872a(y yVar) {
        return m158874o(yVar.f, yVar.d, yVar.b, yVar.h, yVar.a, yVar.e);
    }

    /* renamed from: b */
    public static C60089ki m158873b(HotwordResult hotwordResult) {
        if (hotwordResult == null) {
            return null;
        }
        return m158874o(hotwordResult.mo84681a(), hotwordResult.mo84684d(), hotwordResult.mo84676A(), hotwordResult.mo84680E(), hotwordResult.mo84692j(), hotwordResult.mo84682b());
    }

    /* renamed from: o */
    private static C60089ki m158874o(float f, float f2, boolean z, boolean z2, int i, float f3) {
        C60088kh khVar = (C60088kh) C60089ki.f162449h.createBuilder();
        khVar.copyOnWrite();
        C60089ki kiVar = (C60089ki) khVar.instance;
        kiVar.f162451a |= 2;
        kiVar.f162453c = f;
        khVar.copyOnWrite();
        C60089ki kiVar2 = (C60089ki) khVar.instance;
        kiVar2.f162451a |= 4;
        kiVar2.f162454d = f2;
        khVar.copyOnWrite();
        C60089ki kiVar3 = (C60089ki) khVar.instance;
        kiVar3.f162451a |= 8;
        kiVar3.f162455e = z;
        khVar.copyOnWrite();
        C60089ki kiVar4 = (C60089ki) khVar.instance;
        kiVar4.f162451a |= 16;
        kiVar4.f162456f = z2;
        khVar.copyOnWrite();
        C60089ki kiVar5 = (C60089ki) khVar.instance;
        kiVar5.f162451a |= 32;
        kiVar5.f162457g = i;
        if (((double) f) > C59203do.f157270a) {
            khVar.copyOnWrite();
            C60089ki kiVar6 = (C60089ki) khVar.instance;
            kiVar6.f162451a |= 1;
            kiVar6.f162452b = f3 / f;
        }
        return (C60089ki) khVar.build();
    }

    /* renamed from: c */
    public final void mo89802c(String str) {
        this.f268364c = this.f268370j.mo26870b();
        C60087kg kgVar = (C60087kg) C60092kl.f162479k.createBuilder();
        if (this.f268368h.isPresent()) {
            boolean d = ((C81428d) this.f268368h.get()).mo75077d();
            kgVar.copyOnWrite();
            C60092kl klVar = (C60092kl) kgVar.instance;
            klVar.f162481a |= 256;
            klVar.f162490j = d;
        }
        mo89805f(C60091kk.HOTWORD_RECOGNIZED_FIRST_STAGE, (C60057jf) null, kgVar, str);
    }

    /* renamed from: d */
    public final void mo89803d() {
        mo89805f(C60091kk.HOTWORD_TIMEOUT_CACHING, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
    }

    /* renamed from: e */
    public final void mo89804e(C60091kk kkVar, C60089ki kiVar) {
        if (kkVar == C60091kk.HOTWORD_RECOGNIZED_FIRST_STAGE) {
            C59104x d = f268361d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoHotwordLogger");
            ((C59052c) ((C59052c) d).mo56372aa(15466)).mo56386p("sendClearcutLog called to log a 1st stage event");
            int i = C90755l.f253831a;
        }
        C60087kg kgVar = (C60087kg) C60092kl.f162479k.createBuilder();
        if (kiVar != null) {
            kgVar.copyOnWrite();
            C60092kl klVar = (C60092kl) kgVar.instance;
            klVar.f162487g = kiVar;
            klVar.f162481a |= 32;
        }
        if (kkVar == C60091kk.HOTWORD_RECOGNIZED_SECOND_STAGE) {
            long b = this.f268370j.mo26870b();
            long j = this.f268364c;
            kgVar.copyOnWrite();
            C60092kl klVar2 = (C60092kl) kgVar.instance;
            klVar2.f162481a |= 64;
            klVar2.f162488h = (int) (b - j);
        }
        mo89805f(kkVar, (C60057jf) null, kgVar, (String) null);
    }

    /* renamed from: f */
    public final void mo89805f(C60091kk kkVar, C60057jf jfVar, C60087kg kgVar, String str) {
        C60091kk kkVar2;
        C59071e eVar = f268361d;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordLogger");
        ((C59052c) ((C59052c) b).mo56372aa(15467)).mo56354G("Logging Hotword Event: %s %s", kkVar.name(), this.f268367g);
        long b2 = this.f268370j.mo26870b();
        kgVar.copyOnWrite();
        C60092kl klVar = (C60092kl) kgVar.instance;
        C60092kl klVar2 = C60092kl.f162479k;
        klVar.f162483c = kkVar.f162478s;
        klVar.f162481a |= 2;
        kgVar.copyOnWrite();
        C60092kl klVar3 = (C60092kl) kgVar.instance;
        klVar3.f162481a |= 4;
        klVar3.f162484d = b2;
        String str2 = this.f268367g;
        if (str2 != null) {
            kgVar.copyOnWrite();
            C60092kl klVar4 = (C60092kl) kgVar.instance;
            klVar4.f162481a |= 1;
            klVar4.f162482b = str2;
        }
        C95831c cVar = (C95831c) this.f268366f.get(this.f268367g);
        if (!(cVar == null || (kkVar2 = cVar.f268360b) == kkVar)) {
            long j = b2 - cVar.f268359a;
            if (j <= 0) {
                String str3 = "Bad duration : " + kkVar2.name() + " " + kkVar.name() + " " + j;
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "BistoHotwordLogger");
                ((C59052c) ((C59052c) b3).mo56372aa(15470)).mo56389s("%s", str3);
                C89655j.m145959c("BistoHotwordLogger", str3);
            }
            synchronized (this) {
                if (kkVar == C60091kk.HOTWORD_VOICEINFO_RECEIVED || !this.f268369i.contains(kkVar)) {
                    this.f268369i.add(kkVar);
                } else {
                    C59104x c = eVar.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "BistoHotwordLogger");
                    ((C59052c) ((C59052c) c).mo56372aa(15469)).mo56354G("Duplicate value logged: %s %s", kkVar, kkVar);
                    return;
                }
            }
        }
        if (jfVar != null) {
            kgVar.copyOnWrite();
            C60092kl klVar5 = (C60092kl) kgVar.instance;
            C60059jh jhVar = (C60059jh) jfVar.build();
            jhVar.getClass();
            klVar5.f162485e = jhVar;
            klVar5.f162481a |= 8;
        }
        if (kkVar == C60091kk.HOTWORD_RECOGNIZED_FIRST_STAGE && str != null) {
            kgVar.copyOnWrite();
            C60092kl klVar6 = (C60092kl) kgVar.instance;
            klVar6.f162481a |= 16;
            klVar6.f162486f = str;
        }
        int i = this.f268371k;
        kgVar.copyOnWrite();
        C60092kl klVar7 = (C60092kl) kgVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            klVar7.f162489i = i2;
            klVar7.f162481a |= 128;
            this.f268366f.put(this.f268367g, new C95831c(b2, kkVar));
            C95307m mVar = this.f268365e;
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60092kl klVar8 = (C60092kl) kgVar.build();
            klVar8.getClass();
            nmVar.f163164r = klVar8;
            nmVar.f163147a |= 536870912;
            mVar.mo83545c(nkVar);
            return;
        }
        throw null;
    }

    /* renamed from: g */
    public final void mo89806g() {
        mo89805f(C60091kk.HOTWORD_TIMEOUT_CLOSED, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
    }

    /* renamed from: h */
    public final void mo89807h() {
        mo89805f(C60091kk.HOTWORD_ERROR_CLOSING, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
    }

    /* renamed from: i */
    public final void mo89808i() {
        mo89805f(C60091kk.HOTWORD_TIMEOUT_CLOSING, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
    }

    /* renamed from: j */
    public final void mo89809j(C60091kk kkVar) {
        C60057jf jfVar = (C60057jf) C60059jh.f162330g.createBuilder();
        jfVar.copyOnWrite();
        C60059jh jhVar = (C60059jh) jfVar.instance;
        jhVar.f162333b = 1;
        jhVar.f162332a = 1 | jhVar.f162332a;
        jfVar.copyOnWrite();
        C60059jh jhVar2 = (C60059jh) jfVar.instance;
        jhVar2.f162332a |= 2;
        jhVar2.f162334c = 16000;
        jfVar.copyOnWrite();
        C60059jh jhVar3 = (C60059jh) jfVar.instance;
        jhVar3.f162332a |= 4;
        jhVar3.f162335d = 24;
        int i = this.f268363b;
        jfVar.copyOnWrite();
        C60059jh jhVar4 = (C60059jh) jfVar.instance;
        jhVar4.f162332a |= 16;
        jhVar4.f162337f = i;
        C59104x b = f268361d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordLogger");
        ((C59052c) ((C59052c) b).mo56372aa(15471)).mo56394x("AudioLength of zero size Data:%d, Len:%d", this.f268363b, 0);
        jfVar.copyOnWrite();
        C60059jh jhVar5 = (C60059jh) jfVar.instance;
        jhVar5.f162332a |= 8;
        jhVar5.f162336e = 0;
        mo89805f(kkVar, jfVar, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
    }

    /* renamed from: k */
    public final void mo89810k() {
        mo89805f(C60091kk.HOTWORD_FRAMEWORK_EXCEPTION, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
    }

    /* renamed from: l */
    public final void mo89811l(C60089ki kiVar) {
        if (kiVar != null) {
            C59104x b = f268361d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoHotwordLogger");
            ((C59052c) ((C59052c) b).mo56372aa(15465)).mo56359L("Hotword Result: #logHotwordResultLevels  isSpeakerTriggered: %b  isSoftwareTriggered: %b  hotwordPowerRatio: %g ", Boolean.valueOf(kiVar.f162455e), Boolean.valueOf(kiVar.f162456f), Float.valueOf(kiVar.f162452b));
        }
        mo89804e(C60091kk.HOTWORD_SECOND_STAGE_NOT_DETECTED, kiVar);
    }

    /* renamed from: m */
    public final void mo89812m() {
        mo89805f(C60091kk.HOTWORD_ERROR_OPENING, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
    }

    /* renamed from: n */
    public final void mo89813n() {
        mo89805f(C60091kk.HOTWORD_TIMEOUT_OPENING, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
    }
}
