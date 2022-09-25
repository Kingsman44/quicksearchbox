package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.a.ck;
import com.google.android.apps.gsa.nga.api.p5883a.C74676cj;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82508hu;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82738qh;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82739qi;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C81393aj implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81400aq f222747a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222748b;

    public /* synthetic */ C81393aj(C81400aq aqVar, C37672hs hsVar) {
        this.f222747a = aqVar;
        this.f222748b = hsVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81400aq aqVar = this.f222747a;
        C37672hs hsVar = this.f222748b;
        ck ckVar = (ck) obj;
        int i = ckVar.a;
        int i2 = 1;
        if (i != 1) {
            int i3 = 2;
            if (i == 2) {
                int intValue = ((Integer) ckVar.b).intValue();
                if (intValue != 0) {
                    i3 = intValue != 1 ? intValue != 2 ? 0 : 4 : 3;
                }
                if (i3 != 0) {
                    i2 = i3;
                }
            } else {
                i2 = 2;
            }
            ((C58970a) ((C58970a) C81400aq.f222762a.mo56224b()).mo56372aa(5909)).mo56354G("Text query invocation(token:%s) got rejected with status %s.", C81062c.m129010a(Optional.m71637of(hsVar)), C74676cj.m120746a(i2));
            aqVar.mo75056b(hsVar, i2);
            return;
        }
        C81062c.m129010a(Optional.m71637of(hsVar));
        C83305i iVar = aqVar.f222767f.f222112a;
        C82738qh c = C82739qi.m132343c();
        ((C82508hu) c).f225461b = "ACCEPTED";
        iVar.mo75579d(c.mo76543a());
    }
}
