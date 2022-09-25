package androidx.work;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public final class OverwritingInputMerger extends C4638s {
    /* renamed from: a */
    public final C4632m mo9295a(List list) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap2.putAll(Collections.unmodifiableMap(((C4632m) it.next()).f14551b));
        }
        C4631l.m13031b(hashMap2, hashMap);
        return C4631l.m13030a(hashMap);
    }
}
