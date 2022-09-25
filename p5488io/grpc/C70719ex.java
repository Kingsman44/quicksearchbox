package p5488io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: io.grpc.ex */
/* compiled from: PG */
public final class C70719ex {
    /* renamed from: a */
    public static List m103401a(Class cls, Iterable iterable, ClassLoader classLoader, C70718ew ewVar) {
        ArrayList arrayList;
        Object obj;
        if (m103402b(classLoader)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    obj = cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException unused) {
                    obj = null;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", new Object[]{cls2.getName(), th}), th);
                }
                if (obj != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            ServiceLoader load = ServiceLoader.load(cls, classLoader);
            boolean hasNext = load.iterator().hasNext();
            arrayList = load;
            if (!hasNext) {
                arrayList = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList) {
            if (ewVar.mo61970b(next)) {
                arrayList3.add(next);
            }
        }
        Collections.sort(arrayList3, Collections.reverseOrder(new C70717ev(ewVar)));
        return Collections.unmodifiableList(arrayList3);
    }

    /* renamed from: b */
    public static boolean m103402b(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
