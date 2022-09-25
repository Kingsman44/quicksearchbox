package com.google.android.libraries.search.p3047m.p3050b;

/* renamed from: com.google.android.libraries.search.m.b.c */
/* compiled from: PG */
public final class C39227c {
    /* renamed from: a */
    public static C39226b m68657a(String str) {
        if (str == null) {
            return C39226b.TAG_UNATTRIBUTED;
        }
        if (!C39228d.f103351b.containsKey(str)) {
            return C39226b.TAG_INVALID_ATTRIBUTION_DO_NOT_USE;
        }
        return (C39226b) C39228d.f103351b.get(str);
    }

    /* renamed from: b */
    public static String m68658b(C39226b bVar) {
        return (bVar == C39226b.TAG_DO_NOT_USE || bVar == C39226b.TAG_INVALID_ATTRIBUTION_DO_NOT_USE || bVar == C39226b.TAG_UNATTRIBUTED || !C39228d.f103350a.containsKey(bVar)) ? "invalid_attribution" : (String) C39228d.f103350a.get(bVar);
    }
}
