package com.google.android.gms.usonia.auth.internal;

import androidx.core.p097i.C1967b;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.gms.usonia.auth.C146120a;
import com.google.android.gms.usonia.auth.C146121b;
import com.google.android.gms.usonia.directory.internal.C146268d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.p5633c.p5634a.C72290n;
import org.p5633c.p5634a.p5638d.C72218h;

/* renamed from: com.google.android.gms.usonia.auth.internal.r */
/* compiled from: PG */
public final class C146145r implements C146120a, C146151x, C146121b {

    /* renamed from: a */
    public static final C59071e f394889a = C59071e.m91332i("com.google.android.gms.usonia.auth.internal.r");

    /* renamed from: e */
    private static final C72290n f394890e = C72290n.m106814e(1);

    /* renamed from: f */
    private static final C72290n f394891f = C72290n.m106815f(10);

    /* renamed from: b */
    public final C146127ae f394892b;

    /* renamed from: c */
    public final C146131d f394893c;

    /* renamed from: d */
    public C58833ax f394894d;

    /* renamed from: g */
    private final C146268d f394895g;

    /* renamed from: h */
    private final C60888db f394896h;

    /* renamed from: i */
    private final HashSet f394897i = new HashSet();

    /* renamed from: j */
    private C146006ab f394898j = null;

    /* renamed from: k */
    private C58833ax f394899k;

    /* renamed from: l */
    private int f394900l;

    /* renamed from: m */
    private C58833ax f394901m;

    public C146145r(C146268d dVar, C146131d dVar2, C146127ae aeVar, C60888db dbVar) {
        C58836b bVar = C58836b.f156633a;
        this.f394894d = bVar;
        this.f394899k = bVar;
        this.f394900l = 0;
        this.f394901m = bVar;
        this.f394895g = dVar;
        this.f394893c = dVar2;
        this.f394892b = aeVar;
        this.f394896h = dbVar;
    }

    /* renamed from: n */
    private final long m238021n() {
        C72290n b = this.f394893c.mo122673c().mo63672b(f394890e);
        C72290n a = C72290n.m106811a(System.currentTimeMillis());
        if (b.compareTo(a) > 0) {
            return b.mo63672b(a).f191964b;
        }
        return 0;
    }

    /* renamed from: o */
    private final C146006ab m238022o() {
        return this.f394895g.mo122810p(this.f394893c.mo122671a()).mo122482a(this.f394896h, new C146143p(this));
    }

    /* renamed from: b */
    public final C146006ab mo122631b(Object obj) {
        synchronized (this) {
            C146006ab abVar = this.f394898j;
            if (abVar != null) {
                if (abVar.mo122490i()) {
                    if (!this.f394897i.add(obj)) {
                        C146006ab c = C146021aq.m237849c(new IllegalArgumentException("Attempted to register auth consumer twice."));
                        return c;
                    }
                    if (this.f394897i.size() == 1) {
                        this.f394895g.mo122757m(this);
                    }
                    if (this.f394894d.mo56113h()) {
                        C60872cz czVar = (C60872cz) this.f394894d.mo56107c();
                        if (czVar.isDone()) {
                            try {
                                czVar.get();
                            } catch (InterruptedException | ExecutionException e) {
                                ((C59052c) ((C59052c) ((C59052c) f394889a.mo56225c()).mo56382g(e)).mo56372aa(42057)).mo56386p("Refresh Credential Timer failed.");
                                this.f394894d = C58836b.f156633a;
                            }
                        } else if (mo122697m()) {
                            C146006ab d = C146021aq.m237850d((Object) null);
                            return d;
                        } else {
                            ((C59052c) ((C59052c) f394889a.mo56226d()).mo56372aa(42058)).mo56386p("Invalid state: RefreshTimer is running but credentials are invalid");
                            czVar.cancel(false);
                            this.f394894d = C58836b.f156633a;
                        }
                    }
                    if (m238021n() <= 0) {
                        if (!this.f394899k.mo56113h()) {
                            this.f394899k = C58833ax.m90834k(mo122690f());
                        }
                        C146006ab abVar2 = (C146006ab) this.f394899k.mo56107c();
                        return abVar2;
                    }
                    mo122695k((C146006ab) null);
                    return C146021aq.m237850d((Object) null);
                }
            }
            C146006ab c2 = C146021aq.m237849c(new IllegalStateException("Must wait for AuthClient::initialize() to complete before calling registerAuthConsumer()."));
            return c2;
        }
    }

    /* renamed from: c */
    public final void mo122632c(OnStructureInfoUpdatedParams onStructureInfoUpdatedParams) {
        HashMap hashMap = new HashMap();
        for (TrustedId trustedId : onStructureInfoUpdatedParams.f394860a) {
            hashMap.put(trustedId.f394866a, trustedId.f394867b);
        }
        this.f394892b.f394873b.mo122698a(hashMap);
    }

    /* renamed from: d */
    public final synchronized C146006ab mo122688d() {
        C146006ab abVar;
        abVar = this.f394898j;
        if (abVar == null) {
            throw new IllegalStateException("Attempted to use SSLContext before it was initialized. Client applications must call AuthClient::initialize() and wait for the Task to complete successfully before attempting RPC calls.");
        }
        return abVar;
    }

    /* renamed from: e */
    public final synchronized C146006ab mo122689e() {
        C146006ab abVar = this.f394898j;
        if (abVar == null || !abVar.mo122490i()) {
            throw new IllegalStateException("Must wait for AuthClient::initialize() to complete before calling registerAuthConsumer().");
        }
        return m238022o();
    }

    /* renamed from: f */
    public final C146006ab mo122690f() {
        C146006ab e = mo122689e();
        e.mo122494m(this.f394896h, C146140m.f394884a);
        return e.mo122482a(this.f394896h, new C146144q(this));
    }

    /* renamed from: g */
    public final synchronized C146006ab mo122691g(Object obj) {
        if (!this.f394897i.remove(obj)) {
            return C146021aq.m237849c(new IllegalArgumentException("Tried to unregister a consumer that had not been registered"));
        } else if (!this.f394897i.isEmpty()) {
            return C146021aq.m237850d((Object) null);
        } else {
            this.f394895g.mo122758n(this);
            if (this.f394894d.mo56113h()) {
                ((C60872cz) this.f394894d.mo56107c()).cancel(false);
                this.f394894d = C58836b.f156633a;
            }
            return C146021aq.m237850d((Object) null);
        }
    }

    /* renamed from: h */
    public final synchronized SSLContext mo122692h() {
        SSLContext instance;
        try {
            instance = SSLContext.getInstance("TLS");
            instance.init(this.f394893c.mo122679g(), new TrustManager[]{new C146125ac(this.f394892b)}, (SecureRandom) null);
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
        return instance;
    }

    /* renamed from: i */
    public final synchronized void mo122693i() {
        if (this.f394901m.mo56113h()) {
            X509Certificate b = this.f394893c.mo122672b();
            if (b != null) {
                ((C1967b) this.f394901m.mo56107c()).mo3353a(new Certificate[]{b});
            }
        }
    }

    /* renamed from: j */
    public final synchronized void mo122694j(C1967b bVar) {
        C58893dc.m90997b(!this.f394901m.mo56113h());
        this.f394901m = C58833ax.m90834k(bVar);
        mo122693i();
    }

    /* renamed from: k */
    public final synchronized void mo122695k(C146006ab abVar) {
        long j;
        this.f394899k = C58836b.f156633a;
        if (!this.f394897i.isEmpty()) {
            if (abVar != null) {
                if (!abVar.mo122491j()) {
                    int i = this.f394900l + 1;
                    this.f394900l = i;
                    if (i > 10) {
                        ((C59052c) ((C59052c) ((C59052c) f394889a.mo56225c()).mo56382g(abVar.mo122487f())).mo56372aa(42062)).mo56386p("Too many failed auth refresh attempts. Aborting.");
                        this.f394894d = C58836b.f156633a;
                        return;
                    }
                    long j2 = (long) (1 << (i - 1));
                    C72290n nVar = f394891f;
                    if (j2 != 1) {
                        nVar = new C72290n(C72218h.m106358d(nVar.f191964b, j2));
                    }
                    ((C59052c) ((C59052c) ((C59052c) f394889a.mo56226d()).mo56382g(abVar.mo122487f())).mo56372aa(42061)).mo56388r("Auth refresh failed. Trying again in %s seconds", nVar.f191964b / 1000);
                    j = nVar.f191964b;
                    this.f394894d = C58833ax.m90834k(this.f394896h.mo29165e(new C146142o(this), j, TimeUnit.MILLISECONDS));
                }
            }
            j = m238021n();
            this.f394894d = C58833ax.m90834k(this.f394896h.mo29165e(new C146142o(this), j, TimeUnit.MILLISECONDS));
        }
    }

    /* renamed from: l */
    public final synchronized void mo122696l() {
        this.f394901m = C58836b.f156633a;
    }

    /* renamed from: m */
    public final boolean mo122697m() {
        return this.f394893c.mo122673c().f191964b > System.currentTimeMillis();
    }

    /* renamed from: a */
    public final synchronized C146006ab mo122630a() {
        if (this.f394898j != null) {
            ((C59052c) ((C59052c) f394889a.mo56226d()).mo56372aa(42056)).mo56386p("initialize was called more than once.");
        } else {
            this.f394898j = m238022o().mo122482a(this.f394896h, new C146141n(this));
        }
        return this.f394898j.mo122482a(this.f394896h, C146139l.f394883a);
    }
}
