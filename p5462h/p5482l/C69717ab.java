package p5462h.p5482l;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: h.l.ab */
/* compiled from: PG */
class C69717ab extends C69743w {
    /* renamed from: e */
    public static final Object m101137e(C69731k kVar) {
        C69664n.m101061g(kVar, "<this>");
        Iterator a = kVar.mo5191a();
        if (!a.hasNext()) {
            return null;
        }
        return a.next();
    }

    /* renamed from: f */
    public static final List m101138f(C69731k kVar) {
        C69664n.m101061g(kVar, "<this>");
        return C69540x.m100950h(C69734n.m101139g(kVar));
    }

    /* renamed from: g */
    public static final List m101139g(C69731k kVar) {
        C69664n.m101061g(kVar, "<this>");
        ArrayList arrayList = new ArrayList();
        C69734n.m101147o(kVar, arrayList);
        return arrayList;
    }

    /* renamed from: h */
    public static final C69731k m101140h(C69731k kVar, C69626l lVar) {
        C69664n.m101061g(kVar, "<this>");
        C69664n.m101061g(lVar, "predicate");
        return new C69726f(kVar, true, lVar);
    }

    /* renamed from: i */
    public static final C69731k m101141i(C69731k kVar, C69626l lVar) {
        C69664n.m101061g(kVar, "<this>");
        return new C69726f(kVar, false, lVar);
    }

    /* renamed from: j */
    public static final C69731k m101142j(C69731k kVar) {
        C69664n.m101061g(kVar, "<this>");
        C69731k i = C69734n.m101141i(kVar, C69745y.f186119a);
        C69664n.m101059e(i, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return i;
    }

    /* renamed from: k */
    public static final C69731k m101143k(C69731k kVar, C69626l lVar) {
        C69664n.m101061g(kVar, "<this>");
        return new C69721af(kVar, lVar);
    }

    /* renamed from: l */
    public static final C69731k m101144l(C69731k kVar, C69626l lVar) {
        C69664n.m101061g(kVar, "<this>");
        return C69734n.m101142j(new C69721af(kVar, lVar));
    }

    /* renamed from: m */
    public static final C69731k m101145m(C69731k kVar, C69626l lVar) {
        C69664n.m101061g(kVar, "<this>");
        return new C69719ad(kVar, lVar);
    }

    /* renamed from: n */
    public static /* synthetic */ String m101146n(C69731k kVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        if ((i & 2) != 0) {
            charSequence2 = BuildConfig.FLAVOR;
        }
        if ((i & 4) != 0) {
            charSequence3 = BuildConfig.FLAVOR;
        }
        C69664n.m101061g(kVar, "<this>");
        C69664n.m101061g(charSequence2, "prefix");
        C69664n.m101061g(charSequence3, "postfix");
        StringBuilder sb = new StringBuilder();
        C69664n.m101061g(kVar, "<this>");
        C69664n.m101061g(charSequence2, "prefix");
        C69664n.m101061g(charSequence3, "postfix");
        sb.append(charSequence2);
        Iterator a = kVar.mo5191a();
        int i2 = 0;
        while (a.hasNext()) {
            Object next = a.next();
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            C69764m.m101218a(sb, next, (C69626l) null);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    /* renamed from: o */
    public static final void m101147o(C69731k kVar, Collection collection) {
        C69664n.m101061g(kVar, "<this>");
        Iterator a = kVar.mo5191a();
        while (a.hasNext()) {
            collection.add(a.next());
        }
    }
}
