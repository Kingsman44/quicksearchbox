package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.p6211a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.a.j */
/* compiled from: PG */
public final /* synthetic */ class C78785j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C78785j f216866a = new C78785j();

    private /* synthetic */ C78785j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C78245d dVar = (C78245d) obj;
        int h = dVar.mo73180b().mo73175h();
        if (h != 0) {
            boolean z = true;
            if (h != 3) {
                int h2 = dVar.mo73180b().mo73175h();
                if (h2 == 0) {
                    throw null;
                } else if (h2 != 2) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
