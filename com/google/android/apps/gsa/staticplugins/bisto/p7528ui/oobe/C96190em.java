package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.common.base.C58844bh;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.em */
/* compiled from: PG */
public final /* synthetic */ class C96190em implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96206fb f269258a;

    public /* synthetic */ C96190em(C96206fb fbVar) {
        this.f269258a = fbVar;
    }

    public final C60870cx apply(Object obj) {
        C96206fb fbVar = this.f269258a;
        Boolean bool = (Boolean) obj;
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        if (fbVar.f269298m) {
            fbVar.f269294i.set(bArr);
            C58485gu i = C58485gu.m89841i(C96206fb.f269289d.mo56924f(C58889cz.f156731b));
            AtomicReference atomicReference = new AtomicReference();
            return C60846c.m92878g((C60838bs) C60856cj.m92908q(C60922j.m93044g(C60838bs.m92859i(C59417y.m92319e(new C96202ey(fbVar, i, atomicReference, bArr), new C96203ez(fbVar, atomicReference, i), C58844bh.ALWAYS_TRUE, fbVar.f269290e)), new C96199ev(fbVar), fbVar.f269290e), fbVar.f269295j, TimeUnit.MILLISECONDS, fbVar.f269290e), Exception.class, C96200ew.f269271a, C60826bg.f164896a);
        }
        SettableFuture settableFuture = new SettableFuture();
        Objects.requireNonNull(settableFuture);
        C96201ex exVar = new C96201ex(settableFuture);
        return C60922j.m93045h(C60846c.m92878g((C60838bs) C60856cj.m92908q(C60922j.m93044g(C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(fbVar.mo90005a()), new C96193ep(fbVar, exVar), fbVar.f269290e), new C96194eq(fbVar, exVar), fbVar.f269290e)), new C96185eh(fbVar, bArr), fbVar.f269290e), new C96186ei(settableFuture), fbVar.f269290e), new C96187ej(fbVar), fbVar.f269290e), fbVar.f269295j, TimeUnit.MILLISECONDS, fbVar.f269290e), Exception.class, C96188ek.f269256a, C60826bg.f164896a), new C96189el(fbVar), fbVar.f269290e);
    }
}
