package com.google.android.apps.gsa.shared.logger.p7051b;

import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.t */
/* compiled from: PG */
final class C89870t {

    /* renamed from: a */
    public final C89849ae f246224a;

    /* renamed from: b */
    public final C89851ag f246225b;

    /* renamed from: c */
    public final Map f246226c;

    public C89870t(C89849ae aeVar, C89851ag agVar) {
        this.f246224a = aeVar;
        this.f246225b = agVar;
        this.f246226c = null;
    }

    private C89870t(Map map) {
        this.f246224a = C89849ae.UNKNOWN_EVENT;
        this.f246225b = C89851ag.UNKNOWN;
        this.f246226c = map;
    }

    /* renamed from: a */
    static /* synthetic */ C89870t m146331a(C89849ae aeVar, C89851ag agVar) {
        return new C89870t(aeVar, agVar);
    }

    /* renamed from: b */
    static /* synthetic */ C89870t m146332b(Map map) {
        return new C89870t(map);
    }
}
