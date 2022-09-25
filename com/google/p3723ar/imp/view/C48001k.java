package com.google.p3723ar.imp.view;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.imp.view.k */
/* compiled from: PG */
public final /* synthetic */ class C48001k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C47985ae f124229a;

    /* renamed from: b */
    public final /* synthetic */ Context f124230b;

    public /* synthetic */ C48001k(C47985ae aeVar, Context context) {
        this.f124229a = aeVar;
        this.f124230b = context;
    }

    public final Object call() {
        C47985ae aeVar = this.f124229a;
        Context context = this.f124230b;
        String str = C48004n.f124238a;
        View b = View.m85151b(aeVar.f124191b, aeVar.f124194e, context);
        View.nSetup(b.f124179a, aeVar.f124193d);
        return b;
    }
}
