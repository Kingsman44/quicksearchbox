package com.google.apps.tiktok.p3648i.p3652c;

import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.apps.tiktok.i.c.a */
/* compiled from: PG */
public final class C47167a extends C47173g {

    /* renamed from: a */
    public String f122813a;

    /* renamed from: b */
    public C47153d f122814b;

    /* renamed from: c */
    private C58833ax f122815c = C58836b.f156633a;

    /* renamed from: d */
    private C58480gp f122816d;

    /* renamed from: e */
    private C58485gu f122817e;

    /* renamed from: a */
    public final C47174h mo51082a() {
        C47153d dVar;
        C58480gp gpVar = this.f122816d;
        if (gpVar != null) {
            this.f122817e = gpVar.mo55394f();
        } else if (this.f122817e == null) {
            this.f122817e = C58485gu.m89845m();
        }
        String str = this.f122813a;
        if (str != null && (dVar = this.f122814b) != null) {
            return new C47168b(str, this.f122815c, this.f122817e, dVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f122813a == null) {
            sb.append(" name");
        }
        if (this.f122814b == null) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58480gp mo51083b() {
        if (this.f122816d == null) {
            this.f122816d = C58485gu.m89837e();
        }
        return this.f122816d;
    }

    /* renamed from: c */
    public final void mo51084c() {
        this.f122815c = C58833ax.m90834k(true);
    }
}
