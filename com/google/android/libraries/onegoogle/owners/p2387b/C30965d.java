package com.google.android.libraries.onegoogle.owners.p2387b;

import com.google.android.libraries.onegoogle.common.C30926m;
import com.google.android.libraries.onegoogle.owners.C30977l;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.onegoogle.owners.b.d */
/* compiled from: PG */
final class C30965d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f83442a;

    /* renamed from: b */
    final /* synthetic */ long f83443b;

    /* renamed from: c */
    final /* synthetic */ C30967f f83444c;

    /* renamed from: d */
    private final String f83445d;

    public C30965d(C30967f fVar, boolean z, long j) {
        this.f83444c = fVar;
        this.f83442a = z;
        this.f83443b = j;
        this.f83445d = C30977l.m57836a(fVar.f83450c);
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        String a = C30926m.m57721a(th);
        C30967f fVar = this.f83444c;
        C30847m mVar = fVar.f83448a;
        mVar.mo36544e(this.f83445d, a, -1, fVar.f83449b, this.f83442a);
        this.f83444c.f83448a.mo36547h((double) (System.currentTimeMillis() - this.f83443b), this.f83445d, a, -1, this.f83444c.f83449b, this.f83442a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        int min = Math.min(((C58485gu) obj).size(), 10);
        C30967f fVar = this.f83444c;
        fVar.f83448a.mo36544e(this.f83445d, "OK", min, fVar.f83449b, this.f83442a);
        this.f83444c.f83448a.mo36547h((double) (System.currentTimeMillis() - this.f83443b), this.f83445d, "OK", min, this.f83444c.f83449b, this.f83442a);
    }
}
