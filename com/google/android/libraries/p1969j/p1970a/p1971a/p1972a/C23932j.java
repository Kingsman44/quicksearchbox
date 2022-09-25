package com.google.android.libraries.p1969j.p1970a.p1971a.p1972a;

import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30488a;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30494g;
import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.j.a.a.a.j */
/* compiled from: PG */
public final class C23932j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C30492e f65429a;

    /* renamed from: b */
    final /* synthetic */ C23939q f65430b;

    public C23932j(C23939q qVar, C30492e eVar) {
        this.f65430b = qVar;
        this.f65429a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C23939q.f65444a.mo56226d()).mo56382g(th)).mo56372aa(47944)).mo56386p("Error while loading owner");
        this.f65430b.mo29347c(this.f65429a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C30976k kVar = (C30976k) obj;
        if (kVar == null) {
            this.f65430b.mo29347c(this.f65429a);
        } else {
            this.f65430b.mo29347c(((C30488a) C30494g.f82363a).apply(kVar));
        }
    }
}
