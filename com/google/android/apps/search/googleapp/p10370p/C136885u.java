package com.google.android.apps.search.googleapp.p10370p;

import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.common.p4522b.C58331bb;
import com.google.common.util.concurrent.C60888db;
import com.google.protos.p5145v.C65898b;
import com.google.protos.p5145v.C65901e;
import com.google.protos.p5145v.C65903g;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.p.u */
/* compiled from: PG */
public final class C136885u {

    /* renamed from: a */
    public final C136848ao f372559a;

    /* renamed from: b */
    public final boolean f372560b;

    /* renamed from: c */
    public final Executor f372561c;

    /* renamed from: d */
    public final C46180e f372562d;

    /* renamed from: e */
    public final C60888db f372563e;

    /* renamed from: f */
    private final C65903g f372564f;

    /* renamed from: g */
    private Optional f372565g = Optional.empty();

    public C136885u(Executor executor, C136848ao aoVar, C46180e eVar, C60888db dbVar, C65903g gVar, boolean z) {
        this.f372559a = aoVar;
        this.f372561c = executor;
        this.f372564f = gVar;
        this.f372560b = z;
        this.f372562d = eVar;
        this.f372563e = dbVar;
    }

    /* renamed from: a */
    public final C58331bb mo113423a() {
        if (this.f372565g.isPresent()) {
            return (C58331bb) this.f372565g.get();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(this.f372564f.f179230a);
        C58331bb bbVar = new C58331bb();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            for (C65898b x : ((C65901e) entry.getValue()).f179226a) {
                bbVar.mo54920x(x, Integer.valueOf(intValue));
            }
        }
        this.f372565g = Optional.m71637of(bbVar);
        return bbVar;
    }
}
