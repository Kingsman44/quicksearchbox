package android.support.p031v4.app;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.v4.app.bq */
/* compiled from: PG */
final class C0198bq implements C0195bn {

    /* renamed from: a */
    final /* synthetic */ FragmentManager f771a;

    /* renamed from: b */
    private final String f772b;

    public C0198bq(FragmentManager fragmentManager, String str) {
        this.f771a = fragmentManager;
        this.f772b = str;
    }

    /* renamed from: j */
    public final boolean mo513j(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        String str;
        int i2;
        FragmentManager fragmentManager = this.f771a;
        String str2 = this.f772b;
        int a = fragmentManager.mo459a(str2, -1, true);
        if (a < 0) {
            return false;
        }
        for (int i3 = a; i3 < fragmentManager.f635b.size(); i3++) {
            C0154a aVar = (C0154a) fragmentManager.f635b.get(i3);
            if (!aVar.f824t) {
                fragmentManager.mo453T(new IllegalArgumentException("saveBackStack(\"" + str2 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        int i4 = a;
        while (i4 < fragmentManager.f635b.size()) {
            C0154a aVar2 = (C0154a) fragmentManager.f635b.get(i4);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList3 = aVar2.f809e;
            int size = arrayList3.size();
            int i5 = 0;
            while (i5 < size) {
                C0212cd cdVar = (C0212cd) arrayList3.get(i5);
                Fragment fragment = cdVar.f801b;
                if (fragment != null) {
                    if (!cdVar.f802c || (i2 = cdVar.f800a) == 1 || i2 == 2 || i2 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i6 = cdVar.f800a;
                    if (i6 == 1 || i6 == 2) {
                        hashSet3.add(fragment);
                    }
                }
                i5++;
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder("saveBackStack(\"");
                sb.append(str2);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    StringBuilder sb2 = new StringBuilder(" ");
                    Object next = hashSet2.iterator().next();
                    sb2.append(next);
                    str = " ".concat(String.valueOf(next));
                } else {
                    new StringBuilder("s ").append(hashSet2);
                    str = "s ".concat(hashSet2.toString());
                }
                sb.append(str);
                sb.append(" in ");
                sb.append(aVar2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                fragmentManager.mo453T(new IllegalArgumentException(sb.toString()));
            }
            i4++;
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb3 = new StringBuilder("saveBackStack(\"");
                sb3.append(str2);
                sb3.append("\") must not contain retained fragments. Found ");
                sb3.append(true != hashSet.contains(fragment2) ? "retained child " : "direct reference to retained ");
                sb3.append("fragment ");
                sb3.append(fragment2);
                fragmentManager.mo453T(new IllegalArgumentException(sb3.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.f634a.mo676h()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList4.add(((Fragment) it.next()).mWho);
        }
        ArrayList arrayList5 = new ArrayList(fragmentManager.f635b.size() - a);
        for (int i7 = a; i7 < fragmentManager.f635b.size(); i7++) {
            arrayList5.add((Object) null);
        }
        BackStackState backStackState = new BackStackState(arrayList4, arrayList5);
        int i8 = -1;
        for (int size2 = fragmentManager.f635b.size() - 1; size2 >= a; size2--) {
            C0154a aVar3 = (C0154a) fragmentManager.f635b.remove(size2);
            C0154a aVar4 = new C0154a(aVar3);
            int size3 = aVar4.f809e.size();
            while (true) {
                size3 += i;
                if (size3 < 0) {
                    break;
                }
                C0212cd cdVar2 = (C0212cd) aVar4.f809e.get(size3);
                if (!cdVar2.f802c) {
                    i = -1;
                } else if (cdVar2.f800a == 8) {
                    cdVar2.f802c = false;
                    size3--;
                    aVar4.f809e.remove(size3);
                    i = -1;
                } else {
                    int i9 = cdVar2.f801b.mContainerId;
                    cdVar2.f800a = 2;
                    cdVar2.f802c = false;
                    for (int i10 = size3 - 1; i10 >= 0; i10--) {
                        C0212cd cdVar3 = (C0212cd) aVar4.f809e.get(i10);
                        if (cdVar3.f802c && cdVar3.f801b.mContainerId == i9) {
                            aVar4.f809e.remove(i10);
                            size3--;
                        }
                    }
                    i = -1;
                }
            }
            i8 = -1;
            arrayList5.set(size2 - a, new BackStackRecordState(aVar4));
            aVar3.f693d = true;
            arrayList.add(aVar3);
            arrayList2.add(true);
        }
        fragmentManager.f640g.put(str2, backStackState);
        return true;
    }
}
