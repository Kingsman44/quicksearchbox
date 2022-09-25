package androidx.p201w.p202a;

import android.webkit.WebMessagePort;
import androidx.p201w.C4361e;
import androidx.p201w.C4362f;
import androidx.p201w.C4363g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.p5648a.C72563b;

/* renamed from: androidx.w.a.z */
/* compiled from: PG */
public final class C4357z extends C4363g {

    /* renamed from: a */
    private WebMessagePort f13970a;

    /* renamed from: b */
    private WebMessagePortBoundaryInterface f13971b;

    public C4357z(WebMessagePort webMessagePort) {
        this.f13970a = webMessagePort;
    }

    public C4357z(InvocationHandler invocationHandler) {
        this.f13971b = (WebMessagePortBoundaryInterface) C72563b.m107251a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: e */
    public static C4363g[] m12502e(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        C4363g[] gVarArr = new C4363g[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            gVarArr[i] = new C4357z(webMessagePortArr[i]);
        }
        return gVarArr;
    }

    /* renamed from: f */
    private final WebMessagePort m12503f() {
        if (this.f13970a == null) {
            C4332ai aiVar = C4326ac.f13951a;
            this.f13970a = (WebMessagePort) aiVar.f13957a.convertWebMessagePort(Proxy.getInvocationHandler(this.f13971b));
        }
        return this.f13970a;
    }

    /* renamed from: a */
    public final WebMessagePort mo9284a() {
        return m12503f();
    }

    /* renamed from: b */
    public final void mo9285b() {
        C4335d dVar = C4325ab.f13948a;
        C4344m.m12448e(m12503f());
    }

    /* renamed from: c */
    public final void mo9286c(C4361e eVar) {
        C4335d dVar = C4325ab.f13948a;
        C4344m.m12449f(m12503f(), C4344m.m12445b(eVar));
    }

    /* renamed from: d */
    public final void mo9287d(C4362f fVar) {
        C4335d dVar = C4325ab.f13948a;
        C4344m.m12453j(m12503f(), fVar);
    }
}
