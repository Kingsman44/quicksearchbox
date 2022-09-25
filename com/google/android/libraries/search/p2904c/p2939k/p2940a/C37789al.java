package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.android.libraries.search.p2904c.C37413br;
import com.google.android.libraries.search.p2904c.C37414bs;
import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37636go;
import com.google.android.libraries.search.p2904c.C37638gq;
import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.C37678hy;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2911c.C37446p;
import com.google.android.libraries.search.p2904c.p2911c.C37449s;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.android.libraries.search.p2904c.p2967t.p2969b.C38045p;
import com.google.android.libraries.search.p2904c.p2967t.p2969b.C38046q;
import com.google.android.libraries.search.p2904c.p2982x.C38229al;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.k.a.al */
/* compiled from: PG */
final class C37789al implements C70862aj {

    /* renamed from: a */
    public C2164c f100262a;

    /* renamed from: b */
    public C2164c f100263b;

    /* renamed from: c */
    public C2164c f100264c;

    /* renamed from: d */
    public C2164c f100265d;

    /* renamed from: e */
    final /* synthetic */ C37790am f100266e;

    /* renamed from: f */
    private final C58881cr f100267f;

    /* renamed from: g */
    private final C58881cr f100268g;

    /* renamed from: h */
    private final C2164c f100269h;

    /* renamed from: i */
    private final C60870cx f100270i;

    /* renamed from: j */
    private final boolean f100271j;

    /* renamed from: k */
    private final C60870cx f100272k;

    /* renamed from: l */
    private final C60870cx f100273l;

    /* renamed from: m */
    private final AtomicBoolean f100274m = new AtomicBoolean(false);

    /* renamed from: n */
    private final C60870cx f100275n;

    public C37789al(C37790am amVar, C2164c cVar, C58881cr crVar, C58881cr crVar2, boolean z) {
        this.f100266e = amVar;
        this.f100269h = cVar;
        this.f100267f = crVar;
        this.f100268g = crVar2;
        this.f100271j = z;
        this.f100270i = C2169h.m6027a(new C37785ah(this));
        this.f100272k = C2169h.m6027a(new C37786ai(this));
        this.f100273l = C2169h.m6027a(new C37787aj(this));
        this.f100275n = C2169h.m6027a(new C37788ak(this));
    }

    /* renamed from: a */
    public final void mo20121a() {
        C38046q qVar = this.f100266e.f100281f;
        C37638gq gqVar = (C37638gq) C37639gr.f100004c.createBuilder();
        gqVar.copyOnWrite();
        C37639gr grVar = (C37639gr) gqVar.instance;
        grVar.f100006a |= 1;
        grVar.f100007b = -1;
        C37678hy hyVar = (C37678hy) C37679hz.f100067c.createBuilder();
        hyVar.copyOnWrite();
        C37679hz hzVar = (C37679hz) hyVar.instance;
        hzVar.f100069a |= 1;
        hzVar.f100070b = -1;
        C37561eb i = C37846as.m66803i(C37519dz.FAILED_OPENING_GRPC_START_LISTENING_STATUS_NOT_RECEIVED);
        C58836b bVar = C58836b.f156633a;
        C38045p a = qVar.mo41219a((C37639gr) gqVar.build(), (C37679hz) hyVar.build(), i, bVar, bVar, bVar, this.f100272k);
        C37799g gVar = this.f100266e.f100283h;
        C37413br brVar = (C37413br) C37414bs.f99343c.createBuilder();
        brVar.copyOnWrite();
        C37414bs bsVar = (C37414bs) brVar.instance;
        bsVar.f99346b = 4;
        bsVar.f99345a |= 1;
        this.f100269h.mo5437b(new C37636go(gVar.mo41089a(-1, C60856cj.m92900i((C37414bs) brVar.build())), a));
        this.f100262a.mo5437b(C37397bb.f99320c);
        this.f100263b.mo5437b(C37846as.m66799e(C37846as.m66801g(C37512ds.FAILED_CLOSING_ERROR_IN_GRPC_START_LISTENING), C37565ef.UNSET));
        this.f100264c.mo5437b(a);
        C58838bb.m90884s(((C58833ax) this.f100267f.mo6453a()).mo56113h() ^ ((C58833ax) this.f100268g.mo6453a()).mo56113h(), "Only one WriteableAudioBuffer implementation can be present.");
        if (((C58833ax) this.f100268g.mo6453a()).mo56113h()) {
            ((C37446p) ((C58833ax) this.f100268g.mo6453a()).mo56107c()).mo40891i();
        } else {
            ((C37449s) ((C58833ax) this.f100267f.mo6453a()).mo56107c()).f99422a.mo40891i();
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) C37790am.f100276a.mo56226d()).mo56372aa(52805)).mo56386p("#audio# Error in receiving streamStartListeningResponse.");
        mo20121a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C38229al alVar;
        C58833ax axVar;
        C58833ax axVar2;
        C58833ax axVar3;
        C38237at atVar = (C38237at) obj;
        int i = atVar.f101335a;
        if (i == 1) {
            C58838bb.m90884s(((C58833ax) this.f100267f.mo6453a()).mo56113h() ^ ((C58833ax) this.f100268g.mo6453a()).mo56113h(), "Only one WriteableAudioBuffer implementation can be present.");
            if (atVar.f101335a == 1) {
                alVar = (C38229al) atVar.f101336b;
            } else {
                alVar = C38229al.f101316f;
            }
            C37416bu buVar = alVar.f101319b;
            if (buVar == null) {
                buVar = C37416bu.f99347c;
            }
            C37561eb ebVar = buVar.f99350b;
            if (ebVar == null) {
                ebVar = C37561eb.f99800c;
            }
            C37561eb ebVar2 = ebVar;
            C38046q qVar = this.f100266e.f100281f;
            C37639gr grVar = alVar.f101320c;
            if (grVar == null) {
                grVar = C37639gr.f100004c;
            }
            C37639gr grVar2 = grVar;
            C37679hz hzVar = alVar.f101321d;
            if (hzVar == null) {
                hzVar = C37679hz.f100067c;
            }
            C37679hz hzVar2 = hzVar;
            if (ebVar2.f99802a == 1) {
                axVar = ((C58833ax) this.f100267f.mo6453a()).mo56106b(C37783af.f100256a);
            } else {
                axVar = C58836b.f156633a;
            }
            C58833ax axVar4 = axVar;
            if (ebVar2.f99802a == 1) {
                axVar2 = ((C58833ax) this.f100268g.mo6453a()).mo56106b(C37784ag.f100257a);
            } else {
                axVar2 = C58836b.f156633a;
            }
            C58833ax axVar5 = axVar2;
            if (ebVar2.f99802a == 1) {
                axVar3 = C58833ax.m90834k(this.f100270i);
            } else {
                axVar3 = C58836b.f156633a;
            }
            C38045p a = qVar.mo41219a(grVar2, hzVar2, ebVar2, axVar4, axVar5, axVar3, this.f100272k);
            this.f100264c.mo5437b(a);
            C37799g gVar = this.f100266e.f100283h;
            C37639gr grVar3 = alVar.f101320c;
            if (grVar3 == null) {
                grVar3 = C37639gr.f100004c;
            }
            this.f100269h.mo5437b(new C37636go(gVar.mo41089a(grVar3.f100007b, this.f100275n), a));
            if (this.f100271j) {
                C37790am amVar = this.f100266e;
                C37639gr grVar4 = alVar.f101320c;
                if (grVar4 == null) {
                    grVar4 = C37639gr.f100004c;
                }
                amVar.mo41087b(grVar4, this.f100265d);
            }
        } else if (i == 6) {
            C37819l lVar = (C37819l) atVar.f101336b;
            if (((C58833ax) this.f100268g.mo6453a()).mo56113h()) {
                int i2 = lVar.f100343b;
                if (i2 == 1) {
                    byte[] N = ((C37680i) lVar.f100344c).f100074b.mo59174N();
                    int length = N.length;
                    if (length > 0) {
                        ((C37446p) ((C58833ax) this.f100268g.mo6453a()).mo56107c()).mo40890b(length, N);
                    }
                } else if (i2 == 2) {
                    ((C37446p) ((C58833ax) this.f100268g.mo6453a()).mo56107c()).mo40891i();
                }
            } else {
                int i3 = lVar.f100343b;
                if (i3 == 1) {
                    byte[] N2 = ((C37680i) lVar.f100344c).f100074b.mo59174N();
                    int length2 = N2.length;
                    if (length2 > 0) {
                        try {
                            ((C37449s) ((C58833ax) this.f100267f.mo6453a()).mo56107c()).mo40975b(length2, N2);
                        } catch (C37901c unused) {
                            if (this.f100274m.compareAndSet(false, true)) {
                                C37790am amVar2 = this.f100266e;
                                C60870cx cxVar = this.f100273l;
                                ((C59052c) ((C59052c) C37790am.f100276a.mo56224b()).mo56372aa(52811)).mo56386p("#audio# stopAudioRequestListening");
                                C60856cj.m92911t(cxVar, C47810es.m84974n(new C37782ae()), amVar2.f100279d);
                                ((C37449s) ((C58833ax) this.f100267f.mo6453a()).mo56107c()).f99422a.mo40891i();
                            }
                        }
                    }
                } else if (i3 == 2) {
                    ((C37449s) ((C58833ax) this.f100267f.mo6453a()).mo56107c()).f99422a.mo40891i();
                }
            }
        } else if (i == 4) {
            this.f100262a.mo5437b((C37397bb) atVar.f101336b);
        } else if (i == 5) {
            this.f100263b.mo5437b((C37418bw) atVar.f101336b);
        } else {
            ((C59052c) ((C59052c) C37790am.f100276a.mo56226d()).mo56372aa(52806)).mo56386p("#audio# Invalid streamStartListeningResponse.");
        }
    }
}
