package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83777t;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83778u;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58144b;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.aa */
/* compiled from: PG */
public final /* synthetic */ class C131441aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131444ad f359262a;

    public /* synthetic */ C131441aa(C131444ad adVar) {
        this.f359262a = adVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        String str;
        C58485gu guVar;
        C131444ad adVar = this.f359262a;
        List list = (List) obj;
        if (list == null) {
            optional = Optional.empty();
        } else {
            optional = Collection.EL.stream(list).filter(C131510n.f359367a).map(C131512p.f359369a).max(Comparator.CC.comparing(C131513q.f359370a));
        }
        if (optional.isEmpty()) {
            ((C58970a) ((C58970a) adVar.f359264a.mo56224b()).mo56372aa(39265)).mo56386p("No shopping list found in Keep.");
            return C60856cj.m92900i(Optional.empty());
        }
        ((C58970a) ((C58970a) adVar.f359264a.mo56224b()).mo56372aa(39264)).mo56386p("Found a shopping list in Keep.");
        C58148f a = ((C131443ac) optional.get()).mo110161a();
        C58144b bVar = a.f155458e;
        if (bVar == null) {
            bVar = C58144b.f155438c;
        }
        Optional findFirst = Collection.EL.stream(bVar.f155441b).filter(C131505i.f359362a).flatMap(C131506j.f359363a).findFirst();
        if (findFirst.isPresent()) {
            str = (String) findFirst.get();
        } else {
            String format = String.format("content://com.google.android.keep.slices/?note_id=%s", new Object[]{(String) C58557jl.m90131l(C58869cf.m90938d("https://keep.google.com/#note/").mo56153g(a.f155456c))});
            C58144b bVar2 = a.f155458e;
            if (bVar2 == null) {
                bVar2 = C58144b.f155438c;
            }
            String str2 = bVar2.f155440a;
            if (!str2.isEmpty()) {
                str = String.valueOf(format).concat(String.valueOf(String.format("&account=%s", new Object[]{str2})));
            } else {
                str = format;
            }
        }
        String str3 = ((C131443ac) optional.get()).mo110161a().f155456c;
        Instant b = ((C131443ac) optional.get()).mo110162b();
        if (adVar.f359267d) {
            return C60922j.m93044g(C60856cj.m92904m(C47810es.m84978r(new C131514r(adVar, str)), adVar.f359270g), C47810es.m84963c(new C131515s(adVar, str3, b, str)), adVar.f359269f);
        }
        String d = ((C131443ac) optional.get()).mo110164d();
        if (d == null) {
            guVar = C58485gu.m89845m();
        } else {
            guVar = C58485gu.m89841i(C58869cf.m90938d(" · ").mo56153g(d));
        }
        C83777t tVar = (C83777t) C83778u.f228339k.createBuilder();
        String c = ((C131443ac) optional.get()).mo110163c();
        tVar.copyOnWrite();
        C83778u uVar = (C83778u) tVar.instance;
        c.getClass();
        uVar.f228341a = 1 | uVar.f228341a;
        uVar.f228342b = c;
        tVar.mo77098a(guVar);
        int size = guVar.size();
        tVar.copyOnWrite();
        C83778u uVar2 = (C83778u) tVar.instance;
        uVar2.f228341a |= 8;
        uVar2.f228345e = size;
        return C60856cj.m92900i(Optional.m71637of(adVar.mo110175b(C131444ad.m213891a((C83778u) tVar.build(), str3, ((C131443ac) optional.get()).mo110162b(), str))));
    }
}
