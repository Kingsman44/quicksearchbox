package com.google.android.libraries.mdi.download;

import android.accounts.Account;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.gn */
/* compiled from: PG */
public final /* synthetic */ class C29460gn implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79862a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f79863b;

    public /* synthetic */ C29460gn(C29647hr hrVar, C28740br brVar) {
        this.f79862a = hrVar;
        this.f79863b = brVar;
    }

    public final C60870cx apply(Object obj) {
        C29647hr hrVar = this.f79862a;
        C28740br brVar = this.f79863b;
        return C29647hr.m54608q((C29334dr) obj, brVar.mo34344c().mo56113h() ? C28694b.m53577b((Account) brVar.mo34344c().mo56107c()) : null, C29689e.DOWNLOADED, brVar.mo34351j(), brVar.mo34352k(), hrVar.f80297c, hrVar.f80301g, hrVar.f80298d);
    }
}
