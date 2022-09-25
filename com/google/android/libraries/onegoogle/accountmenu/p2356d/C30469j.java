package com.google.android.libraries.onegoogle.accountmenu.p2356d;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.d.j */
/* compiled from: PG */
final class C30469j extends C30473n {

    /* renamed from: a */
    public boolean f82314a;

    /* renamed from: b */
    public byte f82315b;

    /* renamed from: c */
    private C30480u f82316c;

    /* renamed from: d */
    private boolean f82317d;

    /* renamed from: e */
    private boolean f82318e;

    /* renamed from: f */
    private C58480gp f82319f;

    /* renamed from: g */
    private C58485gu f82320g;

    public C30469j() {
    }

    public C30469j(C30474o oVar) {
        C30470k kVar = (C30470k) oVar;
        this.f82316c = kVar.f82321a;
        this.f82317d = kVar.f82322b;
        this.f82314a = kVar.f82323c;
        this.f82318e = kVar.f82324d;
        this.f82320g = kVar.f82325e;
        this.f82315b = 15;
    }

    /* renamed from: a */
    public final C30474o mo36084a() {
        C30480u uVar;
        C58480gp gpVar = this.f82319f;
        if (gpVar != null) {
            this.f82320g = gpVar.mo55394f();
        } else if (this.f82320g == null) {
            this.f82320g = C58485gu.m89845m();
        }
        if (this.f82315b == 15 && (uVar = this.f82316c) != null) {
            return new C30470k(uVar, this.f82317d, this.f82314a, this.f82318e, this.f82320g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f82316c == null) {
            sb.append(" restrictedConfiguration");
        }
        if ((this.f82315b & 1) == 0) {
            sb.append(" showUseWithoutAnAccount");
        }
        if ((this.f82315b & 2) == 0) {
            sb.append(" allowRingsInternal");
        }
        if ((this.f82315b & 4) == 0) {
            sb.append(" showMyGoogleChipInEmbeddedMenuHeader");
        }
        if ((this.f82315b & 8) == 0) {
            sb.append(" showSwitchProfileAction");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58480gp mo36085b() {
        if (this.f82319f == null) {
            if (this.f82320g == null) {
                this.f82319f = C58485gu.m89837e();
            } else {
                C58480gp e = C58485gu.m89837e();
                this.f82319f = e;
                e.mo55396h(this.f82320g);
                this.f82320g = null;
            }
        }
        return this.f82319f;
    }

    /* renamed from: c */
    public final void mo36086c(C30480u uVar) {
        if (uVar != null) {
            this.f82316c = uVar;
            return;
        }
        throw new NullPointerException("Null restrictedConfiguration");
    }

    /* renamed from: d */
    public final void mo36087d(boolean z) {
        this.f82318e = z;
        this.f82315b = (byte) (this.f82315b | 8);
    }

    /* renamed from: e */
    public final void mo36088e(boolean z) {
        this.f82317d = z;
        this.f82315b = (byte) (this.f82315b | 1);
    }
}
