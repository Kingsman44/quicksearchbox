package com.google.android.apps.gsa.opaonboarding;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83926m;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83927n;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83928o;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83929p;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.opaonboarding.at */
/* compiled from: PG */
public final class C83886at {

    /* renamed from: a */
    private static final C59071e f228527a = C59071e.m91332i("com.google.android.apps.gsa.opaonboarding.at");

    /* renamed from: a */
    public static C83929p m133601a(C86338r rVar, String str) {
        byte[] e = rVar.mo80079e(str, (byte[]) null);
        if (e == null) {
            return C83929p.f228585b;
        }
        try {
            return (C83929p) C62942bv.parseFrom((C62942bv) C83929p.f228585b, e);
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) f228527a.mo56225c()).mo56382g(e2)).mo56372aa(6892)).mo56389s("invalid OmniconsentProgressRecord for key = %s", str);
            return C83929p.f228585b;
        }
    }

    /* renamed from: b */
    public static void m133602b(C86338r rVar, String str, C83929p pVar) {
        C86337q b = rVar.mo80076b();
        b.mo80068c(str, pVar.toByteArray());
        b.apply();
    }

    /* renamed from: c */
    public static void m133603c(C86338r rVar, String str, String str2, int i) {
        C83929p a = m133601a(rVar, str);
        C83927n nVar = (C83927n) C83928o.f228580d.createBuilder();
        nVar.copyOnWrite();
        C83928o oVar = (C83928o) nVar.instance;
        str2.getClass();
        oVar.f228582a |= 1;
        oVar.f228583b = str2;
        nVar.copyOnWrite();
        C83928o oVar2 = (C83928o) nVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            oVar2.f228584c = i2;
            oVar2.f228582a |= 2;
            C83928o oVar3 = (C83928o) nVar.build();
            if (!m133606f(a, oVar3)) {
                C83926m mVar = (C83926m) a.toBuilder();
                mVar.mo77332a(oVar3);
                m133602b(rVar, str, (C83929p) mVar.build());
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: d */
    public static void m133604d(C86338r rVar, String str, String str2, String str3, int i) {
        String concat = str.concat(String.valueOf(str3));
        if (rVar.getBoolean(concat, false)) {
            C86337q b = rVar.mo80076b();
            b.mo80075j(concat);
            b.apply();
            m133603c(rVar, str2, str3, i);
        }
    }

    /* renamed from: e */
    public static boolean m133605e(C86338r rVar, String str, String str2, int i) {
        if (i == 2) {
            return false;
        }
        C83929p a = m133601a(rVar, str);
        C83927n nVar = (C83927n) C83928o.f228580d.createBuilder();
        nVar.copyOnWrite();
        C83928o oVar = (C83928o) nVar.instance;
        str2.getClass();
        oVar.f228582a |= 1;
        oVar.f228583b = str2;
        nVar.copyOnWrite();
        C83928o oVar2 = (C83928o) nVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            oVar2.f228584c = i2;
            oVar2.f228582a |= 2;
            if (m133606f(a, (C83928o) nVar.build())) {
                return true;
            }
            return false;
        }
        throw null;
    }

    /* renamed from: f */
    private static boolean m133606f(C83929p pVar, C83928o oVar) {
        for (C83928o equals : pVar.f228587a) {
            if (equals.equals(oVar)) {
                return true;
            }
        }
        return false;
    }
}
