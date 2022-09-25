package com.google.android.libraries.search.p2476a.p2483e;

import com.google.android.apps.gsa.shared.logger.C89834a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.a.e.a */
/* compiled from: PG */
public final /* synthetic */ class C32217a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C32220b f86425a;

    /* renamed from: b */
    public final /* synthetic */ String f86426b;

    public /* synthetic */ C32217a(C32220b bVar, String str) {
        this.f86425a = bVar;
        this.f86426b = str;
    }

    public final Object apply(Object obj) {
        C89834a aVar;
        C32220b bVar = this.f86425a;
        String str = this.f86426b;
        C46108a aVar2 = (C46108a) obj;
        String e = bVar.f86431a.mo50217e(aVar2.mo50210b());
        if (e != null) {
            aVar = C89834a.m146254a(str, e);
        } else {
            aVar = aVar2.mo50210b().f121165j.equals("pseudonymous") ? C89834a.m146254a(str, (String) null) : null;
        }
        if (aVar != null) {
            C89949q.m146527l(aVar);
        }
        return null;
    }
}
