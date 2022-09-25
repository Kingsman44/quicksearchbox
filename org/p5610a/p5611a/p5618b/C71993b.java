package org.p5610a.p5611a.p5618b;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: org.a.a.b.b */
/* compiled from: PG */
public final class C71993b implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final Comparator f191713a;

    /* renamed from: b */
    public final Object f191714b;

    /* renamed from: c */
    public final Object f191715c;

    /* renamed from: d */
    private transient int f191716d;

    /* renamed from: e */
    private transient String f191717e;

    public C71993b(Object obj, Object obj2) {
        C71991a aVar = C71991a.f191710a;
        this.f191713a = aVar;
        if (aVar.compare(obj, obj2) <= 0) {
            this.f191714b = obj;
            this.f191715c = obj2;
            return;
        }
        this.f191714b = obj2;
        this.f191715c = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            C71993b bVar = (C71993b) obj;
            return this.f191714b.equals(bVar.f191714b) && this.f191715c.equals(bVar.f191715c);
        }
    }

    public final int hashCode() {
        int i = this.f191716d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((getClass().hashCode() + 629) * 37) + this.f191714b.hashCode()) * 37) + this.f191715c.hashCode();
        this.f191716d = hashCode;
        return hashCode;
    }

    public final String toString() {
        if (this.f191717e == null) {
            String obj = this.f191714b.toString();
            String obj2 = this.f191715c.toString();
            this.f191717e = "[" + obj + ".." + obj2 + "]";
        }
        return this.f191717e;
    }
}
