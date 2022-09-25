package com.google.android.apps.gsa.nga.shared.p6352l.p6353a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.k */
/* compiled from: PG */
public final class C81377k {

    /* renamed from: a */
    private static final C58974d f222720a = C58974d.m91136j();

    /* renamed from: a */
    public static C80267v m129443a(Bundle bundle) {
        if (bundle == null) {
            ((C58970a) ((C58970a) f222720a.mo56225c()).mo56372aa(5854)).mo56386p("Cannot get FlowId from empty bundle");
            return C80267v.FLOW_ID_UNKNOWN;
        }
        int i = bundle.getInt("FLOW_ID", -1);
        C80267v a = C80267v.m128110a(i);
        if (a != null) {
            return a;
        }
        ((C58970a) ((C58970a) f222720a.mo56225c()).mo56372aa(5853)).mo56387q("Got empty flow ID for number %d", i);
        return C80267v.FLOW_ID_UNKNOWN;
    }

    /* renamed from: b */
    public static C80248co m129444b(Bundle bundle) {
        C80248co a;
        if (bundle == null) {
            ((C58970a) ((C58970a) f222720a.mo56225c()).mo56372aa(5856)).mo56386p("Cannot get UsecaseType from empty bundle");
            return C80248co.USECASE_TYPE_UNKNOWN;
        }
        int i = bundle.getInt("USECASE_TYPE", -1);
        if (i != -1 && (a = C80248co.m128104a(i)) != null) {
            return a;
        }
        ((C58970a) ((C58970a) f222720a.mo56225c()).mo56372aa(5855)).mo56387q("Got empty UsecaseType for number %d", i);
        return C80248co.USECASE_TYPE_UNKNOWN;
    }

    /* renamed from: c */
    public static void m129445c(Bundle bundle, C80267v vVar) {
        bundle.putInt("FLOW_ID", vVar.f220269g);
    }

    /* renamed from: d */
    public static void m129446d(Bundle bundle, C80248co coVar) {
        bundle.putInt("USECASE_TYPE", coVar.f220171g);
    }
}
