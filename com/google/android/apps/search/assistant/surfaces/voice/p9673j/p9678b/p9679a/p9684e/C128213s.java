package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9684e;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128177i;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128178j;
import com.google.assistant.p3745ab.C48304dc;
import com.google.assistant.p3745ab.C48305dd;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.p3926e.C51989go;
import com.google.assistant.p3897e.p3921j.p3926e.C51991gq;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.assistant.p3994s.p3995a.C53128ck;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4816ai.p4818b.C63204j;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e.s */
/* compiled from: PG */
public final /* synthetic */ class C128213s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C128214t f352689a;

    public /* synthetic */ C128213s(C128214t tVar) {
        this.f352689a = tVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        C128214t tVar = this.f352689a;
        C53128ck ckVar = (C53128ck) obj;
        C51992gr grVar = ckVar.f139243d;
        if (grVar == null) {
            grVar = C51992gr.f136445r;
        }
        C63042fg fgVar = ckVar.f139244e;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C128177i iVar = (C128177i) C128178j.f352610j.createBuilder();
        String str = grVar.f136448b;
        iVar.copyOnWrite();
        C128178j jVar = (C128178j) iVar.instance;
        str.getClass();
        jVar.f352612a |= 1;
        jVar.f352615d = str;
        String str2 = grVar.f136451e;
        iVar.copyOnWrite();
        C128178j jVar2 = (C128178j) iVar.instance;
        str2.getClass();
        jVar2.f352612a |= 2;
        jVar2.f352616e = str2;
        boolean z = grVar.f136458l;
        iVar.copyOnWrite();
        C128178j jVar3 = (C128178j) iVar.instance;
        jVar3.f352612a |= 8;
        jVar3.f352618g = z;
        C51991gq gqVar = grVar.f136462p;
        if (gqVar == null) {
            gqVar = C51991gq.f136433k;
        }
        boolean z2 = gqVar.f136440f;
        iVar.copyOnWrite();
        C128178j jVar4 = (C128178j) iVar.instance;
        jVar4.f352612a |= 16;
        jVar4.f352619h = z2;
        if ((grVar.f136447a & 1024) != 0) {
            try {
                C52230ka kaVar = grVar.f136457k;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                optional = Optional.m71637of((C63204j) C62942bv.parseFrom((C62942bv) C63204j.f170749e, kaVar.f137061c, C62921ba.m95368a()));
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C128214t.f352690a.mo56226d()).mo56382g(e)).mo56372aa(37791)).mo56389s("Failed to parse logs.feature.TreeRef for suggestion '%s'", grVar.f136451e);
                optional = Optional.empty();
            }
        } else {
            optional = Optional.empty();
        }
        Objects.requireNonNull(iVar);
        optional.ifPresent(new C128209o(iVar));
        C48304dc dcVar = (C48304dc) C48305dd.f124927d.createBuilder();
        long b = tVar.f352691b.mo26870b();
        long c = C62953e.m95478c(fgVar);
        dcVar.copyOnWrite();
        C48305dd ddVar = (C48305dd) dcVar.instance;
        ddVar.f124930a |= 1;
        ddVar.f124931b = b - c;
        C48305dd ddVar2 = (C48305dd) dcVar.build();
        iVar.copyOnWrite();
        C128178j jVar5 = (C128178j) iVar.instance;
        ddVar2.getClass();
        jVar5.f352614c = ddVar2;
        jVar5.f352613b = 5;
        C51989go goVar = grVar.f136463q;
        if (goVar == null) {
            goVar = C51989go.f136429c;
        }
        if ((goVar.f136431a & 1) != 0) {
            C51989go goVar2 = grVar.f136463q;
            if (goVar2 == null) {
                goVar2 = C51989go.f136429c;
            }
            boolean z3 = goVar2.f136432b;
            iVar.copyOnWrite();
            C128178j jVar6 = (C128178j) iVar.instance;
            jVar6.f352612a |= 32;
            jVar6.f352620i = z3;
        }
        return (C128178j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
