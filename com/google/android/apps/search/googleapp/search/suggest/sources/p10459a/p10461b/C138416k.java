package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.common.base.C58817ah;
import com.google.common.p4575r.C60757n;
import com.google.p395al.p417d.p418a.C8575bc;
import java.util.HashSet;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.b.k */
/* compiled from: PG */
public final /* synthetic */ class C138416k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138421p f376517a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f376518b;

    public /* synthetic */ C138416k(C138421p pVar, C138133o oVar) {
        this.f376517a = pVar;
        this.f376518b = oVar;
    }

    public final Object apply(Object obj) {
        C138421p pVar = this.f376517a;
        C138133o oVar = this.f376518b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C8575bc bcVar = oVar.f375831h;
            if (bcVar == null) {
                bcVar = C8575bc.f29690g;
            }
            if (bcVar.f29694c.size() > 0) {
                return Optional.m71637of(C138421p.m224831d(oVar));
            }
            return Optional.empty();
        } else if (!pVar.f376526c) {
            return optional;
        } else {
            C138678v d = C138421p.m224831d(oVar);
            C138678v vVar = (C138678v) optional.get();
            HashSet hashSet = new HashSet();
            int a = C60757n.m92740a(pVar.f376527d);
            C138543u uVar = (C138543u) vVar.toBuilder();
            uVar.copyOnWrite();
            ((C138678v) uVar.instance).f377199c = C138678v.emptyProtobufList();
            C138543u uVar2 = uVar;
            HashSet hashSet2 = hashSet;
            int c = a - pVar.mo114278c((List) Collection.EL.stream(vVar.f377199c).filter(C138418m.f376521a).collect(Collectors.toCollection(C138419n.f376522a)), uVar2, hashSet2, a, true);
            int c2 = c - pVar.mo114278c(d.f377199c, uVar2, hashSet2, c, true);
            pVar.mo114278c((List) Collection.EL.stream(vVar.f377199c).filter(C138420o.f376523a).collect(Collectors.toCollection(C138419n.f376522a)), uVar2, hashSet2, c2, false);
            return Optional.m71637of((C138678v) uVar.build());
        }
    }
}
