package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.a */
/* compiled from: PG */
final class C98172a extends C98202bc {

    /* renamed from: a */
    private C58526ih f274134a;

    /* renamed from: b */
    private C58528ij f274135b;

    /* renamed from: c */
    private C58480gp f274136c;

    /* renamed from: d */
    private C58485gu f274137d;

    /* renamed from: e */
    private int f274138e;

    /* renamed from: f */
    private boolean f274139f;

    /* renamed from: g */
    private byte f274140g;

    public C98172a() {
    }

    public C98172a(C98203bd bdVar) {
        C98199b bVar = (C98199b) bdVar;
        this.f274135b = bVar.f274189a;
        this.f274137d = bVar.f274190b;
        this.f274138e = bVar.f274191c;
        this.f274139f = bVar.f274192d;
        this.f274140g = 3;
    }

    /* renamed from: a */
    public final C98203bd mo91005a() {
        C58526ih ihVar = this.f274134a;
        if (ihVar != null) {
            this.f274135b = ihVar.mo55486f();
        } else if (this.f274135b == null) {
            this.f274135b = C58733pz.f156496a;
        }
        C58480gp gpVar = this.f274136c;
        if (gpVar != null) {
            this.f274137d = gpVar.mo55394f();
        } else if (this.f274137d == null) {
            this.f274137d = C58485gu.m89845m();
        }
        if (this.f274140g == 3) {
            return new C98199b(this.f274135b, this.f274137d, this.f274138e, this.f274139f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f274140g & 1) == 0) {
            sb.append(" totalBytes");
        }
        if ((this.f274140g & 2) == 0) {
            sb.append(" capacityReached");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58480gp mo91006b() {
        if (this.f274136c == null) {
            if (this.f274137d == null) {
                this.f274136c = C58485gu.m89837e();
            } else {
                C58480gp e = C58485gu.m89837e();
                this.f274136c = e;
                e.mo55396h(this.f274137d);
                this.f274137d = null;
            }
        }
        return this.f274136c;
    }

    /* renamed from: d */
    public final void mo91008d(boolean z) {
        this.f274139f = z;
        this.f274140g = (byte) (this.f274140g | 2);
    }

    /* renamed from: e */
    public final void mo91009e(int i) {
        this.f274138e = i;
        this.f274140g = (byte) (this.f274140g | 1);
    }

    /* renamed from: c */
    public final C58526ih mo91007c() {
        if (this.f274134a == null) {
            if (this.f274135b == null) {
                this.f274134a = new C58526ih();
            } else {
                C58526ih ihVar = new C58526ih();
                this.f274134a = ihVar;
                ihVar.mo55489i(this.f274135b);
                this.f274135b = null;
            }
        }
        return this.f274134a;
    }
}
