package com.google.android.libraries.silk.p3240c;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.common.p4552o.C59591api;
import com.google.common.p4552o.apn;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5488io.p5490b.C70129u;

/* renamed from: com.google.android.libraries.silk.c.q */
/* compiled from: PG */
public final class C41871q {

    /* renamed from: a */
    public static final byte[] f109263a = new byte[0];

    /* renamed from: b */
    public final C21232ab f109264b;

    /* renamed from: c */
    public final Executor f109265c;

    /* renamed from: d */
    public final C40480q f109266d;

    /* renamed from: e */
    public final C57695ab f109267e;

    /* renamed from: f */
    private final Optional f109268f;

    public C41871q(C21232ab abVar, Executor executor, Optional optional, C40480q qVar, C57695ab abVar2) {
        this.f109264b = abVar;
        this.f109265c = executor;
        this.f109268f = optional;
        this.f109266d = qVar;
        this.f109267e = abVar2;
    }

    /* renamed from: a */
    public final C70129u mo44345a(Optional optional, Optional optional2, C63010eb ebVar) {
        if (optional.isPresent()) {
            return C70129u.m102079i(optional.get());
        }
        if (optional2.isPresent()) {
            return this.f109264b.mo26139b((String) optional2.get()).mo61657s().mo61670j(C41827k.f109205a).mo61670j(new C41839l(ebVar));
        }
        try {
            return C70129u.m102079i(ebVar.mo59015n(f109263a, C62921ba.m95368a()));
        } catch (C62974ct e) {
            return C70129u.m102078g(new UnsupportedOperationException("Empty byte array not a valid proto for ".concat(String.valueOf(String.valueOf(ebVar.getClass()))), e));
        }
    }

    /* renamed from: b */
    public final void mo44346b(C59591api api, String str, String str2) {
        this.f109268f.ifPresent(new C41771c(this, api, str, str2));
    }

    /* renamed from: c */
    public final void mo44347c(String str, String str2) {
        C59591api api = (C59591api) apn.f159680i.createBuilder();
        api.copyOnWrite();
        apn apn = (apn) api.instance;
        apn.f159685d = 1;
        apn.f159682a |= 32;
        mo44346b(api, str, str2);
    }
}
