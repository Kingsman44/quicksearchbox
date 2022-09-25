package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import com.google.assistant.p3825an.p3830c.p3831a.C49266al;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.h */
/* compiled from: PG */
public final /* synthetic */ class C130447h implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130453n f357407a;

    public /* synthetic */ C130447h(C130453n nVar) {
        this.f357407a = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Collection collection;
        C58528ij ijVar;
        C130453n nVar = this.f357407a;
        String str = (String) obj;
        if (!C130453n.f357413a.map.containsKey(str) || nVar.f357416d.contains(str)) {
            if (C130453n.f357413a.map.containsKey(str)) {
                ijVar = C130453n.f357413a.mo54902c(str);
            } else {
                ijVar = new C58759qy("schema.org/Shortcut");
            }
            C58526ih ihVar = new C58526ih();
            C58800sl lA = ijVar.iterator();
            while (lA.hasNext()) {
                String str2 = (String) lA.next();
                C49266al alVar = (C49266al) C49267am.f127346f.createBuilder();
                alVar.copyOnWrite();
                C49267am amVar = (C49267am) alVar.instance;
                str.getClass();
                amVar.f127348a |= 1;
                amVar.f127349b = str;
                alVar.copyOnWrite();
                C49267am amVar2 = (C49267am) alVar.instance;
                str2.getClass();
                amVar2.f127348a |= 2;
                amVar2.f127350c = str2;
                alVar.copyOnWrite();
                C49267am amVar3 = (C49267am) alVar.instance;
                amVar3.f127348a |= 4;
                amVar3.f127351d = 1;
                alVar.copyOnWrite();
                C49267am amVar4 = (C49267am) alVar.instance;
                amVar4.f127348a |= 8;
                amVar4.f127352e = 100;
                ihVar.mo55373c((C49267am) alVar.build());
            }
            collection = ihVar.mo55486f();
        } else {
            collection = C58733pz.f156496a;
        }
        return Collection.EL.stream(collection);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
