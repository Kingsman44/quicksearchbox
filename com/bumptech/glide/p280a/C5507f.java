package com.bumptech.glide.p280a;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.a.f */
/* compiled from: PG */
public final class C5507f implements Closeable {

    /* renamed from: a */
    public final File f16663a;

    /* renamed from: b */
    public final File f16664b;

    /* renamed from: c */
    public final File f16665c;

    /* renamed from: d */
    public final int f16666d;

    /* renamed from: e */
    public long f16667e = 0;

    /* renamed from: f */
    public Writer f16668f;

    /* renamed from: g */
    public final LinkedHashMap f16669g = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: h */
    public int f16670h;

    /* renamed from: i */
    final ThreadPoolExecutor f16671i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C5503b());

    /* renamed from: j */
    private final File f16672j;

    /* renamed from: k */
    private final int f16673k;

    /* renamed from: l */
    private final long f16674l;

    /* renamed from: m */
    private long f16675m = 0;

    /* renamed from: n */
    private final Callable f16676n = new C5502a(this);

    public C5507f(File file, long j) {
        File file2 = file;
        this.f16663a = file2;
        this.f16673k = 1;
        this.f16664b = new File(file2, "journal");
        this.f16665c = new File(file2, "journal.tmp");
        this.f16672j = new File(file2, "journal.bkp");
        this.f16666d = 1;
        this.f16674l = j;
    }

    /* renamed from: d */
    public static void m14234d(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: g */
    public static void m14235g(File file, File file2, boolean z) {
        if (z) {
            m14234d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: l */
    private final void m14236l() {
        if (this.f16668f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: m */
    private static void m14237m(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: n */
    private static void m14238n(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: a */
    public final synchronized C5506e mo11845a(String str) {
        m14236l();
        C5505d dVar = (C5505d) this.f16669g.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f16659e) {
            return null;
        }
        File[] fileArr = dVar.f16657c;
        int length = fileArr.length;
        for (int i = 0; i < length; i = 1) {
            if (!fileArr[0].exists()) {
                return null;
            }
        }
        this.f16670h++;
        this.f16668f.append("READ");
        this.f16668f.append(' ');
        this.f16668f.append(str);
        this.f16668f.append(10);
        if (mo11852i()) {
            this.f16671i.submit(this.f16676n);
        }
        return new C5506e(dVar.f16657c);
    }

    /* renamed from: b */
    public final synchronized void mo11846b(C5504c cVar, boolean z) {
        C5505d dVar = cVar.f16651a;
        if (dVar.f16660f == cVar) {
            if (z && !dVar.f16659e) {
                int i = 0;
                while (i < this.f16666d) {
                    if (!cVar.f16652b[0]) {
                        cVar.mo11842a();
                        throw new IllegalStateException("Newly created entry didn't create value for index 0");
                    } else if (dVar.f16658d[0].exists()) {
                        i = 1;
                    } else {
                        cVar.mo11842a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f16666d; i2 = 1) {
                File file = dVar.f16658d[0];
                if (!z) {
                    m14234d(file);
                } else if (file.exists()) {
                    File file2 = dVar.f16657c[0];
                    file.renameTo(file2);
                    long j = dVar.f16656b[0];
                    long length = file2.length();
                    dVar.f16656b[0] = length;
                    this.f16667e = (this.f16667e - j) + length;
                }
            }
            this.f16670h++;
            dVar.f16660f = null;
            if (dVar.f16659e || z) {
                dVar.f16659e = true;
                this.f16668f.append("CLEAN");
                this.f16668f.append(' ');
                this.f16668f.append(dVar.f16655a);
                this.f16668f.append(dVar.mo11844a());
                this.f16668f.append(10);
                if (z) {
                    this.f16675m++;
                }
            } else {
                this.f16669g.remove(dVar.f16655a);
                this.f16668f.append("REMOVE");
                this.f16668f.append(' ');
                this.f16668f.append(dVar.f16655a);
                this.f16668f.append(10);
            }
            m14238n(this.f16668f);
            if (this.f16667e > this.f16674l || mo11852i()) {
                this.f16671i.submit(this.f16676n);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final void mo11847c() {
        close();
        C5510i.m14251b(this.f16663a);
    }

    public final synchronized void close() {
        if (this.f16668f != null) {
            ArrayList arrayList = new ArrayList(this.f16669g.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C5504c cVar = ((C5505d) arrayList.get(i)).f16660f;
                if (cVar != null) {
                    cVar.mo11842a();
                }
            }
            mo11851h();
            m14237m(this.f16668f);
            this.f16668f = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:45|46|47) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:66|67|(1:69)(1:70)|71|72) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        throw com.bumptech.glide.p280a.C5505d.m14232b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r12.f16670h = r1 - r12.f16669g.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012d, code lost:
        if (r2.f16679b == -1) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012f, code lost:
        mo11850f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0133, code lost:
        r12.f16668f = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r12.f16664b, true), com.bumptech.glide.p280a.C5510i.f16683a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0122 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:66:0x0122=Splitter:B:66:0x0122, B:73:0x014c=Splitter:B:73:0x014c} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11849e() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            com.bumptech.glide.a.h r2 = new com.bumptech.glide.a.h
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = r12.f16664b
            r3.<init>(r4)
            java.nio.charset.Charset r4 = com.bumptech.glide.p280a.C5510i.f16683a
            r2.<init>(r3, r4)
            java.lang.String r3 = r2.mo11856a()     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r2.mo11856a()     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = r2.mo11856a()     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = r2.mo11856a()     // Catch:{ all -> 0x0175 }
            java.lang.String r7 = r2.mo11856a()     // Catch:{ all -> 0x0175 }
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = r8.equals(r3)     // Catch:{ all -> 0x0175 }
            if (r8 == 0) goto L_0x014c
            java.lang.String r8 = "1"
            boolean r8 = r8.equals(r4)     // Catch:{ all -> 0x0175 }
            if (r8 == 0) goto L_0x014c
            int r8 = r12.f16673k     // Catch:{ all -> 0x0175 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x0175 }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0175 }
            if (r5 == 0) goto L_0x014c
            int r5 = r12.f16666d     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0175 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0175 }
            if (r5 == 0) goto L_0x014c
            java.lang.String r5 = ""
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x0175 }
            if (r5 == 0) goto L_0x014c
            r0 = 0
            r1 = 0
        L_0x0058:
            r3 = 1
            r4 = -1
            java.lang.String r5 = r2.mo11856a()     // Catch:{ EOFException -> 0x0122 }
            r6 = 32
            int r7 = r5.indexOf(r6)     // Catch:{ EOFException -> 0x0122 }
            java.lang.String r8 = "unexpected journal line: "
            if (r7 == r4) goto L_0x0114
            int r9 = r7 + 1
            int r6 = r5.indexOf(r6, r9)     // Catch:{ EOFException -> 0x0122 }
            if (r6 != r4) goto L_0x0088
            java.lang.String r9 = r5.substring(r9)     // Catch:{ EOFException -> 0x0122 }
            r10 = 6
            if (r7 != r10) goto L_0x008c
            java.lang.String r7 = "REMOVE"
            boolean r7 = r5.startsWith(r7)     // Catch:{ EOFException -> 0x0122 }
            if (r7 == 0) goto L_0x0086
            java.util.LinkedHashMap r5 = r12.f16669g     // Catch:{ EOFException -> 0x0122 }
            r5.remove(r9)     // Catch:{ EOFException -> 0x0122 }
            goto L_0x0102
        L_0x0086:
            r7 = 6
            goto L_0x008c
        L_0x0088:
            java.lang.String r9 = r5.substring(r9, r6)     // Catch:{ EOFException -> 0x0122 }
        L_0x008c:
            java.util.LinkedHashMap r10 = r12.f16669g     // Catch:{ EOFException -> 0x0122 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ EOFException -> 0x0122 }
            com.bumptech.glide.a.d r10 = (com.bumptech.glide.p280a.C5505d) r10     // Catch:{ EOFException -> 0x0122 }
            if (r10 != 0) goto L_0x00a0
            com.bumptech.glide.a.d r10 = new com.bumptech.glide.a.d     // Catch:{ EOFException -> 0x0122 }
            r10.<init>(r12, r9)     // Catch:{ EOFException -> 0x0122 }
            java.util.LinkedHashMap r11 = r12.f16669g     // Catch:{ EOFException -> 0x0122 }
            r11.put(r9, r10)     // Catch:{ EOFException -> 0x0122 }
        L_0x00a0:
            r9 = 5
            if (r6 == r4) goto L_0x00e1
            if (r7 != r9) goto L_0x00e1
            java.lang.String r7 = "CLEAN"
            boolean r7 = r5.startsWith(r7)     // Catch:{ EOFException -> 0x0122 }
            if (r7 == 0) goto L_0x00e0
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)     // Catch:{ EOFException -> 0x0122 }
            java.lang.String r6 = " "
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ EOFException -> 0x0122 }
            r10.f16659e = r3     // Catch:{ EOFException -> 0x0122 }
            r6 = 0
            r10.f16660f = r6     // Catch:{ EOFException -> 0x0122 }
            int r6 = r5.length     // Catch:{ EOFException -> 0x0122 }
            com.bumptech.glide.a.f r7 = r10.f16661g     // Catch:{ EOFException -> 0x0122 }
            int r7 = r7.f16666d     // Catch:{ EOFException -> 0x0122 }
            if (r6 != r7) goto L_0x00db
            r6 = 0
        L_0x00c6:
            int r7 = r5.length     // Catch:{ NumberFormatException -> 0x00d6 }
            if (r6 >= r7) goto L_0x0102
            long[] r7 = r10.f16656b     // Catch:{ NumberFormatException -> 0x00d6 }
            r8 = r5[r6]     // Catch:{ NumberFormatException -> 0x00d6 }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x00d6 }
            r7[r6] = r8     // Catch:{ NumberFormatException -> 0x00d6 }
            int r6 = r6 + 1
            goto L_0x00c6
        L_0x00d6:
            java.io.IOException r0 = com.bumptech.glide.p280a.C5505d.m14232b(r5)     // Catch:{ EOFException -> 0x0122 }
            throw r0     // Catch:{ EOFException -> 0x0122 }
        L_0x00db:
            java.io.IOException r0 = com.bumptech.glide.p280a.C5505d.m14232b(r5)     // Catch:{ EOFException -> 0x0122 }
            throw r0     // Catch:{ EOFException -> 0x0122 }
        L_0x00e0:
            r7 = 5
        L_0x00e1:
            if (r6 != r4) goto L_0x00f5
            if (r7 != r9) goto L_0x00f5
            java.lang.String r9 = "DIRTY"
            boolean r9 = r5.startsWith(r9)     // Catch:{ EOFException -> 0x0122 }
            if (r9 == 0) goto L_0x00f5
            com.bumptech.glide.a.c r5 = new com.bumptech.glide.a.c     // Catch:{ EOFException -> 0x0122 }
            r5.<init>(r12, r10)     // Catch:{ EOFException -> 0x0122 }
            r10.f16660f = r5     // Catch:{ EOFException -> 0x0122 }
            goto L_0x0102
        L_0x00f5:
            if (r6 != r4) goto L_0x0106
            r6 = 4
            if (r7 != r6) goto L_0x0106
            java.lang.String r6 = "READ"
            boolean r6 = r5.startsWith(r6)     // Catch:{ EOFException -> 0x0122 }
            if (r6 == 0) goto L_0x0106
        L_0x0102:
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0106:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x0122 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ EOFException -> 0x0122 }
            java.lang.String r5 = r8.concat(r5)     // Catch:{ EOFException -> 0x0122 }
            r0.<init>(r5)     // Catch:{ EOFException -> 0x0122 }
            throw r0     // Catch:{ EOFException -> 0x0122 }
        L_0x0114:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x0122 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ EOFException -> 0x0122 }
            java.lang.String r5 = r8.concat(r5)     // Catch:{ EOFException -> 0x0122 }
            r0.<init>(r5)     // Catch:{ EOFException -> 0x0122 }
            throw r0     // Catch:{ EOFException -> 0x0122 }
        L_0x0122:
            java.util.LinkedHashMap r0 = r12.f16669g     // Catch:{ all -> 0x0175 }
            int r0 = r0.size()     // Catch:{ all -> 0x0175 }
            int r1 = r1 - r0
            r12.f16670h = r1     // Catch:{ all -> 0x0175 }
            int r0 = r2.f16679b     // Catch:{ all -> 0x0175 }
            if (r0 != r4) goto L_0x0133
            r12.mo11850f()     // Catch:{ all -> 0x0175 }
            goto L_0x0148
        L_0x0133:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0175 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0175 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0175 }
            java.io.File r5 = r12.f16664b     // Catch:{ all -> 0x0175 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0175 }
            java.nio.charset.Charset r3 = com.bumptech.glide.p280a.C5510i.f16683a     // Catch:{ all -> 0x0175 }
            r1.<init>(r4, r3)     // Catch:{ all -> 0x0175 }
            r0.<init>(r1)     // Catch:{ all -> 0x0175 }
            r12.f16668f = r0     // Catch:{ all -> 0x0175 }
        L_0x0148:
            com.bumptech.glide.p280a.C5510i.m14250a(r2)
            return
        L_0x014c:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0175 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r8.<init>(r1)     // Catch:{ all -> 0x0175 }
            r8.append(r3)     // Catch:{ all -> 0x0175 }
            r8.append(r0)     // Catch:{ all -> 0x0175 }
            r8.append(r4)     // Catch:{ all -> 0x0175 }
            r8.append(r0)     // Catch:{ all -> 0x0175 }
            r8.append(r6)     // Catch:{ all -> 0x0175 }
            r8.append(r0)     // Catch:{ all -> 0x0175 }
            r8.append(r7)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "]"
            r8.append(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0175 }
            r5.<init>(r0)     // Catch:{ all -> 0x0175 }
            throw r5     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            com.bumptech.glide.p280a.C5510i.m14250a(r2)
            goto L_0x017b
        L_0x017a:
            throw r0
        L_0x017b:
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p280a.C5507f.mo11849e():void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public final synchronized void mo11850f() {
        Writer writer = this.f16668f;
        if (writer != null) {
            m14237m(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f16665c), C5510i.f16683a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16673k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16666d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C5505d dVar : this.f16669g.values()) {
                if (dVar.f16660f != null) {
                    String str = dVar.f16655a;
                    bufferedWriter.write("DIRTY " + str + "\n");
                } else {
                    String str2 = dVar.f16655a;
                    String a = dVar.mo11844a();
                    bufferedWriter.write("CLEAN " + str2 + a + "\n");
                }
            }
            m14237m(bufferedWriter);
            if (this.f16664b.exists()) {
                m14235g(this.f16664b, this.f16672j, true);
            }
            m14235g(this.f16665c, this.f16664b, false);
            this.f16672j.delete();
            this.f16668f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f16664b, true), C5510i.f16683a));
        } catch (Throwable th) {
            m14237m(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: h */
    public final void mo11851h() {
        while (this.f16667e > this.f16674l) {
            mo11854k((String) ((Map.Entry) this.f16669g.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: i */
    public final boolean mo11852i() {
        int i = this.f16670h;
        return i >= 2000 && i >= this.f16669g.size();
    }

    /* renamed from: j */
    public final synchronized C5504c mo11853j(String str) {
        m14236l();
        C5505d dVar = (C5505d) this.f16669g.get(str);
        if (dVar == null) {
            dVar = new C5505d(this, str);
            this.f16669g.put(str, dVar);
        } else if (dVar.f16660f != null) {
            return null;
        }
        C5504c cVar = new C5504c(this, dVar);
        dVar.f16660f = cVar;
        this.f16668f.append("DIRTY");
        this.f16668f.append(' ');
        this.f16668f.append(str);
        this.f16668f.append(10);
        m14238n(this.f16668f);
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11854k(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m14236l()     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashMap r0 = r8.f16669g     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0084 }
            com.bumptech.glide.a.d r0 = (com.bumptech.glide.p280a.C5505d) r0     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0082
            com.bumptech.glide.a.c r1 = r0.f16660f     // Catch:{ all -> 0x0084 }
            if (r1 != 0) goto L_0x0082
            r1 = 0
            r2 = 0
        L_0x0014:
            int r3 = r8.f16666d     // Catch:{ all -> 0x0084 }
            r4 = 1
            if (r2 >= r3) goto L_0x004d
            java.io.File[] r2 = r0.f16657c     // Catch:{ all -> 0x0084 }
            r2 = r2[r1]     // Catch:{ all -> 0x0084 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x003e
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x002a
            goto L_0x003e
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "failed to delete "
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x0084 }
            r9.<init>(r0)     // Catch:{ all -> 0x0084 }
            throw r9     // Catch:{ all -> 0x0084 }
        L_0x003e:
            long r2 = r8.f16667e     // Catch:{ all -> 0x0084 }
            long[] r5 = r0.f16656b     // Catch:{ all -> 0x0084 }
            r6 = r5[r1]     // Catch:{ all -> 0x0084 }
            long r2 = r2 - r6
            r8.f16667e = r2     // Catch:{ all -> 0x0084 }
            r2 = 0
            r5[r1] = r2     // Catch:{ all -> 0x0084 }
            r2 = 1
            goto L_0x0014
        L_0x004d:
            int r0 = r8.f16670h     // Catch:{ all -> 0x0084 }
            int r0 = r0 + r4
            r8.f16670h = r0     // Catch:{ all -> 0x0084 }
            java.io.Writer r0 = r8.f16668f     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "REMOVE"
            r0.append(r1)     // Catch:{ all -> 0x0084 }
            java.io.Writer r0 = r8.f16668f     // Catch:{ all -> 0x0084 }
            r1 = 32
            r0.append(r1)     // Catch:{ all -> 0x0084 }
            java.io.Writer r0 = r8.f16668f     // Catch:{ all -> 0x0084 }
            r0.append(r9)     // Catch:{ all -> 0x0084 }
            java.io.Writer r0 = r8.f16668f     // Catch:{ all -> 0x0084 }
            r1 = 10
            r0.append(r1)     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashMap r0 = r8.f16669g     // Catch:{ all -> 0x0084 }
            r0.remove(r9)     // Catch:{ all -> 0x0084 }
            boolean r9 = r8.mo11852i()     // Catch:{ all -> 0x0084 }
            if (r9 == 0) goto L_0x0080
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f16671i     // Catch:{ all -> 0x0084 }
            java.util.concurrent.Callable r0 = r8.f16676n     // Catch:{ all -> 0x0084 }
            r9.submit(r0)     // Catch:{ all -> 0x0084 }
            monitor-exit(r8)
            return
        L_0x0080:
            monitor-exit(r8)
            return
        L_0x0082:
            monitor-exit(r8)
            return
        L_0x0084:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0088
        L_0x0087:
            throw r9
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p280a.C5507f.mo11854k(java.lang.String):void");
    }
}
