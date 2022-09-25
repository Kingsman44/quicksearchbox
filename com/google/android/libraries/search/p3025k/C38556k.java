package com.google.android.libraries.search.p3025k;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import java.util.List;

/* renamed from: com.google.android.libraries.search.k.k */
/* compiled from: PG */
public final /* synthetic */ class C38556k implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C38556k f101933a = new C38556k();

    private /* synthetic */ C38556k() {
    }

    public final Object apply(Object obj) {
        C58833ax c = C58557jl.m90122c((List) obj, C38557l.f101934a);
        if (c.mo56113h()) {
            return ((C46108a) c.mo56107c()).mo50209a();
        }
        throw new C46167as("Incognito account not found");
    }
}
