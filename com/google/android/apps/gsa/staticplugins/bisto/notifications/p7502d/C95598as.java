package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.android.apps.gsa.shared.bisto.C89619aq;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89683v;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90425f;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90432m;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90433n;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7503e.C95635d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.as */
/* compiled from: PG */
public final class C95598as implements C89683v, C95621q, C95600au {

    /* renamed from: a */
    public static final C59071e f267529a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.d.as");

    /* renamed from: b */
    public static final long f267530b = TimeUnit.SECONDS.toMillis(8);

    /* renamed from: j */
    private static final long f267531j = TimeUnit.HOURS.toMillis(1);

    /* renamed from: c */
    public final Map f267532c = new ConcurrentHashMap();

    /* renamed from: d */
    public final C95635d f267533d;

    /* renamed from: e */
    public final C89656k f267534e;

    /* renamed from: f */
    public final C21370a f267535f;

    /* renamed from: g */
    public final C95622r f267536g;

    /* renamed from: h */
    public final HashMap f267537h = new HashMap();

    /* renamed from: i */
    public C95599at f267538i;

    public C95598as(C95635d dVar, C89656k kVar, C21370a aVar, C95622r rVar) {
        this.f267533d = dVar;
        this.f267534e = kVar;
        this.f267535f = aVar;
        this.f267536g = rVar;
    }

    /* renamed from: e */
    public static void m158262e(C90421b bVar, Map map) {
        C90427h b = bVar.mo84131b();
        if (map.containsKey(b)) {
            C95596aq aqVar = (C95596aq) map.get(b);
            aqVar.f267524b.add(bVar);
            String str = aqVar.f267523a;
            if (str != null && !str.equals(bVar.mo84145c())) {
                aqVar.f267523a = null;
                return;
            }
            return;
        }
        map.put(b, new C95596aq(bVar));
    }

    /* renamed from: b */
    public final void mo89539b() {
        this.f267533d.mo89592o(new C95594ao(this));
    }

    /* renamed from: c */
    public final List mo89540c(C95581ab abVar) {
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        for (C95596aq aqVar : this.f267532c.values()) {
            for (C90421b bVar : aqVar.f267524b) {
                C90433n nVar = bVar.f252594o;
                if ((!bVar.f252596q || mo89548l(bVar)) && !mo89547k(bVar) && nVar != null && abVar.mo89516a(nVar)) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo89541d(C90427h hVar, C95581ab abVar) {
        C95596aq aqVar = (C95596aq) this.f267532c.get(hVar);
        if (aqVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (C90421b bVar : aqVar.f267524b) {
            C90433n nVar = bVar.f252594o;
            if ((!bVar.f252596q || mo89548l(bVar)) && !mo89547k(bVar) && nVar != null && abVar.mo89516a(nVar)) {
                arrayList.add(bVar);
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return arrayList;
    }

    /* renamed from: f */
    public final void mo89542f(List list) {
        this.f267533d.mo89592o(new C95593an(this, list));
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [com.google.android.apps.gsa.staticplugins.bisto.notifications.i.l, com.google.android.apps.gsa.staticplugins.bisto.notifications.d.w] */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03f8, code lost:
        if (r13 == false) goto L_0x044c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0259  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89543g(java.util.List r21) {
        /*
            r20 = this;
            r1 = r20
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r21.size()
            r2 = 1
            if (r0 <= r2) goto L_0x0018
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = r21
            r0.<init>(r3)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.al r3 = com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95591al.f267516a
            java.util.Collections.sort(r0, r3)
            goto L_0x001b
        L_0x0018:
            r3 = r21
            r0 = r3
        L_0x001b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
            r7 = 0
        L_0x002f:
            boolean r8 = r0.hasNext()
            r10 = 0
            if (r8 == 0) goto L_0x02a0
            java.lang.Object r8 = r0.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.b r8 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r8
            java.lang.String r11 = r8.f252591l
            java.lang.String r12 = "com.google.android.googlequicksearchbox"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x006d
            java.lang.String r11 = r8.mo84145c()
            java.lang.String r13 = "StrictMode"
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x006d
            com.google.common.f.e r10 = f267529a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r13 = "NotificationStorage"
            r10.mo56378ag(r11, r13)
            java.lang.String r11 = "Ignoring Google StrictMode notification"
            r13 = 16276(0x3f94, float:2.2808E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r13)).mo56386p(r11)
            r9 = r3
            r16 = r7
        L_0x0069:
            r17 = 0
            goto L_0x022d
        L_0x006d:
            java.util.Map r11 = r1.f267532c
            java.util.Collection r11 = r11.values()
            java.util.Iterator r11 = r11.iterator()
        L_0x0077:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x011a
            java.lang.Object r13 = r11.next()
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aq r13 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95596aq) r13
            r14 = 0
        L_0x0084:
            java.util.List r15 = r13.f267524b
            int r15 = r15.size()
            if (r14 >= r15) goto L_0x0077
            java.util.List r15 = r13.f267524b
            java.lang.Object r15 = r15.get(r14)
            com.google.android.apps.gsa.shared.notificationlistening.common.b r15 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r15
            java.lang.String r6 = r15.f252589j
            java.lang.String r9 = r8.f252589j
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x00a0
        L_0x009e:
            r9 = r3
            goto L_0x00b1
        L_0x00a0:
            boolean r6 = r15.f252583d
            boolean r9 = r8.f252583d
            if (r6 != r9) goto L_0x00aa
            if (r6 != 0) goto L_0x010f
            if (r9 == 0) goto L_0x010f
        L_0x00aa:
            boolean r6 = r15.mo84133e(r8)
            if (r6 == 0) goto L_0x010f
            goto L_0x009e
        L_0x00b1:
            long r2 = r15.f252593n
            r16 = r7
            long r6 = r8.f252593n
            int r18 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r18 != 0) goto L_0x00c3
            boolean r2 = r15.mo84133e(r8)
            if (r2 == 0) goto L_0x00c3
            r2 = 1
            goto L_0x00c4
        L_0x00c3:
            r2 = 0
        L_0x00c4:
            if (r10 != 0) goto L_0x00cc
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ar r10 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ar
            r10.<init>(r13, r14, r2)
            goto L_0x0112
        L_0x00cc:
            long r6 = r15.f252593n
            com.google.android.apps.gsa.shared.notificationlistening.common.b r3 = r10.f267525a
            r18 = r13
            long r12 = r3.f252593n
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x010c
            long r6 = r8.f252593n
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x010c
            boolean r3 = r10.f267528d
            if (r3 == 0) goto L_0x00f8
            if (r2 == 0) goto L_0x010c
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aq r2 = r10.f267526b
            java.util.List r2 = r2.f267524b
            java.lang.Object r2 = r2.get(r14)
            com.google.android.apps.gsa.shared.notificationlistening.common.b r2 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r2
            long r2 = r2.f252593n
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x010c
            r13 = r18
            r6 = 1
            goto L_0x00fb
        L_0x00f8:
            r6 = r2
            r13 = r18
        L_0x00fb:
            r10.f267526b = r13
            r10.f267527c = r14
            java.util.List r2 = r13.f267524b
            java.lang.Object r2 = r2.get(r14)
            com.google.android.apps.gsa.shared.notificationlistening.common.b r2 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r2
            r10.f267525a = r2
            r10.f267528d = r6
            goto L_0x0112
        L_0x010c:
            r13 = r18
            goto L_0x0112
        L_0x010f:
            r9 = r3
            r16 = r7
        L_0x0112:
            int r14 = r14 + 1
            r3 = r9
            r7 = r16
            r2 = 1
            goto L_0x0084
        L_0x011a:
            r9 = r3
            r16 = r7
            if (r10 != 0) goto L_0x0121
            r2 = 1
            goto L_0x0122
        L_0x0121:
            r2 = 0
        L_0x0122:
            if (r10 == 0) goto L_0x01a8
            com.google.android.apps.gsa.shared.notificationlistening.common.b r2 = r10.f267525a
            com.google.android.apps.gsa.shared.notificationlistening.common.n r2 = r2.f252594o
            if (r2 == 0) goto L_0x0131
            r3 = 2
            boolean r6 = r2.mo84171f(r3)
            if (r6 != 0) goto L_0x0139
        L_0x0131:
            com.google.android.apps.gsa.shared.notificationlistening.common.b r3 = r10.f267525a
            boolean r3 = r1.mo89547k(r3)
            if (r3 == 0) goto L_0x013b
        L_0x0139:
            r3 = 1
            goto L_0x013c
        L_0x013b:
            r3 = 0
        L_0x013c:
            java.lang.Integer r6 = r8.f252586g
            if (r6 != 0) goto L_0x0198
            com.google.android.apps.gsa.shared.notificationlistening.common.b r7 = r10.f267525a
            java.lang.Integer r11 = r7.f252586g
            if (r11 != 0) goto L_0x0198
            long r11 = r8.f252592m
            long r13 = r7.f252592m
            r18 = -200(0xffffffffffffff38, double:NaN)
            long r13 = r13 + r18
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x0069
            long r11 = r8.f252593n
            long r6 = r7.f252593n
            long r6 = r6 + r18
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x015d
            goto L_0x01a4
        L_0x015d:
            if (r2 == 0) goto L_0x0165
            boolean r2 = r2.mo84170e()
            if (r2 != 0) goto L_0x016d
        L_0x0165:
            com.google.android.apps.gsa.shared.notificationlistening.common.b r2 = r10.f267525a
            boolean r2 = r1.mo89547k(r2)
            if (r2 == 0) goto L_0x016f
        L_0x016d:
            r2 = 1
            goto L_0x0170
        L_0x016f:
            r2 = 0
        L_0x0170:
            boolean r6 = r10.f267528d
            if (r6 != 0) goto L_0x017f
            com.google.android.apps.gsa.shared.notificationlistening.common.b r6 = r10.f267525a
            boolean r6 = r6.mo84133e(r8)
            if (r6 == 0) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            r6 = 0
            goto L_0x0180
        L_0x017f:
            r6 = 1
        L_0x0180:
            if (r6 == 0) goto L_0x0186
            if (r3 == 0) goto L_0x0185
            goto L_0x01a4
        L_0x0185:
            r3 = 0
        L_0x0186:
            if (r6 != 0) goto L_0x0196
            boolean r6 = r8 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.C90425f
            if (r6 == 0) goto L_0x018e
            if (r2 == 0) goto L_0x0196
        L_0x018e:
            if (r3 != 0) goto L_0x0194
            boolean r2 = r8 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            if (r2 == 0) goto L_0x0196
        L_0x0194:
            r2 = 1
            goto L_0x01a8
        L_0x0196:
            r2 = 0
            goto L_0x01a8
        L_0x0198:
            com.google.android.apps.gsa.shared.notificationlistening.common.b r2 = r10.f267525a
            java.lang.Integer r2 = r2.f252586g
            boolean r2 = com.google.common.base.C58832aw.m90831a(r2, r6)
            if (r2 == 0) goto L_0x01a6
            if (r3 == 0) goto L_0x01a6
        L_0x01a4:
            goto L_0x0069
        L_0x01a6:
            r2 = r2 ^ 1
        L_0x01a8:
            if (r2 == 0) goto L_0x01bd
            java.util.Map r2 = r1.f267532c
            m158262e(r8, r2)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.e.d r2 = r1.f267533d
            r2.mo89589l(r8)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.at r2 = r1.f267538i
            if (r2 == 0) goto L_0x022b
            r2.mo89550a(r8)
            goto L_0x022b
        L_0x01bd:
            if (r10 == 0) goto L_0x022b
            com.google.android.apps.gsa.shared.notificationlistening.common.b r2 = r10.f267525a
            long r2 = r2.mo84144a()
            com.google.android.apps.gsa.shared.notificationlistening.common.n r6 = r8.f252594o
            if (r6 != 0) goto L_0x01d9
            com.google.common.f.e r2 = com.google.android.apps.gsa.shared.notificationlistening.common.C90421b.f252580a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "No state yet"
            r6 = 10936(0x2ab8, float:1.5325E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r3)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x01e1
        L_0x01d9:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.f252595p = r2
            r6.f252644d = r2
        L_0x01e1:
            boolean r2 = r8 instanceof com.google.android.apps.gsa.shared.notificationlistening.common.C90425f
            com.google.android.apps.gsa.shared.notificationlistening.common.b r3 = r10.f267525a
            com.google.android.apps.gsa.shared.notificationlistening.common.n r3 = r3.f252594o
            r6 = 1
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x01f0
            if (r3 == 0) goto L_0x01f0
            r8.f252594o = r3
            goto L_0x01f7
        L_0x01f0:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.at r2 = r1.f267538i
            if (r2 == 0) goto L_0x01f7
            r2.mo89550a(r8)
        L_0x01f7:
            boolean r2 = r10.f267528d
            if (r2 != 0) goto L_0x0226
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aq r2 = r10.f267526b
            int r3 = r10.f267527c
            if (r3 < 0) goto L_0x0210
            java.util.List r7 = r2.f267524b
            int r7 = r7.size()
            if (r3 < r7) goto L_0x020a
            goto L_0x0210
        L_0x020a:
            java.util.List r2 = r2.f267524b
            r2.set(r3, r8)
            goto L_0x0226
        L_0x0210:
            com.google.common.f.e r2 = f267529a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "NotificationStorage"
            r2.mo56378ag(r3, r7)
            java.lang.String r3 = "invalid index"
            r7 = 16238(0x3f6e, float:2.2754E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r7)).mo56386p(r3)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x0226:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.e.d r2 = r1.f267533d
            r2.mo89589l(r8)
        L_0x022b:
            r17 = 1
        L_0x022d:
            com.google.android.apps.gsa.shared.notificationlistening.common.n r2 = r8.f252594o
            if (r16 != 0) goto L_0x0236
            if (r17 == 0) goto L_0x0234
            goto L_0x0236
        L_0x0234:
            r7 = 0
            goto L_0x0237
        L_0x0236:
            r7 = 1
        L_0x0237:
            if (r17 == 0) goto L_0x029c
            boolean r3 = r1.mo89547k(r8)
            if (r3 != 0) goto L_0x029c
            if (r2 == 0) goto L_0x029c
            java.lang.Integer r3 = r2.mo84166a()
            if (r3 == 0) goto L_0x024f
            int r3 = r3.intValue()
            r10 = 12
            if (r3 == r10) goto L_0x029c
        L_0x024f:
            boolean r3 = r2.mo84173i()
            if (r3 == 0) goto L_0x0259
            r9.add(r8)
            goto L_0x029c
        L_0x0259:
            java.lang.Integer r3 = r2.f252643c
            if (r3 == 0) goto L_0x027b
            int r3 = r3.intValue()
            r10 = 3
            if (r3 != r10) goto L_0x027b
            boolean r3 = r2.mo84172g()
            if (r3 != 0) goto L_0x027b
            boolean r3 = r2.mo84169d()
            if (r3 != 0) goto L_0x027b
            r3 = 0
            boolean r10 = r2.mo84171f(r3)
            if (r10 != 0) goto L_0x027b
            r4.add(r8)
            goto L_0x029c
        L_0x027b:
            java.lang.Integer r3 = r2.f252643c
            if (r3 == 0) goto L_0x029c
            int r3 = r3.intValue()
            r10 = 2
            if (r3 != r10) goto L_0x029c
            boolean r3 = r2.mo84172g()
            if (r3 != 0) goto L_0x029c
            boolean r3 = r2.mo84169d()
            if (r3 != 0) goto L_0x029c
            r3 = 1
            boolean r2 = r2.mo84171f(r3)
            if (r2 != 0) goto L_0x029c
            r5.add(r8)
        L_0x029c:
            r3 = r9
            r2 = 1
            goto L_0x002f
        L_0x02a0:
            r9 = r3
            r16 = r7
            if (r16 == 0) goto L_0x02ac
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.r r0 = r1.f267536g
            long r2 = f267531j
            r0.mo89577c(r1, r2)
        L_0x02ac:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x02c0
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x02c0
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x02bf
            goto L_0x02c0
        L_0x02bf:
            return
        L_0x02c0:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r2 = r9.size()
            r3 = 0
        L_0x02ca:
            if (r3 >= r2) goto L_0x02dc
            java.lang.Object r7 = r9.get(r3)
            com.google.android.apps.gsa.shared.notificationlistening.common.b r7 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r7
            com.google.android.apps.gsa.shared.notificationlistening.common.h r7 = r7.mo84131b()
            r0.add(r7)
            int r3 = r3 + 1
            goto L_0x02ca
        L_0x02dc:
            int r2 = r4.size()
        L_0x02e0:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0301
            java.lang.Object r3 = r4.get(r2)
            com.google.android.apps.gsa.shared.notificationlistening.common.b r3 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r3
            com.google.android.apps.gsa.shared.notificationlistening.common.h r3 = r3.mo84131b()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x02e0
            java.lang.Object r3 = r4.get(r2)
            com.google.android.apps.gsa.shared.notificationlistening.common.b r3 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r3
            r9.add(r3)
            r4.remove(r2)
            goto L_0x02e0
        L_0x0301:
            java.util.Map r2 = r1.f267532c
            monitor-enter(r2)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.at r0 = r1.f267538i     // Catch:{ all -> 0x044e }
            if (r0 == 0) goto L_0x044c
            r3 = r0
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.n r3 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95618n) r3     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.w r3 = r3.f267611e     // Catch:{ all -> 0x044e }
            if (r3 != 0) goto L_0x0311
            goto L_0x044c
        L_0x0311:
            r7 = r0
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.n r7 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95618n) r7     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.f.b r7 = r7.f267609c     // Catch:{ all -> 0x044e }
            boolean r7 = r7.mo89602a()     // Catch:{ all -> 0x044e }
            boolean r8 = r5.isEmpty()     // Catch:{ all -> 0x044e }
            if (r8 == 0) goto L_0x0323
            if (r7 != 0) goto L_0x03fa
            r7 = 0
        L_0x0323:
            r8 = r3
            com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.ae r8 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95651ae) r8     // Catch:{ all -> 0x044e }
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f267720k     // Catch:{ all -> 0x044e }
            boolean r8 = r8.get()     // Catch:{ all -> 0x044e }
            if (r8 == 0) goto L_0x0331
        L_0x032e:
            r13 = r7
            goto L_0x03f8
        L_0x0331:
            r8 = r3
            com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.ae r8 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95651ae) r8     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.i.d r8 = r8.f267717h     // Catch:{ all -> 0x044e }
            java.util.Iterator r11 = r5.iterator()     // Catch:{ all -> 0x044e }
            r12 = 0
        L_0x033b:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x044e }
            if (r13 == 0) goto L_0x0350
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r13 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r13     // Catch:{ all -> 0x044e }
            android.net.Uri r14 = r13.f252585f     // Catch:{ all -> 0x044e }
            if (r14 == 0) goto L_0x034c
            goto L_0x0362
        L_0x034c:
            boolean r13 = r13.f252587h     // Catch:{ all -> 0x044e }
            r12 = r12 | r13
            goto L_0x033b
        L_0x0350:
            if (r12 == 0) goto L_0x0361
            android.content.Context r11 = r8.f267847a     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.shared.bisto.k r12 = r8.f267851e     // Catch:{ all -> 0x044e }
            android.net.Uri r13 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI     // Catch:{ all -> 0x044e }
            boolean r11 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146972k(r11, r12, r13)     // Catch:{ all -> 0x044e }
            if (r11 == 0) goto L_0x0361
            android.net.Uri r14 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI     // Catch:{ all -> 0x044e }
            goto L_0x0362
        L_0x0361:
            r14 = r10
        L_0x0362:
            if (r14 == 0) goto L_0x032e
            com.google.android.libraries.f.a r11 = r8.f267853g     // Catch:{ all -> 0x044e }
            long r11 = r11.mo26870b()     // Catch:{ all -> 0x044e }
            r13 = r7
            long r6 = r8.f267854h     // Catch:{ all -> 0x044e }
            r18 = 400(0x190, double:1.976E-321)
            long r6 = r6 + r18
            int r15 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x03f8
            java.util.Iterator r7 = r5.iterator()     // Catch:{ all -> 0x044e }
        L_0x0379:
            boolean r6 = r7.hasNext()     // Catch:{ all -> 0x044e }
            if (r6 == 0) goto L_0x038c
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r6 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r6     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.l r11 = r8.f267850d     // Catch:{ all -> 0x044e }
            r12 = 1
            r11.mo89661c(r6, r12, r12)     // Catch:{ all -> 0x044e }
            goto L_0x0379
        L_0x038c:
            com.google.android.libraries.f.a r7 = r8.f267853g     // Catch:{ all -> 0x044e }
            long r11 = r7.mo26870b()     // Catch:{ all -> 0x044e }
            r8.f267854h = r11     // Catch:{ all -> 0x044e }
            java.lang.String r7 = r8.mo89634a()     // Catch:{ all -> 0x044e }
            if (r7 == 0) goto L_0x03a0
            com.google.android.apps.gsa.staticplugins.bisto.notifications.i.c r7 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.i.c     // Catch:{ all -> 0x044e }
            r7.<init>(r8, r5, r3)     // Catch:{ all -> 0x044e }
            goto L_0x03a1
        L_0x03a0:
            r7 = r10
        L_0x03a1:
            com.google.android.apps.gsa.staticplugins.bisto.b.b.al r11 = r8.f267849c     // Catch:{ all -> 0x044e }
            r11.mo89095f(r10)     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.al r10 = r8.f267849c     // Catch:{ all -> 0x044e }
            int r7 = r10.mo89090a(r14, r7)     // Catch:{ all -> 0x044e }
            if (r7 == 0) goto L_0x03f8
            com.google.common.o.mg r7 = com.google.common.p4552o.C60266mg.f163051c     // Catch:{ all -> 0x044e }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x044e }
            com.google.common.o.mf r7 = (com.google.common.p4552o.C60265mf) r7     // Catch:{ all -> 0x044e }
            com.google.common.o.np r5 = com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q.m157567a(r5)     // Catch:{ all -> 0x044e }
            r7.copyOnWrite()     // Catch:{ all -> 0x044e }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x044e }
            com.google.common.o.mg r10 = (com.google.common.p4552o.C60266mg) r10     // Catch:{ all -> 0x044e }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x044e }
            com.google.common.o.nr r5 = (com.google.common.p4552o.C60305nr) r5     // Catch:{ all -> 0x044e }
            r5.getClass()     // Catch:{ all -> 0x044e }
            r10.f163054b = r5     // Catch:{ all -> 0x044e }
            int r5 = r10.f163053a     // Catch:{ all -> 0x044e }
            r6 = 1
            r5 = r5 | r6
            r10.f163053a = r5     // Catch:{ all -> 0x044e }
            com.google.protobuf.bv r5 = r7.build()     // Catch:{ all -> 0x044e }
            com.google.common.o.mg r5 = (com.google.common.p4552o.C60266mg) r5     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.staticplugins.bisto.f.m r7 = r8.f267852f     // Catch:{ all -> 0x044e }
            com.google.common.o.nm r8 = com.google.common.p4552o.C60300nm.f163138H     // Catch:{ all -> 0x044e }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x044e }
            com.google.common.o.nk r8 = (com.google.common.p4552o.C60298nk) r8     // Catch:{ all -> 0x044e }
            r8.copyOnWrite()     // Catch:{ all -> 0x044e }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x044e }
            com.google.common.o.nm r10 = (com.google.common.p4552o.C60300nm) r10     // Catch:{ all -> 0x044e }
            r5.getClass()     // Catch:{ all -> 0x044e }
            r10.f163156j = r5     // Catch:{ all -> 0x044e }
            int r5 = r10.f163147a     // Catch:{ all -> 0x044e }
            r11 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 | r11
            r10.f163147a = r5     // Catch:{ all -> 0x044e }
            r7.mo83545c(r8)     // Catch:{ all -> 0x044e }
        L_0x03f8:
            if (r13 == 0) goto L_0x044c
        L_0x03fa:
            boolean r5 = r9.isEmpty()     // Catch:{ all -> 0x044e }
            if (r5 != 0) goto L_0x043f
            r9.size()     // Catch:{ all -> 0x044e }
            java.util.Iterator r5 = r9.iterator()     // Catch:{ all -> 0x044e }
        L_0x0407:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x044e }
            if (r7 == 0) goto L_0x043c
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r7 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r7     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.shared.notificationlistening.common.n r7 = r7.f252594o     // Catch:{ all -> 0x044e }
            if (r7 == 0) goto L_0x0407
            com.google.android.apps.gsa.shared.notificationlistening.common.m r8 = new com.google.android.apps.gsa.shared.notificationlistening.common.m     // Catch:{ all -> 0x044e }
            r10 = r0
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.n r10 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95618n) r10     // Catch:{ all -> 0x044e }
            com.google.android.libraries.f.a r10 = r10.f267610d     // Catch:{ all -> 0x044e }
            long r10 = r10.mo26870b()     // Catch:{ all -> 0x044e }
            r6 = 12
            r12 = 1
            r8.<init>(r6, r12, r10)     // Catch:{ all -> 0x044e }
            r7.mo84167b(r8)     // Catch:{ all -> 0x044e }
            r10 = r0
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.n r10 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95618n) r10     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.e.d r10 = r10.f267608b     // Catch:{ all -> 0x044e }
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.m r11 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.d.m     // Catch:{ all -> 0x044e }
            r13 = r0
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.n r13 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95618n) r13     // Catch:{ all -> 0x044e }
            r11.<init>(r13, r8, r7)     // Catch:{ all -> 0x044e }
            r10.mo89592o(r11)     // Catch:{ all -> 0x044e }
            goto L_0x0407
        L_0x043c:
            r3.mo89581a(r9)     // Catch:{ all -> 0x044e }
        L_0x043f:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x044e }
            if (r0 != 0) goto L_0x044c
            r4.size()     // Catch:{ all -> 0x044e }
            r0 = 0
            r3.mo89582b(r0, r4)     // Catch:{ all -> 0x044e }
        L_0x044c:
            monitor-exit(r2)     // Catch:{ all -> 0x044e }
            return
        L_0x044e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x044e }
            goto L_0x0452
        L_0x0451:
            throw r0
        L_0x0452:
            goto L_0x0451
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as.mo89543g(java.util.List):void");
    }

    /* renamed from: h */
    public final void mo89544h() {
        this.f267532c.clear();
        C95635d dVar = this.f267533d;
        Objects.requireNonNull(dVar);
        dVar.mo89592o(new C95595ap(dVar));
    }

    /* renamed from: i */
    public final void mo89545i(List list) {
        long b = this.f267535f.mo26870b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f267537h.put(((MessageNotification) it.next()).f252536F, Long.valueOf(b));
        }
    }

    /* renamed from: iq */
    public final void mo83403iq(C89619aq aqVar, boolean z) {
        for (Map.Entry entry : this.f267532c.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            String str = ((C95596aq) entry.getValue()).f267523a;
            int size = ((C95596aq) entry.getValue()).f267524b.size();
            aqVar.println("  Entry: identifier=" + valueOf + ", mNotificationKey=" + str + ", # notifs=" + size);
            for (C90421b valueOf2 : ((C95596aq) entry.getValue()).f267524b) {
                aqVar.println("    Notification: ".concat(String.valueOf(String.valueOf(valueOf2))));
            }
        }
    }

    /* renamed from: j */
    public final void mo89546j(C95627w wVar) {
        synchronized (this.f267532c) {
            C95599at atVar = this.f267538i;
            if (atVar != null) {
                ((C95618n) atVar).f267611e = wVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo89547k(C90421b bVar) {
        if (bVar.f252592m < this.f267535f.mo26870b() - this.f267534e.mo83546a("notification_delivery_expiry_time_ms")) {
            return true;
        }
        if (bVar instanceof C90425f) {
            if (((C90425f) bVar).f252603r + Math.max(Duration.ofMinutes(this.f267534e.mo83546a("calendar_mins_after_event_start_to_remove")).toMillis(), Duration.ofSeconds(10).toMillis()) <= this.f267535f.mo26870b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo89549m(C90427h hVar, long j) {
        Long l = (Long) this.f267537h.get(hVar);
        return l != null && l.longValue() <= j + f267530b;
    }

    /* renamed from: l */
    public final boolean mo89548l(C90421b bVar) {
        C90433n nVar = bVar.f252594o;
        Long l = null;
        if (nVar != null && !nVar.f252642b.isEmpty()) {
            List list = nVar.f252642b;
            C90432m mVar = (C90432m) list.get(list.size() - 1);
            int i = mVar.f252637a;
            if (mVar.f252639c && (i == 5 || i == 0 || i == 1 || i == 7)) {
                l = Long.valueOf(mVar.f252638b);
            }
        }
        if (l == null || l.longValue() < this.f267535f.mo26870b() - TimeUnit.SECONDS.toMillis(this.f267534e.mo83546a("recent_notifs_period_sec"))) {
            return false;
        }
        return true;
    }
}
