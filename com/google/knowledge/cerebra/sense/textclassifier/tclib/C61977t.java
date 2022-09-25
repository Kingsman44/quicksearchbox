package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.t */
/* compiled from: PG */
final class C61977t extends C61958dn {

    /* renamed from: a */
    public ParcelFileDescriptor f167498a;

    /* renamed from: b */
    public ParcelFileDescriptor f167499b;

    /* renamed from: c */
    public ParcelFileDescriptor f167500c;

    /* renamed from: d */
    public ParcelFileDescriptor f167501d;

    /* renamed from: e */
    private C58480gp f167502e;

    /* renamed from: f */
    private C58485gu f167503f;

    public C61977t() {
    }

    public C61977t(C61961dq dqVar) {
        C61978u uVar = (C61978u) dqVar;
        this.f167503f = uVar.f167504a;
        this.f167498a = uVar.f167505b;
        this.f167499b = uVar.f167506c;
        this.f167500c = uVar.f167507d;
        this.f167501d = uVar.f167508e;
    }

    /* renamed from: a */
    public final C58480gp mo58420a() {
        if (this.f167502e == null) {
            if (this.f167503f == null) {
                this.f167502e = C58485gu.m89837e();
            } else {
                C58480gp e = C58485gu.m89837e();
                this.f167502e = e;
                e.mo55396h(this.f167503f);
                this.f167503f = null;
            }
        }
        return this.f167502e;
    }

    /* renamed from: b */
    public final C61961dq mo58421b() {
        C58480gp gpVar = this.f167502e;
        if (gpVar != null) {
            this.f167503f = gpVar.mo55394f();
        } else if (this.f167503f == null) {
            this.f167503f = C58485gu.m89845m();
        }
        return new C61978u(this.f167503f, this.f167498a, this.f167499b, this.f167500c, this.f167501d);
    }
}
