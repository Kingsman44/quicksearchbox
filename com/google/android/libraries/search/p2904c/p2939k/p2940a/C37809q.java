package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37664hk;
import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.C37678hy;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2911c.C37423a;
import com.google.android.libraries.search.p2904c.p2911c.C37446p;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2967t.p2969b.C38025ah;
import com.google.android.libraries.search.p2904c.p2982x.C38235ar;
import com.google.android.libraries.search.p2904c.p2982x.C38267z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.k.a.q */
/* compiled from: PG */
final class C37809q implements C70862aj {

    /* renamed from: a */
    public C2164c f100316a;

    /* renamed from: b */
    public C2164c f100317b;

    /* renamed from: c */
    private final C58881cr f100318c;

    /* renamed from: d */
    private final C58881cr f100319d;

    /* renamed from: e */
    private final C2164c f100320e;

    /* renamed from: f */
    private final C38025ah f100321f;

    /* renamed from: g */
    private final C60870cx f100322g = C2169h.m6027a(new C37807o(this));

    /* renamed from: h */
    private final C60870cx f100323h = C2169h.m6027a(new C37808p(this));

    public C37809q(C2164c cVar, C58881cr crVar, C58881cr crVar2, C38025ah ahVar) {
        this.f100320e = cVar;
        this.f100321f = ahVar;
        this.f100318c = crVar;
        this.f100319d = crVar2;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C2164c cVar = this.f100320e;
        C38025ah ahVar = this.f100321f;
        C37678hy hyVar = (C37678hy) C37679hz.f100067c.createBuilder();
        hyVar.copyOnWrite();
        C37679hz hzVar = (C37679hz) hyVar.instance;
        hzVar.f100069a |= 1;
        hzVar.f100070b = -1;
        C37561eb i = C37846as.m66803i(C37519dz.FAILED_OPENING_GRPC_START_LISTENING_HOTWORD_STATUS_NOT_RECEIVED);
        C58836b bVar = C58836b.f156633a;
        cVar.mo5437b(ahVar.mo41205a((C37679hz) hyVar.build(), i, bVar, bVar, bVar, this.f100322g));
        this.f100316a.mo5437b(C37846as.m66807m(C37846as.m66801g(C37512ds.FAILED_CLOSING_ERROR_IN_GRPC_START_LISTENING), C37565ef.UNSET));
        this.f100317b.mo5437b(C37397bb.f99320c);
        C58838bb.m90884s(((C58833ax) this.f100318c.mo6453a()).mo56113h() ^ ((C58833ax) this.f100319d.mo6453a()).mo56113h(), "Only one WriteableAudioBuffer implementation can be present.");
        if (((C58833ax) this.f100319d.mo6453a()).mo56113h()) {
            ((C37446p) ((C58833ax) this.f100319d.mo6453a()).mo56107c()).mo40891i();
        } else {
            ((C37423a) ((C58833ax) this.f100318c.mo6453a()).mo56107c()).mo40891i();
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x d = C37810r.f100324a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.GrpcHWClient");
        ((C59052c) ((C59052c) d).mo56372aa(52800)).mo56386p("#audio# Error in receiving streamHotwordStartListeningResponse.");
        mo20121a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C38267z zVar;
        C58833ax axVar;
        C58833ax axVar2;
        C58833ax axVar3;
        C38235ar arVar = (C38235ar) obj;
        int i = arVar.f101331a;
        if (i == 1) {
            C58838bb.m90884s(((C58833ax) this.f100318c.mo6453a()).mo56113h() ^ ((C58833ax) this.f100319d.mo6453a()).mo56113h(), "Only one WriteableAudioBuffer implementation can be present.");
            if (arVar.f101331a == 1) {
                zVar = (C38267z) arVar.f101332b;
            } else {
                zVar = C38267z.f101378d;
            }
            C37664hk hkVar = zVar.f101381b;
            if (hkVar == null) {
                hkVar = C37664hk.f100038c;
            }
            C37561eb ebVar = hkVar.f100041b;
            if (ebVar == null) {
                ebVar = C37561eb.f99800c;
            }
            C37561eb ebVar2 = ebVar;
            C2164c cVar = this.f100320e;
            C38025ah ahVar = this.f100321f;
            C37679hz hzVar = zVar.f101382c;
            if (hzVar == null) {
                hzVar = C37679hz.f100067c;
            }
            C37679hz hzVar2 = hzVar;
            if (ebVar2.f99802a == 1) {
                axVar = ((C58833ax) this.f100318c.mo6453a()).mo56106b(C37805m.f100312a);
            } else {
                axVar = C58836b.f156633a;
            }
            C58833ax axVar4 = axVar;
            if (ebVar2.f99802a == 1) {
                axVar2 = ((C58833ax) this.f100319d.mo6453a()).mo56106b(C37806n.f100313a);
            } else {
                axVar2 = C58836b.f156633a;
            }
            C58833ax axVar5 = axVar2;
            if (ebVar2.f99802a == 1) {
                axVar3 = C58833ax.m90834k(this.f100323h);
            } else {
                axVar3 = C58836b.f156633a;
            }
            cVar.mo5437b(ahVar.mo41205a(hzVar2, ebVar2, axVar4, axVar5, axVar3, this.f100322g));
        } else if (i == 6) {
            C37819l lVar = (C37819l) arVar.f101332b;
            int i2 = lVar.f100343b;
            if (i2 == 1) {
                byte[] N = ((C37680i) lVar.f100344c).f100074b.mo59174N();
                int length = N.length;
                if (length <= 0) {
                    return;
                }
                if (((C58833ax) this.f100319d.mo6453a()).mo56113h()) {
                    ((C37446p) ((C58833ax) this.f100319d.mo6453a()).mo56107c()).mo40890b(length, N);
                } else {
                    ((C37423a) ((C58833ax) this.f100318c.mo6453a()).mo56107c()).mo40890b(length, N);
                }
            } else if (i2 != 2) {
            } else {
                if (((C58833ax) this.f100319d.mo6453a()).mo56113h()) {
                    ((C37446p) ((C58833ax) this.f100319d.mo6453a()).mo56107c()).mo40891i();
                } else {
                    ((C37423a) ((C58833ax) this.f100318c.mo6453a()).mo56107c()).mo40891i();
                }
            }
        } else if (i == 5) {
            this.f100317b.mo5437b((C37397bb) arVar.f101332b);
        } else if (i == 4) {
            this.f100316a.mo5437b((C37666hm) arVar.f101332b);
        } else {
            C59104x d = C37810r.f100324a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.GrpcHWClient");
            ((C59052c) ((C59052c) d).mo56372aa(52801)).mo56386p("#audio# Invalid streamStartListeningResponse.");
        }
    }
}
