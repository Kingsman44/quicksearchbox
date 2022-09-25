package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.android.libraries.assistant.contexttrigger.p1464h.C17741a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.q */
/* compiled from: PG */
public final /* synthetic */ class C17727q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C17730t f50934a;

    /* renamed from: b */
    public final /* synthetic */ C48919u f50935b;

    public /* synthetic */ C17727q(C17730t tVar, C48919u uVar) {
        this.f50934a = tVar;
        this.f50935b = uVar;
    }

    public final Object apply(Object obj) {
        C17730t tVar = this.f50934a;
        C48919u uVar = this.f50935b;
        C17696ab abVar = (C17696ab) obj;
        C17741a aVar = tVar.f50946i;
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        boolean isPresent = abVar.mo23435c().isPresent();
        C39141kp kpVar = aVar.f50964a;
        ((C19567d) kpVar.f102818aB.mo6453a()).mo24822a(1, aVar.f50965b, a.name(), Boolean.valueOf(isPresent));
        return null;
    }
}
