package com.google.android.apps.gsa.opaonboarding;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.opaonboarding.x */
/* compiled from: PG */
final class C84034x extends C84036z {

    /* renamed from: a */
    final /* synthetic */ Future f228903a;

    /* renamed from: b */
    final /* synthetic */ C83874ah f228904b;

    /* renamed from: c */
    final /* synthetic */ C83874ah f228905c;

    public C84034x(Future future, C83874ah ahVar, C83874ah ahVar2) {
        this.f228903a = future;
        this.f228904b = ahVar;
        this.f228905c = ahVar2;
    }

    /* renamed from: h */
    public final C58485gu mo77495h() {
        try {
            return C58485gu.m89846n((C83956t) this.f228904b.mo17879a(C90877ak.m148472f(this.f228903a)));
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            return C58485gu.m89846n((C83956t) this.f228905c.mo17879a(e));
        }
    }
}
