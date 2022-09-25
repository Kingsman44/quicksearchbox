package androidx.p182p;

import android.util.Log;
import androidx.p182p.p184b.C3937a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.ae */
/* compiled from: PG */
public final class C3922ae {

    /* renamed from: a */
    public final Map f12554a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo8165a(C3937a... aVarArr) {
        C69664n.m101061g(aVarArr, "migrations");
        for (C3937a aVar : aVarArr) {
            int i = aVar.f12596a;
            int i2 = aVar.f12597b;
            Map map = this.f12554a;
            Integer valueOf = Integer.valueOf(i);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            Integer valueOf2 = Integer.valueOf(i2);
            if (treeMap.containsKey(valueOf2)) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(valueOf2) + " with " + aVar);
            }
            treeMap.put(valueOf2, aVar);
        }
    }
}
