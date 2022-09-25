package com.google.android.apps.gsa.staticplugins.p7554bs.p7560f;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87910ic;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87913if;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87916ii;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87920im;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87921in;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87922io;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87924iq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87925ir;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87926is;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87927it;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87928iu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87929iv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87930iw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87931ix;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.p7066m.C90002bh;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.f.b */
/* compiled from: PG */
public final class C96728b implements C86686h {

    /* renamed from: c */
    private static final C59071e f270559c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bs.f.b");

    /* renamed from: a */
    public C87682aj f270560a;

    /* renamed from: d */
    private final C96738l f270561d;

    /* renamed from: e */
    private final PackageManager f270562e;

    public C96728b(C96738l lVar, PackageManager packageManager) {
        this.f270561d = lVar;
        this.f270562e = packageManager;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        Object obj;
        C87913if ifVar;
        C87913if ifVar2;
        C87920im imVar;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (a.ordinal() == 176) {
            C96738l lVar = this.f270561d;
            C96723a aVar = new C96723a(this);
            C62940bt btVar = C87910ic.f237802a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r13 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r13);
            if (bwVar.f169962ag.mo58857o(r13.f169971d)) {
                C62940bt btVar2 = C87910ic.f237802a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r132 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r132);
                Object l = bwVar2.f169962ag.mo58854l(r132.f169971d);
                if (l == null) {
                    obj = r132.f169969b;
                } else {
                    obj = r132.mo58889c(l);
                }
                C87921in inVar = (C87921in) obj;
                int i = inVar.f237825a;
                boolean z = false;
                int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                } else if (i3 == 0) {
                    if (i == 1) {
                        ifVar = (C87913if) inVar.f237826b;
                    } else {
                        ifVar = C87913if.f237803c;
                    }
                    lVar.f270614c = ifVar.f237805a;
                    if (inVar.f237825a == 1) {
                        ifVar2 = (C87913if) inVar.f237826b;
                    } else {
                        ifVar2 = C87913if.f237803c;
                    }
                    int i4 = ifVar2.f237806b;
                    String str = lVar.f270614c;
                    if (str != null && !str.isEmpty()) {
                        ((C19567d) lVar.f270613b.f270635a.f270632g.mo6453a()).mo24822a(1, lVar.f270614c);
                    }
                    C87684al alVar = new C87684al(C88244um.LENS_LITE_SERVICE_EVENT);
                    C62940bt btVar3 = C87929iv.f237842a;
                    C87925ir irVar = (C87925ir) C87928iu.f237839b.createBuilder();
                    C87926is isVar = (C87926is) C87927it.f237833e.createBuilder();
                    int i5 = C90002bh.f246854i.f248757a;
                    isVar.copyOnWrite();
                    C87927it itVar = (C87927it) isVar.instance;
                    itVar.f237835a |= 1;
                    itVar.f237838d = i5;
                    boolean e = lVar.f270612a.mo79746e(C90002bh.f246854i);
                    isVar.copyOnWrite();
                    C87927it itVar2 = (C87927it) isVar.instance;
                    itVar2.f237836b = 2;
                    itVar2.f237837c = Boolean.valueOf(e);
                    irVar.mo81982a(isVar);
                    C87926is isVar2 = (C87926is) C87927it.f237833e.createBuilder();
                    int i6 = C90002bh.f246863r.f248757a;
                    isVar2.copyOnWrite();
                    C87927it itVar3 = (C87927it) isVar2.instance;
                    itVar3.f237835a |= 1;
                    itVar3.f237838d = i6;
                    boolean z2 = lVar.mo90333a(C90002bh.f246864s) && lVar.f270612a.mo79746e(C90002bh.f246863r);
                    isVar2.copyOnWrite();
                    C87927it itVar4 = (C87927it) isVar2.instance;
                    itVar4.f237836b = 2;
                    itVar4.f237837c = Boolean.valueOf(z2);
                    irVar.mo81982a(isVar2);
                    C87926is isVar3 = (C87926is) C87927it.f237833e.createBuilder();
                    int i7 = C90002bh.f246846a.f248757a;
                    isVar3.copyOnWrite();
                    C87927it itVar5 = (C87927it) isVar3.instance;
                    itVar5.f237835a |= 1;
                    itVar5.f237838d = i7;
                    boolean z3 = lVar.mo90333a(C90002bh.f246847b) && lVar.f270612a.mo79746e(C90002bh.f246846a);
                    isVar3.copyOnWrite();
                    C87927it itVar6 = (C87927it) isVar3.instance;
                    itVar6.f237836b = 2;
                    itVar6.f237837c = Boolean.valueOf(z3);
                    irVar.mo81982a(isVar3);
                    C87926is isVar4 = (C87926is) C87927it.f237833e.createBuilder();
                    int i8 = C90002bh.f246850e.f248757a;
                    isVar4.copyOnWrite();
                    C87927it itVar7 = (C87927it) isVar4.instance;
                    itVar7.f237835a |= 1;
                    itVar7.f237838d = i8;
                    boolean z4 = lVar.mo90333a(C90002bh.f246851f) && lVar.f270612a.mo79746e(C90002bh.f246850e);
                    isVar4.copyOnWrite();
                    C87927it itVar8 = (C87927it) isVar4.instance;
                    itVar8.f237836b = 2;
                    itVar8.f237837c = Boolean.valueOf(z4);
                    irVar.mo81982a(isVar4);
                    C87926is isVar5 = (C87926is) C87927it.f237833e.createBuilder();
                    int i9 = C90002bh.f246848c.f248757a;
                    isVar5.copyOnWrite();
                    C87927it itVar9 = (C87927it) isVar5.instance;
                    itVar9.f237835a |= 1;
                    itVar9.f237838d = i9;
                    boolean z5 = lVar.mo90333a(C90002bh.f246849d) && lVar.f270612a.mo79746e(C90002bh.f246848c);
                    isVar5.copyOnWrite();
                    C87927it itVar10 = (C87927it) isVar5.instance;
                    itVar10.f237836b = 2;
                    itVar10.f237837c = Boolean.valueOf(z5);
                    irVar.mo81982a(isVar5);
                    C87926is isVar6 = (C87926is) C87927it.f237833e.createBuilder();
                    int i10 = C90002bh.f246852g.f248757a;
                    isVar6.copyOnWrite();
                    C87927it itVar11 = (C87927it) isVar6.instance;
                    itVar11.f237835a |= 1;
                    itVar11.f237838d = i10;
                    if (lVar.mo90333a(C90002bh.f246853h) && lVar.f270612a.mo79746e(C90002bh.f246852g)) {
                        z = true;
                    }
                    isVar6.copyOnWrite();
                    C87927it itVar12 = (C87927it) isVar6.instance;
                    itVar12.f237836b = 2;
                    itVar12.f237837c = Boolean.valueOf(z);
                    irVar.mo81982a(isVar6);
                    C87926is isVar7 = (C87926is) C87927it.f237833e.createBuilder();
                    int i11 = C90002bh.f246856k.f249778a;
                    isVar7.copyOnWrite();
                    C87927it itVar13 = (C87927it) isVar7.instance;
                    itVar13.f237835a |= 1;
                    itVar13.f237838d = i11;
                    double m = lVar.f270612a.mo79747m(C90002bh.f246856k);
                    isVar7.copyOnWrite();
                    C87927it itVar14 = (C87927it) isVar7.instance;
                    itVar14.f237836b = 5;
                    itVar14.f237837c = Float.valueOf((float) m);
                    irVar.mo81982a(isVar7);
                    C87926is isVar8 = (C87926is) C87927it.f237833e.createBuilder();
                    int i12 = C90002bh.f246860o.f251802a;
                    isVar8.copyOnWrite();
                    C87927it itVar15 = (C87927it) isVar8.instance;
                    itVar15.f237835a |= 1;
                    itVar15.f237838d = i12;
                    String x = lVar.f270612a.mo79758x(C90002bh.f246860o);
                    isVar8.copyOnWrite();
                    C87927it itVar16 = (C87927it) isVar8.instance;
                    x.getClass();
                    itVar16.f237836b = 3;
                    itVar16.f237837c = x;
                    irVar.mo81982a(isVar8);
                    C87926is isVar9 = (C87926is) C87927it.f237833e.createBuilder();
                    int i13 = C90002bh.f246861p.f251802a;
                    isVar9.copyOnWrite();
                    C87927it itVar17 = (C87927it) isVar9.instance;
                    itVar17.f237835a |= 1;
                    itVar17.f237838d = i13;
                    String x2 = lVar.f270612a.mo79758x(C90002bh.f246861p);
                    isVar9.copyOnWrite();
                    C87927it itVar18 = (C87927it) isVar9.instance;
                    x2.getClass();
                    itVar18.f237836b = 3;
                    itVar18.f237837c = x2;
                    irVar.mo81982a(isVar9);
                    C87926is isVar10 = (C87926is) C87927it.f237833e.createBuilder();
                    int i14 = C90002bh.f246859n.f251802a;
                    isVar10.copyOnWrite();
                    C87927it itVar19 = (C87927it) isVar10.instance;
                    itVar19.f237835a |= 1;
                    itVar19.f237838d = i14;
                    String x3 = lVar.f270612a.mo79758x(C90002bh.f246859n);
                    isVar10.copyOnWrite();
                    C87927it itVar20 = (C87927it) isVar10.instance;
                    x3.getClass();
                    itVar20.f237836b = 3;
                    itVar20.f237837c = x3;
                    irVar.mo81982a(isVar10);
                    C87926is isVar11 = (C87926is) C87927it.f237833e.createBuilder();
                    int i15 = C90002bh.f246858m.f249778a;
                    isVar11.copyOnWrite();
                    C87927it itVar21 = (C87927it) isVar11.instance;
                    itVar21.f237835a |= 1;
                    itVar21.f237838d = i15;
                    double m2 = lVar.f270612a.mo79747m(C90002bh.f246858m);
                    isVar11.copyOnWrite();
                    C87927it itVar22 = (C87927it) isVar11.instance;
                    itVar22.f237836b = 5;
                    itVar22.f237837c = Float.valueOf((float) m2);
                    irVar.mo81982a(isVar11);
                    C87926is isVar12 = (C87926is) C87927it.f237833e.createBuilder();
                    int i16 = C90002bh.f246857l.f249778a;
                    isVar12.copyOnWrite();
                    C87927it itVar23 = (C87927it) isVar12.instance;
                    itVar23.f237835a |= 1;
                    itVar23.f237838d = i16;
                    double m3 = lVar.f270612a.mo79747m(C90002bh.f246857l);
                    isVar12.copyOnWrite();
                    C87927it itVar24 = (C87927it) isVar12.instance;
                    itVar24.f237836b = 5;
                    itVar24.f237837c = Float.valueOf((float) m3);
                    irVar.mo81982a(isVar12);
                    C87926is isVar13 = (C87926is) C87927it.f237833e.createBuilder();
                    int i17 = C90002bh.f246855j.f248757a;
                    isVar13.copyOnWrite();
                    C87927it itVar25 = (C87927it) isVar13.instance;
                    itVar25.f237835a |= 1;
                    itVar25.f237838d = i17;
                    boolean e2 = lVar.f270612a.mo79746e(C90002bh.f246855j);
                    isVar13.copyOnWrite();
                    C87927it itVar26 = (C87927it) isVar13.instance;
                    itVar26.f237836b = 2;
                    itVar26.f237837c = Boolean.valueOf(e2);
                    irVar.mo81982a(isVar13);
                    C87928iu iuVar = (C87928iu) irVar.build();
                    C87922io ioVar = (C87922io) C87924iq.f237829c.createBuilder();
                    ioVar.copyOnWrite();
                    C87924iq iqVar = (C87924iq) ioVar.instance;
                    iqVar.f237832b = 1;
                    iqVar.f237831a |= 1;
                    C87924iq iqVar2 = (C87924iq) ioVar.build();
                    C87930iw iwVar = (C87930iw) C87931ix.f237843d.createBuilder();
                    iwVar.copyOnWrite();
                    C87931ix ixVar = (C87931ix) iwVar.instance;
                    iuVar.getClass();
                    ixVar.f237846b = iuVar;
                    ixVar.f237845a |= 1;
                    iwVar.copyOnWrite();
                    C87931ix ixVar2 = (C87931ix) iwVar.instance;
                    iqVar2.getClass();
                    ixVar2.f237847c = iqVar2;
                    ixVar2.f237845a |= 2;
                    alVar.mo81965b(btVar3, (C87931ix) iwVar.build());
                    aVar.mo3353a(alVar.mo81964a());
                } else if (i3 == 1) {
                    if (i == 2) {
                        imVar = (C87920im) inVar.f237826b;
                    } else {
                        imVar = C87920im.f237814g;
                    }
                    String str2 = (imVar.f237816a & 2) != 0 ? imVar.f237821f : lVar.f270614c;
                    if (C58837ba.m90859h(str2)) {
                        return;
                    }
                    if (C96738l.m160326b(str2, "1.0.0") <= 0) {
                        C60321oe oeVar = imVar.f237817b;
                        if (oeVar == null) {
                            oeVar = C60321oe.f163224i;
                        }
                        if (!oeVar.f163228c.isEmpty()) {
                            for (aqs aqs : oeVar.f163228c) {
                                ((C19567d) lVar.f270613b.f270635a.f270627b.mo6453a()).mo24822a(1, Integer.valueOf(aqs.f159783b));
                            }
                        } else if ((oeVar.f163226a & 16) != 0) {
                            aqm aqm = oeVar.f163230e;
                            if (aqm == null) {
                                aqm = aqm.f159760n;
                            }
                            if ((aqm.f159762a & 4) != 0) {
                                C96751y yVar = lVar.f270613b;
                                aqm aqm2 = oeVar.f163230e;
                                if (aqm2 == null) {
                                    aqm2 = aqm.f159760n;
                                }
                                ((C19567d) yVar.f270635a.f270628c.mo6453a()).mo24822a(1, Integer.valueOf(aqm2.f159765d));
                            }
                        }
                    } else {
                        Map unmodifiableMap = Collections.unmodifiableMap(imVar.f237818c);
                        for (String str3 : unmodifiableMap.keySet()) {
                            ((C19567d) lVar.f270613b.f270635a.f270629d.mo6453a()).mo24822a((long) ((Integer) unmodifiableMap.get(str3)).intValue(), str3);
                        }
                        Map unmodifiableMap2 = Collections.unmodifiableMap(imVar.f237819d);
                        for (String str4 : unmodifiableMap2.keySet()) {
                            ((C19567d) lVar.f270613b.f270635a.f270630e.mo6453a()).mo24822a((long) ((Integer) unmodifiableMap2.get(str4)).intValue(), str4);
                        }
                        Map unmodifiableMap3 = Collections.unmodifiableMap(imVar.f237820e);
                        for (String str5 : unmodifiableMap3.keySet()) {
                            C87916ii iiVar = (C87916ii) unmodifiableMap3.get(str5);
                            if (iiVar != null) {
                                for (Double doubleValue : iiVar.f237810a) {
                                    ((C19569f) lVar.f270613b.f270635a.f270631f.mo6453a()).mo24824b(doubleValue.doubleValue(), str5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        String[] packagesForUid;
        int length;
        C86775r rVar = (C86775r) aVar;
        this.f270560a = rVar.f234383e;
        int i = rVar.f234384f.f236954g;
        if (i != -1 && (packagesForUid = this.f270562e.getPackagesForUid(i)) != null && (length = packagesForUid.length) != 0) {
            if (length > 1) {
                C59104x d = f270559c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "LensBackgroundSession");
                ((C59052c) ((C59052c) d).mo56372aa(20859)).mo56395y("There were %d packages instead of the expected 1. Ignoring extra packages... [%s]", length, packagesForUid);
            }
            C96738l lVar = this.f270561d;
            ((C19567d) lVar.f270613b.f270635a.f270633h.mo6453a()).mo24822a(1, packagesForUid[0]);
        }
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
