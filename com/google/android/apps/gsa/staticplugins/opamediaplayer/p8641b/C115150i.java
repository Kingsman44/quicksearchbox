package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b;

import com.google.android.apps.gsa.n.g.a;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a.C115142a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52429rk;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p3897e.p3921j.C52432rn;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52571wr;
import com.google.assistant.p3897e.p3921j.C52574wu;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62909aq;
import com.google.protobuf.C62910ar;
import com.google.protos.p4838ak.p4839a.p4840a.C63281b;
import com.google.protos.p4838ak.p4839a.p4840a.C63287h;
import com.google.protos.p4838ak.p4839a.p4840a.C63288i;
import com.google.protos.p4838ak.p4839a.p4840a.C63290k;
import com.google.protos.p4838ak.p4839a.p4840a.C63293n;
import com.google.protos.p4838ak.p4839a.p4840a.C63295p;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.b.i */
/* compiled from: PG */
public final class C115150i extends C115141a {

    /* renamed from: a */
    public static final C59071e f319575a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.b.i");

    /* renamed from: b */
    private static final C65753ak f319576b = C65753ak.PLAYBACK;

    /* renamed from: c */
    private final C21370a f319577c;

    /* renamed from: d */
    private final C86054o f319578d;

    /* renamed from: e */
    private final u f319579e;

    /* renamed from: f */
    private final a f319580f;

    /* renamed from: g */
    private C58833ax f319581g;

    /* renamed from: h */
    private C58833ax f319582h;

    /* renamed from: i */
    private int f319583i = 2;

    public C115150i(C21370a aVar, C86054o oVar, u uVar, a aVar2) {
        this.f319577c = aVar;
        this.f319578d = oVar;
        this.f319579e = uVar;
        this.f319580f = aVar2;
        C58836b bVar = C58836b.f156633a;
        this.f319582h = bVar;
        this.f319581g = bVar;
    }

    /* renamed from: d */
    private final void m190843d(C63288i iVar, C84275o oVar) {
        C58833ax axVar;
        C52574wu wuVar;
        C52574wu wuVar2;
        C52574wu wuVar3;
        C52574wu wuVar4;
        C63288i iVar2 = iVar;
        if (this.f319582h.mo56113h()) {
            C58833ax c = C115485b.m191569c((String) oVar.mo77806l().mo56107c());
            if (c.mo56113h()) {
                int i = 0;
                while (true) {
                    if (i >= ((C52176ia) this.f319582h.mo56107c()).f136914b.size()) {
                        axVar = C58836b.f156633a;
                        break;
                    }
                    C52174hz hzVar = (C52174hz) ((C52176ia) this.f319582h.mo56107c()).f136914b.get(i);
                    if (((String) c.mo56107c()).equals(hzVar.f136895b)) {
                        axVar = C58833ax.m90834k(hzVar);
                        break;
                    }
                    i++;
                }
            } else {
                axVar = C58836b.f156633a;
            }
        } else {
            axVar = C58836b.f156633a;
        }
        if (!axVar.mo56113h()) {
            C59104x c2 = f319575a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "NewsEventLogger");
            ((C59052c) ((C59052c) c2).mo56372aa(29700)).mo56389s("Couldn't find mediaItem for playbackState %s", oVar);
            return;
        }
        C84275o oVar2 = oVar;
        C52568wo woVar = ((C52174hz) axVar.mo56107c()).f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 18) {
            wuVar = (C52574wu) woVar.f137997d;
        } else {
            wuVar = C52574wu.f138026h;
        }
        if ((wuVar.f138028a & 2) != 0) {
            C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
            long g = oVar.mo77801g();
            aqVar.copyOnWrite();
            ((C62910ar) aqVar.instance).f169860a = g / 1000;
            C62910ar arVar = (C62910ar) aqVar.build();
            if (woVar.f137996c == 18) {
                wuVar2 = (C52574wu) woVar.f137997d;
            } else {
                wuVar2 = C52574wu.f138026h;
            }
            String str = wuVar2.f138030c;
            int a = C63287h.m96222a(((C63290k) iVar2.instance).f171042g);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                C115142a.m190820d(78188, str, arVar);
            } else if (i2 == 2) {
                C115142a.m190820d(78189, str, arVar);
            } else if (i2 == 3) {
                C115142a.m190820d(78190, str, arVar);
            } else if (i2 == 4) {
                C115142a.m190820d(78191, str, arVar);
            }
            if (woVar.f137996c == 18) {
                wuVar3 = (C52574wu) woVar.f137997d;
            } else {
                wuVar3 = C52574wu.f138026h;
            }
            if (wuVar3.f138031d) {
                if ((woVar.f137994a & 1) != 0) {
                    String str2 = woVar.f137998e;
                    iVar.copyOnWrite();
                    C63290k kVar = (C63290k) iVar2.instance;
                    str2.getClass();
                    kVar.f171036a |= 2;
                    kVar.f171040e = str2;
                }
                int d = oVar.mo77798d() > 0 ? (int) (oVar.mo77798d() / 1000) : woVar.f138008o;
                int i3 = this.f319583i;
                iVar.copyOnWrite();
                C63290k kVar2 = (C63290k) iVar2.instance;
                kVar2.f171045j = C63281b.m96221a(i3);
                kVar2.f171036a |= 1024;
                long b = this.f319577c.mo26870b();
                iVar.copyOnWrite();
                C63290k kVar3 = (C63290k) iVar2.instance;
                kVar3.f171036a |= 4096;
                kVar3.f171047l = 1000 * b;
                iVar.copyOnWrite();
                C63290k kVar4 = (C63290k) iVar2.instance;
                str.getClass();
                kVar4.f171036a |= 1;
                kVar4.f171039d = str;
                String str3 = ((C52174hz) axVar.mo56107c()).f136895b;
                iVar.copyOnWrite();
                C63290k kVar5 = (C63290k) iVar2.instance;
                str3.getClass();
                kVar5.f171036a |= 4;
                kVar5.f171041f = str3;
                int b2 = oVar.mo77796b();
                iVar.copyOnWrite();
                C63290k kVar6 = (C63290k) iVar2.instance;
                kVar6.f171036a |= 16;
                kVar6.f171043h = b2;
                C52429rk rkVar = (C52429rk) C52432rn.f137634c.createBuilder();
                C52431rm rmVar = C52431rm.OPA_AGSA;
                rkVar.copyOnWrite();
                C52432rn rnVar = (C52432rn) rkVar.instance;
                rnVar.f137637b = rmVar.f137633ah;
                rnVar.f137636a |= 1;
                iVar.copyOnWrite();
                C63290k kVar7 = (C63290k) iVar2.instance;
                C52432rn rnVar2 = (C52432rn) rkVar.build();
                rnVar2.getClass();
                kVar7.f171046k = rnVar2;
                kVar7.f171036a |= 2048;
                iVar.copyOnWrite();
                C63290k kVar8 = (C63290k) iVar2.instance;
                arVar.getClass();
                kVar8.f171044i = arVar;
                kVar8.f171036a |= 32;
                C62909aq aqVar2 = (C62909aq) C62910ar.f169858c.createBuilder();
                aqVar2.copyOnWrite();
                ((C62910ar) aqVar2.instance).f169860a = (long) d;
                iVar.copyOnWrite();
                C63290k kVar9 = (C63290k) iVar2.instance;
                C62910ar arVar2 = (C62910ar) aqVar2.build();
                arVar2.getClass();
                kVar9.f171049n = arVar2;
                kVar9.f171036a |= 16384;
                if (woVar.f137996c == 18) {
                    wuVar4 = (C52574wu) woVar.f137997d;
                } else {
                    wuVar4 = C52574wu.f138026h;
                }
                String str4 = wuVar4.f138032e;
                iVar.copyOnWrite();
                C63290k kVar10 = (C63290k) iVar2.instance;
                str4.getClass();
                kVar10.f171036a |= 8192;
                kVar10.f171048m = str4;
                C63290k kVar11 = (C63290k) iVar.build();
                C59071e eVar = f319575a;
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "NewsEventLogger");
                ((C59052c) ((C59052c) b3).mo56372aa(29697)).mo56386p("Update News Playback Footprints corpus via Geller");
                String F = this.f319578d.mo79659F();
                if (F == null) {
                    C59104x c3 = eVar.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "NewsEventLogger");
                    ((C59052c) ((C59052c) c3).mo56372aa(29698)).mo56386p("accountName is null");
                    return;
                }
                C60856cj.m92911t(this.f319579e.d(F, f319576b, this.f319580f.a("type.googleapis.com/news.audio.proto.PlaybackActivity", kVar11.toByteString()), true), new C115149h(), C60826bg.f164896a);
                return;
            }
            return;
        }
        C59104x c4 = f319575a.mo56225c();
        c4.mo56378ag(C58975e.f156826a, "NewsEventLogger");
        ((C59052c) ((C59052c) c4).mo56372aa(29699)).mo56386p("guid is missing from NewsMetadata.");
    }

    /* renamed from: a */
    public final void mo77783a(C52176ia iaVar) {
        C52574wu wuVar;
        int i;
        this.f319582h = C58833ax.m90834k(iaVar);
        if (iaVar.f136914b.size() > 0) {
            C52568wo woVar = ((C52174hz) iaVar.f136914b.get(0)).f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if (woVar.f137996c == 18) {
                wuVar = (C52574wu) woVar.f137997d;
            } else {
                wuVar = C52574wu.f138026h;
            }
            int a = C52571wr.m86651a(wuVar.f138029b);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                i = 3;
            } else if (i2 != 2) {
                this.f319583i = 2;
                return;
            } else {
                i = 4;
            }
            this.f319583i = i;
        }
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        if (!oVar.mo77806l().mo56113h()) {
            this.f319581g = C58836b.f156633a;
            return;
        }
        C58833ax b = C115485b.m191568b((String) oVar.mo77806l().mo56107c());
        if (!b.mo56113h() || b.mo56107c() != C52567wn.NEWS) {
            this.f319581g = C58836b.f156633a;
            return;
        }
        C58833ax axVar = this.f319581g;
        if (axVar.mo56113h() && oVar.mo77796b() != ((C84275o) axVar.mo56107c()).mo77796b() && !((C84275o) axVar.mo56107c()).mo77811q()) {
            C63288i iVar = (C63288i) C63290k.f171034p.createBuilder();
            iVar.copyOnWrite();
            C63290k kVar = (C63290k) iVar.instance;
            int i = 3;
            kVar.f171042g = 3;
            kVar.f171036a |= 8;
            C63293n nVar = (C63293n) C63295p.f171054c.createBuilder();
            if (oVar.mo77796b() - ((C84275o) axVar.mo56107c()).mo77796b() > 0) {
                i = 2;
            }
            nVar.copyOnWrite();
            C63295p pVar = (C63295p) nVar.instance;
            pVar.f171057b = i - 1;
            pVar.f171056a |= 1;
            iVar.copyOnWrite();
            C63290k kVar2 = (C63290k) iVar.instance;
            C63295p pVar2 = (C63295p) nVar.build();
            pVar2.getClass();
            kVar2.f171038c = pVar2;
            kVar2.f171037b = 8;
            m190843d(iVar, (C84275o) axVar.mo56107c());
        }
        if ((!axVar.mo56113h() || !((C84275o) axVar.mo56107c()).mo77814t()) && oVar.mo77814t()) {
            C63288i iVar2 = (C63288i) C63290k.f171034p.createBuilder();
            iVar2.copyOnWrite();
            C63290k kVar3 = (C63290k) iVar2.instance;
            kVar3.f171042g = 1;
            kVar3.f171036a |= 8;
            m190843d(iVar2, oVar);
        }
        if ((!axVar.mo56113h() || !((C84275o) axVar.mo56107c()).mo77813s()) && oVar.mo77813s()) {
            C63288i iVar3 = (C63288i) C63290k.f171034p.createBuilder();
            iVar3.copyOnWrite();
            C63290k kVar4 = (C63290k) iVar3.instance;
            kVar4.f171042g = 2;
            kVar4.f171036a |= 8;
            m190843d(iVar3, oVar);
        }
        this.f319581g = C58833ax.m90834k(oVar);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo101846c(C84269i iVar, C84271k kVar) {
    }
}
