package com.google.android.apps.gsa.nga.engine.tclib;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61960dp;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.tclib.g */
/* compiled from: PG */
public final /* synthetic */ class C77989g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77989g f214780a = new C77989g();

    private /* synthetic */ C77989g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        WebrefAndPkgModelProvider webrefAndPkgModelProvider = (WebrefAndPkgModelProvider) obj;
        webrefAndPkgModelProvider.f167297c.lock();
        try {
            if (webrefAndPkgModelProvider.f167295a == null) {
                webrefAndPkgModelProvider.f167297c.unlock();
                return null;
            }
            C58480gp e = C58485gu.m89837e();
            C58801sm G = webrefAndPkgModelProvider.f167295a.mo58442e().listIterator(0);
            while (G.hasNext()) {
                e.mo55395g(((C61960dp) G.next()).mo58436e());
            }
            C58485gu f = e.mo55394f();
            webrefAndPkgModelProvider.f167297c.unlock();
            return f;
        } catch (Throwable th) {
            webrefAndPkgModelProvider.f167297c.unlock();
            throw th;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
