package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.bf */
/* compiled from: PG */
public class C2358bf {

    /* renamed from: w */
    public final Map f6573w = new HashMap();

    /* renamed from: x */
    public final Set f6574x = new LinkedHashSet();

    /* renamed from: y */
    public volatile boolean f6575y = false;

    /* renamed from: t */
    public static void m6351t(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo639d() {
    }

    /* renamed from: r */
    public final Object mo5766r(String str) {
        Object obj;
        synchronized (this.f6573w) {
            obj = this.f6573w.get(str);
        }
        return obj;
    }

    /* renamed from: s */
    public final Object mo5767s(String str, Object obj) {
        Object obj2;
        synchronized (this.f6573w) {
            obj2 = this.f6573w.get(str);
            if (obj2 == null) {
                this.f6573w.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f6575y) {
            m6351t(obj);
        }
        return obj;
    }
}
