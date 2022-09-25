package p5462h.p5473f.p5475b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: h.f.b.h */
/* compiled from: PG */
public final class C69658h {

    /* renamed from: a */
    private static final Object[] f186045a = new Object[0];

    /* renamed from: a */
    public static final Object[] m101049a(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return f186045a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return f186045a;
        }
        Object[] objArr = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr[i] = it.next();
            if (i2 >= objArr.length) {
                if (!it.hasNext()) {
                    return objArr;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i3);
                C69664n.m101060f(objArr, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr, i2);
                C69664n.m101060f(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public static final Object[] m101050b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    C69664n.m101059e(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        C69664n.m101060f(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        C69664n.m101060f(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }
}
