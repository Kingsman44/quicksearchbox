package com.google.android.apps.gsa.staticplugins.bisto;

import com.google.android.apps.gsa.shared.bisto.C89603aa;
import com.google.android.apps.gsa.shared.bisto.C89605ac;
import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.C89686y;
import com.google.android.apps.gsa.shared.bisto.C89687z;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95298d;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60273mn;
import com.google.common.p4552o.C60275mp;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.i */
/* compiled from: PG */
public final class C95458i implements C89606ad {

    /* renamed from: k */
    private static final C59071e f267109k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.i");

    /* renamed from: a */
    public final Set f267110a = C58758qx.m90653k();

    /* renamed from: b */
    public final AtomicBoolean f267111b = new AtomicBoolean(false);

    /* renamed from: c */
    public final AtomicBoolean f267112c = new AtomicBoolean(false);

    /* renamed from: d */
    public final Set f267113d = C58758qx.m90653k();

    /* renamed from: e */
    public final Set f267114e = C58758qx.m90653k();

    /* renamed from: f */
    public final Set f267115f = C58758qx.m90653k();

    /* renamed from: g */
    public final Set f267116g = C58758qx.m90653k();

    /* renamed from: h */
    public final C22871g f267117h;

    /* renamed from: i */
    public Optional f267118i = Optional.empty();

    /* renamed from: j */
    public String f267119j;

    /* renamed from: l */
    private final AtomicReference f267120l = new AtomicReference();

    /* renamed from: m */
    private final AtomicReference f267121m = new AtomicReference();

    /* renamed from: n */
    private final AtomicReference f267122n = new AtomicReference();

    /* renamed from: o */
    private final AtomicBoolean f267123o = new AtomicBoolean(false);

    /* renamed from: p */
    private final AtomicReference f267124p = new AtomicReference();

    /* renamed from: q */
    private final AtomicBoolean f267125q = new AtomicBoolean(false);

    /* renamed from: r */
    private final AtomicBoolean f267126r = new AtomicBoolean(false);

    /* renamed from: s */
    private final AtomicBoolean f267127s = new AtomicBoolean(false);

    /* renamed from: t */
    private final Set f267128t = C58758qx.m90653k();

    public C95458i(C22871g gVar) {
        this.f267117h = gVar;
    }

    /* renamed from: F */
    private final void m157883F(String str) {
        if (this.f267110a.contains(str)) {
            this.f267110a.remove(str);
            if (this.f267127s.compareAndSet(true, false)) {
                Collection.EL.stream(this.f267128t).forEach(C95170b.f266271a);
            }
        }
    }

    /* renamed from: A */
    public final byte[] mo83454A() {
        byte[] bArr = (byte[]) this.f267120l.get();
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14520)).mo56387q("hotwordModel: %d bytes", bArr != null ? bArr.length : 0);
        return bArr;
    }

    /* renamed from: B */
    public final void mo89373B(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (str.equals(this.f267119j)) {
            this.f267119j = null;
        }
    }

    /* renamed from: C */
    public final void mo89374C() {
        this.f267111b.set(false);
        this.f267118i = Optional.empty();
    }

    /* renamed from: D */
    public final void mo89375D() {
        if (this.f267118i.isPresent()) {
            C95454h hVar = (C95454h) this.f267118i.get();
            C95298d a = hVar.mo88562a();
            C124548d b = hVar.mo88563b();
            C59104x b2 = C95298d.f266642a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "L1ArbitrationLogger");
            ((C59052c) ((C59052c) b2).mo56372aa(14846)).mo56386p("Phone cancellation is logged");
            C95307m mVar = a.f266643b;
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            C60273mn mnVar = (C60273mn) C60275mp.f163069f.createBuilder();
            long b3 = a.f266644c.mo26870b();
            mnVar.copyOnWrite();
            C60275mp mpVar = (C60275mp) mnVar.instance;
            mpVar.f163071a |= 1;
            mpVar.f163072b = b3;
            mnVar.copyOnWrite();
            C60275mp mpVar2 = (C60275mp) mnVar.instance;
            mpVar2.f163073c = 1;
            mpVar2.f163071a |= 2;
            mnVar.copyOnWrite();
            C60275mp mpVar3 = (C60275mp) mnVar.instance;
            mpVar3.f163074d = 3;
            mpVar3.f163071a |= 4;
            mnVar.copyOnWrite();
            C60275mp mpVar4 = (C60275mp) mnVar.instance;
            mpVar4.f163075e = 2;
            mpVar4.f163071a |= 8;
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60275mp mpVar5 = (C60275mp) mnVar.build();
            mpVar5.getClass();
            nmVar.f163146G = mpVar5;
            nmVar.f163148b |= 65536;
            mVar.mo89244i(nkVar, C95298d.m157539a(b));
            return;
        }
        C59104x c = f267109k.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) c).mo56372aa(14503)).mo56386p("unable to log phone cancellation");
    }

    /* renamed from: E */
    public final void mo89376E(String str, boolean z, boolean z2) {
        if (!z2) {
            m157883F(str);
        } else if (!z) {
            m157883F(str);
        } else {
            this.f267110a.add(str);
            if (this.f267127s.compareAndSet(false, true)) {
                Collection.EL.stream(this.f267128t).forEach(C95251d.f266494a);
            }
        }
    }

    /* renamed from: a */
    public final SpeakerIdModel mo83455a() {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14495)).mo56389s("speakerIdModel: %b", Boolean.valueOf(this.f267122n.get() != null));
        return (SpeakerIdModel) this.f267122n.get();
    }

    /* renamed from: b */
    public final String mo83456b() {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14496)).mo56389s("HotwordModelType: %s", this.f267121m.get());
        return (String) this.f267121m.get();
    }

    /* renamed from: c */
    public final String mo83457c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f267124p.get();
        return (String) this.f267124p.get();
    }

    /* renamed from: d */
    public final void mo83458d() {
        if (this.f267118i.isPresent()) {
            C95454h hVar = (C95454h) this.f267118i.get();
            C95298d a = hVar.mo88562a();
            C124548d b = hVar.mo88563b();
            C59104x b2 = C95298d.f266642a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "L1ArbitrationLogger");
            ((C59052c) ((C59052c) b2).mo56372aa(14845)).mo56386p("headset hotword suppressed");
            C95307m mVar = a.f266643b;
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            C60273mn mnVar = (C60273mn) C60275mp.f163069f.createBuilder();
            long b3 = a.f266644c.mo26870b();
            mnVar.copyOnWrite();
            C60275mp mpVar = (C60275mp) mnVar.instance;
            mpVar.f163071a |= 1;
            mpVar.f163072b = b3;
            mnVar.copyOnWrite();
            C60275mp mpVar2 = (C60275mp) mnVar.instance;
            mpVar2.f163073c = 2;
            mpVar2.f163071a = 2 | mpVar2.f163071a;
            mnVar.copyOnWrite();
            C60275mp mpVar3 = (C60275mp) mnVar.instance;
            mpVar3.f163074d = 3;
            mpVar3.f163071a |= 4;
            mnVar.copyOnWrite();
            C60275mp mpVar4 = (C60275mp) mnVar.instance;
            mpVar4.f163075e = 1;
            mpVar4.f163071a |= 8;
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60275mp mpVar5 = (C60275mp) mnVar.build();
            mpVar5.getClass();
            nmVar.f163146G = mpVar5;
            nmVar.f163148b |= 65536;
            mVar.mo89244i(nkVar, C95298d.m157539a(b));
            return;
        }
        C59104x c = f267109k.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) c).mo56372aa(14502)).mo56386p("unable to log headset suppression");
    }

    /* renamed from: e */
    public final void mo83459e() {
        if (this.f267118i.isPresent()) {
            C95454h hVar = (C95454h) this.f267118i.get();
            C95298d a = hVar.mo88562a();
            C124548d b = hVar.mo88563b();
            C59104x b2 = C95298d.f266642a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "L1ArbitrationLogger");
            ((C59052c) ((C59052c) b2).mo56372aa(14847)).mo56386p("phone hotword suppressed");
            C95307m mVar = a.f266643b;
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            C60273mn mnVar = (C60273mn) C60275mp.f163069f.createBuilder();
            long b3 = a.f266644c.mo26870b();
            mnVar.copyOnWrite();
            C60275mp mpVar = (C60275mp) mnVar.instance;
            mpVar.f163071a |= 1;
            mpVar.f163072b = b3;
            mnVar.copyOnWrite();
            C60275mp mpVar2 = (C60275mp) mnVar.instance;
            mpVar2.f163073c = 1;
            mpVar2.f163071a |= 2;
            mnVar.copyOnWrite();
            C60275mp mpVar3 = (C60275mp) mnVar.instance;
            mpVar3.f163074d = 3;
            mpVar3.f163071a |= 4;
            mnVar.copyOnWrite();
            C60275mp mpVar4 = (C60275mp) mnVar.instance;
            mpVar4.f163075e = 1;
            mpVar4.f163071a |= 8;
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60275mp mpVar5 = (C60275mp) mnVar.build();
            mpVar5.getClass();
            nmVar.f163146G = mpVar5;
            nmVar.f163148b |= 65536;
            mVar.mo89244i(nkVar, C95298d.m157539a(b));
            return;
        }
        C59104x c = f267109k.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) c).mo56372aa(14504)).mo56386p("unable to log phone suppression");
    }

    /* renamed from: f */
    public final void mo83460f(C89603aa aaVar) {
        this.f267114e.add(aaVar);
    }

    /* renamed from: g */
    public final void mo83461g(C89686y yVar) {
        this.f267128t.add(yVar);
    }

    /* renamed from: h */
    public final void mo83462h(C89687z zVar) {
        this.f267113d.add(zVar);
    }

    /* renamed from: i */
    public final void mo83463i(C89605ac acVar) {
        this.f267115f.add(acVar);
    }

    /* renamed from: j */
    public final void mo83464j(byte[] bArr) {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14508)).mo56387q("setting hotword model of size: %d bytes", bArr != null ? bArr.length : 0);
        this.f267120l.set(bArr);
    }

    /* renamed from: k */
    public final void mo83465k(String str) {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14509)).mo56389s("setting modeltype: %s", str);
        this.f267121m.set(str);
    }

    /* renamed from: l */
    public final void mo83466l(String str) {
        String str2 = (String) this.f267124p.get();
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14510)).mo56354G("setHotwordVoiceLocale: prev: %s, new: %s", str2, str);
        if (str2 == null || !str2.equals(str)) {
            this.f267124p.set(str);
            this.f267117h.mo28212l("notify-voice-locale-listeners", new C95212c(this));
        }
    }

    /* renamed from: m */
    public final void mo83467m(boolean z) {
        boolean z2 = this.f267112c.get();
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14511)).mo56358K("setSodaUsed: prev: %b, new: %b", z2, z);
        if (this.f267112c.getAndSet(z) != z) {
            this.f267117h.mo28212l("notify-use-soda-listeners", new C95287f(this));
        }
    }

    /* renamed from: n */
    public final void mo83468n(SpeakerIdModel speakerIdModel) {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14512)).mo56389s("setting speaker id present: %b", Boolean.valueOf(speakerIdModel != null));
        if (speakerIdModel == null || !speakerIdModel.f253284b.mo56113h()) {
            this.f267122n.set((Object) null);
            mo83469o(false);
        } else {
            this.f267122n.set(speakerIdModel);
            mo83469o(true);
        }
        this.f267117h.mo28212l("call-speakerid-callbacks", new C95321g(this));
    }

    /* renamed from: o */
    public final void mo83469o(boolean z) {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14513)).mo56389s("setting speaker ID model presence: %b", Boolean.valueOf(z));
        this.f267123o.set(z);
    }

    /* renamed from: p */
    public final void mo83470p(boolean z) {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14514)).mo56389s("setting VM enrollment allowed: %b", Boolean.valueOf(z));
        this.f267126r.set(z);
    }

    /* renamed from: q */
    public final void mo83471q(boolean z) {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14515)).mo56389s("setting VM enrollment status: %b", Boolean.valueOf(z));
        this.f267125q.set(z);
    }

    /* renamed from: r */
    public final void mo83472r(C89603aa aaVar) {
        this.f267114e.remove(aaVar);
    }

    /* renamed from: s */
    public final void mo83473s(C89686y yVar) {
        this.f267128t.remove(yVar);
    }

    /* renamed from: t */
    public final void mo83474t(C89687z zVar) {
        this.f267113d.remove(zVar);
    }

    /* renamed from: u */
    public final void mo83475u(C89605ac acVar) {
        this.f267115f.remove(acVar);
    }

    /* renamed from: v */
    public final boolean mo83476v() {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14516)).mo56359L("getHotwordActive::active query: %s, watch: %s, devices connected: %s", this.f267119j, Boolean.valueOf(this.f267111b.get()), this.f267110a);
        if (!"wired".equals(this.f267119j) && !this.f267111b.get() && this.f267110a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean mo83477w() {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14517)).mo56389s("VM enrollment allowed: %b", Boolean.valueOf(this.f267126r.get()));
        return this.f267126r.get();
    }

    /* renamed from: x */
    public final boolean mo83478x() {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14518)).mo56389s("VM enrollment status: %b", Boolean.valueOf(this.f267125q.get()));
        return this.f267125q.get();
    }

    /* renamed from: y */
    public final boolean mo83479y() {
        return this.f267111b.get();
    }

    /* renamed from: z */
    public final boolean mo83480z() {
        C59104x b = f267109k.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHotwordHelper");
        ((C59052c) ((C59052c) b).mo56372aa(14519)).mo56389s("speaker ID model presence: %s", Boolean.valueOf(this.f267123o.get()));
        return this.f267123o.get();
    }
}
