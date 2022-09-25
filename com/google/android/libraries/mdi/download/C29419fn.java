package com.google.android.libraries.mdi.download;

import android.accounts.Account;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.android.libraries.mdi.download.p2236d.C29010e;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28817d;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.fn */
/* compiled from: PG */
public final /* synthetic */ class C29419fn implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79758a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f79759b;

    /* renamed from: c */
    public final /* synthetic */ boolean f79760c;

    /* renamed from: d */
    public final /* synthetic */ C28740br f79761d;

    /* renamed from: e */
    public final /* synthetic */ String f79762e;

    public /* synthetic */ C29419fn(C29647hr hrVar, C29392ep epVar, boolean z, C28740br brVar, String str) {
        this.f79758a = hrVar;
        this.f79759b = epVar;
        this.f79760c = z;
        this.f79761d = brVar;
        this.f79762e = str;
    }

    public final C60870cx apply(Object obj) {
        C29647hr hrVar = this.f79758a;
        C29392ep epVar = this.f79759b;
        boolean z = this.f79760c;
        C28740br brVar = this.f79761d;
        String str = this.f79762e;
        C28817d dVar = (C28817d) obj;
        if (dVar.mo34489b() != null) {
            C29334dr b = dVar.mo34489b();
            b.getClass();
            return C60856cj.m92900i(new C29010e(b));
        } else if (dVar.mo34488a() == null) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.GROUP_NOT_FOUND_ERROR;
            bnVar.f78063b = "Nothing to download for file group: ".concat(String.valueOf(epVar.f79682b));
            C28738bp a = bnVar.mo34334a();
            if (z) {
                ((C28742bt) brVar.mo34348g().mo56107c()).mo33125b(a);
            }
            return C60856cj.m92899h(a);
        } else {
            C29334dr a2 = dVar.mo34488a();
            a2.getClass();
            if (z) {
                ((C29441e) hrVar.f80302h.mo56107c()).mo34739i(brVar.mo34350i(), (C28742bt) brVar.mo34348g().mo56107c());
            }
            C29670b h = C29670b.m54719g(C29647hr.m54608q(a2, brVar.mo34344c().mo56113h() ? C28694b.m53577b((Account) brVar.mo34344c().mo56107c()) : null, C29689e.DOWNLOADED, brVar.mo34351j(), brVar.mo34352k(), hrVar.f80297c, hrVar.f80301g, hrVar.f80298d)).mo34821h(C29461go.f79864a, hrVar.f80301g).mo34821h(new C29465gs(hrVar, z, brVar, str), hrVar.f80301g);
            C60856cj.m92911t(h.f164926b, C47810es.m84974n(new C29640hk(hrVar, z, str)), hrVar.f80301g);
            return h.mo34821h(C29466gt.f79873a, C60826bg.f164896a);
        }
    }
}
