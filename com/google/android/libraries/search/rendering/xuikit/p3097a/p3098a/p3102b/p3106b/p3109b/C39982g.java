package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3109b;

import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.search.video.players.C41591v;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4393a.p4394a.p4395a.C57699c;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4402b.C57733i;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4402b.C57734j;
import com.google.protos.youtube.elements.C66216ec;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.b.g */
/* compiled from: PG */
final class C39982g implements C41591v {

    /* renamed from: a */
    private final C21313t f105102a;

    /* renamed from: b */
    private final CommandOuterClass$Command f105103b;

    /* renamed from: c */
    private final C21319z f105104c;

    public C39982g(C21313t tVar, C21319z zVar, CommandOuterClass$Command commandOuterClass$Command) {
        this.f105102a = tVar;
        this.f105104c = zVar;
        this.f105103b = commandOuterClass$Command;
    }

    /* renamed from: a */
    public final void mo42106a(C41592w wVar, int i, int i2) {
        C21313t tVar = this.f105102a;
        CommandOuterClass$Command commandOuterClass$Command = this.f105103b;
        C57699c a = C39979d.m69457a(wVar);
        C21319z zVar = this.f105104c;
        C21309p k = C21311r.m40252k();
        k.mo26700c(zVar);
        C57733i iVar = (C57733i) C57734j.f154240c.createBuilder();
        iVar.copyOnWrite();
        C57734j jVar = (C57734j) iVar.instance;
        a.getClass();
        jVar.f154244b = a;
        jVar.f154243a |= 1;
        C66216ec ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
        ecVar.mo58885m(C57734j.f154241d, (C57734j) iVar.build());
        ((C21230a) k).f59563d = (SenderStateOuterClass$SenderState) ecVar.build();
        tVar.mo26124a(commandOuterClass$Command, k.mo26698a()).mo61453k();
    }
}
