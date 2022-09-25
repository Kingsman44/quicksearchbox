package com.google.android.apps.gsa.nga.engine.tclib;

import com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider;
import com.google.p4273bs.p4277b.p4278a.C56479s;
import com.google.p4273bs.p4277b.p4278a.C56481u;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.tclib.b */
/* compiled from: PG */
public final /* synthetic */ class C77984b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77984b f214768a = new C77984b();

    private /* synthetic */ C77984b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        WebrefAndPkgModelProvider webrefAndPkgModelProvider = (WebrefAndPkgModelProvider) obj;
        webrefAndPkgModelProvider.f167297c.lock();
        try {
            C56479s sVar = webrefAndPkgModelProvider.f167296b;
            if (sVar == null) {
                webrefAndPkgModelProvider.f167297c.unlock();
                return null;
            }
            C56481u uVar = sVar.f150861b;
            if (uVar == null) {
                uVar = C56481u.f150864e;
            }
            webrefAndPkgModelProvider.f167297c.unlock();
            return uVar;
        } catch (Throwable th) {
            webrefAndPkgModelProvider.f167297c.unlock();
            throw th;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
