package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90432m;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90433n;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95516af;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95518ah;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95519ai;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95580aa;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95600au;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7504f.C95638b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95318x;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60251ly;
import com.google.common.p4552o.C60261mb;
import com.google.common.p4552o.C60298nk;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.f */
/* compiled from: PG */
public final class C95682f extends C95691o {

    /* renamed from: b */
    private static final C59071e f267857b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.i.f");

    /* renamed from: c */
    private static final long f267858c = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: d */
    private final Object f267859d = new Object();

    /* renamed from: e */
    private final C95638b f267860e;

    /* renamed from: f */
    private final C95293ae f267861f;

    /* renamed from: g */
    private final List f267862g;

    /* renamed from: h */
    private int f267863h = 0;

    /* renamed from: i */
    private boolean f267864i = false;

    /* renamed from: j */
    private long f267865j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95682f(C95598as asVar, C95706l lVar, C95293ae aeVar, C95600au auVar, C95638b bVar, C68214a aVar, C68214a aVar2, C89656k kVar, C95307m mVar, C21370a aVar3, C95692p pVar) {
        super(asVar, 1, lVar, aeVar, auVar, aVar, aVar2, kVar, mVar, aVar3, pVar);
        C95293ae aeVar2 = aeVar;
        this.f267860e = bVar;
        this.f267861f = aeVar2;
        long millis = TimeUnit.SECONDS.toMillis(kVar.mo83546a("recent_notifs_period_sec"));
        if (aeVar2.f266622d != null) {
            C58480gp gpVar = new C58480gp(4);
            gpVar.mo55395g(7);
            gpVar.mo55395g(9);
            gpVar.mo55395g(10);
            gpVar.mo55395g(11);
            C58485gu f = gpVar.mo55394f();
            int i = ((C58724pq) f).f156474d;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    Long h = C95293ae.m157512h(((Integer) f.get(i2)).intValue(), aeVar2.f266622d);
                    if (h != null && aeVar2.f266623e.mo26870b() - h.longValue() <= millis) {
                        break;
                    }
                    i2++;
                } else {
                    C58480gp gpVar2 = new C58480gp(4);
                    gpVar2.mo55395g(4);
                    gpVar2.mo55395g(6);
                    gpVar2.mo55395g(5);
                    C58485gu f2 = gpVar2.mo55394f();
                    int i3 = ((C58724pq) f2).f156474d;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            break;
                        }
                        Integer num = (Integer) f2.get(i4);
                        Long h2 = C95293ae.m157512h(num.intValue(), aeVar2.f266622d);
                        if (h2 != null && aeVar2.f266623e.mo26870b() - h2.longValue() <= millis) {
                            int intValue = num.intValue();
                            int c = aeVar2.mo89212c(intValue);
                            Integer num2 = null;
                            if (c != 0) {
                                C95318x xVar = (C95318x) aeVar2.f266621c.get(Integer.valueOf(intValue));
                                if (xVar == null) {
                                    C59104x d = C95293ae.f266614a.mo56226d();
                                    d.mo56378ag(C58975e.f156826a, "EduPromptHelper");
                                    ((C59052c) ((C59052c) d).mo56372aa(14888)).mo56386p("No prompt");
                                    int i5 = C90755l.f253831a;
                                } else {
                                    num2 = xVar.mo89249a(c - 1);
                                }
                            }
                            if (num2 != null && num2.intValue() <= 2) {
                                break;
                            }
                        }
                        i4++;
                    }
                }
            }
            millis += f267858c;
        }
        long j = millis;
        C58976aa aaVar = C58975e.f156826a;
        this.f267862g = new ArrayList();
        C95598as asVar2 = asVar;
        List c2 = asVar2.mo89540c(new C95580aa(j));
        c2.size();
        List a = C95519ai.m158013a(c2, asVar2, lVar, aeVar, auVar, aVar, aVar2, kVar, mVar, aVar3);
        a.size();
        Collections.sort(a, new C95681e(aVar3.mo26870b() - j));
        int i6 = 0;
        while (i6 < a.size()) {
            C95515ae aeVar3 = (C95515ae) a.get(i6);
            C90433n nVar = ((C90421b) aeVar3.mo89414r().get(0)).f252594o;
            if (nVar != null) {
                Integer a2 = nVar.mo84166a();
                aeVar3.mo89408W(C95516af.m158009a(aeVar3.mo89405R(), aeVar3.mo89404Q(), a2 != null && a2.intValue() == 5 && i6 == 0));
                long b = aVar3.mo26870b() - C95518ah.m158012b(aeVar3);
                if (b < this.f267865j) {
                    this.f267865j = b;
                }
                this.f267862g.add(aeVar3);
            } else {
                C59104x d2 = f267857b.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ExpandAnnouncementSrc");
                ((C59052c) ((C59052c) d2).mo56372aa(16348)).mo56386p("Ignoring notification without playback state.");
            }
            i6++;
        }
        a.size();
    }

    /* renamed from: t */
    public static long m158413t(C95515ae aeVar) {
        Long l;
        C90432m mVar;
        long j = 0;
        for (C90421b bVar : aeVar.mo89414r()) {
            C90433n nVar = bVar.f252594o;
            if (nVar != null) {
                int size = nVar.f252642b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        l = null;
                        break;
                    }
                    mVar = (C90432m) nVar.f252642b.get(size);
                    if (mVar.f252639c) {
                        int i = mVar.f252637a;
                        if (C90433n.m147108k(i) || i == 2) {
                            l = Long.valueOf(mVar.f252638b);
                        }
                    }
                }
                l = Long.valueOf(mVar.f252638b);
                if (l != null) {
                    j = Math.max(j, l.longValue());
                }
            }
        }
        return j;
    }

    /* renamed from: b */
    public final C94640d mo88583b() {
        synchronized (this.f267859d) {
            if (this.f267863h >= this.f267862g.size()) {
                return null;
            }
            C94640d dVar = (C94640d) this.f267862g.get(this.f267863h);
            return dVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        return true;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88594m() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f267859d
            monitor-enter(r0)
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ab }
            boolean r1 = r6.mo89638w()     // Catch:{ all -> 0x00ab }
            r2 = 0
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            return r2
        L_0x000e:
            boolean r1 = r6.mo89641y()     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x001a
            boolean r1 = super.mo88594m()     // Catch:{ all -> 0x00ab }
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            return r1
        L_0x001a:
            boolean r1 = r6.f267864i     // Catch:{ all -> 0x00ab }
            r3 = 1
            if (r1 != 0) goto L_0x00a4
            r6.f267864i = r3     // Catch:{ all -> 0x00ab }
            java.util.List r1 = r6.f267862g     // Catch:{ all -> 0x00ab }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x002b
            goto L_0x00a9
        L_0x002b:
            java.util.List r1 = r6.f267862g     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00ab }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ae r1 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae) r1     // Catch:{ all -> 0x00ab }
            java.util.List r4 = r1.mo89414r()     // Catch:{ all -> 0x00ab }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ all -> 0x00ab }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r2 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r2     // Catch:{ all -> 0x00ab }
            com.google.android.apps.gsa.shared.notificationlistening.common.n r2 = r2.f252594o     // Catch:{ all -> 0x00ab }
            if (r2 != 0) goto L_0x0056
            com.google.common.f.e r1 = f267857b     // Catch:{ all -> 0x00ab }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x00ab }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "ExpandAnnouncementSrc"
            r1.mo56378ag(r2, r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "Missing playback state"
            r4 = 16349(0x3fdd, float:2.291E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x0056:
            java.lang.Integer r2 = r2.mo84166a()     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x00a9
            int r4 = r2.intValue()     // Catch:{ all -> 0x00ab }
            r5 = 7
            if (r4 != r3) goto L_0x0069
            com.google.android.apps.gsa.staticplugins.bisto.f.ae r1 = r6.f267861f     // Catch:{ all -> 0x00ab }
            r1.mo89218k(r5)     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x0069:
            boolean r4 = r1 instanceof com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95541p     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x0078
            int r1 = r2.intValue()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x0076
            r1 = 11
            goto L_0x0091
        L_0x0076:
            r1 = 6
            goto L_0x0091
        L_0x0078:
            boolean r1 = r1 instanceof com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95551z     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x0087
            int r1 = r2.intValue()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x0085
            r1 = 9
            goto L_0x0091
        L_0x0085:
            r1 = 4
            goto L_0x0091
        L_0x0087:
            int r1 = r2.intValue()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x0090
            r1 = 10
            goto L_0x0091
        L_0x0090:
            r1 = 5
        L_0x0091:
            com.google.android.apps.gsa.staticplugins.bisto.f.ae r2 = r6.f267861f     // Catch:{ all -> 0x00ab }
            r2.mo89218k(r1)     // Catch:{ all -> 0x00ab }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.f.b r1 = r6.f267860e     // Catch:{ all -> 0x00ab }
            boolean r1 = r1.mo89602a()     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x00a9
            com.google.android.apps.gsa.staticplugins.bisto.f.ae r1 = r6.f267861f     // Catch:{ all -> 0x00ab }
            r1.mo89218k(r5)     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x00a4:
            int r1 = r6.f267863h     // Catch:{ all -> 0x00ab }
            int r1 = r1 + r3
            r6.f267863h = r1     // Catch:{ all -> 0x00ab }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            return r3
        L_0x00ab:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95682f.mo88594m():boolean");
    }

    /* renamed from: u */
    public final C60298nk mo89636u(int i) {
        C60251ly lyVar = (C60251ly) C60261mb.f163036g.createBuilder();
        lyVar.copyOnWrite();
        C60261mb mbVar = (C60261mb) lyVar.instance;
        mbVar.f163043f = 2;
        mbVar.f163038a |= 512;
        C60298nk u = super.mo89636u(i);
        u.mo57080a((C60261mb) lyVar.build());
        return u;
    }

    /* renamed from: v */
    public final List mo89637v() {
        return new ArrayList(this.f267862g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        return r2;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89638w() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f267859d
            monitor-enter(r0)
            boolean r1 = r4.mo89641y()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000f
            boolean r1 = super.mo89638w()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x000f:
            boolean r1 = r4.f267864i     // Catch:{ all -> 0x002c }
            r2 = 1
            if (r1 != 0) goto L_0x001c
            java.util.List r1 = r4.f267862g     // Catch:{ all -> 0x002c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
        L_0x001c:
            int r1 = r4.f267863h     // Catch:{ all -> 0x002c }
            java.util.List r3 = r4.f267862g     // Catch:{ all -> 0x002c }
            int r3 = r3.size()     // Catch:{ all -> 0x002c }
            int r3 = r3 + -1
            if (r1 >= r3) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95682f.mo89638w():boolean");
    }
}
