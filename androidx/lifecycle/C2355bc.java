package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.bc */
/* compiled from: PG */
public final class C2355bc {

    /* renamed from: a */
    public static final List f6565a = C69540x.m100947e(Application.class, C2344as.class);

    /* renamed from: b */
    public static final List f6566b = C69540x.m100944b(C2344as.class);

    /* renamed from: a */
    public static final C2358bf m6348a(Class cls, Constructor constructor, Object... objArr) {
        C69664n.m101061g(cls, "modelClass");
        try {
            return (C2358bf) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            new StringBuilder("Failed to access ").append(cls);
            throw new RuntimeException("Failed to access ".concat(String.valueOf(cls)), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            new StringBuilder("An exception happened in constructor of ").append(cls);
            throw new RuntimeException("An exception happened in constructor of ".concat(String.valueOf(cls)), e3.getCause());
        }
    }

    /* renamed from: b */
    public static final Constructor m6349b(Class cls, List list) {
        C69664n.m101061g(cls, "modelClass");
        C69664n.m101061g(list, "signature");
        Constructor[] constructors = cls.getConstructors();
        C69664n.m101060f(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            C69664n.m101060f(parameterTypes, "constructor.parameterTypes");
            List n = C69531o.m100937n((Object[]) parameterTypes);
            if (C69664n.m101066l(list, n)) {
                C69664n.m101059e(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != n.size() || !n.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
