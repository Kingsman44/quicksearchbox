package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21315v;
import com.google.android.libraries.elements.interfaces.C21317x;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.google.protos.youtube.elements.p5166b.C66079am;
import com.google.protos.youtube.elements.p5166b.C66080an;
import com.google.protos.youtube.elements.p5166b.C66086at;
import com.google.protos.youtube.elements.p5166b.C66096bc;
import com.google.protos.youtube.elements.p5166b.C66097bd;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5497e.p5499b.C69840i;

/* renamed from: com.google.android.libraries.elements.d.e.a.o */
/* compiled from: PG */
public final class C20983o {

    /* renamed from: a */
    public final C69464a f58815a;

    /* renamed from: b */
    private final C21315v f58816b;

    public C20983o(C69464a aVar, C21315v vVar) {
        this.f58815a = aVar;
        this.f58816b = vVar;
    }

    /* renamed from: a */
    public final C69794a mo26094a(C69794a aVar, CommandOuterClass$Command commandOuterClass$Command, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, C66086at atVar, C62917ay ayVar) {
        C21315v vVar = this.f58816b;
        C21317x xVar = null;
        if (vVar.mo26837b() && ayVar != null) {
            xVar = vVar.mo26836a(ayVar.mo58810a());
        }
        C69794a d = aVar.mo61450e(new C20980l(this, commandOuterClass$Command, senderStateOuterClass$SenderState, atVar)).mo61449d(new C20981m(this, atVar, xVar));
        C20982n nVar = new C20982n(this, atVar, xVar);
        C69821c cVar = C69840i.f186211d;
        return d.mo61455m(cVar, cVar, nVar);
    }

    /* renamed from: b */
    public final void mo26095b(C66086at atVar, C21317x xVar, Throwable th) {
        if (xVar != null) {
            xVar.mo26838a(th != null);
        }
        if (atVar != null) {
            C66079am amVar = (C66079am) C66080an.f179691c.createBuilder();
            amVar.copyOnWrite();
            C66080an anVar = (C66080an) amVar.instance;
            anVar.f179694b = atVar;
            anVar.f179693a |= 1;
            C66080an anVar2 = (C66080an) amVar.build();
            C66096bc bcVar = (C66096bc) C66097bd.f179735e.createBuilder();
            C63042fg d = C21168q.m39750d();
            bcVar.copyOnWrite();
            C66097bd bdVar = (C66097bd) bcVar.instance;
            d.getClass();
            bdVar.f179740d = d;
            bdVar.f179737a = 1 | bdVar.f179737a;
            bcVar.copyOnWrite();
            C66097bd bdVar2 = (C66097bd) bcVar.instance;
            anVar2.getClass();
            bdVar2.f179739c = anVar2;
            bdVar2.f179738b = 5;
            ((DebuggerClient) this.f58815a.mo17428b()).sendTimelineEvent(((C66097bd) bcVar.build()).toByteArray());
        }
    }
}
