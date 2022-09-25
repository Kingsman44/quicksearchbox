package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.w */
/* compiled from: PG */
public final class C111929w {

    /* renamed from: a */
    public final String f310960a;

    /* renamed from: b */
    public final C69464a f310961b;

    /* renamed from: c */
    final /* synthetic */ C111890ab f310962c;

    /* renamed from: d */
    private C60870cx f310963d;

    /* renamed from: e */
    private final String f310964e;

    public C111929w(C111890ab abVar, String str, C69464a aVar) {
        this.f310962c = abVar;
        this.f310960a = str;
        this.f310961b = aVar;
        this.f310964e = "loadModel_".concat(String.valueOf(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C60870cx mo99299a() {
        if (this.f310963d == null) {
            ((C59052c) ((C59052c) C111890ab.f310908a.mo56224b()).mo56372aa(27468)).mo56389s("Loading model %s ..", this.f310960a);
            C60870cx c = C111890ab.f310909b.mo105234c(this.f310964e, new C111924r(this));
            this.f310963d = c;
            c.mo4106b(new C111925s(this), C60826bg.f164896a);
        }
        return this.f310963d;
    }

    /* renamed from: b */
    public final synchronized Optional mo99300b() {
        C60870cx cxVar = this.f310963d;
        if (cxVar != null && cxVar.isDone()) {
            try {
                return Optional.m71637of(((C111917k) C60856cj.m92909r(this.f310963d)).mo99296c());
            } catch (ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) C111890ab.f310908a.mo56226d()).mo56382g(e)).mo56372aa(27469)).mo56386p("Failure during prediction loading.");
            }
        }
        return Optional.empty();
    }
}
