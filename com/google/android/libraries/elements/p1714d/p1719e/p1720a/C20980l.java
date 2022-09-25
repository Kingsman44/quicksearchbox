package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.google.protos.youtube.elements.p5166b.C66081ao;
import com.google.protos.youtube.elements.p5166b.C66082ap;
import com.google.protos.youtube.elements.p5166b.C66086at;
import com.google.protos.youtube.elements.p5166b.C66096bc;
import com.google.protos.youtube.elements.p5166b.C66097bd;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.libraries.elements.d.e.a.l */
/* compiled from: PG */
public final /* synthetic */ class C20980l implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C20983o f58805a;

    /* renamed from: b */
    public final /* synthetic */ CommandOuterClass$Command f58806b;

    /* renamed from: c */
    public final /* synthetic */ SenderStateOuterClass$SenderState f58807c;

    /* renamed from: d */
    public final /* synthetic */ C66086at f58808d;

    public /* synthetic */ C20980l(C20983o oVar, CommandOuterClass$Command commandOuterClass$Command, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, C66086at atVar) {
        this.f58805a = oVar;
        this.f58806b = commandOuterClass$Command;
        this.f58807c = senderStateOuterClass$SenderState;
        this.f58808d = atVar;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        C20983o oVar = this.f58805a;
        CommandOuterClass$Command commandOuterClass$Command = this.f58806b;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.f58807c;
        C66086at atVar = this.f58808d;
        C69803b bVar = (C69803b) obj;
        if (atVar != null) {
            C66081ao aoVar = (C66081ao) C66082ap.f179695e.createBuilder();
            aoVar.copyOnWrite();
            C66082ap apVar = (C66082ap) aoVar.instance;
            commandOuterClass$Command.getClass();
            apVar.f179699c = commandOuterClass$Command;
            apVar.f179697a |= 2;
            if (senderStateOuterClass$SenderState == null) {
                senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.f179521a;
            }
            aoVar.copyOnWrite();
            C66082ap apVar2 = (C66082ap) aoVar.instance;
            senderStateOuterClass$SenderState.getClass();
            apVar2.f179700d = senderStateOuterClass$SenderState;
            apVar2.f179697a |= 4;
            aoVar.copyOnWrite();
            C66082ap apVar3 = (C66082ap) aoVar.instance;
            apVar3.f179698b = atVar;
            apVar3.f179697a |= 1;
            C66082ap apVar4 = (C66082ap) aoVar.build();
            C66096bc bcVar = (C66096bc) C66097bd.f179735e.createBuilder();
            C63042fg d = C21168q.m39750d();
            bcVar.copyOnWrite();
            C66097bd bdVar = (C66097bd) bcVar.instance;
            d.getClass();
            bdVar.f179740d = d;
            bdVar.f179737a |= 1;
            bcVar.copyOnWrite();
            C66097bd bdVar2 = (C66097bd) bcVar.instance;
            apVar4.getClass();
            bdVar2.f179739c = apVar4;
            bdVar2.f179738b = 4;
            ((DebuggerClient) oVar.f58815a.mo17428b()).sendTimelineEvent(((C66097bd) bcVar.build()).toByteArray());
        }
    }
}
