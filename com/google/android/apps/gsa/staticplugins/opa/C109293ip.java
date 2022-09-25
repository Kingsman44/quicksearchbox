package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128177i;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128178j;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.p3926e.C51989go;
import com.google.assistant.p3897e.p3921j.p3926e.C51991gq;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63204j;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ip */
/* compiled from: PG */
public final /* synthetic */ class C109293ip implements Function {

    /* renamed from: a */
    public final /* synthetic */ Optional f304468a;

    public /* synthetic */ C109293ip(Optional optional) {
        this.f304468a = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        Optional optional2 = this.f304468a;
        C51992gr grVar = (C51992gr) obj;
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
                ((C59052c) ((C59052c) ((C59052c) C109297it.f304472a.mo56226d()).mo56382g(e)).mo56372aa(22831)).mo56389s("Failed to parse logs.feature.TreeRef for suggestion '%s'", grVar.f136451e);
                optional = Optional.empty();
            }
        } else {
            optional = Optional.empty();
        }
        Objects.requireNonNull(iVar);
        optional.ifPresent(new C109295ir(iVar));
        Objects.requireNonNull(iVar);
        optional2.ifPresent(new C109296is(iVar));
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
            C128178j jVar5 = (C128178j) iVar.instance;
            jVar5.f352612a |= 32;
            jVar5.f352620i = z3;
        }
        return (C128178j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
