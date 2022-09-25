package dagger.p5294a;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: dagger.a.i */
/* compiled from: PG */
public final class C68223i extends C68216b {

    /* renamed from: b */
    public static final C69464a f184584b = C68221g.m98521a(Collections.emptyMap());

    public C68223i(Map map) {
        super(map);
    }

    /* renamed from: c */
    public static C69464a m98525c() {
        return f184584b;
    }

    /* renamed from: a */
    public final Map mo17428b() {
        LinkedHashMap b = C68217c.m98514b(this.f184577a.size());
        for (Map.Entry entry : this.f184577a.entrySet()) {
            b.put(entry.getKey(), ((C69464a) entry.getValue()).mo17428b());
        }
        return Collections.unmodifiableMap(b);
    }
}
