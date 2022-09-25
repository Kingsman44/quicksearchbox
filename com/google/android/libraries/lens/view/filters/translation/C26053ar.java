package com.google.android.libraries.lens.view.filters.translation;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ar */
/* compiled from: PG */
public final /* synthetic */ class C26053ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Locale f70776a;

    public /* synthetic */ C26053ar(Locale locale) {
        this.f70776a = locale;
    }

    public final Object apply(Object obj) {
        return (C58528ij) Collection.EL.stream((C58528ij) obj).filter(new C26055at(this.f70776a)).collect(C58370cn.f155947b);
    }
}
