package androidx.p190r;

import android.content.Context;
import android.os.Trace;
import androidx.p196t.C4188a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.r.a */
/* compiled from: PG */
public final class C4059a {

    /* renamed from: a */
    public static volatile C4059a f12945a;

    /* renamed from: b */
    public static final Object f12946b = new Object();

    /* renamed from: c */
    final Map f12947c = new HashMap();

    /* renamed from: d */
    final Set f12948d = new HashSet();

    /* renamed from: e */
    final Context f12949e;

    public C4059a(Context context) {
        this.f12949e = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo8494a(Class cls, Set set) {
        if (C4188a.m12003a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f12947c.containsKey(cls)) {
                set.add(cls);
                C4061c cVar = (C4061c) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> b = cVar.mo8502b();
                if (!b.isEmpty()) {
                    for (Class cls2 : b) {
                        if (!this.f12947c.containsKey(cls2)) {
                            mo8494a(cls2, set);
                        }
                    }
                }
                Object a = cVar.mo8501a(this.f12949e);
                set.remove(cls);
                this.f12947c.put(cls, a);
            } else {
                this.f12947c.get(cls);
            }
            Trace.endSection();
            return;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
