package com.google.android.play.core.p3538g.p3541c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.play.core.p3527b.p3528a.C45050a;
import com.google.android.play.core.p3534f.C45096d;
import com.google.android.play.core.p3538g.C45137aw;
import com.google.android.play.core.p3538g.C45140az;
import com.google.android.play.core.p3538g.C45169d;
import com.google.android.play.core.p3538g.C45172g;
import com.google.android.play.core.p3538g.C45176k;
import com.google.android.play.core.p3538g.C45179n;
import com.google.android.play.core.p3538g.C45181p;
import com.google.android.play.core.p3538g.C45187v;
import com.google.android.play.core.p3542h.C45193b;
import dagger.C68214a;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.g.c.n */
/* compiled from: PG */
public final class C45160n implements C45187v {

    /* renamed from: a */
    public static final long f117884a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    public final Context f117885b;

    /* renamed from: c */
    public final C45050a f117886c;

    /* renamed from: d */
    public final C45050a f117887d;

    /* renamed from: e */
    public final Executor f117888e;

    /* renamed from: f */
    public final C45169d f117889f;

    /* renamed from: g */
    public final AtomicBoolean f117890g = new AtomicBoolean(false);

    /* renamed from: h */
    private final Handler f117891h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private final C45181p f117892i;

    /* renamed from: j */
    private final C68214a f117893j;

    /* renamed from: k */
    private final C45193b f117894k;

    /* renamed from: l */
    private final File f117895l;

    /* renamed from: m */
    private final AtomicReference f117896m = new AtomicReference();

    /* renamed from: n */
    private final Set f117897n = Collections.synchronizedSet(new HashSet());

    /* renamed from: o */
    private final Set f117898o = Collections.synchronizedSet(new HashSet());

    public C45160n(Context context, File file, C45181p pVar, C68214a aVar) {
        Executor a = C45096d.m80265a();
        C45193b bVar = new C45193b(context);
        this.f117885b = context;
        this.f117895l = file;
        this.f117892i = pVar;
        this.f117893j = aVar;
        this.f117888e = a;
        this.f117894k = bVar;
        this.f117887d = new C45050a();
        this.f117886c = new C45050a();
        this.f117889f = C45176k.f117918a;
    }

    /* renamed from: k */
    public static String m80386k(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: o */
    private final C146006ab m80387o(int i) {
        m80389q(new C45157k(i));
        return C146021aq.m237849c(new C45179n(i));
    }

    /* renamed from: p */
    private final C45172g m80388p() {
        C45172g a = this.f117892i.mo49012a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    /* renamed from: q */
    private final synchronized C45137aw m80389q(C45159m mVar) {
        C45137aw j = mo49003j();
        C45137aw a = mVar.mo48989a(j);
        AtomicReference atomicReference = this.f117896m;
        while (!atomicReference.compareAndSet(j, a)) {
            if (atomicReference.get() != j) {
                return null;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final C146006ab mo48994a(List list) {
        return C146021aq.m237849c(new C45179n(-5));
    }

    /* renamed from: b */
    public final C146006ab mo48995b(List list) {
        return C146021aq.m237849c(new C45179n(-5));
    }

    /* renamed from: c */
    public final C146006ab mo48996c(List list) {
        return C146021aq.m237849c(new C45179n(-5));
    }

    /* renamed from: d */
    public final C146006ab mo48997d(List list) {
        return C146021aq.m237849c(new C45179n(-5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016c, code lost:
        if (r5.contains(r13) == false) goto L_0x017b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.C146006ab mo48998e(com.google.android.play.core.p3538g.C45122ah r25) {
        /*
            r24 = this;
            r9 = r24
            r0 = r25
            com.google.android.play.core.g.c.g r3 = new com.google.android.play.core.g.c.g     // Catch:{ da -> 0x0288 }
            r3.<init>(r0)     // Catch:{ da -> 0x0288 }
            com.google.android.play.core.g.aw r3 = r9.m80389q(r3)     // Catch:{ da -> 0x0288 }
            if (r3 == 0) goto L_0x0281
            int r3 = r3.mo48946b()     // Catch:{ da -> 0x0288 }
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r4 = r0.f117808b
            java.util.Iterator r4 = r4.iterator()
        L_0x001e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0032
            java.lang.Object r5 = r4.next()
            java.util.Locale r5 = (java.util.Locale) r5
            java.lang.String r5 = r5.getLanguage()
            r10.add(r5)
            goto L_0x001e
        L_0x0032:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.io.File r5 = r9.f117895l
            com.google.android.play.core.g.c.h r6 = com.google.android.play.core.p3538g.p3541c.C45154h.f117871a
            java.io.File[] r5 = r5.listFiles(r6)
            java.lang.String r6 = "FakeSplitInstallManager"
            if (r5 != 0) goto L_0x0053
            java.lang.String r0 = "Specified splits directory does not exist."
            android.util.Log.w(r6, r0)
            r0 = -5
            com.google.android.gms.tasks.ab r0 = r9.m80387o(r0)
            return r0
        L_0x0053:
            int r7 = r5.length
            r8 = 0
            r14 = 0
        L_0x0057:
            if (r8 >= r7) goto L_0x01de
            r12 = r5[r8]
            java.lang.String r13 = com.google.android.play.core.p3542h.C45196e.m80474a(r12)
            java.lang.String r1 = m80386k(r13)
            r4.add(r13)
            java.util.List r2 = r0.f117807a
            boolean r1 = r2.contains(r1)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x016f
            java.lang.String r1 = m80386k(r13)
            r16 = r5
            java.util.HashSet r5 = new java.util.HashSet
            r17 = r7
            com.google.android.play.core.h.b r7 = r9.f117894k
            android.content.Context r7 = r7.f117950a
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            android.os.LocaleList r7 = r7.getLocales()
            r18 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r19 = r6
            int r6 = r7.size()
            r3.<init>(r6)
            r20 = r4
            r6 = 0
        L_0x009a:
            int r4 = r7.size()
            r21 = r8
            java.lang.String r8 = "_"
            if (r6 >= r4) goto L_0x00d4
            java.util.Locale r4 = r7.get(r6)
            java.lang.String r22 = r4.getLanguage()
            java.lang.String r23 = r4.getCountry()
            boolean r23 = r23.isEmpty()
            if (r23 == 0) goto L_0x00b8
            r4 = r2
            goto L_0x00c4
        L_0x00b8:
            java.lang.String r4 = r4.getCountry()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r8.concat(r4)
        L_0x00c4:
            java.lang.String r8 = java.lang.String.valueOf(r22)
            java.lang.String r4 = r8.concat(r4)
            r3.add(r4)
            int r6 = r6 + 1
            r8 = r21
            goto L_0x009a
        L_0x00d4:
            r5.<init>(r3)
            com.google.android.play.core.g.g r3 = r24.m80388p()
            r4 = 1
            java.lang.String[] r6 = new java.lang.String[r4]
            r4 = 0
            r6[r4] = r1
            java.util.List r1 = java.util.Arrays.asList(r6)
            java.util.Map r1 = r3.mo49011a(r1)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Collection r4 = r1.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x00f6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0106
            java.lang.Object r6 = r4.next()
            java.util.Set r6 = (java.util.Set) r6
            r3.addAll(r6)
            goto L_0x00f6
        L_0x0106:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x010f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x012d
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r6.contains(r8)
            if (r7 == 0) goto L_0x0129
            r7 = -1
            java.lang.String[] r6 = r6.split(r8, r7)
            r7 = 0
            r6 = r6[r7]
        L_0x0129:
            r4.add(r6)
            goto L_0x010f
        L_0x012d:
            java.util.Set r5 = r9.f117898o
            r4.addAll(r5)
            r4.addAll(r10)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0142:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0162
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            boolean r7 = r4.contains(r7)
            if (r7 == 0) goto L_0x0142
            java.lang.Object r6 = r6.getValue()
            java.util.Collection r6 = (java.util.Collection) r6
            r5.addAll(r6)
            goto L_0x0142
        L_0x0162:
            boolean r1 = r3.contains(r13)
            if (r1 == 0) goto L_0x01c8
            boolean r1 = r5.contains(r13)
            if (r1 == 0) goto L_0x017b
            goto L_0x01c8
        L_0x016f:
            r18 = r3
            r20 = r4
            r16 = r5
            r19 = r6
            r17 = r7
            r21 = r8
        L_0x017b:
            java.util.List r1 = r0.f117808b
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Set r4 = r9.f117897n
            r3.<init>(r4)
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            r4[r5] = r2
            java.lang.String r2 = "base"
            r5 = 1
            r4[r5] = r2
            java.util.List r2 = java.util.Arrays.asList(r4)
            r3.addAll(r2)
            com.google.android.play.core.g.g r2 = r24.m80388p()
            java.util.Map r2 = r2.mo49011a(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x01a2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01d0
            java.lang.Object r3 = r1.next()
            java.util.Locale r3 = (java.util.Locale) r3
            java.lang.String r4 = r3.getLanguage()
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L_0x01a2
            java.lang.String r3 = r3.getLanguage()
            java.lang.Object r3 = r2.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            boolean r3 = r3.contains(r13)
            if (r3 == 0) goto L_0x01a2
        L_0x01c8:
            long r1 = r12.length()
            long r14 = r14 + r1
            r11.add(r12)
        L_0x01d0:
            int r8 = r21 + 1
            r5 = r16
            r7 = r17
            r3 = r18
            r6 = r19
            r4 = r20
            goto L_0x0057
        L_0x01de:
            r18 = r3
            r20 = r4
            r19 = r6
            java.lang.String r1 = r20.toString()
            java.util.List r2 = r0.f117807a
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "availableSplits "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " want "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r2 = r19
            android.util.Log.i(r2, r1)
            java.util.List r1 = r0.f117807a
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L_0x022d
            dagger.a r1 = r9.f117893j
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.play.core.g.c.q r1 = (com.google.android.play.core.p3538g.p3541c.C45163q) r1
            java.util.Map r1 = r1.mo48983b()
            java.util.List r2 = r0.f117807a
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0239
        L_0x022d:
            dagger.a r1 = r9.f117893j
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.play.core.g.c.q r1 = (com.google.android.play.core.p3538g.p3541c.C45163q) r1
            java.lang.Integer r1 = r1.mo48982a()
        L_0x0239:
            if (r1 == 0) goto L_0x0244
            int r0 = r1.intValue()
            com.google.android.gms.tasks.ab r0 = r9.m80387o(r0)
            return r0
        L_0x0244:
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List r2 = r0.f117807a
            r1.<init>(r2)
            r2 = r20
            boolean r1 = r2.containsAll(r1)
            if (r1 != 0) goto L_0x0259
            r0 = -2
            com.google.android.gms.tasks.ab r0 = r9.m80387o(r0)
            return r0
        L_0x0259:
            r1 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            java.util.List r6 = r0.f117807a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r2 = 1
            r3 = 0
            r1 = r24
            r7 = r0
            r8 = r10
            r1.mo49006n(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r1 = r9.f117888e
            com.google.android.play.core.g.c.i r2 = new com.google.android.play.core.g.c.i
            r2.<init>(r9, r11, r10)
            r1.execute(r2)
            com.google.android.gms.tasks.ab r0 = com.google.android.gms.tasks.C146021aq.m237850d(r0)
            return r0
        L_0x0281:
            r0 = -100
            com.google.android.gms.tasks.ab r0 = r9.m80387o(r0)     // Catch:{ da -> 0x0288 }
            return r0
        L_0x0288:
            r0 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class<com.google.android.play.core.g.n> r3 = com.google.android.play.core.p3538g.C45179n.class
            r4 = 0
            r2[r4] = r3
            r4 = 0
        L_0x0292:
            if (r4 > 0) goto L_0x02a8
            r5 = r2[r4]
            java.lang.Class<java.lang.RuntimeException> r6 = java.lang.RuntimeException.class
            boolean r6 = r6.isAssignableFrom(r5)
            r6 = r6 ^ r1
            java.lang.String r1 = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s"
            java.lang.String r7 = "getCause"
            com.google.common.base.C58838bb.m90879n(r6, r1, r7, r5)
            int r4 = r4 + 1
            r1 = 1
            goto L_0x0292
        L_0x02a8:
            java.lang.Exception r1 = r0.getCause()
            boolean r1 = r3.isInstance(r1)
            if (r1 == 0) goto L_0x02c7
            java.lang.Exception r0 = r0.getCause()
            java.lang.Object r0 = r3.cast(r0)
            java.lang.Exception r0 = (java.lang.Exception) r0
            com.google.android.play.core.g.n r0 = (com.google.android.play.core.p3538g.C45179n) r0
            com.google.android.gms.common.api.Status r0 = r0.f389919a
            int r0 = r0.f389621g
            com.google.android.gms.tasks.ab r0 = r9.m80387o(r0)
            return r0
        L_0x02c7:
            java.lang.Exception r0 = r0.getCause()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            java.lang.String r3 = "getCause(%s) doesn't match underlying exception"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r2.<init>(r1)
            r2.initCause(r0)
            goto L_0x02e1
        L_0x02e0:
            throw r2
        L_0x02e1:
            goto L_0x02e0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3538g.p3541c.C45160n.mo48998e(com.google.android.play.core.g.ah):com.google.android.gms.tasks.ab");
    }

    /* renamed from: f */
    public final Set mo48999f() {
        HashSet hashSet = new HashSet();
        if (this.f117892i.mo49014d() != null) {
            hashSet.addAll(this.f117892i.mo49014d());
        }
        hashSet.addAll(this.f117898o);
        return hashSet;
    }

    /* renamed from: g */
    public final Set mo49000g() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f117892i.mo49013c());
        hashSet.addAll(this.f117897n);
        return hashSet;
    }

    /* renamed from: h */
    public final void mo49001h(C45140az azVar) {
        this.f117887d.mo48876a(azVar);
    }

    /* renamed from: i */
    public final void mo49002i(C45140az azVar) {
        this.f117887d.mo48877b(azVar);
    }

    /* renamed from: j */
    public final C45137aw mo49003j() {
        return (C45137aw) this.f117896m.get();
    }

    /* renamed from: l */
    public final void mo49004l(List list, List list2, List list3, long j, boolean z) {
        List list4 = list;
        this.f117889f.mo49010a().mo48917b(list, new C45158l(this, list2, list3, j, z, list));
    }

    /* renamed from: m */
    public final void mo49005m(List list, List list2, long j) {
        this.f117897n.addAll(list);
        this.f117898o.addAll(list2);
        Long valueOf = Long.valueOf(j);
        mo49006n(5, 0, valueOf, valueOf, (List) null, (Integer) null, (List) null);
    }

    /* renamed from: n */
    public final void mo49006n(int i, int i2, Long l, Long l2, List list, Integer num, List list2) {
        C45137aw q = m80389q(new C45151e(num, i, i2, l, l2, list, list2));
        if (q != null) {
            this.f117891h.post(new C45150d(this, q));
        }
    }
}
