package com.google.android.libraries.elements.p1714d.p1719e;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.CommandHandlerResolver;
import com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1721a.C20935b;
import com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1721a.C20936c;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import p3186j$.util.Optional;
import p5488io.p5490b.C69807c;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.libraries.elements.d.e.i */
/* compiled from: PG */
public final /* synthetic */ class C21047i implements C69807c {

    /* renamed from: a */
    public final /* synthetic */ C20935b f58962a;

    /* renamed from: b */
    public final /* synthetic */ CommandOuterClass$Command f58963b;

    /* renamed from: c */
    public final /* synthetic */ C21311r f58964c;

    public /* synthetic */ C21047i(C20935b bVar, CommandOuterClass$Command commandOuterClass$Command, C21311r rVar) {
        this.f58962a = bVar;
        this.f58963b = commandOuterClass$Command;
        this.f58964c = rVar;
    }

    /* renamed from: a */
    public final void mo25806a(C69872g gVar) {
        C20935b bVar = this.f58962a;
        CommandOuterClass$Command commandOuterClass$Command = this.f58963b;
        C21311r rVar = this.f58964c;
        C21048j jVar = new C21048j(gVar);
        if ((rVar != null ? rVar.mo26739h() : null) == null) {
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.f179521a;
        }
        if (rVar == null) {
            rVar = C21311r.m40252k().mo26698a();
        }
        if (!Optional.ofNullable(((CommandHandlerResolver) bVar.f58707a.mo6453a()).handleCommand(commandOuterClass$Command, new C20936c((ByteStore) bVar.f58708b.mo17428b(), rVar), jVar)).isPresent()) {
            gVar.mo61501b(new IllegalArgumentException("Unsupported command: ".concat(String.valueOf(String.valueOf(commandOuterClass$Command)))));
        }
    }
}
