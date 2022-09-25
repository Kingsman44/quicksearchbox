package com.google.apps.tiktok.dataservice.p3635a.p3636a;

import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.common.base.C58887cx;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.dataservice.a.a.b */
/* compiled from: PG */
public final class C46681b implements C46689ag {

    /* renamed from: a */
    private final Object f121956a;

    /* renamed from: b */
    private final C46407v f121957b;

    /* renamed from: c */
    private final MessageLite f121958c;

    /* renamed from: d */
    private final C60930r f121959d;

    public C46681b(Object obj, C46407v vVar, MessageLite messageLite, C60930r rVar) {
        this.f121956a = obj;
        vVar.getClass();
        this.f121957b = vVar;
        messageLite.getClass();
        this.f121958c = messageLite;
        rVar.getClass();
        this.f121959d = rVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(new C60817ay(C60922j.m93044g(this.f121957b.mo50345e(this.f121958c), C46680a.f121955a, C60826bg.f164896a)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        try {
            return this.f121957b.mo50346f(this.f121958c, this.f121959d.mo18058a());
        } catch (Exception e) {
            C58887cx.m90980g(e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return this.f121956a;
    }
}
