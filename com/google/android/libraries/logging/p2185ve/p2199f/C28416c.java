package com.google.android.libraries.logging.p2185ve.p2199f;

import com.google.android.libraries.logging.p2182b.C28280k;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2192d.C28349b;
import com.google.android.libraries.logging.p2185ve.p2193e.p2194a.C28354a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Map;

/* renamed from: com.google.android.libraries.logging.ve.f.c */
/* compiled from: PG */
public final class C28416c implements C28354a {

    /* renamed from: a */
    private final C28354a f77180a = C28415b.f77179a;

    /* renamed from: b */
    private final C28354a f77181b;

    /* renamed from: c */
    private final Map f77182c;

    public C28416c(C28354a aVar, Map map) {
        this.f77181b = aVar;
        this.f77182c = map;
    }

    /* renamed from: h */
    private final C28354a m53098h(C28280k kVar) {
        Object obj;
        if (!(kVar instanceof C28349b)) {
            return this.f77180a;
        }
        C28349b bVar = (C28349b) kVar;
        C28481u a = bVar.mo33862a();
        C62940bt r1 = C62942bv.checkIsLite(C28419f.f77188a);
        a.mo58887l(r1);
        if (!a.f169962ag.mo58857o(r1.f169971d)) {
            return this.f77181b;
        }
        C28481u a2 = bVar.mo33862a();
        C62940bt r0 = C62942bv.checkIsLite(C28419f.f77188a);
        a2.mo58887l(r0);
        Object l = a2.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        String str = ((C28418e) obj).f77186b;
        C28354a aVar = (C28354a) this.f77182c.get(str);
        C58838bb.m90866a(aVar, "No config for: ".concat(String.valueOf(str)));
        return aVar;
    }

    /* renamed from: a */
    public final C58833ax mo33869a(C28280k kVar) {
        return m53098h(kVar).mo33869a(kVar);
    }

    /* renamed from: b */
    public final C58833ax mo33870b(C28280k kVar) {
        return m53098h(kVar).mo33870b(kVar);
    }

    /* renamed from: c */
    public final C60870cx mo33871c(C28280k kVar, C60870cx cxVar) {
        return m53098h(kVar).mo33871c(kVar, cxVar);
    }

    /* renamed from: d */
    public final C60870cx mo33872d(C28280k kVar, C60870cx cxVar) {
        return m53098h(kVar).mo33872d(kVar, cxVar);
    }

    /* renamed from: e */
    public final String mo33873e(C28280k kVar) {
        return m53098h(kVar).mo33873e(kVar);
    }

    /* renamed from: f */
    public final int mo33874f(C28280k kVar) {
        return m53098h(kVar).mo33874f(kVar);
    }

    /* renamed from: g */
    public final C60870cx mo33875g() {
        return C60866ct.f164955a;
    }
}
