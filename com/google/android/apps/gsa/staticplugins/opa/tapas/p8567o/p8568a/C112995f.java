package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.f */
/* compiled from: PG */
final class C112995f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f313130a;

    /* renamed from: b */
    final /* synthetic */ long f313131b;

    /* renamed from: c */
    final /* synthetic */ C121492b f313132c;

    /* renamed from: d */
    final /* synthetic */ C121492b f313133d;

    /* renamed from: e */
    final /* synthetic */ C112996g f313134e;

    public C112995f(C112996g gVar, String str, long j, C121492b bVar, C121492b bVar2) {
        this.f313134e = gVar;
        this.f313130a = str;
        this.f313131b = j;
        this.f313132c = bVar;
        this.f313133d = bVar2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C113408es esVar;
        this.f313132c.mo105190c();
        if (!this.f313134e.f313139e.mo79746e(C90063do.f249293am)) {
            C112996g gVar = this.f313134e;
            C113407er p = C113408es.m187705p();
            p.mo100093c(C58528ij.m90008H(C48672ag.values()));
            esVar = gVar.mo99807a(p.mo100091a());
        } else {
            esVar = C113408es.f314036b;
        }
        this.f313134e.mo99808b(esVar, this.f313130a, this.f313131b, this.f313133d);
        ((C59052c) ((C59052c) ((C59052c) C112996g.f313135a.mo56225c()).mo56382g(th)).mo56372aa(27895)).mo56386p("error getting Tapas entries");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fe  */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo17911gm(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es) r10
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r0 = r10.mo100118a()
            long r0 = r0.mo100016a()
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r2 = r9.f313134e
            dagger.a r2 = r2.f313140f
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.e.b r2 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b) r2
            r2.mo99672g(r0)
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r2 = r9.f313134e
            dagger.a r2 = r2.f313143i
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.ay.av r2 = (com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av) r2
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_BEGIN_RENDERING_RESULTS
            r2.mo96205a(r3)
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r2 = r9.f313134e
            dagger.a r2 = r2.f313141g
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.e.c r2 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c) r2
            java.lang.String r3 = "Begin rendering suggestions"
            r2.mo99630e(r0, r3)
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r2 = r9.f313134e
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a r2 = r2.f313144j
            java.util.Map r3 = r2.f310696a
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.remove(r4)
            java.util.Map r2 = r2.f310697b
            r2.remove(r4)
            com.google.common.b.gu r2 = r10.mo100053o()
            r2.size()
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r2 = r9.f313134e
            long r3 = r9.f313131b
            com.google.android.apps.search.assistant.platform.i.e.a.b r5 = r9.f313132c
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.a r6 = r2.f313142h
            java.util.concurrent.atomic.AtomicLong r6 = r6.f313118a
            long r6 = r6.get()
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0066
            java.lang.String r10 = "ignored"
            r5.mo105188a(r10)
            goto L_0x0081
        L_0x0066:
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.b r3 = r2.f313137c
            boolean r3 = r3.mo99368y()
            if (r3 != 0) goto L_0x0074
            java.lang.String r10 = "Tapas inactive"
            r5.mo105188a(r10)
            goto L_0x0081
        L_0x0074:
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.b r2 = r2.f313137c
            boolean r2 = r2.mo99365jF()
            if (r2 != 0) goto L_0x008b
            java.lang.String r10 = "Not typing"
            r5.mo105188a(r10)
        L_0x0081:
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r10 = r9.f313134e
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.b r10 = r10.f313137c
            java.lang.String r2 = r9.f313130a
            r10.mo99364jC(r0, r2)
            return
        L_0x008b:
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r0 = r9.f313134e
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f313139e
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249293am
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x00b2
            com.google.common.b.ij r0 = r10.mo100121d()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00aa
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r0 = r9.f313134e
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r10)
            r0.f313146l = r1
            goto L_0x00b2
        L_0x00aa:
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r0 = r9.f313134e
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r0 = r0.mo99807a(r10)
            r3 = r0
            goto L_0x00b3
        L_0x00b2:
            r3 = r10
        L_0x00b3:
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r0 = r9.f313134e
            dagger.a r0 = r0.f313140f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.e.b r0 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b) r0
            java.lang.String r1 = r9.f313130a
            r0.mo99678m(r1)
            com.google.android.apps.search.assistant.platform.i.e.a.f r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112996g.f313136b
            java.lang.String r4 = r9.f313130a
            long r5 = r9.f313131b
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.e r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.e
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5)
            java.lang.String r1 = "updateSuggestionsInner"
            r0.mo105241j(r1, r7)
            com.google.android.apps.search.assistant.platform.i.e.a.b r0 = r9.f313132c
            r0.mo105191d()
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r0 = r9.f313134e
            java.lang.String r2 = r9.f313130a
            long r3 = r9.f313131b
            com.google.android.apps.search.assistant.platform.i.e.a.b r5 = r9.f313133d
            r1 = r10
            r0.mo99808b(r1, r2, r3, r5)
            j$.util.Optional r0 = r10.mo100125g()
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x00fe
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r0 = r9.f313134e
            j$.util.Optional r10 = r10.mo100125g()
            java.lang.Object r10 = r10.get()
            com.google.common.o.a.aa r10 = (com.google.common.p4552o.p4553a.C59450aa) r10
            r0.f313145k = r10
            return
        L_0x00fe:
            com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.g r10 = r9.f313134e
            com.google.common.o.a.aa r0 = com.google.common.p4552o.p4553a.C59450aa.f157704d
            r10.f313145k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112995f.mo17911gm(java.lang.Object):void");
    }
}
