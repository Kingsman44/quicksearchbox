package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67096kx;
import com.google.speech.p5218j.C67098kz;
import com.google.speech.p5218j.C67100la;
import com.google.speech.p5218j.C67101lb;
import com.google.speech.p5218j.C67103ld;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.bb */
/* compiled from: PG */
public final class C120862bb {

    /* renamed from: a */
    public final C120816a f336065a;

    /* renamed from: b */
    public Optional f336066b = Optional.empty();

    public C120862bb(C120816a aVar) {
        this.f336065a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104953a(Duration duration, Duration duration2, C67098kz kzVar) {
        C120816a aVar = this.f336065a;
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

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo104954b(C67087ko koVar) {
        if (this.f336066b.isPresent()) {
            C67086kn knVar = (C67086kn) koVar.toBuilder();
            C67050je jeVar = (C67050je) this.f336066b.get();
            knVar.copyOnWrite();
            C67087ko koVar2 = (C67087ko) knVar.instance;
            jeVar.getClass();
            koVar2.f182369b = jeVar;
            koVar2.f182368a |= 1;
            koVar = (C67087ko) knVar.build();
        }
        this.f336065a.mo104868a(koVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo104955c(int i) {
        C120816a aVar = this.f336065a;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C62940bt btVar = C67103ld.f182429d;
        C67101lb lbVar = (C67101lb) C67103ld.f182428c.createBuilder();
        lbVar.copyOnWrite();
        C67103ld ldVar = (C67103ld) lbVar.instance;
        ldVar.f182432b = i - 1;
        ldVar.f182431a |= 1;
        knVar.mo58885m(btVar, (C67103ld) lbVar.build());
        aVar.mo104868a((C67087ko) knVar.build());
    }
}
