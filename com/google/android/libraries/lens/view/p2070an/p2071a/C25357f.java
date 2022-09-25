package com.google.android.libraries.lens.view.p2070an.p2071a;

import android.content.Context;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.p2014e.C24198aa;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.p2077as.C25475a;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58844bh;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4552o.amc;
import com.google.lens.p4694a.C62024ac;
import com.google.lens.p4694a.C62025ad;
import com.google.lens.p4694a.C62044aw;
import com.google.lens.p4694a.C62045ax;
import com.google.lens.p4694a.C62096cu;
import com.google.lens.p4694a.C62097cv;
import com.google.p4017at.p4056g.p4057a.p4058a.C53966aa;
import com.google.p4017at.p4056g.p4057a.p4058a.C53967ab;
import com.google.p4017at.p4056g.p4057a.p4058a.C53968ac;
import com.google.p4017at.p4056g.p4057a.p4058a.C54006bn;
import com.google.p4017at.p4056g.p4057a.p4058a.C54007bo;
import com.google.p4017at.p4056g.p4057a.p4058a.C54023cd;
import com.google.p4017at.p4056g.p4057a.p4058a.C54024ce;
import com.google.p4017at.p4056g.p4057a.p4058a.C54029cj;
import com.google.p4017at.p4056g.p4057a.p4058a.C54030ck;
import com.google.p4017at.p4056g.p4057a.p4058a.C54059k;
import com.google.p4017at.p4056g.p4057a.p4058a.C54060l;
import com.google.p4017at.p4056g.p4057a.p4058a.C54074z;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.an.a.f */
/* compiled from: PG */
public final class C25357f {

    /* renamed from: a */
    private final Resources f69059a;

    /* renamed from: b */
    private final C25354c f69060b;

    /* renamed from: c */
    private final LensConnectivityManager f69061c;

    /* renamed from: d */
    private final C25359h f69062d;

    /* renamed from: e */
    private final C27232l f69063e;

    /* renamed from: f */
    private final boolean f69064f;

    /* renamed from: g */
    private final C26059ax f69065g;

    /* renamed from: h */
    private final C25475a f69066h;

    /* renamed from: i */
    private final boolean f69067i;

    public C25357f(Context context, C25354c cVar, LensConnectivityManager lensConnectivityManager, C25359h hVar, C27232l lVar, boolean z, C26059ax axVar, C25475a aVar, boolean z2) {
        this.f69059a = context.getResources();
        this.f69060b = cVar;
        this.f69061c = lensConnectivityManager;
        this.f69062d = hVar;
        this.f69063e = lVar;
        this.f69064f = z;
        this.f69065g = axVar;
        this.f69066h = aVar;
        this.f69067i = z2;
    }

    /* renamed from: b */
    private final String m46699b() {
        if (this.f69061c.mo30907k()) {
            return BuildConfig.FLAVOR;
        }
        return String.format("%1$s · %2$s", new Object[]{this.f69059a.getString(R.string.lens_info_panel_on_device_results_header_offline), this.f69059a.getString(R.string.lens_info_panel_on_device_results_header_limited_functionality)});
    }

    /* renamed from: c */
    private static void m46700c(C58480gp gpVar, List list) {
        if (C58557jl.m90138s(list, C58844bh.NOT_NULL)) {
            C54023cd cdVar = (C54023cd) C54024ce.f141745c.createBuilder();
            C54059k kVar = (C54059k) C54060l.f141840c.createBuilder();
            Iterable e = C58557jl.m90124e(list, C58844bh.NOT_NULL);
            kVar.copyOnWrite();
            C54060l lVar = (C54060l) kVar.instance;
            C62971cq cqVar = lVar.f141842a;
            if (!cqVar.mo58948c()) {
                lVar.f141842a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(e, (List) lVar.f141842a);
            kVar.copyOnWrite();
            ((C54060l) kVar.instance).f141843b = 1;
            cdVar.copyOnWrite();
            C54024ce ceVar = (C54024ce) cdVar.instance;
            C54060l lVar2 = (C54060l) kVar.build();
            lVar2.getClass();
            ceVar.f141748b = lVar2;
            ceVar.f141747a = 6;
            gpVar.mo55395g((C54024ce) cdVar.build());
        }
    }

    /* renamed from: d */
    private static void m46701d(C58480gp gpVar, C56306df dfVar, String str, String str2) {
        C54023cd cdVar = (C54023cd) C54024ce.f141745c.createBuilder();
        C54029cj cjVar = (C54029cj) C54030ck.f141757c.createBuilder();
        C62044aw awVar = (C62044aw) C62045ax.f167623c.createBuilder();
        C62024ac acVar = (C62024ac) C62025ad.f167594e.createBuilder();
        acVar.copyOnWrite();
        C62025ad adVar = (C62025ad) acVar.instance;
        str.getClass();
        adVar.f167596a |= 2;
        adVar.f167597b = str;
        acVar.copyOnWrite();
        C62025ad adVar2 = (C62025ad) acVar.instance;
        adVar2.f167598c = dfVar.f150068m;
        adVar2.f167596a |= 8;
        acVar.copyOnWrite();
        C62025ad adVar3 = (C62025ad) acVar.instance;
        adVar3.f167596a |= 256;
        adVar3.f167599d = str2;
        awVar.copyOnWrite();
        C62045ax axVar = (C62045ax) awVar.instance;
        C62025ad adVar4 = (C62025ad) acVar.build();
        adVar4.getClass();
        axVar.f167626b = adVar4;
        axVar.f167625a = 27;
        cjVar.copyOnWrite();
        C62045ax axVar2 = (C62045ax) awVar.build();
        axVar2.getClass();
        ((C54030ck) cjVar.instance).f141760b = axVar2;
        cdVar.copyOnWrite();
        C54024ce ceVar = (C54024ce) cdVar.instance;
        C54030ck ckVar = (C54030ck) cjVar.build();
        ckVar.getClass();
        ceVar.f141748b = ckVar;
        ceVar.f141747a = 2;
        gpVar.mo55395g((C54024ce) cdVar.build());
    }

    /* renamed from: e */
    private final void m46702e(C24198aa aaVar, C58480gp gpVar, C56280cg cgVar, boolean z, C58833ax axVar) {
        amc amc;
        C58485gu f = gpVar.mo55394f();
        aaVar.mo29661g(f);
        if (z) {
            amc = this.f69062d.mo30409c(cgVar, f, axVar);
        } else {
            amc = this.f69062d.mo30408b(cgVar, f, axVar);
        }
        C54006bn bnVar = (C54006bn) C54007bo.f141701b.createBuilder();
        C63088z byteString = amc.toByteString();
        bnVar.copyOnWrite();
        byteString.getClass();
        ((C54007bo) bnVar.instance).f141703a = byteString;
        aaVar.mo29660f((C54007bo) bnVar.build());
    }

    /* renamed from: f */
    private static void m46703f(C58480gp gpVar, String str) {
        C54023cd cdVar = (C54023cd) C54024ce.f141745c.createBuilder();
        C54029cj cjVar = (C54029cj) C54030ck.f141757c.createBuilder();
        C62044aw awVar = (C62044aw) C62045ax.f167623c.createBuilder();
        C62096cu cuVar = (C62096cu) C62097cv.f167704h.createBuilder();
        cuVar.copyOnWrite();
        C62097cv cvVar = (C62097cv) cuVar.instance;
        str.getClass();
        cvVar.f167706a |= 1;
        cvVar.f167707b = str;
        awVar.copyOnWrite();
        C62045ax axVar = (C62045ax) awVar.instance;
        C62097cv cvVar2 = (C62097cv) cuVar.build();
        cvVar2.getClass();
        axVar.f167626b = cvVar2;
        axVar.f167625a = 41;
        cjVar.copyOnWrite();
        C62045ax axVar2 = (C62045ax) awVar.build();
        axVar2.getClass();
        ((C54030ck) cjVar.instance).f141760b = axVar2;
        cdVar.copyOnWrite();
        C54024ce ceVar = (C54024ce) cdVar.instance;
        C54030ck ckVar = (C54030ck) cjVar.build();
        ckVar.getClass();
        ceVar.f141748b = ckVar;
        ceVar.f141747a = 2;
        gpVar.mo55395g((C54024ce) cdVar.build());
    }

    /* renamed from: g */
    private final void m46704g(C58480gp gpVar, String str) {
        C54023cd cdVar = (C54023cd) C54024ce.f141745c.createBuilder();
        C54074z zVar = (C54074z) C53968ac.f141603f.createBuilder();
        zVar.copyOnWrite();
        str.getClass();
        ((C53968ac) zVar.instance).f141607c = str;
        String b = m46699b();
        zVar.copyOnWrite();
        b.getClass();
        ((C53968ac) zVar.instance).f141608d = b;
        cdVar.copyOnWrite();
        C54024ce ceVar = (C54024ce) cdVar.instance;
        C53968ac acVar = (C53968ac) zVar.build();
        acVar.getClass();
        ceVar.f141748b = acVar;
        ceVar.f141747a = 5;
        gpVar.mo55395g((C54024ce) cdVar.build());
    }

    /* renamed from: h */
    private final void m46705h(C58480gp gpVar, String str) {
        C54023cd cdVar = (C54023cd) C54024ce.f141745c.createBuilder();
        C54074z zVar = (C54074z) C53968ac.f141603f.createBuilder();
        String replaceAll = str.replaceAll("\\s+", " ");
        zVar.copyOnWrite();
        replaceAll.getClass();
        ((C53968ac) zVar.instance).f141607c = replaceAll;
        String b = m46699b();
        zVar.copyOnWrite();
        b.getClass();
        ((C53968ac) zVar.instance).f141608d = b;
        C53966aa aaVar = (C53966aa) C53967ab.f141600b.createBuilder();
        aaVar.copyOnWrite();
        ((C53967ab) aaVar.instance).f141602a = true;
        zVar.copyOnWrite();
        C53967ab abVar = (C53967ab) aaVar.build();
        abVar.getClass();
        ((C53968ac) zVar.instance).f141609e = abVar;
        cdVar.copyOnWrite();
        C54024ce ceVar = (C54024ce) cdVar.instance;
        C53968ac acVar = (C53968ac) zVar.build();
        acVar.getClass();
        ceVar.f141748b = acVar;
        ceVar.f141747a = 5;
        gpVar.mo55395g((C54024ce) cdVar.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r10 != 6) goto L_0x07ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0539  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo30406a(com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa r24, com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg r25, com.google.android.libraries.lens.p2014e.C24233y r26, java.lang.String r27, java.lang.String r28, android.util.Size r29, com.google.common.base.C58833ax r30, com.google.p4017at.p4056g.p4057a.p4058a.C54038cs r31) {
        /*
            r23 = this;
            r6 = r23
            r0 = r24
            r3 = r25
            r1 = r26
            r2 = r27
            r4 = r29
            r5 = r31
            com.google.protobuf.cq r7 = r3.f149994a
            int r7 = r7.size()
            if (r7 != 0) goto L_0x0019
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x0019:
            com.google.android.libraries.lens.e.aa r7 = com.google.android.libraries.lens.p2014e.C24199ab.m45019m()
            r8 = 1
            r7.mo29659e(r8)
            com.google.common.b.gp r9 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.bp.f.b.a.df r10 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.UNKNOWN_FILTER_TYPE
            com.google.protobuf.cq r10 = r3.f149994a
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            com.google.bp.f.b.a.ce r10 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce) r10
            int r10 = r10.f149991d
            com.google.bp.f.b.a.df r10 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.m87964a(r10)
            if (r10 != 0) goto L_0x003a
            com.google.bp.f.b.a.df r10 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.UNKNOWN_FILTER_TYPE
        L_0x003a:
            int r10 = r10.ordinal()
            r15 = 6
            r16 = 4
            r14 = 3
            r18 = 0
            if (r10 == r8) goto L_0x004c
            if (r10 == r14) goto L_0x0050
            if (r10 == r15) goto L_0x004c
            goto L_0x07ee
        L_0x004c:
            r13 = r30
            goto L_0x06b0
        L_0x0050:
            boolean r10 = r26.mo29768k()
            r19 = r10 ^ 1
            java.lang.String r20 = ""
            if (r8 != r10) goto L_0x005d
            r21 = r20
            goto L_0x005f
        L_0x005d:
            r21 = r28
        L_0x005f:
            com.google.at.g.a.a.cs r22 = com.google.p4017at.p4056g.p4057a.p4058a.C54038cs.f141782f
            com.google.protobuf.bn r22 = r22.createBuilder()
            r15 = r22
            com.google.at.g.a.a.cr r15 = (com.google.p4017at.p4056g.p4057a.p4058a.C54037cr) r15
            com.google.bp.f.b.a.aw r13 = com.google.android.libraries.lens.view.p2070an.p2071a.C25361j.m46716a(r24)
            r15.copyOnWrite()
            com.google.protobuf.bv r12 = r15.instance
            com.google.at.g.a.a.cs r12 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r12
            r13.getClass()
            r12.f141784a = r13
            java.lang.String r12 = r5.f141787d
            r15.copyOnWrite()
            com.google.protobuf.bv r13 = r15.instance
            com.google.at.g.a.a.cs r13 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r13
            r12.getClass()
            r13.f141787d = r12
            com.google.protos.bf.a.a.bs r5 = r5.f141788e
            if (r5 != 0) goto L_0x008d
            com.google.protos.bf.a.a.bs r5 = com.google.protos.p4963bf.p4964a.p4965a.C64597bs.f175135c
        L_0x008d:
            r15.copyOnWrite()
            com.google.protobuf.bv r12 = r15.instance
            com.google.at.g.a.a.cs r12 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r12
            r5.getClass()
            r12.f141788e = r5
            com.google.bp.f.b.a.ag r5 = r26.mo29767j()
            com.google.protobuf.cq r12 = r5.f149765b
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x00b1
            r15.copyOnWrite()
            com.google.protobuf.bv r12 = r15.instance
            com.google.at.g.a.a.cs r12 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r12
            r5.getClass()
            r12.f141785b = r5
        L_0x00b1:
            com.google.protobuf.bv r5 = r15.build()
            com.google.at.g.a.a.cs r5 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r5
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90833j(r5)
            r13 = r7
            com.google.android.libraries.lens.e.g r13 = (com.google.android.libraries.lens.p2014e.C24215g) r13
            r13.f66218d = r12
            com.google.bp.f.b.a.aw r12 = r5.f141784a
            if (r12 != 0) goto L_0x00c6
            com.google.bp.f.b.a.aw r12 = com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw.f149799b
        L_0x00c6:
            java.util.Locale r15 = java.util.Locale.forLanguageTag(r21)
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r15)
            java.lang.String r12 = com.google.android.libraries.lens.common.text.C24141q.m44839a(r12, r15)
            com.google.android.libraries.lens.view.as.a r15 = r6.f69066h
            com.google.android.libraries.lens.view.l.l r14 = r6.f69063e
            boolean r14 = r15.mo30509a(r14, r3)
            if (r14 == 0) goto L_0x0166
            boolean r14 = r12.isEmpty()
            if (r14 != 0) goto L_0x0166
            com.google.bp.f.b.a.ag r14 = r5.f141785b
            if (r14 == 0) goto L_0x00e8
            goto L_0x0166
        L_0x00e8:
            com.google.lens.j.go r0 = com.google.lens.p4707j.C62573go.f168932d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.lens.j.gn r0 = (com.google.lens.p4707j.C62572gn) r0
            if (r19 == 0) goto L_0x00f3
            goto L_0x00fc
        L_0x00f3:
            android.content.res.Resources r1 = r6.f69059a
            r2 = 2132089010(0x7f1518b2, float:1.981832E38)
            java.lang.String r20 = r1.getString(r2)
        L_0x00fc:
            r1 = r20
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.lens.j.go r2 = (com.google.lens.p4707j.C62573go) r2
            r1.getClass()
            int r4 = r2.f168934a
            r4 = r4 | 4
            r2.f168934a = r4
            r2.f168936c = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.lens.j.go r0 = (com.google.lens.p4707j.C62573go) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r13.f66219e = r0
            com.google.at.g.a.a.bo r0 = com.google.p4017at.p4056g.p4057a.p4058a.C54007bo.f141701b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.at.g.a.a.bn r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54006bn) r0
            com.google.android.libraries.lens.view.an.a.h r1 = r6.f69062d
            r13 = r30
            com.google.common.o.ama r1 = r1.mo30407a(r3, r13)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.common.o.amc r2 = (com.google.common.p4552o.amc) r2
            com.google.common.o.amc r3 = com.google.common.p4552o.amc.f159123i
            int r3 = r2.f159125a
            r3 = r3 | r8
            r2.f159125a = r3
            r3 = 21
            r2.f159126b = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.common.o.amc r1 = (com.google.common.p4552o.amc) r1
            com.google.protobuf.z r1 = r1.toByteString()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.at.g.a.a.bo r2 = (com.google.p4017at.p4056g.p4057a.p4058a.C54007bo) r2
            r1.getClass()
            r2.f141703a = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.at.g.a.a.bo r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54007bo) r0
            r7.mo29660f(r0)
            com.google.android.libraries.lens.e.ab r0 = r7.mo29655a()
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            return r0
        L_0x0166:
            r13 = r30
            com.google.bp.f.b.a.aw r1 = com.google.android.libraries.lens.view.p2070an.p2071a.C25361j.m46717b(r0, r1, r4)
            com.google.bp.f.b.a.ag r14 = r5.f141785b
            if (r14 != 0) goto L_0x0172
            com.google.bp.f.b.a.ag r14 = com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag.f149762e
        L_0x0172:
            com.google.android.libraries.lens.view.am.i r15 = com.google.android.libraries.lens.view.p2069am.C25333i.f68945c
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.android.libraries.lens.view.am.h r15 = (com.google.android.libraries.lens.view.p2069am.C25332h) r15
            int r8 = r29.getWidth()
            r15.copyOnWrite()
            com.google.protobuf.bv r11 = r15.instance
            com.google.android.libraries.lens.view.am.i r11 = (com.google.android.libraries.lens.view.p2069am.C25333i) r11
            r11.f68947a = r8
            int r4 = r29.getHeight()
            r15.copyOnWrite()
            com.google.protobuf.bv r8 = r15.instance
            com.google.android.libraries.lens.view.am.i r8 = (com.google.android.libraries.lens.view.p2069am.C25333i) r8
            r8.f68948b = r4
            com.google.protobuf.bv r4 = r15.build()
            com.google.android.libraries.lens.view.am.i r4 = (com.google.android.libraries.lens.view.p2069am.C25333i) r4
            com.google.protobuf.cq r8 = r14.f149765b
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r8)
            com.google.android.libraries.lens.view.an.a.d r11 = new com.google.android.libraries.lens.view.an.a.d
            r11.<init>(r4)
            j$.util.stream.Stream r8 = r8.map(r11)
            j$.util.stream.Collector r11 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r8 = r8.collect(r11)
            com.google.common.b.gu r8 = (com.google.common.p4522b.C58485gu) r8
            com.google.bp.f.b.a.aw r11 = com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw.f149799b
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.bp.f.b.a.al r11 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56231al) r11
            com.google.protobuf.cq r1 = r1.f149801a
            java.util.Iterator r1 = r1.iterator()
        L_0x01bf:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x01f0
            java.lang.Object r14 = r1.next()
            com.google.bp.f.b.a.ap r14 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap) r14
            com.google.bp.f.b.a.ae r15 = r14.f149784c
            if (r15 != 0) goto L_0x01d1
            com.google.bp.f.b.a.ae r15 = com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae.f149753h
        L_0x01d1:
            com.google.android.libraries.lens.e.a.n r15 = com.google.android.libraries.lens.view.p2177w.C28185a.m52689g(r15, r4)
            r26 = r1
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r8)
            r28 = r8
            com.google.android.libraries.lens.view.an.a.e r8 = new com.google.android.libraries.lens.view.an.a.e
            r8.<init>(r15, r4)
            boolean r1 = r1.anyMatch(r8)
            if (r1 == 0) goto L_0x01eb
            r11.mo54338b(r14)
        L_0x01eb:
            r1 = r26
            r8 = r28
            goto L_0x01bf
        L_0x01f0:
            com.google.protobuf.bv r1 = r11.build()
            com.google.bp.f.b.a.aw r1 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw) r1
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            java.lang.String r1 = com.google.android.libraries.lens.common.text.C24141q.m44839a(r1, r4)
            com.google.bp.f.b.a.aw r0 = com.google.android.libraries.lens.view.p2070an.p2071a.C25361j.m46716a(r24)
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            java.lang.String r0 = com.google.android.libraries.lens.common.text.C24141q.m44839a(r0, r4)
            com.google.bp.f.b.a.ag r4 = r5.f141785b
            if (r4 != 0) goto L_0x020c
            com.google.bp.f.b.a.ag r4 = com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag.f149762e
        L_0x020c:
            java.lang.String r4 = r4.f149767d
            com.google.protobuf.cq r5 = r3.f149994a
            r8 = 0
            java.lang.Object r5 = r5.get(r8)
            com.google.bp.f.b.a.ce r5 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce) r5
            int r8 = r5.f149989b
            r11 = 3
            if (r8 != r11) goto L_0x0221
            java.lang.Object r5 = r5.f149990c
            com.google.bp.f.b.a.cd r5 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd) r5
            goto L_0x0223
        L_0x0221:
            com.google.bp.f.b.a.cd r5 = com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd.f149981d
        L_0x0223:
            boolean r8 = r12.isEmpty()
            if (r8 == 0) goto L_0x023c
            com.google.bp.f.b.a.df r0 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            android.content.res.Resources r1 = r6.f69059a
            r2 = 2132088805(0x7f1517e5, float:1.9817904E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "translate_failure"
            m46701d(r9, r0, r1, r2)
            r4 = 0
            goto L_0x069c
        L_0x023c:
            boolean r8 = r4.isEmpty()
            r11 = 7
            if (r8 == 0) goto L_0x054c
            android.content.res.Resources r1 = r6.f69059a
            if (r19 == 0) goto L_0x024b
            r4 = 2132088895(0x7f15183f, float:1.9818086E38)
            goto L_0x024e
        L_0x024b:
            r4 = 2132088897(0x7f151841, float:1.981809E38)
        L_0x024e:
            java.lang.String r1 = r1.getString(r4)
            r6.m46704g(r9, r1)
            com.google.at.g.a.a.j[] r1 = new com.google.p4017at.p4056g.p4057a.p4058a.C54058j[r11]
            com.google.android.libraries.lens.view.an.a.c r4 = r6.f69060b
            com.google.at.g.a.a.j r4 = r4.mo30398e(r2, r5)
            r8 = 0
            r1[r8] = r4
            com.google.android.libraries.lens.view.l.l r4 = r6.f69063e
            com.google.common.base.ax r4 = r4.mo32701h()
            boolean r4 = com.google.lens.p4711m.C62632i.m94823h(r4)
            if (r4 == 0) goto L_0x0273
            com.google.android.libraries.lens.view.an.a.c r4 = r6.f69060b
            com.google.at.g.a.a.j r4 = r4.mo30397d(r0)
            goto L_0x0275
        L_0x0273:
            r4 = r18
        L_0x0275:
            r8 = 1
            r1[r8] = r4
            com.google.android.libraries.lens.view.an.a.c r4 = r6.f69060b
            com.google.at.g.a.a.j r4 = r4.mo30396c()
            r8 = 2
            r1[r8] = r4
            com.google.android.libraries.lens.view.an.a.c r4 = r6.f69060b
            r8 = r21
            r10 = 94524(0x1713c, float:1.32456E-40)
            com.google.at.g.a.a.j r4 = r4.mo30400g(r8, r10)
            r8 = 3
            r1[r8] = r4
            java.lang.String r4 = "end;"
            if (r19 == 0) goto L_0x0347
            com.google.android.libraries.lens.view.an.a.c r8 = r6.f69060b
            com.google.at.g.a.a.j r10 = com.google.p4017at.p4056g.p4057a.p4058a.C54058j.f141828j
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.at.g.a.a.g r10 = (com.google.p4017at.p4056g.p4057a.p4058a.C54055g) r10
            java.lang.String r11 = r8.mo30405o()
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.at.g.a.a.j r12 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r12
            r11.getClass()
            r12.f141830a = r11
            android.content.res.Resources r11 = r8.f69049g
            r12 = 2132088887(0x7f151837, float:1.981807E38)
            java.lang.String r11 = r11.getString(r12)
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.at.g.a.a.j r12 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r12
            r11.getClass()
            r12.f141831b = r11
            android.content.res.Resources r11 = r8.f69049g
            r12 = 2132088888(0x7f151838, float:1.9818072E38)
            java.lang.String r11 = r11.getString(r12)
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.at.g.a.a.j r12 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r12
            r11.getClass()
            r12.f141836g = r11
            com.google.android.libraries.lens.view.an.a.b r11 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.f69035b
            com.google.at.g.a.a.ae r8 = r8.mo30404k(r11)
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.at.g.a.a.j r11 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r11
            r8.getClass()
            r11.f141832c = r8
            com.google.at.g.a.a.b r8 = com.google.p4017at.p4056g.p4057a.p4058a.C53992b.f141653e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.at.g.a.a.a r8 = (com.google.p4017at.p4056g.p4057a.p4058a.C53951a) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.at.g.a.a.b r11 = (com.google.p4017at.p4056g.p4057a.p4058a.C53992b) r11
            r12 = 1
            r11.f141657c = r12
            java.lang.String r11 = "save-to/share-translate"
            java.lang.String r11 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.m46682m(r11)
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.at.g.a.a.b r12 = (com.google.p4017at.p4056g.p4057a.p4058a.C53992b) r12
            r14 = 3
            r12.f141655a = r14
            java.lang.String r11 = r11.concat(r4)
            r12.f141656b = r11
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.at.g.a.a.j r11 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r11
            com.google.protobuf.bv r8 = r8.build()
            com.google.at.g.a.a.b r8 = (com.google.p4017at.p4056g.p4057a.p4058a.C53992b) r8
            r8.getClass()
            r11.f141833d = r8
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.at.g.a.a.j r8 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r8
            r11 = 3
            r8.f141835f = r11
            r8 = 117556(0x1cb34, float:1.64731E-40)
            com.google.at.g.a.a.cz r8 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.m46681l(r8)
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.at.g.a.a.j r11 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r11
            r8.getClass()
            r11.f141834e = r8
            com.google.protobuf.bv r8 = r10.build()
            com.google.at.g.a.a.j r8 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r8
            goto L_0x0349
        L_0x0347:
            r8 = r18
        L_0x0349:
            r1[r16] = r8
            com.google.android.libraries.lens.view.an.a.c r8 = r6.f69060b
            com.google.android.libraries.lens.view.filters.translation.ax r10 = r6.f69065g
            com.google.common.base.ax r10 = r10.f70799M
            com.google.android.libraries.lens.view.connectivity.LensConnectivityManager r11 = r8.f69050h
            boolean r11 = r11.mo30907k()
            if (r11 == 0) goto L_0x0528
            boolean r11 = r10.mo56113h()
            if (r11 != 0) goto L_0x0361
            goto L_0x0528
        L_0x0361:
            java.lang.String r11 = r5.f149985c
            java.util.Locale r11 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.m46684p(r11)
            java.util.Locale r12 = com.google.android.libraries.lens.view.filters.translation.C26217r.f71251a
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0379
            boolean r12 = r27.isEmpty()
            if (r12 != 0) goto L_0x0379
            java.util.Locale r11 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.m46684p(r27)
        L_0x0379:
            java.lang.String r2 = r5.f149984b
            java.util.Locale r2 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.m46684p(r2)
            com.google.android.libraries.lens.view.filters.translation.a.j r5 = r8.f69052j
            boolean r5 = r5.mo31241d(r11)
            if (r5 != 0) goto L_0x039a
            java.util.Locale r5 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.f69039f
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x039a
            java.util.Locale r5 = com.google.android.libraries.lens.view.filters.translation.C26217r.f71251a
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0398
            goto L_0x039a
        L_0x0398:
            r5 = 0
            goto L_0x039b
        L_0x039a:
            r5 = 1
        L_0x039b:
            com.google.android.libraries.lens.view.filters.translation.a.j r12 = r8.f69052j
            boolean r12 = r12.mo31241d(r2)
            if (r12 != 0) goto L_0x03ae
            java.util.Locale r12 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.f69039f
            boolean r12 = r2.equals(r12)
            if (r12 == 0) goto L_0x03ac
            goto L_0x03ae
        L_0x03ac:
            r12 = 0
            goto L_0x03af
        L_0x03ae:
            r12 = 1
        L_0x03af:
            if (r5 == 0) goto L_0x0528
            if (r12 != 0) goto L_0x03b5
            goto L_0x0528
        L_0x03b5:
            java.util.Locale r5 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.f69039f
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x03d4
            java.util.Locale r5 = com.google.android.libraries.lens.view.filters.translation.C26217r.f71251a
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x03d4
            java.lang.Object r5 = r10.mo56107c()
            com.google.common.b.ij r5 = (com.google.common.p4522b.C58528ij) r5
            boolean r5 = r5.contains(r11)
            if (r5 == 0) goto L_0x03d2
            goto L_0x03d4
        L_0x03d2:
            r5 = 0
            goto L_0x03d5
        L_0x03d4:
            r5 = 1
        L_0x03d5:
            java.util.Locale r12 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.f69039f
            boolean r12 = r2.equals(r12)
            if (r12 != 0) goto L_0x03ec
            java.lang.Object r10 = r10.mo56107c()
            com.google.common.b.ij r10 = (com.google.common.p4522b.C58528ij) r10
            boolean r10 = r10.contains(r2)
            if (r10 == 0) goto L_0x03ea
            goto L_0x03ec
        L_0x03ea:
            r10 = 0
            goto L_0x03ed
        L_0x03ec:
            r10 = 1
        L_0x03ed:
            if (r5 != 0) goto L_0x03f0
            goto L_0x03f3
        L_0x03f0:
            if (r10 != 0) goto L_0x0528
            r11 = r2
        L_0x03f3:
            java.lang.String r2 = r8.mo30405o()
            com.google.lens.j.x r5 = com.google.lens.p4707j.C62590x.f168982b
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.lens.j.w r5 = (com.google.lens.p4707j.C62589w) r5
            java.lang.String r10 = com.google.android.libraries.lens.view.utils.C28136y.m52430a(r11)
            r5.mo58506a(r10)
            java.lang.String r10 = "en"
            r5.mo58506a(r10)
            com.google.protobuf.bv r5 = r5.build()
            com.google.lens.j.x r5 = (com.google.lens.p4707j.C62590x) r5
            java.lang.String r10 = "translate-model/%s"
            java.lang.String r10 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.m46682m(r10)
            com.google.common.l.i r12 = com.google.common.p4541l.C59326i.f157517e
            byte[] r5 = r5.toByteArray()
            int r14 = r5.length
            java.lang.String r5 = r12.mo56837l(r5, r14)
            java.lang.String r12 = "com.google.opa.eyes.EXTRA_DOWNLOAD_LANGUAGE_METADATA"
            java.lang.String r5 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.m46683n(r12, r5)
            java.lang.String r12 = "com.google.opa.eyes.EXTRA_SOURCE_CHIP_ID"
            java.lang.String r12 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.m46683n(r12, r2)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r5)
            r14.append(r12)
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            com.google.android.libraries.lens.view.filters.translation.r r5 = r8.f69051i
            java.lang.String r5 = r5.mo31434d(r11)
            android.content.res.Resources r10 = r8.f69049g
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r14 = 0
            r12[r14] = r5
            r15 = 2132088871(0x7f151827, float:1.9818038E38)
            java.lang.String r10 = r10.getString(r15, r12)
            android.content.res.Resources r12 = r8.f69049g
            java.lang.Object[] r15 = new java.lang.Object[r11]
            r15[r14] = r5
            r14 = 2132088873(0x7f151829, float:1.9818042E38)
            java.lang.String r12 = r12.getString(r14, r15)
            android.content.res.Resources r14 = r8.f69049g
            java.lang.Object[] r15 = new java.lang.Object[r11]
            r11 = 0
            r15[r11] = r5
            r5 = 2132088872(0x7f151828, float:1.981804E38)
            java.lang.String r5 = r14.getString(r5, r15)
            com.google.at.g.a.a.j r11 = com.google.p4017at.p4056g.p4057a.p4058a.C54058j.f141828j
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.at.g.a.a.g r11 = (com.google.p4017at.p4056g.p4057a.p4058a.C54055g) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.at.g.a.a.j r14 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r14
            r2.getClass()
            r14.f141830a = r2
            com.google.android.libraries.lens.view.an.a.b r2 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.f69036c
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.String r16 = "download"
            r17 = 0
            r15[r17] = r16
            java.lang.String r15 = java.lang.String.format(r4, r15)
            com.google.at.g.a.a.h r2 = r8.mo30394a(r14, r10, r2, r15)
            r2.copyOnWrite()
            com.google.protobuf.bv r15 = r2.instance
            com.google.at.g.a.a.i r15 = (com.google.p4017at.p4056g.p4057a.p4058a.C54057i) r15
            com.google.at.g.a.a.i r16 = com.google.p4017at.p4056g.p4057a.p4058a.C54057i.f141819g
            r10.getClass()
            r15.f141826f = r10
            r11.mo54061a(r2)
            com.google.android.libraries.lens.view.an.a.b r2 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.f69037d
            java.lang.Object[] r10 = new java.lang.Object[r14]
            java.lang.String r14 = "remove"
            r15 = 0
            r10[r15] = r14
            java.lang.String r10 = java.lang.String.format(r4, r10)
            r14 = 2
            com.google.at.g.a.a.h r2 = r8.mo30394a(r14, r5, r2, r10)
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.at.g.a.a.i r10 = (com.google.p4017at.p4056g.p4057a.p4058a.C54057i) r10
            r12.getClass()
            r10.f141823c = r12
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.at.g.a.a.i r10 = (com.google.p4017at.p4056g.p4057a.p4058a.C54057i) r10
            r5.getClass()
            r10.f141826f = r5
            r11.mo54061a(r2)
            com.google.android.libraries.lens.view.an.a.b r2 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.f69038e
            r5 = 1
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.String r5 = "cancel"
            r14 = 0
            r10[r14] = r5
            java.lang.String r4 = java.lang.String.format(r4, r10)
            r5 = 3
            com.google.at.g.a.a.h r2 = r8.mo30394a(r5, r12, r2, r4)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.at.g.a.a.i r4 = (com.google.p4017at.p4056g.p4057a.p4058a.C54057i) r4
            r12.getClass()
            r4.f141826f = r12
            r11.mo54061a(r2)
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.at.g.a.a.j r2 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r2
            r4 = 2
            r2.f141835f = r4
            r2 = 96879(0x17a6f, float:1.35756E-40)
            com.google.at.g.a.a.cz r2 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.m46681l(r2)
            r11.copyOnWrite()
            com.google.protobuf.bv r4 = r11.instance
            com.google.at.g.a.a.j r4 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r4
            r2.getClass()
            r4.f141834e = r2
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.at.g.a.a.j r2 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r2
            r4 = 1
            r2.f141838i = r4
            com.google.protobuf.bv r2 = r11.build()
            com.google.at.g.a.a.j r2 = (com.google.p4017at.p4056g.p4057a.p4058a.C54058j) r2
            goto L_0x052a
        L_0x0528:
            r2 = r18
        L_0x052a:
            r4 = 5
            r1[r4] = r2
            com.google.android.libraries.lens.view.l.l r2 = r6.f69063e
            com.google.common.base.ax r2 = r2.mo32701h()
            boolean r2 = com.google.lens.p4711m.C62632i.m94823h(r2)
            if (r2 != 0) goto L_0x053f
            com.google.android.libraries.lens.view.an.a.c r2 = r6.f69060b
            com.google.at.g.a.a.j r18 = r2.mo30401h(r0)
        L_0x053f:
            r0 = 6
            r1[r0] = r18
            java.util.List r0 = java.util.Arrays.asList(r1)
            m46700c(r9, r0)
        L_0x0549:
            r4 = 1
            goto L_0x069c
        L_0x054c:
            r8 = r21
            r6.m46705h(r9, r4)
            r0 = 1
            if (r0 != r10) goto L_0x0555
            r1 = r4
        L_0x0555:
            r0 = 8
            com.google.at.g.a.a.j[] r0 = new com.google.p4017at.p4056g.p4057a.p4058a.C54058j[r0]
            com.google.android.libraries.lens.view.an.a.c r10 = r6.f69060b
            com.google.at.g.a.a.j r10 = r10.mo30398e(r2, r5)
            r12 = 0
            r0[r12] = r10
            com.google.android.libraries.lens.view.l.l r10 = r6.f69063e
            com.google.common.base.ax r10 = r10.mo32701h()
            boolean r10 = com.google.lens.p4711m.C62632i.m94823h(r10)
            if (r10 == 0) goto L_0x0575
            com.google.android.libraries.lens.view.an.a.c r10 = r6.f69060b
            com.google.at.g.a.a.j r10 = r10.mo30397d(r1)
            goto L_0x0577
        L_0x0575:
            r10 = r18
        L_0x0577:
            r12 = 1
            r0[r12] = r10
            com.google.android.libraries.lens.view.an.a.c r10 = r6.f69060b
            com.google.at.g.a.a.j r10 = r10.mo30395b(r4)
            r12 = 2
            r0[r12] = r10
            com.google.android.libraries.lens.view.an.a.c r10 = r6.f69060b
            com.google.at.g.a.a.j r10 = r10.mo30399f(r4)
            r12 = 3
            r0[r12] = r10
            boolean r10 = r6.f69064f
            if (r10 != 0) goto L_0x0597
            com.google.android.libraries.lens.view.an.a.c r10 = r6.f69060b
            com.google.at.g.a.a.j r10 = r10.mo30402i(r4)
            goto L_0x0599
        L_0x0597:
            r10 = r18
        L_0x0599:
            r0[r16] = r10
            com.google.android.libraries.lens.view.an.a.c r10 = r6.f69060b
            r12 = 94525(0x1713d, float:1.32458E-40)
            com.google.at.g.a.a.j r8 = r10.mo30400g(r8, r12)
            r10 = 5
            r0[r10] = r8
            boolean r8 = r6.f69064f
            if (r8 == 0) goto L_0x05b2
            com.google.android.libraries.lens.view.an.a.c r8 = r6.f69060b
            com.google.at.g.a.a.j r8 = r8.mo30402i(r4)
            goto L_0x05b4
        L_0x05b2:
            r8 = r18
        L_0x05b4:
            r10 = 6
            r0[r10] = r8
            com.google.android.libraries.lens.view.l.l r8 = r6.f69063e
            com.google.common.base.ax r8 = r8.mo32701h()
            boolean r8 = com.google.lens.p4711m.C62632i.m94823h(r8)
            if (r8 != 0) goto L_0x05c9
            com.google.android.libraries.lens.view.an.a.c r8 = r6.f69060b
            com.google.at.g.a.a.j r18 = r8.mo30401h(r1)
        L_0x05c9:
            r0[r11] = r18
            java.util.List r0 = java.util.Arrays.asList(r0)
            m46700c(r9, r0)
            if (r19 == 0) goto L_0x05e5
            boolean r0 = r6.f69064f
            if (r0 == 0) goto L_0x0549
            com.google.android.libraries.lens.view.connectivity.LensConnectivityManager r0 = r6.f69061c
            boolean r0 = r0.mo30907k()
            if (r0 == 0) goto L_0x0549
            m46703f(r9, r4)
            goto L_0x0549
        L_0x05e5:
            java.lang.String r0 = r5.f149985c
            java.lang.String r1 = "auto"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x05f6
            boolean r1 = r27.isEmpty()
            if (r1 != 0) goto L_0x05f6
            r0 = r2
        L_0x05f6:
            java.lang.String r1 = r5.f149984b
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L_0x0549
            com.google.lens.a.dl r2 = com.google.lens.p4694a.C62114dl.f167736e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.lens.a.dk r2 = (com.google.lens.p4694a.C62113dk) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.lens.a.dl r5 = (com.google.lens.p4694a.C62114dl) r5
            r4.getClass()
            int r8 = r5.f167738a
            r10 = 1
            r8 = r8 | r10
            r5.f167738a = r8
            r5.f167739b = r4
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.lens.a.dl r4 = (com.google.lens.p4694a.C62114dl) r4
            r0.getClass()
            int r5 = r4.f167738a
            r8 = 2
            r5 = r5 | r8
            r4.f167738a = r5
            r4.f167740c = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.lens.a.dl r0 = (com.google.lens.p4694a.C62114dl) r0
            r1.getClass()
            int r4 = r0.f167738a
            r4 = r4 | 4
            r0.f167738a = r4
            r0.f167741d = r1
            com.google.protobuf.bv r0 = r2.build()
            com.google.lens.a.dl r0 = (com.google.lens.p4694a.C62114dl) r0
            com.google.at.g.a.a.ce r1 = com.google.p4017at.p4056g.p4057a.p4058a.C54024ce.f141745c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.at.g.a.a.cd r1 = (com.google.p4017at.p4056g.p4057a.p4058a.C54023cd) r1
            com.google.at.g.a.a.ck r2 = com.google.p4017at.p4056g.p4057a.p4058a.C54030ck.f141757c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.at.g.a.a.cj r2 = (com.google.p4017at.p4056g.p4057a.p4058a.C54029cj) r2
            com.google.lens.a.ax r4 = com.google.lens.p4694a.C62045ax.f167623c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.lens.a.aw r4 = (com.google.lens.p4694a.C62044aw) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.lens.a.ax r5 = (com.google.lens.p4694a.C62045ax) r5
            r0.getClass()
            r5.f167626b = r0
            r0 = 56
            r5.f167625a = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.at.g.a.a.ck r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54030ck) r0
            com.google.protobuf.bv r4 = r4.build()
            com.google.lens.a.ax r4 = (com.google.lens.p4694a.C62045ax) r4
            r4.getClass()
            r0.f141760b = r4
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.at.g.a.a.ce r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54024ce) r0
            com.google.protobuf.bv r2 = r2.build()
            com.google.at.g.a.a.ck r2 = (com.google.p4017at.p4056g.p4057a.p4058a.C54030ck) r2
            r2.getClass()
            r0.f141748b = r2
            r2 = 2
            r0.f141747a = r2
            com.google.protobuf.bv r0 = r1.build()
            com.google.at.g.a.a.ce r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54024ce) r0
            r9.mo55395g(r0)
            goto L_0x0549
        L_0x069c:
            r0 = r23
            r1 = r7
            r2 = r9
            r3 = r25
            r5 = r30
            r0.m46702e(r1, r2, r3, r4, r5)
            com.google.android.libraries.lens.e.ab r0 = r7.mo29655a()
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            return r0
        L_0x06b0:
            boolean r8 = r6.f69067i
            if (r8 == 0) goto L_0x07ee
            java.lang.String r5 = r5.f141787d
            com.google.bp.f.b.a.aw r0 = com.google.android.libraries.lens.view.p2070an.p2071a.C25361j.m46717b(r0, r1, r4)
            com.google.at.g.a.a.cs r4 = com.google.p4017at.p4056g.p4057a.p4058a.C54038cs.f141782f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.at.g.a.a.cr r4 = (com.google.p4017at.p4056g.p4057a.p4058a.C54037cr) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.at.g.a.a.cs r8 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r8
            r0.getClass()
            r8.f141784a = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.at.g.a.a.cs r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r0
            r5.getClass()
            r0.f141787d = r5
            com.google.bp.f.b.a.ag r0 = r26.mo29767j()
            com.google.protobuf.cq r1 = r0.f149765b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x06f2
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.at.g.a.a.cs r1 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r1
            r0.getClass()
            r1.f141785b = r0
        L_0x06f2:
            com.google.protobuf.bv r0 = r4.build()
            com.google.at.g.a.a.cs r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54038cs) r0
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r0)
            r4 = r7
            com.google.android.libraries.lens.e.g r4 = (com.google.android.libraries.lens.p2014e.C24215g) r4
            r4.f66218d = r1
            com.google.bp.f.b.a.aw r1 = r0.f141784a
            if (r1 != 0) goto L_0x0707
            com.google.bp.f.b.a.aw r1 = com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw.f149799b
        L_0x0707:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            java.lang.String r1 = com.google.android.libraries.lens.common.text.C24141q.m44839a(r1, r4)
            com.google.bp.f.b.a.ag r0 = r0.f141785b
            if (r0 != 0) goto L_0x0713
            com.google.bp.f.b.a.ag r0 = com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag.f149762e
        L_0x0713:
            java.lang.String r0 = r0.f149767d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x072e
            com.google.bp.f.b.a.df r0 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TEXT
            android.content.res.Resources r1 = r6.f69059a
            r2 = 2132088804(0x7f1517e4, float:1.9817902E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "productivity_failure"
            m46701d(r9, r0, r1, r2)
            r4 = 0
            goto L_0x07da
        L_0x072e:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0762
            android.content.res.Resources r0 = r6.f69059a
            r1 = 2132088894(0x7f15183e, float:1.9818084E38)
            java.lang.String r0 = r0.getString(r1)
            r6.m46704g(r9, r0)
            r0 = 2
            com.google.at.g.a.a.j[] r0 = new com.google.p4017at.p4056g.p4057a.p4058a.C54058j[r0]
            com.google.android.libraries.lens.view.an.a.c r1 = r6.f69060b
            com.google.at.g.a.a.j r1 = r1.mo30396c()
            r4 = 0
            r0[r4] = r1
            com.google.android.libraries.lens.view.an.a.c r1 = r6.f69060b
            r4 = 94524(0x1713c, float:1.32456E-40)
            com.google.at.g.a.a.j r1 = r1.mo30400g(r2, r4)
            r5 = 1
            r0[r5] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            m46700c(r9, r0)
        L_0x075f:
            r4 = 1
            goto L_0x07da
        L_0x0762:
            r4 = 0
            r5 = 1
            r6.m46705h(r9, r0)
            r1 = 6
            com.google.at.g.a.a.j[] r1 = new com.google.p4017at.p4056g.p4057a.p4058a.C54058j[r1]
            com.google.android.libraries.lens.view.an.a.c r8 = r6.f69060b
            com.google.at.g.a.a.j r8 = r8.mo30395b(r0)
            r1[r4] = r8
            com.google.android.libraries.lens.view.an.a.c r4 = r6.f69060b
            com.google.at.g.a.a.j r4 = r4.mo30399f(r0)
            r1[r5] = r4
            boolean r4 = r6.f69064f
            if (r4 != 0) goto L_0x0785
            com.google.android.libraries.lens.view.an.a.c r4 = r6.f69060b
            com.google.at.g.a.a.j r4 = r4.mo30402i(r0)
            goto L_0x0787
        L_0x0785:
            r4 = r18
        L_0x0787:
            r8 = 2
            r1[r8] = r4
            com.google.android.libraries.lens.view.an.a.c r4 = r6.f69060b
            r8 = 94525(0x1713d, float:1.32458E-40)
            com.google.at.g.a.a.j r2 = r4.mo30400g(r2, r8)
            r4 = 3
            r1[r4] = r2
            com.google.android.libraries.lens.view.an.a.c r2 = r6.f69060b
            android.content.res.Resources r4 = r2.f69049g
            r8 = 2132088889(0x7f151839, float:1.9818074E38)
            java.lang.String r4 = r4.getString(r8)
            com.google.android.libraries.lens.view.an.a.b r8 = com.google.android.libraries.lens.view.p2070an.p2071a.C25354c.f69034a
            android.content.res.Resources r10 = r2.f69049g
            r11 = 2132088890(0x7f15183a, float:1.9818076E38)
            java.lang.String r10 = r10.getString(r11)
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            com.google.at.g.a.a.j r2 = r2.mo30403j(r0, r4, r8, r10)
            r1[r16] = r2
            boolean r2 = r6.f69064f
            if (r2 == 0) goto L_0x07c0
            com.google.android.libraries.lens.view.an.a.c r2 = r6.f69060b
            com.google.at.g.a.a.j r18 = r2.mo30402i(r0)
        L_0x07c0:
            r2 = 5
            r1[r2] = r18
            java.util.List r1 = java.util.Arrays.asList(r1)
            m46700c(r9, r1)
            boolean r1 = r6.f69064f
            if (r1 == 0) goto L_0x075f
            com.google.android.libraries.lens.view.connectivity.LensConnectivityManager r1 = r6.f69061c
            boolean r1 = r1.mo30907k()
            if (r1 == 0) goto L_0x075f
            m46703f(r9, r0)
            goto L_0x075f
        L_0x07da:
            r0 = r23
            r1 = r7
            r2 = r9
            r3 = r25
            r5 = r30
            r0.m46702e(r1, r2, r3, r4, r5)
            com.google.android.libraries.lens.e.ab r0 = r7.mo29655a()
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            return r0
        L_0x07ee:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2070an.p2071a.C25357f.mo30406a(com.google.bp.f.b.a.aa, com.google.bp.f.b.a.cg, com.google.android.libraries.lens.e.y, java.lang.String, java.lang.String, android.util.Size, com.google.common.base.ax, com.google.at.g.a.a.cs):com.google.common.base.ax");
    }
}
