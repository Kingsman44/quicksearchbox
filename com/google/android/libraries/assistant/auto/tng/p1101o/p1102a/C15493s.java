package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15471a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.s */
/* compiled from: PG */
public final /* synthetic */ class C15493s implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15494t f46443a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f46444b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f46445c;

    /* renamed from: d */
    public final /* synthetic */ C12991i f46446d;

    public /* synthetic */ C15493s(C15494t tVar, C60870cx cxVar, C60870cx cxVar2, C12991i iVar) {
        this.f46443a = tVar;
        this.f46444b = cxVar;
        this.f46445c = cxVar2;
        this.f46446d = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C15494t tVar = this.f46443a;
        C60870cx cxVar = this.f46444b;
        C60870cx cxVar2 = this.f46445c;
        C12991i iVar = this.f46446d;
        Long l = (Long) C60856cj.m92909r(cxVar);
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        ((C59052c) ((C59052c) C15494t.f46447a.mo56224b()).mo56372aa(45167)).mo56389s("Is AAE hotword detection running: %b", Boolean.valueOf(booleanValue));
        C15481g gVar = tVar.f46448b;
        C37252a c = C37179a.f97664ef.mo40779c();
        C15480f.m32212a(c, Optional.m71637of(l));
        C15471a aVar = (C15471a) tVar.f46451e.mo22362a(iVar, Optional.empty(), Optional.m71637of(l).map(C15490p.f46435a)).toBuilder();
        aVar.copyOnWrite();
        C15474b bVar = (C15474b) aVar.instance;
        bVar.f46406a |= 16;
        bVar.f46413h = booleanValue;
        gVar.mo22353c(c, Optional.m71637of((C15474b) aVar.build()));
        return C60866ct.f164955a;
    }
}
