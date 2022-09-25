package com.google.android.libraries.search.p2871b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.b.g */
/* compiled from: PG */
public final class C37238g extends C37318s {

    /* renamed from: a */
    public String f98912a;

    /* renamed from: b */
    public Executor f98913b;

    /* renamed from: c */
    private boolean f98914c;

    /* renamed from: d */
    private boolean f98915d;

    /* renamed from: e */
    private C58833ax f98916e = C58836b.f156633a;

    /* renamed from: f */
    private C58526ih f98917f;

    /* renamed from: g */
    private C58528ij f98918g;

    /* renamed from: h */
    private byte f98919h;

    /* renamed from: a */
    public final C37319t mo40743a() {
        C58526ih ihVar = this.f98917f;
        if (ihVar != null) {
            this.f98918g = ihVar.mo55486f();
        } else if (this.f98918g == null) {
            this.f98918g = C58733pz.f156496a;
        }
        if (this.f98919h == 3 && this.f98912a != null && this.f98913b != null) {
            return new C37247h(this.f98914c, this.f98912a, this.f98915d, this.f98916e, this.f98918g, this.f98913b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f98919h & 1) == 0) {
            sb.append(" dumpable");
        }
        if (this.f98912a == null) {
            sb.append(" loggerName");
        }
        if ((this.f98919h & 2) == 0) {
            sb.append(" enableTikTokIntegration");
        }
        if (this.f98913b == null) {
            sb.append(" listenerExecutor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58526ih mo40744b() {
        if (this.f98917f == null) {
            this.f98917f = new C58526ih();
        }
        return this.f98917f;
    }

    /* renamed from: c */
    public final void mo40745c(int i) {
        this.f98916e = C58833ax.m90834k(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final void mo40746d(boolean z) {
        this.f98914c = z;
        this.f98919h = (byte) (this.f98919h | 1);
    }

    /* renamed from: e */
    public final void mo40747e(boolean z) {
        this.f98915d = z;
        this.f98919h = (byte) (this.f98919h | 2);
    }
}
