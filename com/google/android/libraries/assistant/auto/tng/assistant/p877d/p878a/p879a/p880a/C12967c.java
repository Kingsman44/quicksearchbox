package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a;

import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12972ad;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12973ae;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12995m;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13004v;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13005w;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13006x;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13018af;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13019ag;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13061g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13062h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13063i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13068n;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.base.C58851bo;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.a.c */
/* compiled from: PG */
public final class C12967c {
    /* renamed from: a */
    public static C12985c m29204a(C12989g gVar, String str, long j) {
        return m29206c(gVar, str, j, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /* renamed from: b */
    public static C12985c m29205b(C12989g gVar, String str, long j, C12995m mVar) {
        return m29206c(gVar, str, j, Optional.empty(), Optional.m71637of(mVar), Optional.empty());
    }

    /* renamed from: c */
    public static C12985c m29206c(C12989g gVar, String str, long j, Optional optional, Optional optional2, Optional optional3) {
        C12985c cVar = (C12985c) C12986d.f40365e.createBuilder();
        C13006x xVar = (C13006x) C13007y.f40413d.createBuilder();
        long longValue = ((Long) optional.orElse(Long.valueOf(C58851bo.f156649a.nextLong()))).longValue();
        xVar.copyOnWrite();
        C13007y yVar = (C13007y) xVar.instance;
        yVar.f40415a |= 1;
        yVar.f40416b = longValue;
        if (!TextUtils.isEmpty(str)) {
            xVar.copyOnWrite();
            C13007y yVar2 = (C13007y) xVar.instance;
            str.getClass();
            yVar2.f40415a |= 2;
            yVar2.f40417c = str;
        }
        C12987e eVar = (C12987e) C12991i.f40380k.createBuilder();
        eVar.copyOnWrite();
        C12991i iVar = (C12991i) eVar.instance;
        iVar.f40385d = gVar.f40378e;
        iVar.f40382a |= 4;
        eVar.copyOnWrite();
        C12991i iVar2 = (C12991i) eVar.instance;
        C13007y yVar3 = (C13007y) xVar.build();
        yVar3.getClass();
        iVar2.f40383b = yVar3;
        iVar2.f40382a |= 1;
        eVar.copyOnWrite();
        C12991i iVar3 = (C12991i) eVar.instance;
        iVar3.f40382a |= 8;
        iVar3.f40386e = j;
        Objects.requireNonNull(eVar);
        optional2.ifPresent(new C12965a(eVar));
        Objects.requireNonNull(eVar);
        optional3.ifPresent(new C12966b(eVar));
        C12991i iVar4 = (C12991i) eVar.build();
        cVar.copyOnWrite();
        C12986d dVar = (C12986d) cVar.instance;
        iVar4.getClass();
        dVar.f40370d = iVar4;
        dVar.f40367a |= 128;
        return cVar;
    }

    /* renamed from: d */
    public static void m29207d(C12985c cVar, C51805du duVar) {
        C12972ad adVar = (C12972ad) C12973ae.f40345c.createBuilder();
        C13018af afVar = (C13018af) C13023ak.f40447c.createBuilder();
        C13019ag agVar = (C13019ag) C13020ah.f40439c.createBuilder();
        agVar.copyOnWrite();
        C13020ah ahVar = (C13020ah) agVar.instance;
        duVar.getClass();
        ahVar.f40442b = duVar;
        ahVar.f40441a |= 1;
        afVar.copyOnWrite();
        C13023ak akVar = (C13023ak) afVar.instance;
        C13020ah ahVar2 = (C13020ah) agVar.build();
        ahVar2.getClass();
        akVar.f40450b = ahVar2;
        akVar.f40449a = 2;
        adVar.copyOnWrite();
        C12973ae aeVar = (C12973ae) adVar.instance;
        C13023ak akVar2 = (C13023ak) afVar.build();
        akVar2.getClass();
        aeVar.f40348b = akVar2;
        aeVar.f40347a |= 1;
        C12973ae aeVar2 = (C12973ae) adVar.build();
        cVar.copyOnWrite();
        C12986d dVar = (C12986d) cVar.instance;
        C12986d dVar2 = C12986d.f40365e;
        aeVar2.getClass();
        dVar.f40369c = aeVar2;
        dVar.f40368b = 2;
    }

    /* renamed from: e */
    public static void m29208e(C12985c cVar, int i, long j) {
        C13004v vVar = (C13004v) C13005w.f40409c.createBuilder();
        C13061g gVar = (C13061g) C13068n.f40556f.createBuilder();
        gVar.copyOnWrite();
        C13068n nVar = (C13068n) gVar.instance;
        nVar.f40561d = i - 1;
        nVar.f40558a |= 4;
        gVar.copyOnWrite();
        C13068n nVar2 = (C13068n) gVar.instance;
        nVar2.f40559b = 1;
        nVar2.f40558a |= 1;
        C13062h hVar = (C13062h) C13063i.f40550c.createBuilder();
        hVar.copyOnWrite();
        C13063i iVar = (C13063i) hVar.instance;
        iVar.f40552a |= 1;
        iVar.f40553b = j;
        gVar.copyOnWrite();
        C13068n nVar3 = (C13068n) gVar.instance;
        C13063i iVar2 = (C13063i) hVar.build();
        iVar2.getClass();
        nVar3.f40562e = iVar2;
        nVar3.f40558a |= 8;
        vVar.copyOnWrite();
        C13005w wVar = (C13005w) vVar.instance;
        C13068n nVar4 = (C13068n) gVar.build();
        nVar4.getClass();
        wVar.f40412b = nVar4;
        wVar.f40411a |= 1;
        C13005w wVar2 = (C13005w) vVar.build();
        cVar.copyOnWrite();
        C12986d dVar = (C12986d) cVar.instance;
        C12986d dVar2 = C12986d.f40365e;
        wVar2.getClass();
        dVar.f40369c = wVar2;
        dVar.f40368b = 7;
    }
}
