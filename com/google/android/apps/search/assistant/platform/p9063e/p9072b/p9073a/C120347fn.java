package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.common.base.C58817ah;
import com.google.speech.p5218j.C67063jr;
import com.google.speech.p5218j.C67064js;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.fn */
/* compiled from: PG */
public final /* synthetic */ class C120347fn implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C120260cr f334832a;

    public /* synthetic */ C120347fn(C120260cr crVar) {
        this.f334832a = crVar;
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        C120816a aVar = this.f334832a.f334627c;
        long nanos = optional.isPresent() ? ((Duration) optional.get()).toNanos() / 1000 : 0;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C67063jr jrVar = (C67063jr) C67064js.f182298c.createBuilder();
        jrVar.copyOnWrite();
        C67064js jsVar = (C67064js) jrVar.instance;
        jsVar.f182300a = 1;
        jsVar.f182301b = Long.valueOf(nanos);
        knVar.copyOnWrite();
        C67087ko koVar = (C67087ko) knVar.instance;
        C67064js jsVar2 = (C67064js) jrVar.build();
        jsVar2.getClass();
        koVar.f182377j = jsVar2;
        koVar.f182368a |= 16384;
        aVar.mo104868a((C67087ko) knVar.build());
        return null;
    }
}
