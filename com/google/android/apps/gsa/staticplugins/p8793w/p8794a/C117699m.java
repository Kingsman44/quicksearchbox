package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import com.google.assistant.p3954j.p3955a.C52967a;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a.p007b.p008a.p009a.p010a.C0009e;
import p001a.p007b.p008a.p009a.p010a.C0016l;
import p001a.p007b.p008a.p009a.p010a.C0020p;
import p001a.p007b.p008a.p009a.p010a.C0021q;
import p001a.p007b.p008a.p009a.p010a.C0022r;
import p001a.p007b.p008a.p009a.p010a.C0023s;
import p001a.p007b.p008a.p009a.p010a.C0024t;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.m */
/* compiled from: PG */
public final /* synthetic */ class C117699m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f326680a;

    /* renamed from: b */
    public final /* synthetic */ int f326681b;

    public /* synthetic */ C117699m(int i, int i2) {
        this.f326680a = i;
        this.f326681b = i2;
    }

    public final Object apply(Object obj) {
        int i = this.f326680a;
        int i2 = this.f326681b;
        C0024t tVar = (C0024t) obj;
        C0023s sVar = tVar.f74f;
        if (sVar == null) {
            sVar = C0023s.f58h;
        }
        C0016l lVar = (C0016l) sVar.toBuilder();
        List unmodifiableList = Collections.unmodifiableList(((C0023s) lVar.instance).f65f);
        Set<C0020p> a = C52967a.m86763a(i);
        Map b = C117687ai.m195602b((List) Collection.EL.stream(unmodifiableList).map(C117706t.f326700a).collect(Collectors.toList()));
        for (C0020p pVar : a) {
            if (b.containsKey(pVar)) {
                int intValue = ((Integer) b.get(pVar)).intValue();
                C0021q qVar = (C0021q) ((C0022r) unmodifiableList.get(intValue)).toBuilder();
                qVar.copyOnWrite();
                C0022r rVar = (C0022r) qVar.instance;
                rVar.f55a |= 1;
                rVar.f56b = i2;
                C0022r rVar2 = (C0022r) qVar.build();
                lVar.copyOnWrite();
                C0023s sVar2 = (C0023s) lVar.instance;
                rVar2.getClass();
                sVar2.mo6a();
                sVar2.f65f.set(intValue, rVar2);
            } else {
                C0021q qVar2 = (C0021q) C0022r.f53d.createBuilder();
                qVar2.copyOnWrite();
                C0022r rVar3 = (C0022r) qVar2.instance;
                rVar3.f57c = pVar.f52k;
                rVar3.f55a |= 4;
                qVar2.copyOnWrite();
                C0022r rVar4 = (C0022r) qVar2.instance;
                rVar4.f55a |= 1;
                rVar4.f56b = i2;
                C0022r rVar5 = (C0022r) qVar2.build();
                lVar.copyOnWrite();
                C0023s sVar3 = (C0023s) lVar.instance;
                rVar5.getClass();
                sVar3.mo6a();
                sVar3.f65f.add(rVar5);
            }
        }
        C0009e eVar = (C0009e) tVar.toBuilder();
        C0023s sVar4 = (C0023s) lVar.build();
        eVar.copyOnWrite();
        C0024t tVar2 = (C0024t) eVar.instance;
        sVar4.getClass();
        tVar2.f74f = sVar4;
        tVar2.f69a |= 16;
        return (C0024t) eVar.build();
    }
}
