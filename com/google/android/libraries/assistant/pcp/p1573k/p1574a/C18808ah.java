package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.assistant.p3994s.p3995a.C53306j;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C18808ah implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C18820at f52950a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f52951b;

    /* renamed from: c */
    public final /* synthetic */ List f52952c;

    public /* synthetic */ C18808ah(C18820at atVar, C53306j jVar, List list) {
        this.f52950a = atVar;
        this.f52951b = jVar;
        this.f52952c = list;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C18820at atVar = this.f52950a;
        C53306j jVar = this.f52951b;
        List list = this.f52952c;
        atVar.f52983l.ifPresent(C18801aa.f52939a);
        atVar.f52983l = Optional.m71637of(cVar);
        atVar.f52976e.post(new C18802ab(atVar, jVar, list));
        return "connectAndFetchFuture";
    }
}
