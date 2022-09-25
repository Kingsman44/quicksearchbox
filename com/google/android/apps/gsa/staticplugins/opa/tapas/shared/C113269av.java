package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.av */
/* compiled from: PG */
final class C113269av extends C113362dc {

    /* renamed from: a */
    private C58480gp f313649a;

    /* renamed from: b */
    private C58485gu f313650b;

    /* renamed from: c */
    private boolean f313651c;

    /* renamed from: d */
    private int f313652d;

    /* renamed from: e */
    private byte f313653e;

    /* renamed from: a */
    public final C113363dd mo99984a() {
        C58480gp gpVar = this.f313649a;
        if (gpVar != null) {
            this.f313650b = gpVar.mo55394f();
        } else if (this.f313650b == null) {
            this.f313650b = C58485gu.m89845m();
        }
        if (this.f313653e == 3) {
            return new C113270aw(this.f313650b, this.f313651c, this.f313652d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f313653e & 1) == 0) {
            sb.append(" isCircular");
        }
        if ((this.f313653e & 2) == 0) {
            sb.append(" placeholderColor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58480gp mo99985b() {
        if (this.f313649a == null) {
            if (this.f313650b == null) {
                this.f313649a = C58485gu.m89837e();
            } else {
                C58480gp e = C58485gu.m89837e();
                this.f313649a = e;
                e.mo55396h(this.f313650b);
                this.f313650b = null;
            }
        }
        return this.f313649a;
    }

    /* renamed from: c */
    public final void mo99986c(List list) {
        if (this.f313649a == null) {
            this.f313650b = C58485gu.m89842j(list);
            return;
        }
        throw new IllegalStateException("Cannot set iconCandidates after calling iconCandidatesBuilder()");
    }

    /* renamed from: d */
    public final void mo99987d(C113365df... dfVarArr) {
        if (this.f313649a == null) {
            this.f313650b = C58485gu.m89844l(dfVarArr);
            return;
        }
        throw new IllegalStateException("Cannot set iconCandidates after calling iconCandidatesBuilder()");
    }

    /* renamed from: e */
    public final void mo99988e(boolean z) {
        this.f313651c = z;
        this.f313653e = (byte) (this.f313653e | 1);
    }

    /* renamed from: f */
    public final void mo99989f(int i) {
        this.f313652d = i;
        this.f313653e = (byte) (this.f313653e | 2);
    }
}
