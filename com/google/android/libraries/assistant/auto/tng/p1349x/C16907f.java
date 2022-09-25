package com.google.android.libraries.assistant.auto.tng.p1349x;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;
import p001a.p007b.p008a.p009a.p010a.C0005a;
import p001a.p007b.p008a.p009a.p010a.C0007c;
import p001a.p007b.p008a.p009a.p010a.C0009e;
import p001a.p007b.p008a.p009a.p010a.C0010f;
import p001a.p007b.p008a.p009a.p010a.C0011g;
import p001a.p007b.p008a.p009a.p010a.C0012h;
import p001a.p007b.p008a.p009a.p010a.C0013i;
import p001a.p007b.p008a.p009a.p010a.C0014j;
import p001a.p007b.p008a.p009a.p010a.C0015k;
import p001a.p007b.p008a.p009a.p010a.C0024t;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.x.f */
/* compiled from: PG */
public final /* synthetic */ class C16907f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16911j f49425a;

    /* renamed from: b */
    public final /* synthetic */ C63088z f49426b;

    /* renamed from: c */
    public final /* synthetic */ String f49427c;

    /* renamed from: d */
    public final /* synthetic */ String f49428d;

    /* renamed from: e */
    public final /* synthetic */ String f49429e;

    public /* synthetic */ C16907f(C16911j jVar, C63088z zVar, String str, String str2, String str3) {
        this.f49425a = jVar;
        this.f49426b = zVar;
        this.f49427c = str;
        this.f49428d = str2;
        this.f49429e = str3;
    }

    public final Object apply(Object obj) {
        C16911j jVar = this.f49425a;
        C63088z zVar = this.f49426b;
        String str = this.f49427c;
        String str2 = this.f49428d;
        String str3 = this.f49429e;
        C0010f fVar = (C0010f) C0011g.f14f.createBuilder();
        fVar.copyOnWrite();
        C0011g gVar = (C0011g) fVar.instance;
        str2.getClass();
        gVar.f16a |= 1;
        gVar.f17b = str2;
        fVar.copyOnWrite();
        C0011g gVar2 = (C0011g) fVar.instance;
        str.getClass();
        gVar2.f16a |= 2;
        gVar2.f18c = str;
        fVar.copyOnWrite();
        C0011g gVar3 = (C0011g) fVar.instance;
        gVar3.f16a |= 4;
        gVar3.f19d = "UNKNOWN";
        fVar.copyOnWrite();
        C0011g gVar4 = (C0011g) fVar.instance;
        gVar4.f16a |= 16;
        gVar4.f20e = false;
        C0011g gVar5 = (C0011g) fVar.build();
        C0005a aVar = (C0005a) C0007c.f9c.createBuilder();
        aVar.copyOnWrite();
        C0007c cVar = (C0007c) aVar.instance;
        cVar.f12b = 4;
        cVar.f11a |= 1;
        C0007c cVar2 = (C0007c) aVar.build();
        C0012h hVar = (C0012h) C0013i.f21e.createBuilder();
        hVar.copyOnWrite();
        C0013i iVar = (C0013i) hVar.instance;
        iVar.f24b = 1;
        iVar.f23a |= 1;
        int i = jVar.f49450l;
        hVar.copyOnWrite();
        C0013i iVar2 = (C0013i) hVar.instance;
        iVar2.f23a |= 2;
        iVar2.f25c = (float) i;
        int i2 = jVar.f49451m;
        hVar.copyOnWrite();
        C0013i iVar3 = (C0013i) hVar.instance;
        iVar3.f23a |= 4;
        iVar3.f26d = i2;
        C0013i iVar4 = (C0013i) hVar.build();
        C0014j jVar2 = (C0014j) C0015k.f27g.createBuilder();
        long nanos = Duration.ofMillis(jVar.f49442d.mo26870b()).toNanos();
        jVar2.copyOnWrite();
        C0015k kVar = (C0015k) jVar2.instance;
        kVar.f29a |= 1;
        kVar.f30b = nanos;
        jVar2.mo3a(str3);
        String str4 = jVar.f49449k;
        jVar2.copyOnWrite();
        C0015k kVar2 = (C0015k) jVar2.instance;
        str4.getClass();
        kVar2.f29a |= 4;
        kVar2.f33e = str4;
        jVar2.copyOnWrite();
        C0015k kVar3 = (C0015k) jVar2.instance;
        zVar.getClass();
        kVar3.f29a |= 2;
        kVar3.f32d = zVar;
        C0015k kVar4 = (C0015k) jVar2.build();
        C0009e eVar = (C0009e) ((C0024t) obj).toBuilder();
        eVar.copyOnWrite();
        C0024t tVar = (C0024t) eVar.instance;
        kVar4.getClass();
        tVar.f70b = kVar4;
        tVar.f69a |= 1;
        eVar.copyOnWrite();
        C0024t tVar2 = (C0024t) eVar.instance;
        gVar5.getClass();
        tVar2.f73e = gVar5;
        tVar2.f69a |= 8;
        eVar.copyOnWrite();
        C0024t tVar3 = (C0024t) eVar.instance;
        cVar2.getClass();
        tVar3.f72d = cVar2;
        tVar3.f69a |= 4;
        eVar.copyOnWrite();
        C0024t tVar4 = (C0024t) eVar.instance;
        iVar4.getClass();
        tVar4.f71c = iVar4;
        tVar4.f69a |= 2;
        return (C0024t) eVar.build();
    }
}
