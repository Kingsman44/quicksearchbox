package com.google.android.libraries.search.p2871b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2890e.C37233b;
import com.google.android.libraries.search.p2871b.p2890e.C37234c;
import com.google.android.libraries.search.p2871b.p2895i.C37256e;
import com.google.android.libraries.search.p2871b.p2897k.C37274a;
import com.google.android.libraries.search.p2871b.p2899m.C37287a;
import com.google.android.libraries.search.p2871b.p2899m.C37288b;
import com.google.android.libraries.search.p2871b.p2899m.C37293g;
import com.google.android.libraries.search.p2871b.p2899m.C37296j;
import com.google.android.libraries.search.p2871b.p2902o.C37306a;
import com.google.android.libraries.search.p2871b.p2902o.C37309b;
import com.google.android.libraries.search.p2871b.p2902o.C37311d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.p4419bx.C57863d;
import com.google.p4438c.p4439a.C57912a;
import com.google.p4438c.p4439a.C57913b;
import com.google.p4438c.p4439a.C57916e;
import com.google.p4438c.p4439a.C57917f;
import com.google.p4438c.p4439a.C57918g;
import com.google.p4438c.p4439a.C57920i;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71186c;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71187d;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71188e;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.libraries.search.b.r */
/* compiled from: PG */
public final class C37317r implements C37226d, C37288b {

    /* renamed from: a */
    private static final long f99151a = TimeUnit.MINUTES.toNanos(20);

    /* renamed from: b */
    private final Deque f99152b = new ArrayDeque();

    /* renamed from: c */
    private final Object f99153c = new Object();

    /* renamed from: d */
    private final C37287a f99154d;

    /* renamed from: e */
    private final C21370a f99155e;

    /* renamed from: f */
    private volatile int f99156f;

    /* renamed from: g */
    private C58833ax f99157g = C58836b.f156633a;

    /* renamed from: h */
    private final C37274a f99158h;

    public C37317r(C37287a aVar, C21370a aVar2, C37274a aVar3) {
        this.f99154d = aVar;
        Integer num = 0;
        this.f99156f = num.intValue();
        this.f99155e = aVar2;
        this.f99158h = aVar3;
        synchronized (((C37296j) aVar).f99098a) {
            ((C37296j) aVar).f99099b = C58833ax.m90834k(this);
        }
    }

    /* renamed from: h */
    private static C37233b m66299h(C37293g gVar) {
        C58485gu a = gVar.mo40835a();
        int b = gVar.mo40836b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i != 3) {
            return ((C37256e) C58557jl.m90131l(a)).mo40798c().f98876a.f98907b;
        } else {
            return ((C37256e) a.get(0)).mo40798c().f98876a.f98907b;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m66300i(com.google.android.libraries.search.p2871b.p2902o.C37309b r9) {
        /*
            r8 = this;
            java.util.Deque r0 = r8.f99152b
            monitor-enter(r0)
            com.google.android.libraries.f.a r1 = r8.f99155e     // Catch:{ all -> 0x006e }
            long r1 = r1.mo26872d()     // Catch:{ all -> 0x006e }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x006e }
            com.google.android.libraries.f.a r4 = r8.f99155e     // Catch:{ all -> 0x006e }
            long r4 = r4.mo26870b()     // Catch:{ all -> 0x006e }
            long r3 = r3.toNanos(r4)     // Catch:{ all -> 0x006e }
            java.util.Deque r5 = r8.f99152b     // Catch:{ all -> 0x006e }
            j.a.i.a.b.a.f r6 = r9.mo40862d()     // Catch:{ all -> 0x006e }
            boolean r9 = r9.mo40863e()     // Catch:{ all -> 0x006e }
            com.google.android.libraries.search.b.i.l r7 = new com.google.android.libraries.search.b.i.l     // Catch:{ all -> 0x006e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x006e }
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ all -> 0x006e }
            r7.<init>(r6, r3, r9)     // Catch:{ all -> 0x006e }
            com.google.android.libraries.search.b.e r9 = new com.google.android.libraries.search.b.e     // Catch:{ all -> 0x006e }
            r9.<init>(r7, r1)     // Catch:{ all -> 0x006e }
            r5.addLast(r9)     // Catch:{ all -> 0x006e }
            java.util.Deque r9 = r8.f99152b     // Catch:{ all -> 0x006e }
            int r9 = r9.size()     // Catch:{ all -> 0x006e }
            r3 = 10
            if (r9 <= r3) goto L_0x006c
        L_0x003e:
            java.util.Deque r9 = r8.f99152b     // Catch:{ all -> 0x006e }
            int r9 = r9.size()     // Catch:{ all -> 0x006e }
            r4 = 30
            if (r9 > r4) goto L_0x0066
            java.util.Deque r9 = r8.f99152b     // Catch:{ all -> 0x006e }
            int r9 = r9.size()     // Catch:{ all -> 0x006e }
            if (r9 <= r3) goto L_0x0064
            java.util.Deque r9 = r8.f99152b     // Catch:{ all -> 0x006e }
            java.lang.Object r9 = r9.getFirst()     // Catch:{ all -> 0x006e }
            com.google.android.libraries.search.b.p r9 = (com.google.android.libraries.search.p2871b.C37315p) r9     // Catch:{ all -> 0x006e }
            long r4 = r9.mo40722a()     // Catch:{ all -> 0x006e }
            long r6 = f99151a     // Catch:{ all -> 0x006e }
            long r4 = r4 + r6
            int r9 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            return
        L_0x0066:
            java.util.Deque r9 = r8.f99152b     // Catch:{ all -> 0x006e }
            r9.removeFirst()     // Catch:{ all -> 0x006e }
            goto L_0x003e
        L_0x006c:
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            return
        L_0x006e:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x0071:
            throw r9
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2871b.C37317r.m66300i(com.google.android.libraries.search.b.o.b):void");
    }

    /* renamed from: a */
    public final C58485gu mo40715a() {
        return this.f99154d.mo40831b();
    }

    /* renamed from: b */
    public final C58485gu mo40716b() {
        C58485gu f;
        synchronized (this.f99152b) {
            C58480gp e = C58485gu.m89837e();
            for (C37315p b : this.f99152b) {
                e.mo55395g(b.mo40723b());
            }
            f = e.mo55394f();
        }
        return f;
    }

    /* renamed from: c */
    public final C58528ij mo40717c(C37256e eVar) {
        C58833ax a = this.f99154d.mo40830a(eVar);
        if (!a.mo56113h()) {
            return C58733pz.f156496a;
        }
        C37309b f = mo40878f((C37293g) a.mo56107c());
        m66300i(f);
        return new C58759qy(f);
    }

    /* renamed from: d */
    public final void mo40718d(int i) {
        this.f99156f = i;
    }

    /* renamed from: e */
    public final void mo40719e(C37217c cVar) {
        synchronized (this.f99153c) {
            this.f99157g = C58833ax.m90834k(cVar);
        }
    }

    /* renamed from: f */
    public final C37309b mo40878f(C37293g gVar) {
        int a;
        int i;
        C57920i iVar;
        C37306a b = C37309b.m66264b();
        C71186c cVar = (C71186c) C71189f.f189934k.createBuilder();
        int i2 = m66299h(gVar).f98908a;
        C66419b bVar = m66299h(gVar).f98909b;
        int i3 = 1;
        if (bVar != C66419b.UNKNOWN) {
            C71187d dVar = (C71187d) C71188e.f189929d.createBuilder();
            int i4 = this.f99156f;
            dVar.copyOnWrite();
            C71188e eVar = (C71188e) dVar.instance;
            eVar.f189931a |= 1;
            eVar.f189932b = i4;
            dVar.copyOnWrite();
            C71188e eVar2 = (C71188e) dVar.instance;
            eVar2.f189933c = bVar.f180604g;
            eVar2.f189931a |= 2;
            cVar.copyOnWrite();
            C71189f fVar = (C71189f) cVar.instance;
            C71188e eVar3 = (C71188e) dVar.build();
            eVar3.getClass();
            fVar.f189944i = eVar3;
            fVar.f189936a |= 64;
        } else {
            cVar.copyOnWrite();
            C71189f fVar2 = (C71189f) cVar.instance;
            fVar2.f189936a |= 4;
            fVar2.f189940e = i2;
        }
        C58485gu a2 = gVar.mo40835a();
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        int size = a2.size();
        int i5 = 0;
        while (i5 < size) {
            C37256e eVar4 = (C37256e) a2.get(i5);
            int i6 = eVar4.mo40798c().f98876a.f98907b.f98908a;
            C57912a aVar = (C57912a) C57913b.f154898e.createBuilder((C57913b) eVar4.mo40797b().build());
            C57916e eVar5 = (C57916e) C57917f.f154908f.createBuilder();
            if (i6 == 0 || i6 == i2) {
                i = i2;
            } else {
                eVar5.copyOnWrite();
                C57917f fVar3 = (C57917f) eVar5.instance;
                i = i2;
                fVar3.f154910a |= i3;
                fVar3.f154911b = i6;
            }
            C66419b bVar2 = eVar4.mo40798c().f98876a.f98907b.f98909b;
            if (!(bVar2 == C66419b.UNKNOWN || bVar == bVar2)) {
                eVar5.copyOnWrite();
                C57917f fVar4 = (C57917f) eVar5.instance;
                fVar4.f154913d = bVar2.f180604g;
                fVar4.f154910a |= 4;
            }
            C58800sl lA = eVar4.mo40800f().keySet().iterator();
            while (lA.hasNext()) {
                String str = (String) lA.next();
                Set<String> set = (Set) eVar4.mo40800f().get(str);
                if (set != null) {
                    for (String fVar5 : set) {
                        C58800sl slVar = lA;
                        C37235f fVar6 = new C37235f(str, fVar5);
                        if (!hashMap.containsKey(fVar6)) {
                            hashMap.put(fVar6, Integer.valueOf(hashMap.size() + 1));
                        }
                        int intValue = ((Integer) hashMap.get(fVar6)).intValue();
                        eVar5.copyOnWrite();
                        C57917f fVar7 = (C57917f) eVar5.instance;
                        C66419b bVar3 = bVar;
                        C62961ch chVar = fVar7.f154914e;
                        if (!chVar.mo58948c()) {
                            fVar7.f154914e = C62942bv.mutableCopy(chVar);
                        }
                        fVar7.f154914e.mo58916g(intValue);
                        lA = slVar;
                        bVar = bVar3;
                    }
                }
            }
            C66419b bVar4 = bVar;
            int i7 = ((C57917f) eVar5.instance).f154910a;
            if ((i7 & 1) != 0 || (i7 & 4) != 0 || !eVar4.mo40800f().isEmpty()) {
                C57918g gVar2 = (C57918g) C57920i.f154916f.createBuilder();
                gVar2.copyOnWrite();
                C57920i iVar2 = (C57920i) gVar2.instance;
                C57917f fVar8 = (C57917f) eVar5.build();
                fVar8.getClass();
                iVar2.f154922e = fVar8;
                iVar2.f154918a |= 16;
                C57920i iVar3 = (C57920i) gVar2.buildPartial();
                aVar.copyOnWrite();
                C57913b bVar5 = (C57913b) aVar.instance;
                iVar3.getClass();
                C57920i iVar4 = bVar5.f154901b;
                if (iVar4 == null || iVar4 == (iVar = C57920i.f154916f)) {
                    bVar5.f154901b = iVar3;
                } else {
                    C57918g gVar3 = (C57918g) iVar.createBuilder(iVar4);
                    gVar3.mergeFrom(iVar3);
                    bVar5.f154901b = (C57920i) gVar3.buildPartial();
                }
                bVar5.f154900a |= 1;
            }
            cVar.mo62624a((C57913b) aVar.build());
            hashSet.addAll(eVar4.mo40801g());
            i5++;
            i2 = i;
            bVar = bVar4;
            i3 = 1;
        }
        int b2 = gVar.mo40836b();
        cVar.copyOnWrite();
        C71189f fVar9 = (C71189f) cVar.instance;
        int i8 = b2 - 1;
        if (b2 != 0) {
            fVar9.f189937b = i8;
            fVar9.f189936a |= 1;
            C37256e eVar6 = (C37256e) a2.get(0);
            C37256e eVar7 = (C37256e) C58557jl.m90131l(a2);
            C37234c cVar2 = eVar7.mo40798c().f98881f;
            b.mo40856e(cVar2);
            if (gVar.mo40836b() != 3) {
                C57913b bVar6 = (C57913b) eVar6.mo40797b().build();
                cVar.copyOnWrite();
                C71189f fVar10 = (C71189f) cVar.instance;
                bVar6.getClass();
                fVar10.f189941f = bVar6;
                fVar10.f189936a |= 8;
            }
            if (gVar.mo40836b() != 4) {
                C57913b bVar7 = (C57913b) eVar7.mo40797b().build();
                cVar.copyOnWrite();
                C71189f fVar11 = (C71189f) cVar.instance;
                bVar7.getClass();
                fVar11.f189942g = bVar7;
                fVar11.f189936a |= 16;
                int b3 = eVar7.mo40798c().f98881f.mo40694b();
                cVar.copyOnWrite();
                C71189f fVar12 = (C71189f) cVar.instance;
                fVar12.f189936a |= 2;
                fVar12.f189939d = b3;
            } else {
                cVar.copyOnWrite();
                C71189f fVar13 = (C71189f) cVar.instance;
                fVar13.f189936a |= 2;
                fVar13.f189939d = 1;
            }
            if (!(gVar.mo40836b() == 3 || gVar.mo40836b() == 4)) {
                C57863d dVar2 = ((C57913b) eVar6.mo40797b().instance).f154902c;
                if (dVar2 == null) {
                    dVar2 = C57863d.f154580d;
                }
                C63042fg fgVar = dVar2.f154583b;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                C57863d dVar3 = ((C57913b) eVar7.mo40797b().instance).f154902c;
                if (dVar3 == null) {
                    dVar3 = C57863d.f154580d;
                }
                C63042fg fgVar2 = dVar3.f154583b;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                C62910ar e = C62953e.m95480e(fgVar, fgVar2);
                cVar.copyOnWrite();
                C71189f fVar14 = (C71189f) cVar.instance;
                e.getClass();
                fVar14.f189943h = e;
                fVar14.f189936a |= 32;
            }
            if (this.f99158h.f99045a && gVar.mo40836b() != 4 && (a = cVar2.mo40693a()) > 1) {
                cVar.copyOnWrite();
                C71189f fVar15 = (C71189f) cVar.instance;
                fVar15.f189936a |= 128;
                fVar15.f189945j = a;
                C37274a aVar2 = this.f99158h;
                if (cVar2.mo40693a() > 1 && aVar2.f99046b.nextInt(cVar2.mo40693a()) != 0) {
                    b.mo40857f(true);
                }
            }
            b.mo40855d((C71189f) cVar.build());
            ((C37311d) b).f99135a = C58528ij.m90006F(hashSet);
            return b.mo40853b();
        }
        throw null;
    }

    /* renamed from: g */
    public final void mo40832g(C37293g gVar) {
        C37309b f = mo40878f(gVar);
        synchronized (this.f99153c) {
            if (this.f99157g.mo56113h()) {
                ((C37217c) this.f99157g.mo56107c()).mo40698b(f);
                m66300i(f);
            }
        }
    }
}
