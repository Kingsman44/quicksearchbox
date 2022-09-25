package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.core.a */
/* compiled from: PG */
public final class C42247a extends C42296bv {

    /* renamed from: a */
    public C58833ax f110833a = C58836b.f156633a;

    /* renamed from: b */
    public String f110834b;

    /* renamed from: c */
    public PeopleApiAffinity f110835c;

    /* renamed from: e */
    private boolean f110836e;

    /* renamed from: f */
    private long f110837f;

    /* renamed from: g */
    private C58528ij f110838g;

    /* renamed from: h */
    private byte f110839h;

    /* renamed from: a */
    public final GroupMetadata mo45181a() {
        if (this.f110839h == 3 && this.f110834b != null && this.f110835c != null) {
            return new AutoValue_GroupMetadata(this.f110833a, this.f110836e, this.f110837f, this.f110834b, this.f110835c, this.f110838g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f110839h & 1) == 0) {
            sb.append(" canExpandMembers");
        }
        if ((this.f110839h & 2) == 0) {
            sb.append(" querySessionId");
        }
        if (this.f110834b == null) {
            sb.append(" query");
        }
        if (this.f110835c == null) {
            sb.append(" peopleApiAffinity");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo45182b(boolean z) {
        this.f110836e = z;
        this.f110839h = (byte) (this.f110839h | 1);
    }

    /* renamed from: c */
    public final void mo45183c(Set set) {
        this.f110838g = set == null ? null : C58528ij.m90006F(set);
    }

    /* renamed from: d */
    public final void mo45184d(String str) {
        if (str != null) {
            this.f110834b = str;
            return;
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: e */
    public final void mo45185e(long j) {
        this.f110837f = j;
        this.f110839h = (byte) (this.f110839h | 2);
    }
}
