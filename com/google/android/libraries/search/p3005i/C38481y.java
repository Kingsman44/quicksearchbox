package com.google.android.libraries.search.p3005i;

import com.google.android.libraries.geller.portable.database.C21965m;
import com.google.android.libraries.search.assistant.p2822w.p2823a.C36781b;
import com.google.android.libraries.search.p3005i.C38411ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.i.y */
/* compiled from: PG */
public final /* synthetic */ class C38481y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38411ab f101825a;

    public /* synthetic */ C38481y(C38411ab abVar) {
        this.f101825a = abVar;
    }

    public final C60870cx apply(Object obj) {
        Map jp = ((C38411ab.C38412a) C47245e.m84045a(this.f101825a.f101670b, C38411ab.C38412a.class, (AccountId) obj)).mo41415jp();
        if (jp.containsKey(C65753ak.PORTABLE_PROVIDER)) {
            return ((C36781b) jp.get(C65753ak.PORTABLE_PROVIDER)).mo40394a();
        }
        return C60856cj.m92900i(new C21965m());
    }
}
