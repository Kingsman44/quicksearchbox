package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6513aj.C84563w;
import com.google.android.apps.gsa.search.core.p6816p.C86262q;
import com.google.android.apps.gsa.search.core.p6816p.C86263r;
import com.google.android.apps.gsa.search.core.p6816p.C86264s;
import com.google.android.apps.gsa.search.core.p6816p.C86266u;
import com.google.android.apps.gsa.search.core.p6816p.C86267v;
import com.google.android.apps.gsa.search.core.p6816p.C86268w;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89017ao;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89042bm;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.d */
/* compiled from: PG */
final class C102478d extends C90888av implements C86266u {

    /* renamed from: a */
    final /* synthetic */ C102479e f286010a;

    /* renamed from: b */
    private final Uri f286011b;

    /* renamed from: c */
    private C86267v f286012c;

    /* renamed from: d */
    private final AtomicBoolean f286013d = new AtomicBoolean(false);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102478d(C102479e eVar, Uri uri) {
        super("DownloadAttempt", 1, 4);
        this.f286010a = eVar;
        this.f286011b = uri;
    }

    /* renamed from: b */
    private final void m169935b() {
        C102479e eVar = this.f286010a;
        if (eVar.f286017d >= 0) {
            eVar.f286020g.mo93314a("Too many auth failures");
            this.f286010a.f286014a.mo57357o(new Exception("Too many auth failures"));
            return;
        }
        eVar.f286020g.mo93314a("Retrying after auth failure");
        C102479e eVar2 = this.f286010a;
        eVar2.f286017d++;
        eVar2.f286018e = 0;
        eVar2.f286019f.f286022b.mo85139d(new C102478d(eVar2, eVar2.f286015b));
    }

    /* renamed from: d */
    private final boolean m169936d() {
        return this.f286013d.compareAndSet(false, true);
    }

    /* renamed from: a */
    public final void mo79963a() {
        C86267v vVar;
        C89022at atVar;
        C89022at atVar2;
        C90455b bVar;
        if (!this.f286010a.f286014a.isDone() && (vVar = this.f286012c) != null) {
            boolean z = false;
            if (!vVar.mo79966e() || !m169936d()) {
                C86267v vVar2 = this.f286012c;
                synchronized (vVar2.f233194b) {
                    atVar = vVar2.f233197e;
                }
                if (atVar != null && m169936d()) {
                    this.f286010a.f286020g.mo93314a("Successful response ready");
                    C86267v vVar3 = this.f286012c;
                    synchronized (vVar3.f233194b) {
                        if (vVar3.f233197e != null) {
                            z = true;
                        }
                        C58838bb.m90883r(z);
                        atVar2 = vVar3.f233197e;
                    }
                    this.f286010a.f286014a.mo57356n(new C102456a(C102480f.m169938a(this.f286011b, atVar2.mo83000a("Content-Type", "text/html; charset=utf-8"), this.f286012c.f233193a), this.f286012c));
                    return;
                }
                return;
            }
            C86267v vVar4 = this.f286012c;
            synchronized (vVar4.f233194b) {
                C58838bb.m90883r(vVar4.mo79966e());
                Exception c = vVar4.f233198f.mo79845c();
                if (c instanceof C90455b) {
                    bVar = (C90455b) c;
                } else {
                    bVar = new C90457d((Throwable) c, vVar4.f233198f.mo79843a());
                }
            }
            ((C89911f) this.f286010a.f286019f.f286027g.mo27525b()).mo83756b(bVar).mo83721a();
            if (bVar instanceof C89017ao) {
                C89017ao aoVar = (C89017ao) bVar;
                this.f286010a.f286020g.mo93314a(new C84563w("Redirect status code %d", Integer.valueOf(aoVar.f241213a)));
                C102479e eVar = this.f286010a;
                if (eVar.f286018e < 10) {
                    int i = aoVar.f241213a;
                    Uri parse = Uri.parse(aoVar.f241232b);
                    if (parse.isRelative()) {
                        parse = parse.buildUpon().scheme(this.f286011b.getScheme()).authority(this.f286011b.getAuthority()).build();
                    }
                    if (!this.f286010a.f286019f.f286024d.mo79554e(parse, true)) {
                        this.f286010a.f286020g.mo93314a(new C84563w("%d redirect to insecure URI %s", Integer.valueOf(i), C85929cw.m138090u(parse)));
                        this.f286010a.f286014a.mo57357o(new Exception("Redirect to insecure URI"));
                    } else if ("https://accounts.google.com/Login".equals(parse.buildUpon().clearQuery().build().toString())) {
                        this.f286010a.f286020g.mo93314a(new C84563w("%d redirect to auth failure URI %s", Integer.valueOf(i), C85929cw.m138090u(parse)));
                        m169935b();
                    } else if (this.f286010a.f286019f.f286025e.mo79575p(parse.toString()).mo56113h()) {
                        this.f286010a.f286014a.mo57357o(aoVar);
                    } else {
                        this.f286010a.f286020g.mo93314a(new C84563w("%d redirect to %s", Integer.valueOf(i), C85929cw.m138090u(parse)));
                        C102479e eVar2 = this.f286010a;
                        eVar2.f286018e++;
                        eVar2.f286019f.f286022b.mo85139d(new C102478d(eVar2, parse));
                    }
                } else {
                    eVar.f286020g.mo93314a("Too many redirects");
                    this.f286010a.f286014a.mo57357o(new Exception("Too many redirects"));
                }
            } else {
                if (bVar instanceof C89013ak) {
                    int i2 = ((C89013ak) bVar).f241213a;
                    this.f286010a.f286020g.mo93314a(new C84563w("Status code %d", Integer.valueOf(i2)));
                    if (i2 == 403 || i2 == 401) {
                        m169935b();
                        return;
                    }
                }
                this.f286010a.f286014a.mo57357o(bVar);
            }
        }
    }

    public final void run() {
        C89042bm bmVar;
        if (!this.f286010a.f286014a.isDone()) {
            try {
                C102479e eVar = this.f286010a;
                Uri uri = this.f286011b;
                if (eVar.f286016c) {
                    bmVar = C89042bm.f241319c;
                } else {
                    bmVar = C89042bm.f241318b;
                }
                C89019aq c = C89020ar.m144758c();
                c.mo82994f(uri.toString());
                boolean z = false;
                c.f241239e = false;
                c.f241244j = true;
                c.f241250p = bmVar;
                c.f241243i = false;
                c.f241245k = 15;
                C89020ar a = c.mo82989a();
                C86268w wVar = this.f286010a.f286019f.f286026f;
                C58838bb.m90868c("GET".equals(a.f241258g));
                C86263r rVar = new C86263r(wVar.f233201a, wVar.f233202b, wVar.f233204d);
                C86262q qVar = new C86262q(rVar, wVar.f233203c, a, C89009ag.f241207b);
                C86267v vVar = new C86267v(rVar.f233186a, qVar, rVar.f233188c);
                C86264s sVar = new C86264s(vVar);
                synchronized (qVar.f233176a) {
                    if (qVar.f233178c == null) {
                        z = true;
                    }
                    C58838bb.m90883r(z);
                    qVar.f233178c = sVar;
                }
                qVar.mo79961c();
                this.f286012c = vVar;
                synchronized (vVar.f233194b) {
                    vVar.f233195c.add(this);
                }
                mo79963a();
                C102479e eVar2 = this.f286010a;
                C102480f fVar = eVar2.f286019f;
                SettableFuture settableFuture = eVar2.f286014a;
                settableFuture.mo4106b(new C102476b(settableFuture, this.f286012c), fVar.f286021a);
            } catch (IOException e) {
                this.f286010a.f286014a.mo57357o(e);
            }
        }
    }
}
