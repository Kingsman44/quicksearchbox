package com.google.android.apps.search.googleapp.promomanager.p10375d;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.p4017at.p4086k.p4087a.p4093c.p4094a.C54524f;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.d.f */
/* compiled from: PG */
public final class C137054f {

    /* renamed from: a */
    public static final C59071e f372980a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.d.f");

    /* renamed from: b */
    public final C42876ab f372981b;

    /* renamed from: c */
    public final String f372982c;

    /* renamed from: d */
    public final C54524f f372983d;

    /* renamed from: e */
    public final C60950i f372984e;

    /* renamed from: f */
    public final C37215b f372985f;

    /* renamed from: g */
    private final boolean f372986g;

    /* renamed from: h */
    private final C60887da f372987h;

    /* renamed from: i */
    private final C60888db f372988i;

    public C137054f(C42876ab abVar, boolean z, String str, C54524f fVar, C60887da daVar, C60888db dbVar, C60950i iVar, C37215b bVar) {
        this.f372981b = abVar;
        this.f372986g = z;
        this.f372982c = str;
        this.f372983d = fVar;
        this.f372987h = daVar;
        this.f372988i = dbVar;
        this.f372984e = iVar;
        this.f372985f = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo113482a() {
        ((C59052c) ((C59052c) f372980a.mo56224b()).mo56372aa(40890)).mo56386p("#fetchAndCacheConfiguration");
        if (!this.f372986g) {
            return C60866ct.f164955a;
        }
        C60870cx d = this.f372981b.mo46042d();
        return C47633f.m84733g(C47636i.m84746e(d).mo51519b(new C137051c(this, d), this.f372987h)).mo51516i(new C137052d(this), this.f372988i).mo51513e(RuntimeException.class, C137053e.f372979a, this.f372988i);
    }
}
