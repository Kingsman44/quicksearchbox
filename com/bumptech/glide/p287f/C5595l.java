package com.bumptech.glide.p287f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.Log;
import com.bumptech.glide.C5603h;
import com.bumptech.glide.C5636l;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.p293a.C5661ad;
import com.bumptech.glide.load.p293a.C5662ae;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p299c.p302c.C5887e;
import com.bumptech.glide.p287f.p288a.C5571m;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.bumptech.glide.p287f.p289b.C5583g;
import com.bumptech.glide.p291h.C5632s;
import com.bumptech.glide.p291h.p292a.C5613i;
import com.bumptech.glide.p291h.p292a.C5614j;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.f.l */
/* compiled from: PG */
public final class C5595l implements C5588e, C5571m, C5594k {

    /* renamed from: a */
    private static final boolean f16896a = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    private int f16897A;

    /* renamed from: B */
    private boolean f16898B;

    /* renamed from: C */
    private RuntimeException f16899C;

    /* renamed from: D */
    private int f16900D;

    /* renamed from: b */
    private final String f16901b;

    /* renamed from: c */
    private final C5614j f16902c;

    /* renamed from: d */
    private final Object f16903d;

    /* renamed from: e */
    private final C5592i f16904e;

    /* renamed from: f */
    private final C5590g f16905f;

    /* renamed from: g */
    private final Context f16906g;

    /* renamed from: h */
    private final C5636l f16907h;

    /* renamed from: i */
    private final Object f16908i;

    /* renamed from: j */
    private final Class f16909j;

    /* renamed from: k */
    private final C5558a f16910k;

    /* renamed from: l */
    private final int f16911l;

    /* renamed from: m */
    private final int f16912m;

    /* renamed from: n */
    private final C5997p f16913n;

    /* renamed from: o */
    private final C5572n f16914o;

    /* renamed from: p */
    private final List f16915p;

    /* renamed from: q */
    private final C5583g f16916q;

    /* renamed from: r */
    private final Executor f16917r;

    /* renamed from: s */
    private C5679av f16918s;

    /* renamed from: t */
    private C5661ad f16919t;

    /* renamed from: u */
    private long f16920u;

    /* renamed from: v */
    private volatile C5662ae f16921v;

    /* renamed from: w */
    private Drawable f16922w;

    /* renamed from: x */
    private Drawable f16923x;

    /* renamed from: y */
    private Drawable f16924y;

    /* renamed from: z */
    private int f16925z;

    public C5595l(Context context, C5636l lVar, Object obj, Object obj2, Class cls, C5558a aVar, int i, int i2, C5997p pVar, C5572n nVar, C5592i iVar, List list, C5590g gVar, C5662ae aeVar, C5583g gVar2, Executor executor) {
        C5636l lVar2 = lVar;
        this.f16901b = f16896a ? String.valueOf(super.hashCode()) : null;
        this.f16902c = new C5613i();
        this.f16903d = obj;
        this.f16906g = context;
        this.f16907h = lVar2;
        this.f16908i = obj2;
        this.f16909j = cls;
        this.f16910k = aVar;
        this.f16911l = i;
        this.f16912m = i2;
        this.f16913n = pVar;
        this.f16914o = nVar;
        this.f16904e = iVar;
        this.f16915p = list;
        this.f16905f = gVar;
        this.f16921v = aeVar;
        this.f16916q = gVar2;
        this.f16917r = executor;
        this.f16900D = 1;
        if (this.f16899C == null && lVar2.f16998g.mo12437a(C5603h.class)) {
            this.f16899C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: h */
    private static int m14528h(int i, float f) {
        return i == Integer.MIN_VALUE ? LinearLayoutManager.INVALID_OFFSET : Math.round(f * ((float) i));
    }

    /* renamed from: i */
    private final Drawable m14529i() {
        if (this.f16924y == null) {
            this.f16924y = this.f16910k.f16828o;
        }
        return this.f16924y;
    }

    /* renamed from: o */
    private final Drawable m14530o() {
        int i;
        if (this.f16923x == null) {
            C5558a aVar = this.f16910k;
            Drawable drawable = aVar.f16820g;
            this.f16923x = drawable;
            if (drawable == null && (i = aVar.f16821h) > 0) {
                this.f16923x = m14531p(i);
            }
        }
        return this.f16923x;
    }

    /* renamed from: p */
    private final Drawable m14531p(int i) {
        Resources.Theme theme = this.f16906g.getTheme();
        C5636l lVar = this.f16907h;
        return C5887e.m15219a(lVar, lVar, i, theme);
    }

    /* renamed from: q */
    private final void m14532q() {
        if (this.f16898B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: r */
    private final void m14533r(String str) {
        String str2 = this.f16901b;
        Log.v("GlideRequest", str + " this: " + str2);
    }

    /* renamed from: s */
    private final boolean m14534s() {
        C5590g gVar = this.f16905f;
        return gVar == null || gVar.mo12020h(this);
    }

    /* renamed from: t */
    private final boolean m14535t() {
        C5590g gVar = this.f16905f;
        return gVar == null || !gVar.mo12013a().mo12022j();
    }

    /* renamed from: a */
    public final Object mo12037a() {
        this.f16902c.mo12057b();
        return this.f16903d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12014b() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f16903d
            monitor-enter(r0)
            r6.m14532q()     // Catch:{ all -> 0x00c4 }
            com.bumptech.glide.h.a.j r1 = r6.f16902c     // Catch:{ all -> 0x00c4 }
            r1.mo12057b()     // Catch:{ all -> 0x00c4 }
            long r1 = com.bumptech.glide.p291h.C5625l.m14593b()     // Catch:{ all -> 0x00c4 }
            r6.f16920u = r1     // Catch:{ all -> 0x00c4 }
            java.lang.Object r1 = r6.f16908i     // Catch:{ all -> 0x00c4 }
            r2 = 3
            if (r1 != 0) goto L_0x003f
            int r1 = r6.f16911l     // Catch:{ all -> 0x00c4 }
            int r3 = r6.f16912m     // Catch:{ all -> 0x00c4 }
            boolean r1 = com.bumptech.glide.p291h.C5632s.m14622o(r1, r3)     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x0028
            int r1 = r6.f16911l     // Catch:{ all -> 0x00c4 }
            r6.f16925z = r1     // Catch:{ all -> 0x00c4 }
            int r1 = r6.f16912m     // Catch:{ all -> 0x00c4 }
            r6.f16897A = r1     // Catch:{ all -> 0x00c4 }
        L_0x0028:
            android.graphics.drawable.Drawable r1 = r6.m14529i()     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x002f
            r2 = 5
        L_0x002f:
            com.bumptech.glide.load.a.ap r1 = new com.bumptech.glide.load.a.ap     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = "Received null model"
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00c4 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x00c4 }
            r6.mo12039e(r1, r2)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            return
        L_0x003f:
            int r1 = r6.f16900D     // Catch:{ all -> 0x00c4 }
            r3 = 2
            if (r1 == r3) goto L_0x00bc
            r4 = 4
            if (r1 == r4) goto L_0x00b3
            java.util.List r1 = r6.f16915p     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x0050:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r4 == 0) goto L_0x0065
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00c4 }
            com.bumptech.glide.f.i r4 = (com.bumptech.glide.p287f.C5592i) r4     // Catch:{ all -> 0x00c4 }
            boolean r5 = r4 instanceof com.bumptech.glide.p287f.C5586c     // Catch:{ all -> 0x00c4 }
            if (r5 != 0) goto L_0x0061
            goto L_0x0050
        L_0x0061:
            com.bumptech.glide.f.c r4 = (com.bumptech.glide.p287f.C5586c) r4     // Catch:{ all -> 0x00c4 }
            r1 = 0
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x0065:
            r6.f16900D = r2     // Catch:{ all -> 0x00c4 }
            int r1 = r6.f16911l     // Catch:{ all -> 0x00c4 }
            int r4 = r6.f16912m     // Catch:{ all -> 0x00c4 }
            boolean r1 = com.bumptech.glide.p291h.C5632s.m14622o(r1, r4)     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x0079
            int r1 = r6.f16911l     // Catch:{ all -> 0x00c4 }
            int r4 = r6.f16912m     // Catch:{ all -> 0x00c4 }
            r6.mo12006g(r1, r4)     // Catch:{ all -> 0x00c4 }
            goto L_0x007e
        L_0x0079:
            com.bumptech.glide.f.a.n r1 = r6.f16914o     // Catch:{ all -> 0x00c4 }
            r1.mo11995e(r6)     // Catch:{ all -> 0x00c4 }
        L_0x007e:
            int r1 = r6.f16900D     // Catch:{ all -> 0x00c4 }
            if (r1 == r3) goto L_0x0084
            if (r1 != r2) goto L_0x0093
        L_0x0084:
            boolean r1 = r6.m14534s()     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x0093
            com.bumptech.glide.f.a.n r1 = r6.f16914o     // Catch:{ all -> 0x00c4 }
            android.graphics.drawable.Drawable r2 = r6.m14530o()     // Catch:{ all -> 0x00c4 }
            r1.mo11991f(r2)     // Catch:{ all -> 0x00c4 }
        L_0x0093:
            boolean r1 = f16896a     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x00b1
            long r1 = r6.f16920u     // Catch:{ all -> 0x00c4 }
            double r1 = com.bumptech.glide.p291h.C5625l.m14592a(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r3.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = "finished run method in "
            r3.append(r4)     // Catch:{ all -> 0x00c4 }
            r3.append(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00c4 }
            r6.m14533r(r1)     // Catch:{ all -> 0x00c4 }
        L_0x00b1:
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            return
        L_0x00b3:
            com.bumptech.glide.load.a.av r1 = r6.f16918s     // Catch:{ all -> 0x00c4 }
            com.bumptech.glide.load.a r2 = com.bumptech.glide.load.C5637a.MEMORY_CACHE     // Catch:{ all -> 0x00c4 }
            r6.mo12038d(r1, r2)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            return
        L_0x00bc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00c4 }
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            goto L_0x00c8
        L_0x00c7:
            throw r1
        L_0x00c8:
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5595l.mo12014b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        r3.mo12163f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12015c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f16903d
            monitor-enter(r0)
            r6.m14532q()     // Catch:{ all -> 0x005a }
            com.bumptech.glide.h.a.j r1 = r6.f16902c     // Catch:{ all -> 0x005a }
            r1.mo12057b()     // Catch:{ all -> 0x005a }
            int r1 = r6.f16900D     // Catch:{ all -> 0x005a }
            r2 = 6
            if (r1 == r2) goto L_0x0058
            r6.m14532q()     // Catch:{ all -> 0x005a }
            com.bumptech.glide.h.a.j r1 = r6.f16902c     // Catch:{ all -> 0x005a }
            r1.mo12057b()     // Catch:{ all -> 0x005a }
            com.bumptech.glide.f.a.n r1 = r6.f16914o     // Catch:{ all -> 0x005a }
            r1.mo11996g(r6)     // Catch:{ all -> 0x005a }
            com.bumptech.glide.load.a.ad r1 = r6.f16919t     // Catch:{ all -> 0x005a }
            r3 = 0
            if (r1 == 0) goto L_0x0033
            com.bumptech.glide.load.a.ae r4 = r1.f17059c     // Catch:{ all -> 0x005a }
            monitor-enter(r4)     // Catch:{ all -> 0x005a }
            com.bumptech.glide.load.a.aj r5 = r1.f17057a     // Catch:{ all -> 0x0030 }
            com.bumptech.glide.f.k r1 = r1.f17058b     // Catch:{ all -> 0x0030 }
            r5.mo12154g(r1)     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            r6.f16919t = r3     // Catch:{ all -> 0x005a }
            goto L_0x0033
        L_0x0030:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x0033:
            com.bumptech.glide.load.a.av r1 = r6.f16918s     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x003a
            r6.f16918s = r3     // Catch:{ all -> 0x005a }
            r3 = r1
        L_0x003a:
            com.bumptech.glide.f.g r1 = r6.f16905f     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0044
            boolean r1 = r1.mo12019g(r6)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x004d
        L_0x0044:
            com.bumptech.glide.f.a.n r1 = r6.f16914o     // Catch:{ all -> 0x005a }
            android.graphics.drawable.Drawable r4 = r6.m14530o()     // Catch:{ all -> 0x005a }
            r1.mo11992fB(r4)     // Catch:{ all -> 0x005a }
        L_0x004d:
            r6.f16900D = r2     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x0057
            com.bumptech.glide.load.a.an r3 = (com.bumptech.glide.load.p293a.C5671an) r3
            r3.mo12163f()
        L_0x0057:
            return
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x005a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5595l.mo12015c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r0 = (com.bumptech.glide.load.p293a.C5671an) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r0.mo12163f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0197, code lost:
        r0 = (com.bumptech.glide.load.p293a.C5671an) r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125 A[Catch:{ all -> 0x0136, all -> 0x019e }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12038d(com.bumptech.glide.load.p293a.C5679av r17, com.bumptech.glide.load.C5637a r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "Finished loading "
            java.lang.String r3 = "Expected to receive an object of "
            java.lang.String r4 = "Expected to receive a Resource<R> with an object of "
            com.bumptech.glide.h.a.j r5 = r1.f16902c
            r5.mo12057b()
            r5 = 0
            java.lang.Object r6 = r1.f16903d     // Catch:{ all -> 0x01a5 }
            monitor-enter(r6)     // Catch:{ all -> 0x01a5 }
            r1.f16919t = r5     // Catch:{ all -> 0x019e }
            r7 = 5
            if (r2 != 0) goto L_0x003d
            com.bumptech.glide.load.a.ap r0 = new com.bumptech.glide.load.a.ap     // Catch:{ all -> 0x019e }
            java.lang.Class r2 = r1.f16909j     // Catch:{ all -> 0x019e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x019e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r3.<init>(r4)     // Catch:{ all -> 0x019e }
            r3.append(r2)     // Catch:{ all -> 0x019e }
            java.lang.String r2 = " inside, but instead got null."
            r3.append(r2)     // Catch:{ all -> 0x019e }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x019e }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x019e }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x019e }
            r1.mo12039e(r0, r7)     // Catch:{ all -> 0x019e }
            monitor-exit(r6)     // Catch:{ all -> 0x019e }
            return
        L_0x003d:
            java.lang.Object r4 = r17.mo12160c()     // Catch:{ all -> 0x019e }
            if (r4 == 0) goto L_0x013a
            java.lang.Class r8 = r1.f16909j     // Catch:{ all -> 0x019e }
            java.lang.Class r9 = r4.getClass()     // Catch:{ all -> 0x019e }
            boolean r8 = r8.isAssignableFrom(r9)     // Catch:{ all -> 0x019e }
            if (r8 != 0) goto L_0x0051
            goto L_0x013a
        L_0x0051:
            com.bumptech.glide.f.g r3 = r1.f16905f     // Catch:{ all -> 0x019e }
            r7 = 4
            if (r3 == 0) goto L_0x0069
            boolean r3 = r3.mo12021i(r1)     // Catch:{ all -> 0x019e }
            if (r3 == 0) goto L_0x005d
            goto L_0x0069
        L_0x005d:
            r1.f16918s = r5     // Catch:{ all -> 0x019c }
            r1.f16900D = r7     // Catch:{ all -> 0x019c }
            monitor-exit(r6)     // Catch:{ all -> 0x019c }
            r0 = r2
            com.bumptech.glide.load.a.an r0 = (com.bumptech.glide.load.p293a.C5671an) r0
        L_0x0065:
            r0.mo12163f()
            return
        L_0x0069:
            boolean r3 = r16.m14535t()     // Catch:{ all -> 0x019e }
            r1.f16900D = r7     // Catch:{ all -> 0x019e }
            r1.f16918s = r2     // Catch:{ all -> 0x019e }
            com.bumptech.glide.l r2 = r1.f16907h     // Catch:{ all -> 0x019e }
            int r2 = r2.f16999h     // Catch:{ all -> 0x019e }
            r7 = 3
            if (r2 > r7) goto L_0x00d2
            java.lang.Class r2 = r4.getClass()     // Catch:{ all -> 0x019e }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ all -> 0x019e }
            java.lang.String r7 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x019e }
            java.lang.Object r8 = r1.f16908i     // Catch:{ all -> 0x019e }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x019e }
            int r9 = r1.f16925z     // Catch:{ all -> 0x019e }
            int r10 = r1.f16897A     // Catch:{ all -> 0x019e }
            long r11 = r1.f16920u     // Catch:{ all -> 0x019e }
            double r11 = com.bumptech.glide.p291h.C5625l.m14592a(r11)     // Catch:{ all -> 0x019e }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r13.<init>(r0)     // Catch:{ all -> 0x019e }
            r13.append(r2)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = " from "
            r13.append(r0)     // Catch:{ all -> 0x019e }
            r13.append(r7)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = " for "
            r13.append(r0)     // Catch:{ all -> 0x019e }
            r13.append(r8)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = " with size ["
            r13.append(r0)     // Catch:{ all -> 0x019e }
            r13.append(r9)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "x"
            r13.append(r0)     // Catch:{ all -> 0x019e }
            r13.append(r10)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "] in "
            r13.append(r0)     // Catch:{ all -> 0x019e }
            r13.append(r11)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = " ms"
            r13.append(r0)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "Glide"
            java.lang.String r2 = r13.toString()     // Catch:{ all -> 0x019e }
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x019e }
        L_0x00d2:
            com.bumptech.glide.f.g r0 = r1.f16905f     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x00d9
            r0.mo12017e(r1)     // Catch:{ all -> 0x019e }
        L_0x00d9:
            r0 = 1
            r1.f16898B = r0     // Catch:{ all -> 0x019e }
            r2 = 0
            java.util.List r7 = r1.f16915p     // Catch:{ all -> 0x0136 }
            if (r7 == 0) goto L_0x010d
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0136 }
            r14 = 0
        L_0x00e6:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0136 }
            if (r8 == 0) goto L_0x010e
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0136 }
            r15 = r8
            com.bumptech.glide.f.i r15 = (com.bumptech.glide.p287f.C5592i) r15     // Catch:{ all -> 0x0136 }
            java.lang.Object r10 = r1.f16908i     // Catch:{ all -> 0x0136 }
            com.bumptech.glide.f.a.n r11 = r1.f16914o     // Catch:{ all -> 0x0136 }
            r8 = r15
            r9 = r4
            r12 = r18
            r13 = r3
            boolean r8 = r8.mo11906b(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0136 }
            r14 = r14 | r8
            boolean r8 = r15 instanceof com.bumptech.glide.p287f.C5586c     // Catch:{ all -> 0x0136 }
            if (r8 == 0) goto L_0x00e6
            com.bumptech.glide.f.c r15 = (com.bumptech.glide.p287f.C5586c) r15     // Catch:{ all -> 0x0136 }
            boolean r8 = r15.mo12030c()     // Catch:{ all -> 0x0136 }
            r14 = r14 | r8
            goto L_0x00e6
        L_0x010d:
            r14 = 0
        L_0x010e:
            com.bumptech.glide.f.i r8 = r1.f16904e     // Catch:{ all -> 0x0136 }
            if (r8 == 0) goto L_0x0121
            java.lang.Object r10 = r1.f16908i     // Catch:{ all -> 0x0136 }
            com.bumptech.glide.f.a.n r11 = r1.f16914o     // Catch:{ all -> 0x0136 }
            r9 = r4
            r12 = r18
            r13 = r3
            boolean r7 = r8.mo11906b(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0136 }
            if (r7 == 0) goto L_0x0121
            goto L_0x0122
        L_0x0121:
            r0 = 0
        L_0x0122:
            r0 = r0 | r14
            if (r0 != 0) goto L_0x0132
            com.bumptech.glide.f.b.g r0 = r1.f16916q     // Catch:{ all -> 0x0136 }
            r7 = r18
            com.bumptech.glide.f.b.f r0 = r0.mo12027a(r7, r3)     // Catch:{ all -> 0x0136 }
            com.bumptech.glide.f.a.n r3 = r1.f16914o     // Catch:{ all -> 0x0136 }
            r3.mo11861c(r4, r0)     // Catch:{ all -> 0x0136 }
        L_0x0132:
            r1.f16898B = r2     // Catch:{ all -> 0x019e }
            monitor-exit(r6)     // Catch:{ all -> 0x019e }
            return
        L_0x0136:
            r0 = move-exception
            r1.f16898B = r2     // Catch:{ all -> 0x019e }
            throw r0     // Catch:{ all -> 0x019e }
        L_0x013a:
            r1.f16918s = r5     // Catch:{ all -> 0x019c }
            com.bumptech.glide.load.a.ap r0 = new com.bumptech.glide.load.a.ap     // Catch:{ all -> 0x019c }
            java.lang.Class r5 = r1.f16909j     // Catch:{ all -> 0x019c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x019c }
            if (r4 == 0) goto L_0x014b
            java.lang.Class r8 = r4.getClass()     // Catch:{ all -> 0x019c }
            goto L_0x014d
        L_0x014b:
            java.lang.String r8 = ""
        L_0x014d:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x019c }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x019c }
            java.lang.String r10 = r17.toString()     // Catch:{ all -> 0x019c }
            if (r4 == 0) goto L_0x015e
            java.lang.String r4 = ""
            goto L_0x0160
        L_0x015e:
            java.lang.String r4 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x0160:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019c }
            r11.<init>(r3)     // Catch:{ all -> 0x019c }
            r11.append(r5)     // Catch:{ all -> 0x019c }
            java.lang.String r3 = " but instead got "
            r11.append(r3)     // Catch:{ all -> 0x019c }
            r11.append(r8)     // Catch:{ all -> 0x019c }
            java.lang.String r3 = "{"
            r11.append(r3)     // Catch:{ all -> 0x019c }
            r11.append(r9)     // Catch:{ all -> 0x019c }
            java.lang.String r3 = "} inside Resource{"
            r11.append(r3)     // Catch:{ all -> 0x019c }
            r11.append(r10)     // Catch:{ all -> 0x019c }
            java.lang.String r3 = "}."
            r11.append(r3)     // Catch:{ all -> 0x019c }
            r11.append(r4)     // Catch:{ all -> 0x019c }
            java.lang.String r3 = r11.toString()     // Catch:{ all -> 0x019c }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x019c }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x019c }
            r1.mo12039e(r0, r7)     // Catch:{ all -> 0x019c }
            monitor-exit(r6)     // Catch:{ all -> 0x019c }
            r0 = r2
            com.bumptech.glide.load.a.an r0 = (com.bumptech.glide.load.p293a.C5671an) r0
            goto L_0x0065
        L_0x019c:
            r0 = move-exception
            goto L_0x01a0
        L_0x019e:
            r0 = move-exception
            r2 = r5
        L_0x01a0:
            monitor-exit(r6)     // Catch:{ all -> 0x019c }
            throw r0     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r0 = move-exception
            r5 = r2
            goto L_0x01a6
        L_0x01a5:
            r0 = move-exception
        L_0x01a6:
            if (r5 == 0) goto L_0x01ad
            com.bumptech.glide.load.a.an r5 = (com.bumptech.glide.load.p293a.C5671an) r5
            r5.mo12163f()
        L_0x01ad:
            goto L_0x01af
        L_0x01ae:
            throw r0
        L_0x01af:
            goto L_0x01ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5595l.mo12038d(com.bumptech.glide.load.a.av, com.bumptech.glide.load.a):void");
    }

    /* renamed from: e */
    public final void mo12039e(C5673ap apVar, int i) {
        boolean z;
        int i2;
        this.f16902c.mo12057b();
        synchronized (this.f16903d) {
            if (this.f16907h.f16999h <= i) {
                String valueOf = String.valueOf(this.f16908i);
                int i3 = this.f16925z;
                int i4 = this.f16897A;
                Log.w("Glide", "Load failed for [" + valueOf + "] with dimensions [" + i3 + "x" + i4 + "]", apVar);
                apVar.mo12169b("Glide");
            }
            Drawable drawable = null;
            this.f16919t = null;
            this.f16900D = 5;
            C5590g gVar = this.f16905f;
            if (gVar != null) {
                gVar.mo12016d(this);
            }
            boolean z2 = true;
            this.f16898B = true;
            try {
                List<C5592i> list = this.f16915p;
                if (list != null) {
                    z = false;
                    for (C5592i a : list) {
                        z |= a.mo11905a(apVar, this.f16908i, this.f16914o, m14535t());
                    }
                } else {
                    z = false;
                }
                C5592i iVar = this.f16904e;
                if (iVar == null || !iVar.mo11905a(apVar, this.f16908i, this.f16914o, m14535t())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    if (m14534s()) {
                        if (this.f16908i == null) {
                            drawable = m14529i();
                        }
                        if (drawable == null) {
                            if (this.f16922w == null) {
                                C5558a aVar = this.f16910k;
                                Drawable drawable2 = aVar.f16818e;
                                this.f16922w = drawable2;
                                if (drawable2 == null && (i2 = aVar.f16819f) > 0) {
                                    this.f16922w = m14531p(i2);
                                }
                            }
                            drawable = this.f16922w;
                        }
                        if (drawable == null) {
                            drawable = m14530o();
                        }
                        this.f16914o.mo11859a(drawable);
                    }
                }
            } finally {
                this.f16898B = false;
            }
        }
    }

    /* renamed from: f */
    public final void mo12018f() {
        synchronized (this.f16903d) {
            if (mo12026n()) {
                mo12015c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r1.mo12038d(r9, com.bumptech.glide.load.C5637a.MEMORY_CACHE);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0210, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115 A[Catch:{ all -> 0x0213 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e3 A[Catch:{ all -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f3 A[Catch:{ all -> 0x0218, all -> 0x021e }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f8 A[Catch:{ all -> 0x0218, all -> 0x021e }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12006g(int r32, int r33) {
        /*
            r31 = this;
            r1 = r31
            java.lang.String r0 = "finished onSizeReady in "
            java.lang.String r2 = "finished setup for calling load in "
            java.lang.String r3 = "Got onSizeReady in "
            com.bumptech.glide.h.a.j r4 = r1.f16902c
            r4.mo12057b()
            java.lang.Object r4 = r1.f16903d
            monitor-enter(r4)
            boolean r5 = f16896a     // Catch:{ all -> 0x021e }
            if (r5 == 0) goto L_0x0029
            long r6 = r1.f16920u     // Catch:{ all -> 0x021e }
            double r6 = com.bumptech.glide.p291h.C5625l.m14592a(r6)     // Catch:{ all -> 0x021e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x021e }
            r8.<init>(r3)     // Catch:{ all -> 0x021e }
            r8.append(r6)     // Catch:{ all -> 0x021e }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x021e }
            r1.m14533r(r3)     // Catch:{ all -> 0x021e }
        L_0x0029:
            int r3 = r1.f16900D     // Catch:{ all -> 0x021e }
            r6 = 3
            if (r3 != r6) goto L_0x021c
            r3 = 2
            r1.f16900D = r3     // Catch:{ all -> 0x021e }
            com.bumptech.glide.f.a r6 = r1.f16910k     // Catch:{ all -> 0x021e }
            float r6 = r6.f16815b     // Catch:{ all -> 0x021e }
            r7 = r32
            int r7 = m14528h(r7, r6)     // Catch:{ all -> 0x021e }
            r1.f16925z = r7     // Catch:{ all -> 0x021e }
            r7 = r33
            int r6 = m14528h(r7, r6)     // Catch:{ all -> 0x021e }
            r1.f16897A = r6     // Catch:{ all -> 0x021e }
            if (r5 == 0) goto L_0x005c
            long r6 = r1.f16920u     // Catch:{ all -> 0x021e }
            double r6 = com.bumptech.glide.p291h.C5625l.m14592a(r6)     // Catch:{ all -> 0x021e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x021e }
            r8.<init>(r2)     // Catch:{ all -> 0x021e }
            r8.append(r6)     // Catch:{ all -> 0x021e }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x021e }
            r1.m14533r(r2)     // Catch:{ all -> 0x021e }
        L_0x005c:
            com.bumptech.glide.load.a.ae r2 = r1.f16921v     // Catch:{ all -> 0x021e }
            com.bumptech.glide.l r6 = r1.f16907h     // Catch:{ all -> 0x021e }
            java.lang.Object r15 = r1.f16908i     // Catch:{ all -> 0x021e }
            com.bumptech.glide.f.a r7 = r1.f16910k     // Catch:{ all -> 0x021e }
            com.bumptech.glide.load.n r14 = r7.f16825l     // Catch:{ all -> 0x021e }
            int r13 = r1.f16925z     // Catch:{ all -> 0x021e }
            int r12 = r1.f16897A     // Catch:{ all -> 0x021e }
            java.lang.Class r11 = r7.f16831r     // Catch:{ all -> 0x021e }
            java.lang.Class r10 = r1.f16909j     // Catch:{ all -> 0x021e }
            com.bumptech.glide.p r9 = r1.f16913n     // Catch:{ all -> 0x021e }
            com.bumptech.glide.load.a.x r8 = r7.f16816c     // Catch:{ all -> 0x021e }
            java.util.Map r3 = r7.f16830q     // Catch:{ all -> 0x021e }
            r16 = r0
            boolean r0 = r7.f16826m     // Catch:{ all -> 0x021e }
            r17 = r5
            boolean r5 = r7.f16835v     // Catch:{ all -> 0x021e }
            r32 = r5
            com.bumptech.glide.load.s r5 = r7.f16829p     // Catch:{ all -> 0x021e }
            r33 = r0
            boolean r0 = r7.f16822i     // Catch:{ all -> 0x021e }
            r18 = r6
            boolean r6 = r7.f16836w     // Catch:{ all -> 0x021e }
            boolean r7 = r7.f16834u     // Catch:{ all -> 0x021e }
            r19 = r6
            java.util.concurrent.Executor r6 = r1.f16917r     // Catch:{ all -> 0x021e }
            boolean r20 = com.bumptech.glide.load.p293a.C5662ae.f17060a     // Catch:{ all -> 0x021e }
            if (r20 == 0) goto L_0x0097
            long r20 = com.bumptech.glide.p291h.C5625l.m14593b()     // Catch:{ all -> 0x021e }
            goto L_0x0099
        L_0x0097:
            r20 = 0
        L_0x0099:
            r22 = r20
            com.bumptech.glide.load.a.al r1 = new com.bumptech.glide.load.a.al     // Catch:{ all -> 0x0218 }
            r20 = r6
            r6 = r7
            r7 = r1
            r24 = r8
            r8 = r15
            r25 = r9
            r9 = r14
            r21 = r10
            r10 = r13
            r26 = r11
            r11 = r12
            r27 = r12
            r12 = r3
            r28 = r3
            r3 = r13
            r13 = r26
            r29 = r3
            r3 = r14
            r14 = r21
            r30 = r3
            r3 = r15
            r15 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0218 }
            monitor-enter(r2)     // Catch:{ all -> 0x0218 }
            r7 = 1
            if (r0 != 0) goto L_0x00c9
            r11 = r22
        L_0x00c7:
            r9 = 0
            goto L_0x0113
        L_0x00c9:
            com.bumptech.glide.load.a.f r9 = r2.f17066g     // Catch:{ all -> 0x0213 }
            com.bumptech.glide.load.a.an r9 = r9.mo12221a(r1)     // Catch:{ all -> 0x0213 }
            if (r9 == 0) goto L_0x00d4
            r9.mo12161d()     // Catch:{ all -> 0x0213 }
        L_0x00d4:
            if (r9 == 0) goto L_0x00e5
            boolean r10 = com.bumptech.glide.load.p293a.C5662ae.f17060a     // Catch:{ all -> 0x0213 }
            if (r10 == 0) goto L_0x00e2
            java.lang.String r10 = "Loaded resource from active resources"
            r11 = r22
            com.bumptech.glide.load.p293a.C5662ae.m14701a(r10, r11, r1)     // Catch:{ all -> 0x0213 }
            goto L_0x0113
        L_0x00e2:
            r11 = r22
            goto L_0x0113
        L_0x00e5:
            r11 = r22
            com.bumptech.glide.load.a.b.k r9 = r2.f17067h     // Catch:{ all -> 0x0213 }
            com.bumptech.glide.load.a.av r9 = r9.mo12196b(r1)     // Catch:{ all -> 0x0213 }
            if (r9 != 0) goto L_0x00f1
            r9 = 0
            goto L_0x00fe
        L_0x00f1:
            boolean r10 = r9 instanceof com.bumptech.glide.load.p293a.C5671an     // Catch:{ all -> 0x0213 }
            if (r10 == 0) goto L_0x00f8
            com.bumptech.glide.load.a.an r9 = (com.bumptech.glide.load.p293a.C5671an) r9     // Catch:{ all -> 0x0213 }
            goto L_0x00fe
        L_0x00f8:
            com.bumptech.glide.load.a.an r10 = new com.bumptech.glide.load.a.an     // Catch:{ all -> 0x0213 }
            r10.<init>(r9, r7, r1, r2)     // Catch:{ all -> 0x0213 }
            r9 = r10
        L_0x00fe:
            if (r9 == 0) goto L_0x0108
            r9.mo12161d()     // Catch:{ all -> 0x0213 }
            com.bumptech.glide.load.a.f r10 = r2.f17066g     // Catch:{ all -> 0x0213 }
            r10.mo12222b(r1, r9)     // Catch:{ all -> 0x0213 }
        L_0x0108:
            if (r9 == 0) goto L_0x00c7
            boolean r10 = com.bumptech.glide.load.p293a.C5662ae.f17060a     // Catch:{ all -> 0x0213 }
            if (r10 == 0) goto L_0x0113
            java.lang.String r10 = "Loaded resource from cache"
            com.bumptech.glide.load.p293a.C5662ae.m14701a(r10, r11, r1)     // Catch:{ all -> 0x0213 }
        L_0x0113:
            if (r9 != 0) goto L_0x01e3
            com.bumptech.glide.load.a.ar r9 = r2.f17061b     // Catch:{ all -> 0x0213 }
            java.util.Map r9 = r9.mo12177a(r6)     // Catch:{ all -> 0x0213 }
            java.lang.Object r9 = r9.get(r1)     // Catch:{ all -> 0x0213 }
            com.bumptech.glide.load.a.aj r9 = (com.bumptech.glide.load.p293a.C5667aj) r9     // Catch:{ all -> 0x0213 }
            if (r9 == 0) goto L_0x013b
            r13 = r1
            r10 = r20
            r1 = r31
            r9.mo12150c(r1, r10)     // Catch:{ all -> 0x0211 }
            boolean r0 = com.bumptech.glide.load.p293a.C5662ae.f17060a     // Catch:{ all -> 0x0211 }
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = "Added to existing load"
            com.bumptech.glide.load.p293a.C5662ae.m14701a(r0, r11, r13)     // Catch:{ all -> 0x0211 }
        L_0x0134:
            com.bumptech.glide.load.a.ad r0 = new com.bumptech.glide.load.a.ad     // Catch:{ all -> 0x0211 }
            r0.<init>(r2, r1, r9)     // Catch:{ all -> 0x0211 }
            goto L_0x01e1
        L_0x013b:
            r13 = r1
            r10 = r20
            r1 = r31
            com.bumptech.glide.load.a.ab r9 = r2.f17062c     // Catch:{ all -> 0x0211 }
            androidx.core.i.f r9 = r9.f17054f     // Catch:{ all -> 0x0211 }
            java.lang.Object r9 = r9.mo5126a()     // Catch:{ all -> 0x0211 }
            com.bumptech.glide.load.a.aj r9 = (com.bumptech.glide.load.p293a.C5667aj) r9     // Catch:{ all -> 0x0211 }
            java.lang.String r14 = "Argument must not be null"
            com.bumptech.glide.p291h.C5630q.m14607d(r9, r14)     // Catch:{ all -> 0x0211 }
            r14 = r19
            r9.mo12156i(r13, r0, r14, r6)     // Catch:{ all -> 0x0211 }
            com.bumptech.glide.load.a.z r0 = r2.f17065f     // Catch:{ all -> 0x0211 }
            androidx.core.i.f r14 = r0.f17287a     // Catch:{ all -> 0x0211 }
            java.lang.Object r14 = r14.mo5126a()     // Catch:{ all -> 0x0211 }
            com.bumptech.glide.load.a.r r14 = (com.bumptech.glide.load.p293a.C5725r) r14     // Catch:{ all -> 0x0211 }
            java.lang.String r15 = "Argument must not be null"
            com.bumptech.glide.p291h.C5630q.m14607d(r14, r15)     // Catch:{ all -> 0x0211 }
            int r15 = r0.f17288b     // Catch:{ all -> 0x0211 }
            int r8 = r15 + 1
            r0.f17288b = r8     // Catch:{ all -> 0x0211 }
            com.bumptech.glide.load.a.m r0 = r14.f17251a     // Catch:{ all -> 0x0211 }
            com.bumptech.glide.load.a.ac r8 = r14.f17269s     // Catch:{ all -> 0x0211 }
            r7 = r18
            r0.f17224c = r7     // Catch:{ all -> 0x0211 }
            r0.f17225d = r3     // Catch:{ all -> 0x0211 }
            r3 = r30
            r0.f17234m = r3     // Catch:{ all -> 0x0211 }
            r22 = r11
            r11 = r29
            r0.f17226e = r11     // Catch:{ all -> 0x0211 }
            r12 = r27
            r0.f17227f = r12     // Catch:{ all -> 0x0211 }
            r1 = r24
            r0.f17236o = r1     // Catch:{ all -> 0x0213 }
            r18 = r10
            r10 = r26
            r0.f17228g = r10     // Catch:{ all -> 0x0213 }
            r0.f17239r = r8     // Catch:{ all -> 0x0213 }
            r8 = r21
            r0.f17231j = r8     // Catch:{ all -> 0x0213 }
            r8 = r25
            r0.f17235n = r8     // Catch:{ all -> 0x0213 }
            r0.f17229h = r5     // Catch:{ all -> 0x0213 }
            r10 = r28
            r0.f17230i = r10     // Catch:{ all -> 0x0213 }
            r10 = r33
            r0.f17237p = r10     // Catch:{ all -> 0x0213 }
            r10 = r32
            r0.f17238q = r10     // Catch:{ all -> 0x0213 }
            r14.f17254d = r7     // Catch:{ all -> 0x0213 }
            r14.f17255e = r3     // Catch:{ all -> 0x0213 }
            r14.f17256f = r8     // Catch:{ all -> 0x0213 }
            r14.f17257g = r13     // Catch:{ all -> 0x0213 }
            r14.f17258h = r11     // Catch:{ all -> 0x0213 }
            r14.f17259i = r12     // Catch:{ all -> 0x0213 }
            r14.f17260j = r1     // Catch:{ all -> 0x0213 }
            r14.f17264n = r6     // Catch:{ all -> 0x0213 }
            r14.f17261k = r5     // Catch:{ all -> 0x0213 }
            r14.f17262l = r9     // Catch:{ all -> 0x0213 }
            r14.f17263m = r15     // Catch:{ all -> 0x0213 }
            r0 = 1
            r14.f17268r = r0     // Catch:{ all -> 0x0213 }
            com.bumptech.glide.load.a.ar r0 = r2.f17061b     // Catch:{ all -> 0x0213 }
            boolean r1 = r9.f17081g     // Catch:{ all -> 0x0213 }
            java.util.Map r0 = r0.mo12177a(r1)     // Catch:{ all -> 0x0213 }
            r0.put(r13, r9)     // Catch:{ all -> 0x0213 }
            r1 = r31
            r0 = r18
            r9.mo12150c(r1, r0)     // Catch:{ all -> 0x0211 }
            r9.mo12155h(r14)     // Catch:{ all -> 0x0211 }
            boolean r0 = com.bumptech.glide.load.p293a.C5662ae.f17060a     // Catch:{ all -> 0x0211 }
            if (r0 == 0) goto L_0x01dc
            java.lang.String r0 = "Started new load"
            r5 = r22
            com.bumptech.glide.load.p293a.C5662ae.m14701a(r0, r5, r13)     // Catch:{ all -> 0x0211 }
        L_0x01dc:
            com.bumptech.glide.load.a.ad r0 = new com.bumptech.glide.load.a.ad     // Catch:{ all -> 0x0211 }
            r0.<init>(r2, r1, r9)     // Catch:{ all -> 0x0211 }
        L_0x01e1:
            monitor-exit(r2)     // Catch:{ all -> 0x0211 }
            goto L_0x01ec
        L_0x01e3:
            r1 = r31
            monitor-exit(r2)     // Catch:{ all -> 0x0211 }
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C5637a.MEMORY_CACHE     // Catch:{ all -> 0x021e }
            r1.mo12038d(r9, r0)     // Catch:{ all -> 0x021e }
            r0 = 0
        L_0x01ec:
            r1.f16919t = r0     // Catch:{ all -> 0x021e }
            int r0 = r1.f16900D     // Catch:{ all -> 0x021e }
            r2 = 2
            if (r0 == r2) goto L_0x01f6
            r0 = 0
            r1.f16919t = r0     // Catch:{ all -> 0x021e }
        L_0x01f6:
            if (r17 == 0) goto L_0x020f
            long r2 = r1.f16920u     // Catch:{ all -> 0x021e }
            double r2 = com.bumptech.glide.p291h.C5625l.m14592a(r2)     // Catch:{ all -> 0x021e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x021e }
            r5 = r16
            r0.<init>(r5)     // Catch:{ all -> 0x021e }
            r0.append(r2)     // Catch:{ all -> 0x021e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x021e }
            r1.m14533r(r0)     // Catch:{ all -> 0x021e }
        L_0x020f:
            monitor-exit(r4)     // Catch:{ all -> 0x021e }
            return
        L_0x0211:
            r0 = move-exception
            goto L_0x0216
        L_0x0213:
            r0 = move-exception
            r1 = r31
        L_0x0216:
            monitor-exit(r2)     // Catch:{ all -> 0x0211 }
            throw r0     // Catch:{ all -> 0x021e }
        L_0x0218:
            r0 = move-exception
            r1 = r31
            goto L_0x021f
        L_0x021c:
            monitor-exit(r4)     // Catch:{ all -> 0x021e }
            return
        L_0x021e:
            r0 = move-exception
        L_0x021f:
            monitor-exit(r4)     // Catch:{ all -> 0x021e }
            goto L_0x0222
        L_0x0221:
            throw r0
        L_0x0222:
            goto L_0x0221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5595l.mo12006g(int, int):void");
    }

    /* renamed from: j */
    public final boolean mo12022j() {
        boolean z;
        synchronized (this.f16903d) {
            z = this.f16900D == 4;
        }
        return z;
    }

    /* renamed from: k */
    public final boolean mo12023k() {
        boolean z;
        synchronized (this.f16903d) {
            z = this.f16900D == 6;
        }
        return z;
    }

    /* renamed from: l */
    public final boolean mo12024l() {
        boolean z;
        synchronized (this.f16903d) {
            z = this.f16900D == 4;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo12025m(C5588e eVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        C5558a aVar;
        C5997p pVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        C5558a aVar2;
        C5997p pVar2;
        int size2;
        C5588e eVar2 = eVar;
        if (!(eVar2 instanceof C5595l)) {
            return false;
        }
        synchronized (this.f16903d) {
            i = this.f16911l;
            i2 = this.f16912m;
            obj = this.f16908i;
            cls = this.f16909j;
            aVar = this.f16910k;
            pVar = this.f16913n;
            List list = this.f16915p;
            size = list != null ? list.size() : 0;
        }
        C5595l lVar = (C5595l) eVar2;
        synchronized (lVar.f16903d) {
            i3 = lVar.f16911l;
            i4 = lVar.f16912m;
            obj2 = lVar.f16908i;
            cls2 = lVar.f16909j;
            aVar2 = lVar.f16910k;
            pVar2 = lVar.f16913n;
            List list2 = lVar.f16915p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && C5632s.m14618k(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && pVar == pVar2 && size == size2;
    }

    /* renamed from: n */
    public final boolean mo12026n() {
        boolean z;
        synchronized (this.f16903d) {
            int i = this.f16900D;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f16903d) {
            obj = this.f16908i;
            cls = this.f16909j;
        }
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        String obj3 = cls.toString();
        return obj2 + "[model=" + valueOf + ", transcodeClass=" + obj3 + "]";
    }
}
