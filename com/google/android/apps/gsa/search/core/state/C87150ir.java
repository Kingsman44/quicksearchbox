package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85421b;
import com.google.android.apps.gsa.shared.logger.p7053c.C89880c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.search.core.state.ir */
/* compiled from: PG */
final class C87150ir implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C87151is f235476a;

    public C87150ir(C87151is isVar) {
        this.f235476a = isVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C87151is.f235477a.mo56226d()).mo56382g(th)).mo56372aa(9063)).mo56386p("VoiceSearch failed");
        C58887cx.m90979f(th, Error.class);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C85421b bVar = (C85421b) obj;
        C87151is isVar = this.f235476a;
        if (isVar.f235489m.equals(Query.f252741b) || bVar.mo78933c(isVar.f235489m)) {
            C85421b bVar2 = isVar.f235491o;
            if (bVar2 != null) {
                bVar2.mo78931a(C60537to.NO_LONGER_HANDLED, false);
            }
            isVar.f235491o = bVar;
            return;
        }
        bVar.mo78931a(C89880c.m146354a(isVar.f235489m), false);
    }
}
