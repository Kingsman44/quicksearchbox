package com.google.android.libraries.search.logging.appflows;

import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.p3034a.C38769r;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.C37305o;
import java.util.EnumMap;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.search.logging.appflows.t */
/* compiled from: PG */
public final class C38826t implements C38780c {

    /* renamed from: a */
    public final C37305o f102444a;

    /* renamed from: b */
    public final String f102445b;

    /* renamed from: c */
    public final C38769r f102446c;

    /* renamed from: d */
    private final Map f102447d = new EnumMap(C38828b.class);

    /* renamed from: e */
    private final Map f102448e = new EnumMap(C38790m.class);

    public C38826t(String str, C37305o oVar, C38769r rVar) {
        this.f102445b = str;
        this.f102444a = oVar;
        this.f102446c = rVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C37215b mo41619a(C38828b bVar) {
        return C38779b.m68086a(this, bVar);
    }

    /* renamed from: b */
    public final synchronized C37215b mo41620b(C38828b bVar, C38792o oVar) {
        return (C37215b) Map.EL.computeIfAbsent(this.f102447d, bVar, new C38796s(this, oVar));
    }

    /* renamed from: c */
    public final synchronized C37215b mo41621c(C38790m mVar) {
        return (C37215b) Map.EL.computeIfAbsent(this.f102448e, mVar, new C38793p(this));
    }
}
