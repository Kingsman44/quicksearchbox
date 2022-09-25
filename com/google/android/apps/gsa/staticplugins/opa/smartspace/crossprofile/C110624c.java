package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.c */
/* compiled from: PG */
public final /* synthetic */ class C110624c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C110645k f308290a;

    public /* synthetic */ C110624c(C110645k kVar) {
        this.f308290a = kVar;
    }

    public final Object apply(Object obj) {
        return (List) Collection.EL.stream((List) obj).filter(new C110643i(this.f308290a)).collect(Collectors.toList());
    }
}
