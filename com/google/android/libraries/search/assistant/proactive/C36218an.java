package com.google.android.libraries.search.assistant.proactive;

import com.google.assistant.p3803ag.p3809c.C49097gi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.proactive.an */
/* compiled from: PG */
final class C36218an {

    /* renamed from: a */
    public int f94614a = 0;

    /* renamed from: b */
    final List f94615b = new ArrayList();

    /* renamed from: c */
    final Map f94616c = new HashMap();

    /* renamed from: a */
    public final void mo40024a(int i, C49097gi giVar) {
        this.f94614a = Math.max(this.f94614a, giVar.f126976e);
        Map map = this.f94616c;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            this.f94616c.put(valueOf, new ArrayList());
        }
        List list = (List) this.f94616c.get(valueOf);
        if (list != null) {
            list.add(giVar);
        }
    }

    /* renamed from: b */
    public final void mo40025b(C49097gi giVar) {
        this.f94614a = Math.max(this.f94614a, giVar.f126976e);
        this.f94615b.add(giVar);
    }
}
