package com.google.android.libraries.cast.usonia.adapter.service;

import java.util.HashMap;
import java.util.Map;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.i */
/* compiled from: PG */
final class C19721i extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ HashMap f54759a;

    /* renamed from: b */
    final /* synthetic */ C19723k f54760b;

    /* renamed from: c */
    final /* synthetic */ C19717e f54761c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19721i(HashMap hashMap, C19723k kVar, C19717e eVar) {
        super(0);
        this.f54759a = hashMap;
        this.f54760b = kVar;
        this.f54761c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        for (Map.Entry entry : this.f54759a.entrySet()) {
            ((Number) entry.getValue()).intValue();
            this.f54760b.f54770c.mo122754j((String) entry.getKey(), this.f54761c).mo122498q(C19723k.f54769b);
        }
        this.f54759a.clear();
        return C69788q.f186170a;
    }
}
