package com.google.android.libraries.search.p2871b;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.b.t */
/* compiled from: PG */
public abstract class C37319t {
    static {
        m66313g().mo40743a();
    }

    /* renamed from: g */
    public static C37318s m66313g() {
        C37238g gVar = new C37238g();
        gVar.mo40747e(false);
        gVar.mo40746d(true);
        C60826bg bgVar = C60826bg.f164896a;
        if (bgVar != null) {
            gVar.f98913b = bgVar;
            gVar.f98912a = "Unknown";
            return gVar;
        }
        throw new NullPointerException("Null listenerExecutor");
    }

    /* renamed from: a */
    public abstract C58833ax mo40765a();

    /* renamed from: b */
    public abstract C58528ij mo40766b();

    /* renamed from: c */
    public abstract String mo40767c();

    /* renamed from: d */
    public abstract Executor mo40768d();

    /* renamed from: e */
    public abstract boolean mo40769e();

    /* renamed from: f */
    public abstract boolean mo40771f();
}
