package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.p8257a;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.p6437d.p6439b.C83606a;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8229c.p8230a.C106601a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.C106856b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.C106857c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.C106858d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8272f.C107060a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p3886c.C50664a;
import com.google.assistant.p3886c.C50715b;
import com.google.assistant.p3886c.C50803d;
import com.google.assistant.p3886c.C50830e;
import com.google.assistant.p3886c.C50838j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.a.a.h */
/* compiled from: PG */
public final class C106855h implements C106858d {

    /* renamed from: a */
    public static final C58495hd f297731a = C58495hd.m89903q(C49794h.MUSIC, C50803d.MUSIC, C49794h.VIDEO, C50803d.VIDEO, C49794h.PODCASTS, C50803d.PODCASTS, C49794h.AUDIOBOOKS, C50803d.AUDIOBOOKS);

    /* renamed from: b */
    public final C83606a f297732b;

    /* renamed from: c */
    public final C60888db f297733c;

    /* renamed from: d */
    public final C83807w f297734d;

    /* renamed from: e */
    public final C58974d f297735e;

    /* renamed from: f */
    public final C106856b f297736f;

    /* renamed from: g */
    public final C130895ag f297737g;

    public C106855h(C83606a aVar, C60888db dbVar, C83807w wVar, C83564a aVar2, C106857c cVar, C130895ag agVar) {
        this.f297732b = aVar;
        this.f297733c = dbVar;
        this.f297734d = wVar;
        this.f297735e = aVar2.mo76900a("HotseatSuggProducer");
        Context context = (Context) cVar.f297740a.mo17428b();
        context.getClass();
        ((C107060a) cVar.f297741b.mo17428b()).getClass();
        C106601a aVar3 = (C106601a) cVar.f297742c.mo17428b();
        aVar3.getClass();
        this.f297736f = new C106856b(context, aVar3);
        this.f297737g = agVar;
    }

    /* renamed from: a */
    public static C50838j m177613a(List list) {
        C50830e eVar = (C50830e) C50838j.f132370b.createBuilder();
        C50664a aVar = (C50664a) C50715b.f131973d.createBuilder();
        aVar.copyOnWrite();
        C50715b bVar = (C50715b) aVar.instance;
        bVar.f131976b = 1;
        bVar.f131975a = 1 | bVar.f131975a;
        aVar.mo53417a((List) Collection.EL.stream(list).map(C106854g.f297730a).collect(C58370cn.f155946a));
        eVar.copyOnWrite();
        C50838j jVar = (C50838j) eVar.instance;
        C50715b bVar2 = (C50715b) aVar.build();
        bVar2.getClass();
        jVar.mo53484a();
        jVar.f132372a.add(bVar2);
        return (C50838j) eVar.build();
    }
}
