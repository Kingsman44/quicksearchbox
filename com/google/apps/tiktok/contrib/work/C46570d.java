package com.google.apps.tiktok.contrib.work;

import androidx.work.C4412h;
import androidx.work.C4632m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.contrib.work.d */
/* compiled from: PG */
public final class C46570d extends C46582p {

    /* renamed from: a */
    public Class f121752a;

    /* renamed from: b */
    public C4412h f121753b;

    /* renamed from: c */
    public C46584r f121754c;

    /* renamed from: d */
    public C4632m f121755d;

    /* renamed from: e */
    public C58833ax f121756e;

    /* renamed from: f */
    public C58833ax f121757f;

    /* renamed from: g */
    public C58528ij f121758g;

    /* renamed from: h */
    private C58833ax f121759h;

    public C46570d() {
        C58836b bVar = C58836b.f156633a;
        this.f121759h = bVar;
        this.f121756e = bVar;
        this.f121757f = bVar;
    }

    public C46570d(C46586t tVar) {
        C58836b bVar = C58836b.f156633a;
        this.f121759h = bVar;
        this.f121756e = bVar;
        this.f121757f = bVar;
        C46571e eVar = (C46571e) tVar;
        this.f121752a = eVar.f121760a;
        this.f121753b = eVar.f121761b;
        this.f121759h = eVar.f121762c;
        this.f121754c = eVar.f121763d;
        this.f121755d = eVar.f121764e;
        this.f121756e = eVar.f121765f;
        this.f121757f = eVar.f121766g;
        this.f121758g = eVar.f121767h;
    }

    /* renamed from: a */
    public final C46586t mo50561a() {
        C4412h hVar;
        C46584r rVar;
        C4632m mVar;
        C58528ij ijVar;
        Class cls = this.f121752a;
        if (cls != null && (hVar = this.f121753b) != null && (rVar = this.f121754c) != null && (mVar = this.f121755d) != null && (ijVar = this.f121758g) != null) {
            return new C46571e(cls, hVar, this.f121759h, rVar, mVar, this.f121756e, this.f121757f, ijVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f121752a == null) {
            sb.append(" workerClass");
        }
        if (this.f121753b == null) {
            sb.append(" constraints");
        }
        if (this.f121754c == null) {
            sb.append(" initialDelay");
        }
        if (this.f121755d == null) {
            sb.append(" inputData");
        }
        if (this.f121758g == null) {
            sb.append(" tags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo50562b(Set set) {
        this.f121758g = C58528ij.m90006F(set);
    }

    /* renamed from: c */
    public final void mo50563c(C46585s sVar) {
        this.f121757f = C58833ax.m90834k(sVar);
    }
}
