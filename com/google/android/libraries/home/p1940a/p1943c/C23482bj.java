package com.google.android.libraries.home.p1940a.p1943c;

import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.bj */
/* compiled from: PG */
public final class C23482bj extends C23581h {

    /* renamed from: b */
    public static final C23481bi f64218b = new C23481bi();

    /* renamed from: c */
    public static final C23482bj f64219c = new C23482bj(false, false);

    public C23482bj(boolean z, boolean z2) {
        super(C23542dp.LOCK_UNLOCK, z, z2, false, "lockUnlock", "state");
    }

    /* renamed from: e */
    public final void mo28889e(C52021ht htVar) {
        C69664n.m101061g(htVar, "valueBuilder");
        String str = true != Boolean.valueOf(this.f64597a).booleanValue() ? "unlock" : "lock";
        htVar.copyOnWrite();
        C52022hu huVar = (C52022hu) htVar.instance;
        C52022hu huVar2 = C52022hu.f136532f;
        huVar.f136534a = 1 | huVar.f136534a;
        huVar.f136535b = str;
    }
}
