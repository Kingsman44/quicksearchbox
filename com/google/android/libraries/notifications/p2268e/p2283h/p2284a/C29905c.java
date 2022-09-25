package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import android.os.Bundle;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29825p;
import com.google.android.libraries.notifications.data.C29826q;
import com.google.android.libraries.notifications.p2268e.p2281g.C29892c;
import com.google.android.libraries.notifications.p2268e.p2281g.C29893d;
import com.google.android.libraries.notifications.p2292g.C30005m;
import com.google.android.libraries.notifications.p2292g.C30006n;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.p4160bf.p4164b.p4165a.C55667g;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.notifications.e.h.a.c */
/* compiled from: PG */
public final class C29905c extends C29899aa {

    /* renamed from: c */
    private final C29893d f81024c;

    /* renamed from: d */
    private final C29826q f81025d;

    public C29905c(C29893d dVar, C29826q qVar) {
        this.f81024c = dVar;
        this.f81025d = qVar;
    }

    /* renamed from: e */
    public final String mo35170e() {
        return "RPC_BATCH_UPDATE_THREAD_STATE";
    }

    /* renamed from: g */
    public final C29892c mo35217g(Bundle bundle, C55543aw awVar, C29820k kVar) {
        if (kVar == null) {
            return m55364i();
        }
        String h = kVar.mo35009h();
        List b = this.f81025d.mo35097b(h, 100);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            try {
                C30006n nVar = (C30006n) C62942bv.parseFrom((C62942bv) C30006n.f81219f, ((C29825p) it.next()).mo35038c());
                C55564bq bqVar = nVar.f81223c;
                if (bqVar == null) {
                    bqVar = C55564bq.f146602f;
                }
                String str = nVar.f81225e;
                int a = C55667g.m87716a(nVar.f81224d);
                if (a != 0) {
                    i = a;
                }
                C29898a aVar = new C29898a(bqVar, str, i);
                if (!linkedHashMap.containsKey(aVar)) {
                    linkedHashMap.put(aVar, new HashSet());
                }
                ((Set) linkedHashMap.get(aVar)).addAll(nVar.f81222b);
            } catch (C62974ct e) {
                C30058b.m55792d("BatchUpdateThreadStateHandler", e, "Unable to parse SdkBatchedUpdate message", new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C29904b bVar : linkedHashMap.keySet()) {
            C30005m mVar = (C30005m) C30006n.f81219f.createBuilder();
            C55564bq a2 = bVar.mo35211a();
            mVar.copyOnWrite();
            C30006n nVar2 = (C30006n) mVar.instance;
            a2.getClass();
            nVar2.f81223c = a2;
            nVar2.f81221a |= 1;
            String b2 = bVar.mo35212b();
            mVar.copyOnWrite();
            C30006n nVar3 = (C30006n) mVar.instance;
            b2.getClass();
            nVar3.f81221a |= 4;
            nVar3.f81225e = b2;
            mVar.copyOnWrite();
            C30006n nVar4 = (C30006n) mVar.instance;
            nVar4.mo35309a();
            C62947c.addAll((Iterable) linkedHashMap.get(bVar), (List) nVar4.f81222b);
            int c = bVar.mo35213c();
            mVar.copyOnWrite();
            C30006n nVar5 = (C30006n) mVar.instance;
            int i2 = c - 1;
            if (c != 0) {
                nVar5.f81224d = i2;
                nVar5.f81221a |= 2;
                arrayList.add((C30006n) mVar.build());
            } else {
                throw null;
            }
        }
        C29892c a3 = this.f81024c.mo35186a(kVar, arrayList, awVar);
        if (!a3.mo35205f() || !a3.mo35201d()) {
            this.f81025d.mo35099d(h, b);
        }
        return a3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo35218h() {
        return "BatchUpdateThreadStateCallback";
    }
}
