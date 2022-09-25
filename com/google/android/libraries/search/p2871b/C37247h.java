package com.google.android.libraries.search.p2871b;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.b.h */
/* compiled from: PG */
final class C37247h extends C37319t {

    /* renamed from: a */
    private final boolean f98929a;

    /* renamed from: b */
    private final String f98930b;

    /* renamed from: c */
    private final boolean f98931c;

    /* renamed from: d */
    private final C58833ax f98932d;

    /* renamed from: e */
    private final C58528ij f98933e;

    /* renamed from: f */
    private final Executor f98934f;

    public C37247h(boolean z, String str, boolean z2, C58833ax axVar, C58528ij ijVar, Executor executor) {
        this.f98929a = z;
        this.f98930b = str;
        this.f98931c = z2;
        this.f98932d = axVar;
        this.f98933e = ijVar;
        this.f98934f = executor;
    }

    /* renamed from: a */
    public final C58833ax mo40765a() {
        return this.f98932d;
    }

    /* renamed from: b */
    public final C58528ij mo40766b() {
        return this.f98933e;
    }

    /* renamed from: c */
    public final String mo40767c() {
        return this.f98930b;
    }

    /* renamed from: d */
    public final Executor mo40768d() {
        return this.f98934f;
    }

    /* renamed from: e */
    public final boolean mo40769e() {
        return this.f98931c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37319t) {
            C37319t tVar = (C37319t) obj;
            return this.f98929a == tVar.mo40771f() && this.f98930b.equals(tVar.mo40767c()) && this.f98931c == tVar.mo40769e() && this.f98932d.equals(tVar.mo40765a()) && this.f98933e.equals(tVar.mo40766b()) && this.f98934f.equals(tVar.mo40768d());
        }
    }

    /* renamed from: f */
    public final boolean mo40771f() {
        return this.f98929a;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((true != this.f98929a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f98930b.hashCode()) * 1000003;
        if (true == this.f98931c) {
            i = 1231;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f98932d.hashCode()) * 1000003) ^ this.f98933e.hashCode()) * 1000003) ^ this.f98934f.hashCode();
    }

    public final String toString() {
        boolean z = this.f98929a;
        String str = this.f98930b;
        boolean z2 = this.f98931c;
        String valueOf = String.valueOf(this.f98932d);
        String valueOf2 = String.valueOf(this.f98933e);
        String valueOf3 = String.valueOf(this.f98934f);
        return "LoggerOptions{dumpable=" + z + ", loggerName=" + str + ", enableTikTokIntegration=" + z2 + ", appIdOverrideForProducts=" + valueOf + ", appFlowListeners=" + valueOf2 + ", listenerExecutor=" + valueOf3 + "}";
    }
}
