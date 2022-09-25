package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.common.util.C144005e;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4554b.p4555a.C59644x;

/* renamed from: com.google.android.gms.learning.dynamite.training.s */
/* compiled from: PG */
public final /* synthetic */ class C144723s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C144588ad f391514a;

    /* renamed from: b */
    public final /* synthetic */ C144573b f391515b;

    /* renamed from: c */
    public final /* synthetic */ Context f391516c;

    /* renamed from: d */
    public final /* synthetic */ int f391517d;

    public /* synthetic */ C144723s(C144588ad adVar, int i, C144573b bVar, Context context) {
        this.f391514a = adVar;
        this.f391517d = i;
        this.f391515b = bVar;
        this.f391516c = context;
    }

    public final Object apply(Object obj) {
        C144588ad adVar = this.f391514a;
        int i = this.f391517d;
        C144573b bVar = this.f391515b;
        Context context = this.f391516c;
        RuntimeException runtimeException = (RuntimeException) obj;
        adVar.mo120077u(i, C58833ax.m90834k(C59644x.ERROR_REASON_RUNTIME_EXCEPTION), C58836b.f156633a);
        if (bVar.mo119980aN()) {
            C144005e.m234184a(context, runtimeException);
        }
        throw runtimeException;
    }
}
