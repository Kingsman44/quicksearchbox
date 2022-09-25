package com.google.android.libraries.web.p3408h.p3409a.p3410a.p3411a;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.h.a.a.a.f */
/* compiled from: PG */
public final class C43781f {

    /* renamed from: a */
    public final Map f114161a = new LinkedHashMap();

    /* renamed from: b */
    public boolean f114162b;

    /* renamed from: c */
    private final C71422aw f114163c;

    public C43781f(C71422aw awVar) {
        this.f114163c = awVar;
    }

    /* renamed from: a */
    public final C43778c mo46798a(C43775a aVar) {
        C69664n.m101061g(aVar, "channelName");
        C19559g.m37304c();
        if (this.f114162b) {
            Map map = this.f114161a;
            Object obj = map.get(aVar);
            if (obj == null) {
                obj = new C43778c(aVar, this.f114163c);
                map.put(aVar, obj);
            }
            return (C43778c) obj;
        }
        throw new IllegalArgumentException("Cannot access message channels before the main document is created.");
    }
}
