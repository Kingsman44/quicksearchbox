package com.google.android.libraries.gsa.p1876k.p1877a;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22872h;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.gsa.k.a.k */
/* compiled from: PG */
public final /* synthetic */ class C22857k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Class f62924a;

    /* renamed from: b */
    public final /* synthetic */ C22870f f62925b;

    public /* synthetic */ C22857k(Class cls, C22870f fVar) {
        this.f62924a = cls;
        this.f62925b = fVar;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        Class cls = this.f62924a;
        C22870f fVar = this.f62925b;
        Class a = C22872h.m42741a(cls);
        try {
            fVar.run();
            C22872h.m42741a(a);
            return null;
        } catch (Throwable th) {
            C22872h.m42741a(a);
            throw th;
        }
    }
}
