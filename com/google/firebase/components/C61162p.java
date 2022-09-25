package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.p4608a.C61115a;
import com.google.firebase.p4609b.C61123a;
import com.google.firebase.p4609b.C61124b;
import com.google.firebase.p4609b.C61125c;
import com.google.firebase.p4611d.C61174a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.components.p */
/* compiled from: PG */
public final class C61162p extends C61140a implements C61115a {

    /* renamed from: c */
    private static final C61174a f165493c = C61160n.f165491a;

    /* renamed from: a */
    public final Map f165494a = new HashMap();

    /* renamed from: b */
    public final AtomicReference f165495b = new AtomicReference();

    /* renamed from: d */
    private final Map f165496d = new HashMap();

    /* renamed from: e */
    private final Map f165497e = new HashMap();

    /* renamed from: f */
    private final List f165498f;

    /* renamed from: g */
    private final C61170x f165499g;

    public C61162p(Iterable iterable, Collection collection) {
        C61170x xVar = new C61170x();
        this.f165499g = xVar;
        ArrayList<C61151e> arrayList = new ArrayList<>();
        arrayList.add(C61151e.m93516c(xVar, C61170x.class, C61125c.class, C61124b.class));
        arrayList.add(C61151e.m93516c(this, C61115a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C61151e eVar = (C61151e) it.next();
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object add : iterable) {
            arrayList2.add(add);
        }
        this.f165498f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    C61156j jVar = (C61156j) ((C61174a) it2.next()).mo57687a();
                    if (jVar != null) {
                        arrayList.addAll(jVar.getComponents());
                        it2.remove();
                    }
                } catch (C61171y e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f165494a.isEmpty()) {
                C61165s.m93532a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f165494a.keySet());
                arrayList4.addAll(arrayList);
                C61165s.m93532a(arrayList4);
            }
            for (C61151e eVar2 : arrayList) {
                this.f165494a.put(eVar2, new C61172z(new C61158l(this, eVar2)));
            }
            ArrayList arrayList5 = new ArrayList();
            for (C61151e eVar3 : arrayList) {
                if (eVar3.mo57719d()) {
                    C61174a aVar = (C61174a) this.f165494a.get(eVar3);
                    for (Class cls : eVar3.f165478a) {
                        if (!this.f165496d.containsKey(cls)) {
                            this.f165496d.put(cls, aVar);
                        } else {
                            arrayList5.add(new C61157k((C61144ad) ((C61174a) this.f165496d.get(cls)), aVar));
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.f165494a.entrySet()) {
                C61151e eVar4 = (C61151e) entry.getKey();
                if (!eVar4.mo57719d()) {
                    C61174a aVar2 = (C61174a) entry.getValue();
                    for (Class cls2 : eVar4.f165478a) {
                        if (!hashMap.containsKey(cls2)) {
                            hashMap.put(cls2, new HashSet());
                        }
                        ((Set) hashMap.get(cls2)).add(aVar2);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (!this.f165497e.containsKey(entry2.getKey())) {
                    this.f165497e.put((Class) entry2.getKey(), C61141aa.m93496b((Collection) entry2.getValue()));
                } else {
                    C61141aa aaVar = (C61141aa) this.f165497e.get(entry2.getKey());
                    for (C61174a mVar : (Set) entry2.getValue()) {
                        arrayList6.add(new C61159m(aaVar, mVar));
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            for (C61151e eVar5 : this.f165494a.keySet()) {
                Iterator it3 = eVar5.f165479b.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        C61166t tVar = (C61166t) it3.next();
                        if (tVar.mo57728e() && !this.f165497e.containsKey(tVar.f165505a)) {
                            this.f165497e.put(tVar.f165505a, C61141aa.m93496b(Collections.emptySet()));
                        } else if (this.f165496d.containsKey(tVar.f165505a)) {
                            continue;
                        } else if (tVar.f165506b == 1) {
                            throw new C61142ab(String.format("Unsatisfied dependency for component %s: %s", new Object[]{eVar5, tVar.f165505a}));
                        } else if (!tVar.mo57728e()) {
                            this.f165496d.put(tVar.f165505a, new C61144ad(C61144ad.f165464a));
                        }
                    }
                }
            }
        }
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList3.get(i)).run();
        }
        Boolean bool = (Boolean) this.f165495b.get();
        if (bool != null) {
            mo57723e(this.f165494a, bool.booleanValue());
        }
    }

    /* renamed from: c */
    public final synchronized C61174a mo57713c(Class cls) {
        return (C61174a) this.f165496d.get(cls);
    }

    /* renamed from: d */
    public final synchronized C61174a mo57714d(Class cls) {
        C61141aa aaVar = (C61141aa) this.f165497e.get(cls);
        if (aaVar != null) {
            return aaVar;
        }
        return f165493c;
    }

    /* renamed from: e */
    public final void mo57723e(Map map, boolean z) {
        Queue<C61123a> queue;
        for (Map.Entry entry : map.entrySet()) {
            C61174a aVar = (C61174a) entry.getValue();
            int i = ((C61151e) entry.getKey()).f165480c;
            if (i == 1 || (i == 2 && z)) {
                aVar.mo57687a();
            }
        }
        C61170x xVar = this.f165499g;
        synchronized (xVar) {
            queue = xVar.f165509a;
            if (queue != null) {
                xVar.f165509a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C61123a aVar2 : queue) {
                aVar2.getClass();
                synchronized (xVar) {
                    Queue queue2 = xVar.f165509a;
                    if (queue2 != null) {
                        queue2.add(aVar2);
                    } else {
                        for (Map.Entry entry2 : xVar.mo57733b()) {
                            ((Executor) entry2.getValue()).execute(new C61169w(entry2));
                        }
                    }
                }
            }
        }
    }
}
