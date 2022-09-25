package com.google.android.libraries.social.populous.p3296e.p3303g;

import com.google.android.libraries.social.populous.core.C42351l;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.C42355p;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42433l;
import com.google.android.libraries.social.populous.storage.C42680d;
import com.google.android.libraries.social.populous.storage.C42682db;
import com.google.android.libraries.social.populous.storage.C42701v;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60934v;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69291ak;

/* renamed from: com.google.android.libraries.social.populous.e.g.m */
/* compiled from: PG */
public final class C42540m implements C42433l {

    /* renamed from: a */
    public final C42352m f111561a;

    /* renamed from: b */
    public final C42355p f111562b;

    /* renamed from: c */
    public final ClientConfigInternal f111563c;

    /* renamed from: d */
    public final ClientVersion f111564d;

    /* renamed from: e */
    public final C42701v f111565e;

    /* renamed from: f */
    public final Executor f111566f;

    /* renamed from: g */
    public final C42591z f111567g;

    /* renamed from: h */
    public final C42682db f111568h;

    /* renamed from: i */
    public final AtomicReference f111569i = new AtomicReference((Object) null);

    /* renamed from: j */
    public final AtomicBoolean f111570j = new AtomicBoolean(false);

    /* renamed from: k */
    public final AtomicBoolean f111571k = new AtomicBoolean(false);

    /* renamed from: l */
    public final C42211b f111572l;

    /* renamed from: m */
    public final C42542o f111573m;

    public C42540m(C42352m mVar, C42355p pVar, ClientConfigInternal clientConfigInternal, ClientVersion clientVersion, C42701v vVar, C42211b bVar, Executor executor, C42591z zVar, C42682db dbVar, C42542o oVar) {
        this.f111561a = mVar;
        this.f111562b = pVar;
        this.f111563c = clientConfigInternal;
        this.f111564d = clientVersion;
        this.f111565e = vVar;
        this.f111572l = bVar;
        this.f111566f = executor;
        this.f111567g = zVar;
        this.f111568h = dbVar;
        this.f111573m = oVar;
        pVar.mo45325d();
    }

    /* renamed from: a */
    public final int mo45491a() {
        long j;
        long j2;
        if (this.f111570j.get()) {
            return 5;
        }
        C58833ax a = this.f111562b.mo45322a();
        if (!a.mo56113h()) {
            return 1;
        }
        C58833ax axVar = (C58833ax) a.mo56107c();
        if (!axVar.mo56113h()) {
            return 4;
        }
        long j3 = ((C42680d) axVar.mo56107c()).f111893b;
        if (C69291ak.m100495d()) {
            j = C69291ak.f185408a.mo6453a().mo60950b();
        } else {
            j = this.f111563c.f110728n;
        }
        long j4 = j + j3;
        if (C69291ak.m100495d()) {
            j2 = C69291ak.m100494b();
        } else {
            j2 = this.f111563c.f110729o;
        }
        long b = this.f111572l.f110538c.mo26870b();
        if (b >= j3 + j2) {
            return 4;
        }
        if (b < j4 && !this.f111571k.get()) {
            return 2;
        }
        return 3;
    }

    /* renamed from: b */
    public final C60870cx mo45547b(C42576k kVar, boolean z) {
        int a = mo45491a();
        if (a == 2) {
            return C60866ct.f164955a;
        }
        return a == 3 ? C60866ct.f164955a : mo45548c(3, kVar, z);
    }

    /* renamed from: c */
    public final synchronized C60870cx mo45548c(int i, C42576k kVar, boolean z) {
        if (this.f111561a.f111091c != C42351l.SUCCESS_LOGGED_IN) {
            return C60866ct.f164955a;
        }
        C60870cx cxVar = (C60870cx) this.f111569i.get();
        if (cxVar != null) {
            if (!cxVar.isDone()) {
                return C60856cj.m92901j(cxVar);
            }
        }
        if (mo45491a() != 1 || !z) {
            boolean z2 = this.f111570j.get();
            boolean z3 = this.f111571k.get();
            C58872ci b = this.f111567g.mo45632b();
            b.mo56160e();
            C60870cx n = C60856cj.m92905n(new C42531d(this, b), this.f111566f);
            C60856cj.m92911t(n, new C42536i(this, kVar, b), C60826bg.f164896a);
            C60870cx h = C60922j.m93045h(n, new C42532e(this, kVar), this.f111566f);
            C60870cx a = C60856cj.m92895d(h, C60922j.m93045h(n, new C42533f(this, kVar), this.f111566f), C60922j.m93045h(h, new C42534g(this, kVar), this.f111566f)).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
            this.f111569i.set(a);
            a.mo4106b(new C42535h(this, a, z2, z3), C60826bg.f164896a);
            return C60856cj.m92901j(a);
        }
        return C60922j.m93045h(this.f111562b.mo45323b(), new C42528a(this, i, kVar), C60826bg.f164896a);
    }
}
