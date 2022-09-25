package com.google.apps.tiktok.account.p3616e.p3623f;

import com.google.android.libraries.logging.p2181a.C28259b;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2345a.C30161f;
import com.google.android.libraries.onegoogle.account.p2345a.C30163h;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.p3611a.C46123ad;
import com.google.apps.tiktok.account.data.p3611a.C46147y;
import com.google.apps.tiktok.account.data.p3611a.C46148z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.apps.tiktok.account.e.f.c */
/* compiled from: PG */
public final class C46355c implements C30158c {

    /* renamed from: a */
    private final C58833ax f121350a;

    public C46355c(C58833ax axVar) {
        this.f121350a = axVar;
    }

    /* renamed from: l */
    public static final String m82636l(C46108a aVar) {
        return String.valueOf(aVar.mo50209a().mo50068a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C28259b mo35550a(Object obj) {
        C46108a aVar = (C46108a) obj;
        if (aVar == null) {
            return C28259b.m52821a();
        }
        if ("pseudonymous".equals(aVar.mo50210b().f121165j)) {
            return C28259b.m52824d();
        }
        if ("incognito".equals(aVar.mo50210b().f121165j)) {
            return C28259b.m52821a();
        }
        return mo35558i(aVar) ? C28259b.m52823c(m82636l(aVar)) : C28259b.m52824d();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C30163h mo35551b(Object obj) {
        Object obj2;
        C46108a aVar = (C46108a) obj;
        if (!mo35558i(aVar)) {
            return null;
        }
        C46215j b = aVar.mo50210b();
        C62940bt r0 = C62942bv.checkIsLite(C46123ad.f121013a);
        b.mo58887l(r0);
        Object l = b.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj2 = r0.f169969b;
        } else {
            obj2 = r0.mo58889c(l);
        }
        C46148z zVar = (C46148z) obj2;
        boolean z = zVar.f121058b;
        int a = C46147y.m82373a(zVar.f121060d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 != 0) {
            i = i2 != 1 ? 3 : 2;
        }
        C30161f c = C30163h.m56038c();
        c.mo35561b(z);
        c.mo35562c(i);
        return c.mo35560a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ String mo35552c(Object obj) {
        return m82636l((C46108a) obj);
    }

    /* renamed from: d */
    public final /* synthetic */ String mo35553d(Object obj) {
        return ((C46108a) obj).mo50210b().f121161f;
    }

    /* renamed from: e */
    public final /* synthetic */ String mo35554e(Object obj) {
        return ((C46108a) obj).mo50210b().f121162g;
    }

    /* renamed from: f */
    public final /* synthetic */ String mo35555f(Object obj) {
        return ((C46108a) obj).mo50210b().f121158c;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ String mo35556g(Object obj) {
        C46108a aVar = (C46108a) obj;
        if ((aVar.mo50210b().f121156a & 8) != 0) {
            return aVar.mo50210b().f121160e;
        }
        return null;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ String mo35557h(Object obj) {
        C46108a aVar = (C46108a) obj;
        if ((aVar.mo50210b().f121156a & 4) != 0) {
            return aVar.mo50210b().f121159d;
        }
        return null;
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo35559j(Object obj) {
        return true;
    }

    /* renamed from: k */
    public final boolean mo35558i(C46108a aVar) {
        return ((String) ((C58847bk) this.f121350a).f156646a).equals(aVar.mo50210b().f121165j);
    }
}
