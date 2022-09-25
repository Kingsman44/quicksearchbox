package com.google.android.libraries.lens.view.p2054ae;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.lens.common.p2000c.C24104a;
import com.google.android.libraries.lens.common.p2000c.C24105b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60897dk;
import com.google.common.util.concurrent.C60899dm;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4638e.C61410e;
import com.google.p4017at.p4056g.p4057a.p4058a.C53981ap;
import com.google.p4017at.p4056g.p4057a.p4058a.C53983ar;
import com.google.p4017at.p4056g.p4057a.p4058a.C54013bu;
import com.google.p4017at.p4056g.p4057a.p4058a.C54015bw;
import com.google.p4017at.p4056g.p4057a.p4058a.C54032cm;
import com.google.p4017at.p4056g.p4057a.p4058a.C54034co;
import com.google.p4017at.p4056g.p4057a.p4058a.C54040cu;
import com.google.p4017at.p4056g.p4057a.p4058a.C54042cw;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.lens.view.ae.j */
/* compiled from: PG */
public final class C25011j implements C24105b {

    /* renamed from: a */
    private final C58833ax f68204a;

    /* renamed from: b */
    private final C25009h f68205b;

    /* renamed from: c */
    private C58833ax f68206c = C58836b.f156633a;

    /* renamed from: d */
    private final boolean f68207d;

    /* renamed from: e */
    private final C69464a f68208e;

    /* renamed from: f */
    private C53981ap f68209f;

    public C25011j(C58833ax axVar, C25009h hVar, C69464a aVar, boolean z) {
        this.f68204a = axVar;
        this.f68205b = hVar;
        this.f68207d = z;
        this.f68208e = aVar;
    }

    /* renamed from: f */
    private final void m46284f() {
        this.f68206c = C58833ax.m90834k(C60899dm.m93001b(5.0d, new C60897dk()));
        C25009h hVar = this.f68205b;
        String str = (String) this.f68204a.mo56111f();
        C70334de deVar = new C70334de();
        C24998ak akVar = (C24998ak) hVar;
        String str2 = akVar.f68177e;
        if (str2 != null) {
            deVar.mo62033h(C24998ak.f68173a, str2);
        }
        this.f68209f = (C53981ap) ((C53981ap) ((C53981ap) akVar.f68174b.mo17428b()).mo62576o(new C70879r(deVar))).mo62577p(C61409d.f166071a, (C61410e) akVar.f68175c.mo56108d(new C24997aj(akVar)));
    }

    /* renamed from: a */
    public final C60870cx mo29498a(C54013bu buVar) {
        if (this.f68209f == null) {
            m46284f();
        }
        C53981ap apVar = this.f68209f;
        C70888j jVar = apVar.f189039a;
        C70338di diVar = C53983ar.f141637b;
        if (diVar == null) {
            synchronized (C53983ar.class) {
                diVar = C53983ar.f141637b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.lens.api.v1.LensApplicationService", "ListCloudCopyDevices");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54013bu.f141724a);
                    d.f187486b = C70850d.m103697c(C54015bw.f141726b);
                    diVar = d.mo62040a();
                    C53983ar.f141637b = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, apVar.f189040b), buVar);
    }

    /* renamed from: b */
    public final C60870cx mo29499b(C54032cm cmVar) {
        if (this.f68209f == null) {
            m46284f();
        }
        if (this.f68206c.mo56113h() && !((C60899dm) this.f68206c.mo56107c()).mo57395c()) {
            return C60856cj.m92899h(new C24104a());
        }
        C53981ap apVar = this.f68209f;
        C70888j jVar = apVar.f189039a;
        C70338di diVar = C53983ar.f141636a;
        if (diVar == null) {
            synchronized (C53983ar.class) {
                diVar = C53983ar.f141636a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.lens.api.v1.LensApplicationService", "SendCloudCopyPayload");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54032cm.f141762d);
                    d.f187486b = C70850d.m103697c(C54034co.f141767d);
                    diVar = d.mo62040a();
                    C53983ar.f141636a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, apVar.f189040b), cmVar);
    }

    /* renamed from: c */
    public final C60870cx mo29500c(C54040cu cuVar) {
        if (this.f68207d) {
            C25021t tVar = (C25021t) this.f68208e.mo17428b();
            tVar.mo30231b();
            ((C58970a) ((C58970a) C25021t.f68224b.mo56224b()).mo56372aa(49631)).mo56386p("Runs LensApplicationService.streamTranslateText()");
            cuVar.f141793c.size();
            C56244ay ayVar = cuVar.f141792b;
            if (ayVar == null) {
                ayVar = C56244ay.f149802e;
            }
            long j = ayVar.f149805b;
            C56244ay ayVar2 = cuVar.f141792b;
            if (ayVar2 == null) {
                ayVar2 = C56244ay.f149802e;
            }
            long j2 = ayVar2.f149807d;
            C70868g gVar = tVar.f68228f;
            if (gVar == null) {
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[2];
                C56244ay ayVar3 = cuVar.f141792b;
                objArr[0] = Long.valueOf((ayVar3 == null ? C56244ay.f149802e : ayVar3).f149805b);
                if (ayVar3 == null) {
                    ayVar3 = C56244ay.f149802e;
                }
                objArr[1] = Long.valueOf(ayVar3.f149807d);
                return C60856cj.m92899h(new Throwable(String.format(locale, "Could not send request (EyesSessionId: %s, PayloadId %d) because stream was closed.", objArr)));
            }
            C60870cx q = C60856cj.m92908q(C2169h.m6027a(new C25014m(tVar, cuVar)), C25021t.f68223a.toNanos(), TimeUnit.NANOSECONDS, tVar.f68226d);
            gVar.mo20123c(cuVar);
            return q;
        }
        if (this.f68209f == null) {
            m46284f();
        }
        C53981ap apVar = this.f68209f;
        C70888j jVar = apVar.f189039a;
        C70338di diVar = C53983ar.f141638c;
        if (diVar == null) {
            synchronized (C53983ar.class) {
                diVar = C53983ar.f141638c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.lens.api.v1.LensApplicationService", "TranslateText");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54040cu.f141789d);
                    d.f187486b = C70850d.m103697c(C54042cw.f141794e);
                    C70338di a = d.mo62040a();
                    C53983ar.f141638c = a;
                    diVar = a;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, apVar.f189040b), cuVar);
    }

    /* renamed from: d */
    public final void mo29501d() {
        if (this.f68207d) {
            ((C25021t) this.f68208e.mo17428b()).mo30231b();
        }
    }

    /* renamed from: e */
    public final void mo29502e() {
        if (this.f68207d) {
            ((C25021t) this.f68208e.mo17428b()).mo30233d();
        }
    }
}
