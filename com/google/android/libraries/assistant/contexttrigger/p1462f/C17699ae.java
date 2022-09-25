package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48899an;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58490gz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.ae */
/* compiled from: PG */
public final /* synthetic */ class C17699ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f50892a;

    /* renamed from: b */
    public final /* synthetic */ C58490gz f50893b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f50894c;

    public /* synthetic */ C17699ae(C58480gp gpVar, C58490gz gzVar, C58480gp gpVar2) {
        this.f50892a = gpVar;
        this.f50893b = gzVar;
        this.f50894c = gpVar2;
    }

    public final Object apply(Object obj) {
        C58480gp gpVar = this.f50892a;
        C58490gz gzVar = this.f50893b;
        C58480gp gpVar2 = this.f50894c;
        Void voidR = (Void) obj;
        if (gpVar.mo55394f().isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(new C17694a((C48899an) gpVar.mo55394f().get(0), gzVar.mo55427f(false), (Optional) gpVar2.mo55394f().get(0)));
    }
}
