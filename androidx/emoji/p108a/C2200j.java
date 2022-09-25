package androidx.emoji.p108a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.core.p097i.C1974i;
import androidx.p060c.C0979i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.emoji.a.j */
/* compiled from: PG */
public final class C2200j {

    /* renamed from: a */
    public static final Object f6221a = new Object();

    /* renamed from: b */
    public static volatile C2200j f6222b;

    /* renamed from: c */
    public final ReadWriteLock f6223c;

    /* renamed from: d */
    public final Set f6224d;

    /* renamed from: e */
    public int f6225e = 3;

    /* renamed from: f */
    public final Handler f6226f;

    /* renamed from: g */
    public final C2193c f6227g;

    /* renamed from: h */
    final C2198h f6228h;

    /* renamed from: i */
    public final boolean f6229i;

    /* renamed from: j */
    public final C2195e f6230j;

    public C2200j(C2194d dVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6223c = reentrantReadWriteLock;
        this.f6229i = dVar.f6217b;
        this.f6228h = dVar.f6216a;
        this.f6230j = dVar.f6218c;
        this.f6226f = new Handler(Looper.getMainLooper());
        this.f6224d = new C0979i(0);
        C2192b bVar = new C2192b(this);
        this.f6227g = bVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f6225e = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (mo5512a() == 0) {
                try {
                    C2192b bVar2 = bVar;
                    C2191a aVar = new C2191a(bVar);
                    C2192b bVar3 = bVar;
                    C2198h hVar = bVar.f6215c.f6228h;
                    synchronized (((C2210t) hVar).f6254a) {
                        if (((C2210t) hVar).f6255b == null) {
                            ((C2210t) hVar).f6256c = new HandlerThread("emojiCompat", 10);
                            ((C2210t) hVar).f6256c.start();
                            ((C2210t) hVar).f6255b = new Handler(((C2210t) hVar).f6256c.getLooper());
                        }
                        ((C2210t) hVar).f6255b.post(new C2207q((C2210t) hVar, aVar));
                    }
                } catch (Throwable unused) {
                    C2192b bVar4 = bVar;
                    bVar.f6215c.mo5517g();
                }
            }
        } catch (Throwable th) {
            this.f6223c.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static C2200j m6088b() {
        C2200j jVar;
        synchronized (f6221a) {
            C1974i.m5315c(f6222b != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            jVar = f6222b;
        }
        return jVar;
    }

    /* renamed from: a */
    public final int mo5512a() {
        this.f6223c.readLock().lock();
        try {
            return this.f6225e;
        } finally {
            this.f6223c.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void mo5513c(C2196f fVar) {
        C1974i.m5319g(fVar, "initCallback cannot be null");
        this.f6223c.writeLock().lock();
        try {
            int i = this.f6225e;
            if (i != 1) {
                if (i != 2) {
                    this.f6224d.add(fVar);
                }
            }
            Handler handler = this.f6226f;
            C1974i.m5319g(fVar, "initCallback cannot be null");
            handler.post(new C2197g(Arrays.asList(new C2196f[]{fVar}), i));
        } finally {
            this.f6223c.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo5514d() {
        return mo5512a() == 1;
    }

    /* renamed from: e */
    public final CharSequence mo5515e(CharSequence charSequence, int i) {
        return mo5516f(charSequence, 0, i, Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: android.text.Spannable} */
    /* JADX WARNING: type inference failed for: r11v7, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0151 A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0180 A[Catch:{ all -> 0x01e2 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo5516f(java.lang.CharSequence r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r3 = r20
            r4 = r21
            boolean r5 = r17.mo5514d()
            java.lang.String r6 = "Not initialized yet"
            androidx.core.p097i.C1974i.m5315c(r5, r6)
            java.lang.String r5 = "start cannot be negative"
            androidx.core.p097i.C1974i.m5318f(r0, r5)
            java.lang.String r5 = "end cannot be negative"
            androidx.core.p097i.C1974i.m5318f(r3, r5)
            java.lang.String r5 = "maxEmojiCount cannot be negative"
            androidx.core.p097i.C1974i.m5318f(r4, r5)
            r5 = 0
            if (r0 > r3) goto L_0x0027
            r7 = 1
            goto L_0x0028
        L_0x0027:
            r7 = 0
        L_0x0028:
            java.lang.String r8 = "start should be <= than end"
            androidx.core.p097i.C1974i.m5314b(r7, r8)
            r7 = 0
            if (r2 != 0) goto L_0x0031
            return r7
        L_0x0031:
            int r8 = r18.length()
            if (r0 > r8) goto L_0x0039
            r8 = 1
            goto L_0x003a
        L_0x0039:
            r8 = 0
        L_0x003a:
            java.lang.String r9 = "start should be < than charSequence length"
            androidx.core.p097i.C1974i.m5314b(r8, r9)
            int r8 = r18.length()
            if (r3 > r8) goto L_0x0047
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            java.lang.String r9 = "end should be < than charSequence length"
            androidx.core.p097i.C1974i.m5314b(r8, r9)
            int r8 = r18.length()
            if (r8 == 0) goto L_0x01ef
            if (r0 != r3) goto L_0x0057
            goto L_0x01ef
        L_0x0057:
            boolean r8 = r1.f6229i
            androidx.emoji.a.c r9 = r1.f6227g
            androidx.emoji.a.b r9 = (androidx.emoji.p108a.C2192b) r9
            androidx.emoji.a.n r9 = r9.f6213a
            boolean r10 = r2 instanceof androidx.emoji.widget.C2226j
            if (r10 == 0) goto L_0x0069
            r11 = r2
            androidx.emoji.widget.j r11 = (androidx.emoji.widget.C2226j) r11
            r11.mo5553a()
        L_0x0069:
            if (r10 != 0) goto L_0x0089
            boolean r11 = r2 instanceof android.text.Spannable     // Catch:{ all -> 0x01e2 }
            if (r11 == 0) goto L_0x0070
            goto L_0x0089
        L_0x0070:
            boolean r11 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x01e2 }
            if (r11 == 0) goto L_0x008c
            r11 = r2
            android.text.Spanned r11 = (android.text.Spanned) r11     // Catch:{ all -> 0x01e2 }
            int r12 = r0 + -1
            int r13 = r3 + 1
            java.lang.Class<androidx.emoji.a.o> r14 = androidx.emoji.p108a.C2205o.class
            int r11 = r11.nextSpanTransition(r12, r13, r14)     // Catch:{ all -> 0x01e2 }
            if (r11 > r3) goto L_0x008c
            android.text.SpannableString r7 = new android.text.SpannableString     // Catch:{ all -> 0x01e2 }
            r7.<init>(r2)     // Catch:{ all -> 0x01e2 }
            goto L_0x008c
        L_0x0089:
            r7 = r2
            android.text.Spannable r7 = (android.text.Spannable) r7     // Catch:{ all -> 0x01e2 }
        L_0x008c:
            if (r7 == 0) goto L_0x00b8
            java.lang.Class<androidx.emoji.a.o> r11 = androidx.emoji.p108a.C2205o.class
            java.lang.Object[] r11 = r7.getSpans(r0, r3, r11)     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.o[] r11 = (androidx.emoji.p108a.C2205o[]) r11     // Catch:{ all -> 0x01e2 }
            if (r11 == 0) goto L_0x00b8
            int r12 = r11.length     // Catch:{ all -> 0x01e2 }
            if (r12 <= 0) goto L_0x00b8
            r13 = 0
        L_0x009c:
            if (r13 >= r12) goto L_0x00b8
            r14 = r11[r13]     // Catch:{ all -> 0x01e2 }
            int r15 = r7.getSpanStart(r14)     // Catch:{ all -> 0x01e2 }
            int r6 = r7.getSpanEnd(r14)     // Catch:{ all -> 0x01e2 }
            if (r15 == r3) goto L_0x00ad
            r7.removeSpan(r14)     // Catch:{ all -> 0x01e2 }
        L_0x00ad:
            int r0 = java.lang.Math.min(r15, r0)     // Catch:{ all -> 0x01e2 }
            int r3 = java.lang.Math.max(r6, r3)     // Catch:{ all -> 0x01e2 }
            int r13 = r13 + 1
            goto L_0x009c
        L_0x00b8:
            if (r0 == r3) goto L_0x01d4
            int r6 = r18.length()     // Catch:{ all -> 0x01e2 }
            if (r0 < r6) goto L_0x00c2
            goto L_0x01d4
        L_0x00c2:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r6) goto L_0x00d7
            if (r7 == 0) goto L_0x00d7
            int r6 = r7.length()     // Catch:{ all -> 0x01e2 }
            java.lang.Class<androidx.emoji.a.o> r11 = androidx.emoji.p108a.C2205o.class
            java.lang.Object[] r6 = r7.getSpans(r5, r6, r11)     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.o[] r6 = (androidx.emoji.p108a.C2205o[]) r6     // Catch:{ all -> 0x01e2 }
            int r6 = r6.length     // Catch:{ all -> 0x01e2 }
            int r4 = r4 - r6
        L_0x00d7:
            androidx.emoji.a.m r6 = new androidx.emoji.a.m     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.y r11 = r9.f6243a     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.x r11 = r11.f6267c     // Catch:{ all -> 0x01e2 }
            r6.<init>(r11)     // Catch:{ all -> 0x01e2 }
            int r11 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x01e2 }
            r5 = r0
            r12 = r11
            r11 = r7
            r7 = 0
        L_0x00e8:
            r13 = 2
            if (r0 >= r3) goto L_0x0193
            if (r7 >= r4) goto L_0x0193
            androidx.emoji.a.x r14 = r6.f6238b     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.x r14 = r14.mo5528a(r12)     // Catch:{ all -> 0x01e2 }
            int r15 = r6.f6237a     // Catch:{ all -> 0x01e2 }
            if (r15 == r13) goto L_0x0106
            if (r14 != 0) goto L_0x00fe
            r6.mo5521c()     // Catch:{ all -> 0x01e2 }
        L_0x00fc:
            r14 = 1
            goto L_0x014c
        L_0x00fe:
            r6.f6237a = r13     // Catch:{ all -> 0x01e2 }
            r6.f6238b = r14     // Catch:{ all -> 0x01e2 }
            r14 = 1
            r6.f6241e = r14     // Catch:{ all -> 0x01e2 }
            goto L_0x0120
        L_0x0106:
            if (r14 == 0) goto L_0x0111
            r6.f6238b = r14     // Catch:{ all -> 0x01e2 }
            int r14 = r6.f6241e     // Catch:{ all -> 0x01e2 }
            r15 = 1
            int r14 = r14 + r15
            r6.f6241e = r14     // Catch:{ all -> 0x01e2 }
            goto L_0x0120
        L_0x0111:
            r14 = 65038(0xfe0e, float:9.1138E-41)
            if (r12 != r14) goto L_0x011a
            r6.mo5521c()     // Catch:{ all -> 0x01e2 }
            goto L_0x00fc
        L_0x011a:
            boolean r14 = androidx.emoji.p108a.C2203m.m6096a(r12)     // Catch:{ all -> 0x01e2 }
            if (r14 == 0) goto L_0x0122
        L_0x0120:
            r14 = 2
            goto L_0x014c
        L_0x0122:
            androidx.emoji.a.x r14 = r6.f6238b     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.k r15 = r14.f6263a     // Catch:{ all -> 0x01e2 }
            if (r15 == 0) goto L_0x0148
            int r15 = r6.f6241e     // Catch:{ all -> 0x01e2 }
            r16 = 3
            r13 = 1
            if (r15 != r13) goto L_0x0141
            boolean r13 = r6.mo5520b()     // Catch:{ all -> 0x01e2 }
            if (r13 == 0) goto L_0x013d
            androidx.emoji.a.x r13 = r6.f6238b     // Catch:{ all -> 0x01e2 }
            r6.f6239c = r13     // Catch:{ all -> 0x01e2 }
            r6.mo5521c()     // Catch:{ all -> 0x01e2 }
            goto L_0x0146
        L_0x013d:
            r6.mo5521c()     // Catch:{ all -> 0x01e2 }
            goto L_0x00fc
        L_0x0141:
            r6.f6239c = r14     // Catch:{ all -> 0x01e2 }
            r6.mo5521c()     // Catch:{ all -> 0x01e2 }
        L_0x0146:
            r14 = 3
            goto L_0x014c
        L_0x0148:
            r6.mo5521c()     // Catch:{ all -> 0x01e2 }
            goto L_0x00fc
        L_0x014c:
            r6.f6240d = r12     // Catch:{ all -> 0x01e2 }
            r13 = 1
            if (r14 == r13) goto L_0x0180
            r13 = 2
            if (r14 == r13) goto L_0x0173
            if (r8 != 0) goto L_0x0160
            androidx.emoji.a.x r13 = r6.f6239c     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.k r13 = r13.f6263a     // Catch:{ all -> 0x01e2 }
            boolean r13 = r9.mo5522c(r2, r5, r0, r13)     // Catch:{ all -> 0x01e2 }
            if (r13 != 0) goto L_0x0170
        L_0x0160:
            if (r11 != 0) goto L_0x0167
            android.text.SpannableString r11 = new android.text.SpannableString     // Catch:{ all -> 0x01e2 }
            r11.<init>(r2)     // Catch:{ all -> 0x01e2 }
        L_0x0167:
            androidx.emoji.a.x r13 = r6.f6239c     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.k r13 = r13.f6263a     // Catch:{ all -> 0x01e2 }
            androidx.emoji.p108a.C2204n.m6101d(r11, r13, r5, r0)     // Catch:{ all -> 0x01e2 }
            int r7 = r7 + 1
        L_0x0170:
            r5 = r0
            goto L_0x00e8
        L_0x0173:
            int r13 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x01e2 }
            int r0 = r0 + r13
            if (r0 >= r3) goto L_0x00e8
            int r12 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x01e2 }
            goto L_0x00e8
        L_0x0180:
            int r0 = java.lang.Character.codePointAt(r2, r5)     // Catch:{ all -> 0x01e2 }
            int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x01e2 }
            int r5 = r5 + r0
            if (r5 >= r3) goto L_0x0190
            int r0 = java.lang.Character.codePointAt(r2, r5)     // Catch:{ all -> 0x01e2 }
            r12 = r0
        L_0x0190:
            r0 = r5
            goto L_0x00e8
        L_0x0193:
            int r3 = r6.f6237a     // Catch:{ all -> 0x01e2 }
            r12 = 2
            if (r3 != r12) goto L_0x01c5
            androidx.emoji.a.x r3 = r6.f6238b     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.k r3 = r3.f6263a     // Catch:{ all -> 0x01e2 }
            if (r3 == 0) goto L_0x01c5
            int r3 = r6.f6241e     // Catch:{ all -> 0x01e2 }
            r12 = 1
            if (r3 > r12) goto L_0x01a9
            boolean r3 = r6.mo5520b()     // Catch:{ all -> 0x01e2 }
            if (r3 == 0) goto L_0x01c5
        L_0x01a9:
            if (r7 >= r4) goto L_0x01c5
            if (r8 != 0) goto L_0x01b7
            androidx.emoji.a.x r3 = r6.f6238b     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.k r3 = r3.f6263a     // Catch:{ all -> 0x01e2 }
            boolean r3 = r9.mo5522c(r2, r5, r0, r3)     // Catch:{ all -> 0x01e2 }
            if (r3 != 0) goto L_0x01c5
        L_0x01b7:
            if (r11 != 0) goto L_0x01be
            android.text.SpannableString r11 = new android.text.SpannableString     // Catch:{ all -> 0x01e2 }
            r11.<init>(r2)     // Catch:{ all -> 0x01e2 }
        L_0x01be:
            androidx.emoji.a.x r3 = r6.f6238b     // Catch:{ all -> 0x01e2 }
            androidx.emoji.a.k r3 = r3.f6263a     // Catch:{ all -> 0x01e2 }
            androidx.emoji.p108a.C2204n.m6101d(r11, r3, r5, r0)     // Catch:{ all -> 0x01e2 }
        L_0x01c5:
            if (r11 != 0) goto L_0x01c8
            r11 = r2
        L_0x01c8:
            if (r10 == 0) goto L_0x01d7
            r0 = r2
            androidx.emoji.widget.j r0 = (androidx.emoji.widget.C2226j) r0
            r0.mo5559c()
            r0.mo5558b()
            return r11
        L_0x01d4:
            if (r10 != 0) goto L_0x01d8
            r11 = r2
        L_0x01d7:
            return r11
        L_0x01d8:
            r0 = r2
            androidx.emoji.widget.j r0 = (androidx.emoji.widget.C2226j) r0
            r0.mo5559c()
            r0.mo5558b()
            return r2
        L_0x01e2:
            r0 = move-exception
            if (r10 != 0) goto L_0x01e6
            goto L_0x01ee
        L_0x01e6:
            androidx.emoji.widget.j r2 = (androidx.emoji.widget.C2226j) r2
            r2.mo5559c()
            r2.mo5558b()
        L_0x01ee:
            throw r0
        L_0x01ef:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.p108a.C2200j.mo5516f(java.lang.CharSequence, int, int, int):java.lang.CharSequence");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo5517g() {
        ArrayList arrayList = new ArrayList();
        this.f6223c.writeLock().lock();
        try {
            this.f6225e = 2;
            arrayList.addAll(this.f6224d);
            this.f6224d.clear();
            this.f6223c.writeLock().unlock();
            this.f6226f.post(new C2197g(arrayList, this.f6225e));
        } catch (Throwable th) {
            this.f6223c.writeLock().unlock();
            throw th;
        }
    }
}
