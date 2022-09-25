package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1331br;
import androidx.camera.core.p069a.C1384k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.ca */
/* compiled from: PG */
public final class C1497ca implements C1331br, C1413an {

    /* renamed from: a */
    public final Object f4115a = new Object();

    /* renamed from: b */
    public final C1384k f4116b = new C1480bz(this);

    /* renamed from: c */
    public int f4117c = 0;

    /* renamed from: d */
    public boolean f4118d = false;

    /* renamed from: e */
    C1330bq f4119e;

    /* renamed from: f */
    public final LongSparseArray f4120f = new LongSparseArray();

    /* renamed from: g */
    private final C1330bq f4121g = new C1479by(this);

    /* renamed from: h */
    private final C1331br f4122h;

    /* renamed from: i */
    private Executor f4123i;

    /* renamed from: j */
    private final LongSparseArray f4124j = new LongSparseArray();

    /* renamed from: k */
    private int f4125k;

    /* renamed from: l */
    private final List f4126l;

    /* renamed from: m */
    private final List f4127m = new ArrayList();

    public C1497ca(C1331br brVar) {
        this.f4122h = brVar;
        this.f4125k = 0;
        this.f4126l = new ArrayList(mo4200c());
    }

    /* renamed from: l */
    public static C1331br m4002l(int i, int i2, int i3, int i4) {
        return new C1550e(ImageReader.newInstance(i, i2, i3, i4));
    }

    /* renamed from: a */
    public final int mo4198a() {
        int a;
        synchronized (this.f4115a) {
            a = this.f4122h.mo4198a();
        }
        return a;
    }

    /* renamed from: b */
    public final int mo4199b() {
        int b;
        synchronized (this.f4115a) {
            b = this.f4122h.mo4199b();
        }
        return b;
    }

    /* renamed from: c */
    public final int mo4200c() {
        int c;
        synchronized (this.f4115a) {
            c = this.f4122h.mo4200c();
        }
        return c;
    }

    /* renamed from: d */
    public final int mo4201d() {
        int d;
        synchronized (this.f4115a) {
            d = this.f4122h.mo4201d();
        }
        return d;
    }

    /* renamed from: e */
    public final Surface mo4202e() {
        Surface e;
        synchronized (this.f4115a) {
            e = this.f4122h.mo4202e();
        }
        return e;
    }

    /* renamed from: f */
    public final C1473bs mo4203f() {
        synchronized (this.f4115a) {
            if (this.f4126l.isEmpty()) {
                return null;
            }
            if (this.f4125k < this.f4126l.size()) {
                ArrayList<C1473bs> arrayList = new ArrayList<>();
                for (int i = 0; i < this.f4126l.size() - 1; i++) {
                    if (!this.f4127m.contains(this.f4126l.get(i))) {
                        arrayList.add((C1473bs) this.f4126l.get(i));
                    }
                }
                for (C1473bs close : arrayList) {
                    close.close();
                }
                int size = this.f4126l.size() - 1;
                List list = this.f4126l;
                this.f4125k = size + 1;
                C1473bs bsVar = (C1473bs) list.get(size);
                this.f4127m.add(bsVar);
                return bsVar;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    /* renamed from: g */
    public final C1473bs mo4204g() {
        synchronized (this.f4115a) {
            if (this.f4126l.isEmpty()) {
                return null;
            }
            if (this.f4125k < this.f4126l.size()) {
                List list = this.f4126l;
                int i = this.f4125k;
                this.f4125k = i + 1;
                C1473bs bsVar = (C1473bs) list.get(i);
                this.f4127m.add(bsVar);
                return bsVar;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    /* renamed from: h */
    public final void mo4205h() {
        synchronized (this.f4115a) {
            this.f4122h.mo4205h();
            this.f4119e = null;
            this.f4123i = null;
            this.f4117c = 0;
        }
    }

    /* renamed from: i */
    public final void mo4206i() {
        synchronized (this.f4115a) {
            if (!this.f4118d) {
                for (C1473bs close : new ArrayList(this.f4126l)) {
                    close.close();
                }
                this.f4126l.clear();
                this.f4122h.mo4206i();
                this.f4118d = true;
            }
        }
    }

    /* renamed from: k */
    public final void mo4299k(C1473bs bsVar) {
        synchronized (this.f4115a) {
            synchronized (this.f4115a) {
                int indexOf = this.f4126l.indexOf(bsVar);
                if (indexOf >= 0) {
                    this.f4126l.remove(indexOf);
                    int i = this.f4125k;
                    if (indexOf <= i) {
                        this.f4125k = i - 1;
                    }
                }
                this.f4127m.remove(bsVar);
                if (this.f4117c > 0) {
                    mo4374m(this.f4122h);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4374m(androidx.camera.core.p069a.C1331br r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4115a
            monitor-enter(r0)
            boolean r1 = r6.f4118d     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0009:
            android.util.LongSparseArray r1 = r6.f4124j     // Catch:{ all -> 0x005e }
            int r1 = r1.size()     // Catch:{ all -> 0x005e }
            java.util.List r2 = r6.f4126l     // Catch:{ all -> 0x005e }
            int r2 = r2.size()     // Catch:{ all -> 0x005e }
            int r1 = r1 + r2
            int r2 = r7.mo4200c()     // Catch:{ all -> 0x005e }
            if (r1 < r2) goto L_0x0025
            java.lang.String r7 = "MetadataImageReader"
            java.lang.String r1 = "Skip to acquire the next image because the acquired image count has reached the max images count."
            androidx.camera.core.C1477bw.m3978a(r7, r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0025:
            androidx.camera.core.bs r2 = r7.mo4204g()     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x004f
            int r3 = r6.f4117c     // Catch:{ all -> 0x005e }
            int r3 = r3 + -1
            r6.f4117c = r3     // Catch:{ all -> 0x005e }
            int r1 = r1 + 1
            android.util.LongSparseArray r3 = r6.f4124j     // Catch:{ all -> 0x005e }
            androidx.camera.core.br r4 = r2.mo4305e()     // Catch:{ all -> 0x005e }
            long r4 = r4.mo4331b()     // Catch:{ all -> 0x005e }
            r3.put(r4, r2)     // Catch:{ all -> 0x005e }
            r6.mo4375n()     // Catch:{ all -> 0x005e }
            goto L_0x004f
        L_0x0044:
            r7 = move-exception
            goto L_0x005d
        L_0x0046:
            r2 = move-exception
            java.lang.String r3 = "MetadataImageReader"
            java.lang.String r4 = "Failed to acquire next image."
            androidx.camera.core.C1477bw.m3979b(r3, r4, r2)     // Catch:{ all -> 0x0044 }
            r2 = 0
        L_0x004f:
            if (r2 == 0) goto L_0x005b
            int r2 = r6.f4117c     // Catch:{ all -> 0x005e }
            if (r2 <= 0) goto L_0x005b
            int r2 = r7.mo4200c()     // Catch:{ all -> 0x005e }
            if (r1 < r2) goto L_0x0025
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005d:
            throw r7     // Catch:{ all -> 0x005e }
        L_0x005e:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            goto L_0x0062
        L_0x0061:
            throw r7
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1497ca.mo4374m(androidx.camera.core.a.br):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r1 = r9.f4115a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r9.f4124j.size() == 0) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r9.f4120f.size() != 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        r2 = java.lang.Long.valueOf(r9.f4124j.keyAt(0));
        r3 = java.lang.Long.valueOf(r9.f4120f.keyAt(0));
        androidx.core.p097i.C1974i.m5313a(!r3.equals(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        if (r3.longValue() <= r2.longValue()) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        r2 = r9.f4124j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (r2 < 0) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        if (r9.f4124j.keyAt(r2) >= r3.longValue()) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        ((androidx.camera.core.C1473bs) r9.f4124j.valueAt(r2)).close();
        r9.f4124j.removeAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d7, code lost:
        r3 = r9.f4120f.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dd, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00df, code lost:
        if (r3 < 0) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ed, code lost:
        if (r9.f4120f.keyAt(r3) >= r2.longValue()) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ef, code lost:
        r9.f4120f.removeAt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f5, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        monitor-exit(r1);
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4375n() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f4115a
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r9.f4120f     // Catch:{ all -> 0x00fd }
            int r1 = r1.size()     // Catch:{ all -> 0x00fd }
        L_0x0009:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x006f
            android.util.LongSparseArray r2 = r9.f4120f     // Catch:{ all -> 0x00fd }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x00fd }
            androidx.camera.core.br r2 = (androidx.camera.core.C1472br) r2     // Catch:{ all -> 0x00fd }
            long r3 = r2.mo4331b()     // Catch:{ all -> 0x00fd }
            android.util.LongSparseArray r5 = r9.f4124j     // Catch:{ all -> 0x00fd }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x00fd }
            androidx.camera.core.bs r5 = (androidx.camera.core.C1473bs) r5     // Catch:{ all -> 0x00fd }
            if (r5 == 0) goto L_0x0009
            android.util.LongSparseArray r6 = r9.f4124j     // Catch:{ all -> 0x00fd }
            r6.remove(r3)     // Catch:{ all -> 0x00fd }
            android.util.LongSparseArray r3 = r9.f4120f     // Catch:{ all -> 0x00fd }
            r3.removeAt(r1)     // Catch:{ all -> 0x00fd }
            androidx.camera.core.dd r3 = new androidx.camera.core.dd     // Catch:{ all -> 0x00fd }
            r4 = 0
            r3.<init>(r5, r4, r2)     // Catch:{ all -> 0x00fd }
            java.lang.Object r2 = r9.f4115a     // Catch:{ all -> 0x00fd }
            monitor-enter(r2)     // Catch:{ all -> 0x00fd }
            java.util.List r5 = r9.f4126l     // Catch:{ all -> 0x006c }
            int r5 = r5.size()     // Catch:{ all -> 0x006c }
            int r6 = r9.mo4200c()     // Catch:{ all -> 0x006c }
            if (r5 >= r6) goto L_0x004f
            r3.mo4307g(r9)     // Catch:{ all -> 0x006c }
            java.util.List r4 = r9.f4126l     // Catch:{ all -> 0x006c }
            r4.add(r3)     // Catch:{ all -> 0x006c }
            androidx.camera.core.a.bq r4 = r9.f4119e     // Catch:{ all -> 0x006c }
            java.util.concurrent.Executor r3 = r9.f4123i     // Catch:{ all -> 0x006c }
            goto L_0x005a
        L_0x004f:
            java.lang.String r5 = "TAG"
            java.lang.String r6 = "Maximum image number reached."
            androidx.camera.core.C1477bw.m3978a(r5, r6)     // Catch:{ all -> 0x006c }
            r3.close()     // Catch:{ all -> 0x006c }
            r3 = r4
        L_0x005a:
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            if (r4 == 0) goto L_0x0009
            if (r3 == 0) goto L_0x0068
            androidx.camera.core.bx r2 = new androidx.camera.core.bx     // Catch:{ all -> 0x00fd }
            r2.<init>(r9, r4)     // Catch:{ all -> 0x00fd }
            r3.execute(r2)     // Catch:{ all -> 0x00fd }
            goto L_0x0009
        L_0x0068:
            r4.mo4018a(r9)     // Catch:{ all -> 0x00fd }
            goto L_0x0009
        L_0x006c:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            throw r1     // Catch:{ all -> 0x00fd }
        L_0x006f:
            java.lang.Object r1 = r9.f4115a     // Catch:{ all -> 0x00fd }
            monitor-enter(r1)     // Catch:{ all -> 0x00fd }
            android.util.LongSparseArray r2 = r9.f4124j     // Catch:{ all -> 0x00fa }
            int r2 = r2.size()     // Catch:{ all -> 0x00fa }
            if (r2 == 0) goto L_0x00f7
            android.util.LongSparseArray r2 = r9.f4120f     // Catch:{ all -> 0x00fa }
            int r2 = r2.size()     // Catch:{ all -> 0x00fa }
            if (r2 != 0) goto L_0x0084
            goto L_0x00f7
        L_0x0084:
            android.util.LongSparseArray r2 = r9.f4124j     // Catch:{ all -> 0x00fa }
            r3 = 0
            long r4 = r2.keyAt(r3)     // Catch:{ all -> 0x00fa }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00fa }
            android.util.LongSparseArray r4 = r9.f4120f     // Catch:{ all -> 0x00fa }
            long r3 = r4.keyAt(r3)     // Catch:{ all -> 0x00fa }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00fa }
            boolean r4 = r3.equals(r2)     // Catch:{ all -> 0x00fa }
            r4 = r4 ^ 1
            androidx.core.p097i.C1974i.m5313a(r4)     // Catch:{ all -> 0x00fa }
            long r4 = r3.longValue()     // Catch:{ all -> 0x00fa }
            long r6 = r2.longValue()     // Catch:{ all -> 0x00fa }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d7
            android.util.LongSparseArray r2 = r9.f4124j     // Catch:{ all -> 0x00fa }
            int r2 = r2.size()     // Catch:{ all -> 0x00fa }
        L_0x00b4:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x00f5
            android.util.LongSparseArray r4 = r9.f4124j     // Catch:{ all -> 0x00fa }
            long r4 = r4.keyAt(r2)     // Catch:{ all -> 0x00fa }
            long r6 = r3.longValue()     // Catch:{ all -> 0x00fa }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00d6
            android.util.LongSparseArray r4 = r9.f4124j     // Catch:{ all -> 0x00fa }
            java.lang.Object r4 = r4.valueAt(r2)     // Catch:{ all -> 0x00fa }
            androidx.camera.core.bs r4 = (androidx.camera.core.C1473bs) r4     // Catch:{ all -> 0x00fa }
            r4.close()     // Catch:{ all -> 0x00fa }
            android.util.LongSparseArray r4 = r9.f4124j     // Catch:{ all -> 0x00fa }
            r4.removeAt(r2)     // Catch:{ all -> 0x00fa }
        L_0x00d6:
            goto L_0x00b4
        L_0x00d7:
            android.util.LongSparseArray r3 = r9.f4120f     // Catch:{ all -> 0x00fa }
            int r3 = r3.size()     // Catch:{ all -> 0x00fa }
        L_0x00dd:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x00f5
            android.util.LongSparseArray r4 = r9.f4120f     // Catch:{ all -> 0x00fa }
            long r4 = r4.keyAt(r3)     // Catch:{ all -> 0x00fa }
            long r6 = r2.longValue()     // Catch:{ all -> 0x00fa }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00f4
            android.util.LongSparseArray r4 = r9.f4120f     // Catch:{ all -> 0x00fa }
            r4.removeAt(r3)     // Catch:{ all -> 0x00fa }
        L_0x00f4:
            goto L_0x00dd
        L_0x00f5:
            monitor-exit(r1)     // Catch:{ all -> 0x00fa }
            goto L_0x00f8
        L_0x00f7:
            monitor-exit(r1)     // Catch:{ all -> 0x00fa }
        L_0x00f8:
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            return
        L_0x00fa:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fa }
            throw r2     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            goto L_0x0101
        L_0x0100:
            throw r1
        L_0x0101:
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1497ca.mo4375n():void");
    }

    /* renamed from: j */
    public final void mo4207j(C1330bq bqVar, Executor executor) {
        synchronized (this.f4115a) {
            bqVar.getClass();
            this.f4119e = bqVar;
            executor.getClass();
            this.f4123i = executor;
            this.f4122h.mo4207j(this.f4121g, executor);
        }
    }
}
