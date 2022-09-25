package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i;

import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95538m;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95600au;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60251ly;
import com.google.common.p4552o.C60261mb;
import com.google.common.p4552o.C60298nk;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.k */
/* compiled from: PG */
public final class C95687k extends C95691o {

    /* renamed from: b */
    private final Object f267871b = new Object();

    /* renamed from: c */
    private final Context f267872c;

    /* renamed from: d */
    private final List f267873d;

    /* renamed from: e */
    private final List f267874e;

    /* renamed from: f */
    private final C95307m f267875f;

    /* renamed from: g */
    private final C21370a f267876g;

    /* renamed from: h */
    private int f267877h = 0;

    /* renamed from: i */
    private boolean f267878i;

    /* renamed from: j */
    private boolean f267879j;

    /* renamed from: k */
    private C94640d f267880k;

    /* renamed from: l */
    private int f267881l = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95687k(Context context, C95598as asVar, List list, List list2, C95706l lVar, C95293ae aeVar, C95600au auVar, C68214a aVar, C68214a aVar2, C89656k kVar, C95307m mVar, C21370a aVar3, C95692p pVar) {
        super(asVar, 1, lVar, aeVar, auVar, aVar, aVar2, kVar, mVar, aVar3, pVar);
        this.f267872c = context;
        ArrayList<C95538m> arrayList = new ArrayList<>(list);
        this.f267873d = arrayList;
        ArrayList arrayList2 = new ArrayList(list2);
        this.f267874e = arrayList2;
        this.f267875f = mVar;
        this.f267876g = aVar3;
        String i = aeVar.mo89216i(context, 3);
        if (i != null && ((C95645a) pVar).f267691a && super.mo89637v().size() >= 2) {
            arrayList.add(new C95686j(new C95685i(context, mVar, aVar3, i, aeVar, i)));
        }
        C58976aa aaVar = C58975e.f156826a;
        arrayList.size();
        arrayList2.size();
        for (C95538m b : arrayList) {
            b.mo89394b();
        }
        for (C95538m b2 : this.f267874e) {
            b2.mo89394b();
        }
    }

    /* renamed from: t */
    private final boolean m158425t() {
        boolean z;
        synchronized (this.f267871b) {
            z = false;
            if (!this.f267878i && !this.f267879j && mo89642z()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final C94640d mo88583b() {
        synchronized (this.f267871b) {
            C94640d dVar = this.f267880k;
            if (dVar != null) {
                return dVar;
            }
            C94640d b = super.mo88583b();
            return b;
        }
    }

    /* renamed from: m */
    public final boolean mo88594m() {
        C94640d a;
        C95683g gVar;
        synchronized (this.f267871b) {
            C58976aa aaVar = C58975e.f156826a;
            if (!mo89641y()) {
                while (true) {
                    int i = this.f267881l;
                    C94640d dVar = null;
                    if (i != 3) {
                        if (i != 1) {
                            synchronized (this.f267871b) {
                                int i2 = this.f267881l;
                                if (i2 != 1) {
                                    if (i2 == 0) {
                                        while (this.f267877h < this.f267873d.size()) {
                                            a = ((C95538m) this.f267873d.get(this.f267877h)).mo89393a();
                                            if (a != null && ((C95538m) this.f267873d.get(this.f267877h)).mo89395c()) {
                                                this.f267878i = true;
                                            }
                                            this.f267877h++;
                                            if (a != null) {
                                            }
                                        }
                                    } else if (i2 == 2) {
                                        while (this.f267877h < this.f267874e.size()) {
                                            a = ((C95538m) this.f267874e.get(this.f267877h)).mo89393a();
                                            this.f267877h++;
                                            if (a != null) {
                                            }
                                        }
                                    }
                                    dVar = a;
                                    break;
                                }
                                C89655j.m145957a("cant advance in notif src");
                            }
                            this.f267880k = dVar;
                            if (dVar != null) {
                                return true;
                            }
                        } else if (super.mo88594m()) {
                            this.f267878i = true;
                            return true;
                        } else if (m158425t()) {
                            this.f267879j = true;
                            synchronized (this.f267871b) {
                                gVar = new C95683g(this.f267872c, this.f267875f, this.f267876g, this.f267872c.getString(R.string.no_notifications_in_queue));
                            }
                            this.f267880k = gVar;
                            return true;
                        }
                        synchronized (this.f267871b) {
                            this.f267877h = 0;
                            this.f267881l++;
                        }
                    } else {
                        this.f267880k = null;
                        return false;
                    }
                }
                while (true) {
                }
            }
            boolean m = super.mo88594m();
            return m;
        }
    }

    /* renamed from: u */
    public final C60298nk mo89636u(int i) {
        C60251ly lyVar = (C60251ly) C60261mb.f163036g.createBuilder();
        lyVar.copyOnWrite();
        C60261mb mbVar = (C60261mb) lyVar.instance;
        mbVar.f163043f = 3;
        mbVar.f163038a |= 512;
        C60298nk u = super.mo89636u(i);
        u.mo57080a((C60261mb) lyVar.build());
        return u;
    }

    /* renamed from: v */
    public final List mo89637v() {
        ArrayList arrayList = new ArrayList();
        for (C95538m a : this.f267873d) {
            C94640d a2 = a.mo89393a();
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        arrayList.addAll(super.mo89637v());
        for (C95538m a3 : this.f267874e) {
            C94640d a4 = a3.mo89393a();
            if (a4 != null) {
                arrayList.add(a4);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        if (r2 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0072, code lost:
        r1 = r1 + 1;
        r2 = 0;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89638w() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f267871b
            monitor-enter(r0)
            boolean r1 = r7.mo89641y()     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x000f
            boolean r1 = super.mo89638w()     // Catch:{ all -> 0x007b }
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            return r1
        L_0x000f:
            int r1 = r7.f267881l     // Catch:{ all -> 0x007b }
            int r2 = r7.f267877h     // Catch:{ all -> 0x007b }
        L_0x0013:
            r3 = 3
            r4 = 0
            if (r1 == r3) goto L_0x0079
            java.lang.Object r3 = r7.f267871b     // Catch:{ all -> 0x007b }
            monitor-enter(r3)     // Catch:{ all -> 0x007b }
            r5 = 1
            if (r1 == 0) goto L_0x0053
            if (r1 == r5) goto L_0x003f
            r6 = 2
            if (r1 == r6) goto L_0x0024
            monitor-exit(r3)     // Catch:{ all -> 0x0076 }
            goto L_0x0072
        L_0x0024:
            java.util.List r6 = r7.f267874e     // Catch:{ all -> 0x0076 }
            int r6 = r6.size()     // Catch:{ all -> 0x0076 }
            if (r2 >= r6) goto L_0x0071
            java.util.List r6 = r7.f267874e     // Catch:{ all -> 0x0076 }
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x0076 }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.m r6 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95538m) r6     // Catch:{ all -> 0x0076 }
            com.google.android.apps.gsa.staticplugins.bisto.a.d r6 = r6.mo89393a()     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x003c
            monitor-exit(r3)     // Catch:{ all -> 0x0076 }
            goto L_0x006a
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x0024
        L_0x003f:
            boolean r2 = super.mo89638w()     // Catch:{ all -> 0x0076 }
            if (r2 != 0) goto L_0x004e
            boolean r2 = r7.m158425t()     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = 0
            goto L_0x004f
        L_0x004e:
            r2 = 1
        L_0x004f:
            monitor-exit(r3)     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0072
            goto L_0x006a
        L_0x0053:
            java.util.List r6 = r7.f267873d     // Catch:{ all -> 0x0076 }
            int r6 = r6.size()     // Catch:{ all -> 0x0076 }
            if (r2 >= r6) goto L_0x0071
            java.util.List r6 = r7.f267873d     // Catch:{ all -> 0x0076 }
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x0076 }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.m r6 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95538m) r6     // Catch:{ all -> 0x0076 }
            com.google.android.apps.gsa.staticplugins.bisto.a.d r6 = r6.mo89393a()     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x006e
            monitor-exit(r3)     // Catch:{ all -> 0x0076 }
        L_0x006a:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007b }
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            return r5
        L_0x006e:
            int r2 = r2 + 1
            goto L_0x0053
        L_0x0071:
            monitor-exit(r3)     // Catch:{ all -> 0x0076 }
        L_0x0072:
            int r1 = r1 + 1
            r2 = 0
            goto L_0x0013
        L_0x0076:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0076 }
            throw r1     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            return r4
        L_0x007b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            goto L_0x007f
        L_0x007e:
            throw r1
        L_0x007f:
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95687k.mo89638w():boolean");
    }
}
