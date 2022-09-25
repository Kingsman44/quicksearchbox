package com.google.android.apps.search.assistant.platform.ondevice.p9263b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3989p.p3990a.C53041c;
import com.google.assistant.p3989p.p3990a.C53044f;
import com.google.assistant.p3989p.p3990a.C53045g;
import com.google.assistant.p3989p.p3990a.C53046h;
import com.google.assistant.p3989p.p3990a.C53047i;
import com.google.assistant.p3989p.p3990a.C53048j;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63088z;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.b.p */
/* compiled from: PG */
public final class C122135p {

    /* renamed from: a */
    public static final C58974d f338808a = C58974d.m91136j();

    /* renamed from: b */
    private final Executor f338809b;

    /* renamed from: c */
    private final Map f338810c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map f338811d = new ConcurrentHashMap();

    public C122135p(Executor executor) {
        this.f338809b = executor;
    }

    /* renamed from: c */
    private static int m201671c(String str, Map map) {
        return ((AtomicInteger) Map.EL.computeIfAbsent(map, str, C122132m.f338802a)).getAndIncrement();
    }

    /* renamed from: a */
    public final C53048j mo105543a(String str, int i) {
        C53047i iVar = (C53047i) C53048j.f139033e.createBuilder();
        iVar.copyOnWrite();
        C53048j jVar = (C53048j) iVar.instance;
        jVar.f139035a |= 8;
        jVar.f139038d = str;
        int c = m201671c(str, this.f338810c);
        iVar.copyOnWrite();
        C53048j jVar2 = (C53048j) iVar.instance;
        C62961ch chVar = jVar2.f139037c;
        if (!chVar.mo58948c()) {
            jVar2.f139037c = C62942bv.mutableCopy(chVar);
        }
        jVar2.f139037c.mo58916g(c);
        C53045g gVar = (C53045g) C53046h.f139029c.createBuilder();
        gVar.copyOnWrite();
        C53046h hVar = (C53046h) gVar.instance;
        hVar.f139031a |= 1;
        hVar.f139032b = i;
        iVar.copyOnWrite();
        C53048j jVar3 = (C53048j) iVar.instance;
        C53046h hVar2 = (C53046h) gVar.build();
        hVar2.getClass();
        jVar3.f139036b = hVar2;
        jVar3.f139035a |= 1;
        return (C53048j) iVar.build();
    }

    /* renamed from: b */
    public final void mo105544b(C122136q qVar, String str, String str2) {
        int c = m201671c(str2, this.f338811d);
        if (c == 0) {
            C60856cj.m92911t(qVar.mo105540a(str, str2), C47810es.m84974n(new C122133n(str, str2)), this.f338809b);
            c = 0;
        }
        C53041c cVar = (C53041c) C53044f.f139022f.createBuilder();
        cVar.copyOnWrite();
        C53044f fVar = (C53044f) cVar.instance;
        fVar.f139025b = 3;
        fVar.f139024a |= 1;
        cVar.copyOnWrite();
        C53044f fVar2 = (C53044f) cVar.instance;
        C62961ch chVar = fVar2.f139026c;
        if (!chVar.mo58948c()) {
            fVar2.f139026c = C62942bv.mutableCopy(chVar);
        }
        fVar2.f139026c.mo58916g(c);
        C63088z E = C63088z.m96143E(str);
        cVar.copyOnWrite();
        C53044f fVar3 = (C53044f) cVar.instance;
        fVar3.f139024a |= 4;
        fVar3.f139027d = E;
        C60856cj.m92911t(qVar.mo105541b(((C53044f) cVar.build()).toByteString(), str2), C47810es.m84974n(new C122134o(str, str2, c)), this.f338809b);
    }
}
