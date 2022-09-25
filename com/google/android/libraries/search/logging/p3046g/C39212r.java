package com.google.android.libraries.search.logging.p3046g;

import android.content.Context;
import com.google.android.libraries.logging.p2182b.C28280k;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2192d.C28349b;
import com.google.android.libraries.logging.p2185ve.p2192d.C28352e;
import com.google.android.libraries.logging.p2185ve.p2193e.p2194a.C28354a;
import com.google.android.libraries.search.logging.p3034a.C38767p;
import com.google.android.libraries.search.logging.p3039b.C38830b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45952b;
import com.google.apps.tiktok.account.p3603a.C45953c;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.logging.g.r */
/* compiled from: PG */
public final class C39212r implements C28354a {

    /* renamed from: a */
    final /* synthetic */ String f103163a;

    /* renamed from: b */
    final /* synthetic */ Context f103164b;

    /* renamed from: c */
    final /* synthetic */ C38830b f103165c;

    /* renamed from: d */
    final /* synthetic */ C38767p f103166d;

    public C39212r(String str, Context context, C38830b bVar, C38767p pVar) {
        this.f103163a = str;
        this.f103164b = context;
        this.f103165c = bVar;
        this.f103166d = pVar;
    }

    /* renamed from: h */
    private final C60870cx m68640h(Optional optional) {
        return this.f103165c.mo41663a(C60555uf.f164065cO, this.f103166d.mo41617a(optional));
    }

    /* renamed from: a */
    public final C58833ax mo33869a(C28280k kVar) {
        if (!(kVar instanceof C28352e) || !((C28352e) kVar).f77078e) {
            return C58833ax.m90834k(C59743a.NATIVE_VISUAL_ELEMENTS_LOG_EVENT);
        }
        return C58833ax.m90834k(C59743a.SEMANTIC_EVENT);
    }

    /* renamed from: b */
    public final /* synthetic */ C58833ax mo33870b(C28280k kVar) {
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final C60870cx mo33871c(C28280k kVar, C60870cx cxVar) {
        Object obj;
        AccountId accountId = null;
        if (kVar instanceof C28349b) {
            C28481u a = ((C28349b) kVar).mo33862a();
            C62940bt r4 = C62942bv.checkIsLite(C45953c.f120745a);
            a.mo58887l(r4);
            Object l = a.f169962ag.mo58854l(r4.f169971d);
            if (l == null) {
                obj = r4.f169969b;
            } else {
                obj = r4.mo58889c(l);
            }
            C45952b bVar = (C45952b) obj;
            if (!bVar.f120744c && (bVar.f120742a & 1) != 0) {
                accountId = AccountId.m82057b(bVar.f120743b);
            }
        }
        if (accountId == null) {
            return m68640h(Optional.empty());
        }
        return m68640h(Optional.m71637of(((C39213s) C47245e.m84045a(this.f103164b, C39213s.class, accountId)).mo41728eP()));
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo33872d(C28280k kVar, C60870cx cxVar) {
        return C60866ct.f164955a;
    }

    /* renamed from: e */
    public final String mo33873e(C28280k kVar) {
        return this.f103163a;
    }

    /* renamed from: f */
    public final /* synthetic */ int mo33874f(C28280k kVar) {
        return 1;
    }

    /* renamed from: g */
    public final /* synthetic */ C60870cx mo33875g() {
        throw null;
    }
}
