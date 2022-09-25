package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import com.google.assistant.p3954j.p3955a.C52967a;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a.p007b.p008a.p009a.p010a.C0009e;
import p001a.p007b.p008a.p009a.p010a.C0016l;
import p001a.p007b.p008a.p009a.p010a.C0017m;
import p001a.p007b.p008a.p009a.p010a.C0018n;
import p001a.p007b.p008a.p009a.p010a.C0020p;
import p001a.p007b.p008a.p009a.p010a.C0023s;
import p001a.p007b.p008a.p009a.p010a.C0024t;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.x */
/* compiled from: PG */
public final /* synthetic */ class C117710x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f326710a;

    /* renamed from: b */
    public final /* synthetic */ int f326711b;

    public /* synthetic */ C117710x(int i, int i2) {
        this.f326710a = i;
        this.f326711b = i2;
    }

    public final Object apply(Object obj) {
        int i = this.f326710a;
        int i2 = this.f326711b;
        C0024t tVar = (C0024t) obj;
        C0023s sVar = tVar.f74f;
        if (sVar == null) {
            sVar = C0023s.f58h;
        }
        C0016l lVar = (C0016l) sVar.toBuilder();
        List unmodifiableList = Collections.unmodifiableList(((C0023s) lVar.instance).f66g);
        Set<C0020p> a = C52967a.m86763a(i);
        Map b = C117687ai.m195602b((List) Collection.EL.stream(unmodifiableList).map(C117691e.f326667a).collect(Collectors.toList()));
        for (C0020p pVar : a) {
            if (b.containsKey(pVar)) {
                int intValue = ((Integer) b.get(pVar)).intValue();
                C0017m mVar = (C0017m) ((C0018n) unmodifiableList.get(intValue)).toBuilder();
                mVar.copyOnWrite();
                C0018n nVar = (C0018n) mVar.instance;
                nVar.f37a |= 1;
                nVar.f38b = i2;
                C0018n nVar2 = (C0018n) mVar.build();
                lVar.copyOnWrite();
                C0023s sVar2 = (C0023s) lVar.instance;
                nVar2.getClass();
                sVar2.mo7b();
                sVar2.f66g.set(intValue, nVar2);
            } else {
                C0017m mVar2 = (C0017m) C0018n.f35d.createBuilder();
                mVar2.copyOnWrite();
                C0018n nVar3 = (C0018n) mVar2.instance;
                nVar3.f39c = pVar.f52k;
                nVar3.f37a |= 4;
                mVar2.copyOnWrite();
                C0018n nVar4 = (C0018n) mVar2.instance;
                nVar4.f37a |= 1;
                nVar4.f38b = i2;
                C0018n nVar5 = (C0018n) mVar2.build();
                lVar.copyOnWrite();
                C0023s sVar3 = (C0023s) lVar.instance;
                nVar5.getClass();
                sVar3.mo7b();
                sVar3.f66g.add(nVar5);
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
