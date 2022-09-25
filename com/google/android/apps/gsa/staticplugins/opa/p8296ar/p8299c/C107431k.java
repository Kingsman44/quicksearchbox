package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.gsa.opa.p6443g.C83679a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83685d;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83687f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.assistant.p3803ag.p3804a.C48838be;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48854bu;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.c.k */
/* compiled from: PG */
public final class C107431k {

    /* renamed from: a */
    public final C83679a f298966a;

    /* renamed from: b */
    public final C86124t f298967b;

    public C107431k(C83679a aVar, C86124t tVar) {
        this.f298966a = aVar;
        this.f298967b = tVar;
    }

    /* renamed from: a */
    public static String m178343a(C48864g gVar, byte[] bArr) {
        return TextUtils.join("_", new String[]{gVar.name(), Base64.encodeToString(bArr, 0)});
    }

    /* renamed from: b */
    public static List m178344b(C48838be beVar) {
        List list = (List) Collection.EL.stream(beVar.f126383b).filter(C107426f.f298961a).map(C107427g.f298962a).flatMap(C107428h.f298963a).collect(Collectors.toList());
        list.addAll((C58485gu) Collection.EL.stream(beVar.f126383b).filter(C107422b.f298957a).map(C107423c.f298958a).collect(C58370cn.f155946a));
        list.addAll((C58485gu) Collection.EL.stream(beVar.f126383b).filter(C107424d.f298959a).map(C107425e.f298960a).collect(C58370cn.f155946a));
        return list;
    }

    /* renamed from: c */
    public static boolean m178345c(C48851br brVar, C48855bv bvVar) {
        C62971cq cqVar = bvVar.f126426a;
        C48855bv bvVar2 = brVar.f126417d;
        if (bvVar2 == null) {
            bvVar2 = C48855bv.f126424b;
        }
        C62971cq cqVar2 = bvVar2.f126426a;
        if (cqVar2.size() < cqVar.size()) {
            return false;
        }
        for (int i = 0; i < cqVar.size(); i++) {
            if (!((C48854bu) cqVar2.get(i)).equals(cqVar.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m178346d(C58833ax axVar) {
        int a;
        if (!axVar.mo56113h() || (a = C83687f.m133251a(((C83683b) axVar.mo56107c()).f228108b)) == 0 || a != 1 || (((C83683b) axVar.mo56107c()).f228107a & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m178347e(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return false;
        }
        int a = C83687f.m133251a(((C83683b) axVar.mo56107c()).f228108b);
        if (a != 0 && a == 3) {
            return true;
        }
        int a2 = C83687f.m133251a(((C83683b) axVar.mo56107c()).f228108b);
        if (a2 != 0 && a2 == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m178348f(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return false;
        }
        int a = C83687f.m133251a(((C83685d) axVar.mo56107c()).f228119e);
        if (a != 0 && a == 3) {
            return true;
        }
        int a2 = C83687f.m133251a(((C83685d) axVar.mo56107c()).f228119e);
        if (a2 != 0 && a2 == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static String m178349g(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "REMOVED" : "DISMISSED" : "INACTIVE" : "ACTIVE";
    }
}
