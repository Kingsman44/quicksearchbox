package com.google.apps.tiktok.account.api.controller;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.apps.tiktok.account.api.controller.bu */
/* compiled from: PG */
public final class C46010bu extends C46012bw {

    /* renamed from: a */
    public C58485gu f120853a;

    /* renamed from: b */
    private boolean f120854b;

    /* renamed from: c */
    private C58480gp f120855c;

    /* renamed from: d */
    private C58485gu f120856d;

    /* renamed from: e */
    private byte f120857e;

    /* renamed from: a */
    public final C46013bx mo50146a() {
        C58480gp gpVar = this.f120855c;
        if (gpVar != null) {
            this.f120856d = gpVar.mo55394f();
        } else if (this.f120856d == null) {
            this.f120856d = C58485gu.m89845m();
        }
        if (this.f120857e == 1) {
            return new C46011bv(this.f120854b, this.f120856d, this.f120853a);
        }
        throw new IllegalStateException("Missing required properties: canSwitchAccounts");
    }

    /* renamed from: b */
    public final C58480gp mo50147b() {
        if (this.f120855c == null) {
            this.f120855c = C58485gu.m89837e();
        }
        return this.f120855c;
    }

    /* renamed from: c */
    public final void mo50148c(boolean z) {
        this.f120854b = z;
        this.f120857e = 1;
    }
}
