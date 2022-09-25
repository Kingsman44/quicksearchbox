package com.google.android.libraries.lens.view.p2085ax;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119095ad;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119096ae;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119106ao;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119107ap;
import com.google.android.libraries.lens.p2014e.p2015a.C24197p;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.lens.view.ax.o */
/* compiled from: PG */
final class C25613o implements C119095ad {

    /* renamed from: a */
    final /* synthetic */ C25614p f69667a;

    /* renamed from: b */
    private final C119096ae f69668b;

    public C25613o(C25614p pVar, C119096ae aeVar) {
        this.f69667a = pVar;
        this.f69668b = aeVar;
    }

    /* renamed from: l */
    private final void m47230l(C58485gu guVar) {
        C25614p pVar = this.f69667a;
        AtomicReference atomicReference = pVar.f69676h;
        if (atomicReference == null) {
            ((C59052c) ((C59052c) C25614p.f69669a.mo56226d()).mo56372aa(50201)).mo56386p("Highlights were detected, but there is no highlights listener.");
        } else {
            pVar.f69671c.execute(C47810es.m84977q(new C25612n(atomicReference, guVar)));
        }
    }

    /* renamed from: a */
    public final void mo30713a() {
        this.f69668b.mo104121m();
        this.f69667a.mo30727d(1);
        m47230l(C58485gu.m89845m());
        this.f69667a.f69675g.mo19974a(C37194a.f98420J.mo40815i(C62722b.OK));
    }

    /* renamed from: b */
    public final /* synthetic */ void mo30714b(int i) {
    }

    /* renamed from: c */
    public final void mo30715c() {
        this.f69668b.mo104117i(true);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo30716d() {
    }

    /* renamed from: e */
    public final void mo30717e(C119107ap apVar) {
        C25614p pVar = this.f69667a;
        C25604f fVar = pVar.f69677i;
        if (fVar == null) {
            ((C59052c) ((C59052c) C25614p.f69669a.mo56225c()).mo56372aa(50206)).mo56386p("OnWordChanged is triggered but the word start index map is empty!");
        } else if (pVar.f69676h != null && !fVar.mo30694b().isEmpty()) {
            C119106ao aoVar = apVar.f332241c;
            if (aoVar == null) {
                aoVar = C119106ao.f332233c;
            }
            int i = aoVar.f332235a;
            C119106ao aoVar2 = apVar.f332241c;
            if (aoVar2 == null) {
                aoVar2 = C119106ao.f332233c;
            }
            int i2 = aoVar2.f332236b;
            C58480gp e = C58485gu.m89837e();
            C58800sl lA = fVar.mo30694b().entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                int intValue = ((Integer) entry.getKey()).intValue();
                int length = ((C24197p) entry.getValue()).f66138c.length() + intValue + ((C24197p) entry.getValue()).f66139d.length();
                if ((intValue <= i && i < length) || (intValue <= i2 && i2 < length)) {
                    e.mo55395g((C24197p) entry.getValue());
                }
            }
            m47230l(e.mo55394f());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r4 = r4.mo30695c();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30718f(com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119111c r4, int r5) {
        /*
            r3 = this;
            com.google.common.f.e r0 = com.google.android.libraries.lens.view.p2085ax.C25614p.f69669a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "The request to Speakr failed."
            r2 = 50202(0xc41a, float:7.0348E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r4)).mo56372aa(r2)).mo56386p(r1)
            r0 = 2
            if (r5 != r0) goto L_0x005f
            boolean r5 = r4 instanceof com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119114f
            if (r5 != 0) goto L_0x005f
            com.google.android.apps.h.a.a.a.ae r5 = r3.f69668b
            r5.mo104116h()
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof p5488io.grpc.C70761fa
            if (r5 == 0) goto L_0x0059
            java.lang.Throwable r4 = r4.getCause()
            io.grpc.fa r4 = (p5488io.grpc.C70761fa) r4
            if (r4 == 0) goto L_0x0059
            io.grpc.Status r4 = r4.f188571a
            io.grpc.Status$Code r4 = r4.getCode()
            io.grpc.Status$Code r5 = p5488io.grpc.Status.Code.FAILED_PRECONDITION
            if (r4 != r5) goto L_0x0059
            com.google.android.libraries.lens.view.ax.p r4 = r3.f69667a
            r4.mo30726c(r0)
            com.google.android.libraries.lens.view.ax.p r4 = r3.f69667a
            com.google.android.libraries.lens.view.ax.f r4 = r4.f69677i
            if (r4 == 0) goto L_0x0048
            com.google.an.a.h r4 = r4.mo30695c()
            if (r4 == 0) goto L_0x0048
            java.lang.String r4 = r4.f30255g
            goto L_0x004a
        L_0x0048:
            java.lang.String r4 = "not_specified"
        L_0x004a:
            com.google.common.f.e r5 = com.google.android.libraries.lens.view.p2085ax.C25614p.f69669a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r0 = "Speakr returned language not supported for text with content language %s"
            r1 = 50203(0xc41b, float:7.035E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r1)).mo56389s(r0, r4)
            return
        L_0x0059:
            com.google.android.libraries.lens.view.ax.p r4 = r3.f69667a
            r5 = 3
            r4.mo30726c(r5)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2085ax.C25613o.mo30718f(com.google.android.apps.h.a.a.a.b.c, int):void");
    }

    /* renamed from: g */
    public final void mo30719g(int i) {
        this.f69667a.f69675g.mo19974a(C37194a.f98419I);
        this.f69667a.mo30727d(2);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo30720h() {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo30721i() {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo30722j() {
    }

    /* renamed from: k */
    public final void mo30723k(int i) {
        if (i == 2) {
            int d = ((C25616r) this.f69667a.f69673e.mo3842a()).mo30706d();
            if (d == 0) {
                throw null;
            } else if (d != 1) {
                this.f69667a.mo30727d(3);
                this.f69667a.f69675g.mo19974a(C37194a.f98420J.mo40815i(C62722b.CANCELLED));
            }
        }
    }
}
