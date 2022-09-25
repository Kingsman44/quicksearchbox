package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Pair;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29377ea;
import com.google.android.libraries.mdi.download.C29379ec;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29382ef;
import com.google.android.libraries.mdi.download.C29383eg;
import com.google.android.libraries.mdi.download.C29384eh;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.android.libraries.mdi.download.p2230c.C28780o;
import com.google.android.libraries.mdi.download.p2230c.C28781p;
import com.google.android.libraries.mdi.download.p2230c.C28782q;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29046m;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.android.libraries.mdi.download.p2247g.C29442f;
import com.google.android.libraries.mdi.download.p2247g.C29445i;
import com.google.android.libraries.mdi.download.p2247g.C29446j;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3311e.C42775c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.mdi.download.d.c.u */
/* compiled from: PG */
public final class C28933u {

    /* renamed from: a */
    public final Context f78589a;

    /* renamed from: b */
    public final C58881cr f78590b;

    /* renamed from: c */
    public final Executor f78591c;

    /* renamed from: d */
    public final C28787cb f78592d;

    /* renamed from: e */
    public final HashMap f78593e = new HashMap();

    /* renamed from: f */
    private final C42813k f78594f;

    /* renamed from: g */
    private final C29446j f78595g;

    /* renamed from: h */
    private final C58833ax f78596h;

    /* renamed from: i */
    private final C29046m f78597i;

    public C28933u(Context context, C58881cr crVar, C42813k kVar, C29446j jVar, C58833ax axVar, C29046m mVar, Executor executor, C28787cb cbVar) {
        this.f78589a = context;
        this.f78590b = crVar;
        this.f78594f = kVar;
        this.f78595g = jVar;
        this.f78596h = axVar;
        this.f78597i = mVar;
        this.f78591c = executor;
        this.f78592d = cbVar;
    }

    /* renamed from: c */
    public static void m53852c(Context context, long j, C29380ed edVar, C28787cb cbVar) {
        float f;
        if (cbVar.mo34413C()) {
            StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
            int blockCount = statFs.getBlockCount();
            int blockSize = statFs.getBlockSize();
            double availableBlocks = (double) ((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) - j);
            float f2 = (float) (((long) blockCount) * ((long) blockSize));
            double min = (double) Math.min(cbVar.mo34421a() * f2, (float) cbVar.mo34422b());
            if (edVar != null) {
                int a = C29379ec.m54304a(edVar.f79644b);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i == 1) {
                    f = Math.min(f2 * cbVar.mo34421a(), (float) cbVar.mo34424d());
                } else if (i == 2) {
                    f = Math.min(f2 * cbVar.mo34421a(), (float) cbVar.mo34423c());
                }
                min = (double) f;
            }
            if (availableBlocks <= min) {
                C28736bn bnVar = new C28736bn();
                bnVar.f78062a = C28737bo.LOW_DISK_ERROR;
                throw bnVar.mo34334a();
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo34509a(Uri uri, C28932t tVar, C60870cx cxVar) {
        C29670b f = C29670b.m54719g(cxVar).mo34822i(new C28928p(tVar, uri), this.f78591c).mo34820f(C28738bp.class, new C28929q(this, tVar), this.f78591c);
        this.f78593e.put(uri, f);
        f.mo4106b(new C28930r(this, uri), this.f78591c);
        return f;
    }

    /* renamed from: b */
    public final C60870cx mo34510b(C29392ep epVar, int i, long j, String str, Uri uri, String str2, int i2, C29380ed edVar, C28932t tVar, int i3, List list) {
        long j2;
        C60870cx h;
        int a;
        C29392ep epVar2 = epVar;
        Uri uri2 = uri;
        String str3 = str2;
        C29380ed edVar2 = edVar;
        int i4 = i3;
        if (this.f78593e.containsKey(uri2)) {
            return (C60870cx) this.f78593e.get(uri2);
        }
        if (!str3.startsWith("http") || !this.f78592d.mo34439s() || str3.startsWith("https")) {
            try {
                j2 = this.f78594f.mo45887a(uri2);
            } catch (IOException unused) {
                j2 = 0;
            }
            try {
                m53852c(this.f78589a, ((long) i2) - j2, edVar2, this.f78592d);
                if (this.f78592d.mo34415E()) {
                    C29446j jVar = this.f78595g;
                    C29046m mVar = this.f78597i;
                    C29383eg egVar = (C29383eg) C29384eh.f79653h.createBuilder();
                    egVar.copyOnWrite();
                    C29384eh ehVar = (C29384eh) egVar.instance;
                    epVar.getClass();
                    ehVar.f79656b = epVar2;
                    ehVar.f79655a |= 1;
                    egVar.copyOnWrite();
                    C29384eh ehVar2 = (C29384eh) egVar.instance;
                    ehVar2.f79655a |= 2;
                    ehVar2.f79657c = j;
                    egVar.copyOnWrite();
                    C29384eh ehVar3 = (C29384eh) egVar.instance;
                    str.getClass();
                    ehVar3.f79655a |= 4;
                    ehVar3.f79658d = str;
                    egVar.copyOnWrite();
                    C29384eh ehVar4 = (C29384eh) egVar.instance;
                    ehVar4.f79655a |= 8;
                    ehVar4.f79659e = i;
                    C29384eh ehVar5 = (C29384eh) egVar.build();
                    synchronized (jVar.f79833c) {
                        if (!jVar.f79834d.containsKey(ehVar5)) {
                            HashMap hashMap = jVar.f79834d;
                            C29445i iVar = new C29445i(jVar.f79832b, mVar, ehVar5);
                            Objects.requireNonNull(jVar.f79831a);
                            C42775c cVar = r12;
                            C42775c cVar2 = new C42775c(iVar, new C29442f(), 10, TimeUnit.SECONDS);
                            hashMap.put(ehVar5, cVar);
                        }
                        jVar.f79835e.put(uri2, (C42775c) jVar.f79834d.get(ehVar5));
                    }
                } else {
                    C29045l.m53943o("%s: NetworkUsageMonitor is disabled", "MddFileDownloader");
                }
                if (this.f78596h.mo56113h()) {
                    C29441e eVar = (C29441e) this.f78596h.mo56107c();
                    String str4 = epVar2.f79682b;
                    synchronized (C29441e.class) {
                        eVar.f79821b.put(uri2, str4);
                    }
                }
                C28780o g = C28781p.m53690g();
                g.mo34393f(uri2);
                g.mo34395h(str3);
                if (edVar2 == null || (a = C29377ea.m54303a(edVar2.f79645c)) == 0 || a != 2) {
                    g.mo34391d(C28779n.f78235b);
                } else {
                    g.mo34391d(C28779n.f78236c);
                }
                if (i4 > 0) {
                    g.mo34394g(i4);
                }
                C58480gp e = C58485gu.m89837e();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C29382ef efVar = (C29382ef) it.next();
                    e.mo55395g(Pair.create(efVar.f79650a, efVar.f79651b));
                }
                g.mo34392e(e.mo55394f());
                h = ((C28782q) this.f78590b.mo6453a()).mo34371b(g.mo34409i());
            } catch (C28738bp e2) {
                C29045l.m53936h("%s: Not enough space to download file %s", "MddFileDownloader", str3);
                h = C60856cj.m92899h(e2);
            }
        } else {
            C29045l.m53936h("%s: File url = %s is not secure", "MddFileDownloader", str3);
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.INSECURE_URL_ERROR;
            h = C60856cj.m92899h(bnVar.mo34334a());
        }
        return mo34509a(uri2, tVar, h);
    }

    /* renamed from: d */
    public final void mo34511d(Uri uri) {
        C60870cx cxVar = (C60870cx) this.f78593e.get(uri);
        if (cxVar != null) {
            C29045l.m53931c("%s: Cancel download file %s", "MddFileDownloader", uri);
            this.f78593e.remove(uri);
            cxVar.cancel(true);
            return;
        }
        C29045l.m53943o("%s: stopDownloading on non-existent download", "MddFileDownloader");
    }
}
