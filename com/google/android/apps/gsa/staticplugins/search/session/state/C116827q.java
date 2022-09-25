package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.q */
/* compiled from: PG */
public final /* synthetic */ class C116827q implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116836z f324206a;

    public /* synthetic */ C116827q(C116836z zVar) {
        this.f324206a = zVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116836z zVar = this.f324206a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            int intValue = ((Integer) axVar.mo56107c()).intValue();
            if (zVar.mo103013g() == intValue) {
                zVar.f324252l++;
            } else {
                zVar.f324252l = 1;
            }
            zVar.f324253m.push(Integer.valueOf(intValue));
        } else {
            zVar.f324253m.clear();
            zVar.f324252l = 0;
        }
        zVar.f324264x = true;
        zVar.mo103010aw(false);
    }
}
