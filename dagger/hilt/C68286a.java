package dagger.hilt;

import dagger.hilt.p5299a.C68287a;
import dagger.hilt.p5299a.C68288b;
import dagger.hilt.p5299a.C68289c;
import dagger.hilt.p5299a.C68290d;
import java.lang.annotation.Annotation;

/* renamed from: dagger.hilt.a */
/* compiled from: PG */
public final class C68286a {
    /* renamed from: a */
    public static Object m98629a(Object obj, Class cls) {
        boolean z;
        if (obj instanceof C68287a) {
            if (obj instanceof C68290d) {
                Annotation[] annotations = cls.getAnnotations();
                int length = annotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                C68289c.m98631a(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        } else if (obj instanceof C68288b) {
            return m98629a(((C68288b) obj).mo17653jN(), cls);
        } else {
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), C68287a.class, C68288b.class}));
        }
    }
}
