package p5462h.p5463a;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p5462h.C69685i;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69695c;
import p5462h.p5482l.C69731k;
import p5462h.p5483m.C69764m;

/* renamed from: h.a.ak */
/* compiled from: PG */
class C69494ak extends C69491ah {
    /* renamed from: A */
    public static final Object m100819A(List list) {
        C69664n.m101061g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: B */
    public static final Object m100820B(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: C */
    public static final Object m100821C(List list) {
        C69664n.m101061g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: D */
    public static final Object m100822D(List list, int i) {
        C69664n.m101061g(list, "<this>");
        if (i < 0 || i > C69540x.m100945c(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: E */
    public static final Object m100823E(List list) {
        C69664n.m101061g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C69540x.m100945c(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: F */
    public static final Object m100824F(List list) {
        C69664n.m101061g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: G */
    public static final Object m100825G(List list) {
        C69664n.m101061g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: H */
    public static final HashSet m100826H(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        HashSet hashSet = new HashSet(C69505av.m100860b(C69540x.m100804k(iterable, 12)));
        C69540x.m100852ah(iterable, hashSet);
        return hashSet;
    }

    /* renamed from: I */
    public static final List m100827I(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        return C69540x.m100840V(C69540x.m100845aa(iterable));
    }

    /* renamed from: J */
    public static final List m100828J(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        C69664n.m101061g(iterable, "<this>");
        for (Object next : iterable) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: K */
    public static final List m100829K(Iterable iterable, Iterable iterable2) {
        C69664n.m101061g(iterable, "<this>");
        C69664n.m101061g(iterable2, "elements");
        Collection a = C69538v.m100942a(iterable2, iterable);
        if (a.isEmpty()) {
            return C69540x.m100840V(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!a.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    public static final List m100830L(Iterable iterable, Object obj) {
        C69664n.m101061g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
        boolean z = false;
        for (Object next : iterable) {
            boolean z2 = true;
            if (!z && C69664n.m101066l(next, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List m100831M(java.util.Collection r3, java.lang.Iterable r4) {
        /*
            java.lang.String r0 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            java.lang.String r0 = "elements"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0023
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            return r0
        L_0x0023:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            p5462h.p5463a.C69540x.m100811r(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.C69494ak.m100831M(java.util.Collection, java.lang.Iterable):java.util.List");
    }

    /* renamed from: N */
    public static final List m100832N(Collection collection, Object obj) {
        C69664n.m101061g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: O */
    public static final List m100833O(Collection collection, C69731k kVar) {
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        Iterator a = kVar.mo5191a();
        while (a.hasNext()) {
            arrayList.add(a.next());
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List m100834P(java.lang.Iterable r3) {
        /*
            java.lang.String r0 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            boolean r1 = r3 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0015
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0015
            java.util.List r3 = p5462h.p5463a.C69540x.m100840V(r3)
            return r3
        L_0x0015:
            java.util.List r3 = p5462h.p5463a.C69540x.m100841W(r3)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            java.util.Collections.reverse(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.C69494ak.m100834P(java.lang.Iterable):java.util.List");
    }

    /* renamed from: Q */
    public static final List m100835Q(List list, C69695c cVar) {
        C69664n.m101061g(list, "<this>");
        return cVar.mo61411b() ? C69496am.f185918a : C69540x.m100840V(list.subList(Integer.valueOf(cVar.f186059a).intValue(), Integer.valueOf(cVar.f186060b).intValue() + 1));
    }

    /* renamed from: R */
    public static final List m100836R(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C69540x.m100840V(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sorted>");
            Object[] objArr = (Object[]) ((Comparable[]) array);
            C69664n.m101061g(objArr, "<this>");
            if (objArr.length > 1) {
                Arrays.sort(objArr);
            }
            return C69531o.m100923a(objArr);
        }
        List W = C69540x.m100841W(iterable);
        C69540x.m100808o(W);
        return W;
    }

    /* renamed from: S */
    public static final List m100837S(Iterable iterable, Comparator comparator) {
        C69664n.m101061g(iterable, "<this>");
        C69664n.m101061g(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C69540x.m100840V(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sortedWith>");
            C69531o.m100925c(array, comparator);
            return C69531o.m100923a(array);
        }
        List W = C69540x.m100841W(iterable);
        C69540x.m100809p(W, comparator);
        return W;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List m100838T(java.lang.Iterable r4, int r5) {
        /*
            java.lang.String r0 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            if (r5 < 0) goto L_0x0047
            if (r5 != 0) goto L_0x000c
            h.a.am r4 = p5462h.p5463a.C69496am.f185918a
            return r4
        L_0x000c:
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L_0x0028
            int r0 = r4.size()
            if (r5 < r0) goto L_0x001c
            java.util.List r4 = p5462h.p5463a.C69540x.m100840V(r4)
            return r4
        L_0x001c:
            if (r5 == r1) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            java.lang.Object r4 = p5462h.p5463a.C69540x.m100856z(r4)
            java.util.List r4 = p5462h.p5463a.C69540x.m100944b(r4)
            return r4
        L_0x0028:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L_0x0032:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r4.next()
            r0.add(r3)
            int r2 = r2 + r1
            if (r2 != r5) goto L_0x0032
        L_0x0042:
            java.util.List r4 = p5462h.p5463a.C69540x.m100950h(r0)
            return r4
        L_0x0047:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Requested element count "
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = " is less than zero."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
            goto L_0x0061
        L_0x0060:
            throw r5
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.C69494ak.m100838T(java.lang.Iterable, int):java.util.List");
    }

    /* renamed from: U */
    public static final List m100839U(List list, int i) {
        C69664n.m101061g(list, "<this>");
        int size = list.size();
        if (i >= size) {
            return C69540x.m100840V(list);
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* renamed from: V */
    public static final List m100840V(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C69540x.m100950h(C69540x.m100841W(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C69496am.f185918a;
        }
        if (size != 1) {
            return C69540x.m100842X(collection);
        }
        return C69540x.m100944b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: W */
    public static final List m100841W(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return C69540x.m100842X((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        C69540x.m100852ah(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: X */
    public static final List m100842X(Collection collection) {
        C69664n.m101061g(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: Y */
    public static final List m100843Y(Iterable iterable, Iterable iterable2) {
        C69664n.m101061g(iterable, "<this>");
        C69664n.m101061g(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C69540x.m100804k(iterable, 10), C69540x.m100804k(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C69685i(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: Z */
    public static final Set m100844Z(Iterable iterable, Iterable iterable2) {
        C69664n.m101061g(iterable, "<this>");
        C69664n.m101061g(iterable2, "other");
        Set aa = C69540x.m100845aa(iterable);
        C69664n.m101061g(aa, "<this>");
        C69664n.m101061g(iterable2, "elements");
        Collection a = C69538v.m100942a(iterable2, aa);
        C69651ah.m101038c(aa);
        aa.retainAll(a);
        return aa;
    }

    /* renamed from: aa */
    public static final Set m100845aa(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C69540x.m100852ah(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: ab */
    public static final Set m100846ab(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C69498ao.f185920a;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C69505av.m100860b(collection.size()));
                C69540x.m100852ah(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return C69514bd.m100887a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C69540x.m100852ah(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            return C69498ao.f185920a;
        }
        if (size2 != 1) {
            return linkedHashSet2;
        }
        return C69514bd.m100887a(linkedHashSet2.iterator().next());
    }

    /* renamed from: ac */
    public static final C69731k m100847ac(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        return new C69492ai(iterable);
    }

    /* renamed from: ad */
    public static final boolean m100848ad(Iterable iterable, Object obj) {
        int i;
        C69664n.m101061g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        C69664n.m101061g(iterable, "<this>");
        if (iterable instanceof List) {
            i = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    C69540x.m100952j();
                }
                if (C69664n.m101066l(obj, next)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            return false;
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public static final int[] m100849ae(Collection collection) {
        C69664n.m101061g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: af */
    public static final void m100850af(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C69626l lVar) {
        C69664n.m101061g(iterable, "<this>");
        C69664n.m101061g(charSequence, "separator");
        C69664n.m101061g(charSequence2, "prefix");
        C69664n.m101061g(charSequence3, "postfix");
        C69664n.m101061g(charSequence4, "truncated");
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            C69764m.m101218a(appendable, next, lVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    /* renamed from: ag */
    public static /* synthetic */ String m100851ag(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C69626l lVar, int i) {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        CharSequence charSequence5 = (i & 2) != 0 ? BuildConfig.FLAVOR : charSequence2;
        CharSequence charSequence6 = (i & 4) != 0 ? BuildConfig.FLAVOR : charSequence3;
        int i2 = (i & 8) != 0 ? -1 : 0;
        String str = (i & 16) != 0 ? "..." : null;
        C69626l lVar2 = (i & 32) != 0 ? null : lVar;
        C69664n.m101061g(iterable, "<this>");
        C69664n.m101061g(charSequence4, "separator");
        C69664n.m101061g(charSequence5, "prefix");
        C69664n.m101061g(charSequence6, "postfix");
        C69664n.m101061g(str, "truncated");
        StringBuilder sb = new StringBuilder();
        C69540x.m100850af(iterable, sb, charSequence4, charSequence5, charSequence6, i2, str, lVar2);
        return sb.toString();
    }

    /* renamed from: ah */
    public static final void m100852ah(Iterable iterable, Collection collection) {
        C69664n.m101061g(iterable, "<this>");
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    /* renamed from: x */
    public static final Comparable m100854x(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: y */
    public static final Iterable m100855y(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        return new C69500aq(new C69493aj(iterable));
    }

    /* renamed from: z */
    public static final Object m100856z(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        if (iterable instanceof List) {
            return C69540x.m100819A((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }
}
