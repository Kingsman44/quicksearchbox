package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8466ai;
import com.google.p395al.p408c.p414c.p416b.C8482ay;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.s3.s */
/* compiled from: PG */
public final class C84330s implements C84333v {

    /* renamed from: a */
    public static final C59071e f229507a = C59071e.m91332i("com.google.android.apps.gsa.s3.s");

    /* renamed from: b */
    public final int f229508b;

    /* renamed from: c */
    public final int f229509c;

    /* renamed from: d */
    private final C90931ca f229510d;

    /* renamed from: e */
    private final C8482ay f229511e;

    /* renamed from: f */
    private final C89012aj f229512f;

    /* renamed from: g */
    private final C89061q f229513g;

    /* renamed from: h */
    private final boolean f229514h;

    /* renamed from: i */
    private final boolean f229515i;

    /* renamed from: j */
    private final C86124t f229516j;

    /* renamed from: k */
    private C84329r f229517k;

    /* renamed from: l */
    private C84298p f229518l;

    /* renamed from: m */
    private int f229519m;

    public C84330s(C90931ca caVar, C8482ay ayVar, C89012aj ajVar, C89061q qVar, boolean z, boolean z2, int i, C86124t tVar) {
        this.f229510d = caVar;
        this.f229511e = ayVar;
        this.f229512f = ajVar;
        this.f229513g = qVar;
        this.f229514h = z;
        this.f229515i = z2;
        this.f229508b = i;
        this.f229509c = (int) tVar.mo79743a(C90114fl.f250729c);
        this.f229516j = tVar;
    }

    /* renamed from: c */
    public static void m134539c(C60870cx cxVar, int i) {
        cxVar.cancel(true);
        if (!cxVar.isCancelled()) {
            long j = (long) i;
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C90476a aVar = C91018d.f254254a;
                ((C89021as) cxVar.get(j, timeUnit)).mo82997b().mo27475d();
            } catch (C89013ak | C90457d | InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo77826a() {
        C84298p pVar = this.f229518l;
        if (pVar != null) {
            pVar.mo77834a();
            this.f229518l = null;
        }
        C84329r rVar = this.f229517k;
        if (rVar != null) {
            rVar.mo77834a();
            this.f229517k = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final synchronized boolean mo77867d(int i) {
        if (i == 0) {
            this.f229519m = 0;
            return true;
        } else if (i != 1) {
            if (i == 2) {
                C58838bb.m90883r(this.f229519m != 3);
                if (this.f229519m == 1) {
                    ((C59052c) ((C59052c) f229507a.mo56226d()).mo56372aa(7209)).mo56386p("The response is sent in the up and down");
                    return false;
                }
                this.f229519m = 2;
                return true;
            } else if (!this.f229514h) {
                return false;
            } else {
                int i2 = this.f229519m;
                if (i2 == 2) {
                    this.f229519m = 3;
                    return false;
                } else if (i2 == 1) {
                    return true;
                } else {
                    this.f229519m = 3;
                    return true;
                }
            }
        } else if (this.f229519m == 2) {
            ((C59052c) ((C59052c) f229507a.mo56226d()).mo56372aa(7208)).mo56386p("The response is sent in the up and down");
            return false;
        } else {
            this.f229519m = 1;
            return true;
        }
    }

    /* renamed from: b */
    public final synchronized void mo77827b(C84295m mVar, C92439c cVar) {
        cVar.getClass();
        mo77867d(0);
        String uuid = UUID.randomUUID().toString();
        C84329r rVar = new C84329r(this, this.f229511e, uuid, this.f229512f, this.f229513g, this.f229508b, this.f229515i, mVar, this.f229509c, this.f229516j);
        this.f229517k = rVar;
        rVar.mo77865d(this.f229510d);
        C8466ai aiVar = this.f229511e.f29444c;
        if (aiVar == null) {
            aiVar = C8466ai.f29395g;
        }
        C84298p pVar = new C84298p(this, this, aiVar, uuid, this.f229512f, this.f229513g, cVar, this.f229515i, mVar, this.f229516j);
        this.f229518l = pVar;
        pVar.mo77865d(this.f229510d);
    }
}
