package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.common.util.C144005e;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4554b.p4555a.C59644x;

/* renamed from: com.google.android.gms.learning.dynamite.training.af */
/* compiled from: PG */
public final /* synthetic */ class C144663af implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerImpl f391413a;

    /* renamed from: b */
    public final /* synthetic */ C144588ad f391414b;

    /* renamed from: c */
    public final /* synthetic */ C144573b f391415c;

    /* renamed from: d */
    public final /* synthetic */ Context f391416d;

    public /* synthetic */ C144663af(InAppTrainerImpl inAppTrainerImpl, C144588ad adVar, C144573b bVar, Context context) {
        this.f391413a = inAppTrainerImpl;
        this.f391414b = adVar;
        this.f391415c = bVar;
        this.f391416d = context;
    }

    public final Object apply(Object obj) {
        InAppTrainerImpl inAppTrainerImpl = this.f391413a;
        C144588ad adVar = this.f391414b;
        C144573b bVar = this.f391415c;
        Context context = this.f391416d;
        RuntimeException runtimeException = (RuntimeException) obj;
        adVar.mo120077u(2, C58833ax.m90834k(C59644x.ERROR_REASON_RUNTIME_EXCEPTION), C58833ax.m90834k(inAppTrainerImpl.f391381d));
        if (bVar.mo119980aN()) {
            C144005e.m234184a(context, runtimeException);
        }
        throw runtimeException;
    }
}
