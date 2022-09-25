package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90034cm;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.assistant.p1363c.p1371b.p1374b.C17031a;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.p2246f.C29404a;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29537ar;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29551bd;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60888db;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C96763ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ C17031a f270650a;

    /* renamed from: b */
    public final /* synthetic */ Context f270651b;

    /* renamed from: c */
    public final /* synthetic */ C28787cb f270652c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f270653d;

    /* renamed from: e */
    public final /* synthetic */ C21942ah f270654e;

    /* renamed from: f */
    public final /* synthetic */ C29551bd f270655f;

    /* renamed from: g */
    public final /* synthetic */ C86124t f270656g;

    /* renamed from: h */
    public final /* synthetic */ C96755a f270657h;

    /* renamed from: i */
    public final /* synthetic */ C29404a f270658i;

    /* renamed from: j */
    public final /* synthetic */ C96789h f270659j;

    /* renamed from: k */
    public final /* synthetic */ C90851k f270660k;

    public /* synthetic */ C96763ah(C90851k kVar, C96755a aVar, C17031a aVar2, Context context, C29404a aVar3, C28787cb cbVar, C58833ax axVar, C21942ah ahVar, C29551bd bdVar, C86124t tVar, C96789h hVar) {
        this.f270660k = kVar;
        this.f270657h = aVar;
        this.f270650a = aVar2;
        this.f270651b = context;
        this.f270658i = aVar3;
        this.f270652c = cbVar;
        this.f270653d = axVar;
        this.f270654e = ahVar;
        this.f270655f = bdVar;
        this.f270656g = tVar;
        this.f270659j = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C90851k kVar = this.f270660k;
        C58881cr crVar = this.f270657h;
        C58881cr crVar2 = this.f270650a;
        Context context = this.f270651b;
        C29404a aVar = this.f270658i;
        C28787cb cbVar = this.f270652c;
        C58833ax axVar = this.f270653d;
        C21942ah ahVar = this.f270654e;
        C29551bd bdVar = this.f270655f;
        C86124t tVar = this.f270656g;
        C96789h hVar = this.f270659j;
        C96762ag agVar = (C96762ag) obj;
        C60888db a = kVar.mo85208a(String.valueOf(String.valueOf(agVar.mo90340c())).concat("GddFileGroupPopulator"));
        C29537ar arVar = new C29537ar();
        arVar.f80039b = agVar.mo90340c();
        if (true != agVar.mo90344g()) {
            crVar = crVar2;
        }
        arVar.f80042e = crVar;
        arVar.f80038a = context;
        arVar.f80040c = a;
        arVar.f80053p = aVar;
        arVar.f80049l = cbVar;
        arVar.f80045h = new C96764ai(agVar);
        Objects.requireNonNull(axVar);
        arVar.mo34763b(new C96765aj(axVar));
        arVar.f80050m = ahVar;
        arVar.f80047j = bdVar;
        arVar.f80048k = tVar.mo79758x(C90034cm.f248343I);
        arVar.f80046i = hVar;
        return arVar.mo34762a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
