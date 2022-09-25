package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7186u.C91101a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.by */
/* compiled from: PG */
public final /* synthetic */ class C116614by implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116619cc f323423a;

    public /* synthetic */ C116614by(C116619cc ccVar) {
        this.f323423a = ccVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116619cc ccVar = this.f323423a;
        C58833ax axVar = (C58833ax) obj;
        ccVar.f323436i = false;
        if (axVar.mo56113h()) {
            if (C91101a.m148849a(((C116569ag) ccVar.f323430c.mo27525b()).f323267a)) {
                ccVar.f323433f.mo78426g();
            } else {
                ((C116735gk) ccVar.f323431d.mo27525b()).mo102865B();
            }
            ccVar.f323433f.mo78425f((Intent) axVar.mo56107c());
        } else if (((C116800iv) ccVar.f323432e.mo27525b()).mo102950j()) {
            ccVar.mo80591ar();
        }
    }
}
