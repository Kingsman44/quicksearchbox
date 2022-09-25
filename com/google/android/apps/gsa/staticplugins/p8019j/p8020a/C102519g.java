package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.g */
/* compiled from: PG */
public final class C102519g extends C68247h {

    /* renamed from: a */
    private final C68283d f286123a;

    /* renamed from: c */
    private final C68283d f286124c;

    /* renamed from: d */
    private final C68283d f286125d;

    /* renamed from: e */
    private final C68283d f286126e;

    /* renamed from: f */
    private final C68283d f286127f;

    /* renamed from: g */
    private final C68283d f286128g;

    public C102519g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C102519g.class), aVar);
        this.f286123a = C68236af.m98549d(dVar);
        this.f286124c = C68236af.m98549d(dVar2);
        this.f286125d = C68236af.m98549d(dVar3);
        this.f286126e = C68236af.m98549d(dVar4);
        this.f286127f = C68236af.m98549d(dVar5);
        this.f286128g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C58833ax axVar2 = (C58833ax) list.get(2);
        Set<C58833ax> set = (Set) list.get(3);
        Set<C68282c> set2 = (Set) list.get(4);
        Set<C85812bd> set3 = (Set) list.get(5);
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        HashMap hashMap = new HashMap();
        if (axVar.mo56113h()) {
            C52091ex exVar = ((C52081en) axVar.mo56107c()).f136685e;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            for (int i = 0; i < exVar.f136712a.size(); i++) {
                hashMap.put(((C52232kc) exVar.f136712a.get(i)).f137065b, (C52232kc) exVar.f136712a.get(i));
            }
        }
        if (axVar2.mo56113h()) {
            C52091ex exVar2 = (C52091ex) axVar2.mo56107c();
            for (int i2 = 0; i2 < exVar2.f136712a.size(); i2++) {
                hashMap.put(((C52232kc) exVar2.f136712a.get(i2)).f137065b, (C52232kc) exVar2.f136712a.get(i2));
            }
        }
        for (C58833ax axVar3 : set) {
            if (axVar3.mo56113h()) {
                hashMap.put(((C52232kc) axVar3.mo56107c()).f137065b, (C52232kc) axVar3.mo56107c());
            }
        }
        for (C68282c cVar : set2) {
            if (C57940c.m88582i(cVar)) {
                C58833ax axVar4 = (C58833ax) C57940c.m88577d(cVar);
                if (axVar4.mo56113h()) {
                    hashMap.put(((C52232kc) axVar4.mo56107c()).f137065b, (C52232kc) axVar4.mo56107c());
                }
            }
        }
        for (C85812bd a : set3) {
            C58833ax a2 = a.mo79460a(query);
            if (a2.mo56113h()) {
                hashMap.put(((C52232kc) a2.mo56107c()).f137065b, (C52232kc) a2.mo56107c());
            }
        }
        ewVar.mo53790c(hashMap.values());
        return C60856cj.m92900i((C52091ex) ewVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286123a.mo60297gq(), this.f286124c.mo60297gq(), this.f286125d.mo60297gq(), this.f286126e.mo60297gq(), this.f286127f.mo60297gq(), this.f286128g.mo60297gq());
    }
}
