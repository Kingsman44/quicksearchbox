package com.google.android.apps.gsa.staticplugins.accl;

import com.google.android.apps.gsa.staticplugins.accl.p7331c.C92798g;
import com.google.android.libraries.gsa.conversation.p1852f.C22579f;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.k */
/* compiled from: PG */
final class C92856k implements C22579f {

    /* renamed from: a */
    public final C58833ax f259068a;

    /* renamed from: b */
    private final C60870cx f259069b;

    /* renamed from: c */
    private final C58833ax f259070c;

    /* renamed from: d */
    private final C58833ax f259071d;

    /* renamed from: e */
    private final C60870cx f259072e;

    /* renamed from: f */
    private final C60870cx f259073f;

    /* renamed from: g */
    private final C60870cx f259074g;

    public C92856k(C58833ax axVar, C60870cx cxVar, C60870cx cxVar2, C58833ax axVar2, C58833ax axVar3, C60870cx cxVar3, C60870cx cxVar4) {
        this.f259068a = axVar;
        this.f259069b = cxVar;
        this.f259074g = cxVar2;
        this.f259070c = axVar2;
        this.f259071d = axVar3;
        this.f259073f = cxVar4;
        this.f259072e = C60922j.m93044g(cxVar3, C92852i.f259061a, C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo27686a() {
        return C60922j.m93044g(this.f259072e, C92818d.f258999a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo27687b() {
        if (!this.f259068a.mo56113h()) {
            return this.f259069b;
        }
        return C60922j.m93044g(this.f259069b, new C92845h(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo27688c() {
        if (!this.f259068a.mo56113h()) {
            return this.f259074g;
        }
        return C60922j.m93044g(this.f259074g, new C92833f(this), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C22585l mo27689d() {
        return new C92798g(this.f259070c, this.f259071d, this.f259072e, this.f259073f);
    }
}
