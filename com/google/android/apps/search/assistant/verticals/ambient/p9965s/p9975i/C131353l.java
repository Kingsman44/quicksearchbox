package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import com.google.android.gms.pay.GetPassesResponse;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Collection;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.l */
/* compiled from: PG */
public final /* synthetic */ class C131353l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131358q f359080a;

    /* renamed from: b */
    public final /* synthetic */ Collection f359081b;

    public /* synthetic */ C131353l(C131358q qVar, Collection collection) {
        this.f359080a = qVar;
        this.f359081b = collection;
    }

    public final Object apply(Object obj) {
        C131358q qVar = this.f359080a;
        Collection collection = this.f359081b;
        GetPassesResponse getPassesResponse = (GetPassesResponse) obj;
        if (getPassesResponse.f393633a == null) {
            ((C58970a) ((C58970a) qVar.f359090a.mo56224b()).mo56372aa(39208)).mo56386p("Got null passes from Google Pay while trying to get card IDs.");
            return C58485gu.m89845m();
        }
        ((C58970a) ((C58970a) qVar.f359090a.mo56224b()).mo56372aa(39207)).mo56387q("Got %d passes from Google Pay.", getPassesResponse.f393633a.length);
        return (C58485gu) DesugarArrays.stream((T[]) getPassesResponse.f393633a).map(new C131348g(collection)).collect(C58370cn.f155946a);
    }
}
