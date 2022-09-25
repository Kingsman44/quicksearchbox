package com.google.android.libraries.assistant.gallium.framework;

import com.google.protobuf.C62940bt;
import com.google.protos.p5127o.C65668aw;
import com.google.protos.p5127o.C65669ax;
import com.google.protos.p5127o.C65694t;
import com.google.protos.p5127o.C65695u;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.f */
/* compiled from: PG */
public final class C18238f {

    /* renamed from: a */
    public final C65694t f51797a = ((C65694t) C65695u.f178492a.createBuilder());

    /* renamed from: a */
    public final C65695u mo23735a() {
        return (C65695u) this.f51797a.build();
    }

    /* renamed from: b */
    public final void mo23736b(C18217au auVar) {
        C65694t tVar = this.f51797a;
        C62940bt btVar = C65669ax.f178435d;
        C65668aw awVar = (C65668aw) C65669ax.f178434c.createBuilder();
        long a = auVar.mo23676a();
        awVar.copyOnWrite();
        C65669ax axVar = (C65669ax) awVar.instance;
        axVar.f178437a |= 1;
        axVar.f178438b = a;
        tVar.mo58885m(btVar, (C65669ax) awVar.build());
    }
}
