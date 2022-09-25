package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.apps.gsa.binaries.satin.app.aqn;
import com.google.android.apps.gsa.binaries.satin.app.ara;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34048bk;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71589p;
import kotlinx.coroutines.p5574b.C71590q;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.cb */
/* compiled from: PG */
public final class C34273cb implements C34254bj {

    /* renamed from: a */
    public final Map f91169a;

    /* renamed from: b */
    private final C34231an f91170b;

    /* renamed from: c */
    private final ara f91171c;

    public C34273cb(C34231an anVar, ara ara) {
        C69664n.m101061g(anVar, "invocationSourceDefinitions");
        C69664n.m101061g(ara, "sourceStateTrackerFactory");
        this.f91170b = anVar;
        this.f91171c = ara;
        Map map = anVar.f91082a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ara ara2 = this.f91171c;
            linkedHashMap.put(key, new C34266bv((C34043bf) entry.getKey(), (C34217a) ara2.f199895a.a.a.f202924gJ.mo17428b(), (aqn) ara2.f199895a.a.kl.mo17428b()));
        }
        this.f91169a = linkedHashMap;
    }

    /* renamed from: a */
    public final C71587n mo39286a(String str, long j, Set set) {
        String str2 = str;
        Set set2 = set;
        C69664n.m101061g(str2, "connectionId");
        C69664n.m101061g(set2, "connectionSources");
        if (set.isEmpty()) {
            C34048bk bkVar = (C34048bk) C34049bl.f90749a.createBuilder();
            C69664n.m101060f(bkVar, "newBuilder()");
            return new C71589p(C69664n.m101061g(bkVar, "builder").mo39196a());
        }
        ArrayList arrayList = new ArrayList(C69540x.m100804k(set2, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object obj = this.f91169a.get((C34043bf) it.next());
            C69664n.m101058d(obj);
            C34266bv bvVar = (C34266bv) obj;
            C69664n.m101061g(str2, "connectionId");
            C71587n dbVar = new C71552db(new C34260bp(bvVar.f91161b, (C69577g) null, str, j, bvVar));
            if (bvVar.f91160a) {
                C34048bk bkVar2 = (C34048bk) C34049bl.f90749a.createBuilder();
                C69664n.m101060f(bkVar2, "newBuilder()");
                dbVar = C71471ab.m104286a(C71590q.m104505b(new C34265bu(bvVar, dbVar, C69664n.m101061g(bkVar2, "builder").mo39196a(), (C69577g) null)));
            }
            arrayList.add(dbVar);
        }
        Object[] array = C69540x.m100840V(arrayList).toArray(new C71587n[0]);
        C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new C34272ca((C71587n[]) array);
    }
}
