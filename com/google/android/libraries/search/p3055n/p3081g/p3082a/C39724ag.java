package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.search.p3055n.p3085h.C39768a;
import com.google.android.libraries.search.p3055n.p3085h.C39769b;
import com.google.android.libraries.search.p3055n.p3085h.C39774g;
import com.google.android.libraries.search.p3055n.p3085h.C39775h;
import com.google.android.libraries.search.p3055n.p3085h.C39776i;
import com.google.android.libraries.search.p3055n.p3085h.C39777j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63088z;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.g.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C39724ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39726ai f104533a;

    /* renamed from: b */
    public final /* synthetic */ Locale f104534b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f104535c;

    public /* synthetic */ C39724ag(C39726ai aiVar, Locale locale, C58485gu guVar) {
        this.f104533a = aiVar;
        this.f104534b = locale;
        this.f104535c = guVar;
    }

    public final C60870cx apply(Object obj) {
        C39726ai aiVar = this.f104533a;
        Locale locale = this.f104534b;
        C58485gu guVar = this.f104535c;
        C39731b bVar = (C39731b) obj;
        C39774g gVar = (C39774g) C39775h.f104621f.createBuilder();
        String languageTag = locale.toLanguageTag();
        gVar.copyOnWrite();
        C39775h hVar = (C39775h) gVar.instance;
        languageTag.getClass();
        hVar.f104623a |= 2;
        hVar.f104625c = languageTag;
        if (bVar.mo42001c().isPresent()) {
            C39768a aVar = (C39768a) C39769b.f104600e.createBuilder();
            String languageTag2 = locale.toLanguageTag();
            aVar.copyOnWrite();
            C39769b bVar2 = (C39769b) aVar.instance;
            languageTag2.getClass();
            bVar2.f104602a |= 256;
            bVar2.f104604c = languageTag2;
            C63088z A = C63088z.m96139A((byte[]) bVar.mo42001c().get());
            aVar.copyOnWrite();
            C39769b bVar3 = (C39769b) aVar.instance;
            bVar3.f104602a |= 1073741824;
            bVar3.f104605d = A;
            if (bVar.mo42002d().isPresent()) {
                C39776i iVar = (C39776i) C39777j.f104628c.createBuilder();
                C63088z A2 = C63088z.m96139A((byte[]) bVar.mo42002d().get());
                iVar.copyOnWrite();
                C39777j jVar = (C39777j) iVar.instance;
                jVar.f104630a |= 2;
                jVar.f104631b = A2;
                aVar.copyOnWrite();
                C39769b bVar4 = (C39769b) aVar.instance;
                C39777j jVar2 = (C39777j) iVar.build();
                jVar2.getClass();
                bVar4.f104603b = jVar2;
                bVar4.f104602a |= 128;
            }
            gVar.copyOnWrite();
            C39775h hVar2 = (C39775h) gVar.instance;
            C39769b bVar5 = (C39769b) aVar.build();
            bVar5.getClass();
            hVar2.f104624b = bVar5;
            hVar2.f104623a |= 1;
        }
        Optional b = bVar.mo42000b();
        Objects.requireNonNull(gVar);
        b.ifPresentOrElse(new C39719ab(gVar), C39720ac.f104529a);
        if (!bVar.mo41999a().isEmpty()) {
            Collection.EL.stream(bVar.mo41999a()).filter(C39721ad.f104530a).forEach(new C39722ae(gVar));
        }
        return C60922j.m93044g(aiVar.f104538b.f104541c.mo42010b((C39775h) gVar.build()), C47810es.m84963c(new C39723af(guVar)), aiVar.f104538b.f104543e);
    }
}
