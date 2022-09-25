package com.google.frameworks.client.data.android.p4632a;

import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61466h;
import com.google.frameworks.client.data.android.C61506i;
import com.google.frameworks.client.data.android.p4638e.C61407b;
import com.google.frameworks.client.data.android.p4638e.C61408c;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70846h;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.a.c */
/* compiled from: PG */
public final class C61342c implements C61485f {

    /* renamed from: a */
    public static final C70846h f165891a = new C70846h("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", false);

    /* renamed from: b */
    private static final C70297cz f165892b = new C70290cs("Authorization", C70334de.f187481c);

    /* renamed from: c */
    private static final C70297cz f165893c = new C70290cs("X-Auth-Time", C70334de.f187481c);

    /* renamed from: d */
    private final C58833ax f165894d;

    /* renamed from: e */
    private final C58833ax f165895e;

    /* renamed from: f */
    private final C58528ij f165896f;

    /* renamed from: g */
    private final boolean f165897g;

    /* renamed from: h */
    private final C58833ax f165898h;

    /* renamed from: i */
    private C60870cx f165899i;

    /* renamed from: j */
    private C61485f f165900j;

    public C61342c(C58833ax axVar, C58833ax axVar2, C58528ij ijVar, boolean z, C58833ax axVar3) {
        this.f165894d = axVar;
        this.f165895e = axVar2;
        this.f165896f = ijVar;
        this.f165897g = z;
        this.f165898h = axVar3;
    }

    /* renamed from: h */
    public static C61342c m93839h(C58833ax axVar) {
        return new C61342c(axVar, C58836b.f156633a, C58733pz.f156496a, false, C58836b.f156633a);
    }

    /* renamed from: a */
    public final C61479al mo39483a(C61481b bVar) {
        C61485f fVar = this.f165900j;
        if (fVar != null) {
            return fVar.mo39483a(bVar);
        }
        try {
            C61347h hVar = (C61347h) C60856cj.m92909r(this.f165899i);
            C70334de deVar = bVar.f166235a;
            C70297cz czVar = f165892b;
            C58838bb.m90884s(!deVar.mo62035j(czVar), "Already attached auth token");
            C70334de deVar2 = bVar.f166235a;
            String str = hVar.f165904a;
            deVar2.mo62033h(czVar, "Bearer " + str);
            bVar.f166235a.mo62033h(f165893c, Long.toString(hVar.f165905b));
            return C61479al.f166225a;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof C61346g) {
                return C61479al.m94189b(Status.m102099c(Status.Code.UNAUTHENTICATED).mo61678e(cause.getCause()), new C70334de());
            }
            return C61479al.m94189b(Status.m102100d(cause), new C70334de());
        }
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        Set set;
        if (this.f165894d.mo56113h()) {
            set = (Set) this.f165894d.mo56107c();
        } else {
            set = ((C61372an) bVar.f166236b.mo62571g(C61372an.f165953a)).mo17186c();
        }
        C61333a aVar = (C61333a) bVar.f166236b.mo62571g(C61333a.f165865a);
        C58838bb.m90866a(aVar, "Using AuthContextStrategy, but did not set AuthContext");
        if (this.f165896f.contains(aVar.mo57904e())) {
            C58838bb.m90884s(((C61372an) bVar.f166236b.mo62571g(C61372an.f165953a)).mo17187d(), "Falling back on API Key, method is not allowed without credentials");
            C46423aj ajVar = C61408c.f166068d;
            C61407b bVar2 = new C61407b(new C61408c(this.f165895e.mo56113h() ? (String) this.f165895e.mo56107c() : null, this.f165897g));
            this.f165900j = bVar2;
            return bVar2.mo39484b(bVar);
        }
        C58838bb.m90884s(!aVar.mo57904e().equals("incognito") && !aVar.mo57904e().equals("pseudonymous"), "Used non-google account without enabling API Key fallback");
        C61343d l = ((C61466h) bVar.f166236b.mo62571g(C61506i.f166279a)).mo57991l();
        C47558bi a = C47831fm.m85006a("AuthContextInterceptor#tokenFuture");
        try {
            C60871cy cyVar = new C60871cy((Callable) new C61341b(bVar, l, aVar, set));
            a.mo51417a(cyVar);
            ((C61466h) bVar.f166236b.mo62571g(C61506i.f166279a)).mo57995p().execute(cyVar);
            this.f165899i = cyVar;
            C61479al c = C61479al.m94190c(cyVar);
            a.close();
            return c;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: c */
    public final /* synthetic */ C61480am mo39485c(C61467a aVar) {
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final /* synthetic */ C61480am mo39486d(C61483d dVar) {
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}
