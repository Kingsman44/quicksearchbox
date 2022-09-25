package androidx.camera.core.p069a;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.core.a.bz */
/* compiled from: PG */
public final class C1339bz extends C1343cc implements C1338by {

    /* renamed from: a */
    public static final C1307au f3819a = C1307au.OPTIONAL;

    private C1339bz(TreeMap treeMap) {
        super(treeMap);
    }

    /* renamed from: g */
    public static C1339bz m3625g() {
        return new C1339bz(new TreeMap(f3823b));
    }

    /* renamed from: l */
    public static C1339bz m3626l(C1308av avVar) {
        TreeMap treeMap = new TreeMap(f3823b);
        for (C1306at atVar : avVar.mo3959i()) {
            Set<C1307au> h = avVar.mo3958h(atVar);
            ArrayMap arrayMap = new ArrayMap();
            for (C1307au auVar : h) {
                arrayMap.put(auVar, avVar.mo3955G(atVar, auVar));
            }
            treeMap.put(atVar, arrayMap);
        }
        return new C1339bz(treeMap);
    }

    /* renamed from: a */
    public final void mo4215a(C1306at atVar, Object obj) {
        mo4216c(atVar, f3819a, obj);
    }

    /* renamed from: c */
    public final void mo4216c(C1306at atVar, C1307au auVar, Object obj) {
        C1307au auVar2;
        Map map = (Map) this.f3825d.get(atVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f3825d.put(atVar, arrayMap);
            arrayMap.put(auVar, obj);
            return;
        }
        C1307au auVar3 = (C1307au) Collections.min(map.keySet());
        if (Objects.equals(map.get(auVar3), obj) || !((auVar3 == C1307au.ALWAYS_OVERRIDE && auVar == C1307au.ALWAYS_OVERRIDE) || (auVar3 == (auVar2 = C1307au.REQUIRED) && auVar == auVar2))) {
            map.put(auVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + atVar.mo4170c() + ", existing value (" + auVar3 + ")=" + map.get(auVar3) + ", conflicting (" + auVar + ")=" + obj);
    }
}
