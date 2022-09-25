package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.common.base.C58890d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63876h;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.f */
/* compiled from: PG */
public final class C136904f implements C136903e {

    /* renamed from: a */
    private static final C58974d f372608a = C58974d.m91135i("EntryPointPE");

    /* renamed from: b */
    private final C139695b f372609b;

    public C136904f(C139695b bVar) {
        this.f372609b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo113438a(C63955s sVar, C137009dj djVar) {
        Object obj;
        C58970a aVar = (C58970a) ((C58970a) f372608a.mo56224b()).mo56372aa(40881);
        C63954r a = C63954r.m96325a(sVar.f172968a);
        if (a == null) {
            a = C63954r.TYPE_UNSPECIFIED;
        }
        aVar.mo56389s("Evaluating %s Condition Predicate", a.name());
        C62940bt r4 = C62942bv.checkIsLite(C63876h.f172720c);
        sVar.mo58887l(r4);
        Object l = sVar.f169962ag.mo58854l(r4.f169971d);
        if (l == null) {
            obj = r4.f169969b;
        } else {
            obj = r4.mo58889c(l);
        }
        String c = C58890d.m90988c(((C63876h) obj).f172722a);
        if (c.isEmpty()) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid configuration"));
        }
        return C60856cj.m92900i(Boolean.valueOf(C58890d.m90988c((String) this.f372609b.mo115169a().orElse(BuildConfig.FLAVOR)).startsWith(c)));
    }
}
