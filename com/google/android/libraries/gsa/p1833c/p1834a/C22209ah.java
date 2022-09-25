package com.google.android.libraries.gsa.p1833c.p1834a;

import android.content.Context;
import android.net.http.HttpResponseCache;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89016an;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.p7066m.C89980as;
import com.google.android.apps.gsa.shared.p7066m.C90008bn;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.gsa.p1876k.p1879c.C22865a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59314ab;
import com.google.common.p4541l.C59315ac;
import com.google.common.p4541l.C59328k;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59341x;
import com.google.common.p4541l.C59343z;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: com.google.android.libraries.gsa.c.a.ah */
/* compiled from: PG */
public final class C22209ah implements C22266r {

    /* renamed from: b */
    public static final C59071e f61294b = C59071e.m91332i("com.google.android.libraries.gsa.c.a.ah");

    /* renamed from: c */
    public final Context f61295c;

    /* renamed from: d */
    public final C22871g f61296d;

    /* renamed from: e */
    public final boolean f61297e;

    /* renamed from: f */
    public volatile boolean f61298f;

    /* renamed from: g */
    private final C22217ap f61299g;

    /* renamed from: h */
    private final C89016an f61300h;

    /* renamed from: i */
    private final C89052h f61301i;

    /* renamed from: j */
    private final C90021c f61302j;

    /* renamed from: k */
    private final C89037bh f61303k;

    /* renamed from: l */
    private final C58881cr f61304l;

    /* renamed from: m */
    private boolean f61305m;

    public C22209ah(Context context, C22871g gVar, C22871g gVar2, C22217ap apVar, C89016an anVar, C89037bh bhVar, C89052h hVar, C90021c cVar, boolean z, C58833ax axVar, C58833ax axVar2, C22216ao aoVar) {
        C90021c cVar2 = cVar;
        Context context2 = context;
        this.f61295c = context2;
        this.f61296d = gVar2;
        this.f61299g = apVar;
        this.f61300h = anVar;
        this.f61303k = bhVar;
        this.f61301i = hVar;
        this.f61302j = cVar2;
        this.f61297e = !cVar2.mo79746e(C90008bn.f246889c);
        this.f61304l = C58886cw.m90973a(new C22268t(this, gVar, context2, cVar2, z, axVar, axVar2, aoVar));
    }

    /* renamed from: k */
    static File m41537k(Context context, String str) {
        File file = new File(context.getCacheDir(), str);
        if (!file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: m */
    public static void m41538m(Context context, String str, C90021c cVar, CronetEngine.Builder builder, C58833ax axVar) {
        File k = m41537k(context, str);
        if (!k.isDirectory()) {
            if (axVar.mo56113h()) {
                ((C89911f) ((C68214a) axVar.mo56107c()).mo27525b()).mo83756b(new C90457d(C89885b.CRONET_DISK_CACHE_DIRECTORY_CREATION_FAILED_VALUE)).mo83721a();
            }
            C59104x d = f61294b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CronetEngineProvidrImpl");
            ((C59052c) ((C59052c) d).mo56372aa(48469)).mo56386p("Disk cache directory creation failed. Falling back to in-memory cache.");
            builder.enableHttpCache(1, 1048576);
            return;
        }
        builder.setStoragePath(k.getAbsolutePath());
        builder.enableHttpCache(3, cVar.mo79743a(C90008bn.f246894h));
    }

    /* renamed from: n */
    public static void m41539n(Context context, ExperimentalCronetEngine experimentalCronetEngine) {
        File k = m41537k(context, "cronet-netlog");
        C58976aa aaVar = C58975e.f156826a;
        experimentalCronetEngine.startNetLogToDisk(k.getPath(), false, 5242880);
    }

    /* renamed from: a */
    public final C60870cx mo27457a() {
        return C60856cj.m92901j((C60870cx) this.f61304l.mo6453a());
    }

    /* renamed from: b */
    public final ExperimentalCronetEngine mo27458b() {
        C22872h.m42742b(C22865a.class);
        try {
            return (ExperimentalCronetEngine) C90877ak.m148472f((Future) this.f61304l.mo6453a());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final void mo27459c(File file) {
        C58976aa aaVar = C58975e.f156826a;
        C60856cj.m92911t(mo27457a(), new C22202aa(this, file), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final void mo27460e() {
        C58976aa aaVar = C58975e.f156826a;
        C60856cj.m92911t(mo27457a(), new C22274z(this), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final void mo27461f() {
        mo27457a();
    }

    /* renamed from: g */
    public final synchronized void mo27462g() {
        if (!this.f61305m) {
            if (HttpResponseCache.getInstalled() == null) {
                try {
                    HttpResponseCache.install(new File(this.f61295c.getCacheDir(), "platform-http"), this.f61302j.mo79743a(C90008bn.f246894h));
                    C59104x b = f61294b.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "CronetEngineProvidrImpl");
                    ((C59052c) ((C59052c) b).mo56372aa(48467)).mo56386p("Installed HTTP response cache.");
                } catch (IOException e) {
                    C59104x d = f61294b.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "CronetEngineProvidrImpl");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(48468)).mo56386p("HTTP response cache installation failed.");
                    int i = C90755l.f253831a;
                }
            }
            this.f61305m = true;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        String str2;
        C91005e c = fVar.mo85279c("Cronet version");
        ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) C90877ak.m148475i(mo27457a(), (Object) null);
        if (experimentalCronetEngine == null) {
            str = "Cronet (uninitialized)";
        } else {
            str = experimentalCronetEngine.getVersionString();
        }
        c.mo85276a(C90752i.m148229c(str));
        fVar.mo85286m(this.f61300h);
        fVar.mo85286m(this.f61301i);
        fVar.mo85286m(this.f61303k);
        boolean e = this.f61302j.mo79746e(C89980as.f246630a);
        if (!fVar.mo85298x() || !fVar.mo85296v() || fVar.mo85297w() || !this.f61302j.mo79746e(C90008bn.f246893g)) {
            if (e) {
                e = true;
            } else {
                return;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        ExperimentalCronetEngine experimentalCronetEngine2 = (ExperimentalCronetEngine) C90877ak.m148475i(mo27457a(), (Object) null);
        if (experimentalCronetEngine2 == null) {
            str2 = "Cronet uninitialized.";
        } else {
            try {
                File createTempFile = File.createTempFile("cronet-netlog", "json");
                mo27466l(experimentalCronetEngine2, createTempFile);
                Charset defaultCharset = Charset.defaultCharset();
                C59315ac acVar = new C59315ac(createTempFile);
                defaultCharset.getClass();
                String a = C59328k.m92208a(defaultCharset, acVar);
                if (!createTempFile.delete()) {
                    C59104x c2 = f61294b.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "CronetEngineProvidrImpl");
                    ((C59052c) ((C59052c) c2).mo56372aa(48454)).mo56386p("Can't delete netlog file.");
                }
                str2 = a;
            } catch (IOException e2) {
                C59104x c3 = f61294b.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "CronetEngineProvidrImpl");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(48455)).mo56386p("Unable to get NetLog");
                str2 = "Failed to grab netlog.";
            }
        }
        fVar.mo85283j("cronet-netlog.json", str2, !e);
    }

    /* renamed from: h */
    public final boolean mo27463h() {
        return this.f61298f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized byte[] mo27464i(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.common.util.concurrent.cx r0 = r4.mo27457a()     // Catch:{ all -> 0x0032 }
            r1 = 0
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r0, r1)     // Catch:{ all -> 0x0032 }
            org.chromium.net.ExperimentalCronetEngine r0 = (org.chromium.net.ExperimentalCronetEngine) r0     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            boolean r2 = r4.f61298f     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            com.google.android.libraries.gsa.c.a.ap r2 = r4.f61299g     // Catch:{ all -> 0x0032 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f61343a     // Catch:{ all -> 0x0032 }
            int r3 = r3.get()     // Catch:{ all -> 0x0032 }
            if (r3 < r5) goto L_0x002e
            java.util.concurrent.atomic.AtomicInteger r5 = r2.f61343a     // Catch:{ all -> 0x0032 }
            r2 = 0
            r5.set(r2)     // Catch:{ all -> 0x0032 }
            byte[] r5 = r0.getGlobalMetricsDeltas()     // Catch:{ all -> 0x0032 }
            if (r5 == 0) goto L_0x002e
            int r0 = r5.length     // Catch:{ all -> 0x0032 }
            if (r0 <= 0) goto L_0x002e
            monitor-exit(r4)
            return r5
        L_0x002e:
            monitor-exit(r4)
            return r1
        L_0x0030:
            monitor-exit(r4)
            return r1
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1833c.p1834a.C22209ah.mo27464i(int):byte[]");
    }

    /* renamed from: j */
    public final long mo27465j(C58817ah ahVar) {
        ExperimentalCronetEngine experimentalCronetEngine;
        int intValue;
        if (!this.f61297e || (experimentalCronetEngine = (ExperimentalCronetEngine) C90877ak.m148475i(mo27457a(), (Object) null)) == null || (intValue = ((Integer) ahVar.apply(experimentalCronetEngine)).intValue()) == -1) {
            return -1;
        }
        return (long) intValue;
    }

    /* renamed from: l */
    public final void mo27466l(ExperimentalCronetEngine experimentalCronetEngine, File file) {
        experimentalCronetEngine.stopNetLog();
        File file2 = new File(this.f61295c.getCacheDir(), "cronet-netlog/netlog.json");
        if (!file2.renameTo(file)) {
            file.getClass();
            try {
                C58838bb.m90879n(!file2.equals(file), "Source %s and destination %s must be different", file2, file);
                if (!file2.renameTo(file)) {
                    C58838bb.m90879n(!file2.equals(file), "Source %s and destination %s must be different", file2, file);
                    C59315ac acVar = new C59315ac(file2);
                    C59314ab abVar = new C59314ab(file, new C59343z[0]);
                    C59341x a = C59341x.m92227a();
                    try {
                        FileInputStream b = acVar.mo56804b();
                        a.mo56859c(b);
                        FileOutputStream a2 = abVar.mo56801a();
                        a.mo56859c(a2);
                        C59332o.m92211b(b, a2);
                        a.close();
                        if (!file2.delete()) {
                            if (!file.delete()) {
                                new StringBuilder("Unable to delete ").append(file);
                                throw new IOException("Unable to delete ".concat(file.toString()));
                            } else {
                                new StringBuilder("Unable to delete ").append(file2);
                                throw new IOException("Unable to delete ".concat(file2.toString()));
                            }
                        }
                    } catch (Throwable th) {
                        a.close();
                        throw th;
                    }
                }
            } catch (IOException e) {
                C59104x c = f61294b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CronetEngineProvidrImpl");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48466)).mo56354G("Move of %s to %s failed.", file2, file);
            }
        }
        if (this.f61302j.mo79746e(C90008bn.f246893g)) {
            m41539n(this.f61295c, experimentalCronetEngine);
        }
    }
}
