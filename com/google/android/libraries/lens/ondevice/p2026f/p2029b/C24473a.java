package com.google.android.libraries.lens.ondevice.p2026f.p2029b;

import android.text.TextUtils;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24442ad;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24462q;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24463r;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24464s;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24470y;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.libraries.lens.ondevice.p2037n.C24796g;
import com.google.android.libraries.lens.ondevice.p2037n.C24797h;
import com.google.android.libraries.lens.ondevice.p2037n.C24799j;
import com.google.android.libraries.lens.ondevice.p2037n.C24800k;
import com.google.android.libraries.lens.ondevice.p2037n.C24801l;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.lens.ondevice.p2037n.C24809t;
import com.google.android.libraries.lens.ondevice.p2037n.C24810u;
import com.google.android.libraries.lens.view.p2159q.C27628bv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63238k;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.lens.ondevice.f.b.a */
/* compiled from: PG */
public final class C24473a {

    /* renamed from: a */
    private static final C58974d f66987a = C58974d.m91135i("DependencyUtils");

    /* renamed from: a */
    public static C24463r m45542a(C24810u uVar) {
        C24462q qVar = (C24462q) C24463r.f66960c.createBuilder();
        C24471z zVar = uVar.f67820b;
        if (zVar == null) {
            zVar = C24471z.f66980d;
        }
        C24465t tVar = zVar.f66983b;
        if (tVar == null) {
            tVar = C24465t.f66964f;
        }
        qVar.copyOnWrite();
        C24463r rVar = (C24463r) qVar.instance;
        tVar.getClass();
        rVar.f66963b = tVar;
        rVar.f66962a |= 1;
        return (C24463r) qVar.build();
    }

    /* renamed from: b */
    public static C24801l m45543b(String str, int i) {
        C24800k kVar = (C24800k) C24801l.f67766c.createBuilder();
        C24796g gVar = (C24796g) C24797h.f67760b.createBuilder();
        gVar.mo30004a(m45545d(str, i));
        kVar.copyOnWrite();
        C24801l lVar = (C24801l) kVar.instance;
        C24797h hVar = (C24797h) gVar.build();
        hVar.getClass();
        lVar.f67769b = hVar;
        lVar.f67768a |= 2;
        return (C24801l) kVar.build();
    }

    /* renamed from: c */
    public static C24801l m45544c(String str, String str2) {
        C24800k kVar = (C24800k) C24801l.f67766c.createBuilder();
        C24796g gVar = (C24796g) C24797h.f67760b.createBuilder();
        C24809t tVar = (C24809t) C24810u.f67817d.createBuilder();
        C24470y yVar = (C24470y) C24471z.f66980d.createBuilder();
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        str.getClass();
        tVar2.f66966a |= 1;
        tVar2.f66967b = str;
        sVar.copyOnWrite();
        C24465t tVar3 = (C24465t) sVar.instance;
        str2.getClass();
        tVar3.f66966a |= 8;
        tVar3.f66970e = str2;
        yVar.copyOnWrite();
        C24471z zVar = (C24471z) yVar.instance;
        C24465t tVar4 = (C24465t) sVar.build();
        tVar4.getClass();
        zVar.f66983b = tVar4;
        zVar.f66982a |= 1;
        tVar.copyOnWrite();
        C24810u uVar = (C24810u) tVar.instance;
        C24471z zVar2 = (C24471z) yVar.build();
        zVar2.getClass();
        uVar.f67820b = zVar2;
        uVar.f67819a |= 1;
        gVar.mo30004a((C24810u) tVar.build());
        C24797h hVar = (C24797h) gVar.build();
        kVar.copyOnWrite();
        C24801l lVar = (C24801l) kVar.instance;
        hVar.getClass();
        lVar.f67769b = hVar;
        lVar.f67768a |= 2;
        return (C24801l) kVar.build();
    }

    /* renamed from: d */
    public static C24810u m45545d(String str, int i) {
        C24809t tVar = (C24809t) C24810u.f67817d.createBuilder();
        C24470y yVar = (C24470y) C24471z.f66980d.createBuilder();
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        str.getClass();
        tVar2.f66966a |= 1;
        tVar2.f66967b = str;
        sVar.copyOnWrite();
        C24465t tVar3 = (C24465t) sVar.instance;
        tVar3.f66966a |= 2;
        tVar3.f66968c = i;
        yVar.copyOnWrite();
        C24471z zVar = (C24471z) yVar.instance;
        C24465t tVar4 = (C24465t) sVar.build();
        tVar4.getClass();
        zVar.f66983b = tVar4;
        zVar.f66982a |= 1;
        tVar.copyOnWrite();
        C24810u uVar = (C24810u) tVar.instance;
        C24471z zVar2 = (C24471z) yVar.build();
        zVar2.getClass();
        uVar.f67820b = zVar2;
        uVar.f67819a |= 1;
        return (C24810u) tVar.build();
    }

    /* renamed from: e */
    public static C63240m m45546e(C24803n nVar) {
        HashMap hashMap = new HashMap();
        C24799j jVar = nVar.f67773b;
        if (jVar == null) {
            jVar = C24799j.f67763b;
        }
        for (C24440ab abVar : jVar.f67765a) {
            C24465t tVar = abVar.f66920b;
            if (tVar == null) {
                tVar = C24465t.f66964f;
            }
            if (!tVar.f66970e.isEmpty()) {
                hashMap.put(C27628bv.m51418a(tVar.f66970e, tVar.f66967b), Long.valueOf(abVar.f66923e));
            }
        }
        C63238k kVar = (C63238k) C63240m.f170859b.createBuilder();
        kVar.mo59198a(hashMap);
        return (C63240m) kVar.build();
    }

    /* renamed from: f */
    public static String m45547f(C24803n nVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            C24799j jVar = nVar.f67773b;
            if (jVar == null) {
                jVar = C24799j.f67763b;
            }
            for (C24440ab abVar : jVar.f67765a) {
                if (m45549h(abVar)) {
                    C24465t tVar = abVar.f66920b;
                    if (tVar == null) {
                        tVar = C24465t.f66964f;
                    }
                    if (str.equals(tVar.f66967b)) {
                        if (abVar.f66921c.size() <= 1) {
                            return ((C24442ad) abVar.f66921c.get(0)).f66929c;
                        }
                        throw new IllegalArgumentException(String.format("%s contains multiple files. Please specify fileId as well.", new Object[]{str}));
                    }
                }
            }
            return null;
        }
        ((C58970a) ((C58970a) f66987a.mo56226d()).mo56372aa(48798)).mo56386p("No model name provided");
        return null;
    }

    /* renamed from: g */
    public static String m45548g(C24803n nVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ((C58970a) ((C58970a) f66987a.mo56226d()).mo56372aa(48800)).mo56386p("No model name provided");
            return null;
        } else if (!TextUtils.isEmpty(str2)) {
            C24799j jVar = nVar.f67773b;
            if (jVar == null) {
                jVar = C24799j.f67763b;
            }
            for (C24440ab abVar : jVar.f67765a) {
                if (m45549h(abVar)) {
                    C24465t tVar = abVar.f66920b;
                    if (tVar == null) {
                        tVar = C24465t.f66964f;
                    }
                    if (str.equals(tVar.f66967b)) {
                        for (C24442ad adVar : abVar.f66921c) {
                            if (str2.equals(adVar.f66928b)) {
                                return adVar.f66929c;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
            return null;
        } else {
            ((C58970a) ((C58970a) f66987a.mo56226d()).mo56372aa(48799)).mo56386p("No fileId provided");
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m45549h(C24440ab abVar) {
        C24465t tVar = abVar.f66920b;
        if (tVar == null) {
            tVar = C24465t.f66964f;
        }
        String str = tVar.f66967b;
        if (!TextUtils.isEmpty(str)) {
            C24446ah a = C24446ah.m45519a(abVar.f66922d);
            if (a == null) {
                a = C24446ah.STATUS_UNKNOWN;
            }
            if (!a.equals(C24446ah.STATUS_DOWNLOADED)) {
                C58970a aVar = (C58970a) ((C58970a) f66987a.mo56224b()).mo56372aa(48802);
                C24446ah a2 = C24446ah.m45519a(abVar.f66922d);
                if (a2 == null) {
                    a2 = C24446ah.STATUS_UNKNOWN;
                }
                aVar.mo56354G("Model %s unavailable, status %s", str, a2);
                return false;
            } else if (abVar.f66921c.size() != 0) {
                return true;
            } else {
                ((C58970a) ((C58970a) f66987a.mo56226d()).mo56372aa(48801)).mo56389s("Model response for %s has no files", str);
                return false;
            }
        } else {
            ((C58970a) ((C58970a) f66987a.mo56226d()).mo56372aa(48803)).mo56386p("Model response missing criteria name");
            return false;
        }
    }

    /* renamed from: i */
    public static C24810u m45550i(String str, String str2) {
        C24809t tVar = (C24809t) C24810u.f67817d.createBuilder();
        C24470y yVar = (C24470y) C24471z.f66980d.createBuilder();
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        str.getClass();
        tVar2.f66966a |= 1;
        tVar2.f66967b = str;
        sVar.copyOnWrite();
        C24465t tVar3 = (C24465t) sVar.instance;
        tVar3.f66966a |= 2;
        tVar3.f66968c = 1;
        sVar.copyOnWrite();
        C24465t tVar4 = (C24465t) sVar.instance;
        str2.getClass();
        tVar4.f66966a |= 4;
        tVar4.f66969d = str2;
        yVar.copyOnWrite();
        C24471z zVar = (C24471z) yVar.instance;
        C24465t tVar5 = (C24465t) sVar.build();
        tVar5.getClass();
        zVar.f66983b = tVar5;
        zVar.f66982a |= 1;
        tVar.copyOnWrite();
        C24810u uVar = (C24810u) tVar.instance;
        C24471z zVar2 = (C24471z) yVar.build();
        zVar2.getClass();
        uVar.f67820b = zVar2;
        uVar.f67819a |= 1;
        tVar.copyOnWrite();
        C24810u uVar2 = (C24810u) tVar.instance;
        uVar2.f67819a |= 2;
        uVar2.f67821c = false;
        return (C24810u) tVar.build();
    }
}
