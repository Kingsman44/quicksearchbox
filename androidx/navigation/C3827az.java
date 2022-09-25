package androidx.navigation;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69731k;
import p5462h.p5482l.C69734n;

/* renamed from: androidx.navigation.az */
/* compiled from: PG */
public final class C3827az {
    /* renamed from: a */
    public static final C3825ax m11055a(C3834bb bbVar) {
        C69664n.m101061g(bbVar, "<this>");
        C69731k d = C69734n.m101178d(bbVar.mo8094h(bbVar.f12375b, true), C3826ay.f12362a);
        C69664n.m101061g(d, "<this>");
        Iterator a = d.mo5191a();
        if (a.hasNext()) {
            Object next = a.next();
            while (a.hasNext()) {
                next = a.next();
            }
            return (C3825ax) next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }
}
