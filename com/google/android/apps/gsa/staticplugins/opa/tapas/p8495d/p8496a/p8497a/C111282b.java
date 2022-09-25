package com.google.android.apps.gsa.staticplugins.opa.tapas.p8495d.p8496a.p8497a;

import com.google.android.libraries.assistant.p1594s.p1599c.C19205g;
import com.google.android.libraries.assistant.p1594s.p1599c.C19206h;
import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19217a;
import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19220d;
import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19223g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.d.a.a.b */
/* compiled from: PG */
final class C111282b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C19205g f309674a;

    /* renamed from: b */
    final /* synthetic */ int f309675b;

    /* renamed from: c */
    final /* synthetic */ AtomicInteger f309676c;

    /* renamed from: d */
    final /* synthetic */ C111283c f309677d;

    public C111282b(C111283c cVar, C19205g gVar, int i, AtomicInteger atomicInteger) {
        this.f309677d = cVar;
        this.f309674a = gVar;
        this.f309675b = i;
        this.f309676c = atomicInteger;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo99100c() {
        C19217a aVar = (C19217a) C19220d.f53813c.createBuilder();
        aVar.copyOnWrite();
        C19220d dVar = (C19220d) aVar.instance;
        dVar.f53816b = 5;
        dVar.f53815a |= 1;
        aVar.mo58885m(C19223g.f53823a, (C19206h) this.f309674a.build());
        this.f309677d.f309680b.mo24293a((C19220d) aVar.build());
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C111283c.f309678a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AIEngineMdd");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(27363)).mo56386p("#process: filegroupfutures fail");
        if (this.f309676c.incrementAndGet() == this.f309675b) {
            mo99100c();
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (C111283c.m185050c(this.f309674a, (List) obj, this.f309675b, this.f309676c)) {
            mo99100c();
        }
    }
}
