package com.google.android.apps.gsa.staticplugins.p7825dm.p7835j;

import android.content.Context;
import android.databinding.C0118a;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84397a;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.shared.p6929g.C87556d;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.libraries.lens.p2016f.C24239ad;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.android.libraries.lens.view.p2051ab.C24971d;
import com.google.android.libraries.lens.view.p2162s.C27683a;
import com.google.android.libraries.lens.view.utils.C28122k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56746a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56751ae;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56753ag;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56756aj;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56757ak;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56758b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56759c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56761e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56763g;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56765i;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56767k;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56768l;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56769m;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56770n;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56771o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56772p;
import com.google.protobuf.C62974ct;
import com.google.protos.p5124m.p5125a.C65603f;
import dagger.C68214a;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.j.b */
/* compiled from: PG */
public final class C99817b {

    /* renamed from: a */
    private static final C59071e f279241a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dm.j.b");

    /* renamed from: b */
    private final C89688a f279242b;

    /* renamed from: c */
    private final C84411o f279243c;

    /* renamed from: d */
    private final C68214a f279244d;

    /* renamed from: e */
    private final C139921f f279245e;

    /* renamed from: f */
    private final Context f279246f;

    /* renamed from: g */
    private final boolean f279247g;

    /* renamed from: h */
    private final C58485gu f279248h;

    public C99817b(C89688a aVar, C84411o oVar, C68214a aVar2, C139921f fVar, Context context, boolean z, C65603f fVar2) {
        this.f279242b = aVar;
        this.f279243c = oVar;
        this.f279244d = aVar2;
        this.f279245e = fVar;
        this.f279246f = context;
        this.f279247g = z;
        this.f279248h = C58485gu.m89842j(fVar2.f178307a);
    }

    @JavascriptInterface
    public void getLensApiCapabilities(String str, String str2) {
        C84410n a = this.f279243c.mo77963a(str, str2, this.f279242b);
        boolean z = ((C27683a) this.f279244d.mo27525b()).mo33176c("com.google.android.googlequicksearchbox") + -2 == 0;
        C56746a aVar = (C56746a) C56758b.f151481d.createBuilder();
        aVar.copyOnWrite();
        C56758b bVar = (C56758b) aVar.instance;
        bVar.f151483a |= 1;
        bVar.f151484b = z;
        if (z) {
            C56759c cVar = (C56759c) C56772p.f151501h.createBuilder();
            C56770n nVar = (C56770n) C56771o.f151498b.createBuilder();
            nVar.mo54430a(this.f279248h);
            cVar.copyOnWrite();
            C56772p pVar = (C56772p) cVar.instance;
            C56771o oVar = (C56771o) nVar.build();
            oVar.getClass();
            pVar.f151504b = oVar;
            pVar.f151503a |= 1;
            C56768l lVar = (C56768l) C56769m.f151494c.createBuilder();
            lVar.copyOnWrite();
            C56769m mVar = (C56769m) lVar.instance;
            mVar.f151496a |= 1;
            mVar.f151497b = true;
            cVar.copyOnWrite();
            C56772p pVar2 = (C56772p) cVar.instance;
            C56769m mVar2 = (C56769m) lVar.build();
            mVar2.getClass();
            pVar2.f151505c = mVar2;
            pVar2.f151503a |= 2;
            C56765i iVar = C56765i.f151490a;
            cVar.copyOnWrite();
            C56772p pVar3 = (C56772p) cVar.instance;
            iVar.getClass();
            pVar3.f151508f = iVar;
            pVar3.f151503a |= 16;
            C56763g gVar = C56763g.f151488a;
            cVar.copyOnWrite();
            C56772p pVar4 = (C56772p) cVar.instance;
            gVar.getClass();
            pVar4.f151509g = gVar;
            pVar4.f151503a |= 32;
            C56767k kVar = C56767k.f151492a;
            cVar.copyOnWrite();
            C56772p pVar5 = (C56772p) cVar.instance;
            kVar.getClass();
            pVar5.f151507e = kVar;
            pVar5.f151503a |= 8;
            if (!this.f279247g) {
                C56761e eVar = C56761e.f151486a;
                cVar.copyOnWrite();
                C56772p pVar6 = (C56772p) cVar.instance;
                eVar.getClass();
                pVar6.f151506d = eVar;
                pVar6.f151503a |= 4;
            }
            C56772p pVar7 = (C56772p) cVar.build();
            aVar.copyOnWrite();
            C56758b bVar2 = (C56758b) aVar.instance;
            pVar7.getClass();
            bVar2.f151485c = pVar7;
            bVar2.f151483a |= 2;
        }
        a.mo77961c((C56758b) aVar.build());
    }

    @JavascriptInterface
    public void startLens(String str, String str2, String str3) {
        C84410n a = this.f279243c.mo77963a(str2, str3, this.f279242b);
        if (!TextUtils.isEmpty(str)) {
            try {
                C56757ak akVar = (C56757ak) C87556d.m142212a(str, C56757ak.f151469k.getParserForType());
                C139921f fVar = this.f279245e;
                C24970c cVar = new C24970c();
                cVar.f68102j = "com.google.android.googlequicksearchbox";
                cVar.f68115w = C24971d.m46221a(C28122k.m52403c(this.f279246f));
                if ((akVar.f151471a & 1) != 0) {
                    cVar.f68101i = akVar.f151472b.mo59174N();
                }
                int i = akVar.f151471a;
                if ((i & 2) != 0) {
                    cVar.f68098f = akVar.f151473c;
                }
                if ((i & 4) != 0) {
                    cVar.f68096d = Uri.parse(akVar.f151474d);
                }
                if ((akVar.f151471a & 8) != 0) {
                    C56751ae aeVar = akVar.f151475e;
                    if (aeVar == null) {
                        aeVar = C56751ae.f151454c;
                    }
                    cVar.f68094b = C24239ad.m45245a(aeVar);
                }
                C56753ag agVar = akVar.f151476f;
                if (agVar == null) {
                    agVar = C56753ag.f151458d;
                }
                if ((agVar.f151460a & 1) != 0) {
                    C56753ag agVar2 = akVar.f151476f;
                    if (agVar2 == null) {
                        agVar2 = C56753ag.f151458d;
                    }
                    cVar.f68103k = agVar2.f151461b;
                }
                C56753ag agVar3 = akVar.f151476f;
                if (((agVar3 == null ? C56753ag.f151458d : agVar3).f151460a & 2) != 0) {
                    if (agVar3 == null) {
                        agVar3 = C56753ag.f151458d;
                    }
                    cVar.f68116x = agVar3.f151462c;
                }
                if ((akVar.f151471a & 32) != 0) {
                    cVar.f68105m = C24239ad.m45247c(akVar).intValue();
                }
                if ((akVar.f151471a & 64) != 0) {
                    Optional b = C24239ad.m45246b(akVar);
                    Objects.requireNonNull(cVar);
                    b.ifPresent(new C99816a(cVar));
                }
                C56756aj ajVar = akVar.f151478h;
                if (ajVar == null) {
                    ajVar = C56756aj.f151463e;
                }
                if ((ajVar.f151465a & 4) != 0) {
                    C56756aj ajVar2 = akVar.f151478h;
                    if (ajVar2 == null) {
                        ajVar2 = C56756aj.f151463e;
                    }
                    cVar.f68111s = ajVar2.f151468d;
                }
                int i2 = akVar.f151471a;
                if ((i2 & 128) != 0) {
                    cVar.f68118z = Long.valueOf((long) akVar.f151479i);
                }
                if ((i2 & 256) != 0) {
                    cVar.f68092C = akVar.f151480j;
                }
                fVar.mo115338b(cVar.mo30192a());
                a.mo77962d("{}");
            } catch (C62974ct | IllegalArgumentException unused) {
                C0118a.m96d(f279241a.mo56225c(), "Could not parse client input.", 32900, C58979ad.FULL);
                a.mo77959a(new C84397a());
            }
        } else {
            ((C59052c) ((C59052c) f279241a.mo56225c()).mo56372aa(32901)).mo56386p("Empty client input.");
            a.mo77959a(new C84397a());
        }
    }
}
