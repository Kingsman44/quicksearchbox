package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.em */
/* compiled from: PG */
public abstract class C80765em {
    /* renamed from: e */
    public static String m128630e(C58495hd hdVar) {
        return (String) Collection.EL.stream(hdVar.entrySet()).map(C80763ek.f221676a).collect(Collectors.joining(";"));
    }

    /* renamed from: a */
    public abstract C58495hd mo74574a();

    /* renamed from: b */
    public abstract C58495hd mo74575b();

    /* renamed from: c */
    public abstract boolean mo74576c();

    /* renamed from: d */
    public abstract boolean mo74577d();
}
