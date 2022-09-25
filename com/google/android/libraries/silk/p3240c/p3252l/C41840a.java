package com.google.android.libraries.silk.p3240c.p3252l;

import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.silk.event.C41894b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4317v.C56824a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4317v.C56825b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4317v.C56829f;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4335l.C56910b;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.C66216ec;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.android.libraries.silk.c.l.a */
/* compiled from: PG */
public final /* synthetic */ class C41840a implements C41894b {

    /* renamed from: a */
    public final /* synthetic */ C41845f f109218a;

    /* renamed from: b */
    public final /* synthetic */ C56910b f109219b;

    public /* synthetic */ C41840a(C41845f fVar, C56910b bVar) {
        this.f109218a = fVar;
        this.f109219b = bVar;
    }

    /* renamed from: a */
    public final void mo42922a(MessageLite messageLite) {
        C41845f fVar = this.f109218a;
        C56910b bVar = this.f109219b;
        C56824a aVar = (C56824a) C56825b.f151617c.createBuilder();
        aVar.copyOnWrite();
        C56825b bVar2 = (C56825b) aVar.instance;
        messageLite.getClass();
        bVar2.f151621b = (C56829f) messageLite;
        bVar2.f151620a |= 1;
        C66216ec ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
        ecVar.mo58885m(C56825b.f151618d, (C56825b) aVar.build());
        C21309p k = C21311r.m40252k();
        ((C21230a) k).f59563d = (SenderStateOuterClass$SenderState) ecVar.build();
        C21311r a = k.mo26698a();
        C21313t a2 = fVar.f109227a.mo42396a();
        CommandOuterClass$Command commandOuterClass$Command = bVar.f151882b;
        if (commandOuterClass$Command == null) {
            commandOuterClass$Command = CommandOuterClass$Command.f179510a;
        }
        a2.mo26125b(commandOuterClass$Command, a, 1).mo61453k();
    }
}
