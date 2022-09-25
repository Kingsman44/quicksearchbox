package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111583h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8587h.C113491c;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.q */
/* compiled from: PG */
public final class C111680q implements C111674k {

    /* renamed from: a */
    private final C111583h f310480a;

    /* renamed from: b */
    private final PackageManager f310481b;

    /* renamed from: c */
    private final C113491c f310482c;

    /* renamed from: d */
    private final C86124t f310483d;

    /* renamed from: e */
    private final C68214a f310484e;

    public C111680q(C111583h hVar, PackageManager packageManager, C113491c cVar, C86124t tVar, C68214a aVar) {
        this.f310480a = hVar;
        this.f310481b = packageManager;
        this.f310482c = cVar;
        this.f310483d = tVar;
        this.f310484e = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        if (r0.isPresent() == false) goto L_0x00c1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo99200b(com.google.assistant.p3781ad.p3789d.C48578al r11, java.lang.String r12) {
        /*
            r10 = this;
            j$.util.Optional r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187156c(r11)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0013
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x0013:
            java.lang.Object r0 = r0.get()
            com.google.assistant.ad.d.ad r0 = (com.google.assistant.p3781ad.p3789d.C48570ad) r0
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.an r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.g.an
            com.google.android.apps.gsa.search.core.i.t r2 = r10.f310483d
            r1.<init>(r0, r2)
            j$.util.Optional r0 = r1.mo99343e()
            boolean r2 = r0.isEmpty()
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L_0x0033
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x00c5
        L_0x0033:
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            dagger.a r2 = r10.f310484e
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.p r2 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111591p) r2
            java.lang.String r2 = r2.mo99187a(r0)
            j$.util.Optional r2 = p3186j$.util.Optional.ofNullable(r2)
            boolean r5 = r2.isPresent()
            if (r5 == 0) goto L_0x0052
            r0 = r2
            goto L_0x00c5
        L_0x0052:
            java.lang.String r2 = "Turn_device_setting_on"
            boolean r2 = r0.equals(r2)
            java.lang.String r5 = "Device_setting_bare"
            if (r2 != 0) goto L_0x0072
            java.lang.String r2 = "Turn_device_setting_off"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0072
            java.lang.String r2 = "Show_device_setting"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0072
            boolean r2 = r0.equals(r5)
            if (r2 == 0) goto L_0x00c1
        L_0x0072:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "toggleable_setting"
            j$.util.Optional r0 = r1.mo99340b(r0)
            goto L_0x0085
        L_0x007f:
            java.lang.String r0 = "setting"
            j$.util.Optional r0 = r1.mo99340b(r0)
        L_0x0085:
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x00c1
            dagger.a r1 = r10.f310484e
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.p r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111591p) r1
            java.lang.Object r0 = r0.get()
            com.google.knowledge.a.a.j r0 = (com.google.knowledge.p4661a.p4662a.C61748j) r0
            int r2 = r0.f166802a
            r5 = 3
            if (r2 != r5) goto L_0x00a3
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.t r0 = (com.google.knowledge.p4661a.p4662a.C61758t) r0
            goto L_0x00a5
        L_0x00a3:
            com.google.knowledge.a.a.t r0 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
        L_0x00a5:
            int r2 = r0.f166826a
            if (r2 != r4) goto L_0x00ae
            java.lang.Object r0 = r0.f166827b
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00af
        L_0x00ae:
            r0 = r3
        L_0x00af:
            com.google.common.b.hd r1 = r1.f310326a
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r0)
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L_0x00c5
        L_0x00c1:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x00c5:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x026a
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r1 = r1.getAuthority()
            if (r1 != 0) goto L_0x00dd
            goto L_0x026a
        L_0x00dd:
            android.content.pm.PackageManager r2 = r10.f310481b
            r5 = 0
            android.content.pm.ProviderInfo r1 = r2.resolveContentProvider(r1, r5)
            if (r1 == 0) goto L_0x026a
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
            android.net.Uri r1 = android.net.Uri.parse(r1)
            if (r1 == 0) goto L_0x026a
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.c r2 = r10.f310482c
            boolean r2 = r2.mo100248d(r1)
            if (r2 == 0) goto L_0x026a
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.c r2 = r10.f310482c
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.b r1 = r2.mo100246b(r1)
            com.google.common.b.gu r2 = r1.mo100241b()
            com.google.common.b.ij r2 = com.google.common.p4522b.C58528ij.m90006F(r2)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0114
            int r2 = r1.mo100240a()
            if (r2 == 0) goto L_0x026a
        L_0x0114:
            j$.util.Optional r1 = r1.mo100245c()
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x026a
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x026a
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x026a
            java.lang.String r2 = "\\s+|‑|-"
            com.google.common.base.y r6 = com.google.common.base.C58837ba.m90854c(r2)
            com.google.common.base.cf r6 = com.google.common.base.C58869cf.m90937c(r6)
            java.lang.Iterable r12 = r6.mo56153g(r12)
            com.google.common.base.y r2 = com.google.common.base.C58837ba.m90854c(r2)
            com.google.common.base.cf r2 = com.google.common.base.C58869cf.m90937c(r2)
            java.lang.Iterable r1 = r2.mo56153g(r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x014e:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x026a
            java.lang.Object r2 = r12.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x014e
            java.util.Iterator r6 = r1.iterator()
        L_0x0164:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x014e
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x0164
            int r8 = r2.length()
            int r9 = r7.length()
            if (r8 >= r9) goto L_0x018d
            java.lang.String r7 = com.google.common.base.C58890d.m90988c(r7)
            java.lang.String r8 = com.google.common.base.C58890d.m90988c(r2)
            boolean r7 = r7.startsWith(r8)
            goto L_0x0199
        L_0x018d:
            java.lang.String r8 = com.google.common.base.C58890d.m90988c(r2)
            java.lang.String r7 = com.google.common.base.C58890d.m90988c(r7)
            boolean r7 = r8.startsWith(r7)
        L_0x0199:
            if (r7 == 0) goto L_0x0164
            com.google.android.libraries.searchbox.shared.suggestion.ag r12 = com.google.android.libraries.searchbox.shared.suggestion.C41667ag.f108943h
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.searchbox.shared.suggestion.ad r12 = (com.google.android.libraries.searchbox.shared.suggestion.C41664ad) r12
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.android.libraries.searchbox.shared.suggestion.ag r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41667ag) r2
            r1.getClass()
            int r6 = r2.f108945a
            r6 = r6 | r4
            r2.f108945a = r6
            r2.f108946b = r1
            com.google.protobuf.bv r12 = r12.build()
            com.google.android.libraries.searchbox.shared.suggestion.ag r12 = (com.google.android.libraries.searchbox.shared.suggestion.C41667ag) r12
            com.google.android.libraries.searchbox.shared.suggestion.e r1 = com.google.android.libraries.searchbox.shared.suggestion.C41679e.f109005p
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.searchbox.shared.suggestion.d r1 = (com.google.android.libraries.searchbox.shared.suggestion.C41678d) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.searchbox.shared.suggestion.e r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41679e) r2
            r12.getClass()
            r2.f109016j = r12
            int r12 = r2.f109007a
            r12 = r12 | 512(0x200, float:7.175E-43)
            r2.f109007a = r12
            com.google.protobuf.bv r12 = r1.build()
            com.google.android.libraries.searchbox.shared.suggestion.e r12 = (com.google.android.libraries.searchbox.shared.suggestion.C41679e) r12
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.h r1 = r10.f310480a
            j$.util.Optional r1 = r1.mo99182a(r11)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ah r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ah
            r6 = 2131233917(0x7f080c7d, float:1.8083985E38)
            r2.<init>(r6)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cl r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl.m187503d(r2)
            java.lang.Object r1 = r1.orElse(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cl r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl) r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ey r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez.m187750R()
            r6 = 20011(0x4e2b, float:2.8041E-41)
            r2.mo100167l(r6)
            r6 = 156(0x9c, float:2.19E-43)
            r2.mo100180y(r6)
            com.google.assistant.ad.d.an r6 = com.google.assistant.p3781ad.p3789d.C48580an.SLICE
            r2.mo100177v(r6)
            r2.mo100161f(r12)
            com.google.assistant.ad.d.b.ag r12 = com.google.assistant.p3781ad.p3789d.p3791b.C48672ag.TAPAS_SERVER
            r2.mo100175t(r12)
            j$.util.Optional r12 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187159f(r11)
            r6 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object r12 = r12.orElse(r6)
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            double r6 = (double) r12
            r2.mo100174s(r6)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
            r12 = r2
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.e r12 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e) r12
            r12.f313956d = r11
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cl[] r11 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl[r4]
            r11[r5] = r1
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89844l(r11)
            r12.f313968p = r11
            java.lang.Object r11 = r0.get()
            java.lang.String r11 = (java.lang.String) r11
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r11.getClass()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.c r12 = r10.f310482c
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.b r11 = r12.mo100246b(r11)
            j$.util.Optional r11 = r11.mo100245c()
            java.lang.Object r11 = r11.orElse(r3)
            java.lang.String r11 = (java.lang.String) r11
            r2.mo100164i(r11)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r11 = r2.mo100156a()
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89846n(r11)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x026a:
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111680q.mo99200b(com.google.assistant.ad.d.al, java.lang.String):com.google.common.util.concurrent.cx");
    }
}
