package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import com.google.assistant.p3825an.p3830c.p3831a.C49292bk;
import com.google.assistant.p3825an.p3830c.p3831a.C49293bl;
import com.google.assistant.p3825an.p3830c.p3831a.C49331h;
import com.google.assistant.p3825an.p3830c.p3831a.C49332i;
import com.google.assistant.p3825an.p3830c.p3831a.C49333j;
import com.google.assistant.p3825an.p3830c.p3831a.C49337n;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.m */
/* compiled from: PG */
public final /* synthetic */ class C130452m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130453n f357412a;

    public /* synthetic */ C130452m(C130453n nVar) {
        this.f357412a = nVar;
    }

    public final C60870cx apply(Object obj) {
        C49293bl blVar;
        C130453n nVar = this.f357412a;
        C49331h hVar = (C49331h) C49333j.f127504f.createBuilder();
        C49292bk bkVar = (C49292bk) C49293bl.f127401b.createBuilder();
        bkVar.mo53227a((Iterable) Collection.EL.stream((C58528ij) obj).flatMap(new C130447h(nVar)).collect(Collectors.toCollection(C130448i.f357408a)));
        hVar.copyOnWrite();
        C49333j jVar = (C49333j) hVar.instance;
        C49293bl blVar2 = (C49293bl) bkVar.build();
        blVar2.getClass();
        jVar.f127508c = blVar2;
        jVar.f127507b = 1;
        C49333j jVar2 = (C49333j) hVar.build();
        int i = jVar2.f127507b;
        int a = C49332i.m85413a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                blVar = (C49293bl) jVar2.f127508c;
            } else {
                blVar = C49293bl.f127401b;
            }
            Optional ofNullable = Optional.ofNullable((jVar2.f127506a & 4) != 0 ? jVar2.f127509d : null);
            Optional ofNullable2 = Optional.ofNullable((jVar2.f127506a & 8) != 0 ? jVar2.f127510e : null);
            if (blVar.f127403a.isEmpty()) {
                return C60856cj.m92900i(C49337n.f127527b);
            }
            C130443d dVar = nVar.f357417e;
            C145948p pVar = dVar.f357403a;
            C142826w wVar = new C142826w();
            for (C49267am amVar : blVar.f127403a) {
                String str = amVar.f127349b;
                Optional ofNullable3 = Optional.ofNullable((String) C130431a.f357393a.get(amVar.f127350c));
                Optional ofNullable4 = Optional.ofNullable(ofNullable3.isPresent() ? new CorpusId(str, (String) ofNullable3.get(), (Bundle) null) : null);
                if (!ofNullable4.isEmpty()) {
                    String str2 = ((CorpusId) ofNullable4.get()).f387417a;
                    String str3 = ((CorpusId) ofNullable4.get()).f387418b;
                    wVar.mo117756b((CorpusId) ofNullable4.get());
                    wVar.mo117757c((CorpusId) ofNullable4.get(), amVar.f127351d, amVar.f127352e);
                }
            }
            wVar.f387611d = true;
            ofNullable.ifPresent(new C130444e(wVar));
            ofNullable2.ifPresent(new C130445f(wVar));
            if (!ofNullable2.isPresent() || !((String) ofNullable2.get()).equals("AppActionsNga")) {
                wVar.f387614g = "AppActions";
            } else {
                wVar.f387614g = "AppActionsIcingCache";
            }
            return C47633f.m84733g(C60922j.m93044g(C43205e.m76192b(pVar.mo122338b(BuildConfig.FLAVOR, 100, wVar.mo117755a())), C47810es.m84963c(C130442c.f357402a), dVar.f357404b)).mo51517j(5000, TimeUnit.MILLISECONDS, nVar.f357414b).mo51514f(TimeoutException.class, C130451l.f357411a, nVar.f357414b);
        } else if (i2 == 1) {
            return C60856cj.m92899h(new C130454o("AppActionsIcing: SinglePackageQuerySpec is not supported yet."));
        } else {
            if (i2 != 2) {
                return C60856cj.m92900i(C49337n.f127527b);
            }
            return C60856cj.m92899h(new C130454o("AppActionsIcing: Unsupported querySpec"));
        }
    }
}
