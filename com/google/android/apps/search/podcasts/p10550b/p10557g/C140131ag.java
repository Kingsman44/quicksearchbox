package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97892ar;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97894at;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97896av;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97897aw;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97927q;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.podcasts.b.g.ag */
/* compiled from: PG */
final class C140131ag {

    /* renamed from: a */
    public final C21370a f380778a;

    /* renamed from: b */
    public final String f380779b;

    /* renamed from: c */
    public final C140160x f380780c;

    /* renamed from: d */
    final ArrayDeque f380781d;

    /* renamed from: e */
    public int f380782e;

    public C140131ag(C21370a aVar, C140160x xVar, List list, String str) {
        this.f380778a = aVar;
        this.f380780c = xVar;
        this.f380781d = new ArrayDeque(list);
        this.f380779b = str;
    }

    /* renamed from: a */
    public final void mo115467a(Function function) {
        ArrayList arrayList = new ArrayList(this.f380780c.f380824a.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C97929s sVar = (C97929s) arrayList.get(i);
            this.f380780c.f380824a.put(sVar.f273456d, (C97929s) function.apply(sVar));
        }
    }

    /* renamed from: b */
    public final boolean mo115468b(List list) {
        boolean z = false;
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C97897aw awVar = (C97897aw) G.next();
            if (mo115469c(awVar)) {
                this.f380781d.addLast(awVar);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo115469c(C97897aw awVar) {
        C97929s sVar;
        C97929s sVar2;
        C97927q qVar;
        int i = awVar.f273343a;
        if (i == 1) {
            C97892ar arVar = (C97892ar) awVar.f273344b;
            C97894at atVar = arVar.f273329d;
            if (atVar == null) {
                atVar = C97894at.f273331e;
            }
            if (atVar.f273334b == 2) {
                ArrayList arrayList = this.f380780c.f380825b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = i2 + 1;
                    if (C140135ak.m227800b((C97927q) arrayList.get(i2), atVar)) {
                        return false;
                    }
                    i2 = i3;
                }
                if (arVar.f273327b == 4) {
                    qVar = (C97927q) arVar.f273328c;
                } else {
                    qVar = C97927q.f273446d;
                }
                arrayList.add(qVar);
            } else {
                Map map = this.f380780c.f380824a;
                for (C97929s c : map.values()) {
                    if (C140135ak.m227801c(c, atVar)) {
                        return false;
                    }
                }
                if (arVar.f273327b == 3) {
                    sVar = (C97929s) arVar.f273328c;
                } else {
                    sVar = C97929s.f273451r;
                }
                String str = sVar.f273456d;
                if (arVar.f273327b == 3) {
                    sVar2 = (C97929s) arVar.f273328c;
                } else {
                    sVar2 = C97929s.f273451r;
                }
                map.put(str, sVar2);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            C97896av avVar = (C97896av) awVar.f273344b;
            C97894at atVar2 = avVar.f273340b;
            if (atVar2 == null) {
                atVar2 = C97894at.f273331e;
            }
            if (atVar2.f273334b == 2) {
                ArrayList arrayList2 = this.f380780c.f380825b;
                int size2 = arrayList2.size();
                while (true) {
                    int i4 = size2 - 1;
                    if (size2 <= 0) {
                        return false;
                    }
                    C97927q qVar2 = (C97927q) arrayList2.get(i4);
                    C97894at atVar3 = avVar.f273340b;
                    if (atVar3 == null) {
                        atVar3 = C97894at.f273331e;
                    }
                    if (C140135ak.m227800b(qVar2, atVar3)) {
                        arrayList2.remove(i4);
                        break;
                    }
                    size2 = i4;
                }
            } else {
                Map map2 = this.f380780c.f380824a;
                ArrayList arrayList3 = new ArrayList(map2.values());
                int size3 = arrayList3.size();
                int i5 = 0;
                while (i5 < size3) {
                    C97929s sVar3 = (C97929s) arrayList3.get(i5);
                    C97894at atVar4 = avVar.f273340b;
                    if (atVar4 == null) {
                        atVar4 = C97894at.f273331e;
                    }
                    i5++;
                    if (C140135ak.m227801c(sVar3, atVar4)) {
                        map2.remove(sVar3.f273456d);
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: d */
    public final boolean mo115470d(C97929s sVar, Function function) {
        ArrayList arrayList = new ArrayList(this.f380780c.f380824a.values());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C97929s sVar2 = (C97929s) arrayList.get(i);
            if (!sVar2.f273456d.equals(sVar.f273456d)) {
                i++;
                if (sVar2.f273455c.equals(sVar.f273455c)) {
                }
            }
            this.f380780c.f380824a.put(sVar2.f273456d, (C97929s) function.apply(sVar2));
            return true;
        }
        return false;
    }
}
