package com.google.frameworks.client.data.android.p4638e;

import android.content.pm.PackageManager;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61466h;
import com.google.frameworks.client.data.android.C61506i;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70851i;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.e.b */
/* compiled from: PG */
public final class C61407b implements C61485f {

    /* renamed from: a */
    final /* synthetic */ C61408c f166063a;

    /* renamed from: b */
    private C60870cx f166064b = null;

    public C61407b(C61408c cVar) {
        this.f166063a = cVar;
    }

    /* renamed from: h */
    private static final C61479al m93978h(C61481b bVar, C60870cx cxVar) {
        try {
            bVar.f166235a.mo62033h(C61408c.f166067c, (String) C60856cj.m92909r(cxVar));
            return C61479al.f166225a;
        } catch (ExecutionException e) {
            return C61479al.m94189b(Status.m102100d(e).withDescription("Failed to get API Key cert"), new C70334de());
        }
    }

    /* renamed from: a */
    public final C61479al mo39483a(C61481b bVar) {
        return m93978h(bVar, this.f166064b);
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C70851i iVar = bVar.f166236b;
        C61372an anVar = (C61372an) iVar.mo62571g(C61372an.f165953a);
        String c = anVar.mo17185b().mo17204c();
        C61466h hVar = (C61466h) iVar.mo62571g(C61506i.f166279a);
        PackageManager packageManager = hVar.mo57979b().getPackageManager();
        C58838bb.m90884s((this.f166063a.f166069e == null && c == null) ? false : true, "ApiKeyOption defaultApiKey was used, but no default exists");
        C58838bb.m90884s(anVar.mo17187d(), "Using ApiKeyStrategy for method that is not allowed without credentials");
        C58838bb.m90884s(!bVar.f166235a.mo62035j(C61408c.f166065a), "API key was already attached to the request");
        C70334de deVar = bVar.f166235a;
        C70297cz czVar = C61408c.f166065a;
        String str = this.f166063a.f166069e;
        if (str != null) {
            c = str;
        }
        deVar.mo62033h(czVar, c);
        if (!this.f166063a.f166070f) {
            return C61479al.f166225a;
        }
        C58838bb.m90884s(!bVar.f166235a.mo62035j(C61408c.f166067c), "Cert was already attached to the request");
        C58838bb.m90884s(!bVar.f166235a.mo62035j(C61408c.f166066b), "Package was already attached to the request");
        bVar.f166235a.mo62033h(C61408c.f166066b, hVar.mo57979b().getPackageName());
        String packageName = hVar.mo57979b().getPackageName();
        Executor o = hVar.mo57994o();
        if (C61408c.f166068d == null) {
            synchronized (C61408c.class) {
                if (C61408c.f166068d == null) {
                    C61408c.f166068d = new C46423aj(new C61406a(packageManager, packageName), o);
                }
            }
        }
        C60870cx b = C61408c.f166068d.mo50395b();
        if (b.isDone()) {
            return m93978h(bVar, b);
        }
        this.f166064b = b;
        return C61479al.m94190c(b);
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
