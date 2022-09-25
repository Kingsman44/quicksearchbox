package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81316l;
import com.google.android.apps.gsa.nga.shared.p6345h.C81317m;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.bn */
/* compiled from: PG */
public final /* synthetic */ class C81111bn implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f222232a;

    /* renamed from: b */
    public final /* synthetic */ Instant f222233b;

    public /* synthetic */ C81111bn(String str, Instant instant) {
        this.f222232a = str;
        this.f222233b = instant;
    }

    public final Object apply(Object obj) {
        String str = this.f222232a;
        Instant instant = this.f222233b;
        C81237ab abVar = (C81237ab) obj;
        C81317m mVar = C81317m.f222586d;
        str.getClass();
        C62995dn dnVar = abVar.f222386e;
        if (dnVar.containsKey(str)) {
            mVar = (C81317m) dnVar.get(str);
        }
        C81328x xVar = (C81328x) abVar.toBuilder();
        C81316l lVar = (C81316l) mVar.toBuilder();
        int i = mVar.f222589b;
        lVar.copyOnWrite();
        C81317m mVar2 = (C81317m) lVar.instance;
        mVar2.f222588a |= 1;
        mVar2.f222589b = i + 1;
        long epochMilli = instant.toEpochMilli();
        lVar.copyOnWrite();
        C81317m mVar3 = (C81317m) lVar.instance;
        mVar3.f222588a |= 2;
        mVar3.f222590c = epochMilli;
        C81317m mVar4 = (C81317m) lVar.build();
        str.getClass();
        mVar4.getClass();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        C62995dn dnVar2 = abVar2.f222386e;
        if (!dnVar2.f170058b) {
            abVar2.f222386e = dnVar2.mo58980a();
        }
        abVar2.f222386e.put(str, mVar4);
        return (C81237ab) xVar.build();
    }
}
