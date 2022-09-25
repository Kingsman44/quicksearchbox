package com.google.android.libraries.performance.primes.metrics.p2403a;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.o */
/* compiled from: PG */
abstract class C31282o {
    /* renamed from: a */
    public abstract MessageLite mo36993a(String str, Object obj);

    /* renamed from: b */
    public abstract MessageLite mo36994b(MessageLite messageLite, MessageLite messageLite2);

    /* renamed from: c */
    public abstract String mo36995c(MessageLite messageLite);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo36996d(Map map) {
        MessageLite a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getValue() == null || (a = mo36993a((String) entry.getKey(), entry.getValue())) == null)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final List mo36997e(List list, List list2) {
        MessageLite messageLite;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageLite messageLite2 = (MessageLite) it.next();
            String c = mo36995c(messageLite2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    messageLite = null;
                    break;
                }
                messageLite = (MessageLite) it2.next();
                if (c.equals(mo36995c(messageLite))) {
                    break;
                }
            }
            MessageLite b = mo36994b(messageLite2, messageLite);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
