package com.google.android.play.core.p3534f.p3536b;

import com.google.android.play.core.p3534f.p3537c.C45092a;
import com.google.android.play.core.p3534f.p3537c.C45093b;
import com.google.android.play.core.p3534f.p3537c.C45094c;
import com.google.android.play.core.p3538g.C45175j;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.f.b.b */
/* compiled from: PG */
public final class C45089b {
    /* renamed from: a */
    public static void m80255a(ClassLoader classLoader, Set set) {
        int i;
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(((File) it.next()).getParentFile());
            }
            Object a = C45088a.m80254a(classLoader);
            C45093b b = C45094c.m80261b(a, "nativeLibraryDirectories", List.class);
            synchronized (C45175j.class) {
                ArrayList arrayList = new ArrayList((Collection) b.mo48927c());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                b.mo48928d(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] objArr = (Object[]) C45094c.m80262c(a, "makePathElements", Object[].class, List.class, new ArrayList(hashSet));
            int i2 = 0;
            if (!arrayList2.isEmpty()) {
                C45090c cVar = new C45090c("Error in makePathElements");
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    IOException iOException = (IOException) arrayList2.get(i3);
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(cVar, new Object[]{iOException});
                    } catch (Exception unused) {
                    }
                }
                throw cVar;
            }
            synchronized (C45175j.class) {
                C45092a a2 = C45094c.m80260a(a, "nativeLibraryPathElements", Object.class);
                List<Object> asList = Arrays.asList(objArr);
                Object[] objArr2 = (Object[]) a2.mo48927c();
                if (objArr2 == null) {
                    i = 0;
                } else {
                    i = objArr2.length;
                }
                Object[] objArr3 = (Object[]) Array.newInstance(a2.mo48925a(), i + asList.size());
                if (objArr2 != null) {
                    System.arraycopy(objArr2, 0, objArr3, asList.size(), objArr2.length);
                }
                for (Object obj : asList) {
                    objArr3[i2] = obj;
                    i2++;
                }
                a2.mo48928d(objArr3);
            }
        }
    }
}
