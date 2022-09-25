package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C67035iq;
import com.google.speech.p5218j.C67037is;
import com.google.speech.p5218j.C67038it;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67096kx;
import com.google.speech.p5218j.C67098kz;
import com.google.speech.p5218j.C67100la;
import com.google.speech.p5218j.C67101lb;
import com.google.speech.p5218j.C67103ld;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.cr */
/* compiled from: PG */
public final class C120260cr {

    /* renamed from: a */
    public static final C67087ko f334625a;

    /* renamed from: b */
    public static final C67087ko f334626b;

    /* renamed from: c */
    public final C120816a f334627c;

    /* renamed from: d */
    public final AtomicBoolean f334628d = new AtomicBoolean(false);

    static {
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C67035iq iqVar = (C67035iq) C67038it.f182220d.createBuilder();
        C67037is isVar = C67037is.START_OF_SPEECH;
        iqVar.copyOnWrite();
        C67038it itVar = (C67038it) iqVar.instance;
        itVar.f182223b = isVar.f182219e;
        itVar.f182222a |= 1;
        knVar.copyOnWrite();
        C67087ko koVar = (C67087ko) knVar.instance;
        C67038it itVar2 = (C67038it) iqVar.build();
        itVar2.getClass();
        koVar.f182372e = itVar2;
        koVar.f182368a |= 8;
        f334625a = (C67087ko) knVar.build();
        C67086kn knVar2 = (C67086kn) C67087ko.f182366n.createBuilder();
        C67035iq iqVar2 = (C67035iq) C67038it.f182220d.createBuilder();
        C67037is isVar2 = C67037is.END_OF_SPEECH;
        iqVar2.copyOnWrite();
        C67038it itVar3 = (C67038it) iqVar2.instance;
        itVar3.f182223b = isVar2.f182219e;
        itVar3.f182222a |= 1;
        knVar2.copyOnWrite();
        C67087ko koVar2 = (C67087ko) knVar2.instance;
        C67038it itVar4 = (C67038it) iqVar2.build();
        itVar4.getClass();
        koVar2.f182372e = itVar4;
        koVar2.f182368a |= 8;
        f334626b = (C67087ko) knVar2.build();
    }

    public C120260cr(C120816a aVar) {
        this.f334627c = aVar;
    }

    /* renamed from: a */
    public final void mo104714a(Duration duration, Duration duration2, C67098kz kzVar) {
        C120816a aVar = this.f334627c;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C62940bt btVar = C67100la.f182421f;
        C67096kx kxVar = (C67096kx) C67100la.f182420e.createBuilder();
        long millis = duration.toMillis();
        kxVar.copyOnWrite();
        C67100la laVar = (C67100la) kxVar.instance;
        laVar.f182423a |= 1;
        laVar.f182424b = millis;
        long millis2 = duration2.toMillis();
        kxVar.copyOnWrite();
        C67100la laVar2 = (C67100la) kxVar.instance;
        laVar2.f182423a |= 4;
        laVar2.f182426d = millis2;
        kxVar.copyOnWrite();
        C67100la laVar3 = (C67100la) kxVar.instance;
        laVar3.f182425c = kzVar.f182418h;
        laVar3.f182423a |= 2;
        knVar.mo58885m(btVar, (C67100la) kxVar.build());
        aVar.mo104868a((C67087ko) knVar.build());
    }

    /* renamed from: b */
    public final void mo104715b(int i) {
        if (!this.f334628d.getAndSet(true)) {
            C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
            C62940bt btVar = C67103ld.f182429d;
            C67101lb lbVar = (C67101lb) C67103ld.f182428c.createBuilder();
            lbVar.copyOnWrite();
            C67103ld ldVar = (C67103ld) lbVar.instance;
            ldVar.f182432b = 0;
            ldVar.f182431a = 1 | ldVar.f182431a;
            knVar.mo58885m(btVar, (C67103ld) lbVar.build());
            this.f334627c.mo104868a((C67087ko) knVar.build());
        }
    }
}
