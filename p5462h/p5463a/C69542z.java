package p5462h.p5463a;

import java.util.ArrayList;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.z */
/* compiled from: PG */
class C69542z extends C69541y {
    /* renamed from: c */
    public static final int m100945c(List list) {
        C69664n.m101061g(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: d */
    public static final ArrayList m100946d(Object... objArr) {
        C69664n.m101061g(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C69528l(objArr, true));
    }

    /* renamed from: e */
    public static final List m100947e(Object... objArr) {
        C69664n.m101061g(objArr, "elements");
        return objArr.length > 0 ? C69531o.m100923a(objArr) : C69496am.f185918a;
    }

    /* renamed from: f */
    public static final List m100948f(Object obj) {
        return obj != null ? C69540x.m100944b(obj) : C69496am.f185918a;
    }

    /* renamed from: g */
    public static final List m100949g(Object... objArr) {
        C69664n.m101061g(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C69528l(objArr, true));
    }

    /* renamed from: h */
    public static final List m100950h(List list) {
        C69664n.m101061g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return C69496am.f185918a;
        }
        if (size != 1) {
            return list;
        }
        return C69540x.m100944b(list.get(0));
    }

    /* renamed from: i */
    public static final void m100951i() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: j */
    public static final void m100952j() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
