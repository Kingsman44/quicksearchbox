package androidx.p054b.p055a.p057b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.b.a.b.h */
/* compiled from: PG */
public class C0894h implements Iterable {

    /* renamed from: b */
    public C0890d f2974b;

    /* renamed from: c */
    public C0890d f2975c;

    /* renamed from: d */
    public final WeakHashMap f2976d = new WeakHashMap();

    /* renamed from: e */
    public int f2977e = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0890d mo3497a(Object obj) {
        C0890d dVar = this.f2974b;
        while (dVar != null && !dVar.f2965a.equals(obj)) {
            dVar = dVar.f2967c;
        }
        return dVar;
    }

    /* renamed from: b */
    public Object mo3498b(Object obj) {
        C0890d a = mo3497a(obj);
        if (a == null) {
            return null;
        }
        this.f2977e--;
        if (!this.f2976d.isEmpty()) {
            for (C0893g eK : this.f2976d.keySet()) {
                eK.mo3508eK(a);
            }
        }
        C0890d dVar = a.f2968d;
        C0890d dVar2 = a.f2967c;
        if (dVar != null) {
            dVar.f2967c = dVar2;
        } else {
            this.f2974b = dVar2;
        }
        C0890d dVar3 = a.f2967c;
        if (dVar3 != null) {
            dVar3.f2968d = dVar;
        } else {
            this.f2975c = dVar;
        }
        a.f2967c = null;
        a.f2968d = null;
        return a.f2966b;
    }

    /* renamed from: c */
    public final C0890d mo3513c(Object obj, Object obj2) {
        C0890d dVar = new C0890d(obj, obj2);
        this.f2977e++;
        C0890d dVar2 = this.f2975c;
        if (dVar2 == null) {
            this.f2974b = dVar;
        } else {
            dVar2.f2967c = dVar;
            dVar.f2968d = dVar2;
        }
        this.f2975c = dVar;
        return dVar;
    }

    /* renamed from: d */
    public final C0891e mo3514d() {
        C0891e eVar = new C0891e(this);
        this.f2976d.put(eVar, false);
        return eVar;
    }

    /* renamed from: e */
    public final Object mo3515e(Object obj, Object obj2) {
        C0890d a = mo3497a(obj);
        if (a != null) {
            return a.f2966b;
        }
        mo3513c(obj, obj2);
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0894h)) {
            return false;
        }
        C0894h hVar = (C0894h) obj;
        if (this.f2977e != hVar.f2977e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = hVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if (entry == null) {
                if (next != null) {
                    return false;
                }
                next = null;
            }
            if (entry != null && !entry.equals(next)) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public final Iterator iterator() {
        C0888b bVar = new C0888b(this.f2974b, this.f2975c);
        this.f2976d.put(bVar, false);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
