package com.google.android.apps.search.pronunciationlearning.content;

import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.search.pronunciationlearning.content.g */
/* compiled from: PG */
public final class C141366g {

    /* renamed from: a */
    public final C46723bg f383766a;

    /* renamed from: b */
    public final C42876ab f383767b;

    /* renamed from: c */
    public final C60887da f383768c;

    /* renamed from: d */
    public final C141330c f383769d;

    public C141366g(C46723bg bgVar, C42876ab abVar, C60887da daVar, C141330c cVar) {
        this.f383766a = bgVar;
        this.f383767b = abVar;
        this.f383768c = daVar;
        this.f383769d = cVar;
    }

    /* renamed from: b */
    public static void m229440b(Set set, C141371l lVar) {
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((C141372m) lVar.instance).f383780a));
        arrayList.removeAll(set);
        lVar.copyOnWrite();
        ((C141372m) lVar.instance).f383780a = C62942bv.emptyProtobufList();
        lVar.copyOnWrite();
        C141372m mVar = (C141372m) lVar.instance;
        mVar.mo116391a();
        C62947c.addAll((Iterable) arrayList, (List) mVar.f383780a);
    }

    /* renamed from: c */
    public static boolean m229441c(int i, C141372m mVar, C58528ij ijVar, C141367h hVar) {
        List<String> d = m229442d(i, mVar, ijVar);
        boolean z = d.size() < i;
        if (z) {
            d = m229442d(i, C141372m.f383778b, ijVar);
        }
        for (String str : d) {
            C141369j jVar = (C141369j) C141370k.f383773d.createBuilder();
            jVar.copyOnWrite();
            C141370k kVar = (C141370k) jVar.instance;
            str.getClass();
            kVar.f383775a |= 1;
            kVar.f383776b = str;
            jVar.copyOnWrite();
            C141370k kVar2 = (C141370k) jVar.instance;
            str.getClass();
            kVar2.f383775a |= 2;
            kVar2.f383777c = str;
            C141370k kVar3 = (C141370k) jVar.build();
            hVar.copyOnWrite();
            C141368i iVar = (C141368i) hVar.instance;
            C141368i iVar2 = C141368i.f383770b;
            kVar3.getClass();
            iVar.mo116390a();
            iVar.f383772a.add(kVar3);
        }
        return z;
    }

    /* renamed from: d */
    private static List m229442d(int i, C141372m mVar, C58528ij ijVar) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet(mVar.f383780a);
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            String str = (String) lA.next();
            if (!hashSet.contains(str)) {
                arrayList.add(str);
                if (arrayList.size() >= i) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C60870cx mo116389a() {
        C60870cx d = this.f383767b.mo46042d();
        C141363d dVar = new C141363d(this);
        return C60922j.m93044g(d, C47810es.m84963c(dVar), this.f383768c);
    }
}
