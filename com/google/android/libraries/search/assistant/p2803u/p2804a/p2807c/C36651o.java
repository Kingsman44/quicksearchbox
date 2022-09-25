package com.google.android.libraries.search.assistant.p2803u.p2804a.p2807c;

import com.google.android.libraries.search.assistant.p2803u.p2819c.C36767a;
import com.google.android.libraries.search.assistant.p2803u.p2819c.C36769c;
import com.google.assistant.p3861at.C50131ls;
import com.google.assistant.p3861at.C50207on;
import com.google.assistant.p3861at.C50208oo;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.ahz;
import com.google.assistant.p3861at.aic;
import com.google.assistant.p3861at.aih;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.p4109av.p4110a.p4111a.C54605d;

/* renamed from: com.google.android.libraries.search.assistant.u.a.c.o */
/* compiled from: PG */
public final /* synthetic */ class C36651o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36769c f95507a;

    public /* synthetic */ C36651o(C36769c cVar) {
        this.f95507a = cVar;
    }

    public final Object apply(Object obj) {
        C36769c cVar = this.f95507a;
        act act = (act) obj;
        if ((act.f128895b & 2048) != 0) {
            C50131ls lsVar = act.f128879F;
            if (lsVar == null) {
                lsVar = C50131ls.f130322b;
            }
            cVar.mo40382b(lsVar.f130324a);
            if ((act.f128895b & 1) != 0) {
                aih aih = act.f128874A;
                if (aih == null) {
                    aih = aih.f129393g;
                }
                aic aic = aih.f129398d;
                if (aic == null) {
                    aic = aic.f129380b;
                }
                int a = C54605d.m87499a(aic.f129382a);
                if (a != 0 && a == 5) {
                    cVar.mo40383c(true);
                    if (aih.f129396b.isEmpty()) {
                        ((C59052c) ((C59052c) C36656t.f95515a.mo56226d()).mo56372aa(51519)).mo56386p("MemberList empty");
                        return false;
                    }
                    ahz ahz = (ahz) aih.f129396b.get(0);
                    String str = ahz.f129359c;
                    if (str != null) {
                        ((C36767a) cVar).f95818b = str;
                        C50208oo ooVar = ahz.f129365i;
                        if (ooVar == null) {
                            ooVar = C50208oo.f130513b;
                        }
                        int a2 = C50207on.m85790a(ooVar.f130515a);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        cVar.mo40381a(a2 - 1);
                        return true;
                    }
                    throw new NullPointerException("Null accountGivenName");
                }
                ((C59052c) ((C59052c) C36656t.f95515a.mo56224b()).mo56372aa(51520)).mo56386p("Account is not child");
                return true;
            }
            ((C59052c) ((C59052c) C36656t.f95515a.mo56226d()).mo56372aa(51521)).mo56386p("No YourPeopleV2Settings returned");
            return false;
        }
        ((C59052c) ((C59052c) C36656t.f95515a.mo56226d()).mo56372aa(51522)).mo56386p("No gaiaUserContextUi returned");
        return false;
    }
}
