package com.google.android.apps.gsa.sidekick.main.optin;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.f */
/* compiled from: PG */
final class C91561f implements C22868d {

    /* renamed from: a */
    final /* synthetic */ OptInActivity f255401a;

    /* renamed from: b */
    final /* synthetic */ OptInActivity f255402b;

    public C91561f(OptInActivity optInActivity, OptInActivity optInActivity2) {
        this.f255402b = optInActivity;
        this.f255401a = optInActivity2;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = OptInActivity.f255358l.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OptInActivity");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(11694)).mo56386p("Failed to get available accounts for OptInActivity.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            OptInActivity optInActivity = this.f255402b;
            optInActivity.f255386r = new C91574s(this.f255401a, optInActivity.f255361B, 0, list);
        } else {
            OptInActivity optInActivity2 = this.f255402b;
            optInActivity2.f255386r = new C91574s(this.f255401a, optInActivity2.f255361B, 1, list);
        }
        this.f255402b.f255386r.show();
    }
}
