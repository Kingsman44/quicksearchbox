package androidx.camera.core.p069a;

import android.util.ArrayMap;
import androidx.camera.camera2.p068c.C1232h;
import androidx.camera.camera2.p068c.C1233i;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.a.cc */
/* compiled from: PG */
public class C1343cc implements C1308av {

    /* renamed from: b */
    protected static final Comparator f3823b;

    /* renamed from: c */
    public static final C1343cc f3824c;

    /* renamed from: d */
    public final TreeMap f3825d;

    static {
        C1342cb cbVar = C1342cb.f3822a;
        f3823b = cbVar;
        f3824c = new C1343cc(new TreeMap(cbVar));
    }

    public C1343cc(TreeMap treeMap) {
        this.f3825d = treeMap;
    }

    /* renamed from: m */
    public static C1343cc m3633m(C1308av avVar) {
        if (C1343cc.class.equals(avVar.getClass())) {
            return (C1343cc) avVar;
        }
        TreeMap treeMap = new TreeMap(f3823b);
        for (C1306at atVar : avVar.mo3959i()) {
            Set<C1307au> h = avVar.mo3958h(atVar);
            ArrayMap arrayMap = new ArrayMap();
            for (C1307au auVar : h) {
                arrayMap.put(auVar, avVar.mo3955G(atVar, auVar));
            }
            treeMap.put(atVar, arrayMap);
        }
        return new C1343cc(treeMap);
    }

    /* renamed from: C */
    public final C1307au mo3951C(C1306at atVar) {
        Map map = (Map) this.f3825d.get(atVar);
        if (map != null) {
            return (C1307au) Collections.min(map.keySet());
        }
        new StringBuilder("Option does not exist: ").append(atVar);
        throw new IllegalArgumentException("Option does not exist: ".concat(String.valueOf(atVar)));
    }

    /* renamed from: E */
    public final Object mo3953E(C1306at atVar) {
        Map map = (Map) this.f3825d.get(atVar);
        if (map != null) {
            return map.get((C1307au) Collections.min(map.keySet()));
        }
        new StringBuilder("Option does not exist: ").append(atVar);
        throw new IllegalArgumentException("Option does not exist: ".concat(String.valueOf(atVar)));
    }

    /* renamed from: F */
    public final Object mo3954F(C1306at atVar, Object obj) {
        try {
            return mo3953E(atVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    /* renamed from: G */
    public final Object mo3955G(C1306at atVar, C1307au auVar) {
        Map map = (Map) this.f3825d.get(atVar);
        if (map == null) {
            new StringBuilder("Option does not exist: ").append(atVar);
            throw new IllegalArgumentException("Option does not exist: ".concat(String.valueOf(atVar)));
        } else if (map.containsKey(auVar)) {
            return map.get(auVar);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + atVar + " with priority=" + auVar);
        }
    }

    /* renamed from: h */
    public final Set mo3958h(C1306at atVar) {
        Map map = (Map) this.f3825d.get(atVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    /* renamed from: i */
    public final Set mo3959i() {
        return Collections.unmodifiableSet(this.f3825d.keySet());
    }

    /* renamed from: j */
    public final boolean mo3960j(C1306at atVar) {
        return this.f3825d.containsKey(atVar);
    }

    /* renamed from: k */
    public final void mo3961k(C1232h hVar) {
        for (Map.Entry entry : this.f3825d.tailMap(new C1367d("camera2.captureRequest.option.", Void.class, (Object) null)).entrySet()) {
            if (((C1306at) entry.getKey()).mo4170c().startsWith("camera2.captureRequest.option.")) {
                C1306at atVar = (C1306at) entry.getKey();
                C1233i iVar = hVar.f3621a;
                C1308av avVar = hVar.f3622b;
                iVar.f3623a.mo4216c(atVar, avVar.mo3951C(atVar), avVar.mo3953E(atVar));
            } else {
                return;
            }
        }
    }
}
