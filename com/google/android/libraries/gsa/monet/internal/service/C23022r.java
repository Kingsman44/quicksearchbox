package com.google.android.libraries.gsa.monet.internal.service;

import com.google.android.apps.gsa.shared.monet.C90349t;
import com.google.android.libraries.gsa.monet.internal.shared.C23039d;
import com.google.android.libraries.gsa.monet.internal.shared.C23040e;
import com.google.android.libraries.gsa.monet.internal.shared.C23042g;
import com.google.android.libraries.gsa.monet.internal.shared.C23045j;
import com.google.android.libraries.gsa.monet.internal.shared.C23047l;
import com.google.android.libraries.gsa.monet.service.C23050a;
import com.google.android.libraries.gsa.monet.service.C23054e;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23063n;
import com.google.android.libraries.gsa.monet.shared.C23079aj;
import com.google.android.libraries.gsa.monet.shared.C23081al;
import com.google.android.libraries.gsa.monet.shared.C23082am;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23085ap;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23090d;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23091e;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23093g;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23096b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23100c;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23101d;
import java.util.HashMap;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.r */
/* compiled from: PG */
public final class C23022r {

    /* renamed from: a */
    public final C23082am f63340a;

    /* renamed from: b */
    private final C23045j f63341b;

    /* renamed from: c */
    private final C23016l f63342c;

    /* renamed from: d */
    private final C23084ao f63343d;

    /* renamed from: e */
    private final C23128x f63344e;

    /* renamed from: f */
    private final C23039d f63345f;

    public C23022r(C23045j jVar, C23019o oVar, C23016l lVar, C23084ao aoVar, C23128x xVar, C23039d dVar, C23093g gVar) {
        this.f63341b = jVar;
        this.f63342c = lVar;
        this.f63343d = aoVar;
        this.f63344e = xVar;
        this.f63345f = dVar;
        this.f63340a = (C23082am) gVar.mo28553b(C23082am.f63431a);
        HashMap hashMap = new HashMap();
        C23090d.m43273a("TYPE_DISPLAY_COORDINATOR", oVar, hashMap);
        jVar.mo28396b("SCOPE_INTERNAL_MONET", new C23063n(new C23091e(hashMap)));
    }

    /* renamed from: a */
    public final C23015k mo28446a(String str, C23129y yVar, ProtoParcelable protoParcelable, C23029y yVar2, boolean z, C23081al alVar) {
        ProtoParcelable protoParcelable2;
        C23129y yVar3 = yVar;
        C23029y yVar4 = yVar2;
        C23067b.m43229b((protoParcelable == null) != (yVar4 == null), "Exactly one of initializationData and restoreData must be null.");
        String str2 = yVar3.f63476a;
        C23050a aVar = (C23050a) this.f63341b.mo28395a(str2);
        if (aVar != null) {
            C23042g gVar = new C23042g(str, yVar3);
            C23047l lVar = new C23047l(yVar3, this.f63343d, this.f63341b, this.f63344e);
            C23016l lVar2 = this.f63342c;
            C23047l lVar3 = new C23047l(yVar3, this.f63343d, this.f63341b, this.f63344e);
            this.f63345f.mo28461a(this.f63341b, yVar3, lVar);
            C90349t tVar = (C90349t) lVar2.f63325b.mo17428b();
            C23015k kVar = r0;
            C23015k kVar2 = new C23015k((C23084ao) lVar2.f63324a.mo17428b(), (C23128x) lVar2.f63326c.mo17428b(), (C23021q) lVar2.f63327d.mo17428b(), (C23004aa) lVar2.f63328e.mo17428b(), (C23040e) lVar2.f63329f.mo17428b(), this, lVar, lVar3, gVar, alVar, (C23096b) lVar2.f63330g.mo17428b());
            C23056g a = aVar.mo28487a(yVar3.f63477b, kVar);
            if (a != null) {
                C23067b.m43234g(kVar.f63310e == C23014j.UNINITIALIZED, "Cannot initialize a ControllerWrapper in state %s", kVar.f63310e);
                C23067b.m43229b((protoParcelable == null) != (yVar4 == null), "Exactly one of inputData and restoreData must be null.");
                boolean iA = a.mo28438iA();
                kVar.f63317l = z && iA;
                boolean z2 = z && !iA;
                ProtoParcelable protoParcelable3 = null;
                if (yVar4 != null) {
                    C23067b.m43233f(z2 == (yVar4.f63356d != null), "Input data should be present exactly when needed.");
                } else {
                    yVar4 = null;
                }
                if (z2) {
                    C23042g gVar2 = kVar.f63312g;
                    if (protoParcelable != null) {
                        protoParcelable3 = protoParcelable;
                        protoParcelable2 = protoParcelable3;
                    } else {
                        yVar4.getClass();
                        protoParcelable2 = yVar4.f63356d;
                        protoParcelable2.getClass();
                    }
                    gVar2.f63392e = protoParcelable2;
                } else {
                    protoParcelable3 = protoParcelable;
                }
                kVar.f63316k = a;
                if (yVar4 == null) {
                    protoParcelable3.getClass();
                    kVar.mo28431u(protoParcelable3);
                } else if (!kVar.f63317l) {
                    ProtoParcelable protoParcelable4 = yVar4.f63356d;
                    protoParcelable4.getClass();
                    kVar.mo28431u(protoParcelable4);
                } else {
                    kVar.f63312g.mo28476l(yVar4.f63355c);
                    C23028x xVar = new C23028x(kVar, yVar4);
                    C23088b bVar = new C23088b(kVar.f63313h);
                    int size = bVar.size();
                    for (int i = 0; i < size; i++) {
                        ((C23054e) bVar.get(i)).mo28489b(xVar);
                    }
                    C23056g gVar3 = kVar.f63316k;
                    gVar3.getClass();
                    C23128x xVar2 = kVar.f63306a;
                    C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
                    cVar.copyOnWrite();
                    C23101d dVar = (C23101d) cVar.instance;
                    dVar.f63452d = 6;
                    dVar.f63449a |= 1;
                    String str3 = kVar.f63312g.f63388a;
                    cVar.copyOnWrite();
                    C23101d dVar2 = (C23101d) cVar.instance;
                    str3.getClass();
                    dVar2.f63449a |= 2;
                    dVar2.f63453e = str3;
                    String str4 = kVar.f63312g.f63391d.f63478c;
                    cVar.copyOnWrite();
                    C23101d dVar3 = (C23101d) cVar.instance;
                    str4.getClass();
                    dVar3.f63449a |= 4;
                    dVar3.f63454f = str4;
                    C23101d dVar4 = (C23101d) cVar.build();
                    xVar2.mo28520c(new C23008d(gVar3, xVar));
                }
                C23128x xVar3 = kVar.f63306a;
                C23100c cVar2 = (C23100c) C23101d.f63447g.createBuilder();
                cVar2.copyOnWrite();
                C23101d dVar5 = (C23101d) cVar2.instance;
                dVar5.f63452d = 4;
                dVar5.f63449a |= 1;
                String str5 = kVar.f63312g.f63388a;
                cVar2.copyOnWrite();
                C23101d dVar6 = (C23101d) cVar2.instance;
                str5.getClass();
                dVar6.f63449a |= 2;
                dVar6.f63453e = str5;
                String str6 = kVar.f63312g.f63391d.f63478c;
                cVar2.copyOnWrite();
                C23101d dVar7 = (C23101d) cVar2.instance;
                str6.getClass();
                dVar7.f63449a = 4 | dVar7.f63449a;
                dVar7.f63454f = str6;
                C23101d dVar8 = (C23101d) cVar2.build();
                Objects.requireNonNull(a);
                xVar3.mo28520c(new C23011g(a));
                kVar.f63310e = C23014j.CONTROLLER_INITIALIZED;
                return kVar;
            }
            throw new C23085ap(yVar3);
        }
        throw new C23079aj(str2);
    }
}
