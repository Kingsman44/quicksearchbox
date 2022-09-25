package androidx.p182p;

import android.content.Context;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.p.aa */
/* compiled from: PG */
public final class C3918aa {
    /* renamed from: a */
    public static final C3919ab m11218a(Context context, Class cls, String str) {
        C69664n.m101061g(context, "context");
        if (!C69764m.m101229h(str)) {
            return new C3919ab(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    /* renamed from: b */
    public static final C3919ab m11219b(Context context, Class cls) {
        C69664n.m101061g(context, "context");
        return new C3919ab(context, cls, (String) null);
    }

    /* renamed from: c */
    public static final Object m11220c(Class cls) {
        String str;
        Package packageR = cls.getPackage();
        C69664n.m101058d(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        C69664n.m101058d(canonicalName);
        C69664n.m101060f(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            C69664n.m101060f(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String concat = String.valueOf(C69764m.m101232k(canonicalName, '.')).concat("_Impl");
        try {
            if (name.length() == 0) {
                str = concat;
            } else {
                str = name + '.' + concat;
            }
            Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
            C69664n.m101059e(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + concat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }
}
