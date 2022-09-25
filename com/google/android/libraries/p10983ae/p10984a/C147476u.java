package com.google.android.libraries.p10983ae.p10984a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.TrafficStats;
import android.util.Log;
import androidx.core.content.C1882h;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.p2230c.p2234c.C28759a;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58838bb;
import com.google.common.base.C58852bp;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import org.chromium.net.p5647a.C72424h;

/* renamed from: com.google.android.libraries.ae.a.u */
/* compiled from: PG */
public final class C147476u {

    /* renamed from: a */
    public static final String f398081a = "u";

    /* renamed from: d */
    private static final C58852bp f398082d = new C147466k();

    /* renamed from: e */
    private static final C58852bp f398083e = new C147467l();

    /* renamed from: f */
    private static final C58852bp f398084f = new C147468m();

    /* renamed from: b */
    public final C147471p f398085b;

    /* renamed from: c */
    protected final List f398086c = new ArrayList();

    /* renamed from: g */
    private final Context f398087g;

    /* renamed from: h */
    private final Executor f398088h;

    /* renamed from: i */
    private final ConnectivityManager f398089i;

    /* renamed from: j */
    private final Map f398090j = new HashMap();

    /* renamed from: k */
    private final Map f398091k = new HashMap();

    /* renamed from: l */
    private final Queue f398092l = new ConcurrentLinkedQueue();

    /* renamed from: m */
    private boolean f398093m = false;

    /* renamed from: n */
    private final BroadcastReceiver f398094n = new C147469n(this);

    /* renamed from: o */
    private final C147457b f398095o;

    public C147476u(C147457b bVar, Context context, Executor executor) {
        C147471p pVar = new C147471p();
        this.f398087g = context;
        this.f398095o = bVar;
        this.f398088h = executor;
        this.f398085b = pVar;
        this.f398089i = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public static String m240420a(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        return absolutePath + "/" + str;
    }

    /* renamed from: i */
    public static void m240421i(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    /* renamed from: n */
    private static boolean m240422n(Context context, String str) {
        return C1882h.m5137c(context, str) == 0;
    }

    /* renamed from: o */
    private static final void m240423o(List list, C58852bp bpVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bpVar.mo40846a((C147473r) it.next());
        }
    }

    /* renamed from: b */
    public final synchronized HttpURLConnection mo124214b(String str, String str2) {
        HttpURLConnection a;
        if (m240422n(this.f398087g, "android.permission.INTERNET")) {
            C58838bb.m90883r(!((C147465j) this.f398090j.get(str)).mo124205e());
            a = this.f398095o.mo124200a(str2);
            String str3 = this.f398085b.f398079b;
            this.f398091k.put(str, a);
        } else {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final synchronized List mo124215c() {
        C58480gp e;
        e = C58485gu.m89837e();
        Iterator it = this.f398086c.iterator();
        while (it.hasNext()) {
            C147473r rVar = (C147473r) ((WeakReference) it.next()).get();
            if (rVar == null) {
                it.remove();
            } else {
                e.mo55395g(rVar);
            }
        }
        return e.mo55394f();
    }

    /* renamed from: d */
    public final synchronized void mo124216d(File file, String str) {
        String a = m240420a(file, str);
        C147465j jVar = (C147465j) this.f398090j.get(a);
        if (jVar != null) {
            jVar.mo124204d();
        } else {
            Log.v(f398081a, "Attempted to setCanceled unknown request: ".concat(a));
        }
        m240421i((HttpURLConnection) this.f398091k.get(a));
        if (jVar != null) {
            mo124218f();
        }
    }

    /* renamed from: e */
    public final void mo124217e(C147465j jVar) {
        List c;
        jVar.mo124203c();
        synchronized (this) {
            boolean isEmpty = this.f398092l.isEmpty();
            this.f398092l.add(jVar);
            if (isEmpty) {
                this.f398087g.registerReceiver(this.f398094n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f398093m = true;
                mo124218f();
            }
            c = this.f398092l.containsAll(this.f398090j.values()) ? mo124215c() : null;
        }
        if (c != null) {
            m240423o(c, f398082d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo124218f() {
        /*
            r4 = this;
            java.lang.String r0 = "Running "
            monitor-enter(r4)
            java.lang.String r1 = f398081a     // Catch:{ all -> 0x0065 }
            java.util.Queue r2 = r4.f398092l     // Catch:{ all -> 0x0065 }
            int r2 = r2.size()     // Catch:{ all -> 0x0065 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r3.<init>(r0)     // Catch:{ all -> 0x0065 }
            r3.append(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = " requests pending connectivity"
            r3.append(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0065 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0065 }
            java.util.Queue r0 = r4.f398092l     // Catch:{ all -> 0x0065 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0065 }
        L_0x0025:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0065 }
            com.google.android.libraries.ae.a.j r1 = (com.google.android.libraries.p10983ae.p10984a.C147465j) r1     // Catch:{ all -> 0x0065 }
            boolean r2 = r1.mo124205e()     // Catch:{ all -> 0x0065 }
            if (r2 != 0) goto L_0x0041
            com.google.android.libraries.ae.a.i r2 = r1.mo124201a()     // Catch:{ all -> 0x0065 }
            boolean r2 = r4.mo124221j(r2)     // Catch:{ all -> 0x0065 }
            if (r2 == 0) goto L_0x0025
        L_0x0041:
            r0.remove()     // Catch:{ all -> 0x0065 }
            r1.mo124202b()     // Catch:{ all -> 0x0065 }
            r4.mo124220h(r1)     // Catch:{ all -> 0x0065 }
            goto L_0x0025
        L_0x004b:
            java.util.Queue r0 = r4.f398092l     // Catch:{ all -> 0x0065 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = r4.f398093m     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0063
            android.content.Context r0 = r4.f398087g     // Catch:{ all -> 0x0065 }
            android.content.BroadcastReceiver r1 = r4.f398094n     // Catch:{ all -> 0x0065 }
            r0.unregisterReceiver(r1)     // Catch:{ all -> 0x0065 }
            r0 = 0
            r4.f398093m = r0     // Catch:{ all -> 0x0065 }
            monitor-exit(r4)
            return
        L_0x0063:
            monitor-exit(r4)
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r4)
            goto L_0x0069
        L_0x0068:
            throw r0
        L_0x0069:
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10983ae.p10984a.C147476u.mo124218f():void");
    }

    /* renamed from: g */
    public final synchronized void mo124219g(C147473r rVar) {
        this.f398086c.add(new WeakReference(rVar));
    }

    /* renamed from: h */
    public final void mo124220h(C147465j jVar) {
        m240423o(mo124215c(), f398083e);
        this.f398088h.execute(new C147470o(this, jVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ac, code lost:
        return true;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo124221j(com.google.android.libraries.p10983ae.p10984a.C147464i r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.libraries.ae.a.i r0 = com.google.android.libraries.p10983ae.p10984a.C147464i.NONE     // Catch:{ all -> 0x00b5 }
            r1 = 1
            if (r7 != r0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            android.content.Context r0 = r6.f398087g     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = m240422n(r0, r2)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00ad
            android.net.ConnectivityManager r0 = r6.f398089i     // Catch:{ all -> 0x00b5 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x00b5 }
            r2 = 0
            if (r0 != 0) goto L_0x0024
            java.lang.String r7 = f398081a     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "No current network, connectivity cannot be satisfied."
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r6)
            return r2
        L_0x0024:
            boolean r3 = r0.isConnected()     // Catch:{ all -> 0x00b5 }
            if (r3 != 0) goto L_0x0033
            java.lang.String r7 = f398081a     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "Network disconnected, connectivity cannot be satisfied."
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r6)
            return r2
        L_0x0033:
            int r3 = r7.ordinal()     // Catch:{ all -> 0x00b5 }
            r4 = 17
            r5 = 9
            if (r3 == 0) goto L_0x008e
            if (r3 == r1) goto L_0x0054
            java.lang.String r0 = f398081a     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "Unknown connectivity type checked: "
            java.lang.String r7 = r7.name()     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = r2.concat(r7)     // Catch:{ all -> 0x00b5 }
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r6)
            return r1
        L_0x0054:
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            if (r7 == 0) goto L_0x008c
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            r3 = 4
            if (r7 == r3) goto L_0x008c
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            r3 = 6
            if (r7 == r3) goto L_0x008c
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            r3 = 7
            if (r7 == r3) goto L_0x008c
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            if (r7 == r1) goto L_0x008c
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            if (r7 == r5) goto L_0x008c
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            r3 = 16
            if (r7 == r3) goto L_0x008c
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            if (r7 != r4) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            monitor-exit(r6)
            return r2
        L_0x008c:
            monitor-exit(r6)
            return r1
        L_0x008e:
            android.net.ConnectivityManager r7 = r6.f398089i     // Catch:{ all -> 0x00b5 }
            boolean r7 = androidx.core.p093e.C1887a.m5146a(r7)     // Catch:{ all -> 0x00b5 }
            if (r7 == 0) goto L_0x00ab
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            if (r7 == r1) goto L_0x00ab
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            if (r7 == r5) goto L_0x00ab
            int r7 = r0.getType()     // Catch:{ all -> 0x00b5 }
            if (r7 != r4) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            monitor-exit(r6)
            return r2
        L_0x00ab:
            monitor-exit(r6)
            return r1
        L_0x00ad:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission."
            r7.<init>(r0)     // Catch:{ all -> 0x00b5 }
            throw r7     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10983ae.p10984a.C147476u.mo124221j(com.google.android.libraries.ae.a.i):boolean");
    }

    /* renamed from: k */
    public final synchronized boolean mo124222k(C147465j jVar) {
        String a = m240420a(jVar.f398061b, jVar.f398062c);
        if (this.f398090j.containsKey(a)) {
            Log.i(f398081a, "Request is already being executed for key: ".concat(a));
            return false;
        }
        this.f398090j.put(a, jVar);
        mo124220h(jVar);
        return true;
    }

    /* renamed from: l */
    public final void mo124223l(File file, String str, C28759a aVar, C147462g gVar, File file2) {
        List list;
        List list2;
        C28737bo boVar;
        String a = m240420a(file, str);
        synchronized (this) {
            this.f398090j.remove(a);
            this.f398091k.remove(a);
            if (this.f398090j.isEmpty()) {
                list = mo124215c();
                list2 = null;
            } else if (this.f398092l.containsAll(this.f398090j.values())) {
                list2 = mo124215c();
                list = null;
            } else {
                list = null;
                list2 = null;
            }
        }
        if (gVar == null) {
            C29045l.m53931c("%s: Downloaded file %s", "DownloadCompleteHandler", file2.getName());
            aVar.f78178a.mo5437b((Object) null);
        } else {
            Throwable th = gVar.f398055e;
            C29045l.m53933e(th, "%s: Failed to download file %s due to %s", "DownloadCompleteHandler", file2.getName(), gVar.f398051a);
            C28736bn bnVar = new C28736bn();
            C147461f fVar = gVar.f398051a;
            C147461f fVar2 = C147461f.UNKNOWN;
            switch (fVar.ordinal()) {
                case 0:
                    boVar = C28737bo.ANDROID_DOWNLOADER_UNKNOWN;
                    break;
                case 1:
                    boVar = C28737bo.ANDROID_DOWNLOADER_CANCELED;
                    break;
                case 2:
                    boVar = C28737bo.ANDROID_DOWNLOADER_INVALID_REQUEST;
                    break;
                case 3:
                    boVar = C28737bo.ANDROID_DOWNLOADER_HTTP_ERROR;
                    break;
                case 4:
                    boVar = C28737bo.ANDROID_DOWNLOADER_REQUEST_ERROR;
                    break;
                case 5:
                    boVar = C28737bo.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                    break;
                case 6:
                    boVar = C28737bo.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                    break;
                case 7:
                    boVar = C28737bo.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                    break;
                case 8:
                    boVar = C28737bo.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                    break;
                case 9:
                    boVar = C28737bo.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                    break;
                case 10:
                    boVar = C28737bo.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                    break;
                case 11:
                    boVar = C28737bo.ANDROID_DOWNLOADER_OAUTH_ERROR;
                    break;
                default:
                    boVar = C28737bo.UNKNOWN_ERROR;
                    break;
            }
            bnVar.f78062a = boVar;
            String str2 = "ANDROID_DOWNLOADER_" + gVar.f398051a.name() + "; ";
            int i = gVar.f398052b;
            if (i >= 0) {
                str2 = str2 + "HttpCode: " + i + "; ";
            }
            String str3 = gVar.f398053c;
            if (str3 != null) {
                str2 = str2 + "Message: " + str3 + "; ";
            }
            bnVar.f78063b = str2;
            if (th != null) {
                bnVar.f78064c = th;
            }
            aVar.f78178a.mo5439d(bnVar.mo34334a());
        }
        if (list != null) {
            m240423o(list, f398084f);
        } else if (list2 != null) {
            m240423o(list2, f398082d);
        }
    }

    /* renamed from: m */
    public final synchronized void mo124224m(HttpURLConnection httpURLConnection, int i) {
        if (i == -1) {
            return;
        }
        if (httpURLConnection instanceof C72424h) {
            ((C72424h) httpURLConnection).mo64131b(i);
        } else {
            TrafficStats.setThreadStatsTag(i);
        }
    }
}
