package com.google.android.libraries.mdi.download;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9406b.C124747b;
import com.google.android.libraries.mdi.C28593a;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C28597c;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.android.libraries.mdi.download.p2236d.C29201ih;
import com.google.android.libraries.mdi.download.p2236d.C29211ir;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29097k;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29102p;
import com.google.android.libraries.mdi.download.p2243e.C29344a;
import com.google.android.libraries.mdi.download.p2243e.C29358h;
import com.google.android.libraries.mdi.download.p2243e.C29359i;
import com.google.android.libraries.mdi.download.p2243e.C29361k;
import com.google.android.libraries.mdi.download.p2257l.C29669a;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.android.libraries.storage.p3304a.C42806h;
import com.google.android.libraries.storage.p3304a.C42811i;
import com.google.android.libraries.storage.p3304a.C42812j;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4433bz.p4437b.C57909n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63070h;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.mdi.download.hr */
/* compiled from: PG */
public final class C29647hr implements C29409fd {

    /* renamed from: a */
    public final Context f80295a;

    /* renamed from: b */
    public final C29037d f80296b;

    /* renamed from: c */
    public final C29211ir f80297c;

    /* renamed from: d */
    public final C42813k f80298d;

    /* renamed from: e */
    public final C29097k f80299e;

    /* renamed from: f */
    public final C29097k f80300f;

    /* renamed from: g */
    public final Executor f80301g;

    /* renamed from: h */
    public final C58833ax f80302h;

    /* renamed from: i */
    public final C58833ax f80303i;

    /* renamed from: j */
    public final C60931s f80304j;

    /* renamed from: k */
    private final List f80305k;

    /* renamed from: l */
    private final C29361k f80306l;

    /* renamed from: m */
    private final C29669a f80307m = new C29669a();

    public C29647hr(Context context, C29037d dVar, C29211ir irVar, Executor executor, List list, C42813k kVar, C58833ax axVar, C58833ax axVar2, C29361k kVar2) {
        this.f80295a = context;
        this.f80296b = dVar;
        this.f80305k = list;
        this.f80301g = executor;
        this.f80297c = irVar;
        this.f80298d = kVar;
        this.f80302h = axVar;
        this.f80303i = axVar2;
        this.f80306l = kVar2;
        this.f80304j = C29464gr.f79868a;
        this.f80300f = C29097k.m53993a(executor);
        this.f80299e = new C29097k(executor, new C29646hq(axVar2, context));
    }

    /* renamed from: o */
    public static C28595b m54607o(String str, int i, int i2, String str2, C63070h hVar) {
        C28593a aVar = (C28593a) C28595b.f77795g.createBuilder();
        aVar.copyOnWrite();
        C28595b bVar = (C28595b) aVar.instance;
        str.getClass();
        bVar.f77797a |= 1;
        bVar.f77798b = str;
        aVar.copyOnWrite();
        C28595b bVar2 = (C28595b) aVar.instance;
        bVar2.f77797a |= 4;
        bVar2.f77800d = i;
        if (i2 > 0) {
            aVar.copyOnWrite();
            C28595b bVar3 = (C28595b) aVar.instance;
            bVar3.f77797a |= 8;
            bVar3.f77801e = i2;
        }
        if (str2 != null) {
            aVar.copyOnWrite();
            C28595b bVar4 = (C28595b) aVar.instance;
            bVar4.f77797a |= 2;
            bVar4.f77799c = str2;
        }
        if (hVar != null) {
            aVar.copyOnWrite();
            C28595b bVar5 = (C28595b) aVar.instance;
            bVar5.f77802f = hVar;
            bVar5.f77797a |= 16;
        }
        return (C28595b) aVar.build();
    }

    /* renamed from: q */
    public static C60870cx m54608q(C29334dr drVar, String str, C29689e eVar, boolean z, boolean z2, C29211ir irVar, Executor executor, C42813k kVar) {
        C29334dr drVar2 = drVar;
        String str2 = str;
        Executor executor2 = executor;
        if (drVar2 == null) {
            return C60866ct.f164955a;
        }
        C28597c cVar = (C28597c) C29690f.f80408m.createBuilder();
        String str3 = drVar2.f79501c;
        cVar.copyOnWrite();
        C29690f fVar = (C29690f) cVar.instance;
        str3.getClass();
        fVar.f80410a |= 1;
        fVar.f80411b = str3;
        String str4 = drVar2.f79502d;
        cVar.copyOnWrite();
        C29690f fVar2 = (C29690f) cVar.instance;
        str4.getClass();
        fVar2.f80410a |= 2;
        fVar2.f80412c = str4;
        int i = drVar2.f79503e;
        cVar.copyOnWrite();
        C29690f fVar3 = (C29690f) cVar.instance;
        fVar3.f80410a |= 8;
        fVar3.f80414e = i;
        C63070h hVar = drVar2.f79504f;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        cVar.copyOnWrite();
        C29690f fVar4 = (C29690f) cVar.instance;
        hVar.getClass();
        fVar4.f80420k = hVar;
        fVar4.f80410a |= 128;
        long j = drVar2.f79516r;
        cVar.copyOnWrite();
        C29690f fVar5 = (C29690f) cVar.instance;
        fVar5.f80410a |= 32;
        fVar5.f80417h = j;
        String str5 = drVar2.f79517s;
        cVar.copyOnWrite();
        C29690f fVar6 = (C29690f) cVar.instance;
        str5.getClass();
        fVar6.f80410a |= 64;
        fVar6.f80418i = str5;
        cVar.copyOnWrite();
        C29690f fVar7 = (C29690f) cVar.instance;
        fVar7.f80415f = eVar.f80407e;
        fVar7.f80410a |= 16;
        C62971cq cqVar = drVar2.f79518t;
        cVar.copyOnWrite();
        C29690f fVar8 = (C29690f) cVar.instance;
        C62971cq cqVar2 = fVar8.f80419j;
        if (!cqVar2.mo58948c()) {
            fVar8.f80419j = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) fVar8.f80419j);
        if (str2 != null) {
            cVar.copyOnWrite();
            C29690f fVar9 = (C29690f) cVar.instance;
            fVar9.f80410a |= 4;
            fVar9.f80413d = str2;
        }
        if ((drVar2.f79499a & 32) != 0) {
            C63070h hVar2 = drVar2.f79505g;
            if (hVar2 == null) {
                hVar2 = C63070h.f170215c;
            }
            cVar.copyOnWrite();
            C29690f fVar10 = (C29690f) cVar.instance;
            hVar2.getClass();
            fVar10.f80421l = hVar2;
            fVar10.f80410a |= 256;
        }
        C60870cx i2 = C60856cj.m92900i(cVar);
        C60870cx cxVar = i2;
        for (C29328dl haVar : drVar2.f79512n) {
            cxVar = C60922j.m93045h(cxVar, C47810es.m84966f(new C29630ha(eVar, irVar, haVar, drVar, z2, z, kVar, executor)), executor2);
        }
        return C29670b.m54719g(cxVar).mo34821h(C29631hb.f80243a, executor2).mo34819e(C28738bp.class, C29632hc.f80244a, executor2);
    }

    /* renamed from: u */
    public static List m54609u(C42813k kVar, Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : kVar.mo45888b(uri)) {
            if (kVar.mo45895i(uri2)) {
                arrayList.addAll(m54609u(kVar, uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    C28593a aVar = (C28593a) C28595b.f77795g.createBuilder();
                    String replaceFirst = path.replaceFirst(str, BuildConfig.FLAVOR);
                    aVar.copyOnWrite();
                    C28595b bVar = (C28595b) aVar.instance;
                    replaceFirst.getClass();
                    bVar.f77797a |= 1;
                    bVar.f77798b = replaceFirst;
                    long a = kVar.mo45887a(uri2);
                    aVar.copyOnWrite();
                    C28595b bVar2 = (C28595b) aVar.instance;
                    bVar2.f77797a |= 4;
                    bVar2.f77800d = (int) a;
                    String uri3 = uri2.toString();
                    aVar.copyOnWrite();
                    C28595b bVar3 = (C28595b) aVar.instance;
                    uri3.getClass();
                    bVar3.f77797a |= 2;
                    bVar3.f77799c = uri3;
                    arrayList.add((C28595b) aVar.build());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    private final C60870cx m54610v(boolean z) {
        return C29670b.m54719g(mo34783t()).mo34822i(new C29635hf(this, z), this.f80301g).mo34822i(new C29636hg(this), this.f80301g).mo34822i(new C29637hh(this, z), this.f80301g);
    }

    /* renamed from: a */
    public final C60870cx mo34712a(C28721b bVar) {
        C29669a aVar = this.f80307m;
        return aVar.f80333a.mo51512b(new C29454gh(this, bVar), this.f80301g);
    }

    /* renamed from: b */
    public final C60870cx mo34713b() {
        C29669a aVar = this.f80307m;
        C29211ir irVar = this.f80297c;
        Objects.requireNonNull(irVar);
        return aVar.f80333a.mo51512b(new C29463gq(irVar), this.f80301g);
    }

    /* renamed from: c */
    public final C60870cx mo34714c(C28740br brVar) {
        C29425fp fpVar = new C29425fp(this, brVar);
        return C60856cj.m92905n(C47810es.m84965e(fpVar), this.f80301g);
    }

    /* renamed from: d */
    public final C60870cx mo34715d(C28740br brVar) {
        C29045l.m53930b("%s: downloadFileGroupWithForegroundService start.", "MobileDataDownload");
        if (!this.f80303i.mo56113h()) {
            return C60856cj.m92899h(new IllegalArgumentException("downloadFileGroupWithForegroundService: ForegroundDownloadService is not provided!"));
        }
        if (!this.f80302h.mo56113h()) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
            bnVar.f78063b = "downloadFileGroupWithForegroundService: Download Monitor is not provided!";
            return C60856cj.m92899h(bnVar.mo34334a());
        }
        C29432fw fwVar = new C29432fw(this, brVar);
        return C60856cj.m92905n(C47810es.m84965e(fwVar), this.f80301g);
    }

    /* renamed from: e */
    public final C60870cx mo34716e(C29660ic icVar) {
        C58833ax axVar;
        C29361k kVar = this.f80306l;
        C29358h k = C29359i.m54279k();
        C29686x xVar = (C29686x) icVar;
        C29344a aVar = (C29344a) k;
        aVar.f79535a = xVar.f80392a;
        aVar.f79536b = xVar.f80393b;
        aVar.f79537c = xVar.f80394c;
        C58833ax axVar2 = xVar.f80395d;
        if (!axVar2.mo56113h()) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(new C29102p((C124747b) axVar2.mo56107c()));
        }
        aVar.f79538d = axVar;
        k.mo34663i(xVar.f80396e);
        aVar.f79539e = xVar.f80397f;
        k.mo34660f(0);
        aVar.f79540f = xVar.f80398g;
        aVar.f79541g = xVar.f80399h;
        k.mo34662h(xVar.f80400i);
        return kVar.mo34665a(k.mo34695k());
    }

    /* renamed from: f */
    public final C60870cx mo34717f(C28805ct ctVar) {
        C29669a aVar = this.f80307m;
        return aVar.f80333a.mo51512b(new C29633hd(this, ctVar), this.f80301g);
    }

    /* renamed from: g */
    public final C60870cx mo34718g(C28807cv cvVar) {
        C29669a aVar = this.f80307m;
        return aVar.f80333a.mo51512b(new C29452gf(this, cvVar), this.f80301g);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo34719h(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -2105562759: goto L_0x002a;
                case -1202768674: goto L_0x0020;
                case -69128772: goto L_0x0016;
                case 437964371: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "MDD.WIFI.CHARGING.PERIODIC.TASK"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "MDD.CHARGING.PERIODIC.TASK"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "MDD.CELLULAR.CHARGING.PERIODIC.TASK"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "MDD.MAINTENANCE.PERIODIC.GCM.TASK"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x007a
            if (r0 == r4) goto L_0x0062
            if (r0 == r3) goto L_0x005d
            if (r0 == r2) goto L_0x0058
            java.lang.String r0 = "%s: gcm task doesn't belong to MDD"
            java.lang.String r1 = "MobileDataDownload"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53930b(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown task tag sent to MDD.handleTask() "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            return r6
        L_0x0058:
            com.google.common.util.concurrent.cx r6 = r5.m54610v(r4)
            return r6
        L_0x005d:
            com.google.common.util.concurrent.cx r6 = r5.m54610v(r1)
            return r6
        L_0x0062:
            com.google.common.util.concurrent.cx r6 = r5.mo34783t()
            com.google.android.libraries.mdi.download.gb r0 = new com.google.android.libraries.mdi.download.gb
            r0.<init>(r5)
            com.google.common.util.concurrent.s r0 = com.google.apps.tiktok.tracing.C47810es.m84966f(r0)
            java.util.concurrent.Executor r1 = r5.f80301g
            com.google.common.util.concurrent.s r0 = com.google.apps.tiktok.tracing.C47810es.m84966f(r0)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60922j.m93045h(r6, r0, r1)
            return r6
        L_0x007a:
            com.google.android.libraries.mdi.download.l.a r6 = r5.f80307m
            com.google.android.libraries.mdi.download.d.ir r0 = r5.f80297c
            p3186j$.util.Objects.requireNonNull(r0)
            com.google.android.libraries.mdi.download.ga r1 = new com.google.android.libraries.mdi.download.ga
            r1.<init>(r0)
            java.util.concurrent.Executor r0 = r5.f80301g
            com.google.apps.tiktok.tracing.contrib.b.e r6 = r6.f80333a
            com.google.common.util.concurrent.cx r6 = r6.mo51512b(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.C29647hr.mo34719h(java.lang.String):com.google.common.util.concurrent.cx");
    }

    /* renamed from: i */
    public final C60870cx mo34720i(C28809cx cxVar) {
        C29391eo eoVar = (C29391eo) C29392ep.f79679g.createBuilder();
        String f = cxVar.mo34481f();
        eoVar.copyOnWrite();
        C29392ep epVar = (C29392ep) eoVar.instance;
        f.getClass();
        epVar.f79681a |= 1;
        epVar.f79682b = f;
        String packageName = this.f80295a.getPackageName();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        packageName.getClass();
        epVar2.f79681a |= 2;
        epVar2.f79683c = packageName;
        if (cxVar.mo34477b().mo56113h()) {
            String b = C28694b.m53577b((Account) cxVar.mo34477b().mo56107c());
            eoVar.copyOnWrite();
            C29392ep epVar3 = (C29392ep) eoVar.instance;
            epVar3.f79681a |= 4;
            epVar3.f79684d = b;
        }
        C29392ep epVar4 = (C29392ep) eoVar.build();
        C58480gp f2 = C58485gu.m89838f(cxVar.mo34479d().size());
        C58485gu d = cxVar.mo34479d();
        int size = d.size();
        int i = 0;
        while (i < size) {
            C28706al alVar = (C28706al) d.get(i);
            C29325di diVar = (C29325di) C29328dl.f79470q.createBuilder();
            String str = alVar.f77979b;
            diVar.copyOnWrite();
            C29328dl dlVar = (C29328dl) diVar.instance;
            str.getClass();
            dlVar.f79472a |= 1;
            dlVar.f79473b = str;
            String str2 = alVar.f77980c;
            diVar.copyOnWrite();
            C29328dl dlVar2 = (C29328dl) diVar.instance;
            str2.getClass();
            dlVar2.f79472a |= 2;
            dlVar2.f79474c = str2;
            int i2 = alVar.f77981d;
            diVar.copyOnWrite();
            C29328dl dlVar3 = (C29328dl) diVar.instance;
            dlVar3.f79472a |= 4;
            dlVar3.f79475d = i2;
            int a = C28705ak.m53581a(alVar.f77982e);
            if (a == 0) {
                a = 1;
            }
            int a2 = C29327dk.m54216a(a - 1);
            diVar.copyOnWrite();
            C29328dl dlVar4 = (C29328dl) diVar.instance;
            int i3 = a2 - 1;
            if (a2 != 0) {
                dlVar4.f79476e = i3;
                dlVar4.f79472a |= 8;
                String str3 = alVar.f77983f;
                diVar.copyOnWrite();
                C29328dl dlVar5 = (C29328dl) diVar.instance;
                str3.getClass();
                dlVar5.f79472a |= 16;
                dlVar5.f79477f = str3;
                String str4 = alVar.f77985h;
                diVar.copyOnWrite();
                C29328dl dlVar6 = (C29328dl) diVar.instance;
                str4.getClass();
                dlVar6.f79472a |= 64;
                dlVar6.f79479h = str4;
                int i4 = alVar.f77986i;
                diVar.copyOnWrite();
                C29328dl dlVar7 = (C29328dl) diVar.instance;
                dlVar7.f79472a |= 128;
                dlVar7.f79480i = i4;
                int a3 = C28702ah.m53580a(alVar.f77989l);
                if (a3 == 0) {
                    a3 = 1;
                }
                int a4 = C29324dh.m54215a(a3 - 1);
                diVar.copyOnWrite();
                C29328dl dlVar8 = (C29328dl) diVar.instance;
                int i5 = a4 - 1;
                if (a4 != 0) {
                    dlVar8.f79483l = i5;
                    dlVar8.f79472a |= 512;
                    int a5 = C28700af.m53579a(alVar.f77990m);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    int a6 = C29322df.m54214a(a5 - 1);
                    diVar.copyOnWrite();
                    C29328dl dlVar9 = (C29328dl) diVar.instance;
                    int i6 = a6 - 1;
                    if (a6 != 0) {
                        dlVar9.f79484m = i6;
                        dlVar9.f79472a |= 1024;
                        String str5 = alVar.f77991n;
                        diVar.copyOnWrite();
                        C29328dl dlVar10 = (C29328dl) diVar.instance;
                        str5.getClass();
                        dlVar10.f79472a |= 2048;
                        dlVar10.f79485n = str5;
                        String str6 = alVar.f77992o;
                        diVar.copyOnWrite();
                        C29328dl dlVar11 = (C29328dl) diVar.instance;
                        str6.getClass();
                        dlVar11.f79472a |= 4096;
                        dlVar11.f79486o = str6;
                        if ((alVar.f77978a & 8192) != 0) {
                            C63070h hVar = alVar.f77993p;
                            if (hVar == null) {
                                hVar = C63070h.f170215c;
                            }
                            diVar.copyOnWrite();
                            C29328dl dlVar12 = (C29328dl) diVar.instance;
                            hVar.getClass();
                            dlVar12.f79487p = hVar;
                            dlVar12.f79472a |= 8192;
                        }
                        if ((alVar.f77978a & 32) != 0) {
                            C57909n nVar = alVar.f77984g;
                            if (nVar == null) {
                                nVar = C57909n.f154891b;
                            }
                            diVar.copyOnWrite();
                            C29328dl dlVar13 = (C29328dl) diVar.instance;
                            nVar.getClass();
                            dlVar13.f79478g = nVar;
                            dlVar13.f79472a |= 32;
                        }
                        if ((alVar.f77978a & 256) != 0) {
                            C57909n nVar2 = alVar.f77987j;
                            if (nVar2 == null) {
                                nVar2 = C57909n.f154891b;
                            }
                            diVar.copyOnWrite();
                            C29328dl dlVar14 = (C29328dl) diVar.instance;
                            nVar2.getClass();
                            dlVar14.f79481j = nVar2;
                            dlVar14.f79472a |= 256;
                        }
                        for (C28712ar arVar : alVar.f77988k) {
                            C29335ds dsVar = (C29335ds) C29338dv.f79522g.createBuilder();
                            String str7 = arVar.f78011b;
                            dsVar.copyOnWrite();
                            C29338dv dvVar = (C29338dv) dsVar.instance;
                            str7.getClass();
                            dvVar.f79524a |= 1;
                            dvVar.f79525b = str7;
                            int i7 = arVar.f78012c;
                            dsVar.copyOnWrite();
                            C29338dv dvVar2 = (C29338dv) dsVar.instance;
                            dvVar2.f79524a |= 2;
                            dvVar2.f79526c = i7;
                            String str8 = arVar.f78013d;
                            dsVar.copyOnWrite();
                            C29338dv dvVar3 = (C29338dv) dsVar.instance;
                            str8.getClass();
                            dvVar3.f79524a |= 4;
                            dvVar3.f79527d = str8;
                            int a7 = C28711aq.m53586a(arVar.f78014e);
                            if (a7 == 0) {
                                a7 = 1;
                            }
                            int a8 = C29337du.m54219a(a7 - 1);
                            dsVar.copyOnWrite();
                            C29338dv dvVar4 = (C29338dv) dsVar.instance;
                            int i8 = a8 - 1;
                            if (a8 != 0) {
                                dvVar4.f79528e = i8;
                                dvVar4.f79524a |= 8;
                                C29317dc dcVar = (C29317dc) C29318dd.f79461c.createBuilder();
                                C28698ad adVar = arVar.f78015f;
                                if (adVar == null) {
                                    adVar = C28698ad.f77969b;
                                }
                                String str9 = adVar.f77971a;
                                dcVar.copyOnWrite();
                                C29318dd ddVar = (C29318dd) dcVar.instance;
                                str9.getClass();
                                ddVar.f79463a |= 1;
                                ddVar.f79464b = str9;
                                C29318dd ddVar2 = (C29318dd) dcVar.build();
                                dsVar.copyOnWrite();
                                C29338dv dvVar5 = (C29338dv) dsVar.instance;
                                ddVar2.getClass();
                                dvVar5.f79529f = ddVar2;
                                dvVar5.f79524a |= 16;
                                C29338dv dvVar6 = (C29338dv) dsVar.build();
                                diVar.copyOnWrite();
                                C29328dl dlVar15 = (C29328dl) diVar.instance;
                                dvVar6.getClass();
                                C62971cq cqVar = dlVar15.f79482k;
                                if (!cqVar.mo58948c()) {
                                    dlVar15.f79482k = C62942bv.mutableCopy(cqVar);
                                }
                                dlVar15.f79482k.add(dvVar6);
                            } else {
                                throw null;
                            }
                        }
                        f2.mo55395g((C29328dl) diVar.build());
                        i++;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return this.f80307m.f80333a.mo51512b(new C29426fq(this, epVar4, cxVar, f2), this.f80301g);
    }

    /* renamed from: j */
    public final C60870cx mo34721j(C29650hu huVar) {
        C29669a aVar = this.f80307m;
        return aVar.f80333a.mo51512b(new C29431fv(this, huVar), this.f80301g);
    }

    /* renamed from: k */
    public final C60870cx mo34722k(C29652hw hwVar) {
        C29669a aVar = this.f80307m;
        return aVar.f80333a.mo51512b(new C29434fy(this, hwVar), this.f80301g);
    }

    /* renamed from: l */
    public final C60870cx mo34723l(C29653hx hxVar) {
        C29669a aVar = this.f80307m;
        return aVar.f80333a.mo51512b(new C29634he(this, hxVar), this.f80301g);
    }

    /* renamed from: m */
    public final String mo34724m() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        try {
            C29211ir irVar = this.f80297c;
            C60870cx h = irVar.mo34632h();
            C29201ih ihVar = new C29201ih(irVar, printWriter);
            C60922j.m93045h(h, C47810es.m84966f(ihVar), irVar.f79204n).get(3, TimeUnit.SECONDS);
            printWriter.println("==== MOBSTORE_DEBUG_INFO ====");
            C42813k kVar = this.f80298d;
            Iterable h2 = C58557jl.m90127h(kVar.f112076a.keySet(), new C42806h(kVar));
            TreeSet treeSet = new TreeSet();
            C58557jl.m90136q(treeSet, h2);
            String join = TextUtils.join(",\n", treeSet);
            Iterable h3 = C58557jl.m90127h(kVar.f112077b.values(), C42811i.f112074a);
            TreeSet treeSet2 = new TreeSet();
            C58557jl.m90136q(treeSet2, h3);
            String join2 = TextUtils.join(",\n", treeSet2);
            Iterable h4 = C58557jl.m90127h(kVar.f112078c, C42812j.f112075a);
            TreeSet treeSet3 = new TreeSet();
            C58557jl.m90136q(treeSet3, h4);
            printWriter.print(String.format("Registered Mobstore Plugins:\n\nBackends:\n%1$s\n\nTransforms:\n%2$s\n\nMonitors:\n%3$s", new Object[]{join, join2, TextUtils.join(",\n", treeSet3)}));
            printWriter.flush();
            return byteArrayOutputStream.toString();
        } catch (ExecutionException | TimeoutException e) {
            String format = String.format("%s: Couldn't get debug info: %s", new Object[]{"MobileDataDownload", e});
            C29045l.m53934f(format);
            return format;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            String format2 = String.format("%s: Couldn't get debug info: %s", new Object[]{"MobileDataDownload", e2});
            C29045l.m53934f(format2);
            return format2;
        }
    }

    /* renamed from: n */
    public final void mo34725n(String str) {
        C29045l.m53931c("%s: CancelForegroundDownload for key = %s", "MobileDataDownload", str);
        C60870cx d = this.f80299e.mo34567d(str);
        C29451ge geVar = new C29451ge(str);
        C60922j.m93045h(d, C47810es.m84966f(geVar), this.f80301g);
        this.f80306l.mo34666b(str);
    }

    /* renamed from: p */
    public final C29392ep mo34780p(String str, C58833ax axVar, C58833ax axVar2) {
        C29391eo eoVar = (C29391eo) C29392ep.f79679g.createBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar = (C29392ep) eoVar.instance;
        str.getClass();
        epVar.f79681a |= 1;
        epVar.f79682b = str;
        String packageName = this.f80295a.getPackageName();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        packageName.getClass();
        epVar2.f79681a |= 2;
        epVar2.f79683c = packageName;
        if (axVar.mo56113h()) {
            String b = C28694b.m53577b((Account) axVar.mo56107c());
            eoVar.copyOnWrite();
            C29392ep epVar3 = (C29392ep) eoVar.instance;
            epVar3.f79681a |= 4;
            epVar3.f79684d = b;
        }
        if (axVar2.mo56113h()) {
            String str2 = (String) axVar2.mo56107c();
            eoVar.copyOnWrite();
            C29392ep epVar4 = (C29392ep) eoVar.instance;
            str2.getClass();
            epVar4.f79681a |= 16;
            epVar4.f79686f = str2;
        }
        return (C29392ep) eoVar.build();
    }

    /* renamed from: r */
    public final C60870cx mo34781r(C29392ep epVar, C29334dr drVar, boolean z, boolean z2, boolean z3) {
        return C60922j.m93044g(m54608q(drVar, (epVar.f79681a & 4) != 0 ? epVar.f79684d : null, z ? C29689e.DOWNLOADED : C29689e.PENDING, z2, z3, this.f80297c, this.f80301g, this.f80298d), C47810es.m84963c(new C29429ft(this)), this.f80301g);
    }

    /* renamed from: s */
    public final C60870cx mo34782s(C28740br brVar) {
        C29422b c = C29422b.m54374c(brVar.mo34350i(), brVar.mo34344c(), brVar.mo34349h());
        String i = brVar.mo34350i();
        C29391eo eoVar = (C29391eo) C29392ep.f79679g.createBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar = (C29392ep) eoVar.instance;
        i.getClass();
        epVar.f79681a |= 1;
        epVar.f79682b = i;
        String packageName = this.f80295a.getPackageName();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        packageName.getClass();
        epVar2.f79681a |= 2;
        epVar2.f79683c = packageName;
        if (brVar.mo34344c().mo56113h()) {
            String b = C28694b.m53577b((Account) brVar.mo34344c().mo56107c());
            eoVar.copyOnWrite();
            C29392ep epVar3 = (C29392ep) eoVar.instance;
            epVar3.f79681a |= 4;
            epVar3.f79684d = b;
        }
        if (brVar.mo34349h().mo56113h()) {
            String str = (String) brVar.mo34349h().mo56107c();
            eoVar.copyOnWrite();
            C29392ep epVar4 = (C29392ep) eoVar.instance;
            str.getClass();
            epVar4.f79681a |= 16;
            epVar4.f79686f = str;
        }
        boolean h = brVar.mo34348g().mo56113h();
        return this.f80307m.f80333a.mo51512b(new C29449gc(this, c, (C29392ep) eoVar.build(), h, brVar, i), this.f80301g);
    }

    /* renamed from: t */
    public final C60870cx mo34783t() {
        ArrayList arrayList = new ArrayList();
        for (C28746bx b : this.f80305k) {
            arrayList.add(b.mo19336b(this));
        }
        return C29672d.m54726a(arrayList).mo34823a(C29457gk.f79857a, this.f80301g);
    }
}
