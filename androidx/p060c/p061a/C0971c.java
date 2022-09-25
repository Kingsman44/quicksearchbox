package androidx.p060c.p061a;

import java.util.LinkedHashMap;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.c.a.c */
/* compiled from: PG */
public final class C0971c {

    /* renamed from: a */
    public final LinkedHashMap f3087a;

    public C0971c() {
        this((byte[]) null);
    }

    /* renamed from: a */
    public final Object mo3599a(Object obj, Object obj2) {
        C69664n.m101061g(obj, "key");
        C69664n.m101061g(obj2, "value");
        return this.f3087a.put(obj, obj2);
    }

    /* renamed from: b */
    public final Object mo3600b(Object obj) {
        C69664n.m101061g(obj, "key");
        return this.f3087a.remove(obj);
    }

    /* renamed from: c */
    public final Set mo3601c() {
        Set entrySet = this.f3087a.entrySet();
        C69664n.m101060f(entrySet, "map.entries");
        return entrySet;
    }

    public C0971c(byte[] bArr) {
        this.f3087a = new LinkedHashMap(0, 0.75f, true);
    }
}
