package androidx.p182p;

import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.al */
/* compiled from: PG */
public final class C3929al {
    /* renamed from: a */
    public static final C3930am m11267a(String str, int i) {
        synchronized (C3930am.f12576a) {
            Map.Entry ceilingEntry = C3930am.f12576a.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                C3930am.f12576a.remove(ceilingEntry.getKey());
                C3930am amVar = (C3930am) ceilingEntry.getValue();
                amVar.f12577b = str;
                amVar.f12583h = i;
                C69664n.m101060f(amVar, "sqliteQuery");
                return amVar;
            }
            C3930am amVar2 = new C3930am(i);
            amVar2.f12577b = str;
            amVar2.f12583h = i;
            return amVar2;
        }
    }
}
