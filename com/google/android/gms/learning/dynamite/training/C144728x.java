package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.common.util.C144005e;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4554b.p4555a.C59644x;

/* renamed from: com.google.android.gms.learning.dynamite.training.x */
/* compiled from: PG */
public final /* synthetic */ class C144728x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerImpl f391523a;

    /* renamed from: b */
    public final /* synthetic */ C144588ad f391524b;

    /* renamed from: c */
    public final /* synthetic */ C144573b f391525c;

    /* renamed from: d */
    public final /* synthetic */ Context f391526d;

    public /* synthetic */ C144728x(InAppTrainerImpl inAppTrainerImpl, C144588ad adVar, C144573b bVar, Context context) {
        this.f391523a = inAppTrainerImpl;
        this.f391524b = adVar;
        this.f391525c = bVar;
        this.f391526d = context;
    }

    public final Object apply(Object obj) {
        InAppTrainerImpl inAppTrainerImpl = this.f391523a;
        C144588ad adVar = this.f391524b;
        C144573b bVar = this.f391525c;
        Context context = this.f391526d;
        RuntimeException runtimeException = (RuntimeException) obj;
        adVar.mo120077u(3, C58833ax.m90834k(C59644x.ERROR_REASON_RUNTIME_EXCEPTION), C58833ax.m90834k(inAppTrainerImpl.f391381d));
        if (bVar.mo119980aN()) {
            C144005e.m234184a(context, runtimeException);
        }
        throw runtimeException;
    }
}
