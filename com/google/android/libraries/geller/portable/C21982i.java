package com.google.android.libraries.geller.portable;

import com.google.protos.p5129p.p5131b.C65819cw;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.portable.i */
/* compiled from: PG */
public final /* synthetic */ class C21982i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Geller f60631a;

    /* renamed from: b */
    public final /* synthetic */ String f60632b;

    /* renamed from: c */
    public final /* synthetic */ C65819cw f60633c;

    public /* synthetic */ C21982i(Geller geller, String str, C65819cw cwVar) {
        this.f60631a = geller;
        this.f60632b = str;
        this.f60633c = cwVar;
    }

    public final Object call() {
        Geller geller = this.f60631a;
        String str = this.f60632b;
        C65819cw cwVar = this.f60633c;
        return Boolean.valueOf(geller.nativeUpdateMetadata(geller.f60381c, geller.mo27174a(str), cwVar.toByteArray(), true));
    }
}
