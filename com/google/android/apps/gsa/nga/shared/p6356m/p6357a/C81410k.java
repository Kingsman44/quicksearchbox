package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.a.bt;
import com.google.android.apps.gsa.nga.api.p5883a.C74672br;
import com.google.android.apps.gsa.nga.api.p5883a.C74673bs;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.k */
/* compiled from: PG */
public final /* synthetic */ class C81410k implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81412m f222795a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222796b;

    public /* synthetic */ C81410k(C81412m mVar, C37672hs hsVar) {
        this.f222795a = mVar;
        this.f222796b = hsVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81412m mVar = this.f222795a;
        C37672hs hsVar = this.f222796b;
        bt btVar = (bt) obj;
        int i = btVar.a;
        int a = C74673bs.m120742a(i);
        int i2 = a - 1;
        if (a != 0) {
            if (i2 != 0) {
                int i3 = 1;
                if (i2 == 1) {
                    if (i == 2) {
                        int c = C74672br.m120741c(((Integer) btVar.b).intValue());
                        if (c != 0) {
                            i3 = c;
                        }
                    } else {
                        i3 = 2;
                    }
                    ((C58970a) ((C58970a) C81412m.f222799a.mo56224b()).mo56372aa(5881)).mo56354G("Push-to-talk invocation for %s got rejected with status %s.", C81062c.m129010a(Optional.m71637of(hsVar)), C74672br.m120739a(i3));
                    mVar.mo75061c(C81412m.m129499d(i3, hsVar));
                    mVar.f222805g.mo75059g(hsVar);
                } else if (i2 == 2) {
                    ((C58970a) ((C58970a) C81412m.f222799a.mo56226d()).mo56372aa(5882)).mo56386p("PushToTalkResult not set.");
                    mVar.mo75061c(C81412m.m129499d(2, hsVar));
                    mVar.f222805g.mo75059g(hsVar);
                }
            } else {
                C81062c.m129010a(Optional.m71637of(hsVar));
            }
            mVar.f222804f.mo74834d(btVar);
            return;
        }
        throw null;
    }
}
