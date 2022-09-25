package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.p */
/* compiled from: PG */
abstract class C58707p implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final Iterator f156445a;

    /* renamed from: b */
    Object f156446b = null;

    /* renamed from: c */
    Collection f156447c = null;

    /* renamed from: d */
    Iterator f156448d = C58568jw.f156237a;

    /* renamed from: e */
    final /* synthetic */ C58307ae f156449e;

    public C58707p(C58307ae aeVar) {
        this.f156449e = aeVar;
        this.f156445a = aeVar.f155873a.entrySet().iterator();
    }

    /* renamed from: a */
    public abstract Object mo55557a(Object obj, Object obj2);

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156445a.hasNext() || this.f156448d.hasNext();
    }

    public final Object next() {
        if (!this.f156448d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f156445a.next();
            this.f156446b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f156447c = collection;
            this.f156448d = collection.iterator();
        }
        return mo55557a(this.f156446b, this.f156448d.next());
    }

    public final void remove() {
        this.f156448d.remove();
        if (((Collection) Objects.requireNonNull(this.f156447c)).isEmpty()) {
            this.f156445a.remove();
        }
        C58307ae.m89286z(this.f156449e);
    }
}
