package p3186j$.util;

import com.google.android.setupcompat.p3549a.C45240c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: j$.util.DesugarCollections */
public class DesugarCollections {

    /* renamed from: a */
    public static final Class f107492a;

    /* renamed from: b */
    private static final Field f107493b;

    /* renamed from: c */
    private static final Field f107494c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Constructor f107495d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Constructor f107496e;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f107492a = cls;
        Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f107493b = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls.getDeclaredField(C45240c.f118157a);
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f107494c = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        Class<Object> cls2 = Object.class;
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(new Class[]{Set.class, cls2});
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f107496e = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls.getDeclaredConstructor(new Class[]{Collection.class, cls2});
        } catch (NoSuchMethodException unused4) {
        }
        f107495d = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* renamed from: c */
    static boolean m71623c(Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = f107493b;
        if (field == null) {
            try {
                return Collection.EL.removeIf((java.util.Collection) f107494c.get(collection), predicate);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(collection)) {
                    removeIf = Collection.EL.removeIf((java.util.Collection) f107494c.get(collection), predicate);
                }
                return removeIf;
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection removeIf.", e2);
            }
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C41087e(map);
    }
}
