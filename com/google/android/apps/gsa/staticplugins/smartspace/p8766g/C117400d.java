package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92117m;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.smartspace.p8761b.C117352a;
import com.google.android.apps.gsa.staticplugins.smartspace.p8761b.C117353b;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.assistant.p3994s.p3995a.C53165du;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.d */
/* compiled from: PG */
public final class C117400d implements C117405i {

    /* renamed from: a */
    private final C91189au f325900a;

    /* renamed from: b */
    private final C86124t f325901b;

    /* renamed from: c */
    private final C21370a f325902c;

    /* renamed from: d */
    private final C117353b f325903d;

    public C117400d(C91189au auVar, C86124t tVar, C21370a aVar, C117353b bVar) {
        this.f325900a = auVar;
        this.f325901b = tVar;
        this.f325902c = aVar;
        this.f325903d = bVar;
    }

    /* renamed from: d */
    private static boolean m195084d(Object obj) {
        if (obj instanceof C83739ak) {
            C83738aj ajVar = ((C83739ak) obj).f228233b;
            if (ajVar == null) {
                ajVar = C83738aj.f228226c;
            }
            if (ajVar.f228228a == 5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C50818do mo103288a(C92117m mVar) {
        C50731p pVar;
        long b = this.f325902c.mo26870b();
        long j = mVar.f256831f;
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        int hashCode = String.valueOf(mVar.f256827b).concat(String.valueOf(mVar.f256828c)).hashCode();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        doVar.f132304a |= 4;
        doVar.f132307d = hashCode;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        doVar2.f132304a |= 1;
        doVar2.f132305b = false;
        C50792cp cpVar = C50792cp.PRIMARY;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        doVar3.f132306c = cpVar.f132174e;
        doVar3.f132304a |= 2;
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String str = mVar.f256827b;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        C50722g gVar = C50722g.END;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar.f131998e;
        hVar2.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        C50723h hVar3 = (C50723h) aVar.build();
        hVar3.getClass();
        czVar.f132239b = hVar3;
        czVar.f132238a |= 1;
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        String str2 = mVar.f256828c;
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        str2.getClass();
        hVar4.f132001a |= 1;
        hVar4.f132002b = str2;
        C50722g gVar2 = C50722g.END;
        aVar2.copyOnWrite();
        C50723h hVar5 = (C50723h) aVar2.instance;
        hVar5.f132003c = gVar2.f131998e;
        hVar5.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar2 = (C50802cz) cyVar.instance;
        C50723h hVar6 = (C50723h) aVar2.build();
        hVar6.getClass();
        czVar2.f132241d = hVar6;
        czVar2.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        C50802cz czVar3 = (C50802cz) cyVar.build();
        czVar3.getClass();
        doVar4.f132312i = czVar3;
        doVar4.f132304a |= 128;
        C50801cy cyVar2 = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
        String str3 = mVar.f256827b;
        aVar3.copyOnWrite();
        C50723h hVar7 = (C50723h) aVar3.instance;
        str3.getClass();
        hVar7.f132001a |= 1;
        hVar7.f132002b = str3;
        C50722g gVar3 = C50722g.END;
        aVar3.copyOnWrite();
        C50723h hVar8 = (C50723h) aVar3.instance;
        hVar8.f132003c = gVar3.f131998e;
        hVar8.f132001a |= 2;
        cyVar2.copyOnWrite();
        C50802cz czVar4 = (C50802cz) cyVar2.instance;
        C50723h hVar9 = (C50723h) aVar3.build();
        hVar9.getClass();
        czVar4.f132239b = hVar9;
        czVar4.f132238a |= 1;
        C50716a aVar4 = (C50716a) C50723h.f131999e.createBuilder();
        String str4 = mVar.f256828c;
        aVar4.copyOnWrite();
        C50723h hVar10 = (C50723h) aVar4.instance;
        str4.getClass();
        hVar10.f132001a |= 1;
        hVar10.f132002b = str4;
        C50722g gVar4 = C50722g.END;
        aVar4.copyOnWrite();
        C50723h hVar11 = (C50723h) aVar4.instance;
        hVar11.f132003c = gVar4.f131998e;
        hVar11.f132001a |= 2;
        cyVar2.copyOnWrite();
        C50802cz czVar5 = (C50802cz) cyVar2.instance;
        C50723h hVar12 = (C50723h) aVar4.build();
        hVar12.getClass();
        czVar5.f132241d = hVar12;
        czVar5.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        C50802cz czVar6 = (C50802cz) cyVar2.build();
        czVar6.getClass();
        doVar5.f132309f = czVar6;
        doVar5.f132304a |= 16;
        C50728m mVar2 = (C50728m) C50729n.f132007g.createBuilder();
        mVar2.copyOnWrite();
        C50729n nVar = (C50729n) mVar2.instance;
        nVar.f132009a |= 1;
        nVar.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        C50729n nVar2 = (C50729n) mVar2.build();
        nVar2.getClass();
        doVar6.f132314k = nVar2;
        doVar6.f132304a |= 512;
        C50794cr crVar = C50794cr.BIRTHDAY;
        cnVar.copyOnWrite();
        C50818do doVar7 = (C50818do) cnVar.instance;
        doVar7.f132315l = crVar.f132222T;
        doVar7.f132304a |= 1024;
        if (this.f325901b.mo79746e(C89985ax.f246715aw)) {
            pVar = C50731p.START_ACTIVITY;
        } else {
            pVar = C50731p.BROADCAST;
        }
        Intent c = C92122r.m151185c(mVar.f256833h, C50794cr.BIRTHDAY, pVar, true);
        C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        rVar.f132024b = pVar.f132020d;
        rVar.f132023a |= 1;
        String uri = c.toUri(1);
        qVar.copyOnWrite();
        C50733r rVar2 = (C50733r) qVar.instance;
        uri.getClass();
        rVar2.f132023a |= 2;
        rVar2.f132025c = uri;
        cnVar.copyOnWrite();
        C50818do doVar8 = (C50818do) cnVar.instance;
        C50733r rVar3 = (C50733r) qVar.build();
        rVar3.getClass();
        doVar8.f132316m = rVar3;
        doVar8.f132304a |= 2048;
        cnVar.copyOnWrite();
        C50818do doVar9 = (C50818do) cnVar.instance;
        doVar9.f132304a |= 4096;
        doVar9.f132317n = b;
        cnVar.copyOnWrite();
        C50818do doVar10 = (C50818do) cnVar.instance;
        doVar10.f132304a |= 8192;
        doVar10.f132318o = b;
        cnVar.copyOnWrite();
        C50818do doVar11 = (C50818do) cnVar.instance;
        doVar11.f132304a |= 16384;
        doVar11.f132319p = j - b;
        C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
        csVar.copyOnWrite();
        C50796ct ctVar = (C50796ct) csVar.instance;
        ctVar.f132225a |= 1;
        ctVar.f132226b = j;
        cnVar.copyOnWrite();
        C50818do doVar12 = (C50818do) cnVar.instance;
        C50796ct ctVar2 = (C50796ct) csVar.build();
        ctVar2.getClass();
        doVar12.f132320q = ctVar2;
        doVar12.f132304a |= 32768;
        cnVar.copyOnWrite();
        C50818do doVar13 = (C50818do) cnVar.instance;
        doVar13.f132304a |= 65536;
        doVar13.f132321r = true;
        cnVar.copyOnWrite();
        C50818do doVar14 = (C50818do) cnVar.instance;
        doVar14.f132304a |= 524288;
        doVar14.f132324u = true;
        return (C50818do) cnVar.build();
    }

    /* renamed from: b */
    public final C50794cr mo103282b() {
        return C50794cr.BIRTHDAY;
    }

    /* renamed from: c */
    public final C60870cx mo103283c(Object obj) {
        C117383a aVar;
        C53165du duVar;
        C117383a aVar2;
        if (m195084d(obj)) {
            C117353b bVar = this.f325903d;
            C83739ak akVar = (C83739ak) obj;
            C83738aj ajVar = akVar.f228233b;
            if (ajVar == null) {
                ajVar = C83738aj.f228226c;
            }
            if (ajVar.f228228a == 5) {
                duVar = (C53165du) ajVar.f228229b;
            } else {
                duVar = C53165du.f139338g;
            }
            if (!duVar.f139344e.isEmpty()) {
                Uri parse = Uri.parse(duVar.f139344e);
                SettableFuture settableFuture = new SettableFuture();
                C91189au auVar = bVar.f325779a;
                auVar.mo85428r(auVar.mo85418e(parse, 7), "SSBirthdayUtils.ImageCallback", new C117352a(bVar, akVar, settableFuture));
                return settableFuture;
            }
            C50818do a = bVar.mo103275a(akVar);
            if (a != null) {
                aVar2 = new C117383a(a);
            } else {
                aVar2 = new C117383a();
            }
            return C60856cj.m92900i(aVar2);
        }
        C92117m mVar = (C92117m) obj;
        if (!mVar.f256829d.isEmpty()) {
            Uri parse2 = Uri.parse(mVar.f256829d);
            SettableFuture settableFuture2 = new SettableFuture();
            C91189au auVar2 = this.f325900a;
            auVar2.mo85428r(auVar2.mo85418e(parse2, 7), "SmartspaceBirthdayIH.ImageCallback", new C117399c(this, mVar, settableFuture2));
            return settableFuture2;
        }
        C50818do a2 = mo103288a(mVar);
        if (a2 != null) {
            aVar = new C117383a(a2);
        } else {
            aVar = new C117383a();
        }
        return C60856cj.m92900i(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (com.google.assistant.p3886c.C50794cr.m85938a(r0 - 1) != com.google.assistant.p3886c.C50794cr.BIRTHDAY) goto L_0x001b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo103285e(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.apps.gsa.smartspace.C92117m
            r1 = 1
            if (r0 == 0) goto L_0x001b
            r0 = r4
            com.google.android.apps.gsa.smartspace.m r0 = (com.google.android.apps.gsa.smartspace.C92117m) r0
            int r0 = r0.f256832g
            int r0 = com.google.android.apps.gsa.smartspace.C92116l.m151154a(r0)
            if (r0 != 0) goto L_0x0011
            r0 = 1
        L_0x0011:
            int r0 = r0 + -1
            com.google.assistant.c.cr r0 = com.google.assistant.p3886c.C50794cr.m85938a(r0)
            com.google.assistant.c.cr r2 = com.google.assistant.p3886c.C50794cr.BIRTHDAY
            if (r0 == r2) goto L_0x0021
        L_0x001b:
            boolean r4 = m195084d(r4)
            if (r4 == 0) goto L_0x0022
        L_0x0021:
            return r1
        L_0x0022:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.p8766g.C117400d.mo103285e(java.lang.Object):boolean");
    }
}
