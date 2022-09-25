package com.google.android.apps.gsa.search.core.preferences;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.p6986aj.C89185d;
import com.google.android.apps.gsa.shared.p6986aj.C89186e;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import com.google.protobuf.C63088z;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.z */
/* compiled from: PG */
public final class C86346z implements C86338r {

    /* renamed from: a */
    public static final C59071e f233446a = C59071e.m91332i("com.google.android.apps.gsa.search.core.preferences.z");

    /* renamed from: b */
    public final File f233447b;

    /* renamed from: c */
    public final File f233448c;

    /* renamed from: d */
    public final Executor f233449d;

    /* renamed from: e */
    public final Object f233450e;

    /* renamed from: f */
    public final Object f233451f;

    /* renamed from: g */
    public final C58839bc f233452g = new C86340t(this);

    /* renamed from: h */
    public Map f233453h;

    /* renamed from: i */
    public boolean f233454i;

    /* renamed from: j */
    public final Set f233455j;

    /* renamed from: k */
    public C86344x f233456k;

    /* renamed from: l */
    public int f233457l;

    /* renamed from: m */
    private final Executor f233458m;

    /* renamed from: n */
    private final AtomicInteger f233459n = new AtomicInteger(0);

    public C86346z(Executor executor, Executor executor2, File file) {
        Object obj = new Object();
        this.f233450e = obj;
        this.f233451f = obj;
        this.f233458m = executor;
        this.f233449d = executor2;
        this.f233447b = file;
        this.f233448c = new File(String.valueOf(file.getPath()).concat(".bak"));
        this.f233455j = new HashSet();
        this.f233453h = new HashMap();
        this.f233456k = new C86344x();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return r3;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m139093j(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f233450e
            monitor-enter(r0)
            boolean r1 = r2.f233454i     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x000f
            java.util.Map r1 = r2.f233453h     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r3
        L_0x000f:
            java.util.Map r1 = r2.f233453h     // Catch:{ all -> 0x002f }
            boolean r1 = r1.containsKey(r3)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0024
            java.util.Map r1 = r2.f233453h     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r2.f233451f     // Catch:{ all -> 0x002f }
            if (r3 != r1) goto L_0x0022
            r3 = 0
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r3
        L_0x0024:
            r2.m139094k()     // Catch:{ all -> 0x002f }
            java.util.Map r1 = r2.f233453h     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r3
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.preferences.C86346z.m139093j(java.lang.String):java.lang.Object");
    }

    /* renamed from: k */
    private final void m139094k() {
        this.f233459n.incrementAndGet();
        C58838bb.m90883r(!this.f233454i);
        boolean z = false;
        while (!this.f233454i) {
            try {
                this.f233450e.wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    public final Map mo79999a(String str) {
        HashMap hashMap;
        C58838bb.m90869d(!TextUtils.isEmpty(str), "keyPrefix must be non-empty");
        synchronized (this.f233450e) {
            if (!this.f233454i) {
                m139094k();
            }
            Map map = this.f233453h;
            C58838bb.m90869d(!TextUtils.isEmpty(str), "keyPrefix must be non-empty");
            hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    hashMap.put(str2, entry.getValue());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final /* synthetic */ C86337q mo80076b() {
        return new C86341u(this);
    }

    /* renamed from: c */
    public final void mo80077c() {
        synchronized (this.f233450e) {
            int i = this.f233457l - 1;
            this.f233457l = i;
            if (i == 0) {
                this.f233450e.notifyAll();
            }
        }
    }

    public final boolean contains(String str) {
        return m139093j(str) != null;
    }

    /* renamed from: d */
    public final void mo80078d() {
        synchronized (this.f233450e) {
            this.f233457l++;
        }
    }

    /* renamed from: e */
    public final byte[] mo80079e(String str, byte[] bArr) {
        Object j = m139093j(str);
        return j != null ? ((C63088z) j).mo59174N() : bArr;
    }

    public final /* synthetic */ SharedPreferences.Editor edit() {
        return new C86341u(this);
    }

    /* renamed from: f */
    public final int[] mo80080f(String str) {
        Object j = m139093j(str);
        return j != null ? C60757n.m92752m((List) j) : new int[0];
    }

    /* renamed from: g */
    public final C89185d mo80101g(String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            Object j = m139093j(str);
            if (j != null) {
                hashMap.put(str, j);
            }
        }
        return C89186e.m145057b(hashMap);
    }

    public final Map getAll() {
        Map unmodifiableMap;
        synchronized (this.f233450e) {
            if (!this.f233454i) {
                m139094k();
            }
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f233453h));
        }
        return unmodifiableMap;
    }

    public final boolean getBoolean(String str, boolean z) {
        Object j = m139093j(str);
        return j != null ? ((Boolean) j).booleanValue() : z;
    }

    public final float getFloat(String str, float f) {
        Object j = m139093j(str);
        return j != null ? ((Float) j).floatValue() : f;
    }

    public final int getInt(String str, int i) {
        Object j = m139093j(str);
        return j != null ? ((Integer) j).intValue() : i;
    }

    public final long getLong(String str, long j) {
        Object j2 = m139093j(str);
        return j2 != null ? ((Long) j2).longValue() : j;
    }

    public final String getString(String str, String str2) {
        Object j = m139093j(str);
        return j != null ? (String) j : str2;
    }

    public final Set getStringSet(String str, Set set) {
        Object j = m139093j(str);
        return j != null ? Collections.unmodifiableSet((Set) j) : set;
    }

    /* renamed from: h */
    public final void mo80102h(Collection collection, Set set) {
        C58838bb.m90868c(!collection.isEmpty());
        C58838bb.m90868c(!set.isEmpty());
        if (C22872h.m42744d(C0826b.class)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    ((SharedPreferences.OnSharedPreferenceChangeListener) it2.next()).onSharedPreferenceChanged(this, str);
                }
            }
            return;
        }
        this.f233458m.execute(new C86339s(this, collection, set));
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f233450e) {
            this.f233455j.add(onSharedPreferenceChangeListener);
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f233450e) {
            this.f233455j.remove(onSharedPreferenceChangeListener);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: java.util.Map} */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        if (r8.f233447b.exists() == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0055, code lost:
        if (r8.f233448c.exists() == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0057, code lost:
        r8.f233447b.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        if (r8.f233447b.renameTo(r8.f233448c) != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f233446a.mo56225c()).mo56372aa(8337)).mo56389s("Failed to rename to backup file %s", r8.f233448c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        r4 = r8.f233447b.getParentFile();
        r4.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (r4.exists() != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        if (r4.mkdir() != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        r7 = 8336(0x2090, float:1.1681E-41);
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f233446a.mo56225c()).mo56372aa(8336)).mo56389s("Failed to create shared preferences directory %s", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        r4 = com.google.android.apps.gsa.shared.p6986aj.C89186e.m145057b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r7 = new java.io.FileOutputStream(r8.f233447b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r4.writeTo(r7);
        r7.flush();
        r7.getFD().sync();
        r7.close();
        r8.f233448c.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        r4 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cb, code lost:
        r4 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cd, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cf, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d0, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d1, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f233446a.mo56225c()).mo56382g(r4)).mo56372aa(8335)).mo56386p("exception while writing to file");
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ed, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ee, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ef, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f233446a.mo56225c()).mo56382g(r4)).mo56372aa(8334)).mo56386p("exception while writing to file");
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010a, code lost:
        com.google.common.p4541l.C59317ae.m92163a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0110, code lost:
        r1 = r0;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0112, code lost:
        com.google.common.p4541l.C59317ae.m92163a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0115, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0004, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0004, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80103i() {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
        L_0x0004:
            r4 = 0
        L_0x0005:
            java.lang.Object r5 = r8.f233450e
            monitor-enter(r5)
            r6 = 1
            if (r2 != 0) goto L_0x000c
            goto L_0x0027
        L_0x000c:
            java.util.Map r7 = r2.f233443b     // Catch:{ all -> 0x0116 }
            if (r7 != r3) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            com.google.common.base.C58838bb.m90868c(r3)     // Catch:{ all -> 0x0116 }
            r2.f233443b = r0     // Catch:{ all -> 0x0116 }
            r2.f233444c = r4     // Catch:{ all -> 0x0116 }
            java.util.concurrent.CountDownLatch r3 = r2.f233442a     // Catch:{ all -> 0x0116 }
            r3.countDown()     // Catch:{ all -> 0x0116 }
            com.google.android.apps.gsa.search.core.preferences.x r3 = r8.f233456k     // Catch:{ all -> 0x0116 }
            if (r2 != r3) goto L_0x0027
            r8.f233456k = r0     // Catch:{ all -> 0x0116 }
            monitor-exit(r5)     // Catch:{ all -> 0x0116 }
            return
        L_0x0027:
            int r2 = r8.f233457l     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r8.f233450e     // Catch:{ InterruptedException -> 0x0027 }
            r2.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x0027
        L_0x0031:
            com.google.android.apps.gsa.search.core.preferences.x r2 = r8.f233456k     // Catch:{ all -> 0x0116 }
            r2.getClass()
            java.util.Map r2 = r2.f233443b     // Catch:{ all -> 0x0116 }
            if (r2 != 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            com.google.common.base.C58838bb.m90868c(r2)     // Catch:{ all -> 0x0116 }
            com.google.android.apps.gsa.search.core.preferences.x r2 = r8.f233456k     // Catch:{ all -> 0x0116 }
            java.util.Map r3 = r8.f233453h     // Catch:{ all -> 0x0116 }
            r2.f233443b = r3     // Catch:{ all -> 0x0116 }
            monitor-exit(r5)     // Catch:{ all -> 0x0116 }
            java.io.File r4 = r8.f233447b
            boolean r4 = r4.exists()
            if (r4 == 0) goto L_0x007f
            java.io.File r4 = r8.f233448c
            boolean r4 = r4.exists()
            if (r4 == 0) goto L_0x005d
            java.io.File r4 = r8.f233447b
            r4.delete()
            goto L_0x00a3
        L_0x005d:
            java.io.File r4 = r8.f233447b
            java.io.File r5 = r8.f233448c
            boolean r4 = r4.renameTo(r5)
            if (r4 != 0) goto L_0x00a3
            com.google.common.f.e r4 = f233446a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 8337(0x2091, float:1.1683E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r5 = "Failed to rename to backup file %s"
            java.io.File r6 = r8.f233448c
            r4.mo56389s(r5, r6)
            goto L_0x0004
        L_0x007f:
            java.io.File r4 = r8.f233447b
            java.io.File r4 = r4.getParentFile()
            r4.getClass()
            boolean r5 = r4.exists()
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r4.mkdir()
            if (r5 != 0) goto L_0x00a3
            com.google.common.f.e r5 = f233446a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "Failed to create shared preferences directory %s"
            r7 = 8336(0x2090, float:1.1681E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56389s(r6, r4)
            goto L_0x0004
        L_0x00a3:
            com.google.android.apps.gsa.shared.aj.d r4 = com.google.android.apps.gsa.shared.p6986aj.C89186e.m145057b(r3)
            java.io.File r5 = r8.f233447b     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00cf, all -> 0x00cd }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00cf, all -> 0x00cd }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00cf, all -> 0x00cd }
            r4.writeTo(r7)     // Catch:{ FileNotFoundException -> 0x00cb, IOException -> 0x00c9 }
            r7.flush()     // Catch:{ FileNotFoundException -> 0x00cb, IOException -> 0x00c9 }
            java.io.FileDescriptor r4 = r7.getFD()     // Catch:{ FileNotFoundException -> 0x00cb, IOException -> 0x00c9 }
            r4.sync()     // Catch:{ FileNotFoundException -> 0x00cb, IOException -> 0x00c9 }
            r7.close()     // Catch:{ FileNotFoundException -> 0x00cb, IOException -> 0x00c9 }
            java.io.File r4 = r8.f233448c     // Catch:{ FileNotFoundException -> 0x00cb, IOException -> 0x00c9 }
            r4.delete()     // Catch:{ FileNotFoundException -> 0x00cb, IOException -> 0x00c9 }
            com.google.common.p4541l.C59317ae.m92163a(r7)
            r4 = 1
            goto L_0x0005
        L_0x00c9:
            r4 = move-exception
            goto L_0x00d1
        L_0x00cb:
            r4 = move-exception
            goto L_0x00ef
        L_0x00cd:
            r1 = move-exception
            goto L_0x0112
        L_0x00cf:
            r4 = move-exception
            r7 = r0
        L_0x00d1:
            com.google.common.f.e r5 = f233446a     // Catch:{ all -> 0x010f }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x010f }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x010f }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x010f }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x010f }
            r5 = 8335(0x208f, float:1.168E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x010f }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x010f }
            java.lang.String r5 = "exception while writing to file"
            r4.mo56386p(r5)     // Catch:{ all -> 0x010f }
            goto L_0x010a
        L_0x00ed:
            r4 = move-exception
            r7 = r0
        L_0x00ef:
            com.google.common.f.e r5 = f233446a     // Catch:{ all -> 0x010f }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x010f }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x010f }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x010f }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x010f }
            r5 = 8334(0x208e, float:1.1678E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x010f }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x010f }
            java.lang.String r5 = "exception while writing to file"
            r4.mo56386p(r5)     // Catch:{ all -> 0x010f }
        L_0x010a:
            com.google.common.p4541l.C59317ae.m92163a(r7)
            goto L_0x0004
        L_0x010f:
            r0 = move-exception
            r1 = r0
            r0 = r7
        L_0x0112:
            com.google.common.p4541l.C59317ae.m92163a(r0)
            throw r1
        L_0x0116:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0116 }
            goto L_0x011a
        L_0x0119:
            throw r0
        L_0x011a:
            goto L_0x0119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.preferences.C86346z.mo80103i():void");
    }
}
