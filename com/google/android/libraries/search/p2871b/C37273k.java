package com.google.android.libraries.search.p2871b;

import android.os.Process;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.p2871b.p2891f.C37236a;
import com.google.android.libraries.search.p2871b.p2891f.C37237b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37256e;
import com.google.android.libraries.search.p2871b.p2900n.C37299a;
import com.google.android.libraries.search.p2871b.p2900n.C37303b;
import com.google.android.libraries.search.p2871b.p2900n.C37304c;
import com.google.android.libraries.search.p2871b.p2900n.p2901a.C37301b;
import com.google.android.libraries.search.p2871b.p2900n.p2901a.C37302c;
import com.google.android.libraries.search.p2871b.p2902o.C37306a;
import com.google.android.libraries.search.p2871b.p2902o.C37309b;
import com.google.apps.tiktok.tracing.C47559bj;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4419bx.C57860a;
import com.google.p4419bx.C57863d;
import com.google.p4438c.p4439a.C57912a;
import com.google.p4438c.p4439a.C57913b;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.HashSet;
import p5535j.p5536a.p5562i.p5563a.p5564a.p5565a.C71182a;
import p5535j.p5536a.p5562i.p5563a.p5564a.p5565a.C71183b;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71186c;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71187d;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71188e;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.libraries.search.b.k */
/* compiled from: PG */
public final /* synthetic */ class C37273k implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C37298n f99042a;

    /* renamed from: b */
    public final /* synthetic */ C37254c f99043b;

    /* renamed from: c */
    public final /* synthetic */ long f99044c;

    public /* synthetic */ C37273k(C37298n nVar, C37254c cVar, long j) {
        this.f99042a = nVar;
        this.f99043b = cVar;
        this.f99044c = j;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C37256e eVar;
        C37304c cVar;
        C58833ax axVar;
        C37298n nVar = this.f99042a;
        C37254c cVar2 = this.f99043b;
        long j = this.f99044c;
        C37252a c = cVar2.mo40779c();
        if (nVar.f99112g.mo40711c() && nVar.f99109d.mo40769e()) {
            C47559bj c2 = C47831fm.m85008c(C37299a.f99116a);
            if (c2.mo51420b()) {
                cVar = (C37304c) c2.mo51419a();
            } else {
                cVar = C37304c.f99122a;
            }
            C58800sl lA = C58528ij.m90006F(cVar.f99123b).iterator();
            if (!lA.hasNext()) {
                C47559bj c3 = C47831fm.m85008c(C37302c.f99121a);
                if (c3.mo51420b()) {
                    axVar = C58833ax.m90834k((C37301b) c3.mo51419a());
                } else {
                    axVar = C58836b.f156633a;
                }
                if (axVar.mo56113h() && !c.mo40784h()) {
                    int i = ((C37301b) axVar.mo56107c()).f99119a;
                    int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    } else if (i3 == 0) {
                        C37301b bVar = (C37301b) axVar.mo56107c();
                        c.mo40794r(bVar.f99119a == 1 ? (String) bVar.f99120b : BuildConfig.FLAVOR);
                    } else if (i3 == 1) {
                        C37301b bVar2 = (C37301b) axVar.mo56107c();
                        c.mo40793q(bVar2.f99119a == 2 ? ((Long) bVar2.f99120b).longValue() : 0);
                    }
                }
            } else {
                C37303b bVar3 = (C37303b) lA.next();
                throw null;
            }
        }
        if (c.mo40783g() && c.mo40777a() > j) {
            if (!nVar.f99112g.mo40710b()) {
                c.mo40791o(j);
            } else {
                throw new IllegalArgumentException("Timestamp of the event being logged is in te future. If this is happening in test, advance the test clock so that the event timestamp would be in the past.");
            }
        }
        HashSet hashSet = new HashSet();
        if (nVar.f99112g.mo40709a()) {
            C71182a aVar = (C71182a) C71183b.f189922d.createBuilder();
            int myPid = Process.myPid();
            aVar.copyOnWrite();
            C71183b bVar4 = (C71183b) aVar.instance;
            bVar4.f189925a |= 1;
            bVar4.f189926b = (long) myPid;
            long j2 = nVar.f99113h;
            aVar.copyOnWrite();
            C71183b bVar5 = (C71183b) aVar.instance;
            bVar5.f189925a |= 2;
            bVar5.f189927c = j2;
            c.mo40792p(C71183b.f189923e, (C71183b) aVar.build());
            eVar = c.mo40782f();
            if (!eVar.mo40798c().f98878c) {
                C37256e f = c.mo40782f();
                C37306a b = C37309b.m66264b();
                C71186c cVar3 = (C71186c) C71189f.f189934k.createBuilder();
                int i4 = f.mo40798c().f98876a.f98907b.f98908a;
                C66419b bVar6 = f.mo40798c().f98876a.f98907b.f98909b;
                if (bVar6 != C66419b.UNKNOWN) {
                    C71187d dVar = (C71187d) C71188e.f189929d.createBuilder();
                    int intValue = ((Integer) nVar.f99109d.mo40765a().mo56107c()).intValue();
                    dVar.copyOnWrite();
                    C71188e eVar2 = (C71188e) dVar.instance;
                    eVar2.f189931a |= 1;
                    eVar2.f189932b = intValue;
                    dVar.copyOnWrite();
                    C71188e eVar3 = (C71188e) dVar.instance;
                    eVar3.f189933c = bVar6.f180604g;
                    eVar3.f189931a |= 2;
                    cVar3.copyOnWrite();
                    C71189f fVar = (C71189f) cVar3.instance;
                    C71188e eVar4 = (C71188e) dVar.build();
                    eVar4.getClass();
                    fVar.f189944i = eVar4;
                    fVar.f189936a |= 64;
                } else {
                    cVar3.copyOnWrite();
                    C71189f fVar2 = (C71189f) cVar3.instance;
                    fVar2.f189936a |= 4;
                    fVar2.f189940e = i4;
                }
                cVar3.mo62624a((C57913b) f.mo40797b().build());
                cVar3.copyOnWrite();
                C71189f fVar3 = (C71189f) cVar3.instance;
                fVar3.f189936a |= 2;
                fVar3.f189939d = 2;
                cVar3.copyOnWrite();
                C71189f fVar4 = (C71189f) cVar3.instance;
                fVar4.f189937b = 8;
                fVar4.f189936a |= 1;
                b.mo40856e(f.mo40798c().f98881f);
                b.mo40855d((C71189f) cVar3.build());
                hashSet.add(nVar.mo40698b(b.mo40853b()));
            }
        } else {
            eVar = c.mo40782f();
        }
        if (!eVar.mo40799e().mo56113h()) {
            C57912a b2 = eVar.mo40797b();
            C57860a aVar2 = (C57860a) C57863d.f154580d.createBuilder();
            C63042fg j3 = C62953e.m95485j(j);
            aVar2.copyOnWrite();
            C57863d dVar2 = (C57863d) aVar2.instance;
            j3.getClass();
            dVar2.f154583b = j3;
            dVar2.f154582a |= 1;
            b2.mo54538a((C57863d) aVar2.build());
        }
        synchronized (nVar.f99106a) {
            C58800sl lA2 = nVar.f99109d.mo40766b().iterator();
            while (lA2.hasNext()) {
                ((C37237b) lA2.next()).mo40742b();
            }
            C58800sl lA3 = nVar.f99108c.iterator();
            while (lA3.hasNext()) {
                ((C37236a) lA3.next()).mo40738a();
            }
        }
        C58800sl lA4 = nVar.f99110e.mo40717c(eVar).iterator();
        while (lA4.hasNext()) {
            hashSet.add(nVar.mo40698b((C37309b) lA4.next()));
        }
        return C47638k.m84752c(hashSet).mo51520a(C37286m.f99087a, nVar.f99111f.mo40702d());
    }
}
