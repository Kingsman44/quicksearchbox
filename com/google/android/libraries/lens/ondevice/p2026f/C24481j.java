package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.ondevice.f.j */
/* compiled from: PG */
public final /* synthetic */ class C24481j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C24491t f66997a;

    /* renamed from: b */
    public final /* synthetic */ boolean f66998b;

    public /* synthetic */ C24481j(C24491t tVar, boolean z) {
        this.f66997a = tVar;
        this.f66998b = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C24491t tVar = this.f66997a;
        boolean z = this.f66998b;
        C24803n b = C24491t.m45561b(new ArrayList((Collection) ((Map.Entry) obj).getValue()));
        if (z) {
            tVar.mo29922k(b);
        }
        return b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
