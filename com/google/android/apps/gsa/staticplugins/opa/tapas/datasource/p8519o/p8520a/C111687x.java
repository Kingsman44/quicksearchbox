package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.x */
/* compiled from: PG */
public final class C111687x implements C111674k {

    /* renamed from: a */
    private final boolean f310491a;

    /* renamed from: b */
    private final boolean f310492b;

    /* renamed from: c */
    private final C112037ao f310493c;

    public C111687x(C86124t tVar, C112037ao aoVar) {
        this.f310493c = aoVar;
        this.f310491a = tVar.mo79746e(C90063do.f249324bQ);
        this.f310492b = tVar.mo79746e(C90063do.f249526fG);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo99200b(com.google.assistant.p3781ad.p3789d.C48578al r8, java.lang.String r9) {
        /*
            r7 = this;
            j$.util.Optional r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187156c(r8)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0013
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x0013:
            java.lang.Object r0 = r0.get()
            com.google.assistant.ad.d.ad r0 = (com.google.assistant.p3781ad.p3789d.C48570ad) r0
            com.google.common.b.hd r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187154a(r8)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.ao r2 = r7.f310493c
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.an r0 = r2.mo99348a(r0)
            j$.util.Optional r2 = r0.mo99343e()
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x00ca
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = -1924688544(0xffffffff8d479560, float:-6.1501413E-31)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x004e
            r4 = -1305707300(0xffffffffb22c7cdc, float:-1.0040107E-8)
            if (r3 == r4) goto L_0x0044
            goto L_0x0058
        L_0x0044:
            java.lang.String r3 = "LocalEntityInfo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0058
            r2 = 1
            goto L_0x0059
        L_0x004e:
            java.lang.String r3 = "ShowEntity"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0058
            r2 = 0
            goto L_0x0059
        L_0x0058:
            r2 = -1
        L_0x0059:
            if (r2 == 0) goto L_0x00c3
            if (r2 == r6) goto L_0x005e
            goto L_0x00ca
        L_0x005e:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f311211b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249401co
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x006c
            com.google.assistant.ad.d.ad r2 = r0.f311210a
            int r2 = r2.f125483a
        L_0x006c:
            com.google.assistant.ad.d.ad r0 = r0.f311210a
            int r2 = r0.f125483a
            r2 = r2 & r6
            if (r2 == 0) goto L_0x00be
            com.google.knowledge.a.a.n r0 = r0.f125484b
            if (r0 != 0) goto L_0x0079
            com.google.knowledge.a.a.n r0 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0079:
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r3 = "Location"
            r2[r5] = r3
            j$.util.stream.Stream r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112050m.m185897c(r0, r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.ah r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112030ah.f311203a
            j$.util.stream.Stream r0 = r0.filter(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.ai r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112031ai.f311204a
            j$.util.stream.Stream r0 = r0.map(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.u r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112058u.f311232a
            j$.util.stream.Stream r0 = r0.map(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.v r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112059v.f311233a
            j$.util.stream.Stream r0 = r0.filter(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.w r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112060w.f311234a
            j$.util.stream.Stream r0 = r0.map(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.x r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112061x.f311235a
            j$.util.stream.Stream r0 = r0.filter(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.z r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112063z.f311237a
            j$.util.stream.Stream r0 = r0.map(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.aa r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112023aa.f311196a
            j$.util.stream.Stream r0 = r0.filter(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.ab r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112024ab.f311197a
            j$.util.stream.Stream r0 = r0.map(r2)
            j$.util.Optional r0 = r0.findFirst()
            goto L_0x00ce
        L_0x00be:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x00ce
        L_0x00c3:
            java.lang.String r2 = "Entity"
            j$.util.Optional r0 = r0.mo99345h(r2)
            goto L_0x00ce
        L_0x00ca:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x00ce:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x00dd
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x00dd:
            java.lang.Object r0 = r0.get()
            java.lang.Object r0 = r1.get(r0)
            com.google.protos.f.x.d r0 = (com.google.protos.p4985f.p5046x.C65379d) r0
            if (r0 == 0) goto L_0x01cf
            java.lang.String r1 = r0.f177779b
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r2 = r7.f310491a
            if (r2 == 0) goto L_0x0172
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r9 = r9.toLowerCase(r2)
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x0107
            goto L_0x01cf
        L_0x0107:
            java.lang.String r2 = "\\s+"
            com.google.common.base.y r3 = com.google.common.base.C58837ba.m90854c(r2)
            com.google.common.base.cf r3 = com.google.common.base.C58869cf.m90937c(r3)
            java.lang.Iterable r9 = r3.mo56153g(r9)
            com.google.common.base.y r2 = com.google.common.base.C58837ba.m90854c(r2)
            com.google.common.base.cf r2 = com.google.common.base.C58869cf.m90937c(r2)
            java.lang.Iterable r1 = r2.mo56153g(r1)
            java.util.Iterator r9 = r9.iterator()
        L_0x0125:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x01cf
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0125
            java.util.Iterator r3 = r1.iterator()
        L_0x013b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0125
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x013b
            int r5 = r2.length()
            int r6 = r4.length()
            if (r5 >= r6) goto L_0x0164
            java.lang.String r4 = com.google.common.base.C58890d.m90988c(r4)
            java.lang.String r5 = com.google.common.base.C58890d.m90988c(r2)
            boolean r4 = r4.startsWith(r5)
            goto L_0x0170
        L_0x0164:
            java.lang.String r5 = com.google.common.base.C58890d.m90988c(r2)
            java.lang.String r4 = com.google.common.base.C58890d.m90988c(r4)
            boolean r4 = r5.startsWith(r4)
        L_0x0170:
            if (r4 == 0) goto L_0x013b
        L_0x0172:
            boolean r9 = r7.f310492b
            if (r9 == 0) goto L_0x0190
            j$.util.Optional r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187157d(r8)
            boolean r9 = r9.isPresent()
            if (r9 != 0) goto L_0x0181
            goto L_0x0190
        L_0x0181:
            com.google.assistant.ad.d.b.ag r9 = com.google.assistant.p3781ad.p3789d.p3791b.C48672ag.TAPAS_SERVER
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs.m187210d(r0, r8, r9)
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89846n(r8)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x0190:
            j$.util.Optional r9 = p3186j$.util.Optional.m71637of(r0)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.s r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111682s.f310485a
            j$.util.Optional r9 = r9.filter(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.t r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111683t.f310486a
            j$.util.Optional r9 = r9.map(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.u r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111684u.f310487a
            j$.util.Optional r9 = r9.filter(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.v r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111685v.f310488a
            j$.util.Optional r9 = r9.map(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.w r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.w
            r1.<init>(r8, r0)
            j$.util.Optional r8 = r9.map(r1)
            boolean r9 = r8.isPresent()
            if (r9 == 0) goto L_0x01c6
            java.lang.Object r8 = r8.get()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r8 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez) r8
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89846n(r8)
            goto L_0x01ca
        L_0x01c6:
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x01ca:
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x01cf:
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111687x.mo99200b(com.google.assistant.ad.d.al, java.lang.String):com.google.common.util.concurrent.cx");
    }
}
