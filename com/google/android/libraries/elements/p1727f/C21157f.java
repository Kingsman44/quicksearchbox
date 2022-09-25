package com.google.android.libraries.elements.p1727f;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.p5166b.C66089aw;
import com.google.protos.youtube.elements.p5166b.C66090ax;
import com.google.protos.youtube.elements.p5166b.C66096bc;
import com.google.protos.youtube.elements.p5166b.C66097bd;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.f.f */
/* compiled from: PG */
final class C21157f extends FaultObserver {

    /* renamed from: a */
    final /* synthetic */ C21160i f59343a;

    public C21157f(C21160i iVar) {
        this.f59343a = iVar;
    }

    public final Status storeDidFault(ByteStore byteStore, String str) {
        C21160i iVar = this.f59343a;
        C66096bc bcVar = (C66096bc) C66097bd.f179735e.createBuilder();
        C63042fg d = C21168q.m39750d();
        bcVar.copyOnWrite();
        C66097bd bdVar = (C66097bd) bcVar.instance;
        d.getClass();
        bdVar.f179740d = d;
        bdVar.f179737a |= 1;
        C66089aw awVar = (C66089aw) C66090ax.f179714c.createBuilder();
        awVar.copyOnWrite();
        C66090ax axVar = (C66090ax) awVar.instance;
        str.getClass();
        axVar.f179716a |= 1;
        axVar.f179717b = str;
        C66090ax axVar2 = (C66090ax) awVar.build();
        bcVar.copyOnWrite();
        C66097bd bdVar2 = (C66097bd) bcVar.instance;
        axVar2.getClass();
        bdVar2.f179739c = axVar2;
        bdVar2.f179738b = 8;
        ((DebuggerClient) iVar.f59351c.mo17428b()).sendTimelineEvent(((C66097bd) bcVar.build()).toByteArray());
        return Status.f186902OK;
    }
}
