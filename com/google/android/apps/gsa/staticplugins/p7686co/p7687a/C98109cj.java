package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.cj */
/* compiled from: PG */
final class C98109cj extends C91953ad {

    /* renamed from: a */
    final /* synthetic */ C98116cq f273961a;

    /* renamed from: b */
    final /* synthetic */ C98117cr f273962b;

    public C98109cj(C98117cr crVar, C98116cq cqVar) {
        this.f273962b = crVar;
        this.f273961a = cqVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo85609b(C7718hj hjVar) {
        boolean a = this.f273961a.mo90968a(hjVar);
        if (a) {
            C98117cr crVar = this.f273962b;
            Queue queue = crVar.f273975d;
            long j = hjVar.f26969j;
            long b = crVar.f273974c.mo26870b();
            C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
            if (a2 == null) {
                a2 = C7746ik.UNKNOWN;
            }
            queue.add(C98110ck.m162491e(j, b, a2));
        }
        return a;
    }
}
