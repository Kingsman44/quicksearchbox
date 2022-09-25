package android.support.p031v4.app;

import androidx.p060c.C0984n;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.app.as */
/* compiled from: PG */
public class C0173as {

    /* renamed from: a */
    private static final C0984n f740a = new C0984n(0);

    /* renamed from: b */
    public static Class m390b(ClassLoader classLoader, String str) {
        try {
            return m392d(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: c */
    static boolean m391c(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m392d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static Class m392d(ClassLoader classLoader, String str) {
        C0984n nVar = f740a;
        C0984n nVar2 = (C0984n) nVar.get(classLoader);
        if (nVar2 == null) {
            nVar2 = new C0984n(0);
            nVar.put(classLoader, nVar2);
        }
        Class cls = (Class) nVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        nVar2.put(str, cls2);
        return cls2;
    }

    /* renamed from: a */
    public Fragment mo586a(ClassLoader classLoader, String str) {
        try {
            return (Fragment) m390b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
