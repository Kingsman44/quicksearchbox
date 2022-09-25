package com.google.android.apps.search.googleapp.search.suggest.p10449b;

import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.common.p4552o.aos;
import com.google.common.p4552o.aou;
import com.google.common.p4552o.aov;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62963cj;
import com.google.protos.p4932ax.p4933a.C64269i;
import java.util.HashSet;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.v */
/* compiled from: PG */
public final /* synthetic */ class C138065v implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C138065v f375641a = new C138065v();

    private /* synthetic */ C138065v() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C138030av avVar = (C138030av) obj;
        HashSet hashSet = new HashSet(new C62963cj(avVar.f375542e, C138030av.f375535f));
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        if ((aqVar.f142330a & 4) != 0) {
            C54228aq aqVar2 = avVar.f375543g;
            if (aqVar2 == null) {
                aqVar2 = C54228aq.f142328w;
            }
            C54216ae aeVar = aqVar2.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            for (C64269i iVar : aeVar.f142288B) {
                hashSet.addAll(new C62963cj(iVar.f173769e, C64269i.f173762f));
            }
        }
        aos aos = (aos) aov.f159510u.createBuilder();
        C138034az a = C138034az.m224336a(avVar.f375545i);
        if (a == null) {
            a = C138034az.NONE;
        }
        int a2 = aou.m92448a(a.f375590i);
        aos.copyOnWrite();
        aov aov = (aov) aos.instance;
        int i = a2 - 1;
        if (a2 != 0) {
            aov.f159517f = i;
            aov.f159512a |= 8;
            C138029au a3 = C138029au.m224331a(avVar.f375541d);
            if (a3 == null) {
                a3 = C138029au.QUERY;
            }
            int i2 = a3.f375534n;
            aos.copyOnWrite();
            aov aov2 = (aov) aos.instance;
            aov2.f159512a |= 2;
            aov2.f159514c = i2;
            aos.mo57029a((Iterable) Collection.EL.stream(hashSet).map(C138067x.f375643a).sorted().collect(Collectors.toCollection(C138063t.f375639a)));
            return (aov) aos.build();
        }
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
